package mapped;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.UUID;

public class Class1116 extends AbstractClientPlayerEntity {
   public Class1116(ClientWorld var1, GameProfile var2) {
      super(var1, var2);
      this.stepHeight = 1.0F;
      this.noClip = true;
   }

   @Override
   public boolean isInRangeToRenderDist(double var1) {
      double var5 = this.getBoundingBox().getAverageEdgeLength() * 10.0;
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * getRenderDistanceWeight();
      return var1 < var5 * var5;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      this.method3108(this, false);
   }

   @Override
   public void livingEntity() {
      if (this.newPosRotationIncrements > 0) {
         double var4 = this.getPosX() + (this.interpTargetX - this.getPosX()) / (double)this.newPosRotationIncrements;
         double var6 = this.getPosY() + (this.interpTargetY - this.getPosY()) / (double)this.newPosRotationIncrements;
         double var8 = this.getPosZ() + (this.interpTargetZ - this.getPosZ()) / (double)this.newPosRotationIncrements;
         this.rotationYaw = (float)((double)this.rotationYaw + MathHelper.wrapDegrees(this.interpTargetYaw - (double)this.rotationYaw) / (double)this.newPosRotationIncrements);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.interpTargetPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
         this.newPosRotationIncrements--;
         this.setPosition(var4, var6, var8);
         this.setRotation(this.rotationYaw, this.rotationPitch);
      }

      if (this.interpTicksHead > 0) {
         this.rotationYawHead = (float)((double)this.rotationYawHead + MathHelper.wrapDegrees(this.interpTargetHeadYaw - (double)this.rotationYawHead) / (double)this.interpTicksHead);
         this.interpTicksHead--;
      }

      this.field4908 = this.field4909;
      this.updateArmSwingProgress();
      float var3;
      if (this.onGround && !this.getShouldBeDead()) {
         var3 = Math.min(0.1F, MathHelper.sqrt(horizontalMag(this.getMotion())));
      } else {
         var3 = 0.0F;
      }

      if (!this.onGround && !this.getShouldBeDead()) {
         float var11 = (float)Math.atan(-this.getMotion().y * 0.2F) * 15.0F;
      } else {
         float var10 = 0.0F;
      }

      this.field4909 = this.field4909 + (var3 - this.field4909) * 0.4F;
      this.world.getProfiler().startSection("push");
      this.collideWithNearbyEntities();
      this.world.getProfiler().endSection();
   }

   @Override
   public void method2857() {
   }

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
      Minecraft var5 = Minecraft.getInstance();
      if (!var5.cannotSendChatMessages(var2)) {
         var5.ingameGUI.getChatGUI().sendChatMessage(var1);
      }
   }
}
