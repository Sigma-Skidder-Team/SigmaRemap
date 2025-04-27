// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.hash.Hashing;

import javax.annotation.Nullable;

import com.mentalfrostbyte.Client;
import com.mojang.authlib.GameProfile;

public abstract class AbstractClientPlayerEntity extends PlayerEntity {
    private NetworkPlayerInfo playerInfo;
    public float rotateElytraX;
    public float rotateElytraY;
    public float rotateElytraZ;
    public final ClientWorld worldClient;
    private ResourceLocation locationOfCape;
    private long reloadCapeTimeMs;
    private boolean elytraOfCape;
    private String nameClear;
    public ShoulderRidingEntity entityShoulderLeft;
    public ShoulderRidingEntity entityShoulderRight;
    private static final ResourceLocation TEXTURE_ELYTRA;

    public AbstractClientPlayerEntity(final ClientWorld worldClient, final GameProfile gameProfile) {
        super(worldClient, gameProfile);
        this.locationOfCape = null;
        this.reloadCapeTimeMs = 0L;
        this.elytraOfCape = false;
        this.nameClear = null;
        this.worldClient = worldClient;
        this.nameClear = gameProfile.getName();
        if (this.nameClear != null) {
            if (!this.nameClear.isEmpty()) {
                this.nameClear = Class8272.method27499(this.nameClear);
            }
        }
        CapeUtils.method17110(this);
        PlayerConfigurations.method23790(this);
    }

    @Override
    public boolean isSpectator() {
        final NetworkPlayerInfo method17371 = Minecraft.getInstance().method5269().method17371(this.method2844().getId());
        return method17371 != null && method17371.method32720() == Class101.field301;
    }

    @Override
    public boolean method2889() {
        final NetworkPlayerInfo method17371 = Minecraft.getInstance().method5269().method17371(this.method2844().getId());
        return method17371 != null && method17371.method32720() == Class101.field299;
    }

    public boolean method4094() {
        return this.method4095() != null;
    }

    @Nullable
    public NetworkPlayerInfo method4095() {
        if (this.playerInfo == null) {
            this.playerInfo = Minecraft.getInstance().method5269().method17371(this.getUniqueID());
        }
        return this.playerInfo;
    }

    public boolean method4096() {
        final NetworkPlayerInfo method4095 = this.method4095();
        return method4095 != null && method4095.method32724();
    }

    public ResourceLocation method4097() {
        final NetworkPlayerInfo method4095 = this.method4095();
        return (method4095 != null) ? method4095.method32726() : Class7634.method24004(this.getUniqueID());
    }

    @Nullable
    public ResourceLocation method4098() {
        if (!Config.method28948()) {
            return null;
        }
        if (this.reloadCapeTimeMs != 0L) {
            if (System.currentTimeMillis() > this.reloadCapeTimeMs) {
                CapeUtils.method17113(this);
                this.reloadCapeTimeMs = 0L;
            }
        }
        if (this.locationOfCape == null) {
            final NetworkPlayerInfo method4095 = this.method4095();
            return (method4095 != null) ? method4095.method32727() : null;
        }
        return this.locationOfCape;
    }

    public boolean method4099() {
        return this.method4095() != null;
    }

    @Nullable
    public ResourceLocation method4100() {
        final NetworkPlayerInfo method4095 = this.method4095();
        return (method4095 != null) ? method4095.method32728() : null;
    }

    public static Class1768 method4101(final ResourceLocation class1932, final String s) {
        final Class1663 method5290 = Minecraft.getInstance().method5290();
        Class1666 method5291 = method5290.method5853(class1932);
        if (method5291 == null) {
            method5291 = new Class1768(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", Class8272.method27499(s)), Class7634.method24004(PlayerEntity.method2894(s)), true, null);
            method5290.method5851(class1932, method5291);
        }
        return (Class1768) method5291;
    }

    public static ResourceLocation method4102(final String s) {
        return new ResourceLocation("skins/" + Hashing.sha1().hashUnencodedChars(Class8272.method27499(s)));
    }

    public String method4103() {
        final NetworkPlayerInfo method4095 = this.method4095();
        return (method4095 != null) ? method4095.method32725() : Class7634.method24005(this.getUniqueID());
    }

    public float method4104() {
        float n = 1.0f;
        if (this.field3025.field27302) {
            n *= 1.1f;
        }
        float f = (float) (n * ((this.method2710(Class8107.field33408).method23950() / this.field3025.method21427() + 1.0) / 2.0));
        Label_0094:
        {
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
                } else {
                    n3 = 1.0f;
                }
                f *= 1.0f - n3 * 0.15f;
            }
        }
        final Class5735 class5735 = new Class5735(Class9570.field41295.method22605() ? Class9570.method35815(Class9570.field41295, this, f) : f);
        Client.getInstance().getEventBus().post(class5735);
        return class5735.field23300;
    }

    public String method4105() {
        return this.nameClear;
    }

    public ResourceLocation method4106() {
        return this.locationOfCape;
    }

    public void method4107(final ResourceLocation field4061) {
        this.locationOfCape = field4061;
    }

    public boolean method4108() {
        final ResourceLocation method4098 = this.method4098();
        return method4098 != null && (method4098 != this.locationOfCape || this.elytraOfCape);
    }

    public void method4109(final boolean field4063) {
        this.elytraOfCape = field4063;
    }

    public boolean method4110() {
        return this.elytraOfCape;
    }

    public long method4111() {
        return this.reloadCapeTimeMs;
    }

    public void method4112(final long field4062) {
        this.reloadCapeTimeMs = field4062;
    }

    static {
        TEXTURE_ELYTRA = new ResourceLocation("textures/entity/elytra.png");
    }
}
