// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util2.Direction;

import java.util.List;
import java.util.Random;

public class Class4485 extends Class4484
{
    private final int field19878;
    
    public Class4485(final int n, final Random random, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40950, n);
        this.method13456(class179);
        this.field19849 = field19849;
        this.field19878 = random.nextInt();
    }
    
    public Class4485(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40950, class1796);
        this.field19878 = class1796.getInt("Seed");
    }
    
    public static Class4485 method13478(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179, final int n4) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -3, 0, 5, 10, 8, class179);
        return (Class4484.method13477(method21408) && Class4473.method13435(list, method21408) == null) ? new Class4485(n4, random, method21408, class179) : null;
    }
    
    @Override
    public void method13415(final CompoundNBT class51) {
        super.method13415(class51);
        class51.putInt("Seed", this.field19878);
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        final Random random2 = new Random(this.field19878);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 3; j <= 4; ++j) {
                this.method13444(class1851, class1853, i, j, 0, i, j, random2.nextInt(8), Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
            }
        }
        this.method13444(class1851, class1853, 0, 5, 0, 0, 5, random2.nextInt(8), Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        this.method13444(class1851, class1853, 4, 5, 0, 4, 5, random2.nextInt(8), Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        for (int k = 0; k <= 4; ++k) {
            this.method13444(class1851, class1853, k, 2, 0, k, 2, random2.nextInt(5), Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
        }
        for (int l = 0; l <= 4; ++l) {
            for (int n = 0; n <= 1; ++n) {
                this.method13444(class1851, class1853, l, n, 0, l, n, random2.nextInt(3), Class7521.field29394.getDefaultState(), Class7521.field29394.getDefaultState(), false);
            }
        }
        return true;
    }
}
