// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.hash.Hashing;

import javax.annotation.Nullable;

import com.mentalfrostbyte.Client;
import com.mojang.authlib.GameProfile;

public abstract class Class754 extends PlayerEntity
{
    private Class9081 field4056;
    public float field4057;
    public float field4058;
    public float field4059;
    public final ClientWorld field4060;
    private ResourceLocation field4061;
    private long field4062;
    private boolean field4063;
    private String field4064;
    public Class795 field4065;
    public Class795 field4066;
    private static final ResourceLocation field4067;
    
    public Class754(final ClientWorld field4060, final GameProfile gameProfile) {
        super(field4060, gameProfile);
        this.field4061 = null;
        this.field4062 = 0L;
        this.field4063 = false;
        this.field4064 = null;
        this.field4060 = field4060;
        this.field4064 = gameProfile.getName();
        if (this.field4064 != null) {
            if (!this.field4064.isEmpty()) {
                this.field4064 = Class8272.method27499(this.field4064);
            }
        }
        Class5759.method17110(this);
        Class7569.method23790(this);
    }
    
    @Override
    public boolean isSpectator() {
        final Class9081 method17371 = Minecraft.method5277().method5269().method17371(this.method2844().getId());
        return method17371 != null && method17371.method32720() == Class101.field301;
    }
    
    @Override
    public boolean method2889() {
        final Class9081 method17371 = Minecraft.method5277().method5269().method17371(this.method2844().getId());
        return method17371 != null && method17371.method32720() == Class101.field299;
    }
    
    public boolean method4094() {
        return this.method4095() != null;
    }
    
    @Nullable
    public Class9081 method4095() {
        if (this.field4056 == null) {
            this.field4056 = Minecraft.method5277().method5269().method17371(this.method1865());
        }
        return this.field4056;
    }
    
    public boolean method4096() {
        final Class9081 method4095 = this.method4095();
        return method4095 != null && method4095.method32724();
    }
    
    public ResourceLocation method4097() {
        final Class9081 method4095 = this.method4095();
        return (method4095 != null) ? method4095.method32726() : Class7634.method24004(this.method1865());
    }
    
    @Nullable
    public ResourceLocation method4098() {
        if (!Config.method28948()) {
            return null;
        }
        if (this.field4062 != 0L) {
            if (System.currentTimeMillis() > this.field4062) {
                Class5759.method17113(this);
                this.field4062 = 0L;
            }
        }
        if (this.field4061 == null) {
            final Class9081 method4095 = this.method4095();
            return (method4095 != null) ? method4095.method32727() : null;
        }
        return this.field4061;
    }
    
    public boolean method4099() {
        return this.method4095() != null;
    }
    
    @Nullable
    public ResourceLocation method4100() {
        final Class9081 method4095 = this.method4095();
        return (method4095 != null) ? method4095.method32728() : null;
    }
    
    public static Class1768 method4101(final ResourceLocation class1932, final String s) {
        final Class1663 method5290 = Minecraft.method5277().method5290();
        Class1666 method5291 = method5290.method5853(class1932);
        if (method5291 == null) {
            method5291 = new Class1768(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", Class8272.method27499(s)), Class7634.method24004(PlayerEntity.method2894(s)), true, null);
            method5290.method5851(class1932, method5291);
        }
        return (Class1768)method5291;
    }
    
    public static ResourceLocation method4102(final String s) {
        return new ResourceLocation("skins/" + Hashing.sha1().hashUnencodedChars((CharSequence)Class8272.method27499(s)));
    }
    
    public String method4103() {
        final Class9081 method4095 = this.method4095();
        return (method4095 != null) ? method4095.method32725() : Class7634.method24005(this.method1865());
    }
    
    public float method4104() {
        float n = 1.0f;
        if (this.field3025.field27302) {
            n *= 1.1f;
        }
        float f = (float)(n * ((this.method2710(Class8107.field33408).method23950() / this.field3025.method21427() + 1.0) / 2.0));
        Label_0094: {
            if (this.field3025.method21427() != 0.0f) {
                if (!Float.isNaN(f)) {
                    if (!Float.isInfinite(f)) {
                        break Label_0094;
                    }
                }
            }
            f = 1.0f;
        }
        if (this.method2756()) {
            if (this.method2766().getItem() instanceof Class4087) {
                final float n2 = this.method2768() / 20.0f;
                float n3;
                if (n2 <= 1.0f) {
                    n3 = n2 * n2;
                }
                else {
                    n3 = 1.0f;
                }
                f *= 1.0f - n3 * 0.15f;
            }
        }
        final Class5735 class5735 = new Class5735(Class9570.field41295.method22605() ? Class9570.method35815(Class9570.field41295, this, f) : f);
        Client.getInstance().method35188().method21097(class5735);
        return class5735.field23300;
    }
    
    public String method4105() {
        return this.field4064;
    }
    
    public ResourceLocation method4106() {
        return this.field4061;
    }
    
    public void method4107(final ResourceLocation field4061) {
        this.field4061 = field4061;
    }
    
    public boolean method4108() {
        final ResourceLocation method4098 = this.method4098();
        return method4098 != null && (method4098 != this.field4061 || this.field4063);
    }
    
    public void method4109(final boolean field4063) {
        this.field4063 = field4063;
    }
    
    public boolean method4110() {
        return this.field4063;
    }
    
    public long method4111() {
        return this.field4062;
    }
    
    public void method4112(final long field4062) {
        this.field4062 = field4062;
    }
    
    static {
        field4067 = new ResourceLocation("textures/entity/elytra.png");
    }
}
