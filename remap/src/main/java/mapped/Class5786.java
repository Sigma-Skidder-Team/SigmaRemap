// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import javax.annotation.Nullable;
import org.apache.logging.log4j.Logger;

public class Class5786 extends Class5784
{
    private static final Logger field23768;
    private int field23769;
    private Class9468 field23770;
    private Vec3d field23771;
    private LivingEntity field23772;
    private boolean field23773;
    
    public Class5786(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public void method17247() {
        if (this.field23772 != null) {
            if (this.field23770 != null) {
                if (this.field23770.method35215()) {
                    final double method1938 = this.field23772.getPosX();
                    final double method1939 = this.field23772.getPosZ();
                    final double n = method1938 - this.field23764.getPosX();
                    final double n2 = method1939 - this.field23764.getPosZ();
                    this.field23771 = new Vec3d(method1938, this.field23772.getPosY() + Math.min(0.4000000059604645 + MathHelper.sqrt(n * n + n2 * n2) / 80.0 - 1.0, 10.0), method1939);
                }
            }
            final double n3 = (this.field23771 != null) ? this.field23771.squareDistanceTo(this.field23764.getPosX(), this.field23764.getPosY(), this.field23764.getPosZ()) : 0.0;
            if (n3 < 100.0 || n3 > 22500.0) {
                this.method17257();
            }
            if (this.field23772.method1734(this.field23764) >= 4096.0) {
                if (this.field23769 > 0) {
                    --this.field23769;
                }
            }
            else if (!this.field23764.method2747(this.field23772)) {
                if (this.field23769 > 0) {
                    --this.field23769;
                }
            }
            else {
                ++this.field23769;
                final float n4 = (float)(Math.acos((float)new Vec3d(MathHelper.sin(this.field23764.rotationYaw * 0.017453292f), 0.0, -MathHelper.cos(this.field23764.rotationYaw * 0.017453292f)).normalize().dotProduct(new Vec3d(this.field23772.getPosX() - this.field23764.getPosX(), 0.0, this.field23772.getPosZ() - this.field23764.getPosZ()).normalize())) * 57.2957763671875) + 0.5f;
                if (this.field23769 >= 5) {
                    if (n4 >= 0.0f) {
                        if (n4 < 10.0f) {
                            final Vec3d method1940 = this.field23764.method1741(1.0f);
                            final double n5 = this.field23764.field4535.getPosX() - method1940.x * 1.0;
                            final double n6 = this.field23764.field4535.method1942(0.5) + 0.5;
                            final double n7 = this.field23764.field4535.getPosZ() - method1940.z * 1.0;
                            final double n8 = this.field23772.getPosX() - n5;
                            final double n9 = this.field23772.method1942(0.5) - n6;
                            final double n10 = this.field23772.getPosZ() - n7;
                            this.field23764.world.method6839(null, 1017, new BlockPos(this.field23764), 0);
                            final Class420 class420 = new Class420(this.field23764.world, this.field23764, n8, n9, n10);
                            class420.method1730(n5, n6, n7, 0.0f, 0.0f);
                            this.field23764.world.method6886(class420);
                            this.field23769 = 0;
                            if (this.field23770 != null) {
                                while (!this.field23770.method35215()) {
                                    this.field23770.method35214();
                                }
                            }
                            this.field23764.method5127().method33696(Class7193.field27948);
                        }
                    }
                }
            }
        }
        else {
            Class5786.field23768.warn("Skipping player strafe phase because no player was found");
            this.field23764.method5127().method33696(Class7193.field27948);
        }
    }
    
    private void method17257() {
        if (this.field23770 == null || this.field23770.method35215()) {
            int method5119;
            final int n = method5119 = this.field23764.method5119();
            if (this.field23764.method2633().nextInt(8) == 0) {
                this.field23773 = !this.field23773;
                method5119 = n + 6;
            }
            if (!this.field23773) {
                --method5119;
            }
            else {
                ++method5119;
            }
            int n2;
            if (this.field23764.method5128() != null && this.field23764.method5128().method29250() > 0) {
                n2 = method5119 % 12;
                if (n2 < 0) {
                    n2 += 12;
                }
            }
            else {
                n2 = (method5119 - 12 & 0x7) + 12;
            }
            this.field23770 = this.field23764.method5121(n, n2, null);
            if (this.field23770 != null) {
                this.field23770.method35214();
            }
        }
        this.method17258();
    }
    
    private void method17258() {
        if (this.field23770 != null) {
            if (!this.field23770.method35215()) {
                final Vec3d method35226 = this.field23770.method35226();
                this.field23770.method35214();
                final double field22770 = method35226.x;
                final double field22771 = method35226.z;
                double n;
                do {
                    n = method35226.y + this.field23764.method2633().nextFloat() * 20.0f;
                } while (n < method35226.y);
                this.field23771 = new Vec3d(field22770, n, field22771);
            }
        }
    }
    
    @Override
    public void method17249() {
        this.field23769 = 0;
        this.field23771 = null;
        this.field23770 = null;
        this.field23772 = null;
    }
    
    public void method17259(final LivingEntity field23772) {
        this.field23772 = field23772;
        final int method5119 = this.field23764.method5119();
        final int method5120 = this.field23764.method5120(this.field23772.getPosX(), this.field23772.getPosY(), this.field23772.getPosZ());
        final int method5121 = MathHelper.floor(this.field23772.getPosX());
        final int method5122 = MathHelper.floor(this.field23772.getPosZ());
        final double n = method5121 - this.field23764.getPosX();
        final double n2 = method5122 - this.field23764.getPosZ();
        this.field23770 = this.field23764.method5121(method5119, method5120, new Class6772(method5121, MathHelper.floor(this.field23772.getPosY() + Math.min(0.4000000059604645 + MathHelper.sqrt(n * n + n2 * n2) / 80.0 - 1.0, 10.0)), method5122));
        if (this.field23770 != null) {
            this.field23770.method35214();
            this.method17258();
        }
    }
    
    @Nullable
    @Override
    public Vec3d method17254() {
        return this.field23771;
    }
    
    @Override
    public Class7193<Class5786> method17253() {
        return Class7193.field27949;
    }
    
    static {
        field23768 = LogManager.getLogger();
    }
}
