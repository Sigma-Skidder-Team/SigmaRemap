// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class4527 extends Class4469
{
    private static String[] field19947;
    private int field19948;
    
    public Class4527(final Class179 class179, final Class6997 class180, final int n) {
        super(Class9520.field40993, class179, class180);
        this.field19948 = (n & 0x1);
    }
    
    public Class4527(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40993, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        if (this.field19948 != 0) {
            if (this.field19948 == 1) {
                this.method13444(class1851, class1853, 9, 3, 18, 13, 3, 20, Class4527.field19830, Class4527.field19830, false);
                this.method13444(class1851, class1853, 9, 0, 18, 9, 2, 18, Class4527.field19830, Class4527.field19830, false);
                this.method13444(class1851, class1853, 13, 0, 18, 13, 2, 18, Class4527.field19830, Class4527.field19830, false);
                int n = 9;
                for (int i = 0; i < 2; ++i) {
                    this.method13440(class1851, Class4527.field19830, n, 6, 20, class1853);
                    this.method13440(class1851, Class4527.field19833, n, 5, 20, class1853);
                    this.method13440(class1851, Class4527.field19830, n, 4, 20, class1853);
                    n = 13;
                }
                this.method13444(class1851, class1853, 7, 3, 7, 15, 3, 14, Class4527.field19830, Class4527.field19830, false);
                int n2 = 10;
                for (int j = 0; j < 2; ++j) {
                    this.method13444(class1851, class1853, n2, 0, 10, n2, 6, 10, Class4527.field19830, Class4527.field19830, false);
                    this.method13444(class1851, class1853, n2, 0, 12, n2, 6, 12, Class4527.field19830, Class4527.field19830, false);
                    this.method13440(class1851, Class4527.field19833, n2, 0, 10, class1853);
                    this.method13440(class1851, Class4527.field19833, n2, 0, 12, class1853);
                    this.method13440(class1851, Class4527.field19833, n2, 4, 10, class1853);
                    this.method13440(class1851, Class4527.field19833, n2, 4, 12, class1853);
                    n2 = 12;
                }
                int n3 = 8;
                for (int k = 0; k < 2; ++k) {
                    this.method13444(class1851, class1853, n3, 0, 7, n3, 2, 7, Class4527.field19830, Class4527.field19830, false);
                    this.method13444(class1851, class1853, n3, 0, 14, n3, 2, 14, Class4527.field19830, Class4527.field19830, false);
                    n3 = 14;
                }
                this.method13444(class1851, class1853, 8, 3, 8, 8, 3, 13, Class4527.field19831, Class4527.field19831, false);
                this.method13444(class1851, class1853, 14, 3, 8, 14, 3, 13, Class4527.field19831, Class4527.field19831, false);
                this.method13420(class1851, class1853, 11, 5, 13);
            }
        }
        else {
            for (int l = 0; l < 4; ++l) {
                this.method13444(class1851, class1853, 10 - l, 3 - l, 20 - l, 12 + l, 3 - l, 20, Class4527.field19830, Class4527.field19830, false);
            }
            this.method13444(class1851, class1853, 7, 0, 6, 15, 0, 16, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 6, 0, 6, 6, 3, 20, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 16, 0, 6, 16, 3, 20, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 7, 1, 7, 7, 1, 20, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 15, 1, 7, 15, 1, 20, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 7, 1, 6, 9, 3, 6, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 13, 1, 6, 15, 3, 6, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 8, 1, 7, 9, 1, 7, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 13, 1, 7, 14, 1, 7, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 9, 0, 5, 13, 0, 5, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 10, 0, 7, 12, 0, 7, Class4527.field19831, Class4527.field19831, false);
            this.method13444(class1851, class1853, 8, 0, 10, 8, 0, 12, Class4527.field19831, Class4527.field19831, false);
            this.method13444(class1851, class1853, 14, 0, 10, 14, 0, 12, Class4527.field19831, Class4527.field19831, false);
            for (int n4 = 18; n4 >= 7; n4 -= 3) {
                this.method13440(class1851, Class4527.field19833, 6, 3, n4, class1853);
                this.method13440(class1851, Class4527.field19833, 16, 3, n4, class1853);
            }
            this.method13440(class1851, Class4527.field19833, 10, 0, 10, class1853);
            this.method13440(class1851, Class4527.field19833, 12, 0, 10, class1853);
            this.method13440(class1851, Class4527.field19833, 10, 0, 12, class1853);
            this.method13440(class1851, Class4527.field19833, 12, 0, 12, class1853);
            this.method13440(class1851, Class4527.field19833, 8, 3, 6, class1853);
            this.method13440(class1851, Class4527.field19833, 14, 3, 6, class1853);
            this.method13440(class1851, Class4527.field19830, 4, 2, 4, class1853);
            this.method13440(class1851, Class4527.field19833, 4, 1, 4, class1853);
            this.method13440(class1851, Class4527.field19830, 4, 0, 4, class1853);
            this.method13440(class1851, Class4527.field19830, 18, 2, 4, class1853);
            this.method13440(class1851, Class4527.field19833, 18, 1, 4, class1853);
            this.method13440(class1851, Class4527.field19830, 18, 0, 4, class1853);
            this.method13440(class1851, Class4527.field19830, 4, 2, 18, class1853);
            this.method13440(class1851, Class4527.field19833, 4, 1, 18, class1853);
            this.method13440(class1851, Class4527.field19830, 4, 0, 18, class1853);
            this.method13440(class1851, Class4527.field19830, 18, 2, 18, class1853);
            this.method13440(class1851, Class4527.field19833, 18, 1, 18, class1853);
            this.method13440(class1851, Class4527.field19830, 18, 0, 18, class1853);
            this.method13440(class1851, Class4527.field19830, 9, 7, 20, class1853);
            this.method13440(class1851, Class4527.field19830, 13, 7, 20, class1853);
            this.method13444(class1851, class1853, 6, 0, 21, 7, 4, 21, Class4527.field19830, Class4527.field19830, false);
            this.method13444(class1851, class1853, 15, 0, 21, 16, 4, 21, Class4527.field19830, Class4527.field19830, false);
            this.method13420(class1851, class1853, 11, 2, 16);
        }
        return true;
    }
}
