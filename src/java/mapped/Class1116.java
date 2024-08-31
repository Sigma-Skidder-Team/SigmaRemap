package mapped;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
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
   public boolean method2741(Class8654 var1, float var2) {
      return true;
   }

   @Override
   public void tick() {
      super.tick();
      this.method3108(this, false);
   }

   @Override
   public void method2871() {
      if (this.field4985 > 0) {
         double var4 = this.getPosX() + (this.field4986 - this.getPosX()) / (double)this.field4985;
         double var6 = this.getPosY() + (this.field4987 - this.getPosY()) / (double)this.field4985;
         double var8 = this.getPosZ() + (this.field4988 - this.getPosZ()) / (double)this.field4985;
         this.rotationYaw = (float)((double)this.rotationYaw + MathHelper.method37793(this.field4989 - (double)this.rotationYaw) / (double)this.field4985);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.field4990 - (double)this.rotationPitch) / (double)this.field4985);
         this.field4985--;
         this.setPosition(var4, var6, var8);
         this.setRotation(this.rotationYaw, this.rotationPitch);
      }

      if (this.field4992 > 0) {
         this.field4967 = (float)((double)this.field4967 + MathHelper.method37793(this.field4991 - (double)this.field4967) / (double)this.field4992);
         this.field4992--;
      }

      this.field4908 = this.field4909;
      this.method3084();
      float var3;
      if (this.onGround && !this.getShouldBeDead()) {
         var3 = Math.min(0.1F, MathHelper.method37766(method3234(this.method3433())));
      } else {
         var3 = 0.0F;
      }

      if (!this.onGround && !this.getShouldBeDead()) {
         float var11 = (float)Math.atan(-this.method3433().y * 0.2F) * 15.0F;
      } else {
         float var10 = 0.0F;
      }

      this.field4909 = this.field4909 + (var3 - this.field4909) * 0.4F;
      this.world.getProfiler().startSection("push");
      this.method3126();
      this.world.getProfiler().endSection();
   }

   @Override
   public void method2857() {
   }

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
      Minecraft var5 = Minecraft.getInstance();
      if (!var5.cannotSendChatMessages(var2)) {
         var5.ingameGUI.getChatGUI().method5930(var1);
      }
   }
}
