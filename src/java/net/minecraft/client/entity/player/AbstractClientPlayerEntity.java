package net.minecraft.client.entity.player;

import com.google.common.hash.Hashing;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.impl.EventFOV;
import com.mojang.authlib.GameProfile;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.renderer.texture.Texture;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.ShoulderRidingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;
import net.minecraft.world.GameType;
import net.optifine.Config;

import javax.annotation.Nullable;
import java.io.File;

public abstract class AbstractClientPlayerEntity extends PlayerEntity {
   public NetworkPlayerInfo playerInfo;
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

   public AbstractClientPlayerEntity(ClientWorld var1, GameProfile var2) {
      super(var1, var1.method6880(), var1.method6881(), var2);
      this.worldClient = var1;
      this.nameClear = var2.getName();
      if (this.nameClear != null && !this.nameClear.isEmpty()) {
         this.nameClear = StringUtils.stripControlCodes(this.nameClear);
      }

      Class7749.method25668(this);
   }

   public ResourceLocation getLocationOfCape() {
      return this.locationOfCape;
   }

   public void setLocationOfCape(ResourceLocation p_setLocationOfCape_1_) {
      this.locationOfCape = p_setLocationOfCape_1_;
   }

   @Override
   public boolean isSpectator() {
      NetworkPlayerInfo var3 = Minecraft.getInstance().getConnection().method15792(this.getGameProfile().getId());
      return var3 != null && var3.method19967() == GameType.SPECTATOR;
   }

   @Override
   public boolean isCreative() {
      NetworkPlayerInfo var3 = Minecraft.getInstance().getConnection().method15792(this.getGameProfile().getId());
      return var3 != null && var3.method19967() == GameType.CREATIVE;
   }

   public boolean method5368() {
      return this.method5369() != null;
   }

   @Nullable
   public NetworkPlayerInfo method5369() {
      if (this.playerInfo == null) {
         this.playerInfo = Minecraft.getInstance().getConnection().method15792(this.getUniqueID());
      }

      return this.playerInfo;
   }

   public boolean method5370() {
      NetworkPlayerInfo var3 = this.method5369();
      return var3 != null && var3.method19971();
   }

   public ResourceLocation method5371() {
      NetworkPlayerInfo var3 = this.method5369();
      return var3 != null ? var3.method19973() : DefaultPlayerSkin.getDefaultSkin(this.getUniqueID());
   }

   @Nullable
   public ResourceLocation method5372() {
      if (Config.method26914()) {
         if (this.reloadCapeTimeMs != 0L && System.currentTimeMillis() > this.reloadCapeTimeMs) {
            Class8156.method28294(this);
            this.reloadCapeTimeMs = 0L;
         }

         if (this.locationOfCape == null) {
            NetworkPlayerInfo var3 = this.method5369();
            return var3 != null ? var3.method19974() : null;
         } else {
            return this.locationOfCape;
         }
      } else {
         return null;
      }
   }

   public boolean method5373() {
      return this.method5369() != null;
   }

   @Nullable
   public ResourceLocation method5374() {
      NetworkPlayerInfo var3 = this.method5369();
      return var3 != null ? var3.method19975() : null;
   }

   public static DownloadingTexture method5375(ResourceLocation var0, String var1) {
      TextureManager var4 = Minecraft.getInstance().getTextureManager();
      Object var5 = var4.getTexture(var0);
      if (var5 == null) {
         var5 = new DownloadingTexture(
               (File) null,
               String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", StringUtils.stripControlCodes(var1)),
               DefaultPlayerSkin.getDefaultSkin(method2961(var1)),
               true,
               (Runnable) null);
         var4.loadTexture(var0, (Texture) var5);
      }

      return (DownloadingTexture) var5;
   }

   public static ResourceLocation method5376(String var0) {
      return new ResourceLocation("skins/" + Hashing.sha1().hashUnencodedChars(StringUtils.stripControlCodes(var0)));
   }

   public String method5377() {
      NetworkPlayerInfo var3 = this.method5369();
      return var3 != null ? var3.method19972() : DefaultPlayerSkin.getSkinType(this.getUniqueID());
   }

   public float getFovModifier() {
      float f = 1.0F;

      if (this.abilities.isFlying) {
         f *= 1.1F;
      }

      f = (float) ((double) f
            * ((this.getAttributeValue(Attributes.MOVEMENT_SPEED) / (double) this.abilities.getWalkSpeed() + 1.0)
                  / 2.0));

      if (this.abilities.getWalkSpeed() == 0.0F || Float.isNaN(f) || Float.isInfinite(f)) {
         f = 1.0F;
      }

      if (this.isHandActive() && this.getActiveItemStack().getItem() instanceof BowItem) {
         float f1 = (float) this.getItemInUseMaxCount() / 20.0F;
         if (!(f1 > 1.0F)) {
            f1 *= f1;
         } else {
            f1 = 1.0F;
         }

         f *= 1.0F - f1 * 0.15F;
      }

      float fov = Reflector.ForgeHooksClient_getOffsetFOV.exists()
            ? Reflector.callFloat(Reflector.ForgeHooksClient_getOffsetFOV, this, f)
            : f;
      EventFOV eventSomething = new EventFOV(fov);
      Client.getInstance().eventManager.call(eventSomething);
      return eventSomething.fovModifier;
   }

   public String method5379() {
      return this.nameClear;
   }

   public ResourceLocation method5380() {
      return this.locationOfCape;
   }

   public void method5381(ResourceLocation var1) {
      this.locationOfCape = var1;
   }

   public boolean method5382() {
      ResourceLocation var3 = this.method5372();
      if (var3 != null) {
         return var3 != this.locationOfCape ? true : this.elytraOfCape;
      } else {
         return false;
      }
   }

   public void method5383(boolean var1) {
      this.elytraOfCape = var1;
   }

   public boolean method5384() {
      return this.elytraOfCape;
   }

   public long method5385() {
      return this.reloadCapeTimeMs;
   }

   public void method5386(long var1) {
      this.reloadCapeTimeMs = var1;
   }
}
