package net.minecraft.client.entity.player;

import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import java.io.File;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.renderer.texture.DownloadingTexture;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.passive.ShoulderRidingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraft.world.GameType;
import net.optifine.Config;
import net.optifine.player.CapeUtils;
import net.optifine.player.PlayerConfigurations;
import net.optifine.reflect.Reflector;

public abstract class AbstractClientPlayerEntity extends PlayerEntity
{
    private NetworkPlayerInfo playerInfo;
    public float rotateElytraX;
    public float rotateElytraY;
    public float rotateElytraZ;
    public final ClientWorld worldClient;
    private ResourceLocation locationOfCape = null;
    private long reloadCapeTimeMs = 0L;
    private boolean elytraOfCape = false;
    private String nameClear = null;
    public ShoulderRidingEntity entityShoulderLeft;
    public ShoulderRidingEntity entityShoulderRight;
    public float capeRotateX;
    public float capeRotateY;
    public float capeRotateZ;
    private static final ResourceLocation TEXTURE_ELYTRA = new ResourceLocation("textures/entity/elytra.png");

    public AbstractClientPlayerEntity(ClientWorld p_i144_1_, GameProfile p_i144_2_)
    {
        super(p_i144_1_, p_i144_2_);
        this.worldClient = p_i144_1_;
        this.nameClear = p_i144_2_.getName();

        if (this.nameClear != null && !this.nameClear.isEmpty())
        {
            this.nameClear = StringUtils.stripControlCodes(this.nameClear);
        }

        CapeUtils.downloadCape(this);
        PlayerConfigurations.getPlayerConfiguration(this);
    }

    public boolean isSpectator()
    {
        NetworkPlayerInfo networkplayerinfo = Minecraft.getInstance().getConnection().getPlayerInfo(this.getGameProfile().getId());
        return networkplayerinfo != null && networkplayerinfo.getGameType() == GameType.SPECTATOR;
    }

    public boolean isCreative()
    {
        NetworkPlayerInfo networkplayerinfo = Minecraft.getInstance().getConnection().getPlayerInfo(this.getGameProfile().getId());
        return networkplayerinfo != null && networkplayerinfo.getGameType() == GameType.CREATIVE;
    }

    public boolean hasPlayerInfo()
    {
        return this.getPlayerInfo() != null;
    }

    @Nullable
    protected NetworkPlayerInfo getPlayerInfo()
    {
        if (this.playerInfo == null)
        {
            this.playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(this.getUniqueID());
        }

        return this.playerInfo;
    }

    public boolean hasSkin()
    {
        NetworkPlayerInfo networkplayerinfo = this.getPlayerInfo();
        return networkplayerinfo != null && networkplayerinfo.hasLocationSkin();
    }

    public ResourceLocation getLocationSkin()
    {
        NetworkPlayerInfo networkplayerinfo = this.getPlayerInfo();
        return networkplayerinfo == null ? DefaultPlayerSkin.getDefaultSkin(this.getUniqueID()) : networkplayerinfo.getLocationSkin();
    }

    @Nullable
    public ResourceLocation getLocationCape()
    {
        if (!Config.isShowCapes())
        {
            return null;
        }
        else
        {
            if (this.reloadCapeTimeMs != 0L && System.currentTimeMillis() > this.reloadCapeTimeMs)
            {
                CapeUtils.reloadCape(this);
                this.reloadCapeTimeMs = 0L;
            }

            if (this.locationOfCape != null)
            {
                return this.locationOfCape;
            }
            else
            {
                NetworkPlayerInfo networkplayerinfo = this.getPlayerInfo();
                return networkplayerinfo == null ? null : networkplayerinfo.getLocationCape();
            }
        }
    }

    public boolean isPlayerInfoSet()
    {
        return this.getPlayerInfo() != null;
    }

    @Nullable
    public ResourceLocation getLocationElytra()
    {
        NetworkPlayerInfo networkplayerinfo = this.getPlayerInfo();
        return networkplayerinfo == null ? null : networkplayerinfo.getLocationElytra();
    }

    public static DownloadingTexture getDownloadImageSkin(ResourceLocation resourceLocationIn, String username)
    {
        TextureManager texturemanager = Minecraft.getInstance().getTextureManager();
        Texture texture = texturemanager.getTexture(resourceLocationIn);

        if (texture == null)
        {
            texture = new DownloadingTexture((File)null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", StringUtils.stripControlCodes(username)), DefaultPlayerSkin.getDefaultSkin(getOfflineUUID(username)), true, (Runnable)null);
            texturemanager.loadTexture(resourceLocationIn, texture);
        }

        return (DownloadingTexture)texture;
    }

    public static ResourceLocation getLocationSkin(String username)
    {
        return new ResourceLocation("skins/" + Hashing.sha1().hashUnencodedChars(StringUtils.stripControlCodes(username)));
    }

    public String getSkinType()
    {
        NetworkPlayerInfo networkplayerinfo = this.getPlayerInfo();
        return networkplayerinfo == null ? DefaultPlayerSkin.getSkinType(this.getUniqueID()) : networkplayerinfo.getSkinType();
    }

    public float getFovModifier()
    {
        float f = 1.0F;

        if (this.abilities.isFlying)
        {
            f *= 1.1F;
        }

        IAttributeInstance iattributeinstance = this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED);
        f = (float)((double)f * ((iattributeinstance.getValue() / (double)this.abilities.getWalkSpeed() + 1.0D) / 2.0D));

        if (this.abilities.getWalkSpeed() == 0.0F || Float.isNaN(f) || Float.isInfinite(f))
        {
            f = 1.0F;
        }

        if (this.isHandActive() && this.getActiveItemStack().getItem() instanceof BowItem)
        {
            int i = this.getItemInUseMaxCount();
            float f1 = (float)i / 20.0F;

            if (f1 > 1.0F)
            {
                f1 = 1.0F;
            }
            else
            {
                f1 = f1 * f1;
            }

            f *= 1.0F - f1 * 0.15F;
        }

        return Reflector.ForgeHooksClient_getOffsetFOV.exists() ? Reflector.callFloat(Reflector.ForgeHooksClient_getOffsetFOV, this, f) : f;
    }

    public String getNameClear()
    {
        return this.nameClear;
    }

    public ResourceLocation getLocationOfCape()
    {
        return this.locationOfCape;
    }

    public void setLocationOfCape(ResourceLocation p_setLocationOfCape_1_)
    {
        this.locationOfCape = p_setLocationOfCape_1_;
    }

    public boolean hasElytraCape()
    {
        ResourceLocation resourcelocation = this.getLocationCape();

        if (resourcelocation == null)
        {
            return false;
        }
        else
        {
            return resourcelocation == this.locationOfCape ? this.elytraOfCape : true;
        }
    }

    public void setElytraOfCape(boolean p_setElytraOfCape_1_)
    {
        this.elytraOfCape = p_setElytraOfCape_1_;
    }

    public boolean isElytraOfCape()
    {
        return this.elytraOfCape;
    }

    public long getReloadCapeTimeMs()
    {
        return this.reloadCapeTimeMs;
    }

    public void setReloadCapeTimeMs(long p_setReloadCapeTimeMs_1_)
    {
        this.reloadCapeTimeMs = p_setReloadCapeTimeMs_1_;
    }
}
