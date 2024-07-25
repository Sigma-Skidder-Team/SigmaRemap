package remapped;

public class class_8985 extends class_1249 {
   private static String[] field_46022;
   private boolean field_46023;

   public class_8985(class_5886 var1, World var2) {
      super(var1, var2);
   }

   @Override
   public class_8976 method_5605(int var1) {
      this.field_6888 = new class_2266();
      this.field_6888.method_7007(true);
      return new class_8976(this.field_6888, var1);
   }

   @Override
   public boolean method_5601() {
      return this.field_6877.method_37360() || this.method_5617() || this.field_6877.isPassenger();
   }

   @Override
   public class_1343 method_5596() {
      return new class_1343(this.field_6877.method_37302(), (double)this.method_41196(), this.field_6877.method_37156());
   }

   @Override
   public class_3998 method_5615(BlockPos var1, int var2) {
      if (this.field_6882.method_28262(var1).method_8345()) {
         BlockPos var5 = var1.method_6100();

         while (var5.method_12165() > 0 && this.field_6882.method_28262(var5).method_8345()) {
            var5 = var5.method_6100();
         }

         if (var5.method_12165() > 0) {
            return super.method_5615(var5.method_6081(), var2);
         }

         while (var5.method_12165() < this.field_6882.method_28261() && this.field_6882.method_28262(var5).method_8345()) {
            var5 = var5.method_6081();
         }

         var1 = var5;
      }

      if (!this.field_6882.method_28262(var1).method_8362().method_24499()) {
         return super.method_5615(var1, var2);
      } else {
         BlockPos var6 = var1.method_6081();

         while (var6.method_12165() < this.field_6882.method_28261() && this.field_6882.method_28262(var6).method_8362().method_24499()) {
            var6 = var6.method_6081();
         }

         return super.method_5615(var6, var2);
      }
   }

   @Override
   public class_3998 method_5598(Entity var1, int var2) {
      return this.method_5615(var1.method_37075(), var2);
   }

   private int method_41196() {
      if (this.field_6877.method_37285() && this.method_5602()) {
         int var3 = class_9299.method_42847(this.field_6877.method_37309());
         class_6414 var4 = this.field_6882
            .method_28262(new BlockPos(this.field_6877.method_37302(), (double)var3, this.field_6877.method_37156()))
            .method_8360();
         int var5 = 0;

         while (var4 == class_4783.field_23900) {
            var4 = this.field_6882.method_28262(new BlockPos(this.field_6877.method_37302(), (double)(++var3), this.field_6877.method_37156())).method_8360();
            if (++var5 > 16) {
               return class_9299.method_42847(this.field_6877.method_37309());
            }
         }

         return var3;
      } else {
         return class_9299.method_42847(this.field_6877.method_37309() + 0.5);
      }
   }

   @Override
   public void method_5618() {
      super.method_5618();
      if (this.field_46023) {
         if (this.field_6882.method_25263(new BlockPos(this.field_6877.method_37302(), this.field_6877.method_37309() + 0.5, this.field_6877.method_37156()))
            )
          {
            return;
         }

         for (int var3 = 0; var3 < this.field_6887.method_18437(); var3++) {
            class_5851 var4 = this.field_6887.method_18447(var3);
            if (this.field_6882.method_25263(new BlockPos(var4.field_29731, var4.field_29735, var4.field_29736))) {
               this.field_6887.method_18428(var3);
               return;
            }
         }
      }
   }

