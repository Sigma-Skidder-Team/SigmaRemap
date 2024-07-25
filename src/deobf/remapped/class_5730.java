package remapped;

public class class_5730 extends class_305 {
   private static String[] field_28945;
   public static final class_4190 field_28946 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public class_5730(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_28946;
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      this.method_25914(var1, var2, var3);
      return class_6910.method_31659(var2.field_33055);
   }

   @Override
   public void method_10791(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4) {
      this.method_25914(var1, var2, var3);
   }

   private void method_25914(class_2522 var1, class_6486 var2, class_1331 var3) {
      for (int var6 = 0; var6 < 1000; var6++) {
         class_1331 var7 = var3.method_6104(
            var2.field_33033.nextInt(16) - var2.field_33033.nextInt(16),
            var2.field_33033.nextInt(8) - var2.field_33033.nextInt(8),
            var2.field_33033.nextInt(16) - var2.field_33033.nextInt(16)
         );
         if (var2.method_28262(var7).method_8345()) {
            if (!var2.field_33055) {
               var2.method_7513(var7, var1, 2);
               var2.method_7508(var3, false);
            } else {
               for (int var8 = 0; var8 < 128; var8++) {
                  double var9 = var2.field_33033.nextDouble();
                  float var11 = (var2.field_33033.nextFloat() - 0.5F) * 0.2F;
                  float var12 = (var2.field_33033.nextFloat() - 0.5F) * 0.2F;
                  float var13 = (var2.field_33033.nextFloat() - 0.5F) * 0.2F;
                  double var14 = class_9299.method_42794(var9, (double)var7.method_12173(), (double)var3.method_12173())
                     + (var2.field_33033.nextDouble() - 0.5)
                     + 0.5;
                  double var16 = class_9299.method_42794(var9, (double)var7.method_12165(), (double)var3.method_12165()) + var2.field_33033.nextDouble() - 0.5;
                  double var18 = class_9299.method_42794(var9, (double)var7.method_12185(), (double)var3.method_12185())
                     + (var2.field_33033.nextDouble() - 0.5)
                     + 0.5;
                  var2.method_43361(class_3090.field_15356, var14, var16, var18, (double)var11, (double)var12, (double)var13);
               }
            }

            return;
         }
      }
   }

   @Override
   public int method_1363() {
      return 5;
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
