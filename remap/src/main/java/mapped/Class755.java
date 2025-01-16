// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

public class Class755 extends Class754
{
    public Class755(final Class1848 class1848, final GameProfile gameProfile) {
        super(class1848, gameProfile);
        this.stepHeight = 1.0f;
        this.noClip = true;
    }
    
    @Override
    public boolean method1753(final double n) {
        double v = this.getBoundingBox().method18507() * 10.0;
        if (Double.isNaN(v)) {
            v = 1.0;
        }
        final double n2 = v * 64.0 * method1869();
        return n < n2 * n2;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        return true;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        this.field2945 = this.field2946;
        final double n = this.getPosX() - this.prevPosX;
        final double n2 = this.getPosZ() - this.prevPosZ;
        float n3 = MathHelper.sqrt(n * n + n2 * n2) * 4.0f;
        if (n3 > 1.0f) {
            n3 = 1.0f;
        }
        this.field2946 += (n3 - this.field2946) * 0.4f;
        this.field2947 += this.field2946;
    }
    
    @Override
    public void method2736() {
        if (this.field2971 > 0) {
            final double n = this.getPosX() + (this.field2972 - this.getPosX()) / this.field2971;
            final double n2 = this.getPosY() + (this.field2973 - this.getPosY()) / this.field2971;
            final double n3 = this.getPosZ() + (this.field2974 - this.getPosZ()) / this.field2971;
            this.rotationYaw += (float)(MathHelper.method35669(this.field2975 - this.rotationYaw) / this.field2971);
            this.rotationPitch += (float)((this.field2976 - this.rotationPitch) / this.field2971);
            --this.field2971;
            this.setPosition(n, n2, n3);
            this.method1655(this.rotationYaw, this.rotationPitch);
        }
        if (this.field2978 > 0) {
            this.field2953 += (float)(MathHelper.method35669(this.field2977 - this.field2953) / this.field2978);
            --this.field2978;
        }
        this.field3012 = this.field3013;
        this.method2709();
        float min;
        if (this.onGround && this.method2664() > 0.0f) {
            min = Math.min(0.1f, MathHelper.sqrt(Entity.horizontalMag(this.getMotion())));
        }
        else {
            min = 0.0f;
        }
        if (!this.onGround && this.method2664() > 0.0f) {
            final float n4 = (float)Math.atan(-this.getMotion().y * 0.20000000298023224) * 15.0f;
        }
        this.field3013 += (min - this.field3013) * 0.4f;
        this.world.method6796().startSection("push");
        this.method2739();
        this.world.method6796().endSection();
    }
    
    @Override
    public void method2811() {
    }
    
    @Override
    public void sendMessage(final ITextComponent class2250) {
        Class869.method5277().field4647.method3807().method3761(class2250);
    }
}