   @Override
   public boolean method_5599(class_1343 var1, class_1343 var2, int var3, int var4, int var5) {
      int var8 = class_9299.method_42847(var1.field_7336);
      int var9 = class_9299.method_42847(var1.field_7334);
      double var10 = var2.field_7336 - var1.field_7336;
      double var12 = var2.field_7334 - var1.field_7334;
      double var14 = var10 * var10 + var12 * var12;
      if (var14 < 1.0E-8) {
         return false;
      } else {
         double var16 = 1.0 / Math.sqrt(var14);
         var10 *= var16;
         var12 *= var16;
         var3 += 2;
         var5 += 2;
         if (!this.method_41198(var8, class_9299.method_42847(var1.field_7333), var9, var3, var4, var5, var1, var10, var12)) {
            return false;
         } else {
            var3 -= 2;
            var5 -= 2;
            double var18 = 1.0 / Math.abs(var10);
            double var20 = 1.0 / Math.abs(var12);
            double var22 = (double)var8 - var1.field_7336;
            double var24 = (double)var9 - var1.field_7334;
            if (var10 >= 0.0) {
               var22++;
            }

            if (var12 >= 0.0) {
               var24++;
            }

            var22 /= var10;
            var24 /= var12;
            int var26 = !(var10 < 0.0) ? 1 : -1;
            int var27 = !(var12 < 0.0) ? 1 : -1;
            int var28 = class_9299.method_42847(var2.field_7336);
            int var29 = class_9299.method_42847(var2.field_7334);
            int var30 = var28 - var8;
            int var31 = var29 - var9;

            while (var30 * var26 > 0 || var31 * var27 > 0) {
               if (!(var22 < var24)) {
                  var24 += var20;
                  var9 += var27;
                  var31 = var29 - var9;
               } else {
                  var22 += var18;
                  var8 += var26;
                  var30 = var28 - var8;
               }

               if (!this.method_41198(var8, class_9299.method_42847(var1.field_7333), var9, var3, var4, var5, var1, var10, var12)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private boolean method_41198(int var1, int var2, int var3, int var4, int var5, int var6, class_1343 var7, double var8, double var10) {
      int var14 = var1 - var4 / 2;
      int var15 = var3 - var6 / 2;
      if (!this.method_41195(var14, var2, var15, var4, var5, var6, var7, var8, var10)) {
         return false;
      } else {
         for (int var16 = var14; var16 < var14 + var4; var16++) {
            for (int var17 = var15; var17 < var15 + var6; var17++) {
               double var18 = (double)var16 + 0.5 - var7.field_7336;
               double var20 = (double)var17 + 0.5 - var7.field_7334;
               if (!(var18 * var8 + var20 * var10 < 0.0)) {
                  class_1108 var22 = this.field_6888.method_7011(this.field_6882, var16, var2 - 1, var17, this.field_6877, var4, var5, var6, true, true);
                  if (!this.method_41197(var22)) {
                     return false;
                  }

                  var22 = this.field_6888.method_7011(this.field_6882, var16, var2, var17, this.field_6877, var4, var5, var6, true, true);
                  float var23 = this.field_6877.method_26931(var22);
                  if (!(var23 < 0.0F) && !(var23 >= 8.0F)) {
                     if (var22 != class_1108.field_6352 && var22 != class_1108.field_6357 && var22 != class_1108.field_6351) {
                        continue;
                     }

                     return false;
                  }

                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean method_41197(class_1108 var1) {
      if (var1 != class_1108.field_6359) {
         return var1 != class_1108.field_6360 ? var1 != class_1108.field_6366 : false;
      } else {
         return false;
      }
   }

   private boolean method_41195(int var1, int var2, int var3, int var4, int var5, int var6, class_1343 var7, double var8, double var10) {
      for (BlockPos var15 : BlockPos.method_6076(new BlockPos(var1, var2, var3), new BlockPos(var1 + var4 - 1, var2 + var5 - 1, var3 + var6 - 1))) {
         double var16 = (double)var15.method_12173() + 0.5 - var7.field_7336;
         double var18 = (double)var15.method_12185() + 0.5 - var7.field_7334;
         if (!(var16 * var8 + var18 * var10 < 0.0) && !this.field_6882.method_28262(var15).method_8319(this.field_6882, var15, class_2929.field_14271)) {
            return false;
         }
      }

      return true;
   }

   public void method_41199(boolean var1) {
      this.field_6888.method_7008(var1);
   }

   public boolean method_41200() {
      return this.field_6888.method_7004();
   }

   public void method_41201(boolean var1) {
      this.field_46023 = var1;
   }
}
