// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class5788 extends Class5784
{
    private static String[] field23776;
    private static final Class7843 field23777;
    private Class9468 field23778;
    private Vec3d field23779;
    private boolean field23780;
    
    public Class5788(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public Class7193<Class5788> method17253() {
        return Class7193.field27948;
    }
    
    @Override
    public void method17247() {
        final double n = (this.field23779 != null) ? this.field23779.squareDistanceTo(this.field23764.getPosX(), this.field23764.getPosY(), this.field23764.getPosZ()) : 0.0;
        if (n >= 100.0) {
            if (n <= 22500.0) {
                if (!this.field23764.collidedHorizontally) {
                    if (!this.field23764.collidedVertically) {
                        return;
                    }
                }
            }
        }
        this.method17260();
    }
    
    @Override
    public void method17249() {
        this.field23778 = null;
        this.field23779 = null;
    }
    
    @Nullable
    @Override
    public Vec3d method17254() {
        return this.field23779;
    }
    
    private void method17260() {
        if (this.field23778 != null) {
            if (this.field23778.method35215()) {
                final BlockPos method6958 = this.field23764.world.method6958(HeightmapType.field11526, new BlockPos(Class4551.field20031));
                final int n = (this.field23764.method5128() != null) ? this.field23764.method5128().method29250() : 0;
                if (this.field23764.method2633().nextInt(n + 3) == 0) {
                    this.field23764.method5127().method33696(Class7193.field27950);
                    return;
                }
                double n2 = 64.0;
                final PlayerEntity method6959 = this.field23764.world.method7137(Class5788.field23777, method6958.getX(), method6958.getY(), method6958.getZ());
                if (method6959 != null) {
                    n2 = method6958.distanceSq(method6959.method1934(), true) / 512.0;
                }
                if (method6959 != null) {
                    if (!method6959.field3025.field27301) {
                        if (this.field23764.method2633().nextInt(MathHelper.abs((int)n2) + 2) == 0 || this.field23764.method2633().nextInt(n + 2) == 0) {
                            this.method17261(method6959);
                            return;
                        }
                    }
                }
            }
        }
        if (this.field23778 == null || this.field23778.method35215()) {
            int method6960;
            final int n3 = method6960 = this.field23764.method5119();
            if (this.field23764.method2633().nextInt(8) == 0) {
                this.field23780 = !this.field23780;
                method6960 = n3 + 6;
            }
            if (!this.field23780) {
                --method6960;
            }
            else {
                ++method6960;
            }
            int n4;
            if (this.field23764.method5128() != null && this.field23764.method5128().method29250() >= 0) {
                n4 = method6960 % 12;
                if (n4 < 0) {
                    n4 += 12;
                }
            }
            else {
                n4 = (method6960 - 12 & 0x7) + 12;
            }
            this.field23778 = this.field23764.method5121(n3, n4, null);
            if (this.field23778 != null) {
                this.field23778.method35214();
            }
        }
        this.method17262();
    }
    
    private void method17261(final PlayerEntity playerEntity) {
        this.field23764.method5127().method33696(Class7193.field27949);
        this.field23764.method5127().method33698(Class7193.field27949).method17259(playerEntity);
    }
    
    private void method17262() {
        if (this.field23778 != null) {
            if (!this.field23778.method35215()) {
                final Vec3d method35226 = this.field23778.method35226();
                this.field23778.method35214();
                final double field22770 = method35226.x;
                final double field22771 = method35226.z;
                double n;
                do {
                    n = method35226.y + this.field23764.method2633().nextFloat() * 20.0f;
                } while (n < method35226.y);
                this.field23779 = new Vec3d(field22770, n, field22771);
            }
        }
    }
    
    @Override
    public void method17248(final Class858 class858, final BlockPos class859, final DamageSource class860, final PlayerEntity class861) {
        if (class861 != null) {
            if (!class861.field3025.field27301) {
                this.method17261(class861);
            }
        }
    }
    
    static {
        field23777 = new Class7843().method25337(64.0);
    }
}
