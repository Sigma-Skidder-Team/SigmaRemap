// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public final class Class2314 implements Serializable
{
    private String field14036;
    private int field14037;
    private int field14038;
    private int field14039;
    private int[] field14040;
    private int field14041;
    
    private static int[] method9426(final char[] array) {
        final int[] array2 = new int[Character.codePointCount(array, 0, array.length)];
        int codePoint;
        for (int i = 0, n = 0; i < array.length; i += Character.charCount(codePoint), ++n) {
            codePoint = Character.codePointAt(array, i);
            array2[n] = codePoint;
        }
        return array2;
    }
    
    public Class2314(final String s, final int n, final int n2, final int n3, final char[] array, final int n4) {
        this(s, n, n2, n3, method9426(array), n4);
    }
    
    public Class2314(final String field14036, final int field14037, final int field14038, final int field14039, final int[] field14040, final int field14041) {
        this.field14036 = field14036;
        this.field14037 = field14037;
        this.field14038 = field14038;
        this.field14039 = field14039;
        this.field14040 = field14040;
        this.field14041 = field14041;
    }
    
    private boolean method9427(final int n) {
        return Class6942.field27188.method21321(n);
    }
    
    public String method9428(final int n, final int n2) {
        if (this.field14040 != null) {
            final float n3 = (float)(n2 / 2 - 1);
            int i = this.field14041;
            String str = "";
            while (i > 0) {
                if (this.method9427(this.field14040[i - 1])) {
                    break;
                }
                --i;
                if (this.field14041 - i <= n3) {
                    continue;
                }
                str = " ... ";
                i += 5;
                break;
            }
            String str2 = "";
            int j = this.field14041;
            while (j < this.field14040.length) {
                if (this.method9427(this.field14040[j])) {
                    break;
                }
                if (++j - this.field14041 <= n3) {
                    continue;
                }
                str2 = " ... ";
                j -= 5;
                break;
            }
            final StringBuilder sb = new StringBuilder();
            for (int k = 0; k < n; ++k) {
                sb.append(" ");
            }
            sb.append(str);
            for (int l = i; l < j; ++l) {
                sb.appendCodePoint(this.field14040[l]);
            }
            sb.append(str2);
            sb.append("\n");
            for (int n4 = 0; n4 < n + this.field14041 - i + str.length(); ++n4) {
                sb.append(" ");
            }
            sb.append("^");
            return sb.toString();
        }
        return null;
    }
    
    public String method9429() {
        return this.method9428(4, 75);
    }
    
    @Override
    public String toString() {
        final String method9429 = this.method9429();
        final StringBuilder sb = new StringBuilder(" in ");
        sb.append(this.field14036);
        sb.append(", line ");
        sb.append(this.field14038 + 1);
        sb.append(", column ");
        sb.append(this.field14039 + 1);
        sb.append(":\n");
        sb.append(method9429);
        return sb.toString();
    }
    
    public String method9430() {
        return this.field14036;
    }
    
    public int method9431() {
        return this.field14038;
    }
    
    public int method9432() {
        return this.field14039;
    }
    
    public int method9433() {
        return this.field14037;
    }
    
    public int[] method9434() {
        return this.field14040;
    }
    
    public int method9435() {
        return this.field14041;
    }
}
