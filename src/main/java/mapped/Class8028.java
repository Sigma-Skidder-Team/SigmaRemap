// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.Arrays;
import java.io.StringReader;
import java.io.Reader;

public class Class8028
{
    private String field33046;
    private final Reader field33047;
    private int[] field33048;
    private int field33049;
    private int field33050;
    private boolean field33051;
    private int field33052;
    private int field33053;
    private int field33054;
    private char[] field33055;
    private static final int field33056 = 1025;
    
    public Class8028(final String s) {
        this(new StringReader(s));
        this.field33046 = "'string'";
    }
    
    public Class8028(final Reader field33047) {
        this.field33050 = 0;
        this.field33052 = 0;
        this.field33053 = 0;
        this.field33054 = 0;
        this.field33046 = "'reader'";
        this.field33048 = new int[0];
        this.field33049 = 0;
        this.field33047 = field33047;
        this.field33051 = false;
        this.field33055 = new char[1025];
    }
    
    public static boolean method26319(final String s) {
        int codePoint;
        for (int length = s.length(), i = 0; i < length; i += Character.charCount(codePoint)) {
            codePoint = s.codePointAt(i);
            if (!method26320(codePoint)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean method26320(final int n) {
        if (n < 32 || n > 126) {
            if (n != 9) {
                if (n != 10) {
                    if (n != 13) {
                        if (n != 133) {
                            if (n < 160 || n > 55295) {
                                if (n < 57344 || n > 65533) {
                                    if (n < 65536 || n > 1114111) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public Class2314 method26321() {
        return new Class2314(this.field33046, this.field33052, this.field33053, this.field33054, this.field33048, this.field33050);
    }
    
    public void method26322() {
        this.method26323(1);
    }
    
    public void method26323(final int n) {
        for (int n2 = 0; n2 < n && this.method26328(); ++n2) {
            final int n3 = this.field33048[this.field33050++];
            ++this.field33052;
            Label_0061: {
                if (!Class6942.field27186.method21321(n3)) {
                    if (n3 == 13) {
                        if (this.method26328()) {
                            if (this.field33048[this.field33050] != 10) {
                                break Label_0061;
                            }
                        }
                    }
                    if (n3 == 65279) {
                        continue;
                    }
                    ++this.field33054;
                    continue;
                }
            }
            ++this.field33053;
            this.field33054 = 0;
        }
    }
    
    public int method26324() {
        return this.method26328() ? this.field33048[this.field33050] : 0;
    }
    
    public int method26325(final int n) {
        return this.method26329(n) ? this.field33048[this.field33050 + n] : 0;
    }
    
    public String method26326(final int n) {
        if (n == 0) {
            return "";
        }
        if (!this.method26329(n)) {
            return new String(this.field33048, this.field33050, Math.min(n, this.field33049 - this.field33050));
        }
        return new String(this.field33048, this.field33050, n);
    }
    
    public String method26327(final int n) {
        final String method26326 = this.method26326(n);
        this.field33050 += n;
        this.field33052 += n;
        this.field33054 += n;
        return method26326;
    }
    
    private boolean method26328() {
        return this.method26329(0);
    }
    
    private boolean method26329(final int n) {
        if (!this.field33051) {
            if (this.field33050 + n >= this.field33049) {
                this.method26330();
            }
        }
        return this.field33050 + n < this.field33049;
    }
    
    private void method26330() {
        try {
            int read = this.field33047.read(this.field33055, 0, 1024);
            if (read > 0) {
                int field33049 = this.field33049 - this.field33050;
                this.field33048 = Arrays.copyOfRange(this.field33048, this.field33050, this.field33049 + read);
                if (Character.isHighSurrogate(this.field33055[read - 1])) {
                    if (this.field33047.read(this.field33055, read, 1) == -1) {
                        this.field33051 = true;
                    }
                    else {
                        ++read;
                    }
                }
                int n = 32;
                int i = 0;
                while (i < read) {
                    final int codePoint = Character.codePointAt(this.field33055, i);
                    this.field33048[field33049] = codePoint;
                    if (method26320(codePoint)) {
                        i += Character.charCount(codePoint);
                    }
                    else {
                        n = codePoint;
                        i = read;
                    }
                    ++field33049;
                }
                this.field33049 = field33049;
                this.field33050 = 0;
                if (n != 32) {
                    throw new Class2387(this.field33046, field33049 - 1, n, "special characters are not allowed");
                }
            }
            else {
                this.field33051 = true;
            }
        }
        catch (final IOException ex) {
            throw new Class2386(ex);
        }
    }
    
    public int method26331() {
        return this.field33054;
    }
    
    public int method26332() {
        return this.field33052;
    }
    
    public int method26333() {
        return this.field33053;
    }
}
