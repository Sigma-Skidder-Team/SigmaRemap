package remapped;

import java.util.ArrayList;

public class class_3400 {
   private static String[] field_16742;
   public float field_16744 = 1.0E-4F;
   public float field_16745 = 1.0F;
   public int field_16741 = 10000;
   public class_5896 field_16743;

   public class_3316[] method_15703(class_3316 var1, class_3316 var2) {
      var1 = var1.method_15207(new class_4508());
      var2 = var2.method_15207(new class_4508());
      int var5 = 0;

      for (int var6 = 0; var6 < var1.method_15223(); var6++) {
         if (var2.method_15224(var1.method_15229(var6)[0], var1.method_15229(var6)[1])) {
            var5++;
         }
      }

      if (var5 == var1.method_15223()) {
         return new class_3316[0];
      } else if (var1.method_15205(var2)) {
         int var10 = 0;

         for (int var7 = 0; var7 < var2.method_15223(); var7++) {
            if (var1.method_15224(var2.method_15229(var7)[0], var2.method_15229(var7)[1])
               && !this.method_15701(var1, var2.method_15229(var7)[0], var2.method_15229(var7)[1])) {
               var10++;
            }
         }

         for (int var11 = 0; var11 < var1.method_15223(); var11++) {
            if (var2.method_15224(var1.method_15229(var11)[0], var1.method_15229(var11)[1])
               && !this.method_15701(var2, var1.method_15229(var11)[0], var1.method_15229(var11)[1])) {
               var10++;
            }
         }

         return var10 >= 1 ? this.method_15705(var1, var2, true) : new class_3316[]{var1};
      } else {
         return new class_3316[]{var1};
      }
   }

   private boolean method_15701(class_3316 var1, float var2, float var3) {
      for (int var6 = 0; var6 < var1.method_15223() + 1; var6++) {
         int var7 = method_15706(var1, var6 + 1);
         class_7133 var8 = this.method_15709(var1, method_15706(var1, var6), var7);
         if (var8.method_32763(new class_1440(var2, var3)) < this.field_16744 * 100.0F) {
            return true;
         }
      }

      return false;
   }

   public void method_15702(class_5896 var1) {
      this.field_16743 = var1;
   }

   public class_3316[] method_15707(class_3316 var1, class_3316 var2) {
      var1 = var1.method_15207(new class_4508());
      var2 = var2.method_15207(new class_4508());
      if (!var1.method_15205(var2)) {
         return new class_3316[]{var1, var2};
      } else {
         boolean var5 = false;
         int var6 = 0;

         for (int var7 = 0; var7 < var1.method_15223(); var7++) {
            if (var2.method_15224(var1.method_15229(var7)[0], var1.method_15229(var7)[1])
               && !var2.method_15214(var1.method_15229(var7)[0], var1.method_15229(var7)[1])) {
               var5 = true;
               break;
            }

            if (var2.method_15214(var1.method_15229(var7)[0], var1.method_15229(var7)[1])) {
               var6++;
            }
         }

         for (int var10 = 0; var10 < var2.method_15223(); var10++) {
            if (var1.method_15224(var2.method_15229(var10)[0], var2.method_15229(var10)[1])
               && !var1.method_15214(var2.method_15229(var10)[0], var2.method_15229(var10)[1])) {
               var5 = true;
               break;
            }
         }

         return !var5 && var6 < 2 ? new class_3316[]{var1, var2} : this.method_15705(var1, var2, false);
      }
   }

   private class_3316[] method_15705(class_3316 var1, class_3316 var2, boolean var3) {
      if (!var3) {
         for (int var15 = 0; var15 < var1.method_15223(); var15++) {
            if (!var2.method_15224(var1.method_15229(var15)[0], var1.method_15229(var15)[1])
               && !var2.method_15214(var1.method_15229(var15)[0], var1.method_15229(var15)[1])) {
               class_3316 var16 = this.method_15710(var1, var2, false, var15);
               return new class_3316[]{var16};
            }
         }

         return new class_3316[]{var2};
      } else {
         ArrayList var6 = new ArrayList();
         ArrayList var7 = new ArrayList();

         for (int var8 = 0; var8 < var1.method_15223(); var8++) {
            float[] var9 = var1.method_15229(var8);
            if (var2.method_15224(var9[0], var9[1])) {
               var7.add(new class_1440(var9[0], var9[1]));
               if (this.field_16743 != null) {
                  this.field_16743.method_26962(var9[0], var9[1]);
               }
            }
         }

         for (int var17 = 0; var17 < var1.method_15223(); var17++) {
            float[] var18 = var1.method_15229(var17);
            class_1440 var10 = new class_1440(var18[0], var18[1]);
            if (!var7.contains(var10)) {
               class_3316 var11 = this.method_15710(var1, var2, true, var17);
               var6.add(var11);

               for (int var12 = 0; var12 < var11.method_15223(); var12++) {
                  float[] var13 = var11.method_15229(var12);
                  class_1440 var14 = new class_1440(var13[0], var13[1]);
                  var7.add(var14);
               }
            }
         }

         return var6.<class_3316>toArray(new class_3316[0]);
      }
   }

