// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;

import java.util.Random;
import java.util.List;

public class Class4514 extends Class4500
{
    private final int field19916;
    
    public Class4514(final int n, final MutableBoundingBox field19849, final Direction class179) {
        super(Class9520.field40965, n);
        this.method13456(class179);
        this.field19849 = field19849;
        this.field19916 = ((class179 != Direction.NORTH && class179 != Direction.SOUTH) ? field19849.getXSize() : field19849.getZSize());
    }
    
    public Class4514(final Class1795 class1795, final CompoundNBT class1796) {
        super(Class9520.field40965, class1796);
        this.field19916 = class1796.getInt("Steps");
    }
    
    @Override
    public void method13415(final CompoundNBT class51) {
        super.method13415(class51);
        class51.putInt("Steps", this.field19916);
    }
    
    public static MutableBoundingBox method13509(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Direction class179) {
        final MutableBoundingBox method21408 = MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -1, 0, 5, 5, 4, class179);
        final Class4473 method21409 = Class4473.method13435(list, method21408);
        if (method21409 != null) {
            if (method21409.method13432().minY == method21408.minY) {
                for (int i = 3; i >= 1; --i) {
                    if (!method21409.method13432().intersectsWith(MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -1, 0, 5, 5, i - 1, class179))) {
                        return MutableBoundingBox.getComponentToAddBoundingBox(n, n2, n3, -1, -1, 0, 5, 5, i, class179);
                    }
                }
            }
            return null;
        }
        return null;
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final MutableBoundingBox class1853, final ChunkPos class1854) {
        for (int i = 0; i < this.field19916; ++i) {
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 0, 0, i, class1853);
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 1, 0, i, class1853);
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 2, 0, i, class1853);
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 3, 0, i, class1853);
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 4, 0, i, class1853);
            for (int j = 1; j <= 3; ++j) {
                this.method13440(class1851, Blocks.field29368.getDefaultState(), 0, j, i, class1853);
                this.method13440(class1851, Blocks.CAVE_AIR.getDefaultState(), 1, j, i, class1853);
                this.method13440(class1851, Blocks.CAVE_AIR.getDefaultState(), 2, j, i, class1853);
                this.method13440(class1851, Blocks.CAVE_AIR.getDefaultState(), 3, j, i, class1853);
                this.method13440(class1851, Blocks.field29368.getDefaultState(), 4, j, i, class1853);
            }
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 0, 4, i, class1853);
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 1, 4, i, class1853);
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 2, 4, i, class1853);
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 3, 4, i, class1853);
            this.method13440(class1851, Blocks.field29368.getDefaultState(), 4, 4, i, class1853);
        }
        return true;
    }
}
