// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class755 extends Class754
{
    public Class755(final Class1848 class1848, final GameProfile gameProfile) {
        super(class1848, gameProfile);
        this.field2420 = 1.0f;
        this.field2421 = true;
    }
    
    @Override
    public boolean method1753(final double n) {
        double v = this.method1886().method18507() * 10.0;
        if (Double.isNaN(v)) {
            v = 1.0;
        }
        final double n2 = v * 64.0 * method1869();
        return n < n2 * n2;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        return true;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        this.field2945 = this.field2946;
        final double n = this.method1938() - this.field2392;
        final double n2 = this.method1945() - this.field2394;
        float n3 = MathHelper.method35641(n * n + n2 * n2) * 4.0f;
        if (n3 > 1.0f) {
            n3 = 1.0f;
        }
        this.field2946 += (n3 - this.field2946) * 0.4f;
        this.field2947 += this.field2946;
    }
    
    @Override
    public void method2736() {
        if (this.field2971 > 0) {
            final double n = this.method1938() + (this.field2972 - this.method1938()) / this.field2971;
            final double n2 = this.method1941() + (this.field2973 - this.method1941()) / this.field2971;
            final double n3 = this.method1945() + (this.field2974 - this.method1945()) / this.field2971;
            this.field2399 += (float)(MathHelper.method35669(this.field2975 - this.field2399) / this.field2971);
            this.field2400 += (float)((this.field2976 - this.field2400) / this.field2971);
            --this.field2971;
            this.method1656(n, n2, n3);
            this.method1655(this.field2399, this.field2400);
        }
        if (this.field2978 > 0) {
            this.field2953 += (float)(MathHelper.method35669(this.field2977 - this.field2953) / this.field2978);
            --this.field2978;
        }
        this.field3012 = this.field3013;
        this.method2709();
        float min;
        if (this.field2404 && this.method2664() > 0.0f) {
            min = Math.min(0.1f, MathHelper.method35641(Entity.method1680(this.method1935())));
        }
        else {
            min = 0.0f;
        }
        if (!this.field2404 && this.method2664() > 0.0f) {
            final float n4 = (float)Math.atan(-this.method1935().field22771 * 0.20000000298023224) * 15.0f;
        }
        this.field3013 += (min - this.field3013) * 0.4f;
        this.field2391.method6796().method15297("push");
        this.method2739();
        this.field2391.method6796().method15299();
    }
    
    @Override
    public void method2811() {
    }
    
    @Override
    public void method1494(final Class2250 class2250) {
        Class869.method5277().field4647.method3807().method3761(class2250);
    }
}
