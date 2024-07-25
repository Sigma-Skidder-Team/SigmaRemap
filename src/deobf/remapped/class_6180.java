package remapped;

public final class class_6180 implements class_3825 {
   private static String[] field_31593;
   private double field_31594;
   private double field_31595;
   private long field_31592;

   @Override
   public float method_17802(ItemStack var1, ClientWorld var2, class_5834 var3) {
      Object var6 = var3 == null ? var1.method_27993() : var3;
      if (var6 != null) {
         if (var2 == null && ((Entity)var6).field_41768 instanceof ClientWorld) {
            var2 = (ClientWorld)((Entity)var6).field_41768;
         }

         if (var2 != null) {
            double var7;
            if (!var2.method_22572().method_40233()) {
               var7 = Math.random();
            } else {
               var7 = (double)var2.method_13578(1.0F);
            }

            var7 = this.method_28299(var2, var7);
            return (float)var7;
         } else {
            return 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   private double method_28299(World var1, double var2) {
      if (var1.method_29546() != this.field_31592) {
         this.field_31592 = var1.method_29546();
         double var6 = var2 - this.field_31594;
         var6 = class_9299.method_42799(var6 + 0.5, 1.0) - 0.5;
         this.field_31595 += var6 * 0.1;
         this.field_31595 *= 0.9;
         this.field_31594 = class_9299.method_42799(this.field_31594 + this.field_31595, 1.0);
      }

      return this.field_31594;
   }
}
