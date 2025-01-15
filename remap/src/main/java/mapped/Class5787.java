// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import javax.annotation.Nullable;
import java.util.Random;

public class Class5787 extends Class5784
{
    private static String[] field23774;
    private Vec3d field23775;
    
    public Class5787(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public void method17246() {
        final Vec3d method16738 = this.field23764.method5125(1.0f).method16738();
        method16738.method16755(-0.7853982f);
        final double method16739 = this.field23764.field4535.method1938();
        final double method16740 = this.field23764.field4535.method1942(0.5);
        final double method16741 = this.field23764.field4535.method1945();
        for (int i = 0; i < 8; ++i) {
            final Random method16742 = this.field23764.method2633();
            final double n = method16739 + method16742.nextGaussian() / 2.0;
            final double n2 = method16740 + method16742.nextGaussian() / 2.0;
            final double n3 = method16741 + method16742.nextGaussian() / 2.0;
            final Vec3d method16743 = this.field23764.method1935();
            this.field23764.field2391.method6709(Class8432.field34605, n, n2, n3, -method16738.field22770 * 0.07999999821186066 + method16743.field22770, -method16738.field22771 * 0.30000001192092896 + method16743.field22771, -method16738.field22772 * 0.07999999821186066 + method16743.field22772);
            method16738.method16755(0.19634955f);
        }
    }
    
    @Override
    public void method17247() {
        if (this.field23775 == null) {
            this.field23775 = new Vec3d(this.field23764.field2391.method6958(Class2020.field11526, Class4551.field20031));
        }
        if (this.field23775.method16747(this.field23764.method1938(), this.field23764.method1941(), this.field23764.method1945()) < 1.0) {
            this.field23764.method5127().method33698(Class7193.field27953).method17265();
            this.field23764.method5127().method33696(Class7193.field27954);
        }
    }
    
    @Override
    public float method17251() {
        return 1.5f;
    }
    
    @Override
    public float method17252() {
        final float a = MathHelper.method35641(Entity.method1680(this.field23764.method1935())) + 1.0f;
        return Math.min(a, 40.0f) / a;
    }
    
    @Override
    public void method17249() {
        this.field23775 = null;
    }
    
    @Nullable
    @Override
    public Vec3d method17254() {
        return this.field23775;
    }
    
    @Override
    public Class7193<Class5787> method17253() {
        return Class7193.field27951;
    }
}
