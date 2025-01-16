// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;

import java.util.Random;

public class Class4524 extends Class4469
{
    private static String[] field19944;
    
    public Class4524(final Direction class179, final MutableBoundingBox class180) {
        super(Class9520.field40990, class179, class180);
    }
    
    public Class4524(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40990, class1796);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        this.method13444(class1851, class1853, 2, -1, 2, 11, -1, 11, Class4524.field19830, Class4524.field19830, false);
        this.method13444(class1851, class1853, 0, -1, 0, 1, -1, 11, Class4524.field19829, Class4524.field19829, false);
        this.method13444(class1851, class1853, 12, -1, 0, 13, -1, 11, Class4524.field19829, Class4524.field19829, false);
        this.method13444(class1851, class1853, 2, -1, 0, 11, -1, 1, Class4524.field19829, Class4524.field19829, false);
        this.method13444(class1851, class1853, 2, -1, 12, 11, -1, 13, Class4524.field19829, Class4524.field19829, false);
        this.method13444(class1851, class1853, 0, 0, 0, 0, 0, 13, Class4524.field19830, Class4524.field19830, false);
        this.method13444(class1851, class1853, 13, 0, 0, 13, 0, 13, Class4524.field19830, Class4524.field19830, false);
        this.method13444(class1851, class1853, 1, 0, 0, 12, 0, 0, Class4524.field19830, Class4524.field19830, false);
        this.method13444(class1851, class1853, 1, 0, 13, 12, 0, 13, Class4524.field19830, Class4524.field19830, false);
        for (int i = 2; i <= 11; i += 3) {
            this.method13440(class1851, Class4524.field19833, 0, 0, i, class1853);
            this.method13440(class1851, Class4524.field19833, 13, 0, i, class1853);
            this.method13440(class1851, Class4524.field19833, i, 0, 0, class1853);
        }
        this.method13444(class1851, class1853, 2, 0, 3, 4, 0, 9, Class4524.field19830, Class4524.field19830, false);
        this.method13444(class1851, class1853, 9, 0, 3, 11, 0, 9, Class4524.field19830, Class4524.field19830, false);
        this.method13444(class1851, class1853, 4, 0, 9, 9, 0, 11, Class4524.field19830, Class4524.field19830, false);
        this.method13440(class1851, Class4524.field19830, 5, 0, 8, class1853);
        this.method13440(class1851, Class4524.field19830, 8, 0, 8, class1853);
        this.method13440(class1851, Class4524.field19830, 10, 0, 10, class1853);
        this.method13440(class1851, Class4524.field19830, 3, 0, 10, class1853);
        this.method13444(class1851, class1853, 3, 0, 3, 3, 0, 7, Class4524.field19831, Class4524.field19831, false);
        this.method13444(class1851, class1853, 10, 0, 3, 10, 0, 7, Class4524.field19831, Class4524.field19831, false);
        this.method13444(class1851, class1853, 6, 0, 10, 7, 0, 10, Class4524.field19831, Class4524.field19831, false);
        int n = 3;
        for (int j = 0; j < 2; ++j) {
            for (int k = 2; k <= 8; k += 3) {
                this.method13444(class1851, class1853, n, 0, k, n, 2, k, Class4524.field19830, Class4524.field19830, false);
            }
            n = 10;
        }
        this.method13444(class1851, class1853, 5, 0, 10, 5, 2, 10, Class4524.field19830, Class4524.field19830, false);
        this.method13444(class1851, class1853, 8, 0, 10, 8, 2, 10, Class4524.field19830, Class4524.field19830, false);
        this.method13444(class1851, class1853, 6, -1, 7, 7, -1, 8, Class4524.field19831, Class4524.field19831, false);
        this.method13416(class1851, class1853, 6, -1, 3, 7, -1, 4);
        this.method13420(class1851, class1853, 6, 1, 6);
        return true;
    }
}
