// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Class4714 extends Class4712<Class841, Class5876<Class841>>
{
    public static final ResourceLocation field20315;
    public static final ResourceLocation[] field20316;
    
    public Class4714(final Class8551 class8551) {
        super(class8551, new Class5876(), 0.0f);
        this.method13978(new Class1800(this));
    }
    
    public Vec3d method14012(final Class841 class841, final float n) {
        final int method5024 = class841.method5024();
        if (method5024 > 0 && class841.method5026()) {
            final BlockPos method5025 = class841.method5019();
            final BlockPos method5026 = class841.method5025();
            final double n2 = (method5024 - n) / 6.0;
            final double n3 = n2 * n2;
            return new Vec3d(-((method5025.getX() - method5026.getX()) * n3), -((method5025.getY() - method5026.getY()) * n3), -((method5025.getZ() - method5026.getZ()) * n3));
        }
        return super.method13955(class841, n);
    }
    
    public boolean method14013(final Class841 class841, final Class6664 class842, final double n, final double n2, final double n3) {
        if (!super.method14005(class841, class842, n, n2, n3)) {
            if (class841.method5024() > 0) {
                if (class841.method5026()) {
                    final Vec3d class843 = new Vec3d(class841.method5019());
                    final Vec3d class844 = new Vec3d(class841.method5025());
                    return class842.method20261(new AxisAlignedBB(class844.x, class844.y, class844.z, class843.x, class843.y, class843.z));
                }
            }
            return false;
        }
        return true;
    }
    
    public ResourceLocation method14014(final Class841 class841) {
        return (class841.method5027() != null) ? Class4714.field20316[class841.method5027().method813()] : Class4714.field20315;
    }
    
    public void method14015(final Class841 class841, final MatrixStack class842, final float n, final float n2, final float n3) {
        super.method13985(class841, class842, n, n2, n3);
        class842.method22564(0.0, 0.5, 0.0);
        class842.method22566(class841.method5018().getOpposite().getRotation());
        class842.method22564(0.0, -0.5, 0.0);
    }
    
    public void method14016(final Class841 class841, final MatrixStack class842, final float n) {
        class842.method22565(0.999f, 0.999f, 0.999f);
    }
    
    static {
        field20315 = new ResourceLocation(Class4714.\u7b4d\u5718\ub5d9\u345d\u708b\u63ae[0] + Class8752.field36750.method11331().method7797() + Class4714.\u7b4d\u5718\ub5d9\u345d\u708b\u63ae[1]);
        field20316 = Class8752.field36751.stream().map(class3687 -> {
            new ResourceLocation("textures/" + class3687.method11331().method7797() + ".png");
            return;
        }).toArray(ResourceLocation[]::new);
    }
}
