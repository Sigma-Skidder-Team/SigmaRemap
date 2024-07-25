package remapped;

import java.util.EnumSet;

public class class_2478 extends class_3599 {
   private static String[] field_12366;
   private int field_12365;

   public class_2478(class_6092 var1) {
      this.field_12367 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      LivingEntity var3 = this.field_12367.method_17809();
      return var3 != null && var3.isAlive() ? this.field_12367.field_41768.method_43370() != class_423.field_1790 : false;
   }

   @Override
   public void method_16796() {
      this.field_12365 = 20;
      this.field_12367.method_27913(100);
   }

   @Override
   public void method_16793() {
      this.field_12367.method_27913(0);
   }

   @Override
   public void method_16794() {
      if (this.field_12367.field_41768.method_43370() != class_423.field_1790) {
         this.field_12365--;
         LivingEntity var3 = this.field_12367.method_17809();
         this.field_12367.method_26865().method_17240(var3, 180.0F, 180.0F);
         double var4 = this.field_12367.method_37275(var3);
         if (!(var4 < 400.0)) {
            this.field_12367.method_26860((LivingEntity)null);
         } else if (this.field_12365 <= 0) {
            this.field_12365 = 20 + class_6092.method_27912(this.field_12367).nextInt(10) * 20 / 2;
            this.field_12367
               .field_41768
               .method_7509(new class_9552(this.field_12367.field_41768, this.field_12367, var3, this.field_12367.method_27914().method_1029()));
            this.field_12367
               .method_37155(
                  class_463.field_2890,
                  2.0F,
                  (class_6092.method_27910(this.field_12367).nextFloat() - class_6092.method_27922(this.field_12367).nextFloat()) * 0.2F + 1.0F
               );
         }

         super.method_16794();
      }
   }
}
