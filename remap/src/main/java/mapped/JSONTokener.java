// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.StringReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.Reader;

public class JSONTokener
{
    private long field37106;
    private boolean field37107;
    private long field37108;
    private long field37109;
    private char field37110;
    private Reader field37111;
    private boolean field37112;
    
    public JSONTokener(final Reader in) {
        this.field37111 = (in.markSupported() ? in : new BufferedReader(in));
        this.field37107 = false;
        this.field37112 = false;
        this.field37110 = '\0';
        this.field37108 = 0L;
        this.field37106 = 1L;
        this.field37109 = 1L;
    }
    
    public JSONTokener(final InputStream in) throws org.json.JSONException {
        this(new InputStreamReader(in));
    }
    
    public JSONTokener(final String s) {
        this(new StringReader(s));
    }
    
    public void back() throws org.json.JSONException {
        if (!this.field37112 && this.field37108 > 0L) {
            --this.field37108;
            --this.field37106;
            this.field37112 = true;
            this.field37107 = false;
            return;
        }
        throw new JSONException("Stepping back two steps is not supported");
    }
    
    public static int method30782(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        return -1;
    }
    
    public boolean method30783() {
        return this.field37107 && !this.field37112;
    }
    
    public boolean method30784() throws org.json.JSONException {
        this.method30785();
        if (!this.method30783()) {
            this.back();
            return true;
        }
        return false;
    }
    
    public char method30785() throws org.json.JSONException {
        int n;
        if (this.field37112) {
            this.field37112 = false;
            n = this.field37110;
        }
        else {
            try {
                n = this.field37111.read();
            }
            catch (final IOException ex) {
                throw new JSONException(ex);
            }
            if (n <= 0) {
                this.field37107 = true;
                n = 0;
            }
        }
        ++this.field37108;
        if (this.field37110 == '\r') {
            ++this.field37109;
            this.field37106 = ((n != 10) ? 1 : 0);
        }
        else if (n == 10) {
            ++this.field37109;
            this.field37106 = 0L;
        }
        else {
            ++this.field37106;
        }
        return this.field37110 = (char)n;
    }
    
    public char method30786(final char c) throws org.json.JSONException {
        final char method30785 = this.method30785();
        if (method30785 == c) {
            return method30785;
        }
        throw this.syntaxError("Expected '" + c + "' and instead saw '" + method30785 + "'");
    }
    
    public String method30787(final int n) throws org.json.JSONException {
        if (n != 0) {
            final char[] value = new char[n];
            for (int i = 0; i < n; ++i) {
                value[i] = this.method30785();
                if (this.method30783()) {
                    throw this.syntaxError("Substring bounds error");
                }
            }
            return new String(value);
        }
        return "";
    }
    
    public char nextClean() throws org.json.JSONException {
        char method30785;
        do {
            method30785 = this.method30785();
        } while (method30785 != '\0' && method30785 <= ' ');
        return method30785;
    }
    
    public String method30789(final char c) throws org.json.JSONException {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final char method30785 = this.method30785();
            switch (method30785) {
                case 0:
                case 10:
                case 13: {
                    throw this.syntaxError("Unterminated string");
                }
                case 92: {
                    final char method30786 = this.method30785();
                    switch (method30786) {
                        case 98: {
                            sb.append('\b');
                            continue;
                        }
                        case 116: {
                            sb.append('\t');
                            continue;
                        }
                        case 110: {
                            sb.append('\n');
                            continue;
                        }
                        case 102: {
                            sb.append('\f');
                            continue;
                        }
                        case 114: {
                            sb.append('\r');
                            continue;
                        }
                        case 117: {
                            sb.append((char)Integer.parseInt(this.method30787(4), 16));
                            continue;
                        }
                        case 34:
                        case 39:
                        case 47:
                        case 92: {
                            sb.append(method30786);
                            continue;
                        }
                        default: {
                            throw this.syntaxError("Illegal escape.");
                        }
                    }
                    break;
                }
                default: {
                    if (method30785 == c) {
                        return sb.toString();
                    }
                    sb.append(method30785);
                    continue;
                }
            }
        }
    }
    
    public String method30790(final char c) throws org.json.JSONException {
        final StringBuilder sb = new StringBuilder();
        char method30785;
        while (true) {
            method30785 = this.method30785();
            if (method30785 == c) {
                break;
            }
            if (method30785 == '\0') {
                break;
            }
            if (method30785 == '\n') {
                break;
            }
            if (method30785 == '\r') {
                break;
            }
            sb.append(method30785);
        }
        while (true) {
            if (method30785 != '\0') {
                this.back();
            }
            return sb.toString().trim();
            continue;
        }
    }
    
    public String method30791(final String s) throws org.json.JSONException {
        final StringBuilder sb = new StringBuilder();
        char method30785;
        while (true) {
            method30785 = this.method30785();
            if (s.indexOf(method30785) >= 0) {
                break;
            }
            if (method30785 == '\0') {
                break;
            }
            if (method30785 == '\n') {
                break;
            }
            if (method30785 == '\r') {
                break;
            }
            sb.append(method30785);
        }
        while (true) {
            if (method30785 != '\0') {
                this.back();
            }
            return sb.toString().trim();
            continue;
        }
    }
    
    public Object nextValue() throws org.json.JSONException {
        char c = this.nextClean();
        switch (c) {
            case 34:
            case 39: {
                return this.method30789(c);
            }
            case 123: {
                this.back();
                return new JSONObject(this);
            }
            case 91: {
                this.back();
                return new Class88(this);
            }
            default: {
                final StringBuilder sb = new StringBuilder();
                while (c >= ' ' && ",:]}/\\\"[{;=#".indexOf(c) < 0) {
                    sb.append(c);
                    c = this.method30785();
                }
                this.back();
                final String trim = sb.toString().trim();
                if ("".equals(trim)) {
                    throw this.syntaxError("Missing value");
                }
                return JSONObject.method13308(trim);
            }
        }
    }
    
    public char method30793(final char c) throws org.json.JSONException {
        char method30785;
        try {
            final long field37108 = this.field37108;
            final long field37109 = this.field37106;
            final long field37110 = this.field37109;
            this.field37111.mark(1000000);
            do {
                method30785 = this.method30785();
                if (method30785 == '\0') {
                    this.field37111.reset();
                    this.field37108 = field37108;
                    this.field37106 = field37109;
                    this.field37109 = field37110;
                    return method30785;
                }
            } while (method30785 != c);
        }
        catch (final IOException ex) {
            throw new JSONException(ex);
        }
        this.back();
        return method30785;
    }
    
    public JSONException syntaxError(final String str) {
        return new JSONException(str + this.toString());
    }
    
    @Override
    public String toString() {
        return " at " + this.field37108 + " [character " + this.field37106 + " line " + this.field37109 + "]";
    }
}
