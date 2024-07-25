package remapped;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;

public class class_9745 extends AbstractClientPlayerEntity {
   public class_9745(ClientWorld var1, GameProfile var2) {
      super(var1, var2);
      this.field_41733 = 1.0F;
      this.field_41731 = true;
   }

   @Override
   public boolean method_37176(double var1) {
      double var5 = this.method_37241().method_18906() * 10.0;
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * method_37345();
      return var1 < var5 * var5;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      return true;
   }

   @Override
   public void method_37123() {
      super.method_37123();
      this.method_26418(this, false);
   }

   @Override
   public void method_26606() {
      if (this.field_29612 > 0) {
         double var4 = this.getPosX() + (this.field_29597 - this.getPosX()) / (double)this.field_29612;
         double var6 = this.method_37309() + (this.field_29609 - this.method_37309()) / (double)this.field_29612;
         double var8 = this.getPosZ() + (this.field_29650 - this.getPosZ()) / (double)this.field_29612;
         this.rotationYaw = (float)((double)this.rotationYaw + class_9299.method_42809(this.field_29604 - (double)this.rotationYaw) / (double)this.field_29612);
         this.rotationPitch = (float)((double)this.rotationPitch + (this.field_29625 - (double)this.rotationPitch) / (double)this.field_29612);
         this.field_29612--;
         this.method_37256(var4, var6, var8);
         this.method_37395(this.rotationYaw, this.rotationPitch);
      }

      if (this.field_29653 > 0) {
         this.field_29618 = (float)((double)this.field_29618 + class_9299.method_42809(this.field_29614 - (double)this.field_29618) / (double)this.field_29653);
         this.field_29653--;
      }

      this.field_3857 = this.field_3859;
      this.method_26489();
      float var3;
      if (this.onGround && !this.method_26450()) {
         var3 = Math.min(0.1F, class_9299.method_42842(method_37266(this.method_37098())));
      } else {
         var3 = 0.0F;
      }

      if (!this.onGround && !this.method_26450()) {
         float var11 = (float)Math.atan(-this.method_37098().field_7333 * 0.2F) * 15.0F;
      } else {
         float var10 = 0.0F;
      }

      this.field_3859 = this.field_3859 + (var3 - this.field_3859) * 0.4F;
      this.world.method_29599().startSection("push");
      this.method_26428();
      this.world.method_29599().endSection();
   }

   @Override
   public void method_3198() {
   }

   @Override
   public void method_26286(ITextComponent var1, UUID var2) {
      MinecraftClient var5 = MinecraftClient.getInstance();
      if (!var5.method_8526(var2)) {
         var5.field_9614.method_13991().method_18676(var1);
      }
   }
}
