// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public final class Class6942
{
    private static final String field27178 = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
    private static final String field27179 = "\n\u0085\u2028\u2029";
    private static final String field27180 = "\r\n\u0085\u2028\u2029";
    private static final String field27181 = "\u0000\r\n\u0085\u2028\u2029";
    private static final String field27182 = " \u0000\r\n\u0085\u2028\u2029";
    private static final String field27183 = "\t \u0000\r\n\u0085\u2028\u2029";
    private static final String field27184 = "\u0000 \t";
    private static final String field27185 = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%";
    public static final Class6942 field27186;
    public static final Class6942 field27187;
    public static final Class6942 field27188;
    public static final Class6942 field27189;
    public static final Class6942 field27190;
    public static final Class6942 field27191;
    public static final Class6942 field27192;
    public static final Class6942 field27193;
    private String field27194;
    public boolean[] field27195;
    public boolean field27196;
    
    private Class6942(final String s) {
        this.field27195 = new boolean[128];
        this.field27196 = false;
        Arrays.fill(this.field27195, false);
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            final int codePoint = s.codePointAt(i);
            if (codePoint >= 128) {
                sb.appendCodePoint(codePoint);
            }
            else {
                this.field27195[codePoint] = true;
            }
        }
        if (sb.length() > 0) {
            this.field27196 = true;
            this.field27194 = sb.toString();
        }
    }
    
    public boolean method21321(final int ch) {
        return (ch >= 128) ? (this.field27196 && this.field27194.indexOf(ch, 0) != -1) : this.field27195[ch];
    }
    
    public boolean method21322(final int n) {
        return !this.method21321(n);
    }
    
    public boolean method21323(final int ch, final String s) {
        return this.method21321(ch) || s.indexOf(ch, 0) != -1;
    }
    
    public boolean method21324(final int n, final String s) {
        return !this.method21323(n, s);
    }
    
    static {
        field27186 = new Class6942("\n\u0085\u2028\u2029");
        field27187 = new Class6942("\r\n\u0085\u2028\u2029");
        field27188 = new Class6942("\u0000\r\n\u0085\u2028\u2029");
        field27189 = new Class6942(" \u0000\r\n\u0085\u2028\u2029");
        field27190 = new Class6942("\t \u0000\r\n\u0085\u2028\u2029");
        field27191 = new Class6942("\u0000 \t");
        field27192 = new Class6942("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_-;/?:@&=+$,_.!~*'()[]%");
        field27193 = new Class6942("abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-_");
    }
}
