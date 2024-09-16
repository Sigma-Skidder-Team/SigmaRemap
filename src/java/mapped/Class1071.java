package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;

public interface Class1071 {
   boolean method4982();

   void method4981(Vector3d var1);

   float method4980();

   default boolean method4988(MobEntity var1, Class6500 var2, Vector3d var3) {
      if (var1.isAlive()) {
         Entity var6 = !var1.getPassengers().isEmpty() ? var1.getPassengers().get(0) : null;
         if (var1.isBeingRidden() && var1.method4277() && var6 instanceof PlayerEntity) {
            var1.rotationYaw = var6.rotationYaw;
            var1.prevRotationYaw = var1.rotationYaw;
            var1.rotationPitch = var6.rotationPitch * 0.5F;
            var1.setRotation(var1.rotationYaw, var1.rotationPitch);
            var1.renderYawOffset = var1.rotationYaw;
            var1.rotationYawHead = var1.rotationYaw;
            var1.stepHeight = 1.0F;
            var1.jumpMovementFactor = var1.getAIMoveSpeed() * 0.1F;
            if (var2.field28463 && var2.field28464++ > var2.field28465) {
               var2.field28463 = false;
            }

            if (!var1.canPassengerSteer()) {
               var1.method3108(var1, false);
               var1.setMotion(Vector3d.ZERO);
            } else {
               float var7 = this.method4980();
               if (var2.field28463) {
                  var7 += var7 * 1.15F * MathHelper.sin((float)var2.field28464 / (float)var2.field28465 * (float) Math.PI);
               }

               var1.setAIMoveSpeed(var7);
               this.method4981(new Vector3d(0.0, 0.0, 1.0));
               var1.newPosRotationIncrements = 0;
            }

            return true;
         } else {
            var1.stepHeight = 0.5F;
            var1.jumpMovementFactor = 0.02F;
            this.method4981(var3);
            return false;
         }
      } else {
         return false;
      }
   }
}
