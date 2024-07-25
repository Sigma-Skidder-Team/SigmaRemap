package remapped;

public class class_532 extends class_3558 {
   private static String[] field_3237;

   private class_532(class_1799 var1) {
      super(var1);
      this.field_3238 = var1;
   }

   @Override
   public int method_16545() {
      return 40;
   }

   @Override
   public int method_16541() {
      return 100;
   }

   @Override
   public void method_16543() {
      class_5834 var3 = this.field_3238.method_17809();
      double var4 = Math.min(var3.method_37309(), this.field_3238.method_37309());
      double var6 = Math.max(var3.method_37309(), this.field_3238.method_37309()) + 1.0;
      float var8 = (float)class_9299.method_42821(var3.method_37156() - this.field_3238.method_37156(), var3.method_37302() - this.field_3238.method_37302());
      if (!(this.field_3238.method_37275(var3) < 9.0)) {
         for (int var9 = 0; var9 < 16; var9++) {
            double var11 = 1.25 * (double)(var9 + 1);
            int var13 = 1 * var9;
            this.method_2589(
               this.field_3238.method_37302() + (double)class_9299.method_42840(var8) * var11,
               this.field_3238.method_37156() + (double)class_9299.method_42818(var8) * var11,
               var4,
               var6,
               var8,
               var13
            );
         }
      } else {
         for (int var14 = 0; var14 < 5; var14++) {
            float var10 = var8 + (float)var14 * (float) Math.PI * 0.4F;
            this.method_2589(
               this.field_3238.method_37302() + (double)class_9299.method_42840(var10) * 1.5,
               this.field_3238.method_37156() + (double)class_9299.method_42818(var10) * 1.5,
               var4,
               var6,
               var10,
               0
            );
         }

         for (int var15 = 0; var15 < 8; var15++) {
            float var16 = var8 + (float)var15 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
            this.method_2589(
               this.field_3238.method_37302() + (double)class_9299.method_42840(var16) * 2.5,
               this.field_3238.method_37156() + (double)class_9299.method_42818(var16) * 2.5,
               var4,
               var6,
               var16,
               3
            );
         }
      }
   }

   private void method_2589(double var1, double var3, double var5, double var7, float var9, int var10) {
      class_1331 var13 = new class_1331(var1, var7, var3);
      boolean var14 = false;
      double var15 = 0.0;

      while (true) {
         class_1331 var17 = var13.method_6100();
         class_2522 var18 = this.field_3238.field_41768.method_28262(var17);
         if (!var18.method_8308(this.field_3238.field_41768, var17, class_240.field_817)) {
            var13 = var13.method_6100();
            if (var13.method_12165() >= class_9299.method_42847(var5) - 1) {
               continue;
            }
            break;
         }

         if (!this.field_3238.field_41768.method_22548(var13)) {
            class_2522 var19 = this.field_3238.field_41768.method_28262(var13);
            class_4190 var20 = var19.method_8324(this.field_3238.field_41768, var13);
            if (!var20.method_19485()) {
               var15 = var20.method_19495(class_9249.field_47216);
            }
         }

         var14 = true;
         break;
      }

      if (var14) {
         this.field_3238
            .field_41768
            .method_7509(new class_1511(this.field_3238.field_41768, var1, (double)var13.method_12165() + var15, var3, var9, var10, this.field_3238));
      }
   }

   @Override
   public class_8461 method_16540() {
      return class_463.field_2074;
   }

   @Override
   public class_248 method_16544() {
      return class_248.field_876;
   }
}
