// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class5790 extends Class5784
{
    private static String[] field23784;
    private static final Class7843 field23785;
    private Class9468 field23786;
    private Vec3d field23787;
    
    public Class5790(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public Class7193<Class5790> method17253() {
        return Class7193.field27950;
    }
    
    @Override
    public void method17249() {
        this.field23786 = null;
        this.field23787 = null;
    }
    
    @Override
    public void method17247() {
        final double n = (this.field23787 != null) ? this.field23787.squareDistanceTo(this.field23764.getPosX(), this.field23764.getPosY(), this.field23764.getPosZ()) : 0.0;
        if (n >= 100.0) {
            if (n <= 22500.0) {
                if (!this.field23764.field2405) {
                    if (!this.field23764.field2406) {
                        return;
                    }
                }
            }
        }
        this.method17263();
    }
    
    @Nullable
    @Override
    public Vec3d method17254() {
        return this.field23787;
    }
    
    private void method17263() {
        if (this.field23786 == null || this.field23786.method35215()) {
            final int method5119 = this.field23764.method5119();
            final BlockPos method5120 = this.field23764.field2391.method6958(Class2020.field11526, Class4551.field20031);
            final Class512 method5121 = this.field23764.field2391.method7137(Class5790.field23785, method5120.getX(), method5120.getY(), method5120.getZ());
            int n;
            if (method5121 == null) {
                n = this.field23764.method5120(40.0, method5120.getY(), 0.0);
            }
            else {
                final Vec3d method5122 = new Vec3d(method5121.getPosX(), 0.0, method5121.getPosZ()).normalize();
                n = this.field23764.method5120(-method5122.x * 40.0, 105.0, -method5122.z * 40.0);
            }
            this.field23786 = this.field23764.method5121(method5119, n, new Class6772(method5120.getX(), method5120.getY(), method5120.getZ()));
            if (this.field23786 != null) {
                this.field23786.method35214();
            }
        }
        this.method17264();
        if (this.field23786 != null) {
            if (this.field23786.method35215()) {
                this.field23764.method5127().method33696(Class7193.field27951);
            }
        }
    }
    
    private void method17264() {
        if (this.field23786 != null) {
            if (!this.field23786.method35215()) {
                final Vec3d method35226 = this.field23786.method35226();
                this.field23786.method35214();
                final double field22770 = method35226.x;
                final double field22771 = method35226.z;
                double n;
                do {
                    n = method35226.y + this.field23764.method2633().nextFloat() * 20.0f;
                } while (n < method35226.y);
                this.field23787 = new Vec3d(field22770, n, field22771);
            }
        }
    }
    
    static {
        field23785 = new Class7843().method25337(128.0);
    }
}
