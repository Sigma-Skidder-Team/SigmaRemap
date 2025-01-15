// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class6565 extends Class6564
{
    private static String[] field26074;
    public final /* synthetic */ Class843 field26075;
    
    public Class6565(final Class843 field26075, final Class843 class843) {
        this.field26075 = field26075;
        super(class843);
    }
    
    @Override
    public void method19904() {
        if (this.field26073 == Class2198.field13376) {
            final Vec3d class5487 = new Vec3d(this.field26067 - this.field26075.getPosX(), this.field26068 - this.field26075.getPosY(), this.field26069 - this.field26075.getPosZ());
            final double method16752 = class5487.length();
            if (method16752 >= this.field26075.getBoundingBox().method18507()) {
                this.field26075.method1936(this.field26075.getMotion().add(class5487.scale(this.field26070 * 0.05 / method16752)));
                if (this.field26075.method4152() != null) {
                    this.field26075.rotationYaw = -(float) MathHelper.method35693(this.field26075.method4152().getPosX() - this.field26075.getPosX(), this.field26075.method4152().getPosZ() - this.field26075.getPosZ()) * 57.295776f;
                    this.field26075.field2951 = this.field26075.rotationYaw;
                }
                else {
                    final Vec3d method16753 = this.field26075.getMotion();
                    this.field26075.rotationYaw = -(float) MathHelper.method35693(method16753.x, method16753.z) * 57.295776f;
                    this.field26075.field2951 = this.field26075.rotationYaw;
                }
            }
            else {
                this.field26073 = Class2198.field13375;
                this.field26075.method1936(this.field26075.getMotion().scale(0.5));
            }
        }
    }
}
