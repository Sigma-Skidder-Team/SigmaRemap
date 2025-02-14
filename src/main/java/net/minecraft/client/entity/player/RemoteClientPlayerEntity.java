package net.minecraft.client.entity.player;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.Minecraft;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.util.UUID;

public class RemoteClientPlayerEntity extends AbstractClientPlayerEntity {
   public RemoteClientPlayerEntity(ClientWorld world, GameProfile var2) {
      super(world, var2);
      this.stepHeight = 1.0F;
      this.noClip = true;
   }

   @Override
   public boolean isInRangeToRenderDist(double distance) {
      double d0 = this.getBoundingBox().getAverageEdgeLength() * 10.0;
      if (Double.isNaN(d0)) {
         d0 = 1.0D;
      }

      d0 = d0 * 64.0D * getRenderDistanceWeight();
      return distance < d0 * d0;
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      this.func_233629_a_(this, false);
   }

   @Override
   public void livingTick() {
      if (this.newPosRotationIncrements > 0) {
         double d0 = this.getPosX() + (this.interpTargetX - this.getPosX()) / (double)this.newPosRotationIncrements;
         double d1 = this.getPosY() + (this.interpTargetY - this.getPosY()) / (double)this.newPosRotationIncrements;
         double d2 = this.getPosZ() + (this.interpTargetZ - this.getPosZ()) / (double)this.newPosRotationIncrements;
         this.rotationYaw = (float)((double)this.rotationYaw + MathHelper.wrapDegrees(this.interpTargetYaw - (double)this.rotationYaw) / (double)this.newPosRotationIncrements);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.interpTargetPitch - (double)this.rotationPitch) / (double)this.newPosRotationIncrements);
         this.newPosRotationIncrements--;
         this.setPosition(d0, d1, d2);
         this.setRotation(this.rotationYaw, this.rotationPitch);
      }

      if (this.interpTicksHead > 0) {
         this.rotationYawHead = (float)((double)this.rotationYawHead + MathHelper.wrapDegrees(this.interpTargetHeadYaw - (double)this.rotationYawHead) / (double)this.interpTicksHead);
         this.interpTicksHead--;
      }

      this.prevCameraYaw = this.cameraYaw;
      this.updateArmSwingProgress();
      float f1;

      if (this.onGround && !this.getShouldBeDead()) {
         f1 = Math.min(0.1F, MathHelper.sqrt(horizontalMag(this.getMotion())));
      } else {
         f1 = 0.0F;
      }

      if (!this.onGround && !this.getShouldBeDead()) {
         float f2 = (float)Math.atan(-this.getMotion().y * 0.2F) * 15.0F;
      } else {
         float f = 0.0F;
      }

      this.cameraYaw = this.cameraYaw + (f1 - this.cameraYaw) * 0.4F;
      this.world.getProfiler().startSection("push");
      this.collideWithNearbyEntities();
      this.world.getProfiler().endSection();
   }

   public void updatePose() {
   }

   public void sendMessage(ITextComponent component, UUID senderUUID) {
      Minecraft minecraft = Minecraft.getInstance();
      if (!minecraft.cannotSendChatMessages(senderUUID)) {
         minecraft.ingameGUI.getChatGUI().sendChatMessage(component);
      }
   }
}
