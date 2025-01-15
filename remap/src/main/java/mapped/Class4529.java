// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class4529 extends Class4469
{
    private static String[] field19950;
    
    public Class4529(final Direction class179, final Class8123 class180) {
        super(Class9520.field40992, 1, class179, class180, 1, 1, 1);
    }
    
    public Class4529(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40992, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final Class7859 class1854) {
        if (Class8123.method26744(this.field19840) / 25 > 0) {
            this.method13417(class1851, class1853, 0, 0, Class8123.method26745(this.field19840)[Direction.DOWN.getIndex()]);
        }
        if (Class8123.method26743(this.field19840)[Direction.UP.getIndex()] == null) {
            this.method13418(class1851, class1853, 1, 4, 1, 6, 4, 6, Class4529.field19829);
        }
        for (int i = 1; i <= 6; ++i) {
            for (int j = 1; j <= 6; ++j) {
                if (random.nextInt(3) != 0) {
                    final int n = 2 + ((random.nextInt(4) != 0) ? 1 : 0);
                    final Class7096 method11878 = Class7521.field29212.method11878();
                    this.method13444(class1851, class1853, i, n, j, i, 3, j, method11878, method11878, false);
                }
            }
        }
        this.method13444(class1851, class1853, 0, 1, 0, 0, 1, 7, Class4529.field19830, Class4529.field19830, false);
        this.method13444(class1851, class1853, 7, 1, 0, 7, 1, 7, Class4529.field19830, Class4529.field19830, false);
        this.method13444(class1851, class1853, 1, 1, 0, 6, 1, 0, Class4529.field19830, Class4529.field19830, false);
        this.method13444(class1851, class1853, 1, 1, 7, 6, 1, 7, Class4529.field19830, Class4529.field19830, false);
        this.method13444(class1851, class1853, 0, 2, 0, 0, 2, 7, Class4529.field19831, Class4529.field19831, false);
        this.method13444(class1851, class1853, 7, 2, 0, 7, 2, 7, Class4529.field19831, Class4529.field19831, false);
        this.method13444(class1851, class1853, 1, 2, 0, 6, 2, 0, Class4529.field19831, Class4529.field19831, false);
        this.method13444(class1851, class1853, 1, 2, 7, 6, 2, 7, Class4529.field19831, Class4529.field19831, false);
        this.method13444(class1851, class1853, 0, 3, 0, 0, 3, 7, Class4529.field19830, Class4529.field19830, false);
        this.method13444(class1851, class1853, 7, 3, 0, 7, 3, 7, Class4529.field19830, Class4529.field19830, false);
        this.method13444(class1851, class1853, 1, 3, 0, 6, 3, 0, Class4529.field19830, Class4529.field19830, false);
        this.method13444(class1851, class1853, 1, 3, 7, 6, 3, 7, Class4529.field19830, Class4529.field19830, false);
        this.method13444(class1851, class1853, 0, 1, 3, 0, 2, 4, Class4529.field19831, Class4529.field19831, false);
        this.method13444(class1851, class1853, 7, 1, 3, 7, 2, 4, Class4529.field19831, Class4529.field19831, false);
        this.method13444(class1851, class1853, 3, 1, 0, 4, 2, 0, Class4529.field19831, Class4529.field19831, false);
        this.method13444(class1851, class1853, 3, 1, 7, 4, 2, 7, Class4529.field19831, Class4529.field19831, false);
        if (Class8123.method26745(this.field19840)[Direction.SOUTH.getIndex()]) {
            this.method13416(class1851, class1853, 3, 1, 0, 4, 2, 0);
        }
        return true;
    }
}
