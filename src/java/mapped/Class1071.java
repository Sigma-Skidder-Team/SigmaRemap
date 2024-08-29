package mapped;

public interface Class1071 {
   boolean method4982();

   void method4981(Vector3d var1);

   float method4980();

   default boolean method4988(Class1006 var1, Class6500 var2, Vector3d var3) {
      if (var1.method3066()) {
         Entity var6 = !var1.method3408().isEmpty() ? var1.method3408().get(0) : null;
         if (var1.isBeingRidden() && var1.method4277() && var6 instanceof PlayerEntity) {
            var1.rotationYaw = var6.rotationYaw;
            var1.prevRotationYaw = var1.rotationYaw;
            var1.rotationPitch = var6.rotationPitch * 0.5F;
            var1.method3214(var1.rotationYaw, var1.rotationPitch);
            var1.field4965 = var1.rotationYaw;
            var1.field4967 = var1.rotationYaw;
            var1.stepHeight = 1.0F;
            var1.field4969 = var1.method2918() * 0.1F;
            if (var2.field28463 && var2.field28464++ > var2.field28465) {
               var2.field28463 = false;
            }

            if (!var1.method3418()) {
               var1.method3108(var1, false);
               var1.method3434(Vector3d.ZERO);
            } else {
               float var7 = this.method4980();
               if (var2.field28463) {
                  var7 += var7 * 1.15F * MathHelper.sin((float)var2.field28464 / (float)var2.field28465 * (float) Math.PI);
               }

               var1.method3113(var7);
               this.method4981(new Vector3d(0.0, 0.0, 1.0));
               var1.field4985 = 0;
            }

            return true;
         } else {
            var1.stepHeight = 0.5F;
            var1.field4969 = 0.02F;
            this.method4981(var3);
            return false;
         }
      } else {
         return false;
      }
   }
}
