// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;

public class Class8297
{
    private Class527 field34103;
    private Class7300 field34104;
    private int field34105;
    private int field34106;
    private long field34107;
    
    public Class8297(final Class527 field34103, final Class7300 field34104) {
        this.field34105 = 0;
        this.field34106 = 0;
        this.field34107 = 0L;
        this.field34103 = field34103;
        this.field34104 = field34104;
    }
    
    public void method27577(final int field34105, final int field34106, final List<Class573> list) {
        if (Math.abs(field34105 - this.field34105) <= 5 && Math.abs(field34106 - this.field34106) <= 5) {
            if (System.currentTimeMillis() >= this.field34107 + 700) {
                final Class573 method3898 = Class698.method3898(field34105, field34106, list);
                if (method3898 != null) {
                    final Rectangle method3899 = this.field34104.method22384(this.field34103, field34105, field34106);
                    String[] method3900 = this.field34104.method22386(method3898, method3899.width);
                    if (method3900 != null) {
                        if (method3900.length > 8) {
                            method3900 = Arrays.copyOf(method3900, 8);
                            method3900[method3900.length - 1] += " ...";
                        }
                        if (this.field34104.method22385()) {
                            this.method27578(method3899.x, method3899.y, method3899.x + method3899.width, method3899.y + method3899.height, -528449408);
                        }
                        Class565.method3293(method3899.x, method3899.y, method3899.x + method3899.width, method3899.y + method3899.height, -536870912);
                        for (int i = 0; i < method3900.length; ++i) {
                            final String s = method3900[i];
                            int n = 14540253;
                            if (s.endsWith("!")) {
                                n = 16719904;
                            }
                            Class869.method5277().field4643.method6609(s, (float)(method3899.x + 5), (float)(method3899.y + 5 + i * 11), n);
                        }
                    }
                }
            }
        }
        else {
            this.field34105 = field34105;
            this.field34106 = field34106;
            this.field34107 = System.currentTimeMillis();
        }
    }
    
    private void method27578(final int n, final int n2, final int n3, final int n4, final int n5) {
        Class565.method3293(n, n2 - 1, n3, n2, n5);
        Class565.method3293(n, n4, n3, n4 + 1, n5);
        Class565.method3293(n - 1, n2, n, n4, n5);
        Class565.method3293(n3, n2, n3 + 1, n4, n5);
    }
}
