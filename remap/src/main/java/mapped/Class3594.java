// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class3594 extends Class3592
{
    private static String[] field16739;
    private static final int[] field16740;
    private final Class840 field16741;
    private final int field16742;
    private boolean field16743;
    
    public Class3594(final Class840 field16741, final int field16742) {
        this.field16741 = field16741;
        this.field16742 = field16742;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16741.method2633().nextInt(this.field16742) == 0) {
            final Direction method1883 = this.field16741.method1883();
            final int method1884 = method1883.getXOffset();
            final int method1885 = method1883.getZOffset();
            final BlockPos class354 = new BlockPos(this.field16741);
            for (final int n : Class3594.field16740) {
                if (!this.method11122(class354, method1884, method1885, n) || !this.method11123(class354, method1884, method1885, n)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean method11122(final BlockPos class354, final int n, final int n2, final int n3) {
        final BlockPos method1134 = class354.add(n * n3, 0, n2 * n3);
        return this.field16741.world.getFluidState(method1134).isTagged(Class7324.field28319) && !this.field16741.world.getBlockState(method1134).method21697().method26440();
    }
    
    private boolean method11123(final BlockPos class354, final int n, final int n2, final int n3) {
        return this.field16741.world.getBlockState(class354.add(n * n3, 1, n2 * n3)).method21706() && this.field16741.world.getBlockState(class354.add(n * n3, 2, n2 * n3)).method21706();
    }
    
    @Override
    public boolean method11017() {
        final double field22771 = this.field16741.getMotion().y;
        if (field22771 * field22771 < 0.029999999329447746) {
            if (this.field16741.rotationPitch != 0.0f) {
                if (Math.abs(this.field16741.rotationPitch) < 10.0f) {
                    if (this.field16741.method1706()) {
                        return false;
                    }
                }
            }
        }
        if (!this.field16741.onGround) {
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11014() {
        return false;
    }
    
    @Override
    public void method11015() {
        final Direction method1883 = this.field16741.method1883();
        this.field16741.method1936(this.field16741.getMotion().add(method1883.getXOffset() * 0.6, 0.7, method1883.getZOffset() * 0.6));
        this.field16741.method4150().method24733();
    }
    
    @Override
    public void method11018() {
        this.field16741.rotationPitch = 0.0f;
    }
    
    @Override
    public void method11016() {
        final boolean field16743 = this.field16743;
        if (!field16743) {
            this.field16743 = this.field16741.world.getFluidState(new BlockPos(this.field16741)).isTagged(Class7324.field28319);
        }
        if (this.field16743) {
            if (!field16743) {
                this.field16741.method1695(Class8520.field35122, 1.0f, 1.0f);
            }
        }
        final Vec3d method1935 = this.field16741.getMotion();
        if (method1935.y * method1935.y < 0.029999999329447746 && this.field16741.rotationPitch != 0.0f) {
            this.field16741.rotationPitch = MathHelper.method35707(this.field16741.rotationPitch, 0.0f, 0.2f);
        }
        else {
            this.field16741.rotationPitch = (float)(Math.signum(-method1935.y) * Math.acos(Math.sqrt(Entity.horizontalMag(method1935)) / method1935.length()) * 57.2957763671875);
        }
    }
    
    static {
        field16740 = new int[] { 0, 1, 4, 5, 6, 7 };
    }
}
