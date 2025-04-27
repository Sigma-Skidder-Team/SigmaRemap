// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6003 extends Class6002
{
    public final /* synthetic */ Class6587 field24475;
    
    public Class6003(final Class6587 field24475) {
        this.field24475 = field24475;
    }
    
    @Override
    public Object method17922(final Class7576 class7576) {
        String anObject = this.field24475.method19986((Class7577)class7576).replaceAll("_", "");
        int n = 1;
        final char char1 = anObject.charAt(0);
        if (char1 != '-') {
            if (char1 == '+') {
                anObject = anObject.substring(1);
            }
        }
        else {
            n = -1;
            anObject = anObject.substring(1);
        }
        if (!"0".equals(anObject)) {
            String s;
            int n3;
            if (!anObject.startsWith("0b")) {
                if (!anObject.startsWith("0x")) {
                    if (!anObject.startsWith("0")) {
                        if (anObject.indexOf(58) == -1) {
                            return Class6587.method20018(this.field24475, n, anObject, 10);
                        }
                        final String[] split = anObject.split(":");
                        int n2 = 1;
                        int i = 0;
                        for (int j = 0, length = split.length; j < length; ++j) {
                            i += (int)(Long.parseLong(split[length - j - 1]) * n2);
                            n2 *= 60;
                        }
                        return Class6587.method20018(this.field24475, n, String.valueOf(i), 10);
                    }
                    else {
                        s = anObject.substring(1);
                        n3 = 8;
                    }
                }
                else {
                    s = anObject.substring(2);
                    n3 = 16;
                }
            }
            else {
                s = anObject.substring(2);
                n3 = 2;
            }
            return Class6587.method20018(this.field24475, n, s, n3);
        }
        return 0;
    }
}
