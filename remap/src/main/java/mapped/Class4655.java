// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class Class4655 extends Class4654
{
    private static String[] field20149;
    private final boolean field20150;
    
    public Class4655(final boolean field20150) {
        this.field20150 = field20150;
    }
    
    @Override
    public Class6772 method13902() {
        return super.method13919(MathHelper.floor(this.field20141.getBoundingBox().minX), MathHelper.floor(this.field20141.getBoundingBox().minY + 0.5), MathHelper.floor(this.field20141.getBoundingBox().minZ));
    }
    
    @Override
    public Class6773 method13903(final double n, final double n2, final double n3) {
        return new Class6773(super.method13919(MathHelper.floor(n - this.field20141.method1930() / 2.0f), MathHelper.floor(n2 + 0.5), MathHelper.floor(n3 - this.field20141.method1930() / 2.0f)));
    }
    
    @Override
    public int method13904(final Class6772[] array, final Class6772 class6772) {
        int n = 0;
        for (final Direction class6773 : Direction.values()) {
            final Class6772 method13929 = this.method13929(class6772.field26589 + class6773.getXOffset(), class6772.field26590 + class6773.getYOffset(), class6772.field26591 + class6773.getZOffset());
            if (method13929 != null) {
                if (!method13929.field26598) {
                    array[n++] = method13929;
                }
            }
        }
        return n;
    }
    
    @Override
    public Class257 method13908(final IBlockReader class1855, final int n, final int n2, final int n3, final Class759 class1856, final int n4, final int n5, final int n6, final boolean b, final boolean b2) {
        return this.method13913(class1855, n, n2, n3);
    }
    
    @Override
    public Class257 method13913(final IBlockReader class1855, final int n, final int n2, final int n3) {
        final BlockPos class1856 = new BlockPos(n, n2, n3);
        final IFluidState method6702 = class1855.getFluidState(class1856);
        final BlockState method6703 = class1855.getBlockState(class1856);
        if (method6702.isEmpty()) {
            if (method6703.method21749(class1855, class1856.method1139(), Class2084.field12052)) {
                if (method6703.method21706()) {
                    return Class257.field1223;
                }
            }
        }
        return (method6702.isTagged(Class7324.field28319) && method6703.method21749(class1855, class1856, Class2084.field12052)) ? Class257.field1211 : Class257.field1205;
    }
    
    @Nullable
    private Class6772 method13929(final int n, final int n2, final int n3) {
        final Class257 method13930 = this.method13930(n, n2, n3);
        if (!this.field20150 || method13930 != Class257.field1223) {
            if (method13930 != Class257.field1211) {
                return null;
            }
        }
        return this.method13919(n, n2, n3);
    }
    
    @Nullable
    @Override
    public Class6772 method13919(final int n, final int n2, final int n3) {
        Class6772 method13919 = null;
        final Class257 method13920 = this.method13913(this.field20141.world, n, n2, n3);
        final float method13921 = this.field20141.method4144(method13920);
        if (method13921 >= 0.0f) {
            method13919 = super.method13919(n, n2, n3);
            method13919.field26601 = method13920;
            method13919.field26600 = Math.max(method13919.field26600, method13921);
            if (this.field20140.getFluidState(new BlockPos(n, n2, n3)).isEmpty()) {
                final Class6772 class6772 = method13919;
                class6772.field26600 += 8.0f;
            }
        }
        return (method13920 != Class257.field1206) ? method13919 : method13919;
    }
    
    private Class257 method13930(final int n, final int n2, final int n3) {
        final Mutable class385 = new Mutable();
        for (int i = n; i < n + this.field20143; ++i) {
            for (int j = n2; j < n2 + this.field20144; ++j) {
                for (int k = n3; k < n3 + this.field20145; ++k) {
                    final IFluidState method6702 = this.field20140.getFluidState(class385.setPos(i, j, k));
                    final BlockState method6703 = this.field20140.getBlockState(class385.setPos(i, j, k));
                    if (method6702.isEmpty()) {
                        if (method6703.method21749(this.field20140, class385.method1139(), Class2084.field12052)) {
                            if (method6703.method21706()) {
                                return Class257.field1223;
                            }
                        }
                    }
                    if (!method6702.isTagged(Class7324.field28319)) {
                        return Class257.field1205;
                    }
                }
            }
        }
        return this.field20140.getBlockState(class385).method21749(this.field20140, class385, Class2084.field12052) ? Class257.field1211 : Class257.field1205;
    }
}
