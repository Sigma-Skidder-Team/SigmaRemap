package mapped;

import java.util.ArrayList;

public class Class8030 {
   private static String[] field34506;
   public float field34507 = 1.0E-4F;
   public float field34508 = 1.0F;
   public int field34509 = 10000;
   public Class8789 field34510;

   public Class2520[] method27530(Class2520 var1, Class2520 var2) {
      var1 = var1.method10577(new Class8412());
      var2 = var2.method10577(new Class8412());
      int var5 = 0;

      for (int var6 = 0; var6 < var1.method10595(); var6++) {
         if (var2.method10602(var1.method10596(var6)[0], var1.method10596(var6)[1])) {
            var5++;
         }
      }

      if (var5 == var1.method10595()) {
         return new Class2520[0];
      } else if (var1.method10603(var2)) {
         int var10 = 0;

         for (int var7 = 0; var7 < var2.method10595(); var7++) {
            if (var1.method10602(var2.method10596(var7)[0], var2.method10596(var7)[1])
               && !this.method27531(var1, var2.method10596(var7)[0], var2.method10596(var7)[1])) {
               var10++;
            }
         }

         for (int var11 = 0; var11 < var1.method10595(); var11++) {
            if (var2.method10602(var1.method10596(var11)[0], var1.method10596(var11)[1])
               && !this.method27531(var2, var1.method10596(var11)[0], var1.method10596(var11)[1])) {
               var10++;
            }
         }

         return var10 >= 1 ? this.method27534(var1, var2, true) : new Class2520[]{var1};
      } else {
         return new Class2520[]{var1};
      }
   }

   private boolean method27531(Class2520 var1, float var2, float var3) {
      for (int var6 = 0; var6 < var1.method10595() + 1; var6++) {
         int var7 = method27537(var1, var6 + 1);
         Class2530 var8 = this.method27538(var1, method27537(var1, var6), var7);
         if (var8.method10671(new Class2532(var2, var3)) < this.field34507 * 100.0F) {
            return true;
         }
      }

      return false;
   }

   public void method27532(Class8789 var1) {
      this.field34510 = var1;
   }

   public Class2520[] method27533(Class2520 var1, Class2520 var2) {
      var1 = var1.method10577(new Class8412());
      var2 = var2.method10577(new Class8412());
      if (!var1.method10603(var2)) {
         return new Class2520[]{var1, var2};
      } else {
         boolean var5 = false;
         int var6 = 0;

         for (int var7 = 0; var7 < var1.method10595(); var7++) {
            if (var2.method10602(var1.method10596(var7)[0], var1.method10596(var7)[1])
               && !var2.method10604(var1.method10596(var7)[0], var1.method10596(var7)[1])) {
               var5 = true;
               break;
            }

            if (var2.method10604(var1.method10596(var7)[0], var1.method10596(var7)[1])) {
               var6++;
            }
         }

         for (int var10 = 0; var10 < var2.method10595(); var10++) {
            if (var1.method10602(var2.method10596(var10)[0], var2.method10596(var10)[1])
               && !var1.method10604(var2.method10596(var10)[0], var2.method10596(var10)[1])) {
               var5 = true;
               break;
            }
         }

         return !var5 && var6 < 2 ? new Class2520[]{var1, var2} : this.method27534(var1, var2, false);
      }
   }

   private Class2520[] method27534(Class2520 var1, Class2520 var2, boolean var3) {
      if (!var3) {
         for (int var15 = 0; var15 < var1.method10595(); var15++) {
            if (!var2.method10602(var1.method10596(var15)[0], var1.method10596(var15)[1])
               && !var2.method10604(var1.method10596(var15)[0], var1.method10596(var15)[1])) {
               Class2520 var16 = this.method27535(var1, var2, false, var15);
               return new Class2520[]{var16};
            }
         }

         return new Class2520[]{var2};
      } else {
         ArrayList<Class2520> var6 = new ArrayList();
         ArrayList var7 = new ArrayList();

         for (int var8 = 0; var8 < var1.method10595(); var8++) {
            float[] var9 = var1.method10596(var8);
            if (var2.method10602(var9[0], var9[1])) {
               var7.add(new Class2532(var9[0], var9[1]));
               if (this.field34510 != null) {
                  this.field34510.method31723(var9[0], var9[1]);
               }
            }
         }

         for (int var17 = 0; var17 < var1.method10595(); var17++) {
            float[] var18 = var1.method10596(var17);
            Class2532 var10 = new Class2532(var18[0], var18[1]);
            if (!var7.contains(var10)) {
               Class2520 var11 = this.method27535(var1, var2, true, var17);
               var6.add(var11);

               for (int var12 = 0; var12 < var11.method10595(); var12++) {
                  float[] var13 = var11.method10596(var12);
                  Class2532 var14 = new Class2532(var13[0], var13[1]);
                  var7.add(var14);
               }
            }
         }

         return var6.toArray(new Class2520[0]);
      }
   }

