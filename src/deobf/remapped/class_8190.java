package remapped;

public interface class_8190 {
   boolean method_37518();

   void method_37519(class_1343 var1);

   float method_37516();

   default boolean method_37517(class_5886 var1, class_686 var2, class_1343 var3) {
      if (var1.isAlive()) {
         Entity var6 = !var1.method_37114().isEmpty() ? var1.method_37114().get(0) : null;
         if (var1.method_37151() && var1.method_26863() && var6 instanceof class_704) {
            var1.rotationYaw = var6.rotationYaw;
            var1.prevRotationYaw = var1.rotationYaw;
            var1.rotationPitch = var6.rotationPitch * 0.5F;
            var1.method_37395(var1.rotationYaw, var1.rotationPitch);
            var1.field_29605 = var1.rotationYaw;
            var1.field_29618 = var1.rotationYaw;
            var1.field_41733 = 1.0F;
            var1.field_29674 = var1.method_26423() * 0.1F;
            if (var2.field_3773 && var2.field_3774++ > var2.field_3776) {
               var2.field_3773 = false;
            }

            if (!var1.canPassengerSteer()) {
               var1.method_26418(var1, false);
               var1.method_37215(class_1343.field_7335);
            } else {
               float var7 = this.method_37516();
               if (var2.field_3773) {
                  var7 += var7 * 1.15F * class_9299.method_42818((float)var2.field_3774 / (float)var2.field_3776 * (float) Math.PI);
               }

               var1.method_26461(var7);
               this.method_37519(new class_1343(0.0, 0.0, 1.0));
               var1.field_29612 = 0;
            }

            return true;
         } else {
            var1.field_41733 = 0.5F;
            var1.field_29674 = 0.02F;
            this.method_37519(var3);
            return false;
         }
      } else {
         return false;
      }
   }
}
