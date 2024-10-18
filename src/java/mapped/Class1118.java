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
   public boolean method5368() {
      return false;
   }

   @Nullable
   @Override
   public NetworkPlayerInfo method5369() {
      return this.playerInfo;
   }

   @Override
   public boolean method5370() {
      return false;
   }

   @Override
   public ResourceLocation method5371() {
      NetworkPlayerInfo var3 = this.method5369();
      return var3 != null ? var3.method19973() : DefaultPlayerSkin.getDefaultSkin(this.getUniqueID());
   }

   @Nullable
   @Override
   public ResourceLocation method5372() {
      NetworkPlayerInfo var3 = this.method5369();
      return var3 != null ? var3.method19974() : null;
   }

   @Override
   public boolean method5373() {
      return this.method5369() != null;
   }

   @Nullable
   @Override
   public ResourceLocation method5374() {
      NetworkPlayerInfo var3 = this.method5369();
      return var3 != null ? var3.method19975() : null;
   }

   @Override
   public String method5377() {
      return DefaultPlayerSkin.getSkinType(this.getUniqueID());
   }

   @Override
   public float getFovModifier() {
      return 0.0F;
   }
}
