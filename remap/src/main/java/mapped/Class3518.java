// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class3518 extends Class3517
{
    private static String[] field16519;
    
    public Class3518(final Class787 class787, final double n) {
        super(class787, n);
    }
    
    @Nullable
    @Override
    public Vec3d method11071() {
        Vec3d class5487 = null;
        if (this.field16510.method1706()) {
            class5487 = Class7775.method24902(this.field16510, 15, 15);
        }
        if (this.field16510.method2633().nextFloat() >= this.field16518) {
            class5487 = this.method11074();
        }
        return (class5487 != null) ? class5487 : super.method11071();
    }
    
    @Nullable
    private Vec3d method11074() {
        final BlockPos class354 = new BlockPos(this.field16510);
        final Mutable class355 = new Mutable();
        final Mutable class356 = new Mutable();
        for (final BlockPos class357 : BlockPos.getAllInBoxMutable(MathHelper.floor(this.field16510.getPosX() - 3.0), MathHelper.floor(this.field16510.getPosY() - 6.0), MathHelper.floor(this.field16510.getPosZ() - 3.0), MathHelper.floor(this.field16510.getPosX() + 3.0), MathHelper.floor(this.field16510.getPosY() + 6.0), MathHelper.floor(this.field16510.getPosZ() + 3.0))) {
            if (class354.equals(class357)) {
                continue;
            }
            final Block method21696 = this.field16510.world.getBlockState(class356.method1287(class357).method1290(Direction.DOWN)).method21696();
            if (!(method21696 instanceof Class3972) && !method21696.method11785(Class7188.field27893)) {
                continue;
            }
            if (!this.field16510.world.method6961(class357)) {
                continue;
            }
            if (!this.field16510.world.method6961(class355.method1287(class357).method1290(Direction.UP))) {
                continue;
            }
            return new Vec3d(class357);
        }
        return null;
    }
}
