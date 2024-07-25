package remapped;

import java.util.EnumSet;

public class class_666 extends class_3599 {
   private static String[] field_3692;
   private final class_2806 field_3691;
   private int field_3690;
   private int field_3693;
   private int field_3694;

   public class_666(class_2806 var1) {
      this.field_3691 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      class_5834 var3 = this.field_3691.method_17809();
      return var3 != null && var3.method_37330() && this.field_3691.method_26608(var3);
   }

   @Override
   public void method_16796() {
      this.field_3690 = 0;
   }

   @Override
   public void method_16793() {
      class_2806.method_12758(this.field_3691, false);
      this.field_3694 = 0;
   }

   @Override
   public void method_16794() {
      this.field_3693--;
      class_5834 var3 = this.field_3691.method_17809();
      if (var3 != null) {
         boolean var4 = this.field_3691.method_26928().method_36736(var3);
         if (!var4) {
            this.field_3694++;
         } else {
            this.field_3694 = 0;
         }

         double var5 = this.field_3691.method_37275(var3);
         if (var5 < 4.0) {
            if (!var4) {
               return;
            }

            if (this.field_3693 <= 0) {
               this.field_3693 = 20;
               this.field_3691.method_26442(var3);
            }

            this.field_3691.method_26905().method_12879(var3.method_37302(), var3.method_37309(), var3.method_37156(), 1.0);
         } else if (var5 < this.method_3039() * this.method_3039() && var4) {
            double var7 = var3.method_37302() - this.field_3691.method_37302();
            double var9 = var3.method_37080(0.5) - this.field_3691.method_37080(0.5);
            double var11 = var3.method_37156() - this.field_3691.method_37156();
            if (this.field_3693 <= 0) {
               this.field_3690++;
               if (this.field_3690 != 1) {
                  if (this.field_3690 > 4) {
                     this.field_3693 = 100;
                     this.field_3690 = 0;
                     class_2806.method_12758(this.field_3691, false);
                  } else {
                     this.field_3693 = 6;
                  }
               } else {
                  this.field_3693 = 60;
                  class_2806.method_12758(this.field_3691, true);
               }

               if (this.field_3690 > 1) {
                  float var13 = class_9299.method_42843(class_9299.method_42842(var5)) * 0.5F;
                  if (!this.field_3691.method_37378()) {
                     this.field_3691.field_41768.method_43365((class_704)null, 1018, this.field_3691.method_37075(), 0);
                  }

                  for (int var14 = 0; var14 < 1; var14++) {
                     class_1593 var15 = new class_1593(
                        this.field_3691.field_41768,
                        this.field_3691,
                        var7 + this.field_3691.method_26594().nextGaussian() * (double)var13,
                        var9,
                        var11 + this.field_3691.method_26594().nextGaussian() * (double)var13
                     );
                     var15.method_37256(var15.method_37302(), this.field_3691.method_37080(0.5) + 0.5, var15.method_37156());
                     this.field_3691.field_41768.method_7509(var15);
                  }
               }
            }

            this.field_3691.method_26865().method_17240(var3, 10.0F, 10.0F);
         } else if (this.field_3694 < 5) {
            this.field_3691.method_26905().method_12879(var3.method_37302(), var3.method_37309(), var3.method_37156(), 1.0);
         }

         super.method_16794();
      }
   }

   private double method_3039() {
      return this.field_3691.method_26575(class_7331.field_37471);
   }
}
