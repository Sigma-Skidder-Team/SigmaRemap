// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.json.JSONException;
import java.util.HashMap;

public class Class8827 extends JSONTokener
{
    public static final HashMap<String, Character> field37113;
    
    public Class8827(final String s) {
        super(s);
    }
    
    public String method30795() throws JSONException {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final char method30785 = this.method30785();
            if (this.method30783()) {
                throw this.syntaxError("Unclosed CDATA");
            }
            sb.append(method30785);
            final int length = sb.length() - 3;
            if (length < 0) {
                continue;
            }
            if (sb.charAt() != ']') {
                continue;
            }
            if (sb.charAt() != ']') {
                continue;
            }
            if (sb.charAt() != '>') {
                continue;
            }
            sb.setLength();
            return sb.toString();
        }
    }
    
    public Object method30796() throws JSONException {
        char c;
        do {
            c = this.method30785();
        } while (Character.isWhitespace(c));
        if (c == '\0') {
            return null;
        }
        if (c != '<') {
            final StringBuilder sb = new StringBuilder();
            while (c != '<' && c != '\0') {
                if (c != '&') {
                    sb.append(c);
                }
                else {
                    sb.append(this.method30797(c));
                }
                c = this.method30785();
            }
            this.back();
            return sb.toString().trim();
        }
        return Class8782.field36927;
    }
    
    public Object method30797(final char c) throws JSONException {
        final StringBuilder obj = new StringBuilder();
        char method30785;
        while (true) {
            method30785 = this.method30785();
            if (!Character.isLetterOrDigit(method30785) && method30785 != '#') {
                break;
            }
            obj.append(Character.toLowerCase(method30785));
        }
        if (method30785 != ';') {
            throw this.syntaxError("Missing ';' in XML entity: &" + (Object)obj);
        }
        final String string = obj.toString();
        final Character value = Class8827.field37113.get(string);
        return (value == null) ? (c + string + ";") : value;
    }
    
    public Object method30798() throws JSONException {
        char method30785;
        do {
            method30785 = this.method30785();
        } while (Character.isWhitespace(method30785));
        switch (method30785) {
            case '\0': {
                throw this.syntaxError("Misshaped meta tag");
            }
            case '<': {
                return Class8782.field36927;
            }
            case '>': {
                return Class8782.field36926;
            }
            case '/': {
                return Class8782.field36930;
            }
            case '=': {
                return Class8782.field36925;
            }
            case '!': {
                return Class8782.field36924;
            }
            case '?': {
                return Class8782.field36928;
            }
            case '\"':
            case '\'': {
                char method30786;
                do {
                    method30786 = this.method30785();
                    if (method30786 == '\0') {
                        throw this.syntaxError("Unterminated string");
                    }
                } while (method30786 != method30785);
                return Boolean.TRUE;
            }
            default: {
                while (true) {
                    final char method30787 = this.method30785();
                    if (Character.isWhitespace(method30787)) {
                        return Boolean.TRUE;
                    }
                    switch (method30787) {
                        case '\0':
                        case '!':
                        case '\"':
                        case '\'':
                        case '/':
                        case '<':
                        case '=':
                        case '>':
                        case '?': {
                            this.back();
                            return Boolean.TRUE;
                        }
                        default: {
                            continue;
                        }
                    }
                }
                break;
            }
        }
    }
    
    public Object method30799() throws JSONException {
        char ch;
        do {
            ch = this.method30785();
        } while (Character.isWhitespace(ch));
        switch (ch) {
            case '\0': {
                throw this.syntaxError("Misshaped element");
            }
            case '<': {
                throw this.syntaxError("Misplaced '<'");
            }
            case '>': {
                return Class8782.field36926;
            }
            case '/': {
                return Class8782.field36930;
            }
            case '=': {
                return Class8782.field36925;
            }
            case '!': {
                return Class8782.field36924;
            }
            case '?': {
                return Class8782.field36928;
            }
            case '\"':
            case '\'': {
                final char c = ch;
                final StringBuilder sb = new StringBuilder();
                while (true) {
                    final char method30785 = this.method30785();
                    if (method30785 == '\0') {
                        throw this.syntaxError("Unterminated string");
                    }
                    if (method30785 == c) {
                        return sb.toString();
                    }
                    if (method30785 == '&') {
                        sb.append(this.method30797(method30785));
                    }
                    else {
                        sb.append(method30785);
                    }
                }
                break;
            }
            default: {
                final StringBuilder sb2 = new StringBuilder();
                while (true) {
                    sb2.append(ch);
                    ch = this.method30785();
                    if (Character.isWhitespace(ch)) {
                        return sb2.toString();
                    }
                    switch (ch) {
                        case '\0': {
                            return sb2.toString();
                        }
                        case '!':
                        case '/':
                        case '=':
                        case '>':
                        case '?':
                        case '[':
                        case ']': {
                            this.back();
                            return sb2.toString();
                        }
                        case '\"':
                        case '\'':
                        case '<': {
                            throw this.syntaxError("Bad character in a name");
                        }
                        default: {
                            continue;
                        }
                    }
                }
                break;
            }
        }
    }
    
    public boolean method30800(final String s) throws JSONException {
        int n = 0;
        final int length = s.length();
        final char[] array = new char[length];
        for (int i = 0; i < length; ++i) {
            final char method30785 = this.method30785();
            if (method30785 == '\0') {
                return false;
            }
            array[i] = method30785;
        }
        while (true) {
            int n2 = n;
            int n3 = 1;
            for (int j = 0; j < length; ++j) {
                if (array[n2] != s.charAt(j)) {
                    n3 = 0;
                    break;
                }
                if (++n2 >= length) {
                    n2 -= length;
                }
            }
            if (n3 != 0) {
                return true;
            }
            final char method30786 = this.method30785();
            if (method30786 == '\0') {
                return false;
            }
            array[n] = method30786;
            if (++n < length) {
                continue;
            }
            n -= length;
        }
    }
    
    static {
        (field37113 = new HashMap<String, Character>(8)).put("amp", Class8782.field36922);
        Class8827.field37113.put("apos", Class8782.field36923);
        Class8827.field37113.put("gt", Class8782.field36926);
        Class8827.field37113.put("lt", Class8782.field36927);
        Class8827.field37113.put("quot", Class8782.field36929);
    }
}
