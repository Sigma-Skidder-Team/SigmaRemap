// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public abstract class Class787 extends Class759
{
    public Class787(final EntityType<? extends Class787> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public float method4345(final BlockPos class354) {
        return this.method4228(class354, this.world);
    }
    
    public float method4228(final BlockPos class354, final Class1852 class355) {
        return 0.0f;
    }
    
    @Override
    public boolean method4179(final Class1851 class1851, final Class2101 class1852) {
        return this.method4228(new BlockPos(this), class1851) >= 0.0f;
    }
    
    public boolean method4346() {
        return !this.method4150().method24731();
    }
    
    @Override
    public void method4202() {
        super.method4202();
        final Entity method4206 = this.method4206();
        if (method4206 != null) {
            if (method4206.world == this.world) {
                this.method4198(new BlockPos(method4206), 5);
                final float method4207 = this.method1732(method4206);
                if (this instanceof Class794 && ((Class794)this).method4483()) {
                    if (method4207 > 10.0f) {
                        this.method4203(true, true);
                    }
                    return;
                }
                this.method4348(method4207);
                if (method4207 <= 10.0f) {
                    if (method4207 <= 6.0f) {
                        this.field4114.method22069(Class2139.field12580);
                        final Vec3d method4208 = new Vec3d(method4206.getPosX() - this.getPosX(), method4206.getPosY() - this.getPosY(), method4206.getPosZ() - this.getPosZ()).normalize().scale(Math.max(method4207 - 2.0f, 0.0f));
                        this.method4150().method24724(this.getPosX() + method4208.x, this.getPosY() + method4208.y, this.getPosZ() + method4208.z, this.method4347());
                    }
                    else {
                        final double sign = (method4206.getPosX() - this.getPosX()) / method4207;
                        final double sign2 = (method4206.getPosY() - this.getPosY()) / method4207;
                        final double sign3 = (method4206.getPosZ() - this.getPosZ()) / method4207;
                        this.method1936(this.getMotion().add(Math.copySign(sign * sign * 0.4, sign), Math.copySign(sign2 * sign2 * 0.4, sign2), Math.copySign(sign3 * sign3 * 0.4, sign3)));
                    }
                }
                else {
                    this.method4203(true, true);
                    this.field4114.method22068(Class2139.field12580);
                }
            }
        }
    }
    
    public double method4347() {
        return 1.0;
    }
    
    public void method4348(final float n) {
    }
}