   private class_3316 method_15710(class_3316 var1, class_3316 var2, boolean var3, int var4) {
      class_3316 var7 = var1;
      class_3316 var8 = var2;
      int var9 = var4;
      byte var10 = 1;
      class_6714 var11 = new class_6714();
      boolean var12 = true;
      int var13 = 0;
      float var14 = var1.method_15229(var4)[0];
      float var15 = var1.method_15229(var4)[1];

      while (!var11.method_15214(var14, var15) || var12 || var7 != var1) {
         var12 = false;
         if (++var13 > this.field_16741) {
            break;
         }

         var11.method_30834(var14, var15);
         if (this.field_16743 != null) {
            this.field_16743.method_26961(var14, var15);
         }

         class_7133 var16 = this.method_15708(var7, var14, var15, method_15706(var7, var9 + var10));
         class_5485 var17 = this.method_15704(var8, var16);
         if (var17 == null) {
            var9 = method_15706(var7, var9 + var10);
            var14 = var7.method_15229(var9)[0];
            var15 = var7.method_15229(var9)[1];
         } else {
            class_7133 var18 = var17.field_27957;
            class_1440 var19 = var17.field_27960;
            var14 = var19.field_7766;
            var15 = var19.field_7765;
            if (this.field_16743 != null) {
               this.field_16743.method_26960(var14, var15);
            }

            if (!var8.method_15214(var14, var15)) {
               float var24 = var18.method_32771() / var18.method_32768();
               float var21 = var18.method_32753() / var18.method_32768();
               var24 *= this.field_16745;
               var21 *= this.field_16745;
               if (!var7.method_15224(var19.field_7766 + var24, var19.field_7765 + var21)) {
                  if (!var7.method_15224(var19.field_7766 - var24, var19.field_7765 - var21)) {
                     if (var3) {
                        break;
                     }

                     int var23 = var17.field_27962;
                     var10 = 1;
                     class_3316 var28 = var7;
                     var7 = var8;
                     var8 = var28;
                     var9 = method_15706(var7, var23 + var10);
                     var14 = var7.method_15229(var9)[0];
                     var15 = var7.method_15229(var9)[1];
                  } else {
                     if (!var3) {
                        if (var7 != var2) {
                           var9 = var17.field_27962;
                           var10 = 1;
                        } else {
                           var9 = var17.field_27962;
                           var10 = 1;
                        }
                     } else if (var7 != var1) {
                        var9 = var17.field_27962;
                        var10 = 1;
                     } else {
                        var9 = var17.field_27959;
                        var10 = -1;
                     }

                     class_3316 var27 = var7;
                     var7 = var8;
                     var8 = var27;
                  }
               } else {
                  if (!var3) {
                     if (var7 != var1) {
                        var9 = var17.field_27959;
                        var10 = -1;
                     } else {
                        var9 = var17.field_27959;
                        var10 = -1;
                     }
                  } else if (var7 != var2) {
                     var9 = var17.field_27962;
                     var10 = 1;
                  } else {
                     var9 = var17.field_27959;
                     var10 = -1;
                  }

                  class_3316 var22 = var7;
                  var7 = var8;
                  var8 = var22;
               }
            } else {
               var9 = var8.method_15221(var19.field_7766, var19.field_7765);
               var10 = 1;
               var14 = var19.field_7766;
               var15 = var19.field_7765;
               class_3316 var20 = var7;
               var7 = var8;
               var8 = var20;
            }
         }
      }

      var11.method_30834(var14, var15);
      if (this.field_16743 != null) {
         this.field_16743.method_26961(var14, var15);
      }

      return var11;
   }

   public class_5485 method_15704(class_3316 var1, class_7133 var2) {
      float var5 = Float.MAX_VALUE;
      class_5485 var6 = null;

      for (int var7 = 0; var7 < var1.method_15223(); var7++) {
         int var8 = method_15706(var1, var7 + 1);
         class_7133 var9 = this.method_15709(var1, var7, var8);
         class_1440 var10 = var2.method_32765(var9, true);
         if (var10 != null) {
            float var11 = var10.method_6598(var2.method_32769());
            if (var11 < var5 && var11 > this.field_16744) {
               var6 = new class_5485(this);
               var6.field_27960 = var10;
               var6.field_27957 = var9;
               var6.field_27962 = var7;
               var6.field_27959 = var8;
               var5 = var11;
            }
         }
      }

      return var6;
   }

   public static int method_15706(class_3316 var0, int var1) {
      while (var1 < 0) {
         var1 += var0.method_15223();
      }

      while (var1 >= var0.method_15223()) {
         var1 -= var0.method_15223();
      }

      return var1;
   }

   public class_7133 method_15709(class_3316 var1, int var2, int var3) {
      float[] var6 = var1.method_15229(var2);
      float[] var7 = var1.method_15229(var3);
      return new class_7133(var6[0], var6[1], var7[0], var7[1]);
   }

   public class_7133 method_15708(class_3316 var1, float var2, float var3, int var4) {
      float[] var7 = var1.method_15229(var4);
      return new class_7133(var2, var3, var7[0], var7[1]);
   }
}
