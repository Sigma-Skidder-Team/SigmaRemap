// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;

import java.util.Random;

public class Class4551 extends Class4535<Class5122>
{
    private static String[] field20030;
    public static final BlockPos field20031;
    private final boolean field20032;
    
    public Class4551(final boolean field20032) {
        super(Class5122::method16027);
        this.field20032 = field20032;
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        for (final BlockPos class1855 : BlockPos.getAllInBoxMutable(new BlockPos(class1853.getX() - 4, class1853.getY() - 1, class1853.getZ() - 4), new BlockPos(class1853.getX() + 4, class1853.getY() + 32, class1853.getZ() + 4))) {
            final boolean method1081 = class1855.withinDistance(class1853, 2.5);
            if (!method1081 && !class1855.withinDistance(class1853, 3.5)) {
                continue;
            }
            if (class1855.getY() >= class1853.getY()) {
                if (class1855.getY() <= class1853.getY()) {
                    if (method1081) {
                        if (!this.field20032) {
                            this.method13529(class1851, new BlockPos(class1855), Class7521.field29147.getDefaultState());
                        }
                        else {
                            this.method13529(class1851, new BlockPos(class1855), Class7521.field29401.getDefaultState());
                        }
                    }
                    else {
                        this.method13529(class1851, class1855, Class7521.field29172.getDefaultState());
                    }
                }
                else {
                    this.method13529(class1851, class1855, Class7521.field29147.getDefaultState());
                }
            }
            else if (!method1081) {
                if (class1855.getY() >= class1853.getY()) {
                    continue;
                }
                this.method13529(class1851, class1855, Class7521.field29403.getDefaultState());
            }
            else {
                this.method13529(class1851, class1855, Class7521.field29172.getDefaultState());
            }
        }
        for (int i = 0; i < 4; ++i) {
            this.method13529(class1851, class1853.method1138(i), Class7521.field29172.getDefaultState());
        }
        final BlockPos method1082 = class1853.method1138(2);
        for (final Direction class1856 : Plane.HORIZONTAL) {
            this.method13529(class1851, method1082.method1149(class1856), (BlockState)((StateHolder<Object, Object>)Class7521.field29288.getDefaultState()).with((IProperty<Comparable>)Class4023.field18110, class1856));
        }
        return true;
    }
    
    static {
        field20031 = BlockPos.ZERO;
    }
}
