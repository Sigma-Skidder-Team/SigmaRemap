// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.Random;

public class Class839 extends Class832
{
    private static String[] field4459;
    public float field4460;
    public float field4461;
    public float field4462;
    public float field4463;
    public float field4464;
    public float field4465;
    public float field4466;
    public float field4467;
    private float field4468;
    private float field4469;
    private float field4470;
    private float field4471;
    private float field4472;
    private float field4473;
    
    public Class839(final EntityType<? extends Class839> class7499, final World class7500) {
        super(class7499, class7500);
        this.rand.setSeed(this.getEntityId());
        this.field4469 = 1.0f / (this.rand.nextFloat() + 1.0f) * 0.2f;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3614(this, this));
        this.field4114.method22062(1, new Class3602(this, null));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(10.0);
    }
    
    @Override
    public float method2789(final Pose class290, final EntitySize class291) {
        return class291.field34098 * 0.5f;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35611;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35613;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35612;
    }
    
    @Override
    public float method2720() {
        return 0.4f;
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method2736() {
        super.method2736();
        this.field4461 = this.field4460;
        this.field4463 = this.field4462;
        this.field4465 = this.field4464;
        this.field4467 = this.field4466;
        this.field4464 += this.field4469;
        if (this.field4464 > 6.283185307179586) {
            if (!this.world.isRemote) {
                this.field4464 -= (float)6.283185307179586;
                if (this.rand.nextInt(10) == 0) {
                    this.field4469 = 1.0f / (this.rand.nextFloat() + 1.0f) * 0.2f;
                }
                this.world.method6761(this, (byte)19);
            }
            else {
                this.field4464 = 6.2831855f;
            }
        }
        if (!this.method1711()) {
            this.field4466 = MathHelper.method35647(MathHelper.sin(this.field4464)) * 3.1415927f * 0.25f;
            if (!this.world.isRemote) {
                double field22771 = this.getMotion().y;
                if (!this.method2653(Class9439.field40498)) {
                    if (!this.method1698()) {
                        field22771 -= 0.08;
                    }
                }
                else {
                    field22771 = 0.05 * (this.method2654(Class9439.field40498).method7908() + 1);
                }
                this.setMotion(0.0, field22771 * 0.9800000190734863, 0.0);
            }
            this.field4460 += (float)((-90.0f - this.field4460) * 0.02);
        }
        else {
            if (this.field4464 >= 3.1415927f) {
                this.field4466 = 0.0f;
                this.field4468 *= 0.9f;
                this.field4470 *= 0.99f;
            }
            else {
                final float n = this.field4464 / 3.1415927f;
                this.field4466 = MathHelper.sin(n * n * 3.1415927f) * 3.1415927f * 0.25f;
                if (n <= 0.75) {
                    this.field4470 *= 0.8f;
                }
                else {
                    this.field4468 = 1.0f;
                    this.field4470 = 1.0f;
                }
            }
            if (!this.world.isRemote) {
                this.setMotion(this.field4471 * this.field4468, this.field4472 * this.field4468, this.field4473 * this.field4468);
            }
            final Vec3d method1935 = this.getMotion();
            final float method1936 = MathHelper.sqrt(Entity.horizontalMag(method1935));
            this.field2951 += (-(float) MathHelper.method35693(method1935.x, method1935.z) * 57.295776f - this.field2951) * 0.1f;
            this.rotationYaw = this.field2951;
            this.field4462 += (float)(3.141592653589793 * this.field4470 * 1.5);
            this.field4460 += (-(float) MathHelper.method35693(method1936, method1935.y) * 57.295776f - this.field4460) * 0.1f;
        }
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        if (super.attackEntityFrom(class7929, n) && this.method2634() != null) {
            this.method4997();
            return true;
        }
        return false;
    }
    
    private Vec3d method4996(final Vec3d class5487) {
        return class5487.rotatePitch(this.field4461 * 0.017453292f).rotateYaw(-this.field2952 * 0.017453292f);
    }
    
    private void method4997() {
        this.method1695(Class8520.field35614, this.method2720(), this.method2721());
        final Vec3d method16744 = this.method4996(new Vec3d(0.0, -1.0, 0.0)).add(this.getPosX(), this.getPosY(), this.getPosZ());
        for (int i = 0; i < 30; ++i) {
            final Vec3d method16745 = this.method4996(new Vec3d(this.rand.nextFloat() * 0.6 - 0.3, -1.0, this.rand.nextFloat() * 0.6 - 0.3)).scale(0.3 + this.rand.nextFloat() * 2.0f);
            ((Class1849)this.world).method6911(Class8432.field34642, method16744.x, method16744.y + 0.5, method16744.z, 0, method16745.x, method16745.y, method16745.z, 0.10000000149011612);
        }
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        this.method1671(Class2160.field12826, this.getMotion());
    }
    
    public static boolean method4998(final EntityType<Class839> class7499, final Class1851 class7500, final Class2101 class7501, final BlockPos class7502, final Random random) {
        return class7502.getY() > 45 && class7502.getY() < class7500.method6743();
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 19) {
            super.method1798(b);
        }
        else {
            this.field4464 = 0.0f;
        }
    }
    
    public void method4999(final float field4471, final float field4472, final float field4473) {
        this.field4471 = field4471;
        this.field4472 = field4472;
        this.field4473 = field4473;
    }
    
    public boolean method5000() {
        if (this.field4471 == 0.0f) {
            if (this.field4472 == 0.0f) {
                if (this.field4473 == 0.0f) {
                    return false;
                }
            }
        }
        return true;
    }
}
