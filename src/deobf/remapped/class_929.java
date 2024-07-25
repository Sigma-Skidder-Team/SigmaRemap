package remapped;

import javax.annotation.Nullable;

public class class_929 extends class_2266 {
   private static String[] field_4761;
   private float field_4762;
   private float field_4763;

   @Override
   public void method_7014(class_9525 var1, MobEntity var2) {
      super.method_7014(var1, var2);
      var2.method_26895(class_1108.field_6359, 0.0F);
      this.field_4762 = var2.method_26931(class_1108.field_6343);
      var2.method_26895(class_1108.field_6343, 6.0F);
      this.field_4763 = var2.method_26931(class_1108.field_6356);
      var2.method_26895(class_1108.field_6356, 4.0F);
   }

   @Override
   public void method_7005() {
      this.field_8166.method_26895(class_1108.field_6343, this.field_4762);
      this.field_8166.method_26895(class_1108.field_6356, this.field_4763);
      super.method_7005();
   }

   @Override
   public class_5851 method_7003() {
      return this.method_7016(
         MathHelper.floor(this.field_8166.getBoundingBox().field_19941),
         MathHelper.floor(this.field_8166.getBoundingBox().field_19937 + 0.5),
         MathHelper.floor(this.field_8166.getBoundingBox().field_19938)
      );
   }

   @Override
   public class_1478 method_7013(double var1, double var3, double var5) {
      return new class_1478(this.method_7016(MathHelper.floor(var1), MathHelper.floor(var3 + 0.5), MathHelper.floor(var5)));
   }

   @Override
   public int method_7002(class_5851[] var1, class_5851 var2) {
      int var5 = 0;
      boolean var6 = true;
      BlockPos var7 = new BlockPos(var2.field_29731, var2.field_29735, var2.field_29736);
      double var8 = this.method_4049(var7);
      class_5851 var10 = this.method_4050(var2.field_29731, var2.field_29735, var2.field_29736 + 1, 1, var8);
      class_5851 var11 = this.method_4050(var2.field_29731 - 1, var2.field_29735, var2.field_29736, 1, var8);
      class_5851 var12 = this.method_4050(var2.field_29731 + 1, var2.field_29735, var2.field_29736, 1, var8);
      class_5851 var13 = this.method_4050(var2.field_29731, var2.field_29735, var2.field_29736 - 1, 1, var8);
      class_5851 var14 = this.method_4050(var2.field_29731, var2.field_29735 + 1, var2.field_29736, 0, var8);
      class_5851 var15 = this.method_4050(var2.field_29731, var2.field_29735 - 1, var2.field_29736, 1, var8);
      if (var10 != null && !var10.field_29726) {
         var1[var5++] = var10;
      }

      if (var11 != null && !var11.field_29726) {
         var1[var5++] = var11;
      }

      if (var12 != null && !var12.field_29726) {
         var1[var5++] = var12;
      }

      if (var13 != null && !var13.field_29726) {
         var1[var5++] = var13;
      }

      if (var14 != null && !var14.field_29726) {
         var1[var5++] = var14;
      }

      if (var15 != null && !var15.field_29726) {
         var1[var5++] = var15;
      }

      boolean var16 = var13 == null || var13.field_29730 == class_1108.field_6366 || var13.field_29729 != 0.0F;
      boolean var17 = var10 == null || var10.field_29730 == class_1108.field_6366 || var10.field_29729 != 0.0F;
      boolean var18 = var12 == null || var12.field_29730 == class_1108.field_6366 || var12.field_29729 != 0.0F;
      boolean var19 = var11 == null || var11.field_29730 == class_1108.field_6366 || var11.field_29729 != 0.0F;
      if (var16 && var19) {
         class_5851 var20 = this.method_4050(var2.field_29731 - 1, var2.field_29735, var2.field_29736 - 1, 1, var8);
         if (var20 != null && !var20.field_29726) {
            var1[var5++] = var20;
         }
      }

      if (var16 && var18) {
         class_5851 var21 = this.method_4050(var2.field_29731 + 1, var2.field_29735, var2.field_29736 - 1, 1, var8);
         if (var21 != null && !var21.field_29726) {
            var1[var5++] = var21;
         }
      }

      if (var17 && var19) {
         class_5851 var22 = this.method_4050(var2.field_29731 - 1, var2.field_29735, var2.field_29736 + 1, 1, var8);
         if (var22 != null && !var22.field_29726) {
            var1[var5++] = var22;
         }
      }

      if (var17 && var18) {
         class_5851 var23 = this.method_4050(var2.field_29731 + 1, var2.field_29735, var2.field_29736 + 1, 1, var8);
         if (var23 != null && !var23.field_29726) {
            var1[var5++] = var23;
         }
      }

      return var5;
   }

   private double method_4049(BlockPos var1) {
      if (this.field_8166.method_37285()) {
         return (double)var1.method_12165() + 0.5;
      } else {
         BlockPos var4 = var1.method_6100();
         class_4190 var5 = this.field_8165.method_28262(var4).method_8324(this.field_8165, var4);
         return (double)var4.method_12165() + (!var5.method_19485() ? var5.method_19495(class_9249.field_47216) : 0.0);
      }
   }

