package remapped;

public class class_1731 extends class_9128 {
   private int field_8926;
   private class_3223 field_8927 = new class_3223();

   public class_1731() {
      super(class_5664.field_28716, "Bow", "Fly for Bow");
   }

   @Override
   public void method_42020() {
      if (field_46692.field_9616.field_32603 == 0.1F) {
         field_46692.field_9616.field_32603 = 1.0F;
      }
   }

   @Override
   public void method_42012() {
   }

   @class_9148
   public void method_7737(class_4996 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632.method_26617(class_2584.field_12791).method_27960() == class_4897.field_25206 && this.field_8926 >= 1) {
            var1.method_29715(true);
         }
      }
   }

   @class_9148
   public void method_7738(class_7767 var1) {
      if (this.method_42015()) {
         double var4 = var1.method_35233().field_7333;
         var1.method_35233().field_7333 = 0.0;
         double var6 = var1.method_35233().method_6217();
         var1.method_35233().field_7333 = var4;
         float var8 = class_8865.method_40773()[1];
         float var9 = class_8865.method_40773()[2];
         float var10 = class_8865.method_40773()[0];
         System.out.println(var6);
         if ((var8 != 0.0F || var9 != 0.0F) && !(var1.method_35233().field_7333 < -0.5)) {
            double var11 = Math.cos(Math.toRadians((double)var10));
            double var13 = Math.sin(Math.toRadians((double)var10));
            var1.method_35232((double)var8 * var6 * var11 + (double)var9 * var6 * var13);
            var1.method_35229((double)var8 * var6 * var13 - (double)var9 * var6 * var11);
            field_46692.field_9632.method_37098().field_7336 = var1.method_35234();
            field_46692.field_9632.method_37098().field_7333 = var1.method_35236();
         } else {
            var1.method_35232(0.0);
            var1.method_35229(0.0);
         }
      }
   }

   @class_9148
   public void method_7739(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         if (!this.field_8927.method_14771()) {
            this.field_8927.method_14776();
         }

         int var4 = this.method_7736();
         if (var4 >= 0 || var4 <= 8) {
            if (field_46692.field_9632.method_26617(class_2584.field_12791).method_27960() == class_4897.field_25206) {
               if (class_5174.method_23723(class_4897.field_25024) == 0) {
                  if (this.field_8927.method_14772() > 5000L) {
                     SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("BowFly", "You have no arrows"));
                     this.field_8927.method_14773();
                  }

                  if (field_46692.field_9616.field_32603 == 0.1F) {
                     field_46692.field_9616.field_32603 = 1.0F;
                  }

                  return;
               }

               float var5 = field_46692.field_9632.field_41701;
               float var6 = -90.0F;
               if (field_46692.field_9632.field_29673 != 0.0F || field_46692.field_9632.field_29676 != 0.0F) {
                  var6 = -80.0F;
               }

               if (field_46692.field_9632.field_29673 < 0.0F) {
                  var5 -= 180.0F;
               }

               if (field_46692.field_9632.method_37098().field_7333 < -0.1) {
                  var6 = 90.0F;
               }

               var1.method_6448(var6);
               var1.method_6441(var5);
               if (field_46692.field_9632.field_41726 && field_46692.field_9632.field_41774) {
                  field_46692.field_9632.method_26595();
               } else if (!(field_46692.field_9632.method_37098().field_7333 < 0.0)) {
                  if (field_46692.field_9616.field_32603 == 0.1F) {
                     field_46692.field_9616.field_32603 = 1.0F;
                  }
               } else {
                  field_46692.field_9616.field_32603 = 0.1F;
               }

               this.field_8926++;
               if (this.field_8926 < 4) {
                  if (this.field_8926 == 1) {
                     field_46692.method_8614().method_4813(new class_1022(class_2584.field_12791));
                  }
               } else {
                  field_46692.method_8614().method_4813(new class_1586(class_7500.field_38259, class_1331.field_7306, Direction.field_802));
                  this.field_8926 = 0;
               }
            }
         }
      }
   }

   private int method_7736() {
      for (int var3 = 36; var3 < 45; var3++) {
         if (field_46692.field_9632.field_3869.method_18878(var3).method_35884()) {
            class_6098 var4 = field_46692.field_9632.field_3869.method_18878(var3).method_35898();
            if (var4.method_27960() == class_4897.field_25206) {
               return var3 - 36;
            }
         }
      }

      for (int var5 = 9; var5 < 36; var5++) {
         if (field_46692.field_9632.field_3869.method_18878(var5).method_35884()) {
            class_6098 var6 = field_46692.field_9632.field_3869.method_18878(var5).method_35898();
            if (var6.method_27960() == class_4897.field_25206) {
               class_2740.method_12312(var5, 7);
               return 7;
            }
         }
      }

      return -1;
   }
}
