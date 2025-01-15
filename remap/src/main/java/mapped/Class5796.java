// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class5796 extends Class5784
{
    private static String[] field23800;
    private boolean field23801;
    private Class9468 field23802;
    private Vec3d field23803;
    
    public Class5796(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public void method17247() {
        if (!this.field23801 && this.field23802 != null) {
            if (!this.field23764.world.method6958(Class2020.field11526, Class4551.field20031).withinDistance(this.field23764.method1934(), 10.0)) {
                this.field23764.method5127().method33696(Class7193.field27948);
            }
        }
        else {
            this.field23801 = false;
            this.method17267();
        }
    }
    
    @Override
    public void method17249() {
        this.field23801 = true;
        this.field23802 = null;
        this.field23803 = null;
    }
    
    private void method17267() {
        final int method5119 = this.field23764.method5119();
        final Vec3d method5120 = this.field23764.method5125(1.0f);
        final int method5121 = this.field23764.method5120(-method5120.x * 40.0, 105.0, -method5120.z * 40.0);
        int n;
        if (this.field23764.method5128() != null && this.field23764.method5128().method29250() > 0) {
            n = method5121 % 12;
            if (n < 0) {
                n += 12;
            }
        }
        else {
            n = (method5121 - 12 & 0x7) + 12;
        }
        this.field23802 = this.field23764.method5121(method5119, n, null);
        this.method17268();
    }
    
    private void method17268() {
        if (this.field23802 != null) {
            this.field23802.method35214();
            if (!this.field23802.method35215()) {
                final Vec3d method35226 = this.field23802.method35226();
                this.field23802.method35214();
                double n;
                do {
                    n = method35226.y + this.field23764.method2633().nextFloat() * 20.0f;
                } while (n < method35226.y);
                this.field23803 = new Vec3d(method35226.x, n, method35226.z);
            }
        }
    }
    
    @Nullable
    @Override
    public Vec3d method17254() {
        return this.field23803;
    }
    
    @Override
    public Class7193<Class5796> method17253() {
        return Class7193.field27952;
    }
}