   @Nullable
   private class_5851 method_4050(int var1, int var2, int var3, int var4, double var5) {
      class_5851 var9 = null;
      BlockPos var10 = new BlockPos(var1, var2, var3);
      double var11 = this.method_4049(var10);
      if (!(var11 - var5 > 1.125)) {
         class_1108 var13 = this.method_7011(
            this.field_8165, var1, var2, var3, this.field_8166, this.field_8164, this.field_8163, this.field_8167, false, false
         );
         float var14 = this.field_8166.method_26931(var13);
         double var15 = (double)this.field_8166.method_37086() / 2.0;
         if (var14 >= 0.0F) {
            var9 = this.method_7016(var1, var2, var3);
            var9.field_29730 = var13;
            var9.field_29729 = Math.max(var9.field_29729, var14);
         }

         if (var13 != class_1108.field_6359 && var13 != class_1108.field_6343) {
            if (var9 == null && var4 > 0 && var13 != class_1108.field_6353 && var13 != class_1108.field_6346 && var13 != class_1108.field_6347) {
               var9 = this.method_4050(var1, var2 + 1, var3, var4 - 1, var5);
            }

            if (var13 == class_1108.field_6366) {
               Box var17 = new Box(
                  (double)var1 - var15 + 0.5,
                  (double)var2 + 0.001,
                  (double)var3 - var15 + 0.5,
                  (double)var1 + var15 + 0.5,
                  (double)((float)var2 + this.field_8166.method_37074()),
                  (double)var3 + var15 + 0.5
               );
               if (!this.field_8166.world.method_6683(this.field_8166, var17)) {
                  return null;
               }

               class_1108 var18 = this.method_7011(
                  this.field_8165, var1, var2 - 1, var3, this.field_8166, this.field_8164, this.field_8163, this.field_8167, false, false
               );
               if (var18 == class_1108.field_6365) {
                  var9 = this.method_7016(var1, var2, var3);
                  var9.field_29730 = class_1108.field_6343;
                  var9.field_29729 = Math.max(var9.field_29729, var14);
                  return var9;
               }

               if (var18 == class_1108.field_6359) {
                  var9 = this.method_7016(var1, var2, var3);
                  var9.field_29730 = class_1108.field_6359;
                  var9.field_29729 = Math.max(var9.field_29729, var14);
                  return var9;
               }

               int var19 = 0;

               while (var2 > 0 && var13 == class_1108.field_6366) {
                  var2--;
                  if (var19++ >= this.field_8166.method_37232()) {
                     return null;
                  }

                  var13 = this.method_7011(this.field_8165, var1, var2, var3, this.field_8166, this.field_8164, this.field_8163, this.field_8167, false, false);
                  var14 = this.field_8166.method_26931(var13);
                  if (var13 != class_1108.field_6366 && var14 >= 0.0F) {
                     var9 = this.method_7016(var1, var2, var3);
                     var9.field_29730 = var13;
                     var9.field_29729 = Math.max(var9.field_29729, var14);
                     break;
                  }

                  if (var14 < 0.0F) {
                     return null;
                  }
               }
            }

            return var9;
         } else {
            if (var2 < this.field_8166.world.method_22552() - 10 && var9 != null) {
               var9.field_29729++;
            }

            return var9;
         }
      } else {
         return null;
      }
   }

   @Override
   public class_1108 method_10463(class_6163 var1, boolean var2, boolean var3, BlockPos var4, class_1108 var5) {
      if (var5 == class_1108.field_6345
         && !(var1.method_28262(var4).method_8360() instanceof class_6788)
         && !(var1.method_28262(var4.method_6100()).method_8360() instanceof class_6788)) {
         var5 = class_1108.field_6346;
      }

      if (var5 == class_1108.field_6361 || var5 == class_1108.field_6355 || var5 == class_1108.field_6350) {
         var5 = class_1108.field_6365;
      }

      if (var5 == class_1108.field_6348) {
         var5 = class_1108.field_6365;
      }

      return var5;
   }

   @Override
   public class_1108 method_7010(class_6163 var1, int var2, int var3, int var4) {
      class_2921 var7 = new class_2921();
      class_1108 var8 = method_10461(var1, var7.method_13362(var2, var3, var4));
      if (var8 != class_1108.field_6359) {
         if (var8 == class_1108.field_6366 && var3 >= 1) {
            class_2522 var14 = var1.method_28262(new BlockPos(var2, var3 - 1, var4));
            class_1108 var15 = method_10461(var1, var7.method_13362(var2, var3 - 1, var4));
            if (var15 != class_1108.field_6343 && var15 != class_1108.field_6366 && var15 != class_1108.field_6360) {
               var8 = class_1108.field_6343;
            } else {
               var8 = class_1108.field_6366;
            }

            if (var15 == class_1108.field_6352 || var14.method_8350(class_4783.field_23215) || var14.method_8349(class_2351.field_11774)) {
               var8 = class_1108.field_6352;
            }

            if (var15 == class_1108.field_6362) {
               var8 = class_1108.field_6362;
            }

            if (var15 == class_1108.field_6351) {
               var8 = class_1108.field_6351;
            }
         }

         if (var8 == class_1108.field_6343) {
            var8 = method_10458(var1, var7.method_13362(var2, var3, var4), var8);
         }

         return var8;
      } else {
         for (Direction var12 : Direction.values()) {
            class_1108 var13 = method_10461(var1, var7.method_13362(var2, var3, var4).method_13368(var12));
            if (var13 == class_1108.field_6365) {
               return class_1108.field_6356;
            }
         }

         return class_1108.field_6359;
      }
   }
}
