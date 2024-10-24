package mapped;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.resources.DefaultPlayerSkin;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class Class1118 extends AbstractClientPlayerEntity {
   public Class1118(ClientWorld var1, GameProfile var2) {
      super(var1, var2);
   }

   @Override
   public boolean isSpectator() {
      return false;
   }

   @Override
   public boolean isCreative() {
       return true;
   }

   @Override
   public boolean hasPlayerInfo() {
      return false;
   }

   @Nullable
   @Override
   public NetworkPlayerInfo getPlayerInfo() {
      return this.playerInfo;
   }

   @Override
   public boolean hasSkin() {
      return false;
   }

   @Override
   public ResourceLocation getLocationSkin() {
      NetworkPlayerInfo var3 = this.getPlayerInfo();
      return var3 != null ? var3.getLocationSkin() : DefaultPlayerSkin.getDefaultSkin(this.getUniqueID());
   }

   @Nullable
   @Override
   public ResourceLocation getLocationCape() {
      NetworkPlayerInfo var3 = this.getPlayerInfo();
      return var3 != null ? var3.getLocationCape() : null;
   }

   @Override
   public boolean isPlayerInfoSet() {
      return this.getPlayerInfo() != null;
   }

   @Nullable
   @Override
   public ResourceLocation getLocationElytra() {
      NetworkPlayerInfo var3 = this.getPlayerInfo();
      return var3 != null ? var3.getLocationElytra() : null;
   }

   @Override
   public String getSkinType() {
      return DefaultPlayerSkin.getSkinType(this.getUniqueID());
   }

   @Override
   public float getFovModifier() {
      return 0.0F;
   }
}
