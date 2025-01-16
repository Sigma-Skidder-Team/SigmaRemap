// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;

public class Class3600 extends Class3446
{
    private static String[] field16767;
    private final Class787 field16768;
    
    public Class3600(final Class787 field16768) {
        this.field16768 = field16768;
    }
    
    @Override
    public boolean method11013() {
        return this.field16768.onGround && !this.field16768.world.getFluidState(new BlockPos(this.field16768)).isTagged(Class7324.field28319);
    }
    
    @Override
    public void method11015() {
        Vec3i class352 = null;
        for (final BlockPos class353 : BlockPos.getAllInBoxMutable(MathHelper.floor(this.field16768.getPosX() - 2.0), MathHelper.floor(this.field16768.getPosY() - 2.0), MathHelper.floor(this.field16768.getPosZ() - 2.0), MathHelper.floor(this.field16768.getPosX() + 2.0), MathHelper.floor(this.field16768.getPosY()), MathHelper.floor(this.field16768.getPosZ() + 2.0))) {
            if (!this.field16768.world.getFluidState(class353).isTagged(Class7324.field28319)) {
                continue;
            }
            class352 = class353;
            break;
        }
        if (class352 != null) {
            this.field16768.method4148().method19907(class352.getX(), class352.getY(), class352.getZ(), 1.0);
        }
    }
}
