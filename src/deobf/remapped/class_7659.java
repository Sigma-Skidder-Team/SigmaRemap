package remapped;

public class class_7659 extends class_6017 {
   private static String[] field_38907;
   private int field_38908;
   private int field_38906;
   private class_4478 field_38905;

   public class_7659(class_2770 var1) {
      super(var1);
   }

   @Override
   public void method_23466() {
      this.field_38908++;
      if (this.field_38908 % 2 == 0 && this.field_38908 < 10) {
         class_1343 var3 = this.field_9479.method_12609(1.0F).method_6213();
         var3.method_6192((float) (-Math.PI / 4));
         double var4 = this.field_9479.field_13542.method_37302();
         double var6 = this.field_9479.field_13542.method_37080(0.5);
         double var8 = this.field_9479.field_13542.method_37156();

         for (int var10 = 0; var10 < 8; var10++) {
            double var11 = var4 + this.field_9479.method_26594().nextGaussian() / 2.0;
            double var13 = var6 + this.field_9479.method_26594().nextGaussian() / 2.0;
            double var15 = var8 + this.field_9479.method_26594().nextGaussian() / 2.0;

            for (int var17 = 0; var17 < 6; var17++) {
               this.field_9479
                  .field_41768
                  .method_43361(
                     class_3090.field_15315,
                     var11,
                     var13,
                     var15,
                     -var3.field_7336 * 0.08F * (double)var17,
                     -var3.field_7333 * 0.6F,
                     -var3.field_7334 * 0.08F * (double)var17
                  );
            }

            var3.method_6192((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void method_23473() {
      this.field_38908++;
      if (this.field_38908 < 200) {
         if (this.field_38908 == 10) {
            class_1343 var3 = new class_1343(
                  this.field_9479.field_13542.method_37302() - this.field_9479.method_37302(),
                  0.0,
                  this.field_9479.field_13542.method_37156() - this.field_9479.method_37156()
               )
               .method_6213();
            float var4 = 5.0F;
            double var5 = this.field_9479.field_13542.method_37302() + var3.field_7336 * 5.0 / 2.0;
            double var7 = this.field_9479.field_13542.method_37156() + var3.field_7334 * 5.0 / 2.0;
            double var9 = this.field_9479.field_13542.method_37080(0.5);
            double var11 = var9;
            class_2921 var13 = new class_2921(var5, var9, var7);

            while (this.field_9479.field_41768.method_22548(var13)) {
               if (--var11 < 0.0) {
                  var11 = var9;
                  break;
               }

               var13.method_13361(var5, var11, var7);
            }

            var11 = (double)(class_9299.method_42847(var11) + 1);
            this.field_38905 = new class_4478(this.field_9479.field_41768, var5, var11, var7);
            this.field_38905.method_20782(this.field_9479);
            this.field_38905.method_20781(5.0F);
            this.field_38905.method_20787(200);
            this.field_38905.method_20789(class_3090.field_15315);
            this.field_38905.method_20788(new class_2250(class_4054.field_19723));
            this.field_9479.field_41768.method_7509(this.field_38905);
         }
      } else if (this.field_38906 < 4) {
         this.field_9479.method_12611().method_29422(class_8978.field_45998);
      } else {
         this.field_9479.method_12611().method_29422(class_8978.field_46003);
      }
   }

   @Override
   public void method_23469() {
      this.field_38908 = 0;
      this.field_38906++;
   }

   @Override
   public void method_23471() {
      if (this.field_38905 != null) {
         this.field_38905.method_37204();
         this.field_38905 = null;
      }
   }

   @Override
   public class_8978<class_7659> method_23464() {
      return class_8978.field_45997;
   }

   public void method_34666() {
      this.field_38906 = 0;
   }
}
