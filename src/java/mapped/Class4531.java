// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class4531 extends Class4469
{
    private static String[] field19952;
    
    public Class4531(final Class179 class179, final Class8123 class180) {
        super(Class9520.field40983, 1, class179, class180, 2, 2, 2);
    }
    
    public Class4531(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40983, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        this.method13418(class1851, class1853, 1, 8, 0, 14, 8, 14, Class4531.field19829);
        final Class7096 field19830 = Class4531.field19830;
        this.method13444(class1851, class1853, 0, 7, 0, 0, 7, 15, field19830, field19830, false);
        this.method13444(class1851, class1853, 15, 7, 0, 15, 7, 15, field19830, field19830, false);
        this.method13444(class1851, class1853, 1, 7, 0, 15, 7, 0, field19830, field19830, false);
        this.method13444(class1851, class1853, 1, 7, 15, 14, 7, 15, field19830, field19830, false);
        for (int i = 1; i <= 6; ++i) {
            Class7096 class1855 = Class4531.field19830;
            if (i == 2 || i == 6) {
                class1855 = Class4531.field19829;
            }
            for (int j = 0; j <= 15; j += 15) {
                this.method13444(class1851, class1853, j, i, 0, j, i, 1, class1855, class1855, false);
                this.method13444(class1851, class1853, j, i, 6, j, i, 9, class1855, class1855, false);
                this.method13444(class1851, class1853, j, i, 14, j, i, 15, class1855, class1855, false);
            }
            this.method13444(class1851, class1853, 1, i, 0, 1, i, 0, class1855, class1855, false);
            this.method13444(class1851, class1853, 6, i, 0, 9, i, 0, class1855, class1855, false);
            this.method13444(class1851, class1853, 14, i, 0, 14, i, 0, class1855, class1855, false);
            this.method13444(class1851, class1853, 1, i, 15, 14, i, 15, class1855, class1855, false);
        }
        this.method13444(class1851, class1853, 6, 3, 6, 9, 6, 9, Class4531.field19831, Class4531.field19831, false);
        this.method13444(class1851, class1853, 7, 4, 7, 8, 5, 8, Class7521.field29280.method11878(), Class7521.field29280.method11878(), false);
        for (int k = 3; k <= 6; k += 3) {
            for (int l = 6; l <= 9; l += 3) {
                this.method13440(class1851, Class4531.field19833, l, k, 6, class1853);
                this.method13440(class1851, Class4531.field19833, l, k, 9, class1853);
            }
        }
        this.method13444(class1851, class1853, 5, 1, 6, 5, 2, 6, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 5, 1, 9, 5, 2, 9, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 10, 1, 6, 10, 2, 6, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 10, 1, 9, 10, 2, 9, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 6, 1, 5, 6, 2, 5, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 9, 1, 5, 9, 2, 5, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 6, 1, 10, 6, 2, 10, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 9, 1, 10, 9, 2, 10, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 5, 2, 5, 5, 6, 5, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 5, 2, 10, 5, 6, 10, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 10, 2, 5, 10, 6, 5, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 10, 2, 10, 10, 6, 10, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 5, 7, 1, 5, 7, 6, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 10, 7, 1, 10, 7, 6, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 5, 7, 9, 5, 7, 14, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 10, 7, 9, 10, 7, 14, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 1, 7, 5, 6, 7, 5, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 1, 7, 10, 6, 7, 10, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 9, 7, 5, 14, 7, 5, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 9, 7, 10, 14, 7, 10, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 2, 1, 2, 2, 1, 3, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 3, 1, 2, 3, 1, 2, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 13, 1, 2, 13, 1, 3, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 12, 1, 2, 12, 1, 2, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 2, 1, 12, 2, 1, 13, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 3, 1, 13, 3, 1, 13, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 13, 1, 12, 13, 1, 13, Class4531.field19830, Class4531.field19830, false);
        this.method13444(class1851, class1853, 12, 1, 13, 12, 1, 13, Class4531.field19830, Class4531.field19830, false);
        return true;
    }
}
