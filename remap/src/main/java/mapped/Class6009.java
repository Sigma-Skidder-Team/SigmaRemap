// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6009 extends Class6002
{
    public final /* synthetic */ Class6587 field24483;
    
    public Class6009(final Class6587 field24483) {
        this.field24483 = field24483;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        String s = this.field24483.method19986((Class7577)class7576).replaceAll("_", "");
        int n = 1;
        final char char1 = s.charAt(0);
        if (char1 != '-') {
            if (char1 == '+') {
                s = s.substring(1);
            }
        }
        else {
            n = -1;
            s = s.substring(1);
        }
        final String lowerCase = s.toLowerCase();
        if (".inf".equals(lowerCase)) {
            return (n != -1) ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
        }
        if (".nan".equals(lowerCase)) {
            return Double.NaN;
        }
        if (s.indexOf(58) == -1) {
            return Double.valueOf(s) * n;
        }
        final String[] split = s.split(":");
        int n2 = 1;
        double n3 = 0.0;
        for (int i = 0, length = split.length; i < length; ++i) {
            n3 += Double.parseDouble(split[length - i - 1]) * n2;
            n2 *= 60;
        }
        return n * n3;
    }
}
