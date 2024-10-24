package net.minecraft.client.network.play;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Maps;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.network.play.server.SPlayerListItemPacket;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.GameType;

public class NetworkPlayerInfo {
   private final GameProfile field29003;
   private final Map<Type, ResourceLocation> field29004 = Maps.newEnumMap(Type.class);
   private GameType field29005;
   private int field29006;
   private boolean field29007;
   private String field29008;
   private ITextComponent field29009;
   private int field29010;
   private int field29011;
   private long field29012;
   private long field29013;
   private long field29014;

   public NetworkPlayerInfo(SPlayerListItemPacket.AddPlayerData var1) {
      this.field29003 = var1.getProfile();
      this.field29005 = var1.getGameMode();
      this.field29006 = var1.getPing();
      this.field29009 = var1.getDisplayName();
   }

   public GameProfile method19966() {
      return this.field29003;
   }

   @Nullable
   public GameType getGameType() {
      return this.field29005;
   }

   public void method19968(GameType var1) {
      this.field29005 = var1;
   }

   public int method19969() {
      return this.field29006;
   }

   public void method19970(int var1) {
      this.field29006 = var1;
   }

   public boolean hasLocationSkin() {
      return this.getLocationSkin() != null;
   }

   public String method19972() {
      return this.field29008 != null ? this.field29008 : DefaultPlayerSkin.getSkinType(this.field29003.getId());
   }

   public ResourceLocation getLocationSkin() {
      this.method19977();
      return (ResourceLocation)MoreObjects.firstNonNull(this.field29004.get(Type.SKIN), DefaultPlayerSkin.getDefaultSkin(this.field29003.getId()));
   }

   @Nullable
   public ResourceLocation getLocationCape() {
      this.method19977();
      return this.field29004.get(Type.CAPE);
   }

   @Nullable
   public ResourceLocation getLocationElytra() {
      this.method19977();
      return this.field29004.get(Type.ELYTRA);
   }

   @Nullable
   public ScorePlayerTeam method19976() {
      return Minecraft.getInstance().world.method6805().method20998(this.method19966().getName());
   }

   public void method19977() {
      synchronized (this) {
         if (!this.field29007) {
            this.field29007 = true;
            Minecraft.getInstance().getSkinManager().method38loadProfileTextures346(this.field29003, (var1, var2, var3) -> {
               this.field29004.put(var1, var2);
               if (var1 == Type.SKIN) {
                  this.field29008 = var3.getMetadata("model");
                  if (this.field29008 == null) {
                     this.field29008 = "default";
                  }
               }
            }, true);
         }
      }
   }

   public void method19978(ITextComponent var1) {
      this.field29009 = var1;
   }

   @Nullable
   public ITextComponent method19979() {
      return this.field29009;
   }

   public int method19980() {
      return this.field29010;
   }

   public void method19981(int var1) {
      this.field29010 = var1;
   }

   public int method19982() {
      return this.field29011;
   }

   public void method19983(int var1) {
      this.field29011 = var1;
   }

   public long method19984() {
      return this.field29012;
   }

   public void method19985(long var1) {
      this.field29012 = var1;
   }

   public long method19986() {
      return this.field29013;
   }

   public void method19987(long var1) {
      this.field29013 = var1;
   }

   public long method19988() {
      return this.field29014;
   }

   public void method19989(long var1) {
      this.field29014 = var1;
   }
}
