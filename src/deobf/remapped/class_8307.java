package remapped;

public class class_8307 extends class_2451 {
   private static String[] field_42555;

   public class_8307(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6098 method_11242(class_6098 var1, class_6486 var2, class_5834 var3) {
      class_6098 var6 = super.method_11242(var1, var2, var3);
      if (!var2.field_33055) {
         double var7 = var3.method_37302();
         double var9 = var3.method_37309();
         double var11 = var3.method_37156();

         for (int var13 = 0; var13 < 16; var13++) {
            double var14 = var3.method_37302() + (var3.method_26594().nextDouble() - 0.5) * 16.0;
            double var16 = class_9299.method_42827(var3.method_37309() + (double)(var3.method_26594().nextInt(16) - 8), 0.0, (double)(var2.method_43371() - 1));
            double var18 = var3.method_37156() + (var3.method_26594().nextDouble() - 0.5) * 16.0;
            if (var3.method_37070()) {
               var3.method_37390();
            }

            if (var3.method_26499(var14, var16, var18, true)) {
               class_8461 var20 = !(var3 instanceof class_5542) ? class_463.field_2460 : class_463.field_2465;
               var2.method_29528((class_704)null, var7, var9, var11, var20, class_562.field_3335, 1.0F, 1.0F);
               var3.method_37155(var20, 1.0F, 1.0F);
               break;
            }
         }

         if (var3 instanceof class_704) {
            ((class_704)var3).method_3173().method_32957(this, 20);
         }
      }

      return var6;
   }
}