   private Class2520 method27535(Class2520 var1, Class2520 var2, boolean var3, int var4) {
      Class2520 var7 = var1;
      Class2520 var8 = var2;
      int var9 = var4;
      int var10 = 1;
      Class2526 var11 = new Class2526();
      boolean var12 = true;
      int var13 = 0;
      float var14 = var1.method10596(var4)[0];
      float var15 = var1.method10596(var4)[1];

      while (!var11.method10604(var14, var15) || var12 || var7 != var1) {
         var12 = false;
         if (++var13 > this.field34509) {
            break;
         }

         var11.method10642(var14, var15);
         if (this.field34510 != null) {
            this.field34510.method31725(var14, var15);
         }

         Class2530 var16 = this.method27539(var7, var14, var15, method27537(var7, var9 + var10));
         Class8675 var17 = this.method27536(var8, var16);
         if (var17 == null) {
            var9 = method27537(var7, var9 + var10);
            var14 = var7.method10596(var9)[0];
            var15 = var7.method10596(var9)[1];
         } else {
            Class2530 var18 = var17.field39100;
            Class2532 var19 = var17.field39103;
            var14 = var19.field16737;
            var15 = var19.field16738;
            if (this.field34510 != null) {
               this.field34510.method31724(var14, var15);
            }

            if (!var8.method10604(var14, var15)) {
               float var24 = var18.method10665() / var18.method10661();
               float var21 = var18.method10666() / var18.method10661();
               var24 *= this.field34508;
               var21 *= this.field34508;
               if (!var7.method10602(var19.field16737 + var24, var19.field16738 + var21)) {
                  if (!var7.method10602(var19.field16737 - var24, var19.field16738 - var21)) {
                     if (var3) {
                        break;
                     }

                     int var23 = var17.field39101;
                     var10 = 1;
                     Class2520 var28 = var7;
                     var7 = var8;
                     var8 = var28;
                     var9 = method27537(var7, var23 + var10);
                     var14 = var7.method10596(var9)[0];
                     var15 = var7.method10596(var9)[1];
                  } else {
                     if (!var3) {
                        if (var7 != var2) {
                           var9 = var17.field39101;
                           var10 = 1;
                        } else {
                           var9 = var17.field39101;
                           var10 = 1;
                        }
                     } else if (var7 != var1) {
                        var9 = var17.field39101;
                        var10 = 1;
                     } else {
                        var9 = var17.field39102;
                        var10 = -1;
                     }

                     Class2520 var27 = var7;
                     var7 = var8;
                     var8 = var27;
                  }
               } else {
                  if (!var3) {
                     if (var7 != var1) {
                        var9 = var17.field39102;
                        var10 = -1;
                     } else {
                        var9 = var17.field39102;
                        var10 = -1;
                     }
                  } else if (var7 != var2) {
                     var9 = var17.field39101;
                     var10 = 1;
                  } else {
                     var9 = var17.field39102;
                     var10 = -1;
                  }

                  Class2520 var22 = var7;
                  var7 = var8;
                  var8 = var22;
               }
            } else {
               var9 = var8.method10601(var19.field16737, var19.field16738);
               var10 = 1;
               var14 = var19.field16737;
               var15 = var19.field16738;
               Class2520 var20 = var7;
               var7 = var8;
               var8 = var20;
            }
         }
      }

      var11.method10642(var14, var15);
      if (this.field34510 != null) {
         this.field34510.method31725(var14, var15);
      }

      return var11;
   }

   public Class8675 method27536(Class2520 var1, Class2530 var2) {
      float var5 = Float.MAX_VALUE;
      Class8675 var6 = null;

      for (int var7 = 0; var7 < var1.method10595(); var7++) {
         int var8 = method27537(var1, var7 + 1);
         Class2530 var9 = this.method27538(var1, var7, var8);
         Class2532 var10 = var2.method10676(var9, true);
         if (var10 != null) {
            float var11 = var10.method10701(var2.method10659());
            if (var11 < var5 && var11 > this.field34507) {
               var6 = new Class8675(this);
               var6.field39103 = var10;
               var6.field39100 = var9;
               var6.field39101 = var7;
               var6.field39102 = var8;
               var5 = var11;
            }
         }
      }

      return var6;
   }

   public static int method27537(Class2520 var0, int var1) {
      while (var1 < 0) {
         var1 += var0.method10595();
      }

      while (var1 >= var0.method10595()) {
         var1 -= var0.method10595();
      }

      return var1;
   }

   public Class2530 method27538(Class2520 var1, int var2, int var3) {
      float[] var6 = var1.method10596(var2);
      float[] var7 = var1.method10596(var3);
      return new Class2530(var6[0], var6[1], var7[0], var7[1]);
   }

   public Class2530 method27539(Class2520 var1, float var2, float var3, int var4) {
      float[] var7 = var1.method10596(var4);
      return new Class2530(var2, var3, var7[0], var7[1]);
   }
}
