package remapped;

public class class_5133 extends class_1249 {
   private static String[] field_26473;

   public class_5133(class_5886 var1, World var2) {
      super(var1, var2);
   }

   @Override
   public class_8976 method_5605(int var1) {
      this.field_6888 = new class_9546();
      this.field_6888.method_7007(true);
      return new class_8976(this.field_6888, var1);
   }

   @Override
   public boolean method_5601() {
      return this.method_5602() && this.method_5617() || !this.field_6877.method_37070();
   }

   @Override
   public class_1343 method_5596() {
      return this.field_6877.method_37245();
   }

   @Override
   public class_3998 method_5598(Entity var1, int var2) {
      return this.method_5615(var1.method_37075(), var2);
   }

   @Override
   public void method_5612() {
      this.field_6875++;
      if (this.field_6874) {
         this.method_5621();
      }

      if (!this.method_5591()) {
         if (!this.method_5601()) {
            if (this.field_6887 != null && !this.field_6887.method_18436()) {
               class_1343 var3 = this.field_6887.method_18439(this.field_6877);
               if (class_9299.method_42847(this.field_6877.method_37302()) == class_9299.method_42847(var3.field_7336)
                  && class_9299.method_42847(this.field_6877.method_37309()) == class_9299.method_42847(var3.field_7333)
                  && class_9299.method_42847(this.field_6877.method_37156()) == class_9299.method_42847(var3.field_7334)) {
                  this.field_6887.method_18434();
               }
            }
         } else {
            this.method_5592();
         }

         class_1892.method_8443(this.field_6882, this.field_6877, this.field_6887, this.field_6889);
         if (!this.method_5591()) {
            class_1343 var4 = this.field_6887.method_18439(this.field_6877);
            this.field_6877.method_26905().method_12879(var4.field_7336, var4.field_7333, var4.field_7334, this.field_6871);
         }
      }
   }

   @Override
   public boolean method_5599(class_1343 var1, class_1343 var2, int var3, int var4, int var5) {
      int var8 = class_9299.method_42847(var1.field_7336);
      int var9 = class_9299.method_42847(var1.field_7333);
      int var10 = class_9299.method_42847(var1.field_7334);
      double var11 = var2.field_7336 - var1.field_7336;
      double var13 = var2.field_7333 - var1.field_7333;
      double var15 = var2.field_7334 - var1.field_7334;
      double var17 = var11 * var11 + var13 * var13 + var15 * var15;
      if (var17 < 1.0E-8) {
         return false;
      } else {
         double var19 = 1.0 / Math.sqrt(var17);
         var11 *= var19;
         var13 *= var19;
         var15 *= var19;
         double var21 = 1.0 / Math.abs(var11);
         double var23 = 1.0 / Math.abs(var13);
         double var25 = 1.0 / Math.abs(var15);
         double var27 = (double)var8 - var1.field_7336;
         double var29 = (double)var9 - var1.field_7333;
         double var31 = (double)var10 - var1.field_7334;
         if (var11 >= 0.0) {
            var27++;
         }

         if (var13 >= 0.0) {
            var29++;
         }

         if (var15 >= 0.0) {
            var31++;
         }

         var27 /= var11;
         var29 /= var13;
         var31 /= var15;
         int var33 = !(var11 < 0.0) ? 1 : -1;
         int var34 = !(var13 < 0.0) ? 1 : -1;
         int var35 = !(var15 < 0.0) ? 1 : -1;
         int var36 = class_9299.method_42847(var2.field_7336);
         int var37 = class_9299.method_42847(var2.field_7333);
         int var38 = class_9299.method_42847(var2.field_7334);
         int var39 = var36 - var8;
         int var40 = var37 - var9;
         int var41 = var38 - var10;

         while (var39 * var33 > 0 || var40 * var34 > 0 || var41 * var35 > 0) {
            if (var27 < var31 && var27 <= var29) {
               var27 += var21;
               var8 += var33;
               var39 = var36 - var8;
            } else if (var29 < var27 && var29 <= var31) {
               var29 += var23;
               var9 += var34;
               var40 = var37 - var9;
            } else {
               var31 += var25;
               var10 += var35;
               var41 = var38 - var10;
            }
         }

         return true;
      }
   }

   public void method_23534(boolean var1) {
      this.field_6888.method_7008(var1);
   }

   public void method_23535(boolean var1) {
      this.field_6888.method_7007(var1);
   }

   @Override
   public boolean method_5609(class_1331 var1) {
      return this.field_6882.method_28262(var1).method_8337(this.field_6882, var1, this.field_6877);
   }
}
