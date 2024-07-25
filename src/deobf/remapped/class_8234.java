package remapped;

public class class_8234 extends Module {
   public class_8234() {
      super(Category.MOVEMENT, "AAC", "Step for AAC");
   }

   @class_9148
   @class_7664
   private void method_37719(class_8544 var1) {
      if (this.method_42015() && !var1.method_29716()) {
         double var4 = var1.method_39326();
         if (!class_314.method_1413(mcInstance.field_9632, 1.0E-4F)) {
            var1.method_29715(true);
         } else {
            if (!class_8865.method_40771() && var4 >= 0.625) {
               double var6 = mcInstance.field_9632.method_37302();
               double var8 = mcInstance.field_9632.method_37309();
               double var10 = mcInstance.field_9632.method_37156();
               if (var4 < 1.1) {
                  double[] var12 = new double[]{0.41999998688698 * var4, 0.754 * var4};

                  for (double var16 : var12) {
                     mcInstance.method_8614().method_4813(new class_9515(var6, var8 + var16, var10, false));
                  }
               }
            }
         }
      }
   }

   @class_9148
   private void method_37718(class_7982 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (!var1.method_36184()) {
            mcInstance.field_9632.field_41733 = 1.0F;
         } else {
            mcInstance.field_9632.field_41733 = 0.5F;
         }
      }
   }
}
