package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class7796 {
   private static long field33485 = 8192L;
   private static long field33486 = 65536L;
   private static long field33487 = 65536L;
   private static long field33488 = 65536L;
   private static boolean field33489 = false;

   public static void method25890(long var0) {

   }

   public static long method25891() {
      return field33485;
   }

   public static long method25892() {
      return field33486;
   }

   public static long method25893() {
      return field33487;
   }

   public static long method25894() {
      return field33488;
   }

   public static void method25895(long var0) {
      if (var0 >= 1024L) {
         field33485 = var0;
      } else {
         field33485 = 1024L;
      }
   }

   public static void method25896(long var0) {
      if (var0 >= 1024L) {
         field33486 = var0;
      } else {
         field33486 = 1024L;
      }
   }

   public static void method25897(long var0) {
      if (var0 >= 4096L) {
         field33487 = var0;
      } else {
         field33487 = 4096L;
      }
   }

   public static void method25898(long var0) {
      field33488 = var0;
   }

   public static void method25899() {
      field33485 = 8192L;
      field33486 = 65536L;
   }

   public static void method25900() {
      field33487 = 65536L;
      field33488 = 65536L;
   }

   public static boolean method25901() {
      return field33489;
   }

   public static void method25902(boolean var0) {
      field33489 = var0;
   }

   public static int method25903(int var0) {
      if (var0 >= 1) {
         if ((var0 & var0 - 1) != 0) {
            var0 |= var0 >>> 1;
            var0 |= var0 >>> 2;
            var0 |= var0 >>> 4;
            var0 |= var0 >>> 8;
            var0 |= var0 >>> 16;
            return var0 + 1;
         } else {
            return var0;
         }
      } else {
         throw new IllegalArgumentException("x must be greater or equal 1");
      }
   }

   public static long method25904(long var0) {
      if (var0 >= 1L) {
         if ((var0 & var0 - 1L) != 0L) {
            var0 |= var0 >>> 1;
            var0 |= var0 >>> 2;
            var0 |= var0 >>> 4;
            var0 |= var0 >>> 8;
            var0 |= var0 >>> 16;
            var0 |= var0 >>> 32;
            return var0 + 1L;
         } else {
            return var0;
         }
      } else {
         throw new IllegalArgumentException("x must be greater or equal 1");
      }
   }

   public static int method25905(int var0) {
      if (var0 >= 1) {
         return (int)Class9044.method33569(2.0, Class9044.method33598(Class9044.method33564((double)var0) / Class9044.method33564(2.0)));
      } else {
         throw new IllegalArgumentException("x must be greater or equal 1");
      }
   }

   public static long method25906(long var0) {
      if (var0 >= 1L) {
         return (long)Class9044.method33569(2.0, Class9044.method33598(Class9044.method33564((double)var0) / Class9044.method33564(2.0)));
      } else {
         throw new IllegalArgumentException("x must be greater or equal 1");
      }
   }

   public static boolean method25907(int var0) {
      return var0 > 0 ? (var0 & var0 - 1) == 0 : false;
   }

   public static boolean method25908(long var0) {
      return var0 > 0L ? (var0 & var0 - 1L) == 0L : false;
   }

   public static long method25909(long var0, int[] var2) {
      long var5 = var0;
      if (var0 <= 0L) {
         throw new IllegalArgumentException("n must be positive integer");
      } else {
         for (int var7 = 0; var7 < var2.length && var5 != 1L; var7++) {
            long var8 = (long)var2[var7];

            while (var5 % var8 == 0L) {
               var5 /= var8;
            }
         }

         return var5;
      }
   }

   public static void method25910(int var0, int[] var1) {
      var1[2] = 0;
      var1[3] = 16;
      int var4 = 2;

      for (int var5 = var0; var5 > 32; var5 >>= 2) {
         int var6 = var4 << 1;
         int var7 = var6 << 3;

         for (int var8 = var4; var8 < var6; var8++) {
            int var9 = var1[var8] << 2;
            var1[var4 + var8] = var9;
            var1[var6 + var8] = var9 + var7;
         }

         var4 = var6;
      }
   }

   public static void method25911(long var0, Class2382 var2) {
      var2.method9683(2L, 0L);
      var2.method9683(3L, 16L);
      long var5 = 2L;

      for (long var7 = var0; var7 > 32L; var7 >>= 2) {
         long var9 = var5 << 1;
         long var11 = var9 << 3;

         for (long var13 = var5; var13 < var9; var13++) {
            long var15 = var2.method9649(var13) << 2;
            var2.method9683(var5 + var13, var15);
            var2.method9683(var9 + var13, var15 + var11);
         }

         var5 = var9;
      }
   }

   public static void method25912(int var0, int[] var1, double[] var2) {
      var1[0] = var0;
      var1[1] = 1;
      if (var0 > 2) {
         int var5 = var0 >> 1;
         double var6 = (Math.PI / 4) / (double)var5;
         double var8 = var6 * 2.0;
         double var10 = Class9044.method33578(var6 * (double)var5);
         var2[0] = 1.0;
         var2[1] = var10;
         if (var5 != 4) {
            if (var5 > 4) {
               method25910(var0, var1);
               var2[2] = 0.5 / Class9044.method33578(var8);
               var2[3] = 0.5 / Class9044.method33578(var6 * 6.0);

               for (int var13 = 4; var13 < var5; var13 += 4) {
                  double var14 = var6 * (double)var13;
                  double var16 = 3.0 * var14;
                  var2[var13] = Class9044.method33578(var14);
                  var2[var13 + 1] = Class9044.method33577(var14);
                  var2[var13 + 2] = Class9044.method33578(var16);
                  var2[var13 + 3] = -Class9044.method33577(var16);
               }
            }
         } else {
            var2[2] = Class9044.method33578(var8);
            var2[3] = Class9044.method33577(var8);
         }

         int var12 = 0;

         while (var5 > 2) {
            int var18 = var12 + var5;
            var5 >>= 1;
            var2[var18] = 1.0;
            var2[var18 + 1] = var10;
            if (var5 != 4) {
               if (var5 > 4) {
                  double var30 = var2[var12 + 4];
                  double var23 = var2[var12 + 6];
                  var2[var18 + 2] = 0.5 / var30;
                  var2[var18 + 3] = 0.5 / var23;

                  for (int var29 = 4; var29 < var5; var29 += 4) {
                     int var25 = var12 + 2 * var29;
                     int var26 = var18 + var29;
                     var30 = var2[var25];
                     double var32 = var2[var25 + 1];
                     var23 = var2[var25 + 2];
                     double var27 = var2[var25 + 3];
                     var2[var26] = var30;
                     var2[var26 + 1] = var32;
                     var2[var26 + 2] = var23;
                     var2[var26 + 3] = var27;
                  }
               }
            } else {
               double var19 = var2[var12 + 4];
               double var21 = var2[var12 + 5];
               var2[var18 + 2] = var19;
               var2[var18 + 3] = var21;
            }

            var12 = var18;
         }
      }
   }

   public static void method25913(long var0, Class2382 var2, Class2381 var3) {
      var2.method9683(0L, var0);
      var2.method9683(1L, 1L);
      if (var0 > 2L) {
         long var6 = var0 >> 1;
         double var8 = (Math.PI / 4) / (double)var6;
         double var10 = var8 * 2.0;
         double var12 = Class9044.method33578(var8 * (double)var6);
         var3.method9687(0L, 1.0);
         var3.method9687(1L, var12);
         if (var6 != 4L) {
            if (var6 > 4L) {
               method25911(var0, var2);
               var3.method9687(2L, 0.5 / Class9044.method33578(var10));
               var3.method9687(3L, 0.5 / Class9044.method33578(var8 * 6.0));

               for (long var16 = 4L; var16 < var6; var16 += 4L) {
                  double var18 = var8 * (double)var16;
                  double var20 = 3.0 * var18;
                  var3.method9687(var16, Class9044.method33578(var18));
                  var3.method9687(var16 + 1L, Class9044.method33577(var18));
                  var3.method9687(var16 + 2L, Class9044.method33578(var20));
                  var3.method9687(var16 + 3L, -Class9044.method33577(var20));
               }
            }
         } else {
            var3.method9687(2L, Class9044.method33578(var10));
            var3.method9687(3L, Class9044.method33577(var10));
         }

         long var14 = 0L;

         while (var6 > 2L) {
            long var22 = var14 + var6;
            var6 >>= 1;
            var3.method9687(var22, 1.0);
            var3.method9687(var22 + 1L, var12);
            if (var6 != 4L) {
               if (var6 > 4L) {
                  double var37 = var3.method9653(var14 + 4L);
                  double var28 = var3.method9653(var14 + 6L);
                  var3.method9687(var22 + 2L, 0.5 / var37);
                  var3.method9687(var22 + 3L, 0.5 / var28);

                  for (long var36 = 4L; var36 < var6; var36 += 4L) {
                     long var30 = var14 + 2L * var36;
                     long var32 = var22 + var36;
                     var37 = var3.method9653(var30);
                     double var39 = var3.method9653(var30 + 1L);
                     var28 = var3.method9653(var30 + 2L);
                     double var34 = var3.method9653(var30 + 3L);
                     var3.method9687(var32, var37);
                     var3.method9687(var32 + 1L, var39);
                     var3.method9687(var32 + 2L, var28);
                     var3.method9687(var32 + 3L, var34);
                  }
               }
            } else {
               double var24 = var3.method9653(var14 + 4L);
               double var26 = var3.method9653(var14 + 5L);
               var3.method9687(var22 + 2L, var24);
               var3.method9687(var22 + 3L, var26);
            }

            var14 = var22;
         }
      }
   }

   public static void method25914(int var0, double[] var1, int var2, int[] var3) {
      var3[1] = var0;
      if (var0 > 1) {
         int var6 = var0 >> 1;
         double var7 = (Math.PI / 4) / (double)var6;
         var1[var2] = Class9044.method33578(var7 * (double)var6);
         var1[var2 + var6] = 0.5 * var1[var2];

         for (int var9 = 1; var9 < var6; var9++) {
            double var10 = var7 * (double)var9;
            var1[var2 + var9] = 0.5 * Class9044.method33578(var10);
            var1[var2 + var0 - var9] = 0.5 * Class9044.method33577(var10);
         }
      }
   }

   public static void method25915(long var0, Class2381 var2, long var3, Class2382 var5) {
      var5.method9683(1L, var0);
      if (var0 > 1L) {
         long var8 = var0 >> 1;
         double var10 = (Math.PI / 4) / (double)var8;
         var2.method9687(var3, Class9044.method33578(var10 * (double)var8));
         var2.method9687(var3 + var8, 0.5 * var2.method9653(var3));

         for (long var12 = 1L; var12 < var8; var12++) {
            double var14 = var10 * (double)var12;
            var2.method9687(var3 + var12, 0.5 * Class9044.method33578(var14));
            var2.method9687(var3 + var0 - var12, 0.5 * Class9044.method33577(var14));
         }
      }
   }

   public static void method25916(int var0, float[] var1, int var2, int[] var3) {
      var3[1] = var0;
      if (var0 > 1) {
         int var6 = var0 >> 1;
         float var7 = (float) (Math.PI / 4) / (float)var6;
         var1[var2] = (float)Class9044.method33578((double)(var7 * (float)var6));
         var1[var2 + var6] = 0.5F * var1[var2];

         for (int var8 = 1; var8 < var6; var8++) {
            float var9 = var7 * (float)var8;
            var1[var2 + var8] = 0.5F * (float)Class9044.method33578((double)var9);
            var1[var2 + var0 - var8] = 0.5F * (float)Class9044.method33577((double)var9);
         }
      }
   }

   public static void method25917(long var0, Class2378 var2, long var3, Class2382 var5) {
      var5.method9683(1L, var0);
      if (var0 > 1L) {
         long var8 = var0 >> 1;
         float var10 = (float) (Math.PI / 4) / (float)var8;
         var2.method9685(var3, (float)Class9044.method33578((double)(var10 * (float)var8)));
         var2.method9685(var3 + var8, 0.5F * var2.method9651(var3));

         for (long var11 = 1L; var11 < var8; var11++) {
            float var13 = var10 * (float)var11;
            var2.method9685(var3 + var11, 0.5F * (float)Class9044.method33578((double)var13));
            var2.method9685(var3 + var0 - var11, 0.5F * (float)Class9044.method33577((double)var13));
         }
      }
   }

   public static void method25918(int var0, int[] var1, float[] var2) {
      var1[0] = var0;
      var1[1] = 1;
      if (var0 > 2) {
         int var5 = var0 >> 1;
         float var6 = (float) (Math.PI / 4) / (float)var5;
         float var7 = var6 * 2.0F;
         float var8 = (float)Class9044.method33578((double)(var6 * (float)var5));
         var2[0] = 1.0F;
         var2[1] = var8;
         if (var5 != 4) {
            if (var5 > 4) {
               method25910(var0, var1);
               var2[2] = 0.5F / (float)Class9044.method33578((double)var7);
               var2[3] = 0.5F / (float)Class9044.method33578((double)(var6 * 6.0F));

               for (int var10 = 4; var10 < var5; var10 += 4) {
                  float var11 = var6 * (float)var10;
                  float var12 = 3.0F * var11;
                  var2[var10] = (float)Class9044.method33578((double)var11);
                  var2[var10 + 1] = (float)Class9044.method33577((double)var11);
                  var2[var10 + 2] = (float)Class9044.method33578((double)var12);
                  var2[var10 + 3] = -((float)Class9044.method33577((double)var12));
               }
            }
         } else {
            var2[2] = (float)Class9044.method33578((double)var7);
            var2[3] = (float)Class9044.method33577((double)var7);
         }

         int var9 = 0;

         while (var5 > 2) {
            int var13 = var9 + var5;
            var5 >>= 1;
            var2[var13] = 1.0F;
            var2[var13 + 1] = var8;
            if (var5 != 4) {
               if (var5 > 4) {
                  float var21 = var2[var9 + 4];
                  float var16 = var2[var9 + 6];
                  var2[var13 + 2] = 0.5F / var21;
                  var2[var13 + 3] = 0.5F / var16;

                  for (int var20 = 4; var20 < var5; var20 += 4) {
                     int var17 = var9 + 2 * var20;
                     int var18 = var13 + var20;
                     var21 = var2[var17];
                     float var23 = var2[var17 + 1];
                     var16 = var2[var17 + 2];
                     float var19 = var2[var17 + 3];
                     var2[var18] = var21;
                     var2[var18 + 1] = var23;
                     var2[var18 + 2] = var16;
                     var2[var18 + 3] = var19;
                  }
               }
            } else {
               float var14 = var2[var9 + 4];
               float var15 = var2[var9 + 5];
               var2[var13 + 2] = var14;
               var2[var13 + 3] = var15;
            }

            var9 = var13;
         }
      }
   }

   public static void method25919(long var0, Class2382 var2, Class2378 var3) {
      var2.method9683(0L, var0);
      var2.method9683(1L, 1L);
      if (var0 > 2L) {
         long var6 = var0 >> 1;
         float var8 = (float) (Math.PI / 4) / (float)var6;
         float var9 = var8 * 2.0F;
         float var10 = (float)Class9044.method33578((double)(var8 * (float)var6));
         var3.method9685(0L, 1.0F);
         var3.method9685(1L, var10);
         if (var6 != 4L) {
            if (var6 > 4L) {
               method25911(var0, var2);
               var3.method9685(2L, 0.5F / (float)Class9044.method33578((double)var9));
               var3.method9685(3L, 0.5F / (float)Class9044.method33578((double)(var8 * 6.0F)));

               for (long var13 = 4L; var13 < var6; var13 += 4L) {
                  float var15 = var8 * (float)var13;
                  float var16 = 3.0F * var15;
                  var3.method9685(var13, (float)Class9044.method33578((double)var15));
                  var3.method9685(var13 + 1L, (float)Class9044.method33577((double)var15));
                  var3.method9685(var13 + 2L, (float)Class9044.method33578((double)var16));
                  var3.method9685(var13 + 3L, -((float)Class9044.method33577((double)var16)));
               }
            }
         } else {
            var3.method9685(2L, (float)Class9044.method33578((double)var9));
            var3.method9685(3L, (float)Class9044.method33577((double)var9));
         }

         long var11 = 0L;

         while (var6 > 2L) {
            long var17 = var11 + var6;
            var6 >>= 1;
            var3.method9685(var17, 1.0F);
            var3.method9685(var17 + 1L, var10);
            if (var6 != 4L) {
               if (var6 > 4L) {
                  float var28 = var3.method9651(var11 + 4L);
                  float var21 = var3.method9651(var11 + 6L);
                  var3.method9685(var17 + 2L, 0.5F / var28);
                  var3.method9685(var17 + 3L, 0.5F / var21);

                  for (long var27 = 4L; var27 < var6; var27 += 4L) {
                     long var22 = var11 + 2L * var27;
                     long var24 = var17 + var27;
                     var28 = var3.method9651(var22);
                     float var30 = var3.method9651(var22 + 1L);
                     var21 = var3.method9651(var22 + 2L);
                     float var26 = var3.method9651(var22 + 3L);
                     var3.method9685(var24, var28);
                     var3.method9685(var24 + 1L, var30);
                     var3.method9685(var24 + 2L, var21);
                     var3.method9685(var24 + 3L, var26);
                  }
               }
            } else {
               float var19 = var3.method9651(var11 + 4L);
               float var20 = var3.method9651(var11 + 5L);
               var3.method9685(var17 + 2L, var19);
               var3.method9685(var17 + 3L, var20);
            }

            var11 = var17;
         }
      }
   }

   public static void method25920(int var0, double[] var1, int var2, int[] var3, int var4, double[] var5) {
      if (var0 <= 8) {
         if (var0 != 8) {
            if (var0 == 4) {
               method25968(var1, var2);
            }
         } else {
            method25962(var1, var2);
         }
      } else if (var0 <= 32) {
         if (var0 != 32) {
            method25958(var1, var2, var5, 0);
            method25932(var1, var2);
         } else {
            method25954(var1, var2, var5, var4 - 8);
            method25928(var1, var2);
         }
      } else {
         method25936(var0, var1, var2, var5, var4 - (var0 >> 2));
         if (Class7008.method21726() > 1 && (long)var0 >= method25891()) {
            method25940(var0, var1, var2, var4, var5);
         } else if (var0 <= 512) {
            if (var0 <= 128) {
               method25952(var0, var1, var2, var4, var5);
            } else {
               method25946(var0, 1, var1, var2, var4, var5);
            }
         } else {
            method25942(var0, var1, var2, var4, var5);
         }

         method25924(var0, var3, var1, var2);
      }
   }

   public static void method25921(long var0, Class2381 var2, long var3, Class2382 var5, long var6, Class2381 var8) {
      if (var0 <= 8L) {
         if (var0 != 8L) {
            if (var0 == 4L) {
               method25969(var2, var3);
            }
         } else {
            method25963(var2, var3);
         }
      } else if (var0 <= 32L) {
         if (var0 != 32L) {
            method25959(var2, var3, var8, 0L);
            method25933(var2, var3);
         } else {
            method25955(var2, var3, var8, var6 - 8L);
            method25929(var2, var3);
         }
      } else {
         method25937(var0, var2, var3, var8, var6 - (var0 >> 2));
         if (Class7008.method21726() > 1 && var0 >= method25891()) {
            method25941(var0, var2, var3, var6, var8);
         } else if (var0 <= 512L) {
            if (var0 <= 128L) {
               method25953(var0, var2, var3, var6, var8);
            } else {
               method25947(var0, 1L, var2, var3, var6, var8);
            }
         } else {
            method25943(var0, var2, var3, var6, var8);
         }

         method25925(var0, var5, var2, var3);
      }
   }

   public static void method25922(int var0, double[] var1, int var2, int[] var3, int var4, double[] var5) {
      if (var0 <= 8) {
         if (var0 != 8) {
            if (var0 == 4) {
               method25968(var1, var2);
            }
         } else {
            method25964(var1, var2);
         }
      } else if (var0 <= 32) {
         if (var0 != 32) {
            method25958(var1, var2, var5, 0);
            method25934(var1, var2);
         } else {
            method25954(var1, var2, var5, var4 - 8);
            method25930(var1, var2);
         }
      } else {
         method25938(var0, var1, var2, var5, var4 - (var0 >> 2));
         if (Class7008.method21726() > 1 && (long)var0 >= method25891()) {
            method25940(var0, var1, var2, var4, var5);
         } else if (var0 <= 512) {
            if (var0 <= 128) {
               method25952(var0, var1, var2, var4, var5);
            } else {
               method25946(var0, 1, var1, var2, var4, var5);
            }
         } else {
            method25942(var0, var1, var2, var4, var5);
         }

         method25926(var0, var3, var1, var2);
      }
   }

   public static void method25923(long var0, Class2381 var2, long var3, Class2382 var5, long var6, Class2381 var8) {
      if (var0 <= 8L) {
         if (var0 != 8L) {
            if (var0 == 4L) {
               method25969(var2, var3);
            }
         } else {
            method25965(var2, var3);
         }
      } else if (var0 <= 32L) {
         if (var0 != 32L) {
            method25959(var2, var3, var8, 0L);
            method25935(var2, var3);
         } else {
            method25955(var2, var3, var8, var6 - 8L);
            method25931(var2, var3);
         }
      } else {
         method25939(var0, var2, var3, var8, var6 - (var0 >> 2));
         if (Class7008.method21726() > 1 && var0 >= method25891()) {
            method25941(var0, var2, var3, var6, var8);
         } else if (var0 <= 512L) {
            if (var0 <= 128L) {
               method25953(var0, var2, var3, var6, var8);
            } else {
               method25947(var0, 1L, var2, var3, var6, var8);
            }
         } else {
            method25943(var0, var2, var3, var6, var8);
         }

         method25927(var0, var5, var2, var3);
      }
   }

   public static void method25924(int var0, int[] var1, double[] var2, int var3) {
      byte var6 = 1;

      int var7;
      for (var7 = var0 >> 2; var7 > 8; var7 >>= 2) {
         var6 <<= 1;
      }

      int var8 = var0 >> 1;
      int var9 = 4 * var6;
      if (var7 != 8) {
         for (int var10 = 0; var10 < var6; var10++) {
            int var11 = 4 * var10;

            for (int var12 = 0; var12 < var10; var12++) {
               int var14 = 4 * var12 + var1[var6 + var10];
               int var13 = var11 + var1[var6 + var12];
               int var15 = var3 + var14;
               int var16 = var3 + var13;
               double var17 = var2[var15];
               double var19 = var2[var15 + 1];
               double var21 = var2[var16];
               double var23 = var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 += var9;
               var13 += var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = var2[var15 + 1];
               var21 = var2[var16];
               var23 = var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 += var8;
               var13 += 2;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = var2[var15 + 1];
               var21 = var2[var16];
               var23 = var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 -= var9;
               var13 -= var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = var2[var15 + 1];
               var21 = var2[var16];
               var23 = var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 += 2;
               var13 += var8;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = var2[var15 + 1];
               var21 = var2[var16];
               var23 = var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 += var9;
               var13 += var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = var2[var15 + 1];
               var21 = var2[var16];
               var23 = var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 -= var8;
               var13 -= 2;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = var2[var15 + 1];
               var21 = var2[var16];
               var23 = var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 -= var9;
               var13 -= var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = var2[var15 + 1];
               var21 = var2[var16];
               var23 = var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
            }

            int var35 = var11 + var1[var6 + var10];
            int var68 = var35 + 2;
            var35 += var8;
            int var99 = var3 + var68;
            int var130 = var3 + var35;
            double var161 = var2[var99];
            double var192 = var2[var99 + 1];
            double var223 = var2[var130];
            double var254 = var2[var130 + 1];
            var2[var99] = var223;
            var2[var99 + 1] = var254;
            var2[var130] = var161;
            var2[var130 + 1] = var192;
            var68 += var9;
            var35 += var9;
            var99 = var3 + var68;
            var130 = var3 + var35;
            var161 = var2[var99];
            var192 = var2[var99 + 1];
            var223 = var2[var130];
            var254 = var2[var130 + 1];
            var2[var99] = var223;
            var2[var99 + 1] = var254;
            var2[var130] = var161;
            var2[var130 + 1] = var192;
         }
      } else {
         for (int var25 = 0; var25 < var6; var25++) {
            int var26 = 4 * var25;

            for (int var27 = 0; var27 < var25; var27++) {
               int var70 = 4 * var27 + 2 * var1[var6 + var25];
               int var38 = var26 + 2 * var1[var6 + var27];
               int var101 = var3 + var70;
               int var132 = var3 + var38;
               double var163 = var2[var101];
               double var194 = var2[var101 + 1];
               double var225 = var2[var132];
               double var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 += 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 -= var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 += 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var8;
               var38 += 2;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 -= 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 += var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 -= 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += 2;
               var38 += var8;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 += 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 -= var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 += 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var8;
               var38 -= 2;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 -= 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 += var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 -= 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = var2[var101 + 1];
               var225 = var2[var132];
               var256 = var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
            }

            int var54 = var26 + 2 * var1[var6 + var25];
            int var86 = var54 + 2;
            var54 += var8;
            int var117 = var3 + var86;
            int var148 = var3 + var54;
            double var179 = var2[var117];
            double var210 = var2[var117 + 1];
            double var241 = var2[var148];
            double var272 = var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var86 += var9;
            var54 += 2 * var9;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var179 = var2[var117];
            var210 = var2[var117 + 1];
            var241 = var2[var148];
            var272 = var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var86 += var9;
            var54 -= var9;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var179 = var2[var117];
            var210 = var2[var117 + 1];
            var241 = var2[var148];
            var272 = var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var86 -= 2;
            var54 -= var8;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var179 = var2[var117];
            var210 = var2[var117 + 1];
            var241 = var2[var148];
            var272 = var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var86 += var8 + 2;
            var54 += var8 + 2;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var179 = var2[var117];
            var210 = var2[var117 + 1];
            var241 = var2[var148];
            var272 = var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var86 -= var8 - var9;
            var54 += 2 * var9 - 2;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var179 = var2[var117];
            var210 = var2[var117 + 1];
            var241 = var2[var148];
            var272 = var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
         }
      }
   }

   public static void method25925(long var0, Class2382 var2, Class2381 var3, long var4) {
      long var8 = 1L;

      long var10;
      for (var10 = var0 >> 2; var10 > 8L; var10 >>= 2) {
         var8 <<= 1;
      }

      long var12 = var0 >> 1;
      long var14 = 4L * var8;
      if (var10 != 8L) {
         for (long var16 = 0L; var16 < var8; var16++) {
            long var18 = 4L * var16;

            for (long var20 = 0L; var20 < var16; var20++) {
               long var24 = 4L * var20 + var2.method9649(var8 + var16);
               long var22 = var18 + var2.method9649(var8 + var20);
               long var26 = var4 + var24;
               long var28 = var4 + var22;
               double var30 = var3.method9653(var26);
               double var32 = var3.method9653(var26 + 1L);
               double var34 = var3.method9653(var28);
               double var36 = var3.method9653(var28 + 1L);
               var3.method9687(var26, var34);
               var3.method9687(var26 + 1L, var36);
               var3.method9687(var28, var30);
               var3.method9687(var28 + 1L, var32);
               var24 += var14;
               var22 += var14;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9653(var26);
               var32 = var3.method9653(var26 + 1L);
               var34 = var3.method9653(var28);
               var36 = var3.method9653(var28 + 1L);
               var3.method9687(var26, var34);
               var3.method9687(var26 + 1L, var36);
               var3.method9687(var28, var30);
               var3.method9687(var28 + 1L, var32);
               var24 += var12;
               var22 += 2L;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9653(var26);
               var32 = var3.method9653(var26 + 1L);
               var34 = var3.method9653(var28);
               var36 = var3.method9653(var28 + 1L);
               var3.method9687(var26, var34);
               var3.method9687(var26 + 1L, var36);
               var3.method9687(var28, var30);
               var3.method9687(var28 + 1L, var32);
               var24 -= var14;
               var22 -= var14;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9653(var26);
               var32 = var3.method9653(var26 + 1L);
               var34 = var3.method9653(var28);
               var36 = var3.method9653(var28 + 1L);
               var3.method9687(var26, var34);
               var3.method9687(var26 + 1L, var36);
               var3.method9687(var28, var30);
               var3.method9687(var28 + 1L, var32);
               var24 += 2L;
               var22 += var12;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9653(var26);
               var32 = var3.method9653(var26 + 1L);
               var34 = var3.method9653(var28);
               var36 = var3.method9653(var28 + 1L);
               var3.method9687(var26, var34);
               var3.method9687(var26 + 1L, var36);
               var3.method9687(var28, var30);
               var3.method9687(var28 + 1L, var32);
               var24 += var14;
               var22 += var14;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9653(var26);
               var32 = var3.method9653(var26 + 1L);
               var34 = var3.method9653(var28);
               var36 = var3.method9653(var28 + 1L);
               var3.method9687(var26, var34);
               var3.method9687(var26 + 1L, var36);
               var3.method9687(var28, var30);
               var3.method9687(var28 + 1L, var32);
               var24 -= var12;
               var22 -= 2L;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9653(var26);
               var32 = var3.method9653(var26 + 1L);
               var34 = var3.method9653(var28);
               var36 = var3.method9653(var28 + 1L);
               var3.method9687(var26, var34);
               var3.method9687(var26 + 1L, var36);
               var3.method9687(var28, var30);
               var3.method9687(var28 + 1L, var32);
               var24 -= var14;
               var22 -= var14;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9653(var26);
               var32 = var3.method9653(var26 + 1L);
               var34 = var3.method9653(var28);
               var36 = var3.method9653(var28 + 1L);
               var3.method9687(var26, var34);
               var3.method9687(var26 + 1L, var36);
               var3.method9687(var28, var30);
               var3.method9687(var28 + 1L, var32);
            }

            long var48 = var18 + var2.method9649(var8 + var16);
            long var81 = var48 + 2L;
            var48 += var12;
            long var112 = var4 + var81;
            long var143 = var4 + var48;
            double var174 = var3.method9653(var112);
            double var205 = var3.method9653(var112 + 1L);
            double var236 = var3.method9653(var143);
            double var267 = var3.method9653(var143 + 1L);
            var3.method9687(var112, var236);
            var3.method9687(var112 + 1L, var267);
            var3.method9687(var143, var174);
            var3.method9687(var143 + 1L, var205);
            var81 += var14;
            var48 += var14;
            var112 = var4 + var81;
            var143 = var4 + var48;
            var174 = var3.method9653(var112);
            var205 = var3.method9653(var112 + 1L);
            var236 = var3.method9653(var143);
            var267 = var3.method9653(var143 + 1L);
            var3.method9687(var112, var236);
            var3.method9687(var112 + 1L, var267);
            var3.method9687(var143, var174);
            var3.method9687(var143 + 1L, var205);
         }
      } else {
         for (long var38 = 0L; var38 < var8; var38++) {
            long var39 = 4L * var38;

            for (long var40 = 0L; var40 < var38; var40++) {
               long var83 = 4L * var40 + 2L * var2.method9649(var8 + var38);
               long var51 = var39 + 2L * var2.method9649(var8 + var40);
               long var114 = var4 + var83;
               long var145 = var4 + var51;
               double var176 = var3.method9653(var114);
               double var207 = var3.method9653(var114 + 1L);
               double var238 = var3.method9653(var145);
               double var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 += 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 -= var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 += 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var12;
               var51 += 2L;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 -= 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 += var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 -= 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += 2L;
               var51 += var12;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 += 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 -= var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 += 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var12;
               var51 -= 2L;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 -= 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 += var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 -= 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
            }

            long var67 = var39 + 2L * var2.method9649(var8 + var38);
            long var99 = var67 + 2L;
            var67 += var12;
            long var130 = var4 + var99;
            long var161 = var4 + var67;
            double var192 = var3.method9653(var130);
            double var223 = var3.method9653(var130 + 1L);
            double var254 = var3.method9653(var161);
            double var285 = var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var99 += var14;
            var67 += 2L * var14;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var192 = var3.method9653(var130);
            var223 = var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var99 += var14;
            var67 -= var14;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var192 = var3.method9653(var130);
            var223 = var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var99 -= 2L;
            var67 -= var12;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var192 = var3.method9653(var130);
            var223 = var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var99 += var12 + 2L;
            var67 += var12 + 2L;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var192 = var3.method9653(var130);
            var223 = var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var99 -= var12 - var14;
            var67 += 2L * var14 - 2L;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var192 = var3.method9653(var130);
            var223 = var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
         }
      }
   }

   public static void method25926(int var0, int[] var1, double[] var2, int var3) {
      byte var6 = 1;

      int var7;
      for (var7 = var0 >> 2; var7 > 8; var7 >>= 2) {
         var6 <<= 1;
      }

      int var8 = var0 >> 1;
      int var9 = 4 * var6;
      if (var7 != 8) {
         for (int var10 = 0; var10 < var6; var10++) {
            int var11 = 4 * var10;

            for (int var12 = 0; var12 < var10; var12++) {
               int var14 = 4 * var12 + var1[var6 + var10];
               int var13 = var11 + var1[var6 + var12];
               int var15 = var3 + var14;
               int var16 = var3 + var13;
               double var17 = var2[var15];
               double var19 = -var2[var15 + 1];
               double var21 = var2[var16];
               double var23 = -var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 += var9;
               var13 += var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = -var2[var15 + 1];
               var21 = var2[var16];
               var23 = -var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 += var8;
               var13 += 2;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = -var2[var15 + 1];
               var21 = var2[var16];
               var23 = -var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 -= var9;
               var13 -= var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = -var2[var15 + 1];
               var21 = var2[var16];
               var23 = -var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 += 2;
               var13 += var8;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = -var2[var15 + 1];
               var21 = var2[var16];
               var23 = -var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 += var9;
               var13 += var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = -var2[var15 + 1];
               var21 = var2[var16];
               var23 = -var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 -= var8;
               var13 -= 2;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = -var2[var15 + 1];
               var21 = var2[var16];
               var23 = -var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
               var14 -= var9;
               var13 -= var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var19 = -var2[var15 + 1];
               var21 = var2[var16];
               var23 = -var2[var16 + 1];
               var2[var15] = var21;
               var2[var15 + 1] = var23;
               var2[var16] = var17;
               var2[var16 + 1] = var19;
            }

            int var35 = var11 + var1[var6 + var10];
            int var68 = var35 + 2;
            var35 += var8;
            int var99 = var3 + var68;
            int var130 = var3 + var35;
            var2[var99 - 1] = -var2[var99 - 1];
            double var161 = var2[var99];
            double var192 = -var2[var99 + 1];
            double var223 = var2[var130];
            double var254 = -var2[var130 + 1];
            var2[var99] = var223;
            var2[var99 + 1] = var254;
            var2[var130] = var161;
            var2[var130 + 1] = var192;
            var2[var130 + 3] = -var2[var130 + 3];
            var68 += var9;
            var35 += var9;
            var99 = var3 + var68;
            var130 = var3 + var35;
            var2[var99 - 1] = -var2[var99 - 1];
            var161 = var2[var99];
            var192 = -var2[var99 + 1];
            var223 = var2[var130];
            var254 = -var2[var130 + 1];
            var2[var99] = var223;
            var2[var99 + 1] = var254;
            var2[var130] = var161;
            var2[var130 + 1] = var192;
            var2[var130 + 3] = -var2[var130 + 3];
         }
      } else {
         for (int var25 = 0; var25 < var6; var25++) {
            int var26 = 4 * var25;

            for (int var27 = 0; var27 < var25; var27++) {
               int var70 = 4 * var27 + 2 * var1[var6 + var25];
               int var38 = var26 + 2 * var1[var6 + var27];
               int var101 = var3 + var70;
               int var132 = var3 + var38;
               double var163 = var2[var101];
               double var194 = -var2[var101 + 1];
               double var225 = var2[var132];
               double var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 += 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 -= var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 += 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var8;
               var38 += 2;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 -= 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 += var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 -= 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += 2;
               var38 += var8;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 += 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 -= var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 += var9;
               var38 += 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var8;
               var38 -= 2;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 -= 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 += var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
               var70 -= var9;
               var38 -= 2 * var9;
               var101 = var3 + var70;
               var132 = var3 + var38;
               var163 = var2[var101];
               var194 = -var2[var101 + 1];
               var225 = var2[var132];
               var256 = -var2[var132 + 1];
               var2[var101] = var225;
               var2[var101 + 1] = var256;
               var2[var132] = var163;
               var2[var132 + 1] = var194;
            }

            int var54 = var26 + 2 * var1[var6 + var25];
            int var86 = var54 + 2;
            var54 += var8;
            int var117 = var3 + var86;
            int var148 = var3 + var54;
            var2[var117 - 1] = -var2[var117 - 1];
            double var179 = var2[var117];
            double var210 = -var2[var117 + 1];
            double var241 = var2[var148];
            double var272 = -var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var2[var148 + 3] = -var2[var148 + 3];
            var86 += var9;
            var54 += 2 * var9;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var179 = var2[var117];
            var210 = -var2[var117 + 1];
            var241 = var2[var148];
            var272 = -var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var86 += var9;
            var54 -= var9;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var179 = var2[var117];
            var210 = -var2[var117 + 1];
            var241 = var2[var148];
            var272 = -var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var86 -= 2;
            var54 -= var8;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var179 = var2[var117];
            var210 = -var2[var117 + 1];
            var241 = var2[var148];
            var272 = -var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var86 += var8 + 2;
            var54 += var8 + 2;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var179 = var2[var117];
            var210 = -var2[var117 + 1];
            var241 = var2[var148];
            var272 = -var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var86 -= var8 - var9;
            var54 += 2 * var9 - 2;
            var117 = var3 + var86;
            var148 = var3 + var54;
            var2[var117 - 1] = -var2[var117 - 1];
            var179 = var2[var117];
            var210 = -var2[var117 + 1];
            var241 = var2[var148];
            var272 = -var2[var148 + 1];
            var2[var117] = var241;
            var2[var117 + 1] = var272;
            var2[var148] = var179;
            var2[var148 + 1] = var210;
            var2[var148 + 3] = -var2[var148 + 3];
         }
      }
   }

   public static void method25927(long var0, Class2382 var2, Class2381 var3, long var4) {
      long var8 = 1L;

      long var10;
      for (var10 = var0 >> 2; var10 > 8L; var10 >>= 2) {
         var8 <<= 1;
      }

      long var12 = var0 >> 1;
      long var14 = 4L * var8;
      if (var10 != 8L) {
         for (int var16 = 0; (long)var16 < var8; var16++) {
            long var19 = (long)(4 * var16);

            for (int var39 = 0; var39 < var16; var39++) {
               long var25 = (long)(4 * var39) + var2.method9649(var8 + (long)var16);
               long var23 = var19 + var2.method9649(var8 + (long)var39);
               long var27 = var4 + var25;
               long var29 = var4 + var23;
               double var31 = var3.method9653(var27);
               double var33 = -var3.method9653(var27 + 1L);
               double var35 = var3.method9653(var29);
               double var37 = -var3.method9653(var29 + 1L);
               var3.method9687(var27, var35);
               var3.method9687(var27 + 1L, var37);
               var3.method9687(var29, var31);
               var3.method9687(var29 + 1L, var33);
               var25 += var14;
               var23 += var14;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9653(var27);
               var33 = -var3.method9653(var27 + 1L);
               var35 = var3.method9653(var29);
               var37 = -var3.method9653(var29 + 1L);
               var3.method9687(var27, var35);
               var3.method9687(var27 + 1L, var37);
               var3.method9687(var29, var31);
               var3.method9687(var29 + 1L, var33);
               var25 += var12;
               var23 += 2L;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9653(var27);
               var33 = -var3.method9653(var27 + 1L);
               var35 = var3.method9653(var29);
               var37 = -var3.method9653(var29 + 1L);
               var3.method9687(var27, var35);
               var3.method9687(var27 + 1L, var37);
               var3.method9687(var29, var31);
               var3.method9687(var29 + 1L, var33);
               var25 -= var14;
               var23 -= var14;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9653(var27);
               var33 = -var3.method9653(var27 + 1L);
               var35 = var3.method9653(var29);
               var37 = -var3.method9653(var29 + 1L);
               var3.method9687(var27, var35);
               var3.method9687(var27 + 1L, var37);
               var3.method9687(var29, var31);
               var3.method9687(var29 + 1L, var33);
               var25 += 2L;
               var23 += var12;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9653(var27);
               var33 = -var3.method9653(var27 + 1L);
               var35 = var3.method9653(var29);
               var37 = -var3.method9653(var29 + 1L);
               var3.method9687(var27, var35);
               var3.method9687(var27 + 1L, var37);
               var3.method9687(var29, var31);
               var3.method9687(var29 + 1L, var33);
               var25 += var14;
               var23 += var14;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9653(var27);
               var33 = -var3.method9653(var27 + 1L);
               var35 = var3.method9653(var29);
               var37 = -var3.method9653(var29 + 1L);
               var3.method9687(var27, var35);
               var3.method9687(var27 + 1L, var37);
               var3.method9687(var29, var31);
               var3.method9687(var29 + 1L, var33);
               var25 -= var12;
               var23 -= 2L;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9653(var27);
               var33 = -var3.method9653(var27 + 1L);
               var35 = var3.method9653(var29);
               var37 = -var3.method9653(var29 + 1L);
               var3.method9687(var27, var35);
               var3.method9687(var27 + 1L, var37);
               var3.method9687(var29, var31);
               var3.method9687(var29 + 1L, var33);
               var25 -= var14;
               var23 -= var14;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9653(var27);
               var33 = -var3.method9653(var27 + 1L);
               var35 = var3.method9653(var29);
               var37 = -var3.method9653(var29 + 1L);
               var3.method9687(var27, var35);
               var3.method9687(var27 + 1L, var37);
               var3.method9687(var29, var31);
               var3.method9687(var29 + 1L, var33);
            }

            long var48 = var19 + var2.method9649(var8 + (long)var16);
            long var81 = var48 + 2L;
            var48 += var12;
            long var112 = var4 + var81;
            long var143 = var4 + var48;
            var3.method9687(var112 - 1L, -var3.method9653(var112 - 1L));
            double var174 = var3.method9653(var112);
            double var205 = -var3.method9653(var112 + 1L);
            double var236 = var3.method9653(var143);
            double var267 = -var3.method9653(var143 + 1L);
            var3.method9687(var112, var236);
            var3.method9687(var112 + 1L, var267);
            var3.method9687(var143, var174);
            var3.method9687(var143 + 1L, var205);
            var3.method9687(var143 + 3L, -var3.method9653(var143 + 3L));
            var81 += var14;
            var48 += var14;
            var112 = var4 + var81;
            var143 = var4 + var48;
            var3.method9687(var112 - 1L, -var3.method9653(var112 - 1L));
            var174 = var3.method9653(var112);
            var205 = -var3.method9653(var112 + 1L);
            var236 = var3.method9653(var143);
            var267 = -var3.method9653(var143 + 1L);
            var3.method9687(var112, var236);
            var3.method9687(var112 + 1L, var267);
            var3.method9687(var143, var174);
            var3.method9687(var143 + 1L, var205);
            var3.method9687(var143 + 3L, -var3.method9653(var143 + 3L));
         }
      } else {
         for (long var17 = 0L; var17 < var8; var17++) {
            long var40 = 4L * var17;

            for (long var21 = 0L; var21 < var17; var21++) {
               long var83 = 4L * var21 + 2L * var2.method9649(var8 + var17);
               long var51 = var40 + 2L * var2.method9649(var8 + var21);
               long var114 = var4 + var83;
               long var145 = var4 + var51;
               double var176 = var3.method9653(var114);
               double var207 = -var3.method9653(var114 + 1L);
               double var238 = var3.method9653(var145);
               double var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 += 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 -= var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 += 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var12;
               var51 += 2L;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 -= 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 += var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 -= 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += 2L;
               var51 += var12;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 += 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 -= var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 += var14;
               var51 += 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var12;
               var51 -= 2L;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 -= 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 += var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
               var83 -= var14;
               var51 -= 2L * var14;
               var114 = var4 + var83;
               var145 = var4 + var51;
               var176 = var3.method9653(var114);
               var207 = -var3.method9653(var114 + 1L);
               var238 = var3.method9653(var145);
               var269 = -var3.method9653(var145 + 1L);
               var3.method9687(var114, var238);
               var3.method9687(var114 + 1L, var269);
               var3.method9687(var145, var176);
               var3.method9687(var145 + 1L, var207);
            }

            long var67 = var40 + 2L * var2.method9649(var8 + var17);
            long var99 = var67 + 2L;
            var67 += var12;
            long var130 = var4 + var99;
            long var161 = var4 + var67;
            var3.method9687(var130 - 1L, -var3.method9653(var130 - 1L));
            double var192 = var3.method9653(var130);
            double var223 = -var3.method9653(var130 + 1L);
            double var254 = var3.method9653(var161);
            double var285 = -var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var3.method9687(var161 + 3L, -var3.method9653(var161 + 3L));
            var99 += var14;
            var67 += 2L * var14;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var192 = var3.method9653(var130);
            var223 = -var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = -var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var99 += var14;
            var67 -= var14;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var192 = var3.method9653(var130);
            var223 = -var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = -var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var99 -= 2L;
            var67 -= var12;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var192 = var3.method9653(var130);
            var223 = -var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = -var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var99 += var12 + 2L;
            var67 += var12 + 2L;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var192 = var3.method9653(var130);
            var223 = -var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = -var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var99 -= var12 - var14;
            var67 += 2L * var14 - 2L;
            var130 = var4 + var99;
            var161 = var4 + var67;
            var3.method9687(var130 - 1L, -var3.method9653(var130 - 1L));
            var192 = var3.method9653(var130);
            var223 = -var3.method9653(var130 + 1L);
            var254 = var3.method9653(var161);
            var285 = -var3.method9653(var161 + 1L);
            var3.method9687(var130, var254);
            var3.method9687(var130 + 1L, var285);
            var3.method9687(var161, var192);
            var3.method9687(var161 + 1L, var223);
            var3.method9687(var161 + 3L, -var3.method9653(var161 + 3L));
         }
      }
   }

   public static void method25928(double[] var0, int var1) {
      double var4 = var0[var1 + 2];
      double var6 = var0[var1 + 3];
      double var8 = var0[var1 + 4];
      double var10 = var0[var1 + 5];
      double var12 = var0[var1 + 6];
      double var14 = var0[var1 + 7];
      double var16 = var0[var1 + 8];
      double var18 = var0[var1 + 9];
      double var20 = var0[var1 + 10];
      double var22 = var0[var1 + 11];
      double var24 = var0[var1 + 14];
      double var26 = var0[var1 + 15];
      double var28 = var0[var1 + 16];
      double var30 = var0[var1 + 17];
      double var32 = var0[var1 + 20];
      double var34 = var0[var1 + 21];
      double var36 = var0[var1 + 22];
      double var38 = var0[var1 + 23];
      double var40 = var0[var1 + 24];
      double var42 = var0[var1 + 25];
      double var44 = var0[var1 + 26];
      double var46 = var0[var1 + 27];
      double var48 = var0[var1 + 28];
      double var50 = var0[var1 + 29];
      var0[var1 + 2] = var28;
      var0[var1 + 3] = var30;
      var0[var1 + 4] = var16;
      var0[var1 + 5] = var18;
      var0[var1 + 6] = var40;
      var0[var1 + 7] = var42;
      var0[var1 + 8] = var8;
      var0[var1 + 9] = var10;
      var0[var1 + 10] = var32;
      var0[var1 + 11] = var34;
      var0[var1 + 14] = var48;
      var0[var1 + 15] = var50;
      var0[var1 + 16] = var4;
      var0[var1 + 17] = var6;
      var0[var1 + 20] = var20;
      var0[var1 + 21] = var22;
      var0[var1 + 22] = var44;
      var0[var1 + 23] = var46;
      var0[var1 + 24] = var12;
      var0[var1 + 25] = var14;
      var0[var1 + 26] = var36;
      var0[var1 + 27] = var38;
      var0[var1 + 28] = var24;
      var0[var1 + 29] = var26;
   }

   public static void method25929(Class2381 var0, long var1) {
      double var5 = var0.method9653(var1 + 2L);
      double var7 = var0.method9653(var1 + 3L);
      double var9 = var0.method9653(var1 + 4L);
      double var11 = var0.method9653(var1 + 5L);
      double var13 = var0.method9653(var1 + 6L);
      double var15 = var0.method9653(var1 + 7L);
      double var17 = var0.method9653(var1 + 8L);
      double var19 = var0.method9653(var1 + 9L);
      double var21 = var0.method9653(var1 + 10L);
      double var23 = var0.method9653(var1 + 11L);
      double var25 = var0.method9653(var1 + 14L);
      double var27 = var0.method9653(var1 + 15L);
      double var29 = var0.method9653(var1 + 16L);
      double var31 = var0.method9653(var1 + 17L);
      double var33 = var0.method9653(var1 + 20L);
      double var35 = var0.method9653(var1 + 21L);
      double var37 = var0.method9653(var1 + 22L);
      double var39 = var0.method9653(var1 + 23L);
      double var41 = var0.method9653(var1 + 24L);
      double var43 = var0.method9653(var1 + 25L);
      double var45 = var0.method9653(var1 + 26L);
      double var47 = var0.method9653(var1 + 27L);
      double var49 = var0.method9653(var1 + 28L);
      double var51 = var0.method9653(var1 + 29L);
      var0.method9687(var1 + 2L, var29);
      var0.method9687(var1 + 3L, var31);
      var0.method9687(var1 + 4L, var17);
      var0.method9687(var1 + 5L, var19);
      var0.method9687(var1 + 6L, var41);
      var0.method9687(var1 + 7L, var43);
      var0.method9687(var1 + 8L, var9);
      var0.method9687(var1 + 9L, var11);
      var0.method9687(var1 + 10L, var33);
      var0.method9687(var1 + 11L, var35);
      var0.method9687(var1 + 14L, var49);
      var0.method9687(var1 + 15L, var51);
      var0.method9687(var1 + 16L, var5);
      var0.method9687(var1 + 17L, var7);
      var0.method9687(var1 + 20L, var21);
      var0.method9687(var1 + 21L, var23);
      var0.method9687(var1 + 22L, var45);
      var0.method9687(var1 + 23L, var47);
      var0.method9687(var1 + 24L, var13);
      var0.method9687(var1 + 25L, var15);
      var0.method9687(var1 + 26L, var37);
      var0.method9687(var1 + 27L, var39);
      var0.method9687(var1 + 28L, var25);
      var0.method9687(var1 + 29L, var27);
   }

   public static void method25930(double[] var0, int var1) {
      double var4 = var0[var1 + 2];
      double var6 = var0[var1 + 3];
      double var8 = var0[var1 + 4];
      double var10 = var0[var1 + 5];
      double var12 = var0[var1 + 6];
      double var14 = var0[var1 + 7];
      double var16 = var0[var1 + 8];
      double var18 = var0[var1 + 9];
      double var20 = var0[var1 + 10];
      double var22 = var0[var1 + 11];
      double var24 = var0[var1 + 12];
      double var26 = var0[var1 + 13];
      double var28 = var0[var1 + 14];
      double var30 = var0[var1 + 15];
      double var32 = var0[var1 + 16];
      double var34 = var0[var1 + 17];
      double var36 = var0[var1 + 18];
      double var38 = var0[var1 + 19];
      double var40 = var0[var1 + 20];
      double var42 = var0[var1 + 21];
      double var44 = var0[var1 + 22];
      double var46 = var0[var1 + 23];
      double var48 = var0[var1 + 24];
      double var50 = var0[var1 + 25];
      double var52 = var0[var1 + 26];
      double var54 = var0[var1 + 27];
      double var56 = var0[var1 + 28];
      double var58 = var0[var1 + 29];
      double var60 = var0[var1 + 30];
      double var62 = var0[var1 + 31];
      var0[var1 + 2] = var60;
      var0[var1 + 3] = var62;
      var0[var1 + 4] = var28;
      var0[var1 + 5] = var30;
      var0[var1 + 6] = var44;
      var0[var1 + 7] = var46;
      var0[var1 + 8] = var12;
      var0[var1 + 9] = var14;
      var0[var1 + 10] = var52;
      var0[var1 + 11] = var54;
      var0[var1 + 12] = var20;
      var0[var1 + 13] = var22;
      var0[var1 + 14] = var36;
      var0[var1 + 15] = var38;
      var0[var1 + 16] = var4;
      var0[var1 + 17] = var6;
      var0[var1 + 18] = var56;
      var0[var1 + 19] = var58;
      var0[var1 + 20] = var24;
      var0[var1 + 21] = var26;
      var0[var1 + 22] = var40;
      var0[var1 + 23] = var42;
      var0[var1 + 24] = var8;
      var0[var1 + 25] = var10;
      var0[var1 + 26] = var48;
      var0[var1 + 27] = var50;
      var0[var1 + 28] = var16;
      var0[var1 + 29] = var18;
      var0[var1 + 30] = var32;
      var0[var1 + 31] = var34;
   }

   public static void method25931(Class2381 var0, long var1) {
      double var5 = var0.method9653(var1 + 2L);
      double var7 = var0.method9653(var1 + 3L);
      double var9 = var0.method9653(var1 + 4L);
      double var11 = var0.method9653(var1 + 5L);
      double var13 = var0.method9653(var1 + 6L);
      double var15 = var0.method9653(var1 + 7L);
      double var17 = var0.method9653(var1 + 8L);
      double var19 = var0.method9653(var1 + 9L);
      double var21 = var0.method9653(var1 + 10L);
      double var23 = var0.method9653(var1 + 11L);
      double var25 = var0.method9653(var1 + 12L);
      double var27 = var0.method9653(var1 + 13L);
      double var29 = var0.method9653(var1 + 14L);
      double var31 = var0.method9653(var1 + 15L);
      double var33 = var0.method9653(var1 + 16L);
      double var35 = var0.method9653(var1 + 17L);
      double var37 = var0.method9653(var1 + 18L);
      double var39 = var0.method9653(var1 + 19L);
      double var41 = var0.method9653(var1 + 20L);
      double var43 = var0.method9653(var1 + 21L);
      double var45 = var0.method9653(var1 + 22L);
      double var47 = var0.method9653(var1 + 23L);
      double var49 = var0.method9653(var1 + 24L);
      double var51 = var0.method9653(var1 + 25L);
      double var53 = var0.method9653(var1 + 26L);
      double var55 = var0.method9653(var1 + 27L);
      double var57 = var0.method9653(var1 + 28L);
      double var59 = var0.method9653(var1 + 29L);
      double var61 = var0.method9653(var1 + 30L);
      double var63 = var0.method9653(var1 + 31L);
      var0.method9687(var1 + 2L, var61);
      var0.method9687(var1 + 3L, var63);
      var0.method9687(var1 + 4L, var29);
      var0.method9687(var1 + 5L, var31);
      var0.method9687(var1 + 6L, var45);
      var0.method9687(var1 + 7L, var47);
      var0.method9687(var1 + 8L, var13);
      var0.method9687(var1 + 9L, var15);
      var0.method9687(var1 + 10L, var53);
      var0.method9687(var1 + 11L, var55);
      var0.method9687(var1 + 12L, var21);
      var0.method9687(var1 + 13L, var23);
      var0.method9687(var1 + 14L, var37);
      var0.method9687(var1 + 15L, var39);
      var0.method9687(var1 + 16L, var5);
      var0.method9687(var1 + 17L, var7);
      var0.method9687(var1 + 18L, var57);
      var0.method9687(var1 + 19L, var59);
      var0.method9687(var1 + 20L, var25);
      var0.method9687(var1 + 21L, var27);
      var0.method9687(var1 + 22L, var41);
      var0.method9687(var1 + 23L, var43);
      var0.method9687(var1 + 24L, var9);
      var0.method9687(var1 + 25L, var11);
      var0.method9687(var1 + 26L, var49);
      var0.method9687(var1 + 27L, var51);
      var0.method9687(var1 + 28L, var17);
      var0.method9687(var1 + 29L, var19);
      var0.method9687(var1 + 30L, var33);
      var0.method9687(var1 + 31L, var35);
   }

   public static void method25932(double[] var0, int var1) {
      double var4 = var0[var1 + 2];
      double var6 = var0[var1 + 3];
      double var8 = var0[var1 + 6];
      double var10 = var0[var1 + 7];
      double var12 = var0[var1 + 8];
      double var14 = var0[var1 + 9];
      double var16 = var0[var1 + 12];
      double var18 = var0[var1 + 13];
      var0[var1 + 2] = var12;
      var0[var1 + 3] = var14;
      var0[var1 + 6] = var16;
      var0[var1 + 7] = var18;
      var0[var1 + 8] = var4;
      var0[var1 + 9] = var6;
      var0[var1 + 12] = var8;
      var0[var1 + 13] = var10;
   }

   public static void method25933(Class2381 var0, long var1) {
      double var5 = var0.method9653(var1 + 2L);
      double var7 = var0.method9653(var1 + 3L);
      double var9 = var0.method9653(var1 + 6L);
      double var11 = var0.method9653(var1 + 7L);
      double var13 = var0.method9653(var1 + 8L);
      double var15 = var0.method9653(var1 + 9L);
      double var17 = var0.method9653(var1 + 12L);
      double var19 = var0.method9653(var1 + 13L);
      var0.method9687(var1 + 2L, var13);
      var0.method9687(var1 + 3L, var15);
      var0.method9687(var1 + 6L, var17);
      var0.method9687(var1 + 7L, var19);
      var0.method9687(var1 + 8L, var5);
      var0.method9687(var1 + 9L, var7);
      var0.method9687(var1 + 12L, var9);
      var0.method9687(var1 + 13L, var11);
   }

   public static void method25934(double[] var0, int var1) {
      double var4 = var0[var1 + 2];
      double var6 = var0[var1 + 3];
      double var8 = var0[var1 + 4];
      double var10 = var0[var1 + 5];
      double var12 = var0[var1 + 6];
      double var14 = var0[var1 + 7];
      double var16 = var0[var1 + 8];
      double var18 = var0[var1 + 9];
      double var20 = var0[var1 + 10];
      double var22 = var0[var1 + 11];
      double var24 = var0[var1 + 12];
      double var26 = var0[var1 + 13];
      double var28 = var0[var1 + 14];
      double var30 = var0[var1 + 15];
      var0[var1 + 2] = var28;
      var0[var1 + 3] = var30;
      var0[var1 + 4] = var12;
      var0[var1 + 5] = var14;
      var0[var1 + 6] = var20;
      var0[var1 + 7] = var22;
      var0[var1 + 8] = var4;
      var0[var1 + 9] = var6;
      var0[var1 + 10] = var24;
      var0[var1 + 11] = var26;
      var0[var1 + 12] = var8;
      var0[var1 + 13] = var10;
      var0[var1 + 14] = var16;
      var0[var1 + 15] = var18;
   }

   public static void method25935(Class2381 var0, long var1) {
      double var5 = var0.method9653(var1 + 2L);
      double var7 = var0.method9653(var1 + 3L);
      double var9 = var0.method9653(var1 + 4L);
      double var11 = var0.method9653(var1 + 5L);
      double var13 = var0.method9653(var1 + 6L);
      double var15 = var0.method9653(var1 + 7L);
      double var17 = var0.method9653(var1 + 8L);
      double var19 = var0.method9653(var1 + 9L);
      double var21 = var0.method9653(var1 + 10L);
      double var23 = var0.method9653(var1 + 11L);
      double var25 = var0.method9653(var1 + 12L);
      double var27 = var0.method9653(var1 + 13L);
      double var29 = var0.method9653(var1 + 14L);
      double var31 = var0.method9653(var1 + 15L);
      var0.method9687(var1 + 2L, var29);
      var0.method9687(var1 + 3L, var31);
      var0.method9687(var1 + 4L, var13);
      var0.method9687(var1 + 5L, var15);
      var0.method9687(var1 + 6L, var21);
      var0.method9687(var1 + 7L, var23);
      var0.method9687(var1 + 8L, var5);
      var0.method9687(var1 + 9L, var7);
      var0.method9687(var1 + 10L, var25);
      var0.method9687(var1 + 11L, var27);
      var0.method9687(var1 + 12L, var9);
      var0.method9687(var1 + 13L, var11);
      var0.method9687(var1 + 14L, var17);
      var0.method9687(var1 + 15L, var19);
   }

   public static void method25936(int var0, double[] var1, int var2, double[] var3, int var4) {
      int var7 = var0 >> 3;
      int var8 = 2 * var7;
      int var10 = var8 + var8;
      int var11 = var10 + var8;
      int var12 = var2 + var8;
      int var13 = var2 + var10;
      int var14 = var2 + var11;
      double var15 = var1[var2] + var1[var13];
      double var17 = var1[var2 + 1] + var1[var13 + 1];
      double var19 = var1[var2] - var1[var13];
      double var21 = var1[var2 + 1] - var1[var13 + 1];
      double var23 = var1[var12] + var1[var14];
      double var25 = var1[var12 + 1] + var1[var14 + 1];
      double var27 = var1[var12] - var1[var14];
      double var29 = var1[var12 + 1] - var1[var14 + 1];
      var1[var2] = var15 + var23;
      var1[var2 + 1] = var17 + var25;
      var1[var12] = var15 - var23;
      var1[var12 + 1] = var17 - var25;
      var1[var13] = var19 - var29;
      var1[var13 + 1] = var21 + var27;
      var1[var14] = var19 + var29;
      var1[var14 + 1] = var21 - var27;
      double var31 = var3[var4 + 1];
      double var33 = var3[var4 + 2];
      double var35 = var3[var4 + 3];
      double var37 = 1.0;
      double var39 = 0.0;
      double var41 = 1.0;
      double var43 = 0.0;
      byte var45 = 0;

      for (int var46 = 2; var46 < var7 - 2; var46 += 4) {
         var45 += 4;
         int var57 = var4 + var45;
         double var47 = var33 * (var37 + var3[var57]);
         double var49 = var33 * (var39 + var3[var57 + 1]);
         double var51 = var35 * (var41 + var3[var57 + 2]);
         double var53 = var35 * (var43 + var3[var57 + 3]);
         var37 = var3[var57];
         var39 = var3[var57 + 1];
         var41 = var3[var57 + 2];
         var43 = var3[var57 + 3];
         int var9 = var46 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         int var58 = var2 + var46;
         var15 = var1[var58] + var1[var13];
         var17 = var1[var58 + 1] + var1[var13 + 1];
         var19 = var1[var58] - var1[var13];
         var21 = var1[var58 + 1] - var1[var13 + 1];
         double var59 = var1[var58 + 2] + var1[var13 + 2];
         double var61 = var1[var58 + 3] + var1[var13 + 3];
         double var63 = var1[var58 + 2] - var1[var13 + 2];
         double var65 = var1[var58 + 3] - var1[var13 + 3];
         var23 = var1[var12] + var1[var14];
         var25 = var1[var12 + 1] + var1[var14 + 1];
         var27 = var1[var12] - var1[var14];
         var29 = var1[var12 + 1] - var1[var14 + 1];
         double var67 = var1[var12 + 2] + var1[var14 + 2];
         double var69 = var1[var12 + 3] + var1[var14 + 3];
         double var71 = var1[var12 + 2] - var1[var14 + 2];
         double var73 = var1[var12 + 3] - var1[var14 + 3];
         var1[var58] = var15 + var23;
         var1[var58 + 1] = var17 + var25;
         var1[var58 + 2] = var59 + var67;
         var1[var58 + 3] = var61 + var69;
         var1[var12] = var15 - var23;
         var1[var12 + 1] = var17 - var25;
         var1[var12 + 2] = var59 - var67;
         var1[var12 + 3] = var61 - var69;
         var15 = var19 - var29;
         var17 = var21 + var27;
         var1[var13] = var47 * var15 - var49 * var17;
         var1[var13 + 1] = var47 * var17 + var49 * var15;
         var15 = var63 - var73;
         var17 = var65 + var71;
         var1[var13 + 2] = var37 * var15 - var39 * var17;
         var1[var13 + 3] = var37 * var17 + var39 * var15;
         var15 = var19 + var29;
         var17 = var21 - var27;
         var1[var14] = var51 * var15 + var53 * var17;
         var1[var14 + 1] = var51 * var17 - var53 * var15;
         var15 = var63 + var73;
         var17 = var65 - var71;
         var1[var14 + 2] = var41 * var15 + var43 * var17;
         var1[var14 + 3] = var41 * var17 - var43 * var15;
         int var55 = var8 - var46;
         var9 = var55 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         int var56 = var2 + var55;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         var15 = var1[var56] + var1[var13];
         var17 = var1[var56 + 1] + var1[var13 + 1];
         var19 = var1[var56] - var1[var13];
         var21 = var1[var56 + 1] - var1[var13 + 1];
         var59 = var1[var56 - 2] + var1[var13 - 2];
         var61 = var1[var56 - 1] + var1[var13 - 1];
         var63 = var1[var56 - 2] - var1[var13 - 2];
         var65 = var1[var56 - 1] - var1[var13 - 1];
         var23 = var1[var12] + var1[var14];
         var25 = var1[var12 + 1] + var1[var14 + 1];
         var27 = var1[var12] - var1[var14];
         var29 = var1[var12 + 1] - var1[var14 + 1];
         var67 = var1[var12 - 2] + var1[var14 - 2];
         var69 = var1[var12 - 1] + var1[var14 - 1];
         var71 = var1[var12 - 2] - var1[var14 - 2];
         var73 = var1[var12 - 1] - var1[var14 - 1];
         var1[var56] = var15 + var23;
         var1[var56 + 1] = var17 + var25;
         var1[var56 - 2] = var59 + var67;
         var1[var56 - 1] = var61 + var69;
         var1[var12] = var15 - var23;
         var1[var12 + 1] = var17 - var25;
         var1[var12 - 2] = var59 - var67;
         var1[var12 - 1] = var61 - var69;
         var15 = var19 - var29;
         var17 = var21 + var27;
         var1[var13] = var49 * var15 - var47 * var17;
         var1[var13 + 1] = var49 * var17 + var47 * var15;
         var15 = var63 - var73;
         var17 = var65 + var71;
         var1[var13 - 2] = var39 * var15 - var37 * var17;
         var1[var13 - 1] = var39 * var17 + var37 * var15;
         var15 = var19 + var29;
         var17 = var21 - var27;
         var1[var14] = var53 * var15 + var51 * var17;
         var1[var14 + 1] = var53 * var17 - var51 * var15;
         var15 = var63 + var73;
         var17 = var65 - var71;
         var1[var2 + var11 - 2] = var43 * var15 + var41 * var17;
         var1[var2 + var11 - 1] = var43 * var17 - var41 * var15;
      }

      double var160 = var33 * (var37 + var31);
      double var161 = var33 * (var39 + var31);
      double var162 = var35 * (var41 - var31);
      double var163 = var35 * (var43 - var31);
      int var76 = var7 + var8;
      var10 = var76 + var8;
      var11 = var10 + var8;
      int var164 = var2 + var7;
      var12 = var2 + var76;
      var13 = var2 + var10;
      var14 = var2 + var11;
      var15 = var1[var164 - 2] + var1[var13 - 2];
      var17 = var1[var164 - 1] + var1[var13 - 1];
      var19 = var1[var164 - 2] - var1[var13 - 2];
      var21 = var1[var164 - 1] - var1[var13 - 1];
      var23 = var1[var12 - 2] + var1[var14 - 2];
      var25 = var1[var12 - 1] + var1[var14 - 1];
      var27 = var1[var12 - 2] - var1[var14 - 2];
      var29 = var1[var12 - 1] - var1[var14 - 1];
      var1[var164 - 2] = var15 + var23;
      var1[var164 - 1] = var17 + var25;
      var1[var12 - 2] = var15 - var23;
      var1[var12 - 1] = var17 - var25;
      var15 = var19 - var29;
      var17 = var21 + var27;
      var1[var13 - 2] = var160 * var15 - var161 * var17;
      var1[var13 - 1] = var160 * var17 + var161 * var15;
      var15 = var19 + var29;
      var17 = var21 - var27;
      var1[var14 - 2] = var162 * var15 + var163 * var17;
      var1[var14 - 1] = var162 * var17 - var163 * var15;
      var15 = var1[var164] + var1[var13];
      var17 = var1[var164 + 1] + var1[var13 + 1];
      var19 = var1[var164] - var1[var13];
      var21 = var1[var164 + 1] - var1[var13 + 1];
      var23 = var1[var12] + var1[var14];
      var25 = var1[var12 + 1] + var1[var14 + 1];
      var27 = var1[var12] - var1[var14];
      var29 = var1[var12 + 1] - var1[var14 + 1];
      var1[var164] = var15 + var23;
      var1[var164 + 1] = var17 + var25;
      var1[var12] = var15 - var23;
      var1[var12 + 1] = var17 - var25;
      var15 = var19 - var29;
      var17 = var21 + var27;
      var1[var13] = var31 * (var15 - var17);
      var1[var13 + 1] = var31 * (var17 + var15);
      var15 = var19 + var29;
      var17 = var21 - var27;
      var1[var14] = -var31 * (var15 + var17);
      var1[var14 + 1] = -var31 * (var17 - var15);
      var15 = var1[var164 + 2] + var1[var13 + 2];
      var17 = var1[var164 + 3] + var1[var13 + 3];
      var19 = var1[var164 + 2] - var1[var13 + 2];
      var21 = var1[var164 + 3] - var1[var13 + 3];
      var23 = var1[var12 + 2] + var1[var14 + 2];
      var25 = var1[var12 + 3] + var1[var14 + 3];
      var27 = var1[var12 + 2] - var1[var14 + 2];
      var29 = var1[var12 + 3] - var1[var14 + 3];
      var1[var164 + 2] = var15 + var23;
      var1[var164 + 3] = var17 + var25;
      var1[var12 + 2] = var15 - var23;
      var1[var12 + 3] = var17 - var25;
      var15 = var19 - var29;
      var17 = var21 + var27;
      var1[var13 + 2] = var161 * var15 - var160 * var17;
      var1[var13 + 3] = var161 * var17 + var160 * var15;
      var15 = var19 + var29;
      var17 = var21 - var27;
      var1[var14 + 2] = var163 * var15 + var162 * var17;
      var1[var14 + 3] = var163 * var17 - var162 * var15;
   }

   public static void method25937(long var0, Class2381 var2, long var3, Class2381 var5, long var6) {
      long var10 = var0 >> 3;
      long var12 = 2L * var10;
      long var16 = var12 + var12;
      long var18 = var16 + var12;
      long var20 = var3 + var12;
      long var22 = var3 + var16;
      long var24 = var3 + var18;
      double var26 = var2.method9653(var3) + var2.method9653(var22);
      double var28 = var2.method9653(var3 + 1L) + var2.method9653(var22 + 1L);
      double var30 = var2.method9653(var3) - var2.method9653(var22);
      double var32 = var2.method9653(var3 + 1L) - var2.method9653(var22 + 1L);
      double var34 = var2.method9653(var20) + var2.method9653(var24);
      double var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
      double var38 = var2.method9653(var20) - var2.method9653(var24);
      double var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
      var2.method9687(var3, var26 + var34);
      var2.method9687(var3 + 1L, var28 + var36);
      var2.method9687(var20, var26 - var34);
      var2.method9687(var20 + 1L, var28 - var36);
      var2.method9687(var22, var30 - var40);
      var2.method9687(var22 + 1L, var32 + var38);
      var2.method9687(var24, var30 + var40);
      var2.method9687(var24 + 1L, var32 - var38);
      double var42 = var5.method9653(var6 + 1L);
      double var44 = var5.method9653(var6 + 2L);
      double var46 = var5.method9653(var6 + 3L);
      double var48 = 1.0;
      double var50 = 0.0;
      double var52 = 1.0;
      double var54 = 0.0;
      long var56 = 0L;

      for (int var58 = 2; (long)var58 < var10 - 2L; var58 += 4) {
         var56 += 4L;
         long var71 = var6 + var56;
         double var59 = var44 * (var48 + var5.method9653(var71));
         double var61 = var44 * (var50 + var5.method9653(var71 + 1L));
         double var63 = var46 * (var52 + var5.method9653(var71 + 2L));
         double var65 = var46 * (var54 + var5.method9653(var71 + 3L));
         var48 = var5.method9653(var71);
         var50 = var5.method9653(var71 + 1L);
         var52 = var5.method9653(var71 + 2L);
         var54 = var5.method9653(var71 + 3L);
         long var14 = (long)var58 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         long var73 = var3 + (long)var58;
         var26 = var2.method9653(var73) + var2.method9653(var22);
         var28 = var2.method9653(var73 + 1L) + var2.method9653(var22 + 1L);
         var30 = var2.method9653(var73) - var2.method9653(var22);
         var32 = var2.method9653(var73 + 1L) - var2.method9653(var22 + 1L);
         double var75 = var2.method9653(var73 + 2L) + var2.method9653(var22 + 2L);
         double var77 = var2.method9653(var73 + 3L) + var2.method9653(var22 + 3L);
         double var79 = var2.method9653(var73 + 2L) - var2.method9653(var22 + 2L);
         double var81 = var2.method9653(var73 + 3L) - var2.method9653(var22 + 3L);
         var34 = var2.method9653(var20) + var2.method9653(var24);
         var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
         var38 = var2.method9653(var20) - var2.method9653(var24);
         var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
         double var83 = var2.method9653(var20 + 2L) + var2.method9653(var24 + 2L);
         double var85 = var2.method9653(var20 + 3L) + var2.method9653(var24 + 3L);
         double var87 = var2.method9653(var20 + 2L) - var2.method9653(var24 + 2L);
         double var89 = var2.method9653(var20 + 3L) - var2.method9653(var24 + 3L);
         var2.method9687(var73, var26 + var34);
         var2.method9687(var73 + 1L, var28 + var36);
         var2.method9687(var73 + 2L, var75 + var83);
         var2.method9687(var73 + 3L, var77 + var85);
         var2.method9687(var20, var26 - var34);
         var2.method9687(var20 + 1L, var28 - var36);
         var2.method9687(var20 + 2L, var75 - var83);
         var2.method9687(var20 + 3L, var77 - var85);
         var26 = var30 - var40;
         var28 = var32 + var38;
         var2.method9687(var22, var59 * var26 - var61 * var28);
         var2.method9687(var22 + 1L, var59 * var28 + var61 * var26);
         var26 = var79 - var89;
         var28 = var81 + var87;
         var2.method9687(var22 + 2L, var48 * var26 - var50 * var28);
         var2.method9687(var22 + 3L, var48 * var28 + var50 * var26);
         var26 = var30 + var40;
         var28 = var32 - var38;
         var2.method9687(var24, var63 * var26 + var65 * var28);
         var2.method9687(var24 + 1L, var63 * var28 - var65 * var26);
         var26 = var79 + var89;
         var28 = var81 - var87;
         var2.method9687(var24 + 2L, var52 * var26 + var54 * var28);
         var2.method9687(var24 + 3L, var52 * var28 - var54 * var26);
         long var67 = var12 - (long)var58;
         var14 = var67 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         long var69 = var3 + var67;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         var26 = var2.method9653(var69) + var2.method9653(var22);
         var28 = var2.method9653(var69 + 1L) + var2.method9653(var22 + 1L);
         var30 = var2.method9653(var69) - var2.method9653(var22);
         var32 = var2.method9653(var69 + 1L) - var2.method9653(var22 + 1L);
         var75 = var2.method9653(var69 - 2L) + var2.method9653(var22 - 2L);
         var77 = var2.method9653(var69 - 1L) + var2.method9653(var22 - 1L);
         var79 = var2.method9653(var69 - 2L) - var2.method9653(var22 - 2L);
         var81 = var2.method9653(var69 - 1L) - var2.method9653(var22 - 1L);
         var34 = var2.method9653(var20) + var2.method9653(var24);
         var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
         var38 = var2.method9653(var20) - var2.method9653(var24);
         var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
         var83 = var2.method9653(var20 - 2L) + var2.method9653(var24 - 2L);
         var85 = var2.method9653(var20 - 1L) + var2.method9653(var24 - 1L);
         var87 = var2.method9653(var20 - 2L) - var2.method9653(var24 - 2L);
         var89 = var2.method9653(var20 - 1L) - var2.method9653(var24 - 1L);
         var2.method9687(var69, var26 + var34);
         var2.method9687(var69 + 1L, var28 + var36);
         var2.method9687(var69 - 2L, var75 + var83);
         var2.method9687(var69 - 1L, var77 + var85);
         var2.method9687(var20, var26 - var34);
         var2.method9687(var20 + 1L, var28 - var36);
         var2.method9687(var20 - 2L, var75 - var83);
         var2.method9687(var20 - 1L, var77 - var85);
         var26 = var30 - var40;
         var28 = var32 + var38;
         var2.method9687(var22, var61 * var26 - var59 * var28);
         var2.method9687(var22 + 1L, var61 * var28 + var59 * var26);
         var26 = var79 - var89;
         var28 = var81 + var87;
         var2.method9687(var22 - 2L, var50 * var26 - var48 * var28);
         var2.method9687(var22 - 1L, var50 * var28 + var48 * var26);
         var26 = var30 + var40;
         var28 = var32 - var38;
         var2.method9687(var24, var65 * var26 + var63 * var28);
         var2.method9687(var24 + 1L, var65 * var28 - var63 * var26);
         var26 = var79 + var89;
         var28 = var81 - var87;
         var2.method9687(var3 + var18 - 2L, var54 * var26 + var52 * var28);
         var2.method9687(var3 + var18 - 1L, var54 * var28 - var52 * var26);
      }

      double var176 = var44 * (var48 + var42);
      double var177 = var44 * (var50 + var42);
      double var178 = var46 * (var52 - var42);
      double var179 = var46 * (var54 - var42);
      long var92 = var10 + var12;
      var16 = var92 + var12;
      var18 = var16 + var12;
      long var180 = var3 + var10;
      var20 = var3 + var92;
      var22 = var3 + var16;
      var24 = var3 + var18;
      var26 = var2.method9653(var180 - 2L) + var2.method9653(var22 - 2L);
      var28 = var2.method9653(var180 - 1L) + var2.method9653(var22 - 1L);
      var30 = var2.method9653(var180 - 2L) - var2.method9653(var22 - 2L);
      var32 = var2.method9653(var180 - 1L) - var2.method9653(var22 - 1L);
      var34 = var2.method9653(var20 - 2L) + var2.method9653(var24 - 2L);
      var36 = var2.method9653(var20 - 1L) + var2.method9653(var24 - 1L);
      var38 = var2.method9653(var20 - 2L) - var2.method9653(var24 - 2L);
      var40 = var2.method9653(var20 - 1L) - var2.method9653(var24 - 1L);
      var2.method9687(var180 - 2L, var26 + var34);
      var2.method9687(var180 - 1L, var28 + var36);
      var2.method9687(var20 - 2L, var26 - var34);
      var2.method9687(var20 - 1L, var28 - var36);
      var26 = var30 - var40;
      var28 = var32 + var38;
      var2.method9687(var22 - 2L, var176 * var26 - var177 * var28);
      var2.method9687(var22 - 1L, var176 * var28 + var177 * var26);
      var26 = var30 + var40;
      var28 = var32 - var38;
      var2.method9687(var24 - 2L, var178 * var26 + var179 * var28);
      var2.method9687(var24 - 1L, var178 * var28 - var179 * var26);
      var26 = var2.method9653(var180) + var2.method9653(var22);
      var28 = var2.method9653(var180 + 1L) + var2.method9653(var22 + 1L);
      var30 = var2.method9653(var180) - var2.method9653(var22);
      var32 = var2.method9653(var180 + 1L) - var2.method9653(var22 + 1L);
      var34 = var2.method9653(var20) + var2.method9653(var24);
      var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
      var38 = var2.method9653(var20) - var2.method9653(var24);
      var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
      var2.method9687(var180, var26 + var34);
      var2.method9687(var180 + 1L, var28 + var36);
      var2.method9687(var20, var26 - var34);
      var2.method9687(var20 + 1L, var28 - var36);
      var26 = var30 - var40;
      var28 = var32 + var38;
      var2.method9687(var22, var42 * (var26 - var28));
      var2.method9687(var22 + 1L, var42 * (var28 + var26));
      var26 = var30 + var40;
      var28 = var32 - var38;
      var2.method9687(var24, -var42 * (var26 + var28));
      var2.method9687(var24 + 1L, -var42 * (var28 - var26));
      var26 = var2.method9653(var180 + 2L) + var2.method9653(var22 + 2L);
      var28 = var2.method9653(var180 + 3L) + var2.method9653(var22 + 3L);
      var30 = var2.method9653(var180 + 2L) - var2.method9653(var22 + 2L);
      var32 = var2.method9653(var180 + 3L) - var2.method9653(var22 + 3L);
      var34 = var2.method9653(var20 + 2L) + var2.method9653(var24 + 2L);
      var36 = var2.method9653(var20 + 3L) + var2.method9653(var24 + 3L);
      var38 = var2.method9653(var20 + 2L) - var2.method9653(var24 + 2L);
      var40 = var2.method9653(var20 + 3L) - var2.method9653(var24 + 3L);
      var2.method9687(var180 + 2L, var26 + var34);
      var2.method9687(var180 + 3L, var28 + var36);
      var2.method9687(var20 + 2L, var26 - var34);
      var2.method9687(var20 + 3L, var28 - var36);
      var26 = var30 - var40;
      var28 = var32 + var38;
      var2.method9687(var22 + 2L, var177 * var26 - var176 * var28);
      var2.method9687(var22 + 3L, var177 * var28 + var176 * var26);
      var26 = var30 + var40;
      var28 = var32 - var38;
      var2.method9687(var24 + 2L, var179 * var26 + var178 * var28);
      var2.method9687(var24 + 3L, var179 * var28 - var178 * var26);
   }

   public static void method25938(int var0, double[] var1, int var2, double[] var3, int var4) {
      int var7 = var0 >> 3;
      int var8 = 2 * var7;
      int var10 = var8 + var8;
      int var11 = var10 + var8;
      int var12 = var2 + var8;
      int var13 = var2 + var10;
      int var14 = var2 + var11;
      double var15 = var1[var2] + var1[var13];
      double var17 = -var1[var2 + 1] - var1[var13 + 1];
      double var19 = var1[var2] - var1[var13];
      double var21 = -var1[var2 + 1] + var1[var13 + 1];
      double var23 = var1[var12] + var1[var14];
      double var25 = var1[var12 + 1] + var1[var14 + 1];
      double var27 = var1[var12] - var1[var14];
      double var29 = var1[var12 + 1] - var1[var14 + 1];
      var1[var2] = var15 + var23;
      var1[var2 + 1] = var17 - var25;
      var1[var12] = var15 - var23;
      var1[var12 + 1] = var17 + var25;
      var1[var13] = var19 + var29;
      var1[var13 + 1] = var21 + var27;
      var1[var14] = var19 - var29;
      var1[var14 + 1] = var21 - var27;
      double var31 = var3[var4 + 1];
      double var33 = var3[var4 + 2];
      double var35 = var3[var4 + 3];
      double var37 = 1.0;
      double var39 = 0.0;
      double var41 = 1.0;
      double var43 = 0.0;
      byte var45 = 0;

      for (int var46 = 2; var46 < var7 - 2; var46 += 4) {
         var45 += 4;
         int var57 = var4 + var45;
         double var47 = var33 * (var37 + var3[var57]);
         double var49 = var33 * (var39 + var3[var57 + 1]);
         double var51 = var35 * (var41 + var3[var57 + 2]);
         double var53 = var35 * (var43 + var3[var57 + 3]);
         var37 = var3[var57];
         var39 = var3[var57 + 1];
         var41 = var3[var57 + 2];
         var43 = var3[var57 + 3];
         int var9 = var46 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         int var58 = var2 + var46;
         var15 = var1[var58] + var1[var13];
         var17 = -var1[var58 + 1] - var1[var13 + 1];
         var19 = var1[var58] - var1[var2 + var10];
         var21 = -var1[var58 + 1] + var1[var13 + 1];
         double var59 = var1[var58 + 2] + var1[var13 + 2];
         double var61 = -var1[var58 + 3] - var1[var13 + 3];
         double var63 = var1[var58 + 2] - var1[var13 + 2];
         double var65 = -var1[var58 + 3] + var1[var13 + 3];
         var23 = var1[var12] + var1[var14];
         var25 = var1[var12 + 1] + var1[var14 + 1];
         var27 = var1[var12] - var1[var14];
         var29 = var1[var12 + 1] - var1[var14 + 1];
         double var67 = var1[var12 + 2] + var1[var14 + 2];
         double var69 = var1[var12 + 3] + var1[var14 + 3];
         double var71 = var1[var12 + 2] - var1[var14 + 2];
         double var73 = var1[var12 + 3] - var1[var14 + 3];
         var1[var58] = var15 + var23;
         var1[var58 + 1] = var17 - var25;
         var1[var58 + 2] = var59 + var67;
         var1[var58 + 3] = var61 - var69;
         var1[var12] = var15 - var23;
         var1[var12 + 1] = var17 + var25;
         var1[var12 + 2] = var59 - var67;
         var1[var12 + 3] = var61 + var69;
         var15 = var19 + var29;
         var17 = var21 + var27;
         var1[var13] = var47 * var15 - var49 * var17;
         var1[var13 + 1] = var47 * var17 + var49 * var15;
         var15 = var63 + var73;
         var17 = var65 + var71;
         var1[var13 + 2] = var37 * var15 - var39 * var17;
         var1[var13 + 3] = var37 * var17 + var39 * var15;
         var15 = var19 - var29;
         var17 = var21 - var27;
         var1[var14] = var51 * var15 + var53 * var17;
         var1[var14 + 1] = var51 * var17 - var53 * var15;
         var15 = var63 - var73;
         var17 = var65 - var71;
         var1[var14 + 2] = var41 * var15 + var43 * var17;
         var1[var14 + 3] = var41 * var17 - var43 * var15;
         int var55 = var8 - var46;
         var9 = var55 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         int var56 = var2 + var55;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         var15 = var1[var56] + var1[var13];
         var17 = -var1[var56 + 1] - var1[var13 + 1];
         var19 = var1[var56] - var1[var13];
         var21 = -var1[var56 + 1] + var1[var13 + 1];
         var59 = var1[var56 - 2] + var1[var13 - 2];
         var61 = -var1[var56 - 1] - var1[var13 - 1];
         var63 = var1[var56 - 2] - var1[var13 - 2];
         var65 = -var1[var56 - 1] + var1[var13 - 1];
         var23 = var1[var12] + var1[var14];
         var25 = var1[var12 + 1] + var1[var14 + 1];
         var27 = var1[var12] - var1[var14];
         var29 = var1[var12 + 1] - var1[var14 + 1];
         var67 = var1[var12 - 2] + var1[var14 - 2];
         var69 = var1[var12 - 1] + var1[var14 - 1];
         var71 = var1[var12 - 2] - var1[var14 - 2];
         var73 = var1[var12 - 1] - var1[var14 - 1];
         var1[var56] = var15 + var23;
         var1[var56 + 1] = var17 - var25;
         var1[var56 - 2] = var59 + var67;
         var1[var56 - 1] = var61 - var69;
         var1[var12] = var15 - var23;
         var1[var12 + 1] = var17 + var25;
         var1[var12 - 2] = var59 - var67;
         var1[var12 - 1] = var61 + var69;
         var15 = var19 + var29;
         var17 = var21 + var27;
         var1[var13] = var49 * var15 - var47 * var17;
         var1[var13 + 1] = var49 * var17 + var47 * var15;
         var15 = var63 + var73;
         var17 = var65 + var71;
         var1[var13 - 2] = var39 * var15 - var37 * var17;
         var1[var13 - 1] = var39 * var17 + var37 * var15;
         var15 = var19 - var29;
         var17 = var21 - var27;
         var1[var14] = var53 * var15 + var51 * var17;
         var1[var14 + 1] = var53 * var17 - var51 * var15;
         var15 = var63 - var73;
         var17 = var65 - var71;
         var1[var14 - 2] = var43 * var15 + var41 * var17;
         var1[var14 - 1] = var43 * var17 - var41 * var15;
      }

      double var160 = var33 * (var37 + var31);
      double var161 = var33 * (var39 + var31);
      double var162 = var35 * (var41 - var31);
      double var163 = var35 * (var43 - var31);
      int var76 = var7 + var8;
      var10 = var76 + var8;
      var11 = var10 + var8;
      int var164 = var2 + var7;
      var12 = var2 + var76;
      var13 = var2 + var10;
      var14 = var2 + var11;
      var15 = var1[var164 - 2] + var1[var13 - 2];
      var17 = -var1[var164 - 1] - var1[var13 - 1];
      var19 = var1[var164 - 2] - var1[var13 - 2];
      var21 = -var1[var164 - 1] + var1[var13 - 1];
      var23 = var1[var12 - 2] + var1[var14 - 2];
      var25 = var1[var12 - 1] + var1[var14 - 1];
      var27 = var1[var12 - 2] - var1[var14 - 2];
      var29 = var1[var12 - 1] - var1[var14 - 1];
      var1[var164 - 2] = var15 + var23;
      var1[var164 - 1] = var17 - var25;
      var1[var12 - 2] = var15 - var23;
      var1[var12 - 1] = var17 + var25;
      var15 = var19 + var29;
      var17 = var21 + var27;
      var1[var13 - 2] = var160 * var15 - var161 * var17;
      var1[var13 - 1] = var160 * var17 + var161 * var15;
      var15 = var19 - var29;
      var17 = var21 - var27;
      var1[var14 - 2] = var162 * var15 + var163 * var17;
      var1[var14 - 1] = var162 * var17 - var163 * var15;
      var15 = var1[var164] + var1[var13];
      var17 = -var1[var164 + 1] - var1[var13 + 1];
      var19 = var1[var164] - var1[var13];
      var21 = -var1[var164 + 1] + var1[var13 + 1];
      var23 = var1[var12] + var1[var14];
      var25 = var1[var12 + 1] + var1[var14 + 1];
      var27 = var1[var12] - var1[var14];
      var29 = var1[var12 + 1] - var1[var14 + 1];
      var1[var164] = var15 + var23;
      var1[var164 + 1] = var17 - var25;
      var1[var12] = var15 - var23;
      var1[var12 + 1] = var17 + var25;
      var15 = var19 + var29;
      var17 = var21 + var27;
      var1[var13] = var31 * (var15 - var17);
      var1[var13 + 1] = var31 * (var17 + var15);
      var15 = var19 - var29;
      var17 = var21 - var27;
      var1[var14] = -var31 * (var15 + var17);
      var1[var14 + 1] = -var31 * (var17 - var15);
      var15 = var1[var164 + 2] + var1[var13 + 2];
      var17 = -var1[var164 + 3] - var1[var13 + 3];
      var19 = var1[var164 + 2] - var1[var13 + 2];
      var21 = -var1[var164 + 3] + var1[var13 + 3];
      var23 = var1[var12 + 2] + var1[var14 + 2];
      var25 = var1[var12 + 3] + var1[var14 + 3];
      var27 = var1[var12 + 2] - var1[var14 + 2];
      var29 = var1[var12 + 3] - var1[var14 + 3];
      var1[var164 + 2] = var15 + var23;
      var1[var164 + 3] = var17 - var25;
      var1[var12 + 2] = var15 - var23;
      var1[var12 + 3] = var17 + var25;
      var15 = var19 + var29;
      var17 = var21 + var27;
      var1[var13 + 2] = var161 * var15 - var160 * var17;
      var1[var13 + 3] = var161 * var17 + var160 * var15;
      var15 = var19 - var29;
      var17 = var21 - var27;
      var1[var14 + 2] = var163 * var15 + var162 * var17;
      var1[var14 + 3] = var163 * var17 - var162 * var15;
   }

   public static void method25939(long var0, Class2381 var2, long var3, Class2381 var5, long var6) {
      long var10 = var0 >> 3;
      long var12 = 2L * var10;
      long var16 = var12 + var12;
      long var18 = var16 + var12;
      long var20 = var3 + var12;
      long var22 = var3 + var16;
      long var24 = var3 + var18;
      double var26 = var2.method9653(var3) + var2.method9653(var22);
      double var28 = -var2.method9653(var3 + 1L) - var2.method9653(var22 + 1L);
      double var30 = var2.method9653(var3) - var2.method9653(var22);
      double var32 = -var2.method9653(var3 + 1L) + var2.method9653(var22 + 1L);
      double var34 = var2.method9653(var20) + var2.method9653(var24);
      double var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
      double var38 = var2.method9653(var20) - var2.method9653(var24);
      double var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
      var2.method9687(var3, var26 + var34);
      var2.method9687(var3 + 1L, var28 - var36);
      var2.method9687(var20, var26 - var34);
      var2.method9687(var20 + 1L, var28 + var36);
      var2.method9687(var22, var30 + var40);
      var2.method9687(var22 + 1L, var32 + var38);
      var2.method9687(var24, var30 - var40);
      var2.method9687(var24 + 1L, var32 - var38);
      double var42 = var5.method9653(var6 + 1L);
      double var44 = var5.method9653(var6 + 2L);
      double var46 = var5.method9653(var6 + 3L);
      double var48 = 1.0;
      double var50 = 0.0;
      double var52 = 1.0;
      double var54 = 0.0;
      long var56 = 0L;

      for (long var58 = 2L; var58 < var10 - 2L; var58 += 4L) {
         var56 += 4L;
         long var72 = var6 + var56;
         double var60 = var44 * (var48 + var5.method9653(var72));
         double var62 = var44 * (var50 + var5.method9653(var72 + 1L));
         double var64 = var46 * (var52 + var5.method9653(var72 + 2L));
         double var66 = var46 * (var54 + var5.method9653(var72 + 3L));
         var48 = var5.method9653(var72);
         var50 = var5.method9653(var72 + 1L);
         var52 = var5.method9653(var72 + 2L);
         var54 = var5.method9653(var72 + 3L);
         long var14 = var58 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         long var74 = var3 + var58;
         var26 = var2.method9653(var74) + var2.method9653(var22);
         var28 = -var2.method9653(var74 + 1L) - var2.method9653(var22 + 1L);
         var30 = var2.method9653(var74) - var2.method9653(var3 + var16);
         var32 = -var2.method9653(var74 + 1L) + var2.method9653(var22 + 1L);
         double var76 = var2.method9653(var74 + 2L) + var2.method9653(var22 + 2L);
         double var78 = -var2.method9653(var74 + 3L) - var2.method9653(var22 + 3L);
         double var80 = var2.method9653(var74 + 2L) - var2.method9653(var22 + 2L);
         double var82 = -var2.method9653(var74 + 3L) + var2.method9653(var22 + 3L);
         var34 = var2.method9653(var20) + var2.method9653(var24);
         var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
         var38 = var2.method9653(var20) - var2.method9653(var24);
         var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
         double var84 = var2.method9653(var20 + 2L) + var2.method9653(var24 + 2L);
         double var86 = var2.method9653(var20 + 3L) + var2.method9653(var24 + 3L);
         double var88 = var2.method9653(var20 + 2L) - var2.method9653(var24 + 2L);
         double var90 = var2.method9653(var20 + 3L) - var2.method9653(var24 + 3L);
         var2.method9687(var74, var26 + var34);
         var2.method9687(var74 + 1L, var28 - var36);
         var2.method9687(var74 + 2L, var76 + var84);
         var2.method9687(var74 + 3L, var78 - var86);
         var2.method9687(var20, var26 - var34);
         var2.method9687(var20 + 1L, var28 + var36);
         var2.method9687(var20 + 2L, var76 - var84);
         var2.method9687(var20 + 3L, var78 + var86);
         var26 = var30 + var40;
         var28 = var32 + var38;
         var2.method9687(var22, var60 * var26 - var62 * var28);
         var2.method9687(var22 + 1L, var60 * var28 + var62 * var26);
         var26 = var80 + var90;
         var28 = var82 + var88;
         var2.method9687(var22 + 2L, var48 * var26 - var50 * var28);
         var2.method9687(var22 + 3L, var48 * var28 + var50 * var26);
         var26 = var30 - var40;
         var28 = var32 - var38;
         var2.method9687(var24, var64 * var26 + var66 * var28);
         var2.method9687(var24 + 1L, var64 * var28 - var66 * var26);
         var26 = var80 - var90;
         var28 = var82 - var88;
         var2.method9687(var24 + 2L, var52 * var26 + var54 * var28);
         var2.method9687(var24 + 3L, var52 * var28 - var54 * var26);
         long var68 = var12 - var58;
         var14 = var68 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         long var70 = var3 + var68;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         var26 = var2.method9653(var70) + var2.method9653(var22);
         var28 = -var2.method9653(var70 + 1L) - var2.method9653(var22 + 1L);
         var30 = var2.method9653(var70) - var2.method9653(var22);
         var32 = -var2.method9653(var70 + 1L) + var2.method9653(var22 + 1L);
         var76 = var2.method9653(var70 - 2L) + var2.method9653(var22 - 2L);
         var78 = -var2.method9653(var70 - 1L) - var2.method9653(var22 - 1L);
         var80 = var2.method9653(var70 - 2L) - var2.method9653(var22 - 2L);
         var82 = -var2.method9653(var70 - 1L) + var2.method9653(var22 - 1L);
         var34 = var2.method9653(var20) + var2.method9653(var24);
         var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
         var38 = var2.method9653(var20) - var2.method9653(var24);
         var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
         var84 = var2.method9653(var20 - 2L) + var2.method9653(var24 - 2L);
         var86 = var2.method9653(var20 - 1L) + var2.method9653(var24 - 1L);
         var88 = var2.method9653(var20 - 2L) - var2.method9653(var24 - 2L);
         var90 = var2.method9653(var20 - 1L) - var2.method9653(var24 - 1L);
         var2.method9687(var70, var26 + var34);
         var2.method9687(var70 + 1L, var28 - var36);
         var2.method9687(var70 - 2L, var76 + var84);
         var2.method9687(var70 - 1L, var78 - var86);
         var2.method9687(var20, var26 - var34);
         var2.method9687(var20 + 1L, var28 + var36);
         var2.method9687(var20 - 2L, var76 - var84);
         var2.method9687(var20 - 1L, var78 + var86);
         var26 = var30 + var40;
         var28 = var32 + var38;
         var2.method9687(var22, var62 * var26 - var60 * var28);
         var2.method9687(var22 + 1L, var62 * var28 + var60 * var26);
         var26 = var80 + var90;
         var28 = var82 + var88;
         var2.method9687(var22 - 2L, var50 * var26 - var48 * var28);
         var2.method9687(var22 - 1L, var50 * var28 + var48 * var26);
         var26 = var30 - var40;
         var28 = var32 - var38;
         var2.method9687(var24, var66 * var26 + var64 * var28);
         var2.method9687(var24 + 1L, var66 * var28 - var64 * var26);
         var26 = var80 - var90;
         var28 = var82 - var88;
         var2.method9687(var24 - 2L, var54 * var26 + var52 * var28);
         var2.method9687(var24 - 1L, var54 * var28 - var52 * var26);
      }

      double var177 = var44 * (var48 + var42);
      double var178 = var44 * (var50 + var42);
      double var179 = var46 * (var52 - var42);
      double var180 = var46 * (var54 - var42);
      long var93 = var10 + var12;
      var16 = var93 + var12;
      var18 = var16 + var12;
      long var181 = var3 + var10;
      var20 = var3 + var93;
      var22 = var3 + var16;
      var24 = var3 + var18;
      var26 = var2.method9653(var181 - 2L) + var2.method9653(var22 - 2L);
      var28 = -var2.method9653(var181 - 1L) - var2.method9653(var22 - 1L);
      var30 = var2.method9653(var181 - 2L) - var2.method9653(var22 - 2L);
      var32 = -var2.method9653(var181 - 1L) + var2.method9653(var22 - 1L);
      var34 = var2.method9653(var20 - 2L) + var2.method9653(var24 - 2L);
      var36 = var2.method9653(var20 - 1L) + var2.method9653(var24 - 1L);
      var38 = var2.method9653(var20 - 2L) - var2.method9653(var24 - 2L);
      var40 = var2.method9653(var20 - 1L) - var2.method9653(var24 - 1L);
      var2.method9687(var181 - 2L, var26 + var34);
      var2.method9687(var181 - 1L, var28 - var36);
      var2.method9687(var20 - 2L, var26 - var34);
      var2.method9687(var20 - 1L, var28 + var36);
      var26 = var30 + var40;
      var28 = var32 + var38;
      var2.method9687(var22 - 2L, var177 * var26 - var178 * var28);
      var2.method9687(var22 - 1L, var177 * var28 + var178 * var26);
      var26 = var30 - var40;
      var28 = var32 - var38;
      var2.method9687(var24 - 2L, var179 * var26 + var180 * var28);
      var2.method9687(var24 - 1L, var179 * var28 - var180 * var26);
      var26 = var2.method9653(var181) + var2.method9653(var22);
      var28 = -var2.method9653(var181 + 1L) - var2.method9653(var22 + 1L);
      var30 = var2.method9653(var181) - var2.method9653(var22);
      var32 = -var2.method9653(var181 + 1L) + var2.method9653(var22 + 1L);
      var34 = var2.method9653(var20) + var2.method9653(var24);
      var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
      var38 = var2.method9653(var20) - var2.method9653(var24);
      var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
      var2.method9687(var181, var26 + var34);
      var2.method9687(var181 + 1L, var28 - var36);
      var2.method9687(var20, var26 - var34);
      var2.method9687(var20 + 1L, var28 + var36);
      var26 = var30 + var40;
      var28 = var32 + var38;
      var2.method9687(var22, var42 * (var26 - var28));
      var2.method9687(var22 + 1L, var42 * (var28 + var26));
      var26 = var30 - var40;
      var28 = var32 - var38;
      var2.method9687(var24, -var42 * (var26 + var28));
      var2.method9687(var24 + 1L, -var42 * (var28 - var26));
      var26 = var2.method9653(var181 + 2L) + var2.method9653(var22 + 2L);
      var28 = -var2.method9653(var181 + 3L) - var2.method9653(var22 + 3L);
      var30 = var2.method9653(var181 + 2L) - var2.method9653(var22 + 2L);
      var32 = -var2.method9653(var181 + 3L) + var2.method9653(var22 + 3L);
      var34 = var2.method9653(var20 + 2L) + var2.method9653(var24 + 2L);
      var36 = var2.method9653(var20 + 3L) + var2.method9653(var24 + 3L);
      var38 = var2.method9653(var20 + 2L) - var2.method9653(var24 + 2L);
      var40 = var2.method9653(var20 + 3L) - var2.method9653(var24 + 3L);
      var2.method9687(var181 + 2L, var26 + var34);
      var2.method9687(var181 + 3L, var28 - var36);
      var2.method9687(var20 + 2L, var26 - var34);
      var2.method9687(var20 + 3L, var28 + var36);
      var26 = var30 + var40;
      var28 = var32 + var38;
      var2.method9687(var22 + 2L, var178 * var26 - var177 * var28);
      var2.method9687(var22 + 3L, var178 * var28 + var177 * var26);
      var26 = var30 - var40;
      var28 = var32 - var38;
      var2.method9687(var24 + 2L, var180 * var26 + var179 * var28);
      var2.method9687(var24 + 3L, var180 * var28 - var179 * var26);
   }

   public static void method25940(int var0, double[] var1, int var2, int var3, double[] var4) {
      int var7 = 0;
      byte var8 = 2;
      byte var9 = 0;
      int var10 = var0 >> 1;
      if ((long)var0 >= method25892()) {
         var8 = 4;
         var9 = 1;
         var10 >>= 1;
      }

      Future[] var11 = new Future[var8];
      int var12 = var10;

      for (int var13 = 0; var13 < var8; var13++) {
         int var14 = var2 + var13 * var10;
         if (var13 != var9) {
            var11[var7++] = Class7008.method21729(new Class461(var14, var12, var0, var1, var4, var3));
         } else {
            var11[var7++] = Class7008.method21729(new Class1385(var14, var12, var0, var1, var4, var3));
         }
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   public static void method25941(long var0, Class2381 var2, long var3, long var5, Class2381 var7) {
      int var10 = 0;
      byte var11 = 2;
      byte var12 = 0;
      long var13 = var0 >> 1;
      if (var0 >= method25892()) {
         var11 = 4;
         var12 = 1;
         var13 >>= 1;
      }

      Future[] var15 = new Future[var11];
      long var16 = var13;

      for (int var18 = 0; var18 < var11; var18++) {
         long var19 = var3 + (long)var18 * var13;
         if (var18 != var12) {
            var15[var10++] = Class7008.method21729(new Class1638(var19, var16, var0, var2, var7, var5));
         } else {
            var15[var10++] = Class7008.method21729(new Class524(var19, var16, var0, var2, var7, var5));
         }
      }

      try {
         Class7008.method21730(var15);
      } catch (InterruptedException var22) {
         Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var22);
      } catch (ExecutionException var23) {
         Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var23);
      }
   }

   public static void method25942(int var0, double[] var1, int var2, int var3, double[] var4) {
      int var7 = var0;
      int var8 = var2 + var0;

      while (var7 > 512) {
         var7 >>= 2;
         method25948(var7, var1, var8 - var7, var4, var3 - (var7 >> 1));
      }

      method25946(var7, 1, var1, var8 - var7, var3, var4);
      int var9 = 0;
      int var10 = var2 - var7;

      for (int var11 = var0 - var7; var11 > 0; var11 -= var7) {
         int var12 = method25944(var7, var11, ++var9, var1, var2, var3, var4);
         method25946(var7, var12, var1, var10 + var11, var3, var4);
      }
   }

   public static void method25943(long var0, Class2381 var2, long var3, long var5, Class2381 var7) {
      long var10 = var0;
      long var12 = var3 + var0;

      while (var10 > 512L) {
         var10 >>= 2;
         method25949(var10, var2, var12 - var10, var7, var5 - (var10 >> 1));
      }

      method25947(var10, 1L, var2, var12 - var10, var5, var7);
      long var14 = 0L;
      long var16 = var3 - var10;

      for (long var18 = var0 - var10; var18 > 0L; var18 -= var10) {
         long var20 = method25945(var10, var18, ++var14, var2, var3, var5, var7);
         method25947(var10, var20, var2, var16 + var18, var5, var7);
      }
   }

   public static int method25944(int var0, int var1, int var2, double[] var3, int var4, int var5, double[] var6) {
      int var7 = 1611357873;
      int var9 = var4 - var0;
      int var10 = var0;

      int var11;
      for (var11 = var2; (var11 & 3) == 0; var11 >>= 2) {
         var10 <<= 2;
      }

      int var12 = var11 & 1;
      int var13 = var4 + var1;
      if (var12 == 0) {
         while (var10 > 128) {
            method25950(var10, var3, var13 - var10, var6, var5 - var10);
            var10 >>= 2;
         }
      } else {
         while (var10 > 128) {
            method25948(var10, var3, var13 - var10, var6, var5 - (var10 >> 1));
            var10 >>= 2;
         }
      }

      while ((var7 & 67108864) != 0) {
         if ((var7 & 262144) == 0) {
            method25950(var0, var3, var9 + var1, var6, var5 - var0);
         }
      }

      return var12;
   }

   public static long method25945(long var0, long var2, long var4, Class2381 var6, long var7, long var9, Class2381 var11) {
      long var14 = var7 - var0;
      long var20;
      if ((var4 & 3L) == 0L) {
         long var16 = var0;

         long var18;
         for (var18 = var4; (var18 & 3L) == 0L; var18 >>= 2) {
            var16 <<= 2;
         }

         var20 = var18 & 1L;
         long var22 = var7 + var2;
         if (var20 == 0L) {
            while (var16 > 128L) {
               method25951(var16, var6, var22 - var16, var11, var9 - var16);
               var16 >>= 2;
            }
         } else {
            while (var16 > 128L) {
               method25949(var16, var6, var22 - var16, var11, var9 - (var16 >> 1));
               var16 >>= 2;
            }
         }
      } else {
         var20 = var4 & 1L;
         if (var20 == 0L) {
            method25951(var0, var6, var14 + var2, var11, var9 - var0);
         } else {
            method25949(var0, var6, var14 + var2, var11, var9 - (var0 >> 1));
         }
      }

      return var20;
   }

   public static void method25946(int var0, int var1, double[] var2, int var3, int var4, double[] var5) {
      if (var0 != 512) {
         method25948(64, var2, var3, var5, var4 - 32);
         method25958(var2, var3, var5, var4 - 8);
         method25960(var2, var3 + 16, var5, var4 - 8);
         method25958(var2, var3 + 32, var5, var4 - 8);
         method25958(var2, var3 + 48, var5, var4 - 8);
         method25950(64, var2, var3 + 64, var5, var4 - 64);
         method25958(var2, var3 + 64, var5, var4 - 8);
         method25960(var2, var3 + 80, var5, var4 - 8);
         method25958(var2, var3 + 96, var5, var4 - 8);
         method25960(var2, var3 + 112, var5, var4 - 8);
         method25948(64, var2, var3 + 128, var5, var4 - 32);
         method25958(var2, var3 + 128, var5, var4 - 8);
         method25960(var2, var3 + 144, var5, var4 - 8);
         method25958(var2, var3 + 160, var5, var4 - 8);
         method25958(var2, var3 + 176, var5, var4 - 8);
         if (var1 == 0) {
            method25950(64, var2, var3 + 192, var5, var4 - 64);
            method25960(var2, var3 + 240, var5, var4 - 8);
         } else {
            method25948(64, var2, var3 + 192, var5, var4 - 32);
            method25958(var2, var3 + 240, var5, var4 - 8);
         }

         method25958(var2, var3 + 192, var5, var4 - 8);
         method25960(var2, var3 + 208, var5, var4 - 8);
         method25958(var2, var3 + 224, var5, var4 - 8);
      } else {
         method25948(128, var2, var3, var5, var4 - 64);
         method25954(var2, var3, var5, var4 - 8);
         method25956(var2, var3 + 32, var5, var4 - 32);
         method25954(var2, var3 + 64, var5, var4 - 8);
         method25954(var2, var3 + 96, var5, var4 - 8);
         method25950(128, var2, var3 + 128, var5, var4 - 128);
         method25954(var2, var3 + 128, var5, var4 - 8);
         method25956(var2, var3 + 160, var5, var4 - 32);
         method25954(var2, var3 + 192, var5, var4 - 8);
         method25956(var2, var3 + 224, var5, var4 - 32);
         method25948(128, var2, var3 + 256, var5, var4 - 64);
         method25954(var2, var3 + 256, var5, var4 - 8);
         method25956(var2, var3 + 288, var5, var4 - 32);
         method25954(var2, var3 + 320, var5, var4 - 8);
         method25954(var2, var3 + 352, var5, var4 - 8);
         if (var1 == 0) {
            method25950(128, var2, var3 + 384, var5, var4 - 128);
            method25956(var2, var3 + 480, var5, var4 - 32);
         } else {
            method25948(128, var2, var3 + 384, var5, var4 - 64);
            method25954(var2, var3 + 480, var5, var4 - 8);
         }

         method25954(var2, var3 + 384, var5, var4 - 8);
         method25956(var2, var3 + 416, var5, var4 - 32);
         method25954(var2, var3 + 448, var5, var4 - 8);
      }
   }

   public static void method25947(long var0, long var2, Class2381 var4, long var5, long var7, Class2381 var9) {
      if (var0 != 512L) {
         method25949(64L, var4, var5, var9, var7 - 32L);
         method25959(var4, var5, var9, var7 - 8L);
         method25961(var4, var5 + 16L, var9, var7 - 8L);
         method25959(var4, var5 + 32L, var9, var7 - 8L);
         method25959(var4, var5 + 48L, var9, var7 - 8L);
         method25951(64L, var4, var5 + 64L, var9, var7 - 64L);
         method25959(var4, var5 + 64L, var9, var7 - 8L);
         method25961(var4, var5 + 80L, var9, var7 - 8L);
         method25959(var4, var5 + 96L, var9, var7 - 8L);
         method25961(var4, var5 + 112L, var9, var7 - 8L);
         method25949(64L, var4, var5 + 128L, var9, var7 - 32L);
         method25959(var4, var5 + 128L, var9, var7 - 8L);
         method25961(var4, var5 + 144L, var9, var7 - 8L);
         method25959(var4, var5 + 160L, var9, var7 - 8L);
         method25959(var4, var5 + 176L, var9, var7 - 8L);
         if (var2 == 0L) {
            method25951(64L, var4, var5 + 192L, var9, var7 - 64L);
            method25961(var4, var5 + 240L, var9, var7 - 8L);
         } else {
            method25949(64L, var4, var5 + 192L, var9, var7 - 32L);
            method25959(var4, var5 + 240L, var9, var7 - 8L);
         }

         method25959(var4, var5 + 192L, var9, var7 - 8L);
         method25961(var4, var5 + 208L, var9, var7 - 8L);
         method25959(var4, var5 + 224L, var9, var7 - 8L);
      } else {
         method25949(128L, var4, var5, var9, var7 - 64L);
         method25955(var4, var5, var9, var7 - 8L);
         method25957(var4, var5 + 32L, var9, var7 - 32L);
         method25955(var4, var5 + 64L, var9, var7 - 8L);
         method25955(var4, var5 + 96L, var9, var7 - 8L);
         method25951(128L, var4, var5 + 128L, var9, var7 - 128L);
         method25955(var4, var5 + 128L, var9, var7 - 8L);
         method25957(var4, var5 + 160L, var9, var7 - 32L);
         method25955(var4, var5 + 192L, var9, var7 - 8L);
         method25957(var4, var5 + 224L, var9, var7 - 32L);
         method25949(128L, var4, var5 + 256L, var9, var7 - 64L);
         method25955(var4, var5 + 256L, var9, var7 - 8L);
         method25957(var4, var5 + 288L, var9, var7 - 32L);
         method25955(var4, var5 + 320L, var9, var7 - 8L);
         method25955(var4, var5 + 352L, var9, var7 - 8L);
         if (var2 == 0L) {
            method25951(128L, var4, var5 + 384L, var9, var7 - 128L);
            method25957(var4, var5 + 480L, var9, var7 - 32L);
         } else {
            method25949(128L, var4, var5 + 384L, var9, var7 - 64L);
            method25955(var4, var5 + 480L, var9, var7 - 8L);
         }

         method25955(var4, var5 + 384L, var9, var7 - 8L);
         method25957(var4, var5 + 416L, var9, var7 - 32L);
         method25955(var4, var5 + 448L, var9, var7 - 8L);
      }
   }

   public static void method25948(int var0, double[] var1, int var2, double[] var3, int var4) {
      int var7 = var0 >> 3;
      int var8 = 2 * var7;
      int var10 = var8 + var8;
      int var11 = var10 + var8;
      int var12 = var2 + var8;
      int var13 = var2 + var10;
      int var14 = var2 + var11;
      double var15 = var1[var2] + var1[var13];
      double var17 = var1[var2 + 1] + var1[var13 + 1];
      double var19 = var1[var2] - var1[var13];
      double var21 = var1[var2 + 1] - var1[var13 + 1];
      double var23 = var1[var12] + var1[var14];
      double var25 = var1[var12 + 1] + var1[var14 + 1];
      double var27 = var1[var12] - var1[var14];
      double var29 = var1[var12 + 1] - var1[var14 + 1];
      var1[var2] = var15 + var23;
      var1[var2 + 1] = var17 + var25;
      var1[var12] = var15 - var23;
      var1[var12 + 1] = var17 - var25;
      var1[var13] = var19 - var29;
      var1[var13 + 1] = var21 + var27;
      var1[var14] = var19 + var29;
      var1[var14 + 1] = var21 - var27;
      double var31 = var3[var4 + 1];
      byte var33 = 0;

      for (int var34 = 2; var34 < var7; var34 += 2) {
         var33 += 4;
         int var37 = var4 + var33;
         double var38 = var3[var37];
         double var40 = var3[var37 + 1];
         double var42 = var3[var37 + 2];
         double var44 = var3[var37 + 3];
         int var9 = var34 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         int var46 = var2 + var34;
         var15 = var1[var46] + var1[var13];
         var17 = var1[var46 + 1] + var1[var13 + 1];
         var19 = var1[var46] - var1[var13];
         var21 = var1[var46 + 1] - var1[var13 + 1];
         var23 = var1[var12] + var1[var14];
         var25 = var1[var12 + 1] + var1[var14 + 1];
         var27 = var1[var12] - var1[var14];
         var29 = var1[var12 + 1] - var1[var14 + 1];
         var1[var46] = var15 + var23;
         var1[var46 + 1] = var17 + var25;
         var1[var12] = var15 - var23;
         var1[var12 + 1] = var17 - var25;
         var15 = var19 - var29;
         var17 = var21 + var27;
         var1[var13] = var38 * var15 - var40 * var17;
         var1[var13 + 1] = var38 * var17 + var40 * var15;
         var15 = var19 + var29;
         var17 = var21 - var27;
         var1[var14] = var42 * var15 + var44 * var17;
         var1[var14 + 1] = var42 * var17 - var44 * var15;
         int var35 = var8 - var34;
         var9 = var35 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         int var36 = var2 + var35;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         var15 = var1[var36] + var1[var13];
         var17 = var1[var36 + 1] + var1[var13 + 1];
         var19 = var1[var36] - var1[var13];
         var21 = var1[var36 + 1] - var1[var13 + 1];
         var23 = var1[var12] + var1[var14];
         var25 = var1[var12 + 1] + var1[var14 + 1];
         var27 = var1[var12] - var1[var14];
         var29 = var1[var12 + 1] - var1[var14 + 1];
         var1[var36] = var15 + var23;
         var1[var36 + 1] = var17 + var25;
         var1[var12] = var15 - var23;
         var1[var12 + 1] = var17 - var25;
         var15 = var19 - var29;
         var17 = var21 + var27;
         var1[var13] = var40 * var15 - var38 * var17;
         var1[var13 + 1] = var40 * var17 + var38 * var15;
         var15 = var19 + var29;
         var17 = var21 - var27;
         var1[var14] = var44 * var15 + var42 * var17;
         var1[var14 + 1] = var44 * var17 - var42 * var15;
      }

      int var48 = var7 + var8;
      var10 = var48 + var8;
      var11 = var10 + var8;
      int var100 = var2 + var7;
      var12 = var2 + var48;
      var13 = var2 + var10;
      var14 = var2 + var11;
      var15 = var1[var100] + var1[var13];
      var17 = var1[var100 + 1] + var1[var13 + 1];
      var19 = var1[var100] - var1[var13];
      var21 = var1[var100 + 1] - var1[var13 + 1];
      var23 = var1[var12] + var1[var14];
      var25 = var1[var12 + 1] + var1[var14 + 1];
      var27 = var1[var12] - var1[var14];
      var29 = var1[var12 + 1] - var1[var14 + 1];
      var1[var100] = var15 + var23;
      var1[var100 + 1] = var17 + var25;
      var1[var12] = var15 - var23;
      var1[var12 + 1] = var17 - var25;
      var15 = var19 - var29;
      var17 = var21 + var27;
      var1[var13] = var31 * (var15 - var17);
      var1[var13 + 1] = var31 * (var17 + var15);
      var15 = var19 + var29;
      var17 = var21 - var27;
      var1[var14] = -var31 * (var15 + var17);
      var1[var14 + 1] = -var31 * (var17 - var15);
   }

   public static void method25949(long var0, Class2381 var2, long var3, Class2381 var5, long var6) {
      long var10 = var0 >> 3;
      long var12 = 2L * var10;
      long var16 = var12 + var12;
      long var18 = var16 + var12;
      long var20 = var3 + var12;
      long var22 = var3 + var16;
      long var24 = var3 + var18;
      double var26 = var2.method9653(var3) + var2.method9653(var22);
      double var28 = var2.method9653(var3 + 1L) + var2.method9653(var22 + 1L);
      double var30 = var2.method9653(var3) - var2.method9653(var22);
      double var32 = var2.method9653(var3 + 1L) - var2.method9653(var22 + 1L);
      double var34 = var2.method9653(var20) + var2.method9653(var24);
      double var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
      double var38 = var2.method9653(var20) - var2.method9653(var24);
      double var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
      var2.method9687(var3, var26 + var34);
      var2.method9687(var3 + 1L, var28 + var36);
      var2.method9687(var20, var26 - var34);
      var2.method9687(var20 + 1L, var28 - var36);
      var2.method9687(var22, var30 - var40);
      var2.method9687(var22 + 1L, var32 + var38);
      var2.method9687(var24, var30 + var40);
      var2.method9687(var24 + 1L, var32 - var38);
      double var42 = var5.method9653(var6 + 1L);
      long var44 = 0L;

      for (long var46 = 2L; var46 < var10; var46 += 2L) {
         var44 += 4L;
         long var52 = var6 + var44;
         double var54 = var5.method9653(var52);
         double var56 = var5.method9653(var52 + 1L);
         double var58 = var5.method9653(var52 + 2L);
         double var60 = var5.method9653(var52 + 3L);
         long var14 = var46 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         long var62 = var3 + var46;
         var26 = var2.method9653(var62) + var2.method9653(var22);
         var28 = var2.method9653(var62 + 1L) + var2.method9653(var22 + 1L);
         var30 = var2.method9653(var62) - var2.method9653(var22);
         var32 = var2.method9653(var62 + 1L) - var2.method9653(var22 + 1L);
         var34 = var2.method9653(var20) + var2.method9653(var24);
         var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
         var38 = var2.method9653(var20) - var2.method9653(var24);
         var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
         var2.method9687(var62, var26 + var34);
         var2.method9687(var62 + 1L, var28 + var36);
         var2.method9687(var20, var26 - var34);
         var2.method9687(var20 + 1L, var28 - var36);
         var26 = var30 - var40;
         var28 = var32 + var38;
         var2.method9687(var22, var54 * var26 - var56 * var28);
         var2.method9687(var22 + 1L, var54 * var28 + var56 * var26);
         var26 = var30 + var40;
         var28 = var32 - var38;
         var2.method9687(var24, var58 * var26 + var60 * var28);
         var2.method9687(var24 + 1L, var58 * var28 - var60 * var26);
         long var48 = var12 - var46;
         var14 = var48 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         long var50 = var3 + var48;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         var26 = var2.method9653(var50) + var2.method9653(var22);
         var28 = var2.method9653(var50 + 1L) + var2.method9653(var22 + 1L);
         var30 = var2.method9653(var50) - var2.method9653(var22);
         var32 = var2.method9653(var50 + 1L) - var2.method9653(var22 + 1L);
         var34 = var2.method9653(var20) + var2.method9653(var24);
         var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
         var38 = var2.method9653(var20) - var2.method9653(var24);
         var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
         var2.method9687(var50, var26 + var34);
         var2.method9687(var50 + 1L, var28 + var36);
         var2.method9687(var20, var26 - var34);
         var2.method9687(var20 + 1L, var28 - var36);
         var26 = var30 - var40;
         var28 = var32 + var38;
         var2.method9687(var22, var56 * var26 - var54 * var28);
         var2.method9687(var22 + 1L, var56 * var28 + var54 * var26);
         var26 = var30 + var40;
         var28 = var32 - var38;
         var2.method9687(var24, var60 * var26 + var58 * var28);
         var2.method9687(var24 + 1L, var60 * var28 - var58 * var26);
      }

      long var65 = var10 + var12;
      var16 = var65 + var12;
      var18 = var16 + var12;
      long var117 = var3 + var10;
      var20 = var3 + var65;
      var22 = var3 + var16;
      var24 = var3 + var18;
      var26 = var2.method9653(var117) + var2.method9653(var22);
      var28 = var2.method9653(var117 + 1L) + var2.method9653(var22 + 1L);
      var30 = var2.method9653(var117) - var2.method9653(var22);
      var32 = var2.method9653(var117 + 1L) - var2.method9653(var22 + 1L);
      var34 = var2.method9653(var20) + var2.method9653(var24);
      var36 = var2.method9653(var20 + 1L) + var2.method9653(var24 + 1L);
      var38 = var2.method9653(var20) - var2.method9653(var24);
      var40 = var2.method9653(var20 + 1L) - var2.method9653(var24 + 1L);
      var2.method9687(var117, var26 + var34);
      var2.method9687(var117 + 1L, var28 + var36);
      var2.method9687(var20, var26 - var34);
      var2.method9687(var20 + 1L, var28 - var36);
      var26 = var30 - var40;
      var28 = var32 + var38;
      var2.method9687(var22, var42 * (var26 - var28));
      var2.method9687(var22 + 1L, var42 * (var28 + var26));
      var26 = var30 + var40;
      var28 = var32 - var38;
      var2.method9687(var24, -var42 * (var26 + var28));
      var2.method9687(var24 + 1L, -var42 * (var28 - var26));
   }

   public static void method25950(int var0, double[] var1, int var2, double[] var3, int var4) {
      int var7 = var0 >> 3;
      int var8 = 2 * var7;
      double var9 = var3[var4 + 1];
      int var12 = var8 + var8;
      int var13 = var12 + var8;
      int var14 = var2 + var8;
      int var15 = var2 + var12;
      int var16 = var2 + var13;
      double var17 = var1[var2] - var1[var15 + 1];
      double var19 = var1[var2 + 1] + var1[var15];
      double var21 = var1[var2] + var1[var15 + 1];
      double var23 = var1[var2 + 1] - var1[var15];
      double var25 = var1[var14] - var1[var16 + 1];
      double var27 = var1[var14 + 1] + var1[var16];
      double var29 = var1[var14] + var1[var16 + 1];
      double var31 = var1[var14 + 1] - var1[var16];
      double var33 = var9 * (var25 - var27);
      double var35 = var9 * (var27 + var25);
      var1[var2] = var17 + var33;
      var1[var2 + 1] = var19 + var35;
      var1[var14] = var17 - var33;
      var1[var14 + 1] = var19 - var35;
      var33 = var9 * (var29 - var31);
      var35 = var9 * (var31 + var29);
      var1[var15] = var21 - var35;
      var1[var15 + 1] = var23 + var33;
      var1[var16] = var21 + var35;
      var1[var16 + 1] = var23 - var33;
      byte var37 = 0;
      int var38 = 2 * var8;

      for (int var39 = 2; var39 < var7; var39 += 2) {
         var37 += 4;
         int var50 = var4 + var37;
         double var40 = var3[var50];
         double var42 = var3[var50 + 1];
         double var51 = var3[var50 + 2];
         double var53 = var3[var50 + 3];
         var38 -= 4;
         int var55 = var4 + var38;
         double var56 = var3[var55];
         double var58 = var3[var55 + 1];
         double var60 = var3[var55 + 2];
         double var62 = var3[var55 + 3];
         int var11 = var39 + var8;
         var12 = var11 + var8;
         var13 = var12 + var8;
         var14 = var2 + var11;
         var15 = var2 + var12;
         var16 = var2 + var13;
         int var64 = var2 + var39;
         var17 = var1[var64] - var1[var15 + 1];
         var19 = var1[var64 + 1] + var1[var15];
         var21 = var1[var64] + var1[var15 + 1];
         var23 = var1[var64 + 1] - var1[var15];
         var25 = var1[var14] - var1[var16 + 1];
         var27 = var1[var14 + 1] + var1[var16];
         var29 = var1[var14] + var1[var16 + 1];
         var31 = var1[var14 + 1] - var1[var16];
         var33 = var40 * var17 - var42 * var19;
         var35 = var40 * var19 + var42 * var17;
         double var46 = var58 * var25 - var56 * var27;
         double var48 = var58 * var27 + var56 * var25;
         var1[var64] = var33 + var46;
         var1[var64 + 1] = var35 + var48;
         var1[var14] = var33 - var46;
         var1[var14 + 1] = var35 - var48;
         var33 = var51 * var21 + var53 * var23;
         var35 = var51 * var23 - var53 * var21;
         var46 = var62 * var29 + var60 * var31;
         var48 = var62 * var31 - var60 * var29;
         var1[var15] = var33 + var46;
         var1[var15 + 1] = var35 + var48;
         var1[var16] = var33 - var46;
         var1[var16 + 1] = var35 - var48;
         int var44 = var8 - var39;
         var11 = var44 + var8;
         var12 = var11 + var8;
         var13 = var12 + var8;
         int var45 = var2 + var44;
         var14 = var2 + var11;
         var15 = var2 + var12;
         var16 = var2 + var13;
         var17 = var1[var45] - var1[var15 + 1];
         var19 = var1[var45 + 1] + var1[var15];
         var21 = var1[var45] + var1[var15 + 1];
         var23 = var1[var45 + 1] - var1[var15];
         var25 = var1[var14] - var1[var16 + 1];
         var27 = var1[var14 + 1] + var1[var16];
         var29 = var1[var14] + var1[var16 + 1];
         var31 = var1[var14 + 1] - var1[var16];
         var33 = var56 * var17 - var58 * var19;
         var35 = var56 * var19 + var58 * var17;
         var46 = var42 * var25 - var40 * var27;
         var48 = var42 * var27 + var40 * var25;
         var1[var45] = var33 + var46;
         var1[var45 + 1] = var35 + var48;
         var1[var14] = var33 - var46;
         var1[var14 + 1] = var35 - var48;
         var33 = var60 * var21 + var62 * var23;
         var35 = var60 * var23 - var62 * var21;
         var46 = var53 * var29 + var51 * var31;
         var48 = var53 * var31 - var51 * var29;
         var1[var15] = var33 + var46;
         var1[var15 + 1] = var35 + var48;
         var1[var16] = var33 - var46;
         var1[var16 + 1] = var35 - var48;
      }

      double var120 = var3[var4 + var8];
      double var121 = var3[var4 + var8 + 1];
      int var66 = var7 + var8;
      var12 = var66 + var8;
      var13 = var12 + var8;
      int var122 = var2 + var7;
      var14 = var2 + var66;
      var15 = var2 + var12;
      var16 = var2 + var13;
      var17 = var1[var122] - var1[var15 + 1];
      var19 = var1[var122 + 1] + var1[var15];
      var21 = var1[var122] + var1[var15 + 1];
      var23 = var1[var122 + 1] - var1[var15];
      var25 = var1[var14] - var1[var16 + 1];
      var27 = var1[var14 + 1] + var1[var16];
      var29 = var1[var14] + var1[var16 + 1];
      var31 = var1[var14 + 1] - var1[var16];
      var33 = var120 * var17 - var121 * var19;
      var35 = var120 * var19 + var121 * var17;
      double var126 = var121 * var25 - var120 * var27;
      double var131 = var121 * var27 + var120 * var25;
      var1[var122] = var33 + var126;
      var1[var122 + 1] = var35 + var131;
      var1[var14] = var33 - var126;
      var1[var14 + 1] = var35 - var131;
      var33 = var121 * var21 - var120 * var23;
      var35 = var121 * var23 + var120 * var21;
      var126 = var120 * var29 - var121 * var31;
      var131 = var120 * var31 + var121 * var29;
      var1[var15] = var33 - var126;
      var1[var15 + 1] = var35 - var131;
      var1[var16] = var33 + var126;
      var1[var16 + 1] = var35 + var131;
   }

   public static void method25951(long var0, Class2381 var2, long var3, Class2381 var5, long var6) {
      long var10 = var0 >> 3;
      long var12 = 2L * var10;
      double var14 = var5.method9653(var6 + 1L);
      long var18 = var12 + var12;
      long var20 = var18 + var12;
      long var22 = var3 + var12;
      long var24 = var3 + var18;
      long var26 = var3 + var20;
      double var28 = var2.method9653(var3) - var2.method9653(var24 + 1L);
      double var30 = var2.method9653(var3 + 1L) + var2.method9653(var24);
      double var32 = var2.method9653(var3) + var2.method9653(var24 + 1L);
      double var34 = var2.method9653(var3 + 1L) - var2.method9653(var24);
      double var36 = var2.method9653(var22) - var2.method9653(var26 + 1L);
      double var38 = var2.method9653(var22 + 1L) + var2.method9653(var26);
      double var40 = var2.method9653(var22) + var2.method9653(var26 + 1L);
      double var42 = var2.method9653(var22 + 1L) - var2.method9653(var26);
      double var44 = var14 * (var36 - var38);
      double var46 = var14 * (var38 + var36);
      var2.method9687(var3, var28 + var44);
      var2.method9687(var3 + 1L, var30 + var46);
      var2.method9687(var22, var28 - var44);
      var2.method9687(var22 + 1L, var30 - var46);
      var44 = var14 * (var40 - var42);
      var46 = var14 * (var42 + var40);
      var2.method9687(var24, var32 - var46);
      var2.method9687(var24 + 1L, var34 + var44);
      var2.method9687(var26, var32 + var46);
      var2.method9687(var26 + 1L, var34 - var44);
      long var48 = 0L;
      long var50 = 2L * var12;

      for (int var52 = 2; (long)var52 < var10; var52 += 2) {
         var48 += 4L;
         long var65 = var6 + var48;
         double var53 = var5.method9653(var65);
         double var55 = var5.method9653(var65 + 1L);
         double var67 = var5.method9653(var65 + 2L);
         double var69 = var5.method9653(var65 + 3L);
         var50 -= 4L;
         long var71 = var6 + var50;
         double var73 = var5.method9653(var71);
         double var75 = var5.method9653(var71 + 1L);
         double var77 = var5.method9653(var71 + 2L);
         double var79 = var5.method9653(var71 + 3L);
         long var16 = (long)var52 + var12;
         var18 = var16 + var12;
         var20 = var18 + var12;
         var22 = var3 + var16;
         var24 = var3 + var18;
         var26 = var3 + var20;
         long var81 = var3 + (long)var52;
         var28 = var2.method9653(var81) - var2.method9653(var24 + 1L);
         var30 = var2.method9653(var81 + 1L) + var2.method9653(var24);
         var32 = var2.method9653(var81) + var2.method9653(var24 + 1L);
         var34 = var2.method9653(var81 + 1L) - var2.method9653(var24);
         var36 = var2.method9653(var22) - var2.method9653(var26 + 1L);
         var38 = var2.method9653(var22 + 1L) + var2.method9653(var26);
         var40 = var2.method9653(var22) + var2.method9653(var26 + 1L);
         var42 = var2.method9653(var22 + 1L) - var2.method9653(var26);
         var44 = var53 * var28 - var55 * var30;
         var46 = var53 * var30 + var55 * var28;
         double var61 = var75 * var36 - var73 * var38;
         double var63 = var75 * var38 + var73 * var36;
         var2.method9687(var81, var44 + var61);
         var2.method9687(var81 + 1L, var46 + var63);
         var2.method9687(var22, var44 - var61);
         var2.method9687(var22 + 1L, var46 - var63);
         var44 = var67 * var32 + var69 * var34;
         var46 = var67 * var34 - var69 * var32;
         var61 = var79 * var40 + var77 * var42;
         var63 = var79 * var42 - var77 * var40;
         var2.method9687(var24, var44 + var61);
         var2.method9687(var24 + 1L, var46 + var63);
         var2.method9687(var26, var44 - var61);
         var2.method9687(var26 + 1L, var46 - var63);
         long var57 = var12 - (long)var52;
         var16 = var57 + var12;
         var18 = var16 + var12;
         var20 = var18 + var12;
         long var59 = var3 + var57;
         var22 = var3 + var16;
         var24 = var3 + var18;
         var26 = var3 + var20;
         var28 = var2.method9653(var59) - var2.method9653(var24 + 1L);
         var30 = var2.method9653(var59 + 1L) + var2.method9653(var24);
         var32 = var2.method9653(var59) + var2.method9653(var24 + 1L);
         var34 = var2.method9653(var59 + 1L) - var2.method9653(var24);
         var36 = var2.method9653(var22) - var2.method9653(var26 + 1L);
         var38 = var2.method9653(var22 + 1L) + var2.method9653(var26);
         var40 = var2.method9653(var22) + var2.method9653(var26 + 1L);
         var42 = var2.method9653(var22 + 1L) - var2.method9653(var26);
         var44 = var73 * var28 - var75 * var30;
         var46 = var73 * var30 + var75 * var28;
         var61 = var55 * var36 - var53 * var38;
         var63 = var55 * var38 + var53 * var36;
         var2.method9687(var59, var44 + var61);
         var2.method9687(var59 + 1L, var46 + var63);
         var2.method9687(var22, var44 - var61);
         var2.method9687(var22 + 1L, var46 - var63);
         var44 = var77 * var32 + var79 * var34;
         var46 = var77 * var34 - var79 * var32;
         var61 = var69 * var40 + var67 * var42;
         var63 = var69 * var42 - var67 * var40;
         var2.method9687(var24, var44 + var61);
         var2.method9687(var24 + 1L, var46 + var63);
         var2.method9687(var26, var44 - var61);
         var2.method9687(var26 + 1L, var46 - var63);
      }

      double var138 = var5.method9653(var6 + var12);
      double var139 = var5.method9653(var6 + var12 + 1L);
      long var84 = var10 + var12;
      var18 = var84 + var12;
      var20 = var18 + var12;
      long var140 = var3 + var10;
      var22 = var3 + var84;
      var24 = var3 + var18;
      var26 = var3 + var20;
      var28 = var2.method9653(var140) - var2.method9653(var24 + 1L);
      var30 = var2.method9653(var140 + 1L) + var2.method9653(var24);
      var32 = var2.method9653(var140) + var2.method9653(var24 + 1L);
      var34 = var2.method9653(var140 + 1L) - var2.method9653(var24);
      var36 = var2.method9653(var22) - var2.method9653(var26 + 1L);
      var38 = var2.method9653(var22 + 1L) + var2.method9653(var26);
      var40 = var2.method9653(var22) + var2.method9653(var26 + 1L);
      var42 = var2.method9653(var22 + 1L) - var2.method9653(var26);
      var44 = var138 * var28 - var139 * var30;
      var46 = var138 * var30 + var139 * var28;
      double var144 = var139 * var36 - var138 * var38;
      double var149 = var139 * var38 + var138 * var36;
      var2.method9687(var140, var44 + var144);
      var2.method9687(var140 + 1L, var46 + var149);
      var2.method9687(var22, var44 - var144);
      var2.method9687(var22 + 1L, var46 - var149);
      var44 = var139 * var32 - var138 * var34;
      var46 = var139 * var34 + var138 * var32;
      var144 = var138 * var40 - var139 * var42;
      var149 = var138 * var42 + var139 * var40;
      var2.method9687(var24, var44 - var144);
      var2.method9687(var24 + 1L, var46 - var149);
      var2.method9687(var26, var44 + var144);
      var2.method9687(var26 + 1L, var46 + var149);
   }

   public static void method25952(int var0, double[] var1, int var2, int var3, double[] var4) {
      if (var0 != 128) {
         method25958(var1, var2, var4, var3 - 8);
         method25960(var1, var2 + 16, var4, var3 - 8);
         method25958(var1, var2 + 32, var4, var3 - 8);
         method25958(var1, var2 + 48, var4, var3 - 8);
      } else {
         method25954(var1, var2, var4, var3 - 8);
         method25956(var1, var2 + 32, var4, var3 - 32);
         method25954(var1, var2 + 64, var4, var3 - 8);
         method25954(var1, var2 + 96, var4, var3 - 8);
      }
   }

   public static void method25953(long var0, Class2381 var2, long var3, long var5, Class2381 var7) {
      if (var0 != 128L) {
         method25959(var2, var3, var7, var5 - 8L);
         method25961(var2, var3 + 16L, var7, var5 - 8L);
         method25959(var2, var3 + 32L, var7, var5 - 8L);
         method25959(var2, var3 + 48L, var7, var5 - 8L);
      } else {
         method25955(var2, var3, var7, var5 - 8L);
         method25957(var2, var3 + 32L, var7, var5 - 32L);
         method25955(var2, var3 + 64L, var7, var5 - 8L);
         method25955(var2, var3 + 96L, var7, var5 - 8L);
      }
   }

   public static void method25954(double[] var0, int var1, double[] var2, int var3) {
      double var6 = var2[var3 + 1];
      double var8 = var2[var3 + 2];
      double var10 = var2[var3 + 3];
      double var12 = var0[var1] + var0[var1 + 16];
      double var14 = var0[var1 + 1] + var0[var1 + 17];
      double var16 = var0[var1] - var0[var1 + 16];
      double var18 = var0[var1 + 1] - var0[var1 + 17];
      double var20 = var0[var1 + 8] + var0[var1 + 24];
      double var22 = var0[var1 + 9] + var0[var1 + 25];
      double var24 = var0[var1 + 8] - var0[var1 + 24];
      double var26 = var0[var1 + 9] - var0[var1 + 25];
      double var28 = var12 + var20;
      double var30 = var14 + var22;
      double var32 = var12 - var20;
      double var34 = var14 - var22;
      double var36 = var16 - var26;
      double var38 = var18 + var24;
      double var40 = var16 + var26;
      double var42 = var18 - var24;
      var12 = var0[var1 + 2] + var0[var1 + 18];
      var14 = var0[var1 + 3] + var0[var1 + 19];
      var16 = var0[var1 + 2] - var0[var1 + 18];
      var18 = var0[var1 + 3] - var0[var1 + 19];
      var20 = var0[var1 + 10] + var0[var1 + 26];
      var22 = var0[var1 + 11] + var0[var1 + 27];
      var24 = var0[var1 + 10] - var0[var1 + 26];
      var26 = var0[var1 + 11] - var0[var1 + 27];
      double var44 = var12 + var20;
      double var46 = var14 + var22;
      double var48 = var12 - var20;
      double var50 = var14 - var22;
      var12 = var16 - var26;
      var14 = var18 + var24;
      double var52 = var8 * var12 - var10 * var14;
      double var54 = var8 * var14 + var10 * var12;
      var12 = var16 + var26;
      var14 = var18 - var24;
      double var56 = var10 * var12 - var8 * var14;
      double var58 = var10 * var14 + var8 * var12;
      var12 = var0[var1 + 4] + var0[var1 + 20];
      var14 = var0[var1 + 5] + var0[var1 + 21];
      var16 = var0[var1 + 4] - var0[var1 + 20];
      var18 = var0[var1 + 5] - var0[var1 + 21];
      var20 = var0[var1 + 12] + var0[var1 + 28];
      var22 = var0[var1 + 13] + var0[var1 + 29];
      var24 = var0[var1 + 12] - var0[var1 + 28];
      var26 = var0[var1 + 13] - var0[var1 + 29];
      double var60 = var12 + var20;
      double var62 = var14 + var22;
      double var64 = var12 - var20;
      double var66 = var14 - var22;
      var12 = var16 - var26;
      var14 = var18 + var24;
      double var68 = var6 * (var12 - var14);
      double var70 = var6 * (var14 + var12);
      var12 = var16 + var26;
      var14 = var18 - var24;
      double var72 = var6 * (var12 + var14);
      double var74 = var6 * (var14 - var12);
      var12 = var0[var1 + 6] + var0[var1 + 22];
      var14 = var0[var1 + 7] + var0[var1 + 23];
      var16 = var0[var1 + 6] - var0[var1 + 22];
      var18 = var0[var1 + 7] - var0[var1 + 23];
      var20 = var0[var1 + 14] + var0[var1 + 30];
      var22 = var0[var1 + 15] + var0[var1 + 31];
      var24 = var0[var1 + 14] - var0[var1 + 30];
      var26 = var0[var1 + 15] - var0[var1 + 31];
      double var76 = var12 + var20;
      double var78 = var14 + var22;
      double var80 = var12 - var20;
      double var82 = var14 - var22;
      var12 = var16 - var26;
      var14 = var18 + var24;
      double var84 = var10 * var12 - var8 * var14;
      double var86 = var10 * var14 + var8 * var12;
      var12 = var16 + var26;
      var14 = var18 - var24;
      double var88 = var8 * var12 - var10 * var14;
      double var90 = var8 * var14 + var10 * var12;
      var12 = var40 - var72;
      var14 = var42 - var74;
      var16 = var40 + var72;
      var18 = var42 + var74;
      var20 = var56 - var88;
      var22 = var58 - var90;
      var24 = var56 + var88;
      var26 = var58 + var90;
      var0[var1 + 24] = var12 + var20;
      var0[var1 + 25] = var14 + var22;
      var0[var1 + 26] = var12 - var20;
      var0[var1 + 27] = var14 - var22;
      var0[var1 + 28] = var16 - var26;
      var0[var1 + 29] = var18 + var24;
      var0[var1 + 30] = var16 + var26;
      var0[var1 + 31] = var18 - var24;
      var12 = var36 + var68;
      var14 = var38 + var70;
      var16 = var36 - var68;
      var18 = var38 - var70;
      var20 = var52 + var84;
      var22 = var54 + var86;
      var24 = var52 - var84;
      var26 = var54 - var86;
      var0[var1 + 16] = var12 + var20;
      var0[var1 + 17] = var14 + var22;
      var0[var1 + 18] = var12 - var20;
      var0[var1 + 19] = var14 - var22;
      var0[var1 + 20] = var16 - var26;
      var0[var1 + 21] = var18 + var24;
      var0[var1 + 22] = var16 + var26;
      var0[var1 + 23] = var18 - var24;
      var12 = var48 - var82;
      var14 = var50 + var80;
      var20 = var6 * (var12 - var14);
      var22 = var6 * (var14 + var12);
      var12 = var48 + var82;
      var14 = var50 - var80;
      var24 = var6 * (var12 - var14);
      var26 = var6 * (var14 + var12);
      var12 = var32 - var66;
      var14 = var34 + var64;
      var16 = var32 + var66;
      var18 = var34 - var64;
      var0[var1 + 8] = var12 + var20;
      var0[var1 + 9] = var14 + var22;
      var0[var1 + 10] = var12 - var20;
      var0[var1 + 11] = var14 - var22;
      var0[var1 + 12] = var16 - var26;
      var0[var1 + 13] = var18 + var24;
      var0[var1 + 14] = var16 + var26;
      var0[var1 + 15] = var18 - var24;
      var12 = var28 + var60;
      var14 = var30 + var62;
      var16 = var28 - var60;
      var18 = var30 - var62;
      var20 = var44 + var76;
      var22 = var46 + var78;
      var24 = var44 - var76;
      var26 = var46 - var78;
      var0[var1] = var12 + var20;
      var0[var1 + 1] = var14 + var22;
      var0[var1 + 2] = var12 - var20;
      var0[var1 + 3] = var14 - var22;
      var0[var1 + 4] = var16 - var26;
      var0[var1 + 5] = var18 + var24;
      var0[var1 + 6] = var16 + var26;
      var0[var1 + 7] = var18 - var24;
   }

   public static void method25955(Class2381 var0, long var1, Class2381 var3, long var4) {
      double var8 = var3.method9653(var4 + 1L);
      double var10 = var3.method9653(var4 + 2L);
      double var12 = var3.method9653(var4 + 3L);
      double var14 = var0.method9653(var1) + var0.method9653(var1 + 16L);
      double var16 = var0.method9653(var1 + 1L) + var0.method9653(var1 + 17L);
      double var18 = var0.method9653(var1) - var0.method9653(var1 + 16L);
      double var20 = var0.method9653(var1 + 1L) - var0.method9653(var1 + 17L);
      double var22 = var0.method9653(var1 + 8L) + var0.method9653(var1 + 24L);
      double var24 = var0.method9653(var1 + 9L) + var0.method9653(var1 + 25L);
      double var26 = var0.method9653(var1 + 8L) - var0.method9653(var1 + 24L);
      double var28 = var0.method9653(var1 + 9L) - var0.method9653(var1 + 25L);
      double var30 = var14 + var22;
      double var32 = var16 + var24;
      double var34 = var14 - var22;
      double var36 = var16 - var24;
      double var38 = var18 - var28;
      double var40 = var20 + var26;
      double var42 = var18 + var28;
      double var44 = var20 - var26;
      var14 = var0.method9653(var1 + 2L) + var0.method9653(var1 + 18L);
      var16 = var0.method9653(var1 + 3L) + var0.method9653(var1 + 19L);
      var18 = var0.method9653(var1 + 2L) - var0.method9653(var1 + 18L);
      var20 = var0.method9653(var1 + 3L) - var0.method9653(var1 + 19L);
      var22 = var0.method9653(var1 + 10L) + var0.method9653(var1 + 26L);
      var24 = var0.method9653(var1 + 11L) + var0.method9653(var1 + 27L);
      var26 = var0.method9653(var1 + 10L) - var0.method9653(var1 + 26L);
      var28 = var0.method9653(var1 + 11L) - var0.method9653(var1 + 27L);
      double var46 = var14 + var22;
      double var48 = var16 + var24;
      double var50 = var14 - var22;
      double var52 = var16 - var24;
      var14 = var18 - var28;
      var16 = var20 + var26;
      double var54 = var10 * var14 - var12 * var16;
      double var56 = var10 * var16 + var12 * var14;
      var14 = var18 + var28;
      var16 = var20 - var26;
      double var58 = var12 * var14 - var10 * var16;
      double var60 = var12 * var16 + var10 * var14;
      var14 = var0.method9653(var1 + 4L) + var0.method9653(var1 + 20L);
      var16 = var0.method9653(var1 + 5L) + var0.method9653(var1 + 21L);
      var18 = var0.method9653(var1 + 4L) - var0.method9653(var1 + 20L);
      var20 = var0.method9653(var1 + 5L) - var0.method9653(var1 + 21L);
      var22 = var0.method9653(var1 + 12L) + var0.method9653(var1 + 28L);
      var24 = var0.method9653(var1 + 13L) + var0.method9653(var1 + 29L);
      var26 = var0.method9653(var1 + 12L) - var0.method9653(var1 + 28L);
      var28 = var0.method9653(var1 + 13L) - var0.method9653(var1 + 29L);
      double var62 = var14 + var22;
      double var64 = var16 + var24;
      double var66 = var14 - var22;
      double var68 = var16 - var24;
      var14 = var18 - var28;
      var16 = var20 + var26;
      double var70 = var8 * (var14 - var16);
      double var72 = var8 * (var16 + var14);
      var14 = var18 + var28;
      var16 = var20 - var26;
      double var74 = var8 * (var14 + var16);
      double var76 = var8 * (var16 - var14);
      var14 = var0.method9653(var1 + 6L) + var0.method9653(var1 + 22L);
      var16 = var0.method9653(var1 + 7L) + var0.method9653(var1 + 23L);
      var18 = var0.method9653(var1 + 6L) - var0.method9653(var1 + 22L);
      var20 = var0.method9653(var1 + 7L) - var0.method9653(var1 + 23L);
      var22 = var0.method9653(var1 + 14L) + var0.method9653(var1 + 30L);
      var24 = var0.method9653(var1 + 15L) + var0.method9653(var1 + 31L);
      var26 = var0.method9653(var1 + 14L) - var0.method9653(var1 + 30L);
      var28 = var0.method9653(var1 + 15L) - var0.method9653(var1 + 31L);
      double var78 = var14 + var22;
      double var80 = var16 + var24;
      double var82 = var14 - var22;
      double var84 = var16 - var24;
      var14 = var18 - var28;
      var16 = var20 + var26;
      double var86 = var12 * var14 - var10 * var16;
      double var88 = var12 * var16 + var10 * var14;
      var14 = var18 + var28;
      var16 = var20 - var26;
      double var90 = var10 * var14 - var12 * var16;
      double var92 = var10 * var16 + var12 * var14;
      var14 = var42 - var74;
      var16 = var44 - var76;
      var18 = var42 + var74;
      var20 = var44 + var76;
      var22 = var58 - var90;
      var24 = var60 - var92;
      var26 = var58 + var90;
      var28 = var60 + var92;
      var0.method9687(var1 + 24L, var14 + var22);
      var0.method9687(var1 + 25L, var16 + var24);
      var0.method9687(var1 + 26L, var14 - var22);
      var0.method9687(var1 + 27L, var16 - var24);
      var0.method9687(var1 + 28L, var18 - var28);
      var0.method9687(var1 + 29L, var20 + var26);
      var0.method9687(var1 + 30L, var18 + var28);
      var0.method9687(var1 + 31L, var20 - var26);
      var14 = var38 + var70;
      var16 = var40 + var72;
      var18 = var38 - var70;
      var20 = var40 - var72;
      var22 = var54 + var86;
      var24 = var56 + var88;
      var26 = var54 - var86;
      var28 = var56 - var88;
      var0.method9687(var1 + 16L, var14 + var22);
      var0.method9687(var1 + 17L, var16 + var24);
      var0.method9687(var1 + 18L, var14 - var22);
      var0.method9687(var1 + 19L, var16 - var24);
      var0.method9687(var1 + 20L, var18 - var28);
      var0.method9687(var1 + 21L, var20 + var26);
      var0.method9687(var1 + 22L, var18 + var28);
      var0.method9687(var1 + 23L, var20 - var26);
      var14 = var50 - var84;
      var16 = var52 + var82;
      var22 = var8 * (var14 - var16);
      var24 = var8 * (var16 + var14);
      var14 = var50 + var84;
      var16 = var52 - var82;
      var26 = var8 * (var14 - var16);
      var28 = var8 * (var16 + var14);
      var14 = var34 - var68;
      var16 = var36 + var66;
      var18 = var34 + var68;
      var20 = var36 - var66;
      var0.method9687(var1 + 8L, var14 + var22);
      var0.method9687(var1 + 9L, var16 + var24);
      var0.method9687(var1 + 10L, var14 - var22);
      var0.method9687(var1 + 11L, var16 - var24);
      var0.method9687(var1 + 12L, var18 - var28);
      var0.method9687(var1 + 13L, var20 + var26);
      var0.method9687(var1 + 14L, var18 + var28);
      var0.method9687(var1 + 15L, var20 - var26);
      var14 = var30 + var62;
      var16 = var32 + var64;
      var18 = var30 - var62;
      var20 = var32 - var64;
      var22 = var46 + var78;
      var24 = var48 + var80;
      var26 = var46 - var78;
      var28 = var48 - var80;
      var0.method9687(var1, var14 + var22);
      var0.method9687(var1 + 1L, var16 + var24);
      var0.method9687(var1 + 2L, var14 - var22);
      var0.method9687(var1 + 3L, var16 - var24);
      var0.method9687(var1 + 4L, var18 - var28);
      var0.method9687(var1 + 5L, var20 + var26);
      var0.method9687(var1 + 6L, var18 + var28);
      var0.method9687(var1 + 7L, var20 - var26);
   }

   public static void method25956(double[] var0, int var1, double[] var2, int var3) {
      double var6 = var2[var3 + 1];
      double var8 = var2[var3 + 4];
      double var10 = var2[var3 + 5];
      double var12 = var2[var3 + 6];
      double var14 = -var2[var3 + 7];
      double var16 = var2[var3 + 8];
      double var18 = var2[var3 + 9];
      double var20 = var0[var1] - var0[var1 + 17];
      double var22 = var0[var1 + 1] + var0[var1 + 16];
      double var24 = var0[var1 + 8] - var0[var1 + 25];
      double var26 = var0[var1 + 9] + var0[var1 + 24];
      double var28 = var6 * (var24 - var26);
      double var30 = var6 * (var26 + var24);
      double var32 = var20 + var28;
      double var34 = var22 + var30;
      double var36 = var20 - var28;
      double var38 = var22 - var30;
      var20 = var0[var1] + var0[var1 + 17];
      var22 = var0[var1 + 1] - var0[var1 + 16];
      var24 = var0[var1 + 8] + var0[var1 + 25];
      var26 = var0[var1 + 9] - var0[var1 + 24];
      var28 = var6 * (var24 - var26);
      var30 = var6 * (var26 + var24);
      double var40 = var20 - var30;
      double var42 = var22 + var28;
      double var44 = var20 + var30;
      double var46 = var22 - var28;
      var24 = var0[var1 + 2] - var0[var1 + 19];
      var26 = var0[var1 + 3] + var0[var1 + 18];
      var20 = var8 * var24 - var10 * var26;
      var22 = var8 * var26 + var10 * var24;
      var24 = var0[var1 + 10] - var0[var1 + 27];
      var26 = var0[var1 + 11] + var0[var1 + 26];
      var28 = var14 * var24 - var12 * var26;
      var30 = var14 * var26 + var12 * var24;
      double var48 = var20 + var28;
      double var50 = var22 + var30;
      double var52 = var20 - var28;
      double var54 = var22 - var30;
      var24 = var0[var1 + 2] + var0[var1 + 19];
      var26 = var0[var1 + 3] - var0[var1 + 18];
      var20 = var12 * var24 - var14 * var26;
      var22 = var12 * var26 + var14 * var24;
      var24 = var0[var1 + 10] + var0[var1 + 27];
      var26 = var0[var1 + 11] - var0[var1 + 26];
      var28 = var8 * var24 + var10 * var26;
      var30 = var8 * var26 - var10 * var24;
      double var56 = var20 - var28;
      double var58 = var22 - var30;
      double var60 = var20 + var28;
      double var62 = var22 + var30;
      var24 = var0[var1 + 4] - var0[var1 + 21];
      var26 = var0[var1 + 5] + var0[var1 + 20];
      var20 = var16 * var24 - var18 * var26;
      var22 = var16 * var26 + var18 * var24;
      var24 = var0[var1 + 12] - var0[var1 + 29];
      var26 = var0[var1 + 13] + var0[var1 + 28];
      var28 = var18 * var24 - var16 * var26;
      var30 = var18 * var26 + var16 * var24;
      double var64 = var20 + var28;
      double var66 = var22 + var30;
      double var68 = var20 - var28;
      double var70 = var22 - var30;
      var24 = var0[var1 + 4] + var0[var1 + 21];
      var26 = var0[var1 + 5] - var0[var1 + 20];
      var20 = var18 * var24 - var16 * var26;
      var22 = var18 * var26 + var16 * var24;
      var24 = var0[var1 + 12] + var0[var1 + 29];
      var26 = var0[var1 + 13] - var0[var1 + 28];
      var28 = var16 * var24 - var18 * var26;
      var30 = var16 * var26 + var18 * var24;
      double var72 = var20 - var28;
      double var74 = var22 - var30;
      double var76 = var20 + var28;
      double var78 = var22 + var30;
      var24 = var0[var1 + 6] - var0[var1 + 23];
      var26 = var0[var1 + 7] + var0[var1 + 22];
      var20 = var12 * var24 - var14 * var26;
      var22 = var12 * var26 + var14 * var24;
      var24 = var0[var1 + 14] - var0[var1 + 31];
      var26 = var0[var1 + 15] + var0[var1 + 30];
      var28 = var10 * var24 - var8 * var26;
      var30 = var10 * var26 + var8 * var24;
      double var80 = var20 + var28;
      double var82 = var22 + var30;
      double var84 = var20 - var28;
      double var86 = var22 - var30;
      var24 = var0[var1 + 6] + var0[var1 + 23];
      var26 = var0[var1 + 7] - var0[var1 + 22];
      var20 = var10 * var24 + var8 * var26;
      var22 = var10 * var26 - var8 * var24;
      var24 = var0[var1 + 14] + var0[var1 + 31];
      var26 = var0[var1 + 15] - var0[var1 + 30];
      var28 = var14 * var24 - var12 * var26;
      var30 = var14 * var26 + var12 * var24;
      double var88 = var20 + var28;
      double var90 = var22 + var30;
      double var92 = var20 - var28;
      double var94 = var22 - var30;
      var20 = var32 + var64;
      var22 = var34 + var66;
      var28 = var48 + var80;
      var30 = var50 + var82;
      var0[var1] = var20 + var28;
      var0[var1 + 1] = var22 + var30;
      var0[var1 + 2] = var20 - var28;
      var0[var1 + 3] = var22 - var30;
      var20 = var32 - var64;
      var22 = var34 - var66;
      var28 = var48 - var80;
      var30 = var50 - var82;
      var0[var1 + 4] = var20 - var30;
      var0[var1 + 5] = var22 + var28;
      var0[var1 + 6] = var20 + var30;
      var0[var1 + 7] = var22 - var28;
      var20 = var36 - var70;
      var22 = var38 + var68;
      var24 = var52 - var86;
      var26 = var54 + var84;
      var28 = var6 * (var24 - var26);
      var30 = var6 * (var26 + var24);
      var0[var1 + 8] = var20 + var28;
      var0[var1 + 9] = var22 + var30;
      var0[var1 + 10] = var20 - var28;
      var0[var1 + 11] = var22 - var30;
      var20 = var36 + var70;
      var22 = var38 - var68;
      var24 = var52 + var86;
      var26 = var54 - var84;
      var28 = var6 * (var24 - var26);
      var30 = var6 * (var26 + var24);
      var0[var1 + 12] = var20 - var30;
      var0[var1 + 13] = var22 + var28;
      var0[var1 + 14] = var20 + var30;
      var0[var1 + 15] = var22 - var28;
      var20 = var40 + var72;
      var22 = var42 + var74;
      var28 = var56 - var88;
      var30 = var58 - var90;
      var0[var1 + 16] = var20 + var28;
      var0[var1 + 17] = var22 + var30;
      var0[var1 + 18] = var20 - var28;
      var0[var1 + 19] = var22 - var30;
      var20 = var40 - var72;
      var22 = var42 - var74;
      var28 = var56 + var88;
      var30 = var58 + var90;
      var0[var1 + 20] = var20 - var30;
      var0[var1 + 21] = var22 + var28;
      var0[var1 + 22] = var20 + var30;
      var0[var1 + 23] = var22 - var28;
      var20 = var44 - var78;
      var22 = var46 + var76;
      var24 = var60 + var94;
      var26 = var62 - var92;
      var28 = var6 * (var24 - var26);
      var30 = var6 * (var26 + var24);
      var0[var1 + 24] = var20 + var28;
      var0[var1 + 25] = var22 + var30;
      var0[var1 + 26] = var20 - var28;
      var0[var1 + 27] = var22 - var30;
      var20 = var44 + var78;
      var22 = var46 - var76;
      var24 = var60 - var94;
      var26 = var62 + var92;
      var28 = var6 * (var24 - var26);
      var30 = var6 * (var26 + var24);
      var0[var1 + 28] = var20 - var30;
      var0[var1 + 29] = var22 + var28;
      var0[var1 + 30] = var20 + var30;
      var0[var1 + 31] = var22 - var28;
   }

   public static void method25957(Class2381 var0, long var1, Class2381 var3, long var4) {
      double var8 = var3.method9653(var4 + 1L);
      double var10 = var3.method9653(var4 + 4L);
      double var12 = var3.method9653(var4 + 5L);
      double var14 = var3.method9653(var4 + 6L);
      double var16 = -var3.method9653(var4 + 7L);
      double var18 = var3.method9653(var4 + 8L);
      double var20 = var3.method9653(var4 + 9L);
      double var22 = var0.method9653(var1) - var0.method9653(var1 + 17L);
      double var24 = var0.method9653(var1 + 1L) + var0.method9653(var1 + 16L);
      double var26 = var0.method9653(var1 + 8L) - var0.method9653(var1 + 25L);
      double var28 = var0.method9653(var1 + 9L) + var0.method9653(var1 + 24L);
      double var30 = var8 * (var26 - var28);
      double var32 = var8 * (var28 + var26);
      double var34 = var22 + var30;
      double var36 = var24 + var32;
      double var38 = var22 - var30;
      double var40 = var24 - var32;
      var22 = var0.method9653(var1) + var0.method9653(var1 + 17L);
      var24 = var0.method9653(var1 + 1L) - var0.method9653(var1 + 16L);
      var26 = var0.method9653(var1 + 8L) + var0.method9653(var1 + 25L);
      var28 = var0.method9653(var1 + 9L) - var0.method9653(var1 + 24L);
      var30 = var8 * (var26 - var28);
      var32 = var8 * (var28 + var26);
      double var42 = var22 - var32;
      double var44 = var24 + var30;
      double var46 = var22 + var32;
      double var48 = var24 - var30;
      var26 = var0.method9653(var1 + 2L) - var0.method9653(var1 + 19L);
      var28 = var0.method9653(var1 + 3L) + var0.method9653(var1 + 18L);
      var22 = var10 * var26 - var12 * var28;
      var24 = var10 * var28 + var12 * var26;
      var26 = var0.method9653(var1 + 10L) - var0.method9653(var1 + 27L);
      var28 = var0.method9653(var1 + 11L) + var0.method9653(var1 + 26L);
      var30 = var16 * var26 - var14 * var28;
      var32 = var16 * var28 + var14 * var26;
      double var50 = var22 + var30;
      double var52 = var24 + var32;
      double var54 = var22 - var30;
      double var56 = var24 - var32;
      var26 = var0.method9653(var1 + 2L) + var0.method9653(var1 + 19L);
      var28 = var0.method9653(var1 + 3L) - var0.method9653(var1 + 18L);
      var22 = var14 * var26 - var16 * var28;
      var24 = var14 * var28 + var16 * var26;
      var26 = var0.method9653(var1 + 10L) + var0.method9653(var1 + 27L);
      var28 = var0.method9653(var1 + 11L) - var0.method9653(var1 + 26L);
      var30 = var10 * var26 + var12 * var28;
      var32 = var10 * var28 - var12 * var26;
      double var58 = var22 - var30;
      double var60 = var24 - var32;
      double var62 = var22 + var30;
      double var64 = var24 + var32;
      var26 = var0.method9653(var1 + 4L) - var0.method9653(var1 + 21L);
      var28 = var0.method9653(var1 + 5L) + var0.method9653(var1 + 20L);
      var22 = var18 * var26 - var20 * var28;
      var24 = var18 * var28 + var20 * var26;
      var26 = var0.method9653(var1 + 12L) - var0.method9653(var1 + 29L);
      var28 = var0.method9653(var1 + 13L) + var0.method9653(var1 + 28L);
      var30 = var20 * var26 - var18 * var28;
      var32 = var20 * var28 + var18 * var26;
      double var66 = var22 + var30;
      double var68 = var24 + var32;
      double var70 = var22 - var30;
      double var72 = var24 - var32;
      var26 = var0.method9653(var1 + 4L) + var0.method9653(var1 + 21L);
      var28 = var0.method9653(var1 + 5L) - var0.method9653(var1 + 20L);
      var22 = var20 * var26 - var18 * var28;
      var24 = var20 * var28 + var18 * var26;
      var26 = var0.method9653(var1 + 12L) + var0.method9653(var1 + 29L);
      var28 = var0.method9653(var1 + 13L) - var0.method9653(var1 + 28L);
      var30 = var18 * var26 - var20 * var28;
      var32 = var18 * var28 + var20 * var26;
      double var74 = var22 - var30;
      double var76 = var24 - var32;
      double var78 = var22 + var30;
      double var80 = var24 + var32;
      var26 = var0.method9653(var1 + 6L) - var0.method9653(var1 + 23L);
      var28 = var0.method9653(var1 + 7L) + var0.method9653(var1 + 22L);
      var22 = var14 * var26 - var16 * var28;
      var24 = var14 * var28 + var16 * var26;
      var26 = var0.method9653(var1 + 14L) - var0.method9653(var1 + 31L);
      var28 = var0.method9653(var1 + 15L) + var0.method9653(var1 + 30L);
      var30 = var12 * var26 - var10 * var28;
      var32 = var12 * var28 + var10 * var26;
      double var82 = var22 + var30;
      double var84 = var24 + var32;
      double var86 = var22 - var30;
      double var88 = var24 - var32;
      var26 = var0.method9653(var1 + 6L) + var0.method9653(var1 + 23L);
      var28 = var0.method9653(var1 + 7L) - var0.method9653(var1 + 22L);
      var22 = var12 * var26 + var10 * var28;
      var24 = var12 * var28 - var10 * var26;
      var26 = var0.method9653(var1 + 14L) + var0.method9653(var1 + 31L);
      var28 = var0.method9653(var1 + 15L) - var0.method9653(var1 + 30L);
      var30 = var16 * var26 - var14 * var28;
      var32 = var16 * var28 + var14 * var26;
      double var90 = var22 + var30;
      double var92 = var24 + var32;
      double var94 = var22 - var30;
      double var96 = var24 - var32;
      var22 = var34 + var66;
      var24 = var36 + var68;
      var30 = var50 + var82;
      var32 = var52 + var84;
      var0.method9687(var1, var22 + var30);
      var0.method9687(var1 + 1L, var24 + var32);
      var0.method9687(var1 + 2L, var22 - var30);
      var0.method9687(var1 + 3L, var24 - var32);
      var22 = var34 - var66;
      var24 = var36 - var68;
      var30 = var50 - var82;
      var32 = var52 - var84;
      var0.method9687(var1 + 4L, var22 - var32);
      var0.method9687(var1 + 5L, var24 + var30);
      var0.method9687(var1 + 6L, var22 + var32);
      var0.method9687(var1 + 7L, var24 - var30);
      var22 = var38 - var72;
      var24 = var40 + var70;
      var26 = var54 - var88;
      var28 = var56 + var86;
      var30 = var8 * (var26 - var28);
      var32 = var8 * (var28 + var26);
      var0.method9687(var1 + 8L, var22 + var30);
      var0.method9687(var1 + 9L, var24 + var32);
      var0.method9687(var1 + 10L, var22 - var30);
      var0.method9687(var1 + 11L, var24 - var32);
      var22 = var38 + var72;
      var24 = var40 - var70;
      var26 = var54 + var88;
      var28 = var56 - var86;
      var30 = var8 * (var26 - var28);
      var32 = var8 * (var28 + var26);
      var0.method9687(var1 + 12L, var22 - var32);
      var0.method9687(var1 + 13L, var24 + var30);
      var0.method9687(var1 + 14L, var22 + var32);
      var0.method9687(var1 + 15L, var24 - var30);
      var22 = var42 + var74;
      var24 = var44 + var76;
      var30 = var58 - var90;
      var32 = var60 - var92;
      var0.method9687(var1 + 16L, var22 + var30);
      var0.method9687(var1 + 17L, var24 + var32);
      var0.method9687(var1 + 18L, var22 - var30);
      var0.method9687(var1 + 19L, var24 - var32);
      var22 = var42 - var74;
      var24 = var44 - var76;
      var30 = var58 + var90;
      var32 = var60 + var92;
      var0.method9687(var1 + 20L, var22 - var32);
      var0.method9687(var1 + 21L, var24 + var30);
      var0.method9687(var1 + 22L, var22 + var32);
      var0.method9687(var1 + 23L, var24 - var30);
      var22 = var46 - var80;
      var24 = var48 + var78;
      var26 = var62 + var96;
      var28 = var64 - var94;
      var30 = var8 * (var26 - var28);
      var32 = var8 * (var28 + var26);
      var0.method9687(var1 + 24L, var22 + var30);
      var0.method9687(var1 + 25L, var24 + var32);
      var0.method9687(var1 + 26L, var22 - var30);
      var0.method9687(var1 + 27L, var24 - var32);
      var22 = var46 + var80;
      var24 = var48 - var78;
      var26 = var62 - var96;
      var28 = var64 + var94;
      var30 = var8 * (var26 - var28);
      var32 = var8 * (var28 + var26);
      var0.method9687(var1 + 28L, var22 - var32);
      var0.method9687(var1 + 29L, var24 + var30);
      var0.method9687(var1 + 30L, var22 + var32);
      var0.method9687(var1 + 31L, var24 - var30);
   }

   public static void method25958(double[] var0, int var1, double[] var2, int var3) {
      double var6 = var2[var3 + 1];
      double var8 = var0[var1] + var0[var1 + 8];
      double var10 = var0[var1 + 1] + var0[var1 + 9];
      double var12 = var0[var1] - var0[var1 + 8];
      double var14 = var0[var1 + 1] - var0[var1 + 9];
      double var16 = var0[var1 + 4] + var0[var1 + 12];
      double var18 = var0[var1 + 5] + var0[var1 + 13];
      double var20 = var0[var1 + 4] - var0[var1 + 12];
      double var22 = var0[var1 + 5] - var0[var1 + 13];
      double var24 = var8 + var16;
      double var26 = var10 + var18;
      double var28 = var8 - var16;
      double var30 = var10 - var18;
      double var32 = var12 - var22;
      double var34 = var14 + var20;
      double var36 = var12 + var22;
      double var38 = var14 - var20;
      var8 = var0[var1 + 2] + var0[var1 + 10];
      var10 = var0[var1 + 3] + var0[var1 + 11];
      var12 = var0[var1 + 2] - var0[var1 + 10];
      var14 = var0[var1 + 3] - var0[var1 + 11];
      var16 = var0[var1 + 6] + var0[var1 + 14];
      var18 = var0[var1 + 7] + var0[var1 + 15];
      var20 = var0[var1 + 6] - var0[var1 + 14];
      var22 = var0[var1 + 7] - var0[var1 + 15];
      double var40 = var8 + var16;
      double var42 = var10 + var18;
      double var44 = var8 - var16;
      double var46 = var10 - var18;
      var8 = var12 - var22;
      var10 = var14 + var20;
      var16 = var12 + var22;
      var18 = var14 - var20;
      double var48 = var6 * (var8 - var10);
      double var50 = var6 * (var8 + var10);
      double var52 = var6 * (var16 - var18);
      double var54 = var6 * (var16 + var18);
      var0[var1 + 8] = var32 + var48;
      var0[var1 + 9] = var34 + var50;
      var0[var1 + 10] = var32 - var48;
      var0[var1 + 11] = var34 - var50;
      var0[var1 + 12] = var36 - var54;
      var0[var1 + 13] = var38 + var52;
      var0[var1 + 14] = var36 + var54;
      var0[var1 + 15] = var38 - var52;
      var0[var1] = var24 + var40;
      var0[var1 + 1] = var26 + var42;
      var0[var1 + 2] = var24 - var40;
      var0[var1 + 3] = var26 - var42;
      var0[var1 + 4] = var28 - var46;
      var0[var1 + 5] = var30 + var44;
      var0[var1 + 6] = var28 + var46;
      var0[var1 + 7] = var30 - var44;
   }

   public static void method25959(Class2381 var0, long var1, Class2381 var3, long var4) {
      double var8 = var3.method9653(var4 + 1L);
      double var10 = var0.method9653(var1) + var0.method9653(var1 + 8L);
      double var12 = var0.method9653(var1 + 1L) + var0.method9653(var1 + 9L);
      double var14 = var0.method9653(var1) - var0.method9653(var1 + 8L);
      double var16 = var0.method9653(var1 + 1L) - var0.method9653(var1 + 9L);
      double var18 = var0.method9653(var1 + 4L) + var0.method9653(var1 + 12L);
      double var20 = var0.method9653(var1 + 5L) + var0.method9653(var1 + 13L);
      double var22 = var0.method9653(var1 + 4L) - var0.method9653(var1 + 12L);
      double var24 = var0.method9653(var1 + 5L) - var0.method9653(var1 + 13L);
      double var26 = var10 + var18;
      double var28 = var12 + var20;
      double var30 = var10 - var18;
      double var32 = var12 - var20;
      double var34 = var14 - var24;
      double var36 = var16 + var22;
      double var38 = var14 + var24;
      double var40 = var16 - var22;
      var10 = var0.method9653(var1 + 2L) + var0.method9653(var1 + 10L);
      var12 = var0.method9653(var1 + 3L) + var0.method9653(var1 + 11L);
      var14 = var0.method9653(var1 + 2L) - var0.method9653(var1 + 10L);
      var16 = var0.method9653(var1 + 3L) - var0.method9653(var1 + 11L);
      var18 = var0.method9653(var1 + 6L) + var0.method9653(var1 + 14L);
      var20 = var0.method9653(var1 + 7L) + var0.method9653(var1 + 15L);
      var22 = var0.method9653(var1 + 6L) - var0.method9653(var1 + 14L);
      var24 = var0.method9653(var1 + 7L) - var0.method9653(var1 + 15L);
      double var42 = var10 + var18;
      double var44 = var12 + var20;
      double var46 = var10 - var18;
      double var48 = var12 - var20;
      var10 = var14 - var24;
      var12 = var16 + var22;
      var18 = var14 + var24;
      var20 = var16 - var22;
      double var50 = var8 * (var10 - var12);
      double var52 = var8 * (var10 + var12);
      double var54 = var8 * (var18 - var20);
      double var56 = var8 * (var18 + var20);
      var0.method9687(var1 + 8L, var34 + var50);
      var0.method9687(var1 + 9L, var36 + var52);
      var0.method9687(var1 + 10L, var34 - var50);
      var0.method9687(var1 + 11L, var36 - var52);
      var0.method9687(var1 + 12L, var38 - var56);
      var0.method9687(var1 + 13L, var40 + var54);
      var0.method9687(var1 + 14L, var38 + var56);
      var0.method9687(var1 + 15L, var40 - var54);
      var0.method9687(var1, var26 + var42);
      var0.method9687(var1 + 1L, var28 + var44);
      var0.method9687(var1 + 2L, var26 - var42);
      var0.method9687(var1 + 3L, var28 - var44);
      var0.method9687(var1 + 4L, var30 - var48);
      var0.method9687(var1 + 5L, var32 + var46);
      var0.method9687(var1 + 6L, var30 + var48);
      var0.method9687(var1 + 7L, var32 - var46);
   }

   public static void method25960(double[] var0, int var1, double[] var2, int var3) {
      double var6 = var2[var3 + 1];
      double var8 = var2[var3 + 2];
      double var10 = var2[var3 + 3];
      double var12 = var0[var1] - var0[var1 + 9];
      double var14 = var0[var1 + 1] + var0[var1 + 8];
      double var16 = var0[var1] + var0[var1 + 9];
      double var18 = var0[var1 + 1] - var0[var1 + 8];
      double var20 = var0[var1 + 4] - var0[var1 + 13];
      double var22 = var0[var1 + 5] + var0[var1 + 12];
      double var24 = var6 * (var20 - var22);
      double var26 = var6 * (var22 + var20);
      var20 = var0[var1 + 4] + var0[var1 + 13];
      var22 = var0[var1 + 5] - var0[var1 + 12];
      double var28 = var6 * (var20 - var22);
      double var30 = var6 * (var22 + var20);
      var20 = var0[var1 + 2] - var0[var1 + 11];
      var22 = var0[var1 + 3] + var0[var1 + 10];
      double var32 = var8 * var20 - var10 * var22;
      double var34 = var8 * var22 + var10 * var20;
      var20 = var0[var1 + 2] + var0[var1 + 11];
      var22 = var0[var1 + 3] - var0[var1 + 10];
      double var36 = var10 * var20 - var8 * var22;
      double var38 = var10 * var22 + var8 * var20;
      var20 = var0[var1 + 6] - var0[var1 + 15];
      var22 = var0[var1 + 7] + var0[var1 + 14];
      double var40 = var10 * var20 - var8 * var22;
      double var42 = var10 * var22 + var8 * var20;
      var20 = var0[var1 + 6] + var0[var1 + 15];
      var22 = var0[var1 + 7] - var0[var1 + 14];
      double var44 = var8 * var20 - var10 * var22;
      double var46 = var8 * var22 + var10 * var20;
      var20 = var12 + var24;
      var22 = var14 + var26;
      double var48 = var32 + var40;
      double var50 = var34 + var42;
      var0[var1] = var20 + var48;
      var0[var1 + 1] = var22 + var50;
      var0[var1 + 2] = var20 - var48;
      var0[var1 + 3] = var22 - var50;
      var20 = var12 - var24;
      var22 = var14 - var26;
      var48 = var32 - var40;
      var50 = var34 - var42;
      var0[var1 + 4] = var20 - var50;
      var0[var1 + 5] = var22 + var48;
      var0[var1 + 6] = var20 + var50;
      var0[var1 + 7] = var22 - var48;
      var20 = var16 - var30;
      var22 = var18 + var28;
      var48 = var36 - var44;
      var50 = var38 - var46;
      var0[var1 + 8] = var20 + var48;
      var0[var1 + 9] = var22 + var50;
      var0[var1 + 10] = var20 - var48;
      var0[var1 + 11] = var22 - var50;
      var20 = var16 + var30;
      var22 = var18 - var28;
      var48 = var36 + var44;
      var50 = var38 + var46;
      var0[var1 + 12] = var20 - var50;
      var0[var1 + 13] = var22 + var48;
      var0[var1 + 14] = var20 + var50;
      var0[var1 + 15] = var22 - var48;
   }

   public static void method25961(Class2381 var0, long var1, Class2381 var3, long var4) {
      double var8 = var3.method9653(var4 + 1L);
      double var10 = var3.method9653(var4 + 2L);
      double var12 = var3.method9653(var4 + 3L);
      double var14 = var0.method9653(var1) - var0.method9653(var1 + 9L);
      double var16 = var0.method9653(var1 + 1L) + var0.method9653(var1 + 8L);
      double var18 = var0.method9653(var1) + var0.method9653(var1 + 9L);
      double var20 = var0.method9653(var1 + 1L) - var0.method9653(var1 + 8L);
      double var22 = var0.method9653(var1 + 4L) - var0.method9653(var1 + 13L);
      double var24 = var0.method9653(var1 + 5L) + var0.method9653(var1 + 12L);
      double var26 = var8 * (var22 - var24);
      double var28 = var8 * (var24 + var22);
      var22 = var0.method9653(var1 + 4L) + var0.method9653(var1 + 13L);
      var24 = var0.method9653(var1 + 5L) - var0.method9653(var1 + 12L);
      double var30 = var8 * (var22 - var24);
      double var32 = var8 * (var24 + var22);
      var22 = var0.method9653(var1 + 2L) - var0.method9653(var1 + 11L);
      var24 = var0.method9653(var1 + 3L) + var0.method9653(var1 + 10L);
      double var34 = var10 * var22 - var12 * var24;
      double var36 = var10 * var24 + var12 * var22;
      var22 = var0.method9653(var1 + 2L) + var0.method9653(var1 + 11L);
      var24 = var0.method9653(var1 + 3L) - var0.method9653(var1 + 10L);
      double var38 = var12 * var22 - var10 * var24;
      double var40 = var12 * var24 + var10 * var22;
      var22 = var0.method9653(var1 + 6L) - var0.method9653(var1 + 15L);
      var24 = var0.method9653(var1 + 7L) + var0.method9653(var1 + 14L);
      double var42 = var12 * var22 - var10 * var24;
      double var44 = var12 * var24 + var10 * var22;
      var22 = var0.method9653(var1 + 6L) + var0.method9653(var1 + 15L);
      var24 = var0.method9653(var1 + 7L) - var0.method9653(var1 + 14L);
      double var46 = var10 * var22 - var12 * var24;
      double var48 = var10 * var24 + var12 * var22;
      var22 = var14 + var26;
      var24 = var16 + var28;
      double var50 = var34 + var42;
      double var52 = var36 + var44;
      var0.method9687(var1, var22 + var50);
      var0.method9687(var1 + 1L, var24 + var52);
      var0.method9687(var1 + 2L, var22 - var50);
      var0.method9687(var1 + 3L, var24 - var52);
      var22 = var14 - var26;
      var24 = var16 - var28;
      var50 = var34 - var42;
      var52 = var36 - var44;
      var0.method9687(var1 + 4L, var22 - var52);
      var0.method9687(var1 + 5L, var24 + var50);
      var0.method9687(var1 + 6L, var22 + var52);
      var0.method9687(var1 + 7L, var24 - var50);
      var22 = var18 - var32;
      var24 = var20 + var30;
      var50 = var38 - var46;
      var52 = var40 - var48;
      var0.method9687(var1 + 8L, var22 + var50);
      var0.method9687(var1 + 9L, var24 + var52);
      var0.method9687(var1 + 10L, var22 - var50);
      var0.method9687(var1 + 11L, var24 - var52);
      var22 = var18 + var32;
      var24 = var20 - var30;
      var50 = var38 + var46;
      var52 = var40 + var48;
      var0.method9687(var1 + 12L, var22 - var52);
      var0.method9687(var1 + 13L, var24 + var50);
      var0.method9687(var1 + 14L, var22 + var52);
      var0.method9687(var1 + 15L, var24 - var50);
   }

   public static void method25962(double[] var0, int var1) {
      double var4 = var0[var1] + var0[var1 + 4];
      double var6 = var0[var1 + 1] + var0[var1 + 5];
      double var8 = var0[var1] - var0[var1 + 4];
      double var10 = var0[var1 + 1] - var0[var1 + 5];
      double var12 = var0[var1 + 2] + var0[var1 + 6];
      double var14 = var0[var1 + 3] + var0[var1 + 7];
      double var16 = var0[var1 + 2] - var0[var1 + 6];
      double var18 = var0[var1 + 3] - var0[var1 + 7];
      var0[var1] = var4 + var12;
      var0[var1 + 1] = var6 + var14;
      var0[var1 + 2] = var8 - var18;
      var0[var1 + 3] = var10 + var16;
      var0[var1 + 4] = var4 - var12;
      var0[var1 + 5] = var6 - var14;
      var0[var1 + 6] = var8 + var18;
      var0[var1 + 7] = var10 - var16;
   }

   public static void method25963(Class2381 var0, long var1) {
      double var5 = var0.method9653(var1) + var0.method9653(var1 + 4L);
      double var7 = var0.method9653(var1 + 1L) + var0.method9653(var1 + 5L);
      double var9 = var0.method9653(var1) - var0.method9653(var1 + 4L);
      double var11 = var0.method9653(var1 + 1L) - var0.method9653(var1 + 5L);
      double var13 = var0.method9653(var1 + 2L) + var0.method9653(var1 + 6L);
      double var15 = var0.method9653(var1 + 3L) + var0.method9653(var1 + 7L);
      double var17 = var0.method9653(var1 + 2L) - var0.method9653(var1 + 6L);
      double var19 = var0.method9653(var1 + 3L) - var0.method9653(var1 + 7L);
      var0.method9687(var1, var5 + var13);
      var0.method9687(var1 + 1L, var7 + var15);
      var0.method9687(var1 + 2L, var9 - var19);
      var0.method9687(var1 + 3L, var11 + var17);
      var0.method9687(var1 + 4L, var5 - var13);
      var0.method9687(var1 + 5L, var7 - var15);
      var0.method9687(var1 + 6L, var9 + var19);
      var0.method9687(var1 + 7L, var11 - var17);
   }

   public static void method25964(double[] var0, int var1) {
      double var4 = var0[var1] + var0[var1 + 4];
      double var6 = var0[var1 + 1] + var0[var1 + 5];
      double var8 = var0[var1] - var0[var1 + 4];
      double var10 = var0[var1 + 1] - var0[var1 + 5];
      double var12 = var0[var1 + 2] + var0[var1 + 6];
      double var14 = var0[var1 + 3] + var0[var1 + 7];
      double var16 = var0[var1 + 2] - var0[var1 + 6];
      double var18 = var0[var1 + 3] - var0[var1 + 7];
      var0[var1] = var4 + var12;
      var0[var1 + 1] = var6 + var14;
      var0[var1 + 2] = var8 + var18;
      var0[var1 + 3] = var10 - var16;
      var0[var1 + 4] = var4 - var12;
      var0[var1 + 5] = var6 - var14;
      var0[var1 + 6] = var8 - var18;
      var0[var1 + 7] = var10 + var16;
   }

   public static void method25965(Class2381 var0, long var1) {
      double var5 = var0.method9653(var1) + var0.method9653(var1 + 4L);
      double var7 = var0.method9653(var1 + 1L) + var0.method9653(var1 + 5L);
      double var9 = var0.method9653(var1) - var0.method9653(var1 + 4L);
      double var11 = var0.method9653(var1 + 1L) - var0.method9653(var1 + 5L);
      double var13 = var0.method9653(var1 + 2L) + var0.method9653(var1 + 6L);
      double var15 = var0.method9653(var1 + 3L) + var0.method9653(var1 + 7L);
      double var17 = var0.method9653(var1 + 2L) - var0.method9653(var1 + 6L);
      double var19 = var0.method9653(var1 + 3L) - var0.method9653(var1 + 7L);
      var0.method9687(var1, var5 + var13);
      var0.method9687(var1 + 1L, var7 + var15);
      var0.method9687(var1 + 2L, var9 + var19);
      var0.method9687(var1 + 3L, var11 - var17);
      var0.method9687(var1 + 4L, var5 - var13);
      var0.method9687(var1 + 5L, var7 - var15);
      var0.method9687(var1 + 6L, var9 - var19);
      var0.method9687(var1 + 7L, var11 + var17);
   }

   public static void method25966(double[] var0, int var1) {
      double var4 = var0[var1] - var0[var1 + 2];
      double var6 = -var0[var1 + 1] + var0[var1 + 3];
      var0[var1] += var0[var1 + 2];
      var0[var1 + 1] = var0[var1 + 1] + var0[var1 + 3];
      var0[var1 + 2] = var4;
      var0[var1 + 3] = var6;
   }

   public static void method25967(Class2381 var0, long var1) {
      double var5 = var0.method9653(var1) - var0.method9653(var1 + 2L);
      double var7 = -var0.method9653(var1 + 1L) + var0.method9653(var1 + 3L);
      var0.method9687(var1, var0.method9653(var1) + var0.method9653(var1 + 2L));
      var0.method9687(var1 + 1L, var0.method9653(var1 + 1L) + var0.method9653(var1 + 3L));
      var0.method9687(var1 + 2L, var5);
      var0.method9687(var1 + 3L, var7);
   }

   public static void method25968(double[] var0, int var1) {
      double var4 = var0[var1] - var0[var1 + 2];
      double var6 = var0[var1 + 1] - var0[var1 + 3];
      var0[var1] += var0[var1 + 2];
      var0[var1 + 1] = var0[var1 + 1] + var0[var1 + 3];
      var0[var1 + 2] = var4;
      var0[var1 + 3] = var6;
   }

   public static void method25969(Class2381 var0, long var1) {
      double var5 = var0.method9653(var1) - var0.method9653(var1 + 2L);
      double var7 = var0.method9653(var1 + 1L) - var0.method9653(var1 + 3L);
      var0.method9687(var1, var0.method9653(var1) + var0.method9653(var1 + 2L));
      var0.method9687(var1 + 1L, var0.method9653(var1 + 1L) + var0.method9653(var1 + 3L));
      var0.method9687(var1 + 2L, var5);
      var0.method9687(var1 + 3L, var7);
   }

   public static void method25970(double[] var0, int var1) {
      double var4 = var0[var1] - var0[var1 + 2];
      double var6 = var0[var1 + 1] + var0[var1 + 3];
      var0[var1] += var0[var1 + 2];
      var0[var1 + 1] = var0[var1 + 1] - var0[var1 + 3];
      var0[var1 + 2] = var4;
      var0[var1 + 3] = var6;
   }

   public static void method25971(Class2381 var0, long var1) {
      double var5 = var0.method9653(var1) - var0.method9653(var1 + 2L);
      double var7 = var0.method9653(var1 + 1L) + var0.method9653(var1 + 3L);
      var0.method9687(var1, var0.method9653(var1) + var0.method9653(var1 + 2L));
      var0.method9687(var1 + 1L, var0.method9653(var1 + 1L) - var0.method9653(var1 + 3L));
      var0.method9687(var1 + 2L, var5);
      var0.method9687(var1 + 3L, var7);
   }

   public static void method25972(int var0, double[] var1, int var2, int var3, double[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (int var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         double var13 = 0.5 - var4[var5 + var3 - var10];
         double var15 = var4[var5 + var10];
         int var17 = var2 + var11;
         int var18 = var2 + var12;
         double var19 = var1[var17] - var1[var18];
         double var21 = var1[var17 + 1] + var1[var18 + 1];
         double var23 = var13 * var19 - var15 * var21;
         double var25 = var13 * var21 + var15 * var19;
         var1[var17] -= var23;
         var1[var17 + 1] = var25 - var1[var17 + 1];
         var1[var18] += var23;
         var1[var18 + 1] = var25 - var1[var18 + 1];
      }

      var1[var2 + var8 + 1] = -var1[var2 + var8 + 1];
   }

   public static void method25973(long var0, Class2381 var2, long var3, long var5, Class2381 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         double var22 = 0.5 - var7.method9653(var8 + var5 - var16);
         double var24 = var7.method9653(var8 + var16);
         long var26 = var3 + var18;
         long var28 = var3 + var20;
         double var30 = var2.method9653(var26) - var2.method9653(var28);
         double var32 = var2.method9653(var26 + 1L) + var2.method9653(var28 + 1L);
         double var34 = var22 * var30 - var24 * var32;
         double var36 = var22 * var32 + var24 * var30;
         var2.method9687(var26, var2.method9653(var26) - var34);
         var2.method9687(var26 + 1L, var36 - var2.method9653(var26 + 1L));
         var2.method9687(var28, var2.method9653(var28) + var34);
         var2.method9687(var28 + 1L, var36 - var2.method9653(var28 + 1L));
      }

      var2.method9687(var3 + var12 + 1L, -var2.method9653(var3 + var12 + 1L));
   }

   public static void method25974(int var0, double[] var1, int var2, int var3, double[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (int var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         double var13 = 0.5 - var4[var5 + var3 - var10];
         double var15 = var4[var5 + var10];
         int var17 = var2 + var11;
         int var18 = var2 + var12;
         double var19 = var1[var17] - var1[var18];
         double var21 = var1[var17 + 1] + var1[var18 + 1];
         double var23 = var13 * var19 - var15 * var21;
         double var25 = var13 * var21 + var15 * var19;
         var1[var17] -= var23;
         var1[var17 + 1] = var1[var17 + 1] - var25;
         var1[var18] += var23;
         var1[var18 + 1] = var1[var18 + 1] - var25;
      }
   }

   public static void method25975(long var0, Class2381 var2, long var3, long var5, Class2381 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         double var22 = 0.5 - var7.method9653(var8 + var5 - var16);
         double var24 = var7.method9653(var8 + var16);
         long var26 = var3 + var18;
         long var28 = var3 + var20;
         double var30 = var2.method9653(var26) - var2.method9653(var28);
         double var32 = var2.method9653(var26 + 1L) + var2.method9653(var28 + 1L);
         double var34 = var22 * var30 - var24 * var32;
         double var36 = var22 * var32 + var24 * var30;
         var2.method9687(var26, var2.method9653(var26) - var34);
         var2.method9687(var26 + 1L, var2.method9653(var26 + 1L) - var36);
         var2.method9687(var28, var2.method9653(var28) + var34);
         var2.method9687(var28 + 1L, var2.method9653(var28 + 1L) - var36);
      }
   }

   public static void method25976(int var0, double[] var1, int var2, int var3, double[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = var3 / var0;
      int var10 = 0;

      for (int var11 = 1; var11 < var8; var11++) {
         int var12 = var0 - var11;
         var10 += var9;
         int var13 = var5 + var10;
         int var14 = var2 + var11;
         int var15 = var2 + var12;
         double var16 = var4[var13] - var4[var5 + var3 - var10];
         double var18 = var4[var13] + var4[var5 + var3 - var10];
         double var20 = var18 * var1[var14] - var16 * var1[var15];
         var1[var14] = var16 * var1[var14] + var18 * var1[var15];
         var1[var15] = var20;
      }

      var1[var2 + var8] = var1[var2 + var8] * var4[var5];
   }

   public static void method25977(long var0, Class2381 var2, long var3, long var5, Class2381 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = var5 / var0;
      long var16 = 0L;

      for (long var18 = 1L; var18 < var12; var18++) {
         long var20 = var0 - var18;
         var16 += var14;
         long var22 = var8 + var16;
         long var24 = var3 + var18;
         long var26 = var3 + var20;
         double var28 = var7.method9653(var22) - var7.method9653(var8 + var5 - var16);
         double var30 = var7.method9653(var22) + var7.method9653(var8 + var5 - var16);
         double var32 = var30 * var2.method9653(var24) - var28 * var2.method9653(var26);
         var2.method9687(var24, var28 * var2.method9653(var24) + var30 * var2.method9653(var26));
         var2.method9687(var26, var32);
      }

      var2.method9687(var3 + var12, var2.method9653(var3 + var12) * var7.method9653(var8));
   }

   public static void method25978(int var0, float[] var1, int var2, int[] var3, int var4, float[] var5) {
      if (var0 <= 8) {
         if (var0 != 8) {
            if (var0 == 4) {
               method26026(var1, var2);
            }
         } else {
            method26020(var1, var2);
         }
      } else if (var0 <= 32) {
         if (var0 != 32) {
            method26016(var1, var2, var5, 0);
            method25990(var1, var2);
         } else {
            method26012(var1, var2, var5, var4 - 8);
            method25986(var1, var2);
         }
      } else {
         method25994(var0, var1, var2, var5, var4 - (var0 >> 2));
         if (Class7008.method21726() > 1 && (long)var0 >= method25891()) {
            method25998(var0, var1, var2, var4, var5);
         } else if (var0 <= 512) {
            if (var0 <= 128) {
               method26010(var0, var1, var2, var4, var5);
            } else {
               method26004(var0, 1, var1, var2, var4, var5);
            }
         } else {
            method26000(var0, var1, var2, var4, var5);
         }

         method25982(var0, var3, var1, var2);
      }
   }

   public static void method25979(long var0, Class2378 var2, long var3, Class2382 var5, long var6, Class2378 var8) {
      if (var0 <= 8L) {
         if (var0 != 8L) {
            if (var0 == 4L) {
               method26027(var2, var3);
            }
         } else {
            method26021(var2, var3);
         }
      } else if (var0 <= 32L) {
         if (var0 != 32L) {
            method26017(var2, var3, var8, 0L);
            method25991(var2, var3);
         } else {
            method26013(var2, var3, var8, var6 - 8L);
            method25987(var2, var3);
         }
      } else {
         method25995(var0, var2, var3, var8, var6 - (var0 >> 2));
         if (Class7008.method21726() > 1 && var0 >= method25891()) {
            method25999(var0, var2, var3, var6, var8);
         } else if (var0 <= 512L) {
            if (var0 <= 128L) {
               method26011(var0, var2, var3, var6, var8);
            } else {
               method26005(var0, 1L, var2, var3, var6, var8);
            }
         } else {
            method26001(var0, var2, var3, var6, var8);
         }

         method25983(var0, var5, var2, var3);
      }
   }

   public static void method25980(int var0, float[] var1, int var2, int[] var3, int var4, float[] var5) {
      if (var0 <= 8) {
         if (var0 != 8) {
            if (var0 == 4) {
               method26026(var1, var2);
            }
         } else {
            method26022(var1, var2);
         }
      } else if (var0 <= 32) {
         if (var0 != 32) {
            method26016(var1, var2, var5, 0);
            method25992(var1, var2);
         } else {
            method26012(var1, var2, var5, var4 - 8);
            method25988(var1, var2);
         }
      } else {
         method25996(var0, var1, var2, var5, var4 - (var0 >> 2));
         if (Class7008.method21726() > 1 && (long)var0 >= method25891()) {
            method25998(var0, var1, var2, var4, var5);
         } else if (var0 <= 512) {
            if (var0 <= 128) {
               method26010(var0, var1, var2, var4, var5);
            } else {
               method26004(var0, 1, var1, var2, var4, var5);
            }
         } else {
            method26000(var0, var1, var2, var4, var5);
         }

         method25984(var0, var3, var1, var2);
      }
   }

   public static void method25981(long var0, Class2378 var2, long var3, Class2382 var5, long var6, Class2378 var8) {
      if (var0 <= 8L) {
         if (var0 != 8L) {
            if (var0 == 4L) {
               method26027(var2, var3);
            }
         } else {
            method26023(var2, var3);
         }
      } else if (var0 <= 32L) {
         if (var0 != 32L) {
            method26017(var2, var3, var8, 0L);
            method25993(var2, var3);
         } else {
            method26013(var2, var3, var8, var6 - 8L);
            method25989(var2, var3);
         }
      } else {
         method25997(var0, var2, var3, var8, var6 - (var0 >> 2));
         if (Class7008.method21726() > 1 && var0 >= method25891()) {
            method25999(var0, var2, var3, var6, var8);
         } else if (var0 <= 512L) {
            if (var0 <= 128L) {
               method26011(var0, var2, var3, var6, var8);
            } else {
               method26005(var0, 1L, var2, var3, var6, var8);
            }
         } else {
            method26001(var0, var2, var3, var6, var8);
         }

         method25985(var0, var5, var2, var3);
      }
   }

   public static void method25982(int var0, int[] var1, float[] var2, int var3) {
      byte var6 = 1;

      int var7;
      for (var7 = var0 >> 2; var7 > 8; var7 >>= 2) {
         var6 <<= 1;
      }

      int var8 = var0 >> 1;
      int var9 = 4 * var6;
      if (var7 != 8) {
         for (int var10 = 0; var10 < var6; var10++) {
            int var11 = 4 * var10;

            for (int var12 = 0; var12 < var10; var12++) {
               int var14 = 4 * var12 + var1[var6 + var10];
               int var13 = var11 + var1[var6 + var12];
               int var15 = var3 + var14;
               int var16 = var3 + var13;
               float var17 = var2[var15];
               float var18 = var2[var15 + 1];
               float var19 = var2[var16];
               float var20 = var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 += var9;
               var13 += var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = var2[var15 + 1];
               var19 = var2[var16];
               var20 = var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 += var8;
               var13 += 2;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = var2[var15 + 1];
               var19 = var2[var16];
               var20 = var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 -= var9;
               var13 -= var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = var2[var15 + 1];
               var19 = var2[var16];
               var20 = var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 += 2;
               var13 += var8;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = var2[var15 + 1];
               var19 = var2[var16];
               var20 = var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 += var9;
               var13 += var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = var2[var15 + 1];
               var19 = var2[var16];
               var20 = var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 -= var8;
               var13 -= 2;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = var2[var15 + 1];
               var19 = var2[var16];
               var20 = var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 -= var9;
               var13 -= var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = var2[var15 + 1];
               var19 = var2[var16];
               var20 = var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
            }

            int var31 = var11 + var1[var6 + var10];
            int var64 = var31 + 2;
            var31 += var8;
            int var95 = var3 + var64;
            int var126 = var3 + var31;
            float var157 = var2[var95];
            float var188 = var2[var95 + 1];
            float var219 = var2[var126];
            float var250 = var2[var126 + 1];
            var2[var95] = var219;
            var2[var95 + 1] = var250;
            var2[var126] = var157;
            var2[var126 + 1] = var188;
            var64 += var9;
            var31 += var9;
            var95 = var3 + var64;
            var126 = var3 + var31;
            var157 = var2[var95];
            var188 = var2[var95 + 1];
            var219 = var2[var126];
            var250 = var2[var126 + 1];
            var2[var95] = var219;
            var2[var95 + 1] = var250;
            var2[var126] = var157;
            var2[var126 + 1] = var188;
         }
      } else {
         for (int var21 = 0; var21 < var6; var21++) {
            int var22 = 4 * var21;

            for (int var23 = 0; var23 < var21; var23++) {
               int var66 = 4 * var23 + 2 * var1[var6 + var21];
               int var34 = var22 + 2 * var1[var6 + var23];
               int var97 = var3 + var66;
               int var128 = var3 + var34;
               float var159 = var2[var97];
               float var190 = var2[var97 + 1];
               float var221 = var2[var128];
               float var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 += 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 -= var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 += 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var8;
               var34 += 2;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 -= 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 += var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 -= 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += 2;
               var34 += var8;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 += 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 -= var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 += 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var8;
               var34 -= 2;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 -= 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 += var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 -= 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = var2[var97 + 1];
               var221 = var2[var128];
               var252 = var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
            }

            int var50 = var22 + 2 * var1[var6 + var21];
            int var82 = var50 + 2;
            var50 += var8;
            int var113 = var3 + var82;
            int var144 = var3 + var50;
            float var175 = var2[var113];
            float var206 = var2[var113 + 1];
            float var237 = var2[var144];
            float var268 = var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var82 += var9;
            var50 += 2 * var9;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var175 = var2[var113];
            var206 = var2[var113 + 1];
            var237 = var2[var144];
            var268 = var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var82 += var9;
            var50 -= var9;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var175 = var2[var113];
            var206 = var2[var113 + 1];
            var237 = var2[var144];
            var268 = var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var82 -= 2;
            var50 -= var8;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var175 = var2[var113];
            var206 = var2[var113 + 1];
            var237 = var2[var144];
            var268 = var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var82 += var8 + 2;
            var50 += var8 + 2;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var175 = var2[var113];
            var206 = var2[var113 + 1];
            var237 = var2[var144];
            var268 = var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var82 -= var8 - var9;
            var50 += 2 * var9 - 2;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var175 = var2[var113];
            var206 = var2[var113 + 1];
            var237 = var2[var144];
            var268 = var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
         }
      }
   }

   public static void method25983(long var0, Class2382 var2, Class2378 var3, long var4) {
      long var8 = 1L;

      long var10;
      for (var10 = var0 >> 2; var10 > 8L; var10 >>= 2) {
         var8 <<= 1;
      }

      long var12 = var0 >> 1;
      long var14 = 4L * var8;
      if (var10 != 8L) {
         for (long var16 = 0L; var16 < var8; var16++) {
            long var18 = 4L * var16;

            for (long var20 = 0L; var20 < var16; var20++) {
               long var24 = 4L * var20 + var2.method9649(var8 + var16);
               long var22 = var18 + var2.method9649(var8 + var20);
               long var26 = var4 + var24;
               long var28 = var4 + var22;
               float var30 = var3.method9651(var26);
               float var31 = var3.method9651(var26 + 1L);
               float var32 = var3.method9651(var28);
               float var33 = var3.method9651(var28 + 1L);
               var3.method9685(var26, var32);
               var3.method9685(var26 + 1L, var33);
               var3.method9685(var28, var30);
               var3.method9685(var28 + 1L, var31);
               var24 += var14;
               var22 += var14;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9651(var26);
               var31 = var3.method9651(var26 + 1L);
               var32 = var3.method9651(var28);
               var33 = var3.method9651(var28 + 1L);
               var3.method9685(var26, var32);
               var3.method9685(var26 + 1L, var33);
               var3.method9685(var28, var30);
               var3.method9685(var28 + 1L, var31);
               var24 += var12;
               var22 += 2L;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9651(var26);
               var31 = var3.method9651(var26 + 1L);
               var32 = var3.method9651(var28);
               var33 = var3.method9651(var28 + 1L);
               var3.method9685(var26, var32);
               var3.method9685(var26 + 1L, var33);
               var3.method9685(var28, var30);
               var3.method9685(var28 + 1L, var31);
               var24 -= var14;
               var22 -= var14;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9651(var26);
               var31 = var3.method9651(var26 + 1L);
               var32 = var3.method9651(var28);
               var33 = var3.method9651(var28 + 1L);
               var3.method9685(var26, var32);
               var3.method9685(var26 + 1L, var33);
               var3.method9685(var28, var30);
               var3.method9685(var28 + 1L, var31);
               var24 += 2L;
               var22 += var12;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9651(var26);
               var31 = var3.method9651(var26 + 1L);
               var32 = var3.method9651(var28);
               var33 = var3.method9651(var28 + 1L);
               var3.method9685(var26, var32);
               var3.method9685(var26 + 1L, var33);
               var3.method9685(var28, var30);
               var3.method9685(var28 + 1L, var31);
               var24 += var14;
               var22 += var14;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9651(var26);
               var31 = var3.method9651(var26 + 1L);
               var32 = var3.method9651(var28);
               var33 = var3.method9651(var28 + 1L);
               var3.method9685(var26, var32);
               var3.method9685(var26 + 1L, var33);
               var3.method9685(var28, var30);
               var3.method9685(var28 + 1L, var31);
               var24 -= var12;
               var22 -= 2L;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9651(var26);
               var31 = var3.method9651(var26 + 1L);
               var32 = var3.method9651(var28);
               var33 = var3.method9651(var28 + 1L);
               var3.method9685(var26, var32);
               var3.method9685(var26 + 1L, var33);
               var3.method9685(var28, var30);
               var3.method9685(var28 + 1L, var31);
               var24 -= var14;
               var22 -= var14;
               var26 = var4 + var24;
               var28 = var4 + var22;
               var30 = var3.method9651(var26);
               var31 = var3.method9651(var26 + 1L);
               var32 = var3.method9651(var28);
               var33 = var3.method9651(var28 + 1L);
               var3.method9685(var26, var32);
               var3.method9685(var26 + 1L, var33);
               var3.method9685(var28, var30);
               var3.method9685(var28 + 1L, var31);
            }

            long var44 = var18 + var2.method9649(var8 + var16);
            long var77 = var44 + 2L;
            var44 += var12;
            long var108 = var4 + var77;
            long var139 = var4 + var44;
            float var170 = var3.method9651(var108);
            float var201 = var3.method9651(var108 + 1L);
            float var232 = var3.method9651(var139);
            float var263 = var3.method9651(var139 + 1L);
            var3.method9685(var108, var232);
            var3.method9685(var108 + 1L, var263);
            var3.method9685(var139, var170);
            var3.method9685(var139 + 1L, var201);
            var77 += var14;
            var44 += var14;
            var108 = var4 + var77;
            var139 = var4 + var44;
            var170 = var3.method9651(var108);
            var201 = var3.method9651(var108 + 1L);
            var232 = var3.method9651(var139);
            var263 = var3.method9651(var139 + 1L);
            var3.method9685(var108, var232);
            var3.method9685(var108 + 1L, var263);
            var3.method9685(var139, var170);
            var3.method9685(var139 + 1L, var201);
         }
      } else {
         for (long var34 = 0L; var34 < var8; var34++) {
            long var35 = 4L * var34;

            for (long var36 = 0L; var36 < var34; var36++) {
               long var79 = 4L * var36 + 2L * var2.method9649(var8 + var34);
               long var47 = var35 + 2L * var2.method9649(var8 + var36);
               long var110 = var4 + var79;
               long var141 = var4 + var47;
               float var172 = var3.method9651(var110);
               float var203 = var3.method9651(var110 + 1L);
               float var234 = var3.method9651(var141);
               float var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 += 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 -= var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 += 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var12;
               var47 += 2L;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 -= 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 += var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 -= 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += 2L;
               var47 += var12;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 += 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 -= var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 += 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var12;
               var47 -= 2L;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 -= 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 += var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 -= 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
            }

            long var63 = var35 + 2L * var2.method9649(var8 + var34);
            long var95 = var63 + 2L;
            var63 += var12;
            long var126 = var4 + var95;
            long var157 = var4 + var63;
            float var188 = var3.method9651(var126);
            float var219 = var3.method9651(var126 + 1L);
            float var250 = var3.method9651(var157);
            float var281 = var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var95 += var14;
            var63 += 2L * var14;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var188 = var3.method9651(var126);
            var219 = var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var95 += var14;
            var63 -= var14;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var188 = var3.method9651(var126);
            var219 = var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var95 -= 2L;
            var63 -= var12;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var188 = var3.method9651(var126);
            var219 = var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var95 += var12 + 2L;
            var63 += var12 + 2L;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var188 = var3.method9651(var126);
            var219 = var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var95 -= var12 - var14;
            var63 += 2L * var14 - 2L;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var188 = var3.method9651(var126);
            var219 = var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
         }
      }
   }

   public static void method25984(int var0, int[] var1, float[] var2, int var3) {
      byte var6 = 1;

      int var7;
      for (var7 = var0 >> 2; var7 > 8; var7 >>= 2) {
         var6 <<= 1;
      }

      int var8 = var0 >> 1;
      int var9 = 4 * var6;
      if (var7 != 8) {
         for (int var10 = 0; var10 < var6; var10++) {
            int var11 = 4 * var10;

            for (int var12 = 0; var12 < var10; var12++) {
               int var14 = 4 * var12 + var1[var6 + var10];
               int var13 = var11 + var1[var6 + var12];
               int var15 = var3 + var14;
               int var16 = var3 + var13;
               float var17 = var2[var15];
               float var18 = -var2[var15 + 1];
               float var19 = var2[var16];
               float var20 = -var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 += var9;
               var13 += var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = -var2[var15 + 1];
               var19 = var2[var16];
               var20 = -var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 += var8;
               var13 += 2;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = -var2[var15 + 1];
               var19 = var2[var16];
               var20 = -var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 -= var9;
               var13 -= var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = -var2[var15 + 1];
               var19 = var2[var16];
               var20 = -var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 += 2;
               var13 += var8;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = -var2[var15 + 1];
               var19 = var2[var16];
               var20 = -var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 += var9;
               var13 += var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = -var2[var15 + 1];
               var19 = var2[var16];
               var20 = -var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 -= var8;
               var13 -= 2;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = -var2[var15 + 1];
               var19 = var2[var16];
               var20 = -var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
               var14 -= var9;
               var13 -= var9;
               var15 = var3 + var14;
               var16 = var3 + var13;
               var17 = var2[var15];
               var18 = -var2[var15 + 1];
               var19 = var2[var16];
               var20 = -var2[var16 + 1];
               var2[var15] = var19;
               var2[var15 + 1] = var20;
               var2[var16] = var17;
               var2[var16 + 1] = var18;
            }

            int var31 = var11 + var1[var6 + var10];
            int var64 = var31 + 2;
            var31 += var8;
            int var95 = var3 + var64;
            int var126 = var3 + var31;
            var2[var95 - 1] = -var2[var95 - 1];
            float var157 = var2[var95];
            float var188 = -var2[var95 + 1];
            float var219 = var2[var126];
            float var250 = -var2[var126 + 1];
            var2[var95] = var219;
            var2[var95 + 1] = var250;
            var2[var126] = var157;
            var2[var126 + 1] = var188;
            var2[var126 + 3] = -var2[var126 + 3];
            var64 += var9;
            var31 += var9;
            var95 = var3 + var64;
            var126 = var3 + var31;
            var2[var95 - 1] = -var2[var95 - 1];
            var157 = var2[var95];
            var188 = -var2[var95 + 1];
            var219 = var2[var126];
            var250 = -var2[var126 + 1];
            var2[var95] = var219;
            var2[var95 + 1] = var250;
            var2[var126] = var157;
            var2[var126 + 1] = var188;
            var2[var126 + 3] = -var2[var126 + 3];
         }
      } else {
         for (int var21 = 0; var21 < var6; var21++) {
            int var22 = 4 * var21;

            for (int var23 = 0; var23 < var21; var23++) {
               int var66 = 4 * var23 + 2 * var1[var6 + var21];
               int var34 = var22 + 2 * var1[var6 + var23];
               int var97 = var3 + var66;
               int var128 = var3 + var34;
               float var159 = var2[var97];
               float var190 = -var2[var97 + 1];
               float var221 = var2[var128];
               float var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 += 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 -= var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 += 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var8;
               var34 += 2;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 -= 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 += var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 -= 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += 2;
               var34 += var8;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 += 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 -= var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 += var9;
               var34 += 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var8;
               var34 -= 2;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 -= 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 += var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
               var66 -= var9;
               var34 -= 2 * var9;
               var97 = var3 + var66;
               var128 = var3 + var34;
               var159 = var2[var97];
               var190 = -var2[var97 + 1];
               var221 = var2[var128];
               var252 = -var2[var128 + 1];
               var2[var97] = var221;
               var2[var97 + 1] = var252;
               var2[var128] = var159;
               var2[var128 + 1] = var190;
            }

            int var50 = var22 + 2 * var1[var6 + var21];
            int var82 = var50 + 2;
            var50 += var8;
            int var113 = var3 + var82;
            int var144 = var3 + var50;
            var2[var113 - 1] = -var2[var113 - 1];
            float var175 = var2[var113];
            float var206 = -var2[var113 + 1];
            float var237 = var2[var144];
            float var268 = -var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var2[var144 + 3] = -var2[var144 + 3];
            var82 += var9;
            var50 += 2 * var9;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var175 = var2[var113];
            var206 = -var2[var113 + 1];
            var237 = var2[var144];
            var268 = -var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var82 += var9;
            var50 -= var9;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var175 = var2[var113];
            var206 = -var2[var113 + 1];
            var237 = var2[var144];
            var268 = -var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var82 -= 2;
            var50 -= var8;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var175 = var2[var113];
            var206 = -var2[var113 + 1];
            var237 = var2[var144];
            var268 = -var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var82 += var8 + 2;
            var50 += var8 + 2;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var175 = var2[var113];
            var206 = -var2[var113 + 1];
            var237 = var2[var144];
            var268 = -var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var82 -= var8 - var9;
            var50 += 2 * var9 - 2;
            var113 = var3 + var82;
            var144 = var3 + var50;
            var2[var113 - 1] = -var2[var113 - 1];
            var175 = var2[var113];
            var206 = -var2[var113 + 1];
            var237 = var2[var144];
            var268 = -var2[var144 + 1];
            var2[var113] = var237;
            var2[var113 + 1] = var268;
            var2[var144] = var175;
            var2[var144 + 1] = var206;
            var2[var144 + 3] = -var2[var144 + 3];
         }
      }
   }

   public static void method25985(long var0, Class2382 var2, Class2378 var3, long var4) {
      long var8 = 1L;

      long var10;
      for (var10 = var0 >> 2; var10 > 8L; var10 >>= 2) {
         var8 <<= 1;
      }

      long var12 = var0 >> 1;
      long var14 = 4L * var8;
      if (var10 != 8L) {
         for (int var16 = 0; (long)var16 < var8; var16++) {
            long var19 = (long)(4 * var16);

            for (int var35 = 0; var35 < var16; var35++) {
               long var25 = (long)(4 * var35) + var2.method9649(var8 + (long)var16);
               long var23 = var19 + var2.method9649(var8 + (long)var35);
               long var27 = var4 + var25;
               long var29 = var4 + var23;
               float var31 = var3.method9651(var27);
               float var32 = -var3.method9651(var27 + 1L);
               float var33 = var3.method9651(var29);
               float var34 = -var3.method9651(var29 + 1L);
               var3.method9685(var27, var33);
               var3.method9685(var27 + 1L, var34);
               var3.method9685(var29, var31);
               var3.method9685(var29 + 1L, var32);
               var25 += var14;
               var23 += var14;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9651(var27);
               var32 = -var3.method9651(var27 + 1L);
               var33 = var3.method9651(var29);
               var34 = -var3.method9651(var29 + 1L);
               var3.method9685(var27, var33);
               var3.method9685(var27 + 1L, var34);
               var3.method9685(var29, var31);
               var3.method9685(var29 + 1L, var32);
               var25 += var12;
               var23 += 2L;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9651(var27);
               var32 = -var3.method9651(var27 + 1L);
               var33 = var3.method9651(var29);
               var34 = -var3.method9651(var29 + 1L);
               var3.method9685(var27, var33);
               var3.method9685(var27 + 1L, var34);
               var3.method9685(var29, var31);
               var3.method9685(var29 + 1L, var32);
               var25 -= var14;
               var23 -= var14;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9651(var27);
               var32 = -var3.method9651(var27 + 1L);
               var33 = var3.method9651(var29);
               var34 = -var3.method9651(var29 + 1L);
               var3.method9685(var27, var33);
               var3.method9685(var27 + 1L, var34);
               var3.method9685(var29, var31);
               var3.method9685(var29 + 1L, var32);
               var25 += 2L;
               var23 += var12;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9651(var27);
               var32 = -var3.method9651(var27 + 1L);
               var33 = var3.method9651(var29);
               var34 = -var3.method9651(var29 + 1L);
               var3.method9685(var27, var33);
               var3.method9685(var27 + 1L, var34);
               var3.method9685(var29, var31);
               var3.method9685(var29 + 1L, var32);
               var25 += var14;
               var23 += var14;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9651(var27);
               var32 = -var3.method9651(var27 + 1L);
               var33 = var3.method9651(var29);
               var34 = -var3.method9651(var29 + 1L);
               var3.method9685(var27, var33);
               var3.method9685(var27 + 1L, var34);
               var3.method9685(var29, var31);
               var3.method9685(var29 + 1L, var32);
               var25 -= var12;
               var23 -= 2L;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9651(var27);
               var32 = -var3.method9651(var27 + 1L);
               var33 = var3.method9651(var29);
               var34 = -var3.method9651(var29 + 1L);
               var3.method9685(var27, var33);
               var3.method9685(var27 + 1L, var34);
               var3.method9685(var29, var31);
               var3.method9685(var29 + 1L, var32);
               var25 -= var14;
               var23 -= var14;
               var27 = var4 + var25;
               var29 = var4 + var23;
               var31 = var3.method9651(var27);
               var32 = -var3.method9651(var27 + 1L);
               var33 = var3.method9651(var29);
               var34 = -var3.method9651(var29 + 1L);
               var3.method9685(var27, var33);
               var3.method9685(var27 + 1L, var34);
               var3.method9685(var29, var31);
               var3.method9685(var29 + 1L, var32);
            }

            long var44 = var19 + var2.method9649(var8 + (long)var16);
            long var77 = var44 + 2L;
            var44 += var12;
            long var108 = var4 + var77;
            long var139 = var4 + var44;
            var3.method9685(var108 - 1L, -var3.method9651(var108 - 1L));
            float var170 = var3.method9651(var108);
            float var201 = -var3.method9651(var108 + 1L);
            float var232 = var3.method9651(var139);
            float var263 = -var3.method9651(var139 + 1L);
            var3.method9685(var108, var232);
            var3.method9685(var108 + 1L, var263);
            var3.method9685(var139, var170);
            var3.method9685(var139 + 1L, var201);
            var3.method9685(var139 + 3L, -var3.method9651(var139 + 3L));
            var77 += var14;
            var44 += var14;
            var108 = var4 + var77;
            var139 = var4 + var44;
            var3.method9685(var108 - 1L, -var3.method9651(var108 - 1L));
            var170 = var3.method9651(var108);
            var201 = -var3.method9651(var108 + 1L);
            var232 = var3.method9651(var139);
            var263 = -var3.method9651(var139 + 1L);
            var3.method9685(var108, var232);
            var3.method9685(var108 + 1L, var263);
            var3.method9685(var139, var170);
            var3.method9685(var139 + 1L, var201);
            var3.method9685(var139 + 3L, -var3.method9651(var139 + 3L));
         }
      } else {
         for (long var17 = 0L; var17 < var8; var17++) {
            long var36 = 4L * var17;

            for (long var21 = 0L; var21 < var17; var21++) {
               long var79 = 4L * var21 + 2L * var2.method9649(var8 + var17);
               long var47 = var36 + 2L * var2.method9649(var8 + var21);
               long var110 = var4 + var79;
               long var141 = var4 + var47;
               float var172 = var3.method9651(var110);
               float var203 = -var3.method9651(var110 + 1L);
               float var234 = var3.method9651(var141);
               float var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 += 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 -= var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 += 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var12;
               var47 += 2L;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 -= 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 += var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 -= 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += 2L;
               var47 += var12;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 += 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 -= var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 += var14;
               var47 += 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var12;
               var47 -= 2L;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 -= 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 += var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
               var79 -= var14;
               var47 -= 2L * var14;
               var110 = var4 + var79;
               var141 = var4 + var47;
               var172 = var3.method9651(var110);
               var203 = -var3.method9651(var110 + 1L);
               var234 = var3.method9651(var141);
               var265 = -var3.method9651(var141 + 1L);
               var3.method9685(var110, var234);
               var3.method9685(var110 + 1L, var265);
               var3.method9685(var141, var172);
               var3.method9685(var141 + 1L, var203);
            }

            long var63 = var36 + 2L * var2.method9649(var8 + var17);
            long var95 = var63 + 2L;
            var63 += var12;
            long var126 = var4 + var95;
            long var157 = var4 + var63;
            var3.method9685(var126 - 1L, -var3.method9651(var126 - 1L));
            float var188 = var3.method9651(var126);
            float var219 = -var3.method9651(var126 + 1L);
            float var250 = var3.method9651(var157);
            float var281 = -var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var3.method9685(var157 + 3L, -var3.method9651(var157 + 3L));
            var95 += var14;
            var63 += 2L * var14;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var188 = var3.method9651(var126);
            var219 = -var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = -var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var95 += var14;
            var63 -= var14;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var188 = var3.method9651(var126);
            var219 = -var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = -var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var95 -= 2L;
            var63 -= var12;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var188 = var3.method9651(var126);
            var219 = -var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = -var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var95 += var12 + 2L;
            var63 += var12 + 2L;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var188 = var3.method9651(var126);
            var219 = -var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = -var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var95 -= var12 - var14;
            var63 += 2L * var14 - 2L;
            var126 = var4 + var95;
            var157 = var4 + var63;
            var3.method9685(var126 - 1L, -var3.method9651(var126 - 1L));
            var188 = var3.method9651(var126);
            var219 = -var3.method9651(var126 + 1L);
            var250 = var3.method9651(var157);
            var281 = -var3.method9651(var157 + 1L);
            var3.method9685(var126, var250);
            var3.method9685(var126 + 1L, var281);
            var3.method9685(var157, var188);
            var3.method9685(var157 + 1L, var219);
            var3.method9685(var157 + 3L, -var3.method9651(var157 + 3L));
         }
      }
   }

   public static void method25986(float[] var0, int var1) {
      float var4 = var0[var1 + 2];
      float var5 = var0[var1 + 3];
      float var6 = var0[var1 + 4];
      float var7 = var0[var1 + 5];
      float var8 = var0[var1 + 6];
      float var9 = var0[var1 + 7];
      float var10 = var0[var1 + 8];
      float var11 = var0[var1 + 9];
      float var12 = var0[var1 + 10];
      float var13 = var0[var1 + 11];
      float var14 = var0[var1 + 14];
      float var15 = var0[var1 + 15];
      float var16 = var0[var1 + 16];
      float var17 = var0[var1 + 17];
      float var18 = var0[var1 + 20];
      float var19 = var0[var1 + 21];
      float var20 = var0[var1 + 22];
      float var21 = var0[var1 + 23];
      float var22 = var0[var1 + 24];
      float var23 = var0[var1 + 25];
      float var24 = var0[var1 + 26];
      float var25 = var0[var1 + 27];
      float var26 = var0[var1 + 28];
      float var27 = var0[var1 + 29];
      var0[var1 + 2] = var16;
      var0[var1 + 3] = var17;
      var0[var1 + 4] = var10;
      var0[var1 + 5] = var11;
      var0[var1 + 6] = var22;
      var0[var1 + 7] = var23;
      var0[var1 + 8] = var6;
      var0[var1 + 9] = var7;
      var0[var1 + 10] = var18;
      var0[var1 + 11] = var19;
      var0[var1 + 14] = var26;
      var0[var1 + 15] = var27;
      var0[var1 + 16] = var4;
      var0[var1 + 17] = var5;
      var0[var1 + 20] = var12;
      var0[var1 + 21] = var13;
      var0[var1 + 22] = var24;
      var0[var1 + 23] = var25;
      var0[var1 + 24] = var8;
      var0[var1 + 25] = var9;
      var0[var1 + 26] = var20;
      var0[var1 + 27] = var21;
      var0[var1 + 28] = var14;
      var0[var1 + 29] = var15;
   }

   public static void method25987(Class2378 var0, long var1) {
      float var5 = var0.method9651(var1 + 2L);
      float var6 = var0.method9651(var1 + 3L);
      float var7 = var0.method9651(var1 + 4L);
      float var8 = var0.method9651(var1 + 5L);
      float var9 = var0.method9651(var1 + 6L);
      float var10 = var0.method9651(var1 + 7L);
      float var11 = var0.method9651(var1 + 8L);
      float var12 = var0.method9651(var1 + 9L);
      float var13 = var0.method9651(var1 + 10L);
      float var14 = var0.method9651(var1 + 11L);
      float var15 = var0.method9651(var1 + 14L);
      float var16 = var0.method9651(var1 + 15L);
      float var17 = var0.method9651(var1 + 16L);
      float var18 = var0.method9651(var1 + 17L);
      float var19 = var0.method9651(var1 + 20L);
      float var20 = var0.method9651(var1 + 21L);
      float var21 = var0.method9651(var1 + 22L);
      float var22 = var0.method9651(var1 + 23L);
      float var23 = var0.method9651(var1 + 24L);
      float var24 = var0.method9651(var1 + 25L);
      float var25 = var0.method9651(var1 + 26L);
      float var26 = var0.method9651(var1 + 27L);
      float var27 = var0.method9651(var1 + 28L);
      float var28 = var0.method9651(var1 + 29L);
      var0.method9685(var1 + 2L, var17);
      var0.method9685(var1 + 3L, var18);
      var0.method9685(var1 + 4L, var11);
      var0.method9685(var1 + 5L, var12);
      var0.method9685(var1 + 6L, var23);
      var0.method9685(var1 + 7L, var24);
      var0.method9685(var1 + 8L, var7);
      var0.method9685(var1 + 9L, var8);
      var0.method9685(var1 + 10L, var19);
      var0.method9685(var1 + 11L, var20);
      var0.method9685(var1 + 14L, var27);
      var0.method9685(var1 + 15L, var28);
      var0.method9685(var1 + 16L, var5);
      var0.method9685(var1 + 17L, var6);
      var0.method9685(var1 + 20L, var13);
      var0.method9685(var1 + 21L, var14);
      var0.method9685(var1 + 22L, var25);
      var0.method9685(var1 + 23L, var26);
      var0.method9685(var1 + 24L, var9);
      var0.method9685(var1 + 25L, var10);
      var0.method9685(var1 + 26L, var21);
      var0.method9685(var1 + 27L, var22);
      var0.method9685(var1 + 28L, var15);
      var0.method9685(var1 + 29L, var16);
   }

   public static void method25988(float[] var0, int var1) {
      float var4 = var0[var1 + 2];
      float var5 = var0[var1 + 3];
      float var6 = var0[var1 + 4];
      float var7 = var0[var1 + 5];
      float var8 = var0[var1 + 6];
      float var9 = var0[var1 + 7];
      float var10 = var0[var1 + 8];
      float var11 = var0[var1 + 9];
      float var12 = var0[var1 + 10];
      float var13 = var0[var1 + 11];
      float var14 = var0[var1 + 12];
      float var15 = var0[var1 + 13];
      float var16 = var0[var1 + 14];
      float var17 = var0[var1 + 15];
      float var18 = var0[var1 + 16];
      float var19 = var0[var1 + 17];
      float var20 = var0[var1 + 18];
      float var21 = var0[var1 + 19];
      float var22 = var0[var1 + 20];
      float var23 = var0[var1 + 21];
      float var24 = var0[var1 + 22];
      float var25 = var0[var1 + 23];
      float var26 = var0[var1 + 24];
      float var27 = var0[var1 + 25];
      float var28 = var0[var1 + 26];
      float var29 = var0[var1 + 27];
      float var30 = var0[var1 + 28];
      float var31 = var0[var1 + 29];
      float var32 = var0[var1 + 30];
      float var33 = var0[var1 + 31];
      var0[var1 + 2] = var32;
      var0[var1 + 3] = var33;
      var0[var1 + 4] = var16;
      var0[var1 + 5] = var17;
      var0[var1 + 6] = var24;
      var0[var1 + 7] = var25;
      var0[var1 + 8] = var8;
      var0[var1 + 9] = var9;
      var0[var1 + 10] = var28;
      var0[var1 + 11] = var29;
      var0[var1 + 12] = var12;
      var0[var1 + 13] = var13;
      var0[var1 + 14] = var20;
      var0[var1 + 15] = var21;
      var0[var1 + 16] = var4;
      var0[var1 + 17] = var5;
      var0[var1 + 18] = var30;
      var0[var1 + 19] = var31;
      var0[var1 + 20] = var14;
      var0[var1 + 21] = var15;
      var0[var1 + 22] = var22;
      var0[var1 + 23] = var23;
      var0[var1 + 24] = var6;
      var0[var1 + 25] = var7;
      var0[var1 + 26] = var26;
      var0[var1 + 27] = var27;
      var0[var1 + 28] = var10;
      var0[var1 + 29] = var11;
      var0[var1 + 30] = var18;
      var0[var1 + 31] = var19;
   }

   public static void method25989(Class2378 var0, long var1) {
      float var5 = var0.method9651(var1 + 2L);
      float var6 = var0.method9651(var1 + 3L);
      float var7 = var0.method9651(var1 + 4L);
      float var8 = var0.method9651(var1 + 5L);
      float var9 = var0.method9651(var1 + 6L);
      float var10 = var0.method9651(var1 + 7L);
      float var11 = var0.method9651(var1 + 8L);
      float var12 = var0.method9651(var1 + 9L);
      float var13 = var0.method9651(var1 + 10L);
      float var14 = var0.method9651(var1 + 11L);
      float var15 = var0.method9651(var1 + 12L);
      float var16 = var0.method9651(var1 + 13L);
      float var17 = var0.method9651(var1 + 14L);
      float var18 = var0.method9651(var1 + 15L);
      float var19 = var0.method9651(var1 + 16L);
      float var20 = var0.method9651(var1 + 17L);
      float var21 = var0.method9651(var1 + 18L);
      float var22 = var0.method9651(var1 + 19L);
      float var23 = var0.method9651(var1 + 20L);
      float var24 = var0.method9651(var1 + 21L);
      float var25 = var0.method9651(var1 + 22L);
      float var26 = var0.method9651(var1 + 23L);
      float var27 = var0.method9651(var1 + 24L);
      float var28 = var0.method9651(var1 + 25L);
      float var29 = var0.method9651(var1 + 26L);
      float var30 = var0.method9651(var1 + 27L);
      float var31 = var0.method9651(var1 + 28L);
      float var32 = var0.method9651(var1 + 29L);
      float var33 = var0.method9651(var1 + 30L);
      float var34 = var0.method9651(var1 + 31L);
      var0.method9685(var1 + 2L, var33);
      var0.method9685(var1 + 3L, var34);
      var0.method9685(var1 + 4L, var17);
      var0.method9685(var1 + 5L, var18);
      var0.method9685(var1 + 6L, var25);
      var0.method9685(var1 + 7L, var26);
      var0.method9685(var1 + 8L, var9);
      var0.method9685(var1 + 9L, var10);
      var0.method9685(var1 + 10L, var29);
      var0.method9685(var1 + 11L, var30);
      var0.method9685(var1 + 12L, var13);
      var0.method9685(var1 + 13L, var14);
      var0.method9685(var1 + 14L, var21);
      var0.method9685(var1 + 15L, var22);
      var0.method9685(var1 + 16L, var5);
      var0.method9685(var1 + 17L, var6);
      var0.method9685(var1 + 18L, var31);
      var0.method9685(var1 + 19L, var32);
      var0.method9685(var1 + 20L, var15);
      var0.method9685(var1 + 21L, var16);
      var0.method9685(var1 + 22L, var23);
      var0.method9685(var1 + 23L, var24);
      var0.method9685(var1 + 24L, var7);
      var0.method9685(var1 + 25L, var8);
      var0.method9685(var1 + 26L, var27);
      var0.method9685(var1 + 27L, var28);
      var0.method9685(var1 + 28L, var11);
      var0.method9685(var1 + 29L, var12);
      var0.method9685(var1 + 30L, var19);
      var0.method9685(var1 + 31L, var20);
   }

   public static void method25990(float[] var0, int var1) {
      float var4 = var0[var1 + 2];
      float var5 = var0[var1 + 3];
      float var6 = var0[var1 + 6];
      float var7 = var0[var1 + 7];
      float var8 = var0[var1 + 8];
      float var9 = var0[var1 + 9];
      float var10 = var0[var1 + 12];
      float var11 = var0[var1 + 13];
      var0[var1 + 2] = var8;
      var0[var1 + 3] = var9;
      var0[var1 + 6] = var10;
      var0[var1 + 7] = var11;
      var0[var1 + 8] = var4;
      var0[var1 + 9] = var5;
      var0[var1 + 12] = var6;
      var0[var1 + 13] = var7;
   }

   public static void method25991(Class2378 var0, long var1) {
      float var5 = var0.method9651(var1 + 2L);
      float var6 = var0.method9651(var1 + 3L);
      float var7 = var0.method9651(var1 + 6L);
      float var8 = var0.method9651(var1 + 7L);
      float var9 = var0.method9651(var1 + 8L);
      float var10 = var0.method9651(var1 + 9L);
      float var11 = var0.method9651(var1 + 12L);
      float var12 = var0.method9651(var1 + 13L);
      var0.method9685(var1 + 2L, var9);
      var0.method9685(var1 + 3L, var10);
      var0.method9685(var1 + 6L, var11);
      var0.method9685(var1 + 7L, var12);
      var0.method9685(var1 + 8L, var5);
      var0.method9685(var1 + 9L, var6);
      var0.method9685(var1 + 12L, var7);
      var0.method9685(var1 + 13L, var8);
   }

   public static void method25992(float[] var0, int var1) {
      float var4 = var0[var1 + 2];
      float var5 = var0[var1 + 3];
      float var6 = var0[var1 + 4];
      float var7 = var0[var1 + 5];
      float var8 = var0[var1 + 6];
      float var9 = var0[var1 + 7];
      float var10 = var0[var1 + 8];
      float var11 = var0[var1 + 9];
      float var12 = var0[var1 + 10];
      float var13 = var0[var1 + 11];
      float var14 = var0[var1 + 12];
      float var15 = var0[var1 + 13];
      float var16 = var0[var1 + 14];
      float var17 = var0[var1 + 15];
      var0[var1 + 2] = var16;
      var0[var1 + 3] = var17;
      var0[var1 + 4] = var8;
      var0[var1 + 5] = var9;
      var0[var1 + 6] = var12;
      var0[var1 + 7] = var13;
      var0[var1 + 8] = var4;
      var0[var1 + 9] = var5;
      var0[var1 + 10] = var14;
      var0[var1 + 11] = var15;
      var0[var1 + 12] = var6;
      var0[var1 + 13] = var7;
      var0[var1 + 14] = var10;
      var0[var1 + 15] = var11;
   }

   public static void method25993(Class2378 var0, long var1) {
      float var5 = var0.method9651(var1 + 2L);
      float var6 = var0.method9651(var1 + 3L);
      float var7 = var0.method9651(var1 + 4L);
      float var8 = var0.method9651(var1 + 5L);
      float var9 = var0.method9651(var1 + 6L);
      float var10 = var0.method9651(var1 + 7L);
      float var11 = var0.method9651(var1 + 8L);
      float var12 = var0.method9651(var1 + 9L);
      float var13 = var0.method9651(var1 + 10L);
      float var14 = var0.method9651(var1 + 11L);
      float var15 = var0.method9651(var1 + 12L);
      float var16 = var0.method9651(var1 + 13L);
      float var17 = var0.method9651(var1 + 14L);
      float var18 = var0.method9651(var1 + 15L);
      var0.method9685(var1 + 2L, var17);
      var0.method9685(var1 + 3L, var18);
      var0.method9685(var1 + 4L, var9);
      var0.method9685(var1 + 5L, var10);
      var0.method9685(var1 + 6L, var13);
      var0.method9685(var1 + 7L, var14);
      var0.method9685(var1 + 8L, var5);
      var0.method9685(var1 + 9L, var6);
      var0.method9685(var1 + 10L, var15);
      var0.method9685(var1 + 11L, var16);
      var0.method9685(var1 + 12L, var7);
      var0.method9685(var1 + 13L, var8);
      var0.method9685(var1 + 14L, var11);
      var0.method9685(var1 + 15L, var12);
   }

   public static void method25994(int var0, float[] var1, int var2, float[] var3, int var4) {
      int var7 = var0 >> 3;
      int var8 = 2 * var7;
      int var10 = var8 + var8;
      int var11 = var10 + var8;
      int var12 = var2 + var8;
      int var13 = var2 + var10;
      int var14 = var2 + var11;
      float var15 = var1[var2] + var1[var13];
      float var16 = var1[var2 + 1] + var1[var13 + 1];
      float var17 = var1[var2] - var1[var13];
      float var18 = var1[var2 + 1] - var1[var13 + 1];
      float var19 = var1[var12] + var1[var14];
      float var20 = var1[var12 + 1] + var1[var14 + 1];
      float var21 = var1[var12] - var1[var14];
      float var22 = var1[var12 + 1] - var1[var14 + 1];
      var1[var2] = var15 + var19;
      var1[var2 + 1] = var16 + var20;
      var1[var12] = var15 - var19;
      var1[var12 + 1] = var16 - var20;
      var1[var13] = var17 - var22;
      var1[var13 + 1] = var18 + var21;
      var1[var14] = var17 + var22;
      var1[var14 + 1] = var18 - var21;
      float var23 = var3[var4 + 1];
      float var24 = var3[var4 + 2];
      float var25 = var3[var4 + 3];
      float var26 = 1.0F;
      float var27 = 0.0F;
      float var28 = 1.0F;
      float var29 = 0.0F;
      byte var30 = 0;

      for (int var31 = 2; var31 < var7 - 2; var31 += 4) {
         var30 += 4;
         int var38 = var4 + var30;
         float var32 = var24 * (var26 + var3[var38]);
         float var33 = var24 * (var27 + var3[var38 + 1]);
         float var34 = var25 * (var28 + var3[var38 + 2]);
         float var35 = var25 * (var29 + var3[var38 + 3]);
         var26 = var3[var38];
         var27 = var3[var38 + 1];
         var28 = var3[var38 + 2];
         var29 = var3[var38 + 3];
         int var9 = var31 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         int var39 = var2 + var31;
         var15 = var1[var39] + var1[var13];
         var16 = var1[var39 + 1] + var1[var13 + 1];
         var17 = var1[var39] - var1[var13];
         var18 = var1[var39 + 1] - var1[var13 + 1];
         float var40 = var1[var39 + 2] + var1[var13 + 2];
         float var41 = var1[var39 + 3] + var1[var13 + 3];
         float var42 = var1[var39 + 2] - var1[var13 + 2];
         float var43 = var1[var39 + 3] - var1[var13 + 3];
         var19 = var1[var12] + var1[var14];
         var20 = var1[var12 + 1] + var1[var14 + 1];
         var21 = var1[var12] - var1[var14];
         var22 = var1[var12 + 1] - var1[var14 + 1];
         float var44 = var1[var12 + 2] + var1[var14 + 2];
         float var45 = var1[var12 + 3] + var1[var14 + 3];
         float var46 = var1[var12 + 2] - var1[var14 + 2];
         float var47 = var1[var12 + 3] - var1[var14 + 3];
         var1[var39] = var15 + var19;
         var1[var39 + 1] = var16 + var20;
         var1[var39 + 2] = var40 + var44;
         var1[var39 + 3] = var41 + var45;
         var1[var12] = var15 - var19;
         var1[var12 + 1] = var16 - var20;
         var1[var12 + 2] = var40 - var44;
         var1[var12 + 3] = var41 - var45;
         var15 = var17 - var22;
         var16 = var18 + var21;
         var1[var13] = var32 * var15 - var33 * var16;
         var1[var13 + 1] = var32 * var16 + var33 * var15;
         var15 = var42 - var47;
         var16 = var43 + var46;
         var1[var13 + 2] = var26 * var15 - var27 * var16;
         var1[var13 + 3] = var26 * var16 + var27 * var15;
         var15 = var17 + var22;
         var16 = var18 - var21;
         var1[var14] = var34 * var15 + var35 * var16;
         var1[var14 + 1] = var34 * var16 - var35 * var15;
         var15 = var42 + var47;
         var16 = var43 - var46;
         var1[var14 + 2] = var28 * var15 + var29 * var16;
         var1[var14 + 3] = var28 * var16 - var29 * var15;
         int var36 = var8 - var31;
         var9 = var36 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         int var37 = var2 + var36;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         var15 = var1[var37] + var1[var13];
         var16 = var1[var37 + 1] + var1[var13 + 1];
         var17 = var1[var37] - var1[var13];
         var18 = var1[var37 + 1] - var1[var13 + 1];
         var40 = var1[var37 - 2] + var1[var13 - 2];
         var41 = var1[var37 - 1] + var1[var13 - 1];
         var42 = var1[var37 - 2] - var1[var13 - 2];
         var43 = var1[var37 - 1] - var1[var13 - 1];
         var19 = var1[var12] + var1[var14];
         var20 = var1[var12 + 1] + var1[var14 + 1];
         var21 = var1[var12] - var1[var14];
         var22 = var1[var12 + 1] - var1[var14 + 1];
         var44 = var1[var12 - 2] + var1[var14 - 2];
         var45 = var1[var12 - 1] + var1[var14 - 1];
         var46 = var1[var12 - 2] - var1[var14 - 2];
         var47 = var1[var12 - 1] - var1[var14 - 1];
         var1[var37] = var15 + var19;
         var1[var37 + 1] = var16 + var20;
         var1[var37 - 2] = var40 + var44;
         var1[var37 - 1] = var41 + var45;
         var1[var12] = var15 - var19;
         var1[var12 + 1] = var16 - var20;
         var1[var12 - 2] = var40 - var44;
         var1[var12 - 1] = var41 - var45;
         var15 = var17 - var22;
         var16 = var18 + var21;
         var1[var13] = var33 * var15 - var32 * var16;
         var1[var13 + 1] = var33 * var16 + var32 * var15;
         var15 = var42 - var47;
         var16 = var43 + var46;
         var1[var13 - 2] = var27 * var15 - var26 * var16;
         var1[var13 - 1] = var27 * var16 + var26 * var15;
         var15 = var17 + var22;
         var16 = var18 - var21;
         var1[var14] = var35 * var15 + var34 * var16;
         var1[var14 + 1] = var35 * var16 - var34 * var15;
         var15 = var42 + var47;
         var16 = var43 - var46;
         var1[var2 + var11 - 2] = var29 * var15 + var28 * var16;
         var1[var2 + var11 - 1] = var29 * var16 - var28 * var15;
      }

      float var133 = var24 * (var26 + var23);
      float var134 = var24 * (var27 + var23);
      float var135 = var25 * (var28 - var23);
      float var136 = var25 * (var29 - var23);
      int var49 = var7 + var8;
      var10 = var49 + var8;
      var11 = var10 + var8;
      int var137 = var2 + var7;
      var12 = var2 + var49;
      var13 = var2 + var10;
      var14 = var2 + var11;
      var15 = var1[var137 - 2] + var1[var13 - 2];
      var16 = var1[var137 - 1] + var1[var13 - 1];
      var17 = var1[var137 - 2] - var1[var13 - 2];
      var18 = var1[var137 - 1] - var1[var13 - 1];
      var19 = var1[var12 - 2] + var1[var14 - 2];
      var20 = var1[var12 - 1] + var1[var14 - 1];
      var21 = var1[var12 - 2] - var1[var14 - 2];
      var22 = var1[var12 - 1] - var1[var14 - 1];
      var1[var137 - 2] = var15 + var19;
      var1[var137 - 1] = var16 + var20;
      var1[var12 - 2] = var15 - var19;
      var1[var12 - 1] = var16 - var20;
      var15 = var17 - var22;
      var16 = var18 + var21;
      var1[var13 - 2] = var133 * var15 - var134 * var16;
      var1[var13 - 1] = var133 * var16 + var134 * var15;
      var15 = var17 + var22;
      var16 = var18 - var21;
      var1[var14 - 2] = var135 * var15 + var136 * var16;
      var1[var14 - 1] = var135 * var16 - var136 * var15;
      var15 = var1[var137] + var1[var13];
      var16 = var1[var137 + 1] + var1[var13 + 1];
      var17 = var1[var137] - var1[var13];
      var18 = var1[var137 + 1] - var1[var13 + 1];
      var19 = var1[var12] + var1[var14];
      var20 = var1[var12 + 1] + var1[var14 + 1];
      var21 = var1[var12] - var1[var14];
      var22 = var1[var12 + 1] - var1[var14 + 1];
      var1[var137] = var15 + var19;
      var1[var137 + 1] = var16 + var20;
      var1[var12] = var15 - var19;
      var1[var12 + 1] = var16 - var20;
      var15 = var17 - var22;
      var16 = var18 + var21;
      var1[var13] = var23 * (var15 - var16);
      var1[var13 + 1] = var23 * (var16 + var15);
      var15 = var17 + var22;
      var16 = var18 - var21;
      var1[var14] = -var23 * (var15 + var16);
      var1[var14 + 1] = -var23 * (var16 - var15);
      var15 = var1[var137 + 2] + var1[var13 + 2];
      var16 = var1[var137 + 3] + var1[var13 + 3];
      var17 = var1[var137 + 2] - var1[var13 + 2];
      var18 = var1[var137 + 3] - var1[var13 + 3];
      var19 = var1[var12 + 2] + var1[var14 + 2];
      var20 = var1[var12 + 3] + var1[var14 + 3];
      var21 = var1[var12 + 2] - var1[var14 + 2];
      var22 = var1[var12 + 3] - var1[var14 + 3];
      var1[var137 + 2] = var15 + var19;
      var1[var137 + 3] = var16 + var20;
      var1[var12 + 2] = var15 - var19;
      var1[var12 + 3] = var16 - var20;
      var15 = var17 - var22;
      var16 = var18 + var21;
      var1[var13 + 2] = var134 * var15 - var133 * var16;
      var1[var13 + 3] = var134 * var16 + var133 * var15;
      var15 = var17 + var22;
      var16 = var18 - var21;
      var1[var14 + 2] = var136 * var15 + var135 * var16;
      var1[var14 + 3] = var136 * var16 - var135 * var15;
   }

   public static void method25995(long var0, Class2378 var2, long var3, Class2378 var5, long var6) {
      long var10 = var0 >> 3;
      long var12 = 2L * var10;
      long var16 = var12 + var12;
      long var18 = var16 + var12;
      long var20 = var3 + var12;
      long var22 = var3 + var16;
      long var24 = var3 + var18;
      float var26 = var2.method9651(var3) + var2.method9651(var22);
      float var27 = var2.method9651(var3 + 1L) + var2.method9651(var22 + 1L);
      float var28 = var2.method9651(var3) - var2.method9651(var22);
      float var29 = var2.method9651(var3 + 1L) - var2.method9651(var22 + 1L);
      float var30 = var2.method9651(var20) + var2.method9651(var24);
      float var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
      float var32 = var2.method9651(var20) - var2.method9651(var24);
      float var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
      var2.method9685(var3, var26 + var30);
      var2.method9685(var3 + 1L, var27 + var31);
      var2.method9685(var20, var26 - var30);
      var2.method9685(var20 + 1L, var27 - var31);
      var2.method9685(var22, var28 - var33);
      var2.method9685(var22 + 1L, var29 + var32);
      var2.method9685(var24, var28 + var33);
      var2.method9685(var24 + 1L, var29 - var32);
      float var34 = var5.method9651(var6 + 1L);
      float var35 = var5.method9651(var6 + 2L);
      float var36 = var5.method9651(var6 + 3L);
      float var37 = 1.0F;
      float var38 = 0.0F;
      float var39 = 1.0F;
      float var40 = 0.0F;
      long var41 = 0L;

      for (int var43 = 2; (long)var43 < var10 - 2L; var43 += 4) {
         var41 += 4L;
         long var52 = var6 + var41;
         float var44 = var35 * (var37 + var5.method9651(var52));
         float var45 = var35 * (var38 + var5.method9651(var52 + 1L));
         float var46 = var36 * (var39 + var5.method9651(var52 + 2L));
         float var47 = var36 * (var40 + var5.method9651(var52 + 3L));
         var37 = var5.method9651(var52);
         var38 = var5.method9651(var52 + 1L);
         var39 = var5.method9651(var52 + 2L);
         var40 = var5.method9651(var52 + 3L);
         long var14 = (long)var43 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         long var54 = var3 + (long)var43;
         var26 = var2.method9651(var54) + var2.method9651(var22);
         var27 = var2.method9651(var54 + 1L) + var2.method9651(var22 + 1L);
         var28 = var2.method9651(var54) - var2.method9651(var22);
         var29 = var2.method9651(var54 + 1L) - var2.method9651(var22 + 1L);
         float var56 = var2.method9651(var54 + 2L) + var2.method9651(var22 + 2L);
         float var57 = var2.method9651(var54 + 3L) + var2.method9651(var22 + 3L);
         float var58 = var2.method9651(var54 + 2L) - var2.method9651(var22 + 2L);
         float var59 = var2.method9651(var54 + 3L) - var2.method9651(var22 + 3L);
         var30 = var2.method9651(var20) + var2.method9651(var24);
         var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
         var32 = var2.method9651(var20) - var2.method9651(var24);
         var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
         float var60 = var2.method9651(var20 + 2L) + var2.method9651(var24 + 2L);
         float var61 = var2.method9651(var20 + 3L) + var2.method9651(var24 + 3L);
         float var62 = var2.method9651(var20 + 2L) - var2.method9651(var24 + 2L);
         float var63 = var2.method9651(var20 + 3L) - var2.method9651(var24 + 3L);
         var2.method9685(var54, var26 + var30);
         var2.method9685(var54 + 1L, var27 + var31);
         var2.method9685(var54 + 2L, var56 + var60);
         var2.method9685(var54 + 3L, var57 + var61);
         var2.method9685(var20, var26 - var30);
         var2.method9685(var20 + 1L, var27 - var31);
         var2.method9685(var20 + 2L, var56 - var60);
         var2.method9685(var20 + 3L, var57 - var61);
         var26 = var28 - var33;
         var27 = var29 + var32;
         var2.method9685(var22, var44 * var26 - var45 * var27);
         var2.method9685(var22 + 1L, var44 * var27 + var45 * var26);
         var26 = var58 - var63;
         var27 = var59 + var62;
         var2.method9685(var22 + 2L, var37 * var26 - var38 * var27);
         var2.method9685(var22 + 3L, var37 * var27 + var38 * var26);
         var26 = var28 + var33;
         var27 = var29 - var32;
         var2.method9685(var24, var46 * var26 + var47 * var27);
         var2.method9685(var24 + 1L, var46 * var27 - var47 * var26);
         var26 = var58 + var63;
         var27 = var59 - var62;
         var2.method9685(var24 + 2L, var39 * var26 + var40 * var27);
         var2.method9685(var24 + 3L, var39 * var27 - var40 * var26);
         long var48 = var12 - (long)var43;
         var14 = var48 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         long var50 = var3 + var48;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         var26 = var2.method9651(var50) + var2.method9651(var22);
         var27 = var2.method9651(var50 + 1L) + var2.method9651(var22 + 1L);
         var28 = var2.method9651(var50) - var2.method9651(var22);
         var29 = var2.method9651(var50 + 1L) - var2.method9651(var22 + 1L);
         var56 = var2.method9651(var50 - 2L) + var2.method9651(var22 - 2L);
         var57 = var2.method9651(var50 - 1L) + var2.method9651(var22 - 1L);
         var58 = var2.method9651(var50 - 2L) - var2.method9651(var22 - 2L);
         var59 = var2.method9651(var50 - 1L) - var2.method9651(var22 - 1L);
         var30 = var2.method9651(var20) + var2.method9651(var24);
         var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
         var32 = var2.method9651(var20) - var2.method9651(var24);
         var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
         var60 = var2.method9651(var20 - 2L) + var2.method9651(var24 - 2L);
         var61 = var2.method9651(var20 - 1L) + var2.method9651(var24 - 1L);
         var62 = var2.method9651(var20 - 2L) - var2.method9651(var24 - 2L);
         var63 = var2.method9651(var20 - 1L) - var2.method9651(var24 - 1L);
         var2.method9685(var50, var26 + var30);
         var2.method9685(var50 + 1L, var27 + var31);
         var2.method9685(var50 - 2L, var56 + var60);
         var2.method9685(var50 - 1L, var57 + var61);
         var2.method9685(var20, var26 - var30);
         var2.method9685(var20 + 1L, var27 - var31);
         var2.method9685(var20 - 2L, var56 - var60);
         var2.method9685(var20 - 1L, var57 - var61);
         var26 = var28 - var33;
         var27 = var29 + var32;
         var2.method9685(var22, var45 * var26 - var44 * var27);
         var2.method9685(var22 + 1L, var45 * var27 + var44 * var26);
         var26 = var58 - var63;
         var27 = var59 + var62;
         var2.method9685(var22 - 2L, var38 * var26 - var37 * var27);
         var2.method9685(var22 - 1L, var38 * var27 + var37 * var26);
         var26 = var28 + var33;
         var27 = var29 - var32;
         var2.method9685(var24, var47 * var26 + var46 * var27);
         var2.method9685(var24 + 1L, var47 * var27 - var46 * var26);
         var26 = var58 + var63;
         var27 = var59 - var62;
         var2.method9685(var3 + var18 - 2L, var40 * var26 + var39 * var27);
         var2.method9685(var3 + var18 - 1L, var40 * var27 - var39 * var26);
      }

      float var149 = var35 * (var37 + var34);
      float var150 = var35 * (var38 + var34);
      float var151 = var36 * (var39 - var34);
      float var152 = var36 * (var40 - var34);
      long var65 = var10 + var12;
      var16 = var65 + var12;
      var18 = var16 + var12;
      long var153 = var3 + var10;
      var20 = var3 + var65;
      var22 = var3 + var16;
      var24 = var3 + var18;
      var26 = var2.method9651(var153 - 2L) + var2.method9651(var22 - 2L);
      var27 = var2.method9651(var153 - 1L) + var2.method9651(var22 - 1L);
      var28 = var2.method9651(var153 - 2L) - var2.method9651(var22 - 2L);
      var29 = var2.method9651(var153 - 1L) - var2.method9651(var22 - 1L);
      var30 = var2.method9651(var20 - 2L) + var2.method9651(var24 - 2L);
      var31 = var2.method9651(var20 - 1L) + var2.method9651(var24 - 1L);
      var32 = var2.method9651(var20 - 2L) - var2.method9651(var24 - 2L);
      var33 = var2.method9651(var20 - 1L) - var2.method9651(var24 - 1L);
      var2.method9685(var153 - 2L, var26 + var30);
      var2.method9685(var153 - 1L, var27 + var31);
      var2.method9685(var20 - 2L, var26 - var30);
      var2.method9685(var20 - 1L, var27 - var31);
      var26 = var28 - var33;
      var27 = var29 + var32;
      var2.method9685(var22 - 2L, var149 * var26 - var150 * var27);
      var2.method9685(var22 - 1L, var149 * var27 + var150 * var26);
      var26 = var28 + var33;
      var27 = var29 - var32;
      var2.method9685(var24 - 2L, var151 * var26 + var152 * var27);
      var2.method9685(var24 - 1L, var151 * var27 - var152 * var26);
      var26 = var2.method9651(var153) + var2.method9651(var22);
      var27 = var2.method9651(var153 + 1L) + var2.method9651(var22 + 1L);
      var28 = var2.method9651(var153) - var2.method9651(var22);
      var29 = var2.method9651(var153 + 1L) - var2.method9651(var22 + 1L);
      var30 = var2.method9651(var20) + var2.method9651(var24);
      var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
      var32 = var2.method9651(var20) - var2.method9651(var24);
      var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
      var2.method9685(var153, var26 + var30);
      var2.method9685(var153 + 1L, var27 + var31);
      var2.method9685(var20, var26 - var30);
      var2.method9685(var20 + 1L, var27 - var31);
      var26 = var28 - var33;
      var27 = var29 + var32;
      var2.method9685(var22, var34 * (var26 - var27));
      var2.method9685(var22 + 1L, var34 * (var27 + var26));
      var26 = var28 + var33;
      var27 = var29 - var32;
      var2.method9685(var24, -var34 * (var26 + var27));
      var2.method9685(var24 + 1L, -var34 * (var27 - var26));
      var26 = var2.method9651(var153 + 2L) + var2.method9651(var22 + 2L);
      var27 = var2.method9651(var153 + 3L) + var2.method9651(var22 + 3L);
      var28 = var2.method9651(var153 + 2L) - var2.method9651(var22 + 2L);
      var29 = var2.method9651(var153 + 3L) - var2.method9651(var22 + 3L);
      var30 = var2.method9651(var20 + 2L) + var2.method9651(var24 + 2L);
      var31 = var2.method9651(var20 + 3L) + var2.method9651(var24 + 3L);
      var32 = var2.method9651(var20 + 2L) - var2.method9651(var24 + 2L);
      var33 = var2.method9651(var20 + 3L) - var2.method9651(var24 + 3L);
      var2.method9685(var153 + 2L, var26 + var30);
      var2.method9685(var153 + 3L, var27 + var31);
      var2.method9685(var20 + 2L, var26 - var30);
      var2.method9685(var20 + 3L, var27 - var31);
      var26 = var28 - var33;
      var27 = var29 + var32;
      var2.method9685(var22 + 2L, var150 * var26 - var149 * var27);
      var2.method9685(var22 + 3L, var150 * var27 + var149 * var26);
      var26 = var28 + var33;
      var27 = var29 - var32;
      var2.method9685(var24 + 2L, var152 * var26 + var151 * var27);
      var2.method9685(var24 + 3L, var152 * var27 - var151 * var26);
   }

   public static void method25996(int var0, float[] var1, int var2, float[] var3, int var4) {
      int var7 = var0 >> 3;
      int var8 = 2 * var7;
      int var10 = var8 + var8;
      int var11 = var10 + var8;
      int var12 = var2 + var8;
      int var13 = var2 + var10;
      int var14 = var2 + var11;
      float var15 = var1[var2] + var1[var13];
      float var16 = -var1[var2 + 1] - var1[var13 + 1];
      float var17 = var1[var2] - var1[var13];
      float var18 = -var1[var2 + 1] + var1[var13 + 1];
      float var19 = var1[var12] + var1[var14];
      float var20 = var1[var12 + 1] + var1[var14 + 1];
      float var21 = var1[var12] - var1[var14];
      float var22 = var1[var12 + 1] - var1[var14 + 1];
      var1[var2] = var15 + var19;
      var1[var2 + 1] = var16 - var20;
      var1[var12] = var15 - var19;
      var1[var12 + 1] = var16 + var20;
      var1[var13] = var17 + var22;
      var1[var13 + 1] = var18 + var21;
      var1[var14] = var17 - var22;
      var1[var14 + 1] = var18 - var21;
      float var23 = var3[var4 + 1];
      float var24 = var3[var4 + 2];
      float var25 = var3[var4 + 3];
      float var26 = 1.0F;
      float var27 = 0.0F;
      float var28 = 1.0F;
      float var29 = 0.0F;
      byte var30 = 0;

      for (int var31 = 2; var31 < var7 - 2; var31 += 4) {
         var30 += 4;
         int var38 = var4 + var30;
         float var32 = var24 * (var26 + var3[var38]);
         float var33 = var24 * (var27 + var3[var38 + 1]);
         float var34 = var25 * (var28 + var3[var38 + 2]);
         float var35 = var25 * (var29 + var3[var38 + 3]);
         var26 = var3[var38];
         var27 = var3[var38 + 1];
         var28 = var3[var38 + 2];
         var29 = var3[var38 + 3];
         int var9 = var31 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         int var39 = var2 + var31;
         var15 = var1[var39] + var1[var13];
         var16 = -var1[var39 + 1] - var1[var13 + 1];
         var17 = var1[var39] - var1[var2 + var10];
         var18 = -var1[var39 + 1] + var1[var13 + 1];
         float var40 = var1[var39 + 2] + var1[var13 + 2];
         float var41 = -var1[var39 + 3] - var1[var13 + 3];
         float var42 = var1[var39 + 2] - var1[var13 + 2];
         float var43 = -var1[var39 + 3] + var1[var13 + 3];
         var19 = var1[var12] + var1[var14];
         var20 = var1[var12 + 1] + var1[var14 + 1];
         var21 = var1[var12] - var1[var14];
         var22 = var1[var12 + 1] - var1[var14 + 1];
         float var44 = var1[var12 + 2] + var1[var14 + 2];
         float var45 = var1[var12 + 3] + var1[var14 + 3];
         float var46 = var1[var12 + 2] - var1[var14 + 2];
         float var47 = var1[var12 + 3] - var1[var14 + 3];
         var1[var39] = var15 + var19;
         var1[var39 + 1] = var16 - var20;
         var1[var39 + 2] = var40 + var44;
         var1[var39 + 3] = var41 - var45;
         var1[var12] = var15 - var19;
         var1[var12 + 1] = var16 + var20;
         var1[var12 + 2] = var40 - var44;
         var1[var12 + 3] = var41 + var45;
         var15 = var17 + var22;
         var16 = var18 + var21;
         var1[var13] = var32 * var15 - var33 * var16;
         var1[var13 + 1] = var32 * var16 + var33 * var15;
         var15 = var42 + var47;
         var16 = var43 + var46;
         var1[var13 + 2] = var26 * var15 - var27 * var16;
         var1[var13 + 3] = var26 * var16 + var27 * var15;
         var15 = var17 - var22;
         var16 = var18 - var21;
         var1[var14] = var34 * var15 + var35 * var16;
         var1[var14 + 1] = var34 * var16 - var35 * var15;
         var15 = var42 - var47;
         var16 = var43 - var46;
         var1[var14 + 2] = var28 * var15 + var29 * var16;
         var1[var14 + 3] = var28 * var16 - var29 * var15;
         int var36 = var8 - var31;
         var9 = var36 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         int var37 = var2 + var36;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         var15 = var1[var37] + var1[var13];
         var16 = -var1[var37 + 1] - var1[var13 + 1];
         var17 = var1[var37] - var1[var13];
         var18 = -var1[var37 + 1] + var1[var13 + 1];
         var40 = var1[var37 - 2] + var1[var13 - 2];
         var41 = -var1[var37 - 1] - var1[var13 - 1];
         var42 = var1[var37 - 2] - var1[var13 - 2];
         var43 = -var1[var37 - 1] + var1[var13 - 1];
         var19 = var1[var12] + var1[var14];
         var20 = var1[var12 + 1] + var1[var14 + 1];
         var21 = var1[var12] - var1[var14];
         var22 = var1[var12 + 1] - var1[var14 + 1];
         var44 = var1[var12 - 2] + var1[var14 - 2];
         var45 = var1[var12 - 1] + var1[var14 - 1];
         var46 = var1[var12 - 2] - var1[var14 - 2];
         var47 = var1[var12 - 1] - var1[var14 - 1];
         var1[var37] = var15 + var19;
         var1[var37 + 1] = var16 - var20;
         var1[var37 - 2] = var40 + var44;
         var1[var37 - 1] = var41 - var45;
         var1[var12] = var15 - var19;
         var1[var12 + 1] = var16 + var20;
         var1[var12 - 2] = var40 - var44;
         var1[var12 - 1] = var41 + var45;
         var15 = var17 + var22;
         var16 = var18 + var21;
         var1[var13] = var33 * var15 - var32 * var16;
         var1[var13 + 1] = var33 * var16 + var32 * var15;
         var15 = var42 + var47;
         var16 = var43 + var46;
         var1[var13 - 2] = var27 * var15 - var26 * var16;
         var1[var13 - 1] = var27 * var16 + var26 * var15;
         var15 = var17 - var22;
         var16 = var18 - var21;
         var1[var14] = var35 * var15 + var34 * var16;
         var1[var14 + 1] = var35 * var16 - var34 * var15;
         var15 = var42 - var47;
         var16 = var43 - var46;
         var1[var14 - 2] = var29 * var15 + var28 * var16;
         var1[var14 - 1] = var29 * var16 - var28 * var15;
      }

      float var133 = var24 * (var26 + var23);
      float var134 = var24 * (var27 + var23);
      float var135 = var25 * (var28 - var23);
      float var136 = var25 * (var29 - var23);
      int var49 = var7 + var8;
      var10 = var49 + var8;
      var11 = var10 + var8;
      int var137 = var2 + var7;
      var12 = var2 + var49;
      var13 = var2 + var10;
      var14 = var2 + var11;
      var15 = var1[var137 - 2] + var1[var13 - 2];
      var16 = -var1[var137 - 1] - var1[var13 - 1];
      var17 = var1[var137 - 2] - var1[var13 - 2];
      var18 = -var1[var137 - 1] + var1[var13 - 1];
      var19 = var1[var12 - 2] + var1[var14 - 2];
      var20 = var1[var12 - 1] + var1[var14 - 1];
      var21 = var1[var12 - 2] - var1[var14 - 2];
      var22 = var1[var12 - 1] - var1[var14 - 1];
      var1[var137 - 2] = var15 + var19;
      var1[var137 - 1] = var16 - var20;
      var1[var12 - 2] = var15 - var19;
      var1[var12 - 1] = var16 + var20;
      var15 = var17 + var22;
      var16 = var18 + var21;
      var1[var13 - 2] = var133 * var15 - var134 * var16;
      var1[var13 - 1] = var133 * var16 + var134 * var15;
      var15 = var17 - var22;
      var16 = var18 - var21;
      var1[var14 - 2] = var135 * var15 + var136 * var16;
      var1[var14 - 1] = var135 * var16 - var136 * var15;
      var15 = var1[var137] + var1[var13];
      var16 = -var1[var137 + 1] - var1[var13 + 1];
      var17 = var1[var137] - var1[var13];
      var18 = -var1[var137 + 1] + var1[var13 + 1];
      var19 = var1[var12] + var1[var14];
      var20 = var1[var12 + 1] + var1[var14 + 1];
      var21 = var1[var12] - var1[var14];
      var22 = var1[var12 + 1] - var1[var14 + 1];
      var1[var137] = var15 + var19;
      var1[var137 + 1] = var16 - var20;
      var1[var12] = var15 - var19;
      var1[var12 + 1] = var16 + var20;
      var15 = var17 + var22;
      var16 = var18 + var21;
      var1[var13] = var23 * (var15 - var16);
      var1[var13 + 1] = var23 * (var16 + var15);
      var15 = var17 - var22;
      var16 = var18 - var21;
      var1[var14] = -var23 * (var15 + var16);
      var1[var14 + 1] = -var23 * (var16 - var15);
      var15 = var1[var137 + 2] + var1[var13 + 2];
      var16 = -var1[var137 + 3] - var1[var13 + 3];
      var17 = var1[var137 + 2] - var1[var13 + 2];
      var18 = -var1[var137 + 3] + var1[var13 + 3];
      var19 = var1[var12 + 2] + var1[var14 + 2];
      var20 = var1[var12 + 3] + var1[var14 + 3];
      var21 = var1[var12 + 2] - var1[var14 + 2];
      var22 = var1[var12 + 3] - var1[var14 + 3];
      var1[var137 + 2] = var15 + var19;
      var1[var137 + 3] = var16 - var20;
      var1[var12 + 2] = var15 - var19;
      var1[var12 + 3] = var16 + var20;
      var15 = var17 + var22;
      var16 = var18 + var21;
      var1[var13 + 2] = var134 * var15 - var133 * var16;
      var1[var13 + 3] = var134 * var16 + var133 * var15;
      var15 = var17 - var22;
      var16 = var18 - var21;
      var1[var14 + 2] = var136 * var15 + var135 * var16;
      var1[var14 + 3] = var136 * var16 - var135 * var15;
   }

   public static void method25997(long var0, Class2378 var2, long var3, Class2378 var5, long var6) {
      long var10 = var0 >> 3;
      long var12 = 2L * var10;
      long var16 = var12 + var12;
      long var18 = var16 + var12;
      long var20 = var3 + var12;
      long var22 = var3 + var16;
      long var24 = var3 + var18;
      float var26 = var2.method9651(var3) + var2.method9651(var22);
      float var27 = -var2.method9651(var3 + 1L) - var2.method9651(var22 + 1L);
      float var28 = var2.method9651(var3) - var2.method9651(var22);
      float var29 = -var2.method9651(var3 + 1L) + var2.method9651(var22 + 1L);
      float var30 = var2.method9651(var20) + var2.method9651(var24);
      float var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
      float var32 = var2.method9651(var20) - var2.method9651(var24);
      float var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
      var2.method9685(var3, var26 + var30);
      var2.method9685(var3 + 1L, var27 - var31);
      var2.method9685(var20, var26 - var30);
      var2.method9685(var20 + 1L, var27 + var31);
      var2.method9685(var22, var28 + var33);
      var2.method9685(var22 + 1L, var29 + var32);
      var2.method9685(var24, var28 - var33);
      var2.method9685(var24 + 1L, var29 - var32);
      float var34 = var5.method9651(var6 + 1L);
      float var35 = var5.method9651(var6 + 2L);
      float var36 = var5.method9651(var6 + 3L);
      float var37 = 1.0F;
      float var38 = 0.0F;
      float var39 = 1.0F;
      float var40 = 0.0F;
      long var41 = 0L;

      for (long var43 = 2L; var43 < var10 - 2L; var43 += 4L) {
         var41 += 4L;
         long var53 = var6 + var41;
         float var45 = var35 * (var37 + var5.method9651(var53));
         float var46 = var35 * (var38 + var5.method9651(var53 + 1L));
         float var47 = var36 * (var39 + var5.method9651(var53 + 2L));
         float var48 = var36 * (var40 + var5.method9651(var53 + 3L));
         var37 = var5.method9651(var53);
         var38 = var5.method9651(var53 + 1L);
         var39 = var5.method9651(var53 + 2L);
         var40 = var5.method9651(var53 + 3L);
         long var14 = var43 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         long var55 = var3 + var43;
         var26 = var2.method9651(var55) + var2.method9651(var22);
         var27 = -var2.method9651(var55 + 1L) - var2.method9651(var22 + 1L);
         var28 = var2.method9651(var55) - var2.method9651(var3 + var16);
         var29 = -var2.method9651(var55 + 1L) + var2.method9651(var22 + 1L);
         float var57 = var2.method9651(var55 + 2L) + var2.method9651(var22 + 2L);
         float var58 = -var2.method9651(var55 + 3L) - var2.method9651(var22 + 3L);
         float var59 = var2.method9651(var55 + 2L) - var2.method9651(var22 + 2L);
         float var60 = -var2.method9651(var55 + 3L) + var2.method9651(var22 + 3L);
         var30 = var2.method9651(var20) + var2.method9651(var24);
         var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
         var32 = var2.method9651(var20) - var2.method9651(var24);
         var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
         float var61 = var2.method9651(var20 + 2L) + var2.method9651(var24 + 2L);
         float var62 = var2.method9651(var20 + 3L) + var2.method9651(var24 + 3L);
         float var63 = var2.method9651(var20 + 2L) - var2.method9651(var24 + 2L);
         float var64 = var2.method9651(var20 + 3L) - var2.method9651(var24 + 3L);
         var2.method9685(var55, var26 + var30);
         var2.method9685(var55 + 1L, var27 - var31);
         var2.method9685(var55 + 2L, var57 + var61);
         var2.method9685(var55 + 3L, var58 - var62);
         var2.method9685(var20, var26 - var30);
         var2.method9685(var20 + 1L, var27 + var31);
         var2.method9685(var20 + 2L, var57 - var61);
         var2.method9685(var20 + 3L, var58 + var62);
         var26 = var28 + var33;
         var27 = var29 + var32;
         var2.method9685(var22, var45 * var26 - var46 * var27);
         var2.method9685(var22 + 1L, var45 * var27 + var46 * var26);
         var26 = var59 + var64;
         var27 = var60 + var63;
         var2.method9685(var22 + 2L, var37 * var26 - var38 * var27);
         var2.method9685(var22 + 3L, var37 * var27 + var38 * var26);
         var26 = var28 - var33;
         var27 = var29 - var32;
         var2.method9685(var24, var47 * var26 + var48 * var27);
         var2.method9685(var24 + 1L, var47 * var27 - var48 * var26);
         var26 = var59 - var64;
         var27 = var60 - var63;
         var2.method9685(var24 + 2L, var39 * var26 + var40 * var27);
         var2.method9685(var24 + 3L, var39 * var27 - var40 * var26);
         long var49 = var12 - var43;
         var14 = var49 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         long var51 = var3 + var49;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         var26 = var2.method9651(var51) + var2.method9651(var22);
         var27 = -var2.method9651(var51 + 1L) - var2.method9651(var22 + 1L);
         var28 = var2.method9651(var51) - var2.method9651(var22);
         var29 = -var2.method9651(var51 + 1L) + var2.method9651(var22 + 1L);
         var57 = var2.method9651(var51 - 2L) + var2.method9651(var22 - 2L);
         var58 = -var2.method9651(var51 - 1L) - var2.method9651(var22 - 1L);
         var59 = var2.method9651(var51 - 2L) - var2.method9651(var22 - 2L);
         var60 = -var2.method9651(var51 - 1L) + var2.method9651(var22 - 1L);
         var30 = var2.method9651(var20) + var2.method9651(var24);
         var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
         var32 = var2.method9651(var20) - var2.method9651(var24);
         var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
         var61 = var2.method9651(var20 - 2L) + var2.method9651(var24 - 2L);
         var62 = var2.method9651(var20 - 1L) + var2.method9651(var24 - 1L);
         var63 = var2.method9651(var20 - 2L) - var2.method9651(var24 - 2L);
         var64 = var2.method9651(var20 - 1L) - var2.method9651(var24 - 1L);
         var2.method9685(var51, var26 + var30);
         var2.method9685(var51 + 1L, var27 - var31);
         var2.method9685(var51 - 2L, var57 + var61);
         var2.method9685(var51 - 1L, var58 - var62);
         var2.method9685(var20, var26 - var30);
         var2.method9685(var20 + 1L, var27 + var31);
         var2.method9685(var20 - 2L, var57 - var61);
         var2.method9685(var20 - 1L, var58 + var62);
         var26 = var28 + var33;
         var27 = var29 + var32;
         var2.method9685(var22, var46 * var26 - var45 * var27);
         var2.method9685(var22 + 1L, var46 * var27 + var45 * var26);
         var26 = var59 + var64;
         var27 = var60 + var63;
         var2.method9685(var22 - 2L, var38 * var26 - var37 * var27);
         var2.method9685(var22 - 1L, var38 * var27 + var37 * var26);
         var26 = var28 - var33;
         var27 = var29 - var32;
         var2.method9685(var24, var48 * var26 + var47 * var27);
         var2.method9685(var24 + 1L, var48 * var27 - var47 * var26);
         var26 = var59 - var64;
         var27 = var60 - var63;
         var2.method9685(var24 - 2L, var40 * var26 + var39 * var27);
         var2.method9685(var24 - 1L, var40 * var27 - var39 * var26);
      }

      float var150 = var35 * (var37 + var34);
      float var151 = var35 * (var38 + var34);
      float var152 = var36 * (var39 - var34);
      float var153 = var36 * (var40 - var34);
      long var66 = var10 + var12;
      var16 = var66 + var12;
      var18 = var16 + var12;
      long var154 = var3 + var10;
      var20 = var3 + var66;
      var22 = var3 + var16;
      var24 = var3 + var18;
      var26 = var2.method9651(var154 - 2L) + var2.method9651(var22 - 2L);
      var27 = -var2.method9651(var154 - 1L) - var2.method9651(var22 - 1L);
      var28 = var2.method9651(var154 - 2L) - var2.method9651(var22 - 2L);
      var29 = -var2.method9651(var154 - 1L) + var2.method9651(var22 - 1L);
      var30 = var2.method9651(var20 - 2L) + var2.method9651(var24 - 2L);
      var31 = var2.method9651(var20 - 1L) + var2.method9651(var24 - 1L);
      var32 = var2.method9651(var20 - 2L) - var2.method9651(var24 - 2L);
      var33 = var2.method9651(var20 - 1L) - var2.method9651(var24 - 1L);
      var2.method9685(var154 - 2L, var26 + var30);
      var2.method9685(var154 - 1L, var27 - var31);
      var2.method9685(var20 - 2L, var26 - var30);
      var2.method9685(var20 - 1L, var27 + var31);
      var26 = var28 + var33;
      var27 = var29 + var32;
      var2.method9685(var22 - 2L, var150 * var26 - var151 * var27);
      var2.method9685(var22 - 1L, var150 * var27 + var151 * var26);
      var26 = var28 - var33;
      var27 = var29 - var32;
      var2.method9685(var24 - 2L, var152 * var26 + var153 * var27);
      var2.method9685(var24 - 1L, var152 * var27 - var153 * var26);
      var26 = var2.method9651(var154) + var2.method9651(var22);
      var27 = -var2.method9651(var154 + 1L) - var2.method9651(var22 + 1L);
      var28 = var2.method9651(var154) - var2.method9651(var22);
      var29 = -var2.method9651(var154 + 1L) + var2.method9651(var22 + 1L);
      var30 = var2.method9651(var20) + var2.method9651(var24);
      var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
      var32 = var2.method9651(var20) - var2.method9651(var24);
      var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
      var2.method9685(var154, var26 + var30);
      var2.method9685(var154 + 1L, var27 - var31);
      var2.method9685(var20, var26 - var30);
      var2.method9685(var20 + 1L, var27 + var31);
      var26 = var28 + var33;
      var27 = var29 + var32;
      var2.method9685(var22, var34 * (var26 - var27));
      var2.method9685(var22 + 1L, var34 * (var27 + var26));
      var26 = var28 - var33;
      var27 = var29 - var32;
      var2.method9685(var24, -var34 * (var26 + var27));
      var2.method9685(var24 + 1L, -var34 * (var27 - var26));
      var26 = var2.method9651(var154 + 2L) + var2.method9651(var22 + 2L);
      var27 = -var2.method9651(var154 + 3L) - var2.method9651(var22 + 3L);
      var28 = var2.method9651(var154 + 2L) - var2.method9651(var22 + 2L);
      var29 = -var2.method9651(var154 + 3L) + var2.method9651(var22 + 3L);
      var30 = var2.method9651(var20 + 2L) + var2.method9651(var24 + 2L);
      var31 = var2.method9651(var20 + 3L) + var2.method9651(var24 + 3L);
      var32 = var2.method9651(var20 + 2L) - var2.method9651(var24 + 2L);
      var33 = var2.method9651(var20 + 3L) - var2.method9651(var24 + 3L);
      var2.method9685(var154 + 2L, var26 + var30);
      var2.method9685(var154 + 3L, var27 - var31);
      var2.method9685(var20 + 2L, var26 - var30);
      var2.method9685(var20 + 3L, var27 + var31);
      var26 = var28 + var33;
      var27 = var29 + var32;
      var2.method9685(var22 + 2L, var151 * var26 - var150 * var27);
      var2.method9685(var22 + 3L, var151 * var27 + var150 * var26);
      var26 = var28 - var33;
      var27 = var29 - var32;
      var2.method9685(var24 + 2L, var153 * var26 + var152 * var27);
      var2.method9685(var24 + 3L, var153 * var27 - var152 * var26);
   }

   public static void method25998(int var0, float[] var1, int var2, int var3, float[] var4) {
      int var7 = 0;
      byte var8 = 2;
      byte var9 = 0;
      int var10 = var0 >> 1;
      if ((long)var0 >= method25892()) {
         var8 = 4;
         var9 = 1;
         var10 >>= 1;
      }

      Future[] var11 = new Future[var8];
      int var12 = var10;

      for (int var13 = 0; var13 < var8; var13++) {
         int var14 = var2 + var13 * var10;
         if (var13 != var9) {
            var11[var7++] = Class7008.method21729(new Class735(var14, var12, var0, var1, var4, var3));
         } else {
            var11[var7++] = Class7008.method21729(new Class599(var14, var12, var0, var1, var4, var3));
         }
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   public static void method25999(long var0, Class2378 var2, long var3, long var5, Class2378 var7) {
      int var10 = 0;
      byte var11 = 2;
      byte var12 = 0;
      long var13 = var0 >> 1;
      if (var0 >= method25892()) {
         var11 = 4;
         var12 = 1;
         var13 >>= 1;
      }

      Future[] var15 = new Future[var11];
      long var16 = var13;

      for (int var18 = 0; var18 < var11; var18++) {
         long var19 = var3 + (long)var18 * var13;
         if (var18 != var12) {
            var15[var10++] = Class7008.method21729(new Class1421(var19, var16, var0, var2, var7, var5));
         } else {
            var15[var10++] = Class7008.method21729(new Class483(var19, var16, var0, var2, var7, var5));
         }
      }

      try {
         Class7008.method21730(var15);
      } catch (InterruptedException var22) {
         Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var22);
      } catch (ExecutionException var23) {
         Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var23);
      }
   }

   public static void method26000(int var0, float[] var1, int var2, int var3, float[] var4) {
      int var7 = var0;
      int var8 = var2 + var0;

      while (var7 > 512) {
         var7 >>= 2;
         method26006(var7, var1, var8 - var7, var4, var3 - (var7 >> 1));
      }

      method26004(var7, 1, var1, var8 - var7, var3, var4);
      int var9 = 0;
      int var10 = var2 - var7;

      for (int var11 = var0 - var7; var11 > 0; var11 -= var7) {
         int var12 = method26002(var7, var11, ++var9, var1, var2, var3, var4);
         method26004(var7, var12, var1, var10 + var11, var3, var4);
      }
   }

   public static void method26001(long var0, Class2378 var2, long var3, long var5, Class2378 var7) {
      long var10 = var0;
      long var12 = var3 + var0;

      while (var10 > 512L) {
         var10 >>= 2;
         method26007(var10, var2, var12 - var10, var7, var5 - (var10 >> 1));
      }

      method26005(var10, 1L, var2, var12 - var10, var5, var7);
      long var14 = 0L;
      long var16 = var3 - var10;

      for (long var18 = var0 - var10; var18 > 0L; var18 -= var10) {
         long var20 = method26003(var10, var18, ++var14, var2, var3, var5, var7);
         method26005(var10, var20, var2, var16 + var18, var5, var7);
      }
   }

   public static int method26002(int var0, int var1, int var2, float[] var3, int var4, int var5, float[] var6) {
      int var7 = 1444818882;
      int var9 = var4 - var0;
      int var10 = var0;

      int var11;
      for (var11 = var2; (var11 & 3) == 0; var11 >>= 2) {
         var10 <<= 2;
      }

      int var12 = var11 & 1;
      int var13 = var4 + var1;
      if (var12 == 0) {
         while (var10 > 128) {
            method26008(var10, var3, var13 - var10, var6, var5 - var10);
            var10 >>= 2;
         }
      } else {
         while (var10 > 128) {
            method26006(var10, var3, var13 - var10, var6, var5 - (var10 >> 1));
            var10 >>= 2;
         }
      }

      while ((var7 & 65536) != 0) {
         if ((var7 & 8) == 0) {
            method26008(var0, var3, var9 + var1, var6, var5 - var0);
         }
      }

      return var12;
   }

   public static long method26003(long var0, long var2, long var4, Class2378 var6, long var7, long var9, Class2378 var11) {
      long var14 = var7 - var0;
      long var20;
      if ((var4 & 3L) == 0L) {
         long var16 = var0;

         long var18;
         for (var18 = var4; (var18 & 3L) == 0L; var18 >>= 2) {
            var16 <<= 2;
         }

         var20 = var18 & 1L;
         long var22 = var7 + var2;
         if (var20 == 0L) {
            while (var16 > 128L) {
               method26009(var16, var6, var22 - var16, var11, var9 - var16);
               var16 >>= 2;
            }
         } else {
            while (var16 > 128L) {
               method26007(var16, var6, var22 - var16, var11, var9 - (var16 >> 1));
               var16 >>= 2;
            }
         }
      } else {
         var20 = var4 & 1L;
         if (var20 == 0L) {
            method26009(var0, var6, var14 + var2, var11, var9 - var0);
         } else {
            method26007(var0, var6, var14 + var2, var11, var9 - (var0 >> 1));
         }
      }

      return var20;
   }

   public static void method26004(int var0, int var1, float[] var2, int var3, int var4, float[] var5) {
      if (var0 != 512) {
         method26006(64, var2, var3, var5, var4 - 32);
         method26016(var2, var3, var5, var4 - 8);
         method26018(var2, var3 + 16, var5, var4 - 8);
         method26016(var2, var3 + 32, var5, var4 - 8);
         method26016(var2, var3 + 48, var5, var4 - 8);
         method26008(64, var2, var3 + 64, var5, var4 - 64);
         method26016(var2, var3 + 64, var5, var4 - 8);
         method26018(var2, var3 + 80, var5, var4 - 8);
         method26016(var2, var3 + 96, var5, var4 - 8);
         method26018(var2, var3 + 112, var5, var4 - 8);
         method26006(64, var2, var3 + 128, var5, var4 - 32);
         method26016(var2, var3 + 128, var5, var4 - 8);
         method26018(var2, var3 + 144, var5, var4 - 8);
         method26016(var2, var3 + 160, var5, var4 - 8);
         method26016(var2, var3 + 176, var5, var4 - 8);
         if (var1 == 0) {
            method26008(64, var2, var3 + 192, var5, var4 - 64);
            method26018(var2, var3 + 240, var5, var4 - 8);
         } else {
            method26006(64, var2, var3 + 192, var5, var4 - 32);
            method26016(var2, var3 + 240, var5, var4 - 8);
         }

         method26016(var2, var3 + 192, var5, var4 - 8);
         method26018(var2, var3 + 208, var5, var4 - 8);
         method26016(var2, var3 + 224, var5, var4 - 8);
      } else {
         method26006(128, var2, var3, var5, var4 - 64);
         method26012(var2, var3, var5, var4 - 8);
         method26014(var2, var3 + 32, var5, var4 - 32);
         method26012(var2, var3 + 64, var5, var4 - 8);
         method26012(var2, var3 + 96, var5, var4 - 8);
         method26008(128, var2, var3 + 128, var5, var4 - 128);
         method26012(var2, var3 + 128, var5, var4 - 8);
         method26014(var2, var3 + 160, var5, var4 - 32);
         method26012(var2, var3 + 192, var5, var4 - 8);
         method26014(var2, var3 + 224, var5, var4 - 32);
         method26006(128, var2, var3 + 256, var5, var4 - 64);
         method26012(var2, var3 + 256, var5, var4 - 8);
         method26014(var2, var3 + 288, var5, var4 - 32);
         method26012(var2, var3 + 320, var5, var4 - 8);
         method26012(var2, var3 + 352, var5, var4 - 8);
         if (var1 == 0) {
            method26008(128, var2, var3 + 384, var5, var4 - 128);
            method26014(var2, var3 + 480, var5, var4 - 32);
         } else {
            method26006(128, var2, var3 + 384, var5, var4 - 64);
            method26012(var2, var3 + 480, var5, var4 - 8);
         }

         method26012(var2, var3 + 384, var5, var4 - 8);
         method26014(var2, var3 + 416, var5, var4 - 32);
         method26012(var2, var3 + 448, var5, var4 - 8);
      }
   }

   public static void method26005(long var0, long var2, Class2378 var4, long var5, long var7, Class2378 var9) {
      if (var0 != 512L) {
         method26007(64L, var4, var5, var9, var7 - 32L);
         method26017(var4, var5, var9, var7 - 8L);
         method26019(var4, var5 + 16L, var9, var7 - 8L);
         method26017(var4, var5 + 32L, var9, var7 - 8L);
         method26017(var4, var5 + 48L, var9, var7 - 8L);
         method26009(64L, var4, var5 + 64L, var9, var7 - 64L);
         method26017(var4, var5 + 64L, var9, var7 - 8L);
         method26019(var4, var5 + 80L, var9, var7 - 8L);
         method26017(var4, var5 + 96L, var9, var7 - 8L);
         method26019(var4, var5 + 112L, var9, var7 - 8L);
         method26007(64L, var4, var5 + 128L, var9, var7 - 32L);
         method26017(var4, var5 + 128L, var9, var7 - 8L);
         method26019(var4, var5 + 144L, var9, var7 - 8L);
         method26017(var4, var5 + 160L, var9, var7 - 8L);
         method26017(var4, var5 + 176L, var9, var7 - 8L);
         if (var2 == 0L) {
            method26009(64L, var4, var5 + 192L, var9, var7 - 64L);
            method26019(var4, var5 + 240L, var9, var7 - 8L);
         } else {
            method26007(64L, var4, var5 + 192L, var9, var7 - 32L);
            method26017(var4, var5 + 240L, var9, var7 - 8L);
         }

         method26017(var4, var5 + 192L, var9, var7 - 8L);
         method26019(var4, var5 + 208L, var9, var7 - 8L);
         method26017(var4, var5 + 224L, var9, var7 - 8L);
      } else {
         method26007(128L, var4, var5, var9, var7 - 64L);
         method26013(var4, var5, var9, var7 - 8L);
         method26015(var4, var5 + 32L, var9, var7 - 32L);
         method26013(var4, var5 + 64L, var9, var7 - 8L);
         method26013(var4, var5 + 96L, var9, var7 - 8L);
         method26009(128L, var4, var5 + 128L, var9, var7 - 128L);
         method26013(var4, var5 + 128L, var9, var7 - 8L);
         method26015(var4, var5 + 160L, var9, var7 - 32L);
         method26013(var4, var5 + 192L, var9, var7 - 8L);
         method26015(var4, var5 + 224L, var9, var7 - 32L);
         method26007(128L, var4, var5 + 256L, var9, var7 - 64L);
         method26013(var4, var5 + 256L, var9, var7 - 8L);
         method26015(var4, var5 + 288L, var9, var7 - 32L);
         method26013(var4, var5 + 320L, var9, var7 - 8L);
         method26013(var4, var5 + 352L, var9, var7 - 8L);
         if (var2 == 0L) {
            method26009(128L, var4, var5 + 384L, var9, var7 - 128L);
            method26015(var4, var5 + 480L, var9, var7 - 32L);
         } else {
            method26007(128L, var4, var5 + 384L, var9, var7 - 64L);
            method26013(var4, var5 + 480L, var9, var7 - 8L);
         }

         method26013(var4, var5 + 384L, var9, var7 - 8L);
         method26015(var4, var5 + 416L, var9, var7 - 32L);
         method26013(var4, var5 + 448L, var9, var7 - 8L);
      }
   }

   public static void method26006(int var0, float[] var1, int var2, float[] var3, int var4) {
      int var7 = var0 >> 3;
      int var8 = 2 * var7;
      int var10 = var8 + var8;
      int var11 = var10 + var8;
      int var12 = var2 + var8;
      int var13 = var2 + var10;
      int var14 = var2 + var11;
      float var15 = var1[var2] + var1[var13];
      float var16 = var1[var2 + 1] + var1[var13 + 1];
      float var17 = var1[var2] - var1[var13];
      float var18 = var1[var2 + 1] - var1[var13 + 1];
      float var19 = var1[var12] + var1[var14];
      float var20 = var1[var12 + 1] + var1[var14 + 1];
      float var21 = var1[var12] - var1[var14];
      float var22 = var1[var12 + 1] - var1[var14 + 1];
      var1[var2] = var15 + var19;
      var1[var2 + 1] = var16 + var20;
      var1[var12] = var15 - var19;
      var1[var12 + 1] = var16 - var20;
      var1[var13] = var17 - var22;
      var1[var13 + 1] = var18 + var21;
      var1[var14] = var17 + var22;
      var1[var14 + 1] = var18 - var21;
      float var23 = var3[var4 + 1];
      byte var24 = 0;

      for (int var25 = 2; var25 < var7; var25 += 2) {
         var24 += 4;
         int var28 = var4 + var24;
         float var29 = var3[var28];
         float var30 = var3[var28 + 1];
         float var31 = var3[var28 + 2];
         float var32 = var3[var28 + 3];
         int var9 = var25 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         int var33 = var2 + var25;
         var15 = var1[var33] + var1[var13];
         var16 = var1[var33 + 1] + var1[var13 + 1];
         var17 = var1[var33] - var1[var13];
         var18 = var1[var33 + 1] - var1[var13 + 1];
         var19 = var1[var12] + var1[var14];
         var20 = var1[var12 + 1] + var1[var14 + 1];
         var21 = var1[var12] - var1[var14];
         var22 = var1[var12 + 1] - var1[var14 + 1];
         var1[var33] = var15 + var19;
         var1[var33 + 1] = var16 + var20;
         var1[var12] = var15 - var19;
         var1[var12 + 1] = var16 - var20;
         var15 = var17 - var22;
         var16 = var18 + var21;
         var1[var13] = var29 * var15 - var30 * var16;
         var1[var13 + 1] = var29 * var16 + var30 * var15;
         var15 = var17 + var22;
         var16 = var18 - var21;
         var1[var14] = var31 * var15 + var32 * var16;
         var1[var14 + 1] = var31 * var16 - var32 * var15;
         int var26 = var8 - var25;
         var9 = var26 + var8;
         var10 = var9 + var8;
         var11 = var10 + var8;
         int var27 = var2 + var26;
         var12 = var2 + var9;
         var13 = var2 + var10;
         var14 = var2 + var11;
         var15 = var1[var27] + var1[var13];
         var16 = var1[var27 + 1] + var1[var13 + 1];
         var17 = var1[var27] - var1[var13];
         var18 = var1[var27 + 1] - var1[var13 + 1];
         var19 = var1[var12] + var1[var14];
         var20 = var1[var12 + 1] + var1[var14 + 1];
         var21 = var1[var12] - var1[var14];
         var22 = var1[var12 + 1] - var1[var14 + 1];
         var1[var27] = var15 + var19;
         var1[var27 + 1] = var16 + var20;
         var1[var12] = var15 - var19;
         var1[var12 + 1] = var16 - var20;
         var15 = var17 - var22;
         var16 = var18 + var21;
         var1[var13] = var30 * var15 - var29 * var16;
         var1[var13 + 1] = var30 * var16 + var29 * var15;
         var15 = var17 + var22;
         var16 = var18 - var21;
         var1[var14] = var32 * var15 + var31 * var16;
         var1[var14 + 1] = var32 * var16 - var31 * var15;
      }

      int var35 = var7 + var8;
      var10 = var35 + var8;
      var11 = var10 + var8;
      int var87 = var2 + var7;
      var12 = var2 + var35;
      var13 = var2 + var10;
      var14 = var2 + var11;
      var15 = var1[var87] + var1[var13];
      var16 = var1[var87 + 1] + var1[var13 + 1];
      var17 = var1[var87] - var1[var13];
      var18 = var1[var87 + 1] - var1[var13 + 1];
      var19 = var1[var12] + var1[var14];
      var20 = var1[var12 + 1] + var1[var14 + 1];
      var21 = var1[var12] - var1[var14];
      var22 = var1[var12 + 1] - var1[var14 + 1];
      var1[var87] = var15 + var19;
      var1[var87 + 1] = var16 + var20;
      var1[var12] = var15 - var19;
      var1[var12 + 1] = var16 - var20;
      var15 = var17 - var22;
      var16 = var18 + var21;
      var1[var13] = var23 * (var15 - var16);
      var1[var13 + 1] = var23 * (var16 + var15);
      var15 = var17 + var22;
      var16 = var18 - var21;
      var1[var14] = -var23 * (var15 + var16);
      var1[var14 + 1] = -var23 * (var16 - var15);
   }

   public static void method26007(long var0, Class2378 var2, long var3, Class2378 var5, long var6) {
      long var10 = var0 >> 3;
      long var12 = 2L * var10;
      long var16 = var12 + var12;
      long var18 = var16 + var12;
      long var20 = var3 + var12;
      long var22 = var3 + var16;
      long var24 = var3 + var18;
      float var26 = var2.method9651(var3) + var2.method9651(var22);
      float var27 = var2.method9651(var3 + 1L) + var2.method9651(var22 + 1L);
      float var28 = var2.method9651(var3) - var2.method9651(var22);
      float var29 = var2.method9651(var3 + 1L) - var2.method9651(var22 + 1L);
      float var30 = var2.method9651(var20) + var2.method9651(var24);
      float var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
      float var32 = var2.method9651(var20) - var2.method9651(var24);
      float var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
      var2.method9685(var3, var26 + var30);
      var2.method9685(var3 + 1L, var27 + var31);
      var2.method9685(var20, var26 - var30);
      var2.method9685(var20 + 1L, var27 - var31);
      var2.method9685(var22, var28 - var33);
      var2.method9685(var22 + 1L, var29 + var32);
      var2.method9685(var24, var28 + var33);
      var2.method9685(var24 + 1L, var29 - var32);
      float var34 = var5.method9651(var6 + 1L);
      long var35 = 0L;

      for (long var37 = 2L; var37 < var10; var37 += 2L) {
         var35 += 4L;
         long var43 = var6 + var35;
         float var45 = var5.method9651(var43);
         float var46 = var5.method9651(var43 + 1L);
         float var47 = var5.method9651(var43 + 2L);
         float var48 = var5.method9651(var43 + 3L);
         long var14 = var37 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         long var49 = var3 + var37;
         var26 = var2.method9651(var49) + var2.method9651(var22);
         var27 = var2.method9651(var49 + 1L) + var2.method9651(var22 + 1L);
         var28 = var2.method9651(var49) - var2.method9651(var22);
         var29 = var2.method9651(var49 + 1L) - var2.method9651(var22 + 1L);
         var30 = var2.method9651(var20) + var2.method9651(var24);
         var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
         var32 = var2.method9651(var20) - var2.method9651(var24);
         var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
         var2.method9685(var49, var26 + var30);
         var2.method9685(var49 + 1L, var27 + var31);
         var2.method9685(var20, var26 - var30);
         var2.method9685(var20 + 1L, var27 - var31);
         var26 = var28 - var33;
         var27 = var29 + var32;
         var2.method9685(var22, var45 * var26 - var46 * var27);
         var2.method9685(var22 + 1L, var45 * var27 + var46 * var26);
         var26 = var28 + var33;
         var27 = var29 - var32;
         var2.method9685(var24, var47 * var26 + var48 * var27);
         var2.method9685(var24 + 1L, var47 * var27 - var48 * var26);
         long var39 = var12 - var37;
         var14 = var39 + var12;
         var16 = var14 + var12;
         var18 = var16 + var12;
         long var41 = var3 + var39;
         var20 = var3 + var14;
         var22 = var3 + var16;
         var24 = var3 + var18;
         var26 = var2.method9651(var41) + var2.method9651(var22);
         var27 = var2.method9651(var41 + 1L) + var2.method9651(var22 + 1L);
         var28 = var2.method9651(var41) - var2.method9651(var22);
         var29 = var2.method9651(var41 + 1L) - var2.method9651(var22 + 1L);
         var30 = var2.method9651(var20) + var2.method9651(var24);
         var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
         var32 = var2.method9651(var20) - var2.method9651(var24);
         var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
         var2.method9685(var41, var26 + var30);
         var2.method9685(var41 + 1L, var27 + var31);
         var2.method9685(var20, var26 - var30);
         var2.method9685(var20 + 1L, var27 - var31);
         var26 = var28 - var33;
         var27 = var29 + var32;
         var2.method9685(var22, var46 * var26 - var45 * var27);
         var2.method9685(var22 + 1L, var46 * var27 + var45 * var26);
         var26 = var28 + var33;
         var27 = var29 - var32;
         var2.method9685(var24, var48 * var26 + var47 * var27);
         var2.method9685(var24 + 1L, var48 * var27 - var47 * var26);
      }

      long var52 = var10 + var12;
      var16 = var52 + var12;
      var18 = var16 + var12;
      long var104 = var3 + var10;
      var20 = var3 + var52;
      var22 = var3 + var16;
      var24 = var3 + var18;
      var26 = var2.method9651(var104) + var2.method9651(var22);
      var27 = var2.method9651(var104 + 1L) + var2.method9651(var22 + 1L);
      var28 = var2.method9651(var104) - var2.method9651(var22);
      var29 = var2.method9651(var104 + 1L) - var2.method9651(var22 + 1L);
      var30 = var2.method9651(var20) + var2.method9651(var24);
      var31 = var2.method9651(var20 + 1L) + var2.method9651(var24 + 1L);
      var32 = var2.method9651(var20) - var2.method9651(var24);
      var33 = var2.method9651(var20 + 1L) - var2.method9651(var24 + 1L);
      var2.method9685(var104, var26 + var30);
      var2.method9685(var104 + 1L, var27 + var31);
      var2.method9685(var20, var26 - var30);
      var2.method9685(var20 + 1L, var27 - var31);
      var26 = var28 - var33;
      var27 = var29 + var32;
      var2.method9685(var22, var34 * (var26 - var27));
      var2.method9685(var22 + 1L, var34 * (var27 + var26));
      var26 = var28 + var33;
      var27 = var29 - var32;
      var2.method9685(var24, -var34 * (var26 + var27));
      var2.method9685(var24 + 1L, -var34 * (var27 - var26));
   }

   public static void method26008(int var0, float[] var1, int var2, float[] var3, int var4) {
      int var7 = var0 >> 3;
      int var8 = 2 * var7;
      float var9 = var3[var4 + 1];
      int var11 = var8 + var8;
      int var12 = var11 + var8;
      int var13 = var2 + var8;
      int var14 = var2 + var11;
      int var15 = var2 + var12;
      float var16 = var1[var2] - var1[var14 + 1];
      float var17 = var1[var2 + 1] + var1[var14];
      float var18 = var1[var2] + var1[var14 + 1];
      float var19 = var1[var2 + 1] - var1[var14];
      float var20 = var1[var13] - var1[var15 + 1];
      float var21 = var1[var13 + 1] + var1[var15];
      float var22 = var1[var13] + var1[var15 + 1];
      float var23 = var1[var13 + 1] - var1[var15];
      float var24 = var9 * (var20 - var21);
      float var25 = var9 * (var21 + var20);
      var1[var2] = var16 + var24;
      var1[var2 + 1] = var17 + var25;
      var1[var13] = var16 - var24;
      var1[var13 + 1] = var17 - var25;
      var24 = var9 * (var22 - var23);
      var25 = var9 * (var23 + var22);
      var1[var14] = var18 - var25;
      var1[var14 + 1] = var19 + var24;
      var1[var15] = var18 + var25;
      var1[var15 + 1] = var19 - var24;
      byte var26 = 0;
      int var27 = 2 * var8;

      for (int var28 = 2; var28 < var7; var28 += 2) {
         var26 += 4;
         int var35 = var4 + var26;
         float var29 = var3[var35];
         float var30 = var3[var35 + 1];
         float var36 = var3[var35 + 2];
         float var37 = var3[var35 + 3];
         var27 -= 4;
         int var38 = var4 + var27;
         float var39 = var3[var38];
         float var40 = var3[var38 + 1];
         float var41 = var3[var38 + 2];
         float var42 = var3[var38 + 3];
         int var10 = var28 + var8;
         var11 = var10 + var8;
         var12 = var11 + var8;
         var13 = var2 + var10;
         var14 = var2 + var11;
         var15 = var2 + var12;
         int var43 = var2 + var28;
         var16 = var1[var43] - var1[var14 + 1];
         var17 = var1[var43 + 1] + var1[var14];
         var18 = var1[var43] + var1[var14 + 1];
         var19 = var1[var43 + 1] - var1[var14];
         var20 = var1[var13] - var1[var15 + 1];
         var21 = var1[var13 + 1] + var1[var15];
         var22 = var1[var13] + var1[var15 + 1];
         var23 = var1[var13 + 1] - var1[var15];
         var24 = var29 * var16 - var30 * var17;
         var25 = var29 * var17 + var30 * var16;
         float var33 = var40 * var20 - var39 * var21;
         float var34 = var40 * var21 + var39 * var20;
         var1[var43] = var24 + var33;
         var1[var43 + 1] = var25 + var34;
         var1[var13] = var24 - var33;
         var1[var13 + 1] = var25 - var34;
         var24 = var36 * var18 + var37 * var19;
         var25 = var36 * var19 - var37 * var18;
         var33 = var42 * var22 + var41 * var23;
         var34 = var42 * var23 - var41 * var22;
         var1[var14] = var24 + var33;
         var1[var14 + 1] = var25 + var34;
         var1[var15] = var24 - var33;
         var1[var15 + 1] = var25 - var34;
         int var31 = var8 - var28;
         var10 = var31 + var8;
         var11 = var10 + var8;
         var12 = var11 + var8;
         int var32 = var2 + var31;
         var13 = var2 + var10;
         var14 = var2 + var11;
         var15 = var2 + var12;
         var16 = var1[var32] - var1[var14 + 1];
         var17 = var1[var32 + 1] + var1[var14];
         var18 = var1[var32] + var1[var14 + 1];
         var19 = var1[var32 + 1] - var1[var14];
         var20 = var1[var13] - var1[var15 + 1];
         var21 = var1[var13 + 1] + var1[var15];
         var22 = var1[var13] + var1[var15 + 1];
         var23 = var1[var13 + 1] - var1[var15];
         var24 = var39 * var16 - var40 * var17;
         var25 = var39 * var17 + var40 * var16;
         var33 = var30 * var20 - var29 * var21;
         var34 = var30 * var21 + var29 * var20;
         var1[var32] = var24 + var33;
         var1[var32 + 1] = var25 + var34;
         var1[var13] = var24 - var33;
         var1[var13 + 1] = var25 - var34;
         var24 = var41 * var18 + var42 * var19;
         var25 = var41 * var19 - var42 * var18;
         var33 = var37 * var22 + var36 * var23;
         var34 = var37 * var23 - var36 * var22;
         var1[var14] = var24 + var33;
         var1[var14 + 1] = var25 + var34;
         var1[var15] = var24 - var33;
         var1[var15 + 1] = var25 - var34;
      }

      float var99 = var3[var4 + var8];
      float var100 = var3[var4 + var8 + 1];
      int var45 = var7 + var8;
      var11 = var45 + var8;
      var12 = var11 + var8;
      int var101 = var2 + var7;
      var13 = var2 + var45;
      var14 = var2 + var11;
      var15 = var2 + var12;
      var16 = var1[var101] - var1[var14 + 1];
      var17 = var1[var101 + 1] + var1[var14];
      var18 = var1[var101] + var1[var14 + 1];
      var19 = var1[var101 + 1] - var1[var14];
      var20 = var1[var13] - var1[var15 + 1];
      var21 = var1[var13 + 1] + var1[var15];
      var22 = var1[var13] + var1[var15 + 1];
      var23 = var1[var13 + 1] - var1[var15];
      var24 = var99 * var16 - var100 * var17;
      var25 = var99 * var17 + var100 * var16;
      float var105 = var100 * var20 - var99 * var21;
      float var110 = var100 * var21 + var99 * var20;
      var1[var101] = var24 + var105;
      var1[var101 + 1] = var25 + var110;
      var1[var13] = var24 - var105;
      var1[var13 + 1] = var25 - var110;
      var24 = var100 * var18 - var99 * var19;
      var25 = var100 * var19 + var99 * var18;
      var105 = var99 * var22 - var100 * var23;
      var110 = var99 * var23 + var100 * var22;
      var1[var14] = var24 - var105;
      var1[var14 + 1] = var25 - var110;
      var1[var15] = var24 + var105;
      var1[var15 + 1] = var25 + var110;
   }

   public static void method26009(long var0, Class2378 var2, long var3, Class2378 var5, long var6) {
      long var10 = var0 >> 3;
      long var12 = 2L * var10;
      float var14 = var5.method9651(var6 + 1L);
      long var17 = var12 + var12;
      long var19 = var17 + var12;
      long var21 = var3 + var12;
      long var23 = var3 + var17;
      long var25 = var3 + var19;
      float var27 = var2.method9651(var3) - var2.method9651(var23 + 1L);
      float var28 = var2.method9651(var3 + 1L) + var2.method9651(var23);
      float var29 = var2.method9651(var3) + var2.method9651(var23 + 1L);
      float var30 = var2.method9651(var3 + 1L) - var2.method9651(var23);
      float var31 = var2.method9651(var21) - var2.method9651(var25 + 1L);
      float var32 = var2.method9651(var21 + 1L) + var2.method9651(var25);
      float var33 = var2.method9651(var21) + var2.method9651(var25 + 1L);
      float var34 = var2.method9651(var21 + 1L) - var2.method9651(var25);
      float var35 = var14 * (var31 - var32);
      float var36 = var14 * (var32 + var31);
      var2.method9685(var3, var27 + var35);
      var2.method9685(var3 + 1L, var28 + var36);
      var2.method9685(var21, var27 - var35);
      var2.method9685(var21 + 1L, var28 - var36);
      var35 = var14 * (var33 - var34);
      var36 = var14 * (var34 + var33);
      var2.method9685(var23, var29 - var36);
      var2.method9685(var23 + 1L, var30 + var35);
      var2.method9685(var25, var29 + var36);
      var2.method9685(var25 + 1L, var30 - var35);
      long var37 = 0L;
      long var39 = 2L * var12;

      for (int var41 = 2; (long)var41 < var10; var41 += 2) {
         var37 += 4L;
         long var50 = var6 + var37;
         float var42 = var5.method9651(var50);
         float var43 = var5.method9651(var50 + 1L);
         float var52 = var5.method9651(var50 + 2L);
         float var53 = var5.method9651(var50 + 3L);
         var39 -= 4L;
         long var54 = var6 + var39;
         float var56 = var5.method9651(var54);
         float var57 = var5.method9651(var54 + 1L);
         float var58 = var5.method9651(var54 + 2L);
         float var59 = var5.method9651(var54 + 3L);
         long var15 = (long)var41 + var12;
         var17 = var15 + var12;
         var19 = var17 + var12;
         var21 = var3 + var15;
         var23 = var3 + var17;
         var25 = var3 + var19;
         long var60 = var3 + (long)var41;
         var27 = var2.method9651(var60) - var2.method9651(var23 + 1L);
         var28 = var2.method9651(var60 + 1L) + var2.method9651(var23);
         var29 = var2.method9651(var60) + var2.method9651(var23 + 1L);
         var30 = var2.method9651(var60 + 1L) - var2.method9651(var23);
         var31 = var2.method9651(var21) - var2.method9651(var25 + 1L);
         var32 = var2.method9651(var21 + 1L) + var2.method9651(var25);
         var33 = var2.method9651(var21) + var2.method9651(var25 + 1L);
         var34 = var2.method9651(var21 + 1L) - var2.method9651(var25);
         var35 = var42 * var27 - var43 * var28;
         var36 = var42 * var28 + var43 * var27;
         float var48 = var57 * var31 - var56 * var32;
         float var49 = var57 * var32 + var56 * var31;
         var2.method9685(var60, var35 + var48);
         var2.method9685(var60 + 1L, var36 + var49);
         var2.method9685(var21, var35 - var48);
         var2.method9685(var21 + 1L, var36 - var49);
         var35 = var52 * var29 + var53 * var30;
         var36 = var52 * var30 - var53 * var29;
         var48 = var59 * var33 + var58 * var34;
         var49 = var59 * var34 - var58 * var33;
         var2.method9685(var23, var35 + var48);
         var2.method9685(var23 + 1L, var36 + var49);
         var2.method9685(var25, var35 - var48);
         var2.method9685(var25 + 1L, var36 - var49);
         long var44 = var12 - (long)var41;
         var15 = var44 + var12;
         var17 = var15 + var12;
         var19 = var17 + var12;
         long var46 = var3 + var44;
         var21 = var3 + var15;
         var23 = var3 + var17;
         var25 = var3 + var19;
         var27 = var2.method9651(var46) - var2.method9651(var23 + 1L);
         var28 = var2.method9651(var46 + 1L) + var2.method9651(var23);
         var29 = var2.method9651(var46) + var2.method9651(var23 + 1L);
         var30 = var2.method9651(var46 + 1L) - var2.method9651(var23);
         var31 = var2.method9651(var21) - var2.method9651(var25 + 1L);
         var32 = var2.method9651(var21 + 1L) + var2.method9651(var25);
         var33 = var2.method9651(var21) + var2.method9651(var25 + 1L);
         var34 = var2.method9651(var21 + 1L) - var2.method9651(var25);
         var35 = var56 * var27 - var57 * var28;
         var36 = var56 * var28 + var57 * var27;
         var48 = var43 * var31 - var42 * var32;
         var49 = var43 * var32 + var42 * var31;
         var2.method9685(var46, var35 + var48);
         var2.method9685(var46 + 1L, var36 + var49);
         var2.method9685(var21, var35 - var48);
         var2.method9685(var21 + 1L, var36 - var49);
         var35 = var58 * var29 + var59 * var30;
         var36 = var58 * var30 - var59 * var29;
         var48 = var53 * var33 + var52 * var34;
         var49 = var53 * var34 - var52 * var33;
         var2.method9685(var23, var35 + var48);
         var2.method9685(var23 + 1L, var36 + var49);
         var2.method9685(var25, var35 - var48);
         var2.method9685(var25 + 1L, var36 - var49);
      }

      float var117 = var5.method9651(var6 + var12);
      float var118 = var5.method9651(var6 + var12 + 1L);
      long var63 = var10 + var12;
      var17 = var63 + var12;
      var19 = var17 + var12;
      long var119 = var3 + var10;
      var21 = var3 + var63;
      var23 = var3 + var17;
      var25 = var3 + var19;
      var27 = var2.method9651(var119) - var2.method9651(var23 + 1L);
      var28 = var2.method9651(var119 + 1L) + var2.method9651(var23);
      var29 = var2.method9651(var119) + var2.method9651(var23 + 1L);
      var30 = var2.method9651(var119 + 1L) - var2.method9651(var23);
      var31 = var2.method9651(var21) - var2.method9651(var25 + 1L);
      var32 = var2.method9651(var21 + 1L) + var2.method9651(var25);
      var33 = var2.method9651(var21) + var2.method9651(var25 + 1L);
      var34 = var2.method9651(var21 + 1L) - var2.method9651(var25);
      var35 = var117 * var27 - var118 * var28;
      var36 = var117 * var28 + var118 * var27;
      float var123 = var118 * var31 - var117 * var32;
      float var128 = var118 * var32 + var117 * var31;
      var2.method9685(var119, var35 + var123);
      var2.method9685(var119 + 1L, var36 + var128);
      var2.method9685(var21, var35 - var123);
      var2.method9685(var21 + 1L, var36 - var128);
      var35 = var118 * var29 - var117 * var30;
      var36 = var118 * var30 + var117 * var29;
      var123 = var117 * var33 - var118 * var34;
      var128 = var117 * var34 + var118 * var33;
      var2.method9685(var23, var35 - var123);
      var2.method9685(var23 + 1L, var36 - var128);
      var2.method9685(var25, var35 + var123);
      var2.method9685(var25 + 1L, var36 + var128);
   }

   public static void method26010(int var0, float[] var1, int var2, int var3, float[] var4) {
      if (var0 != 128) {
         method26016(var1, var2, var4, var3 - 8);
         method26018(var1, var2 + 16, var4, var3 - 8);
         method26016(var1, var2 + 32, var4, var3 - 8);
         method26016(var1, var2 + 48, var4, var3 - 8);
      } else {
         method26012(var1, var2, var4, var3 - 8);
         method26014(var1, var2 + 32, var4, var3 - 32);
         method26012(var1, var2 + 64, var4, var3 - 8);
         method26012(var1, var2 + 96, var4, var3 - 8);
      }
   }

   public static void method26011(long var0, Class2378 var2, long var3, long var5, Class2378 var7) {
      if (var0 != 128L) {
         method26017(var2, var3, var7, var5 - 8L);
         method26019(var2, var3 + 16L, var7, var5 - 8L);
         method26017(var2, var3 + 32L, var7, var5 - 8L);
         method26017(var2, var3 + 48L, var7, var5 - 8L);
      } else {
         method26013(var2, var3, var7, var5 - 8L);
         method26015(var2, var3 + 32L, var7, var5 - 32L);
         method26013(var2, var3 + 64L, var7, var5 - 8L);
         method26013(var2, var3 + 96L, var7, var5 - 8L);
      }
   }

   public static void method26012(float[] var0, int var1, float[] var2, int var3) {
      float var6 = var2[var3 + 1];
      float var7 = var2[var3 + 2];
      float var8 = var2[var3 + 3];
      float var9 = var0[var1] + var0[var1 + 16];
      float var10 = var0[var1 + 1] + var0[var1 + 17];
      float var11 = var0[var1] - var0[var1 + 16];
      float var12 = var0[var1 + 1] - var0[var1 + 17];
      float var13 = var0[var1 + 8] + var0[var1 + 24];
      float var14 = var0[var1 + 9] + var0[var1 + 25];
      float var15 = var0[var1 + 8] - var0[var1 + 24];
      float var16 = var0[var1 + 9] - var0[var1 + 25];
      float var17 = var9 + var13;
      float var18 = var10 + var14;
      float var19 = var9 - var13;
      float var20 = var10 - var14;
      float var21 = var11 - var16;
      float var22 = var12 + var15;
      float var23 = var11 + var16;
      float var24 = var12 - var15;
      var9 = var0[var1 + 2] + var0[var1 + 18];
      var10 = var0[var1 + 3] + var0[var1 + 19];
      var11 = var0[var1 + 2] - var0[var1 + 18];
      var12 = var0[var1 + 3] - var0[var1 + 19];
      var13 = var0[var1 + 10] + var0[var1 + 26];
      var14 = var0[var1 + 11] + var0[var1 + 27];
      var15 = var0[var1 + 10] - var0[var1 + 26];
      var16 = var0[var1 + 11] - var0[var1 + 27];
      float var25 = var9 + var13;
      float var26 = var10 + var14;
      float var27 = var9 - var13;
      float var28 = var10 - var14;
      var9 = var11 - var16;
      var10 = var12 + var15;
      float var29 = var7 * var9 - var8 * var10;
      float var30 = var7 * var10 + var8 * var9;
      var9 = var11 + var16;
      var10 = var12 - var15;
      float var31 = var8 * var9 - var7 * var10;
      float var32 = var8 * var10 + var7 * var9;
      var9 = var0[var1 + 4] + var0[var1 + 20];
      var10 = var0[var1 + 5] + var0[var1 + 21];
      var11 = var0[var1 + 4] - var0[var1 + 20];
      var12 = var0[var1 + 5] - var0[var1 + 21];
      var13 = var0[var1 + 12] + var0[var1 + 28];
      var14 = var0[var1 + 13] + var0[var1 + 29];
      var15 = var0[var1 + 12] - var0[var1 + 28];
      var16 = var0[var1 + 13] - var0[var1 + 29];
      float var33 = var9 + var13;
      float var34 = var10 + var14;
      float var35 = var9 - var13;
      float var36 = var10 - var14;
      var9 = var11 - var16;
      var10 = var12 + var15;
      float var37 = var6 * (var9 - var10);
      float var38 = var6 * (var10 + var9);
      var9 = var11 + var16;
      var10 = var12 - var15;
      float var39 = var6 * (var9 + var10);
      float var40 = var6 * (var10 - var9);
      var9 = var0[var1 + 6] + var0[var1 + 22];
      var10 = var0[var1 + 7] + var0[var1 + 23];
      var11 = var0[var1 + 6] - var0[var1 + 22];
      var12 = var0[var1 + 7] - var0[var1 + 23];
      var13 = var0[var1 + 14] + var0[var1 + 30];
      var14 = var0[var1 + 15] + var0[var1 + 31];
      var15 = var0[var1 + 14] - var0[var1 + 30];
      var16 = var0[var1 + 15] - var0[var1 + 31];
      float var41 = var9 + var13;
      float var42 = var10 + var14;
      float var43 = var9 - var13;
      float var44 = var10 - var14;
      var9 = var11 - var16;
      var10 = var12 + var15;
      float var45 = var8 * var9 - var7 * var10;
      float var46 = var8 * var10 + var7 * var9;
      var9 = var11 + var16;
      var10 = var12 - var15;
      float var47 = var7 * var9 - var8 * var10;
      float var48 = var7 * var10 + var8 * var9;
      var9 = var23 - var39;
      var10 = var24 - var40;
      var11 = var23 + var39;
      var12 = var24 + var40;
      var13 = var31 - var47;
      var14 = var32 - var48;
      var15 = var31 + var47;
      var16 = var32 + var48;
      var0[var1 + 24] = var9 + var13;
      var0[var1 + 25] = var10 + var14;
      var0[var1 + 26] = var9 - var13;
      var0[var1 + 27] = var10 - var14;
      var0[var1 + 28] = var11 - var16;
      var0[var1 + 29] = var12 + var15;
      var0[var1 + 30] = var11 + var16;
      var0[var1 + 31] = var12 - var15;
      var9 = var21 + var37;
      var10 = var22 + var38;
      var11 = var21 - var37;
      var12 = var22 - var38;
      var13 = var29 + var45;
      var14 = var30 + var46;
      var15 = var29 - var45;
      var16 = var30 - var46;
      var0[var1 + 16] = var9 + var13;
      var0[var1 + 17] = var10 + var14;
      var0[var1 + 18] = var9 - var13;
      var0[var1 + 19] = var10 - var14;
      var0[var1 + 20] = var11 - var16;
      var0[var1 + 21] = var12 + var15;
      var0[var1 + 22] = var11 + var16;
      var0[var1 + 23] = var12 - var15;
      var9 = var27 - var44;
      var10 = var28 + var43;
      var13 = var6 * (var9 - var10);
      var14 = var6 * (var10 + var9);
      var9 = var27 + var44;
      var10 = var28 - var43;
      var15 = var6 * (var9 - var10);
      var16 = var6 * (var10 + var9);
      var9 = var19 - var36;
      var10 = var20 + var35;
      var11 = var19 + var36;
      var12 = var20 - var35;
      var0[var1 + 8] = var9 + var13;
      var0[var1 + 9] = var10 + var14;
      var0[var1 + 10] = var9 - var13;
      var0[var1 + 11] = var10 - var14;
      var0[var1 + 12] = var11 - var16;
      var0[var1 + 13] = var12 + var15;
      var0[var1 + 14] = var11 + var16;
      var0[var1 + 15] = var12 - var15;
      var9 = var17 + var33;
      var10 = var18 + var34;
      var11 = var17 - var33;
      var12 = var18 - var34;
      var13 = var25 + var41;
      var14 = var26 + var42;
      var15 = var25 - var41;
      var16 = var26 - var42;
      var0[var1] = var9 + var13;
      var0[var1 + 1] = var10 + var14;
      var0[var1 + 2] = var9 - var13;
      var0[var1 + 3] = var10 - var14;
      var0[var1 + 4] = var11 - var16;
      var0[var1 + 5] = var12 + var15;
      var0[var1 + 6] = var11 + var16;
      var0[var1 + 7] = var12 - var15;
   }

   public static void method26013(Class2378 var0, long var1, Class2378 var3, long var4) {
      float var8 = var3.method9651(var4 + 1L);
      float var9 = var3.method9651(var4 + 2L);
      float var10 = var3.method9651(var4 + 3L);
      float var11 = var0.method9651(var1) + var0.method9651(var1 + 16L);
      float var12 = var0.method9651(var1 + 1L) + var0.method9651(var1 + 17L);
      float var13 = var0.method9651(var1) - var0.method9651(var1 + 16L);
      float var14 = var0.method9651(var1 + 1L) - var0.method9651(var1 + 17L);
      float var15 = var0.method9651(var1 + 8L) + var0.method9651(var1 + 24L);
      float var16 = var0.method9651(var1 + 9L) + var0.method9651(var1 + 25L);
      float var17 = var0.method9651(var1 + 8L) - var0.method9651(var1 + 24L);
      float var18 = var0.method9651(var1 + 9L) - var0.method9651(var1 + 25L);
      float var19 = var11 + var15;
      float var20 = var12 + var16;
      float var21 = var11 - var15;
      float var22 = var12 - var16;
      float var23 = var13 - var18;
      float var24 = var14 + var17;
      float var25 = var13 + var18;
      float var26 = var14 - var17;
      var11 = var0.method9651(var1 + 2L) + var0.method9651(var1 + 18L);
      var12 = var0.method9651(var1 + 3L) + var0.method9651(var1 + 19L);
      var13 = var0.method9651(var1 + 2L) - var0.method9651(var1 + 18L);
      var14 = var0.method9651(var1 + 3L) - var0.method9651(var1 + 19L);
      var15 = var0.method9651(var1 + 10L) + var0.method9651(var1 + 26L);
      var16 = var0.method9651(var1 + 11L) + var0.method9651(var1 + 27L);
      var17 = var0.method9651(var1 + 10L) - var0.method9651(var1 + 26L);
      var18 = var0.method9651(var1 + 11L) - var0.method9651(var1 + 27L);
      float var27 = var11 + var15;
      float var28 = var12 + var16;
      float var29 = var11 - var15;
      float var30 = var12 - var16;
      var11 = var13 - var18;
      var12 = var14 + var17;
      float var31 = var9 * var11 - var10 * var12;
      float var32 = var9 * var12 + var10 * var11;
      var11 = var13 + var18;
      var12 = var14 - var17;
      float var33 = var10 * var11 - var9 * var12;
      float var34 = var10 * var12 + var9 * var11;
      var11 = var0.method9651(var1 + 4L) + var0.method9651(var1 + 20L);
      var12 = var0.method9651(var1 + 5L) + var0.method9651(var1 + 21L);
      var13 = var0.method9651(var1 + 4L) - var0.method9651(var1 + 20L);
      var14 = var0.method9651(var1 + 5L) - var0.method9651(var1 + 21L);
      var15 = var0.method9651(var1 + 12L) + var0.method9651(var1 + 28L);
      var16 = var0.method9651(var1 + 13L) + var0.method9651(var1 + 29L);
      var17 = var0.method9651(var1 + 12L) - var0.method9651(var1 + 28L);
      var18 = var0.method9651(var1 + 13L) - var0.method9651(var1 + 29L);
      float var35 = var11 + var15;
      float var36 = var12 + var16;
      float var37 = var11 - var15;
      float var38 = var12 - var16;
      var11 = var13 - var18;
      var12 = var14 + var17;
      float var39 = var8 * (var11 - var12);
      float var40 = var8 * (var12 + var11);
      var11 = var13 + var18;
      var12 = var14 - var17;
      float var41 = var8 * (var11 + var12);
      float var42 = var8 * (var12 - var11);
      var11 = var0.method9651(var1 + 6L) + var0.method9651(var1 + 22L);
      var12 = var0.method9651(var1 + 7L) + var0.method9651(var1 + 23L);
      var13 = var0.method9651(var1 + 6L) - var0.method9651(var1 + 22L);
      var14 = var0.method9651(var1 + 7L) - var0.method9651(var1 + 23L);
      var15 = var0.method9651(var1 + 14L) + var0.method9651(var1 + 30L);
      var16 = var0.method9651(var1 + 15L) + var0.method9651(var1 + 31L);
      var17 = var0.method9651(var1 + 14L) - var0.method9651(var1 + 30L);
      var18 = var0.method9651(var1 + 15L) - var0.method9651(var1 + 31L);
      float var43 = var11 + var15;
      float var44 = var12 + var16;
      float var45 = var11 - var15;
      float var46 = var12 - var16;
      var11 = var13 - var18;
      var12 = var14 + var17;
      float var47 = var10 * var11 - var9 * var12;
      float var48 = var10 * var12 + var9 * var11;
      var11 = var13 + var18;
      var12 = var14 - var17;
      float var49 = var9 * var11 - var10 * var12;
      float var50 = var9 * var12 + var10 * var11;
      var11 = var25 - var41;
      var12 = var26 - var42;
      var13 = var25 + var41;
      var14 = var26 + var42;
      var15 = var33 - var49;
      var16 = var34 - var50;
      var17 = var33 + var49;
      var18 = var34 + var50;
      var0.method9685(var1 + 24L, var11 + var15);
      var0.method9685(var1 + 25L, var12 + var16);
      var0.method9685(var1 + 26L, var11 - var15);
      var0.method9685(var1 + 27L, var12 - var16);
      var0.method9685(var1 + 28L, var13 - var18);
      var0.method9685(var1 + 29L, var14 + var17);
      var0.method9685(var1 + 30L, var13 + var18);
      var0.method9685(var1 + 31L, var14 - var17);
      var11 = var23 + var39;
      var12 = var24 + var40;
      var13 = var23 - var39;
      var14 = var24 - var40;
      var15 = var31 + var47;
      var16 = var32 + var48;
      var17 = var31 - var47;
      var18 = var32 - var48;
      var0.method9685(var1 + 16L, var11 + var15);
      var0.method9685(var1 + 17L, var12 + var16);
      var0.method9685(var1 + 18L, var11 - var15);
      var0.method9685(var1 + 19L, var12 - var16);
      var0.method9685(var1 + 20L, var13 - var18);
      var0.method9685(var1 + 21L, var14 + var17);
      var0.method9685(var1 + 22L, var13 + var18);
      var0.method9685(var1 + 23L, var14 - var17);
      var11 = var29 - var46;
      var12 = var30 + var45;
      var15 = var8 * (var11 - var12);
      var16 = var8 * (var12 + var11);
      var11 = var29 + var46;
      var12 = var30 - var45;
      var17 = var8 * (var11 - var12);
      var18 = var8 * (var12 + var11);
      var11 = var21 - var38;
      var12 = var22 + var37;
      var13 = var21 + var38;
      var14 = var22 - var37;
      var0.method9685(var1 + 8L, var11 + var15);
      var0.method9685(var1 + 9L, var12 + var16);
      var0.method9685(var1 + 10L, var11 - var15);
      var0.method9685(var1 + 11L, var12 - var16);
      var0.method9685(var1 + 12L, var13 - var18);
      var0.method9685(var1 + 13L, var14 + var17);
      var0.method9685(var1 + 14L, var13 + var18);
      var0.method9685(var1 + 15L, var14 - var17);
      var11 = var19 + var35;
      var12 = var20 + var36;
      var13 = var19 - var35;
      var14 = var20 - var36;
      var15 = var27 + var43;
      var16 = var28 + var44;
      var17 = var27 - var43;
      var18 = var28 - var44;
      var0.method9685(var1, var11 + var15);
      var0.method9685(var1 + 1L, var12 + var16);
      var0.method9685(var1 + 2L, var11 - var15);
      var0.method9685(var1 + 3L, var12 - var16);
      var0.method9685(var1 + 4L, var13 - var18);
      var0.method9685(var1 + 5L, var14 + var17);
      var0.method9685(var1 + 6L, var13 + var18);
      var0.method9685(var1 + 7L, var14 - var17);
   }

   public static void method26014(float[] var0, int var1, float[] var2, int var3) {
      float var6 = var2[var3 + 1];
      float var7 = var2[var3 + 4];
      float var8 = var2[var3 + 5];
      float var9 = var2[var3 + 6];
      float var10 = -var2[var3 + 7];
      float var11 = var2[var3 + 8];
      float var12 = var2[var3 + 9];
      float var13 = var0[var1] - var0[var1 + 17];
      float var14 = var0[var1 + 1] + var0[var1 + 16];
      float var15 = var0[var1 + 8] - var0[var1 + 25];
      float var16 = var0[var1 + 9] + var0[var1 + 24];
      float var17 = var6 * (var15 - var16);
      float var18 = var6 * (var16 + var15);
      float var19 = var13 + var17;
      float var20 = var14 + var18;
      float var21 = var13 - var17;
      float var22 = var14 - var18;
      var13 = var0[var1] + var0[var1 + 17];
      var14 = var0[var1 + 1] - var0[var1 + 16];
      var15 = var0[var1 + 8] + var0[var1 + 25];
      var16 = var0[var1 + 9] - var0[var1 + 24];
      var17 = var6 * (var15 - var16);
      var18 = var6 * (var16 + var15);
      float var23 = var13 - var18;
      float var24 = var14 + var17;
      float var25 = var13 + var18;
      float var26 = var14 - var17;
      var15 = var0[var1 + 2] - var0[var1 + 19];
      var16 = var0[var1 + 3] + var0[var1 + 18];
      var13 = var7 * var15 - var8 * var16;
      var14 = var7 * var16 + var8 * var15;
      var15 = var0[var1 + 10] - var0[var1 + 27];
      var16 = var0[var1 + 11] + var0[var1 + 26];
      var17 = var10 * var15 - var9 * var16;
      var18 = var10 * var16 + var9 * var15;
      float var27 = var13 + var17;
      float var28 = var14 + var18;
      float var29 = var13 - var17;
      float var30 = var14 - var18;
      var15 = var0[var1 + 2] + var0[var1 + 19];
      var16 = var0[var1 + 3] - var0[var1 + 18];
      var13 = var9 * var15 - var10 * var16;
      var14 = var9 * var16 + var10 * var15;
      var15 = var0[var1 + 10] + var0[var1 + 27];
      var16 = var0[var1 + 11] - var0[var1 + 26];
      var17 = var7 * var15 + var8 * var16;
      var18 = var7 * var16 - var8 * var15;
      float var31 = var13 - var17;
      float var32 = var14 - var18;
      float var33 = var13 + var17;
      float var34 = var14 + var18;
      var15 = var0[var1 + 4] - var0[var1 + 21];
      var16 = var0[var1 + 5] + var0[var1 + 20];
      var13 = var11 * var15 - var12 * var16;
      var14 = var11 * var16 + var12 * var15;
      var15 = var0[var1 + 12] - var0[var1 + 29];
      var16 = var0[var1 + 13] + var0[var1 + 28];
      var17 = var12 * var15 - var11 * var16;
      var18 = var12 * var16 + var11 * var15;
      float var35 = var13 + var17;
      float var36 = var14 + var18;
      float var37 = var13 - var17;
      float var38 = var14 - var18;
      var15 = var0[var1 + 4] + var0[var1 + 21];
      var16 = var0[var1 + 5] - var0[var1 + 20];
      var13 = var12 * var15 - var11 * var16;
      var14 = var12 * var16 + var11 * var15;
      var15 = var0[var1 + 12] + var0[var1 + 29];
      var16 = var0[var1 + 13] - var0[var1 + 28];
      var17 = var11 * var15 - var12 * var16;
      var18 = var11 * var16 + var12 * var15;
      float var39 = var13 - var17;
      float var40 = var14 - var18;
      float var41 = var13 + var17;
      float var42 = var14 + var18;
      var15 = var0[var1 + 6] - var0[var1 + 23];
      var16 = var0[var1 + 7] + var0[var1 + 22];
      var13 = var9 * var15 - var10 * var16;
      var14 = var9 * var16 + var10 * var15;
      var15 = var0[var1 + 14] - var0[var1 + 31];
      var16 = var0[var1 + 15] + var0[var1 + 30];
      var17 = var8 * var15 - var7 * var16;
      var18 = var8 * var16 + var7 * var15;
      float var43 = var13 + var17;
      float var44 = var14 + var18;
      float var45 = var13 - var17;
      float var46 = var14 - var18;
      var15 = var0[var1 + 6] + var0[var1 + 23];
      var16 = var0[var1 + 7] - var0[var1 + 22];
      var13 = var8 * var15 + var7 * var16;
      var14 = var8 * var16 - var7 * var15;
      var15 = var0[var1 + 14] + var0[var1 + 31];
      var16 = var0[var1 + 15] - var0[var1 + 30];
      var17 = var10 * var15 - var9 * var16;
      var18 = var10 * var16 + var9 * var15;
      float var47 = var13 + var17;
      float var48 = var14 + var18;
      float var49 = var13 - var17;
      float var50 = var14 - var18;
      var13 = var19 + var35;
      var14 = var20 + var36;
      var17 = var27 + var43;
      var18 = var28 + var44;
      var0[var1] = var13 + var17;
      var0[var1 + 1] = var14 + var18;
      var0[var1 + 2] = var13 - var17;
      var0[var1 + 3] = var14 - var18;
      var13 = var19 - var35;
      var14 = var20 - var36;
      var17 = var27 - var43;
      var18 = var28 - var44;
      var0[var1 + 4] = var13 - var18;
      var0[var1 + 5] = var14 + var17;
      var0[var1 + 6] = var13 + var18;
      var0[var1 + 7] = var14 - var17;
      var13 = var21 - var38;
      var14 = var22 + var37;
      var15 = var29 - var46;
      var16 = var30 + var45;
      var17 = var6 * (var15 - var16);
      var18 = var6 * (var16 + var15);
      var0[var1 + 8] = var13 + var17;
      var0[var1 + 9] = var14 + var18;
      var0[var1 + 10] = var13 - var17;
      var0[var1 + 11] = var14 - var18;
      var13 = var21 + var38;
      var14 = var22 - var37;
      var15 = var29 + var46;
      var16 = var30 - var45;
      var17 = var6 * (var15 - var16);
      var18 = var6 * (var16 + var15);
      var0[var1 + 12] = var13 - var18;
      var0[var1 + 13] = var14 + var17;
      var0[var1 + 14] = var13 + var18;
      var0[var1 + 15] = var14 - var17;
      var13 = var23 + var39;
      var14 = var24 + var40;
      var17 = var31 - var47;
      var18 = var32 - var48;
      var0[var1 + 16] = var13 + var17;
      var0[var1 + 17] = var14 + var18;
      var0[var1 + 18] = var13 - var17;
      var0[var1 + 19] = var14 - var18;
      var13 = var23 - var39;
      var14 = var24 - var40;
      var17 = var31 + var47;
      var18 = var32 + var48;
      var0[var1 + 20] = var13 - var18;
      var0[var1 + 21] = var14 + var17;
      var0[var1 + 22] = var13 + var18;
      var0[var1 + 23] = var14 - var17;
      var13 = var25 - var42;
      var14 = var26 + var41;
      var15 = var33 + var50;
      var16 = var34 - var49;
      var17 = var6 * (var15 - var16);
      var18 = var6 * (var16 + var15);
      var0[var1 + 24] = var13 + var17;
      var0[var1 + 25] = var14 + var18;
      var0[var1 + 26] = var13 - var17;
      var0[var1 + 27] = var14 - var18;
      var13 = var25 + var42;
      var14 = var26 - var41;
      var15 = var33 - var50;
      var16 = var34 + var49;
      var17 = var6 * (var15 - var16);
      var18 = var6 * (var16 + var15);
      var0[var1 + 28] = var13 - var18;
      var0[var1 + 29] = var14 + var17;
      var0[var1 + 30] = var13 + var18;
      var0[var1 + 31] = var14 - var17;
   }

   public static void method26015(Class2378 var0, long var1, Class2378 var3, long var4) {
      float var8 = var3.method9651(var4 + 1L);
      float var9 = var3.method9651(var4 + 4L);
      float var10 = var3.method9651(var4 + 5L);
      float var11 = var3.method9651(var4 + 6L);
      float var12 = -var3.method9651(var4 + 7L);
      float var13 = var3.method9651(var4 + 8L);
      float var14 = var3.method9651(var4 + 9L);
      float var15 = var0.method9651(var1) - var0.method9651(var1 + 17L);
      float var16 = var0.method9651(var1 + 1L) + var0.method9651(var1 + 16L);
      float var17 = var0.method9651(var1 + 8L) - var0.method9651(var1 + 25L);
      float var18 = var0.method9651(var1 + 9L) + var0.method9651(var1 + 24L);
      float var19 = var8 * (var17 - var18);
      float var20 = var8 * (var18 + var17);
      float var21 = var15 + var19;
      float var22 = var16 + var20;
      float var23 = var15 - var19;
      float var24 = var16 - var20;
      var15 = var0.method9651(var1) + var0.method9651(var1 + 17L);
      var16 = var0.method9651(var1 + 1L) - var0.method9651(var1 + 16L);
      var17 = var0.method9651(var1 + 8L) + var0.method9651(var1 + 25L);
      var18 = var0.method9651(var1 + 9L) - var0.method9651(var1 + 24L);
      var19 = var8 * (var17 - var18);
      var20 = var8 * (var18 + var17);
      float var25 = var15 - var20;
      float var26 = var16 + var19;
      float var27 = var15 + var20;
      float var28 = var16 - var19;
      var17 = var0.method9651(var1 + 2L) - var0.method9651(var1 + 19L);
      var18 = var0.method9651(var1 + 3L) + var0.method9651(var1 + 18L);
      var15 = var9 * var17 - var10 * var18;
      var16 = var9 * var18 + var10 * var17;
      var17 = var0.method9651(var1 + 10L) - var0.method9651(var1 + 27L);
      var18 = var0.method9651(var1 + 11L) + var0.method9651(var1 + 26L);
      var19 = var12 * var17 - var11 * var18;
      var20 = var12 * var18 + var11 * var17;
      float var29 = var15 + var19;
      float var30 = var16 + var20;
      float var31 = var15 - var19;
      float var32 = var16 - var20;
      var17 = var0.method9651(var1 + 2L) + var0.method9651(var1 + 19L);
      var18 = var0.method9651(var1 + 3L) - var0.method9651(var1 + 18L);
      var15 = var11 * var17 - var12 * var18;
      var16 = var11 * var18 + var12 * var17;
      var17 = var0.method9651(var1 + 10L) + var0.method9651(var1 + 27L);
      var18 = var0.method9651(var1 + 11L) - var0.method9651(var1 + 26L);
      var19 = var9 * var17 + var10 * var18;
      var20 = var9 * var18 - var10 * var17;
      float var33 = var15 - var19;
      float var34 = var16 - var20;
      float var35 = var15 + var19;
      float var36 = var16 + var20;
      var17 = var0.method9651(var1 + 4L) - var0.method9651(var1 + 21L);
      var18 = var0.method9651(var1 + 5L) + var0.method9651(var1 + 20L);
      var15 = var13 * var17 - var14 * var18;
      var16 = var13 * var18 + var14 * var17;
      var17 = var0.method9651(var1 + 12L) - var0.method9651(var1 + 29L);
      var18 = var0.method9651(var1 + 13L) + var0.method9651(var1 + 28L);
      var19 = var14 * var17 - var13 * var18;
      var20 = var14 * var18 + var13 * var17;
      float var37 = var15 + var19;
      float var38 = var16 + var20;
      float var39 = var15 - var19;
      float var40 = var16 - var20;
      var17 = var0.method9651(var1 + 4L) + var0.method9651(var1 + 21L);
      var18 = var0.method9651(var1 + 5L) - var0.method9651(var1 + 20L);
      var15 = var14 * var17 - var13 * var18;
      var16 = var14 * var18 + var13 * var17;
      var17 = var0.method9651(var1 + 12L) + var0.method9651(var1 + 29L);
      var18 = var0.method9651(var1 + 13L) - var0.method9651(var1 + 28L);
      var19 = var13 * var17 - var14 * var18;
      var20 = var13 * var18 + var14 * var17;
      float var41 = var15 - var19;
      float var42 = var16 - var20;
      float var43 = var15 + var19;
      float var44 = var16 + var20;
      var17 = var0.method9651(var1 + 6L) - var0.method9651(var1 + 23L);
      var18 = var0.method9651(var1 + 7L) + var0.method9651(var1 + 22L);
      var15 = var11 * var17 - var12 * var18;
      var16 = var11 * var18 + var12 * var17;
      var17 = var0.method9651(var1 + 14L) - var0.method9651(var1 + 31L);
      var18 = var0.method9651(var1 + 15L) + var0.method9651(var1 + 30L);
      var19 = var10 * var17 - var9 * var18;
      var20 = var10 * var18 + var9 * var17;
      float var45 = var15 + var19;
      float var46 = var16 + var20;
      float var47 = var15 - var19;
      float var48 = var16 - var20;
      var17 = var0.method9651(var1 + 6L) + var0.method9651(var1 + 23L);
      var18 = var0.method9651(var1 + 7L) - var0.method9651(var1 + 22L);
      var15 = var10 * var17 + var9 * var18;
      var16 = var10 * var18 - var9 * var17;
      var17 = var0.method9651(var1 + 14L) + var0.method9651(var1 + 31L);
      var18 = var0.method9651(var1 + 15L) - var0.method9651(var1 + 30L);
      var19 = var12 * var17 - var11 * var18;
      var20 = var12 * var18 + var11 * var17;
      float var49 = var15 + var19;
      float var50 = var16 + var20;
      float var51 = var15 - var19;
      float var52 = var16 - var20;
      var15 = var21 + var37;
      var16 = var22 + var38;
      var19 = var29 + var45;
      var20 = var30 + var46;
      var0.method9685(var1, var15 + var19);
      var0.method9685(var1 + 1L, var16 + var20);
      var0.method9685(var1 + 2L, var15 - var19);
      var0.method9685(var1 + 3L, var16 - var20);
      var15 = var21 - var37;
      var16 = var22 - var38;
      var19 = var29 - var45;
      var20 = var30 - var46;
      var0.method9685(var1 + 4L, var15 - var20);
      var0.method9685(var1 + 5L, var16 + var19);
      var0.method9685(var1 + 6L, var15 + var20);
      var0.method9685(var1 + 7L, var16 - var19);
      var15 = var23 - var40;
      var16 = var24 + var39;
      var17 = var31 - var48;
      var18 = var32 + var47;
      var19 = var8 * (var17 - var18);
      var20 = var8 * (var18 + var17);
      var0.method9685(var1 + 8L, var15 + var19);
      var0.method9685(var1 + 9L, var16 + var20);
      var0.method9685(var1 + 10L, var15 - var19);
      var0.method9685(var1 + 11L, var16 - var20);
      var15 = var23 + var40;
      var16 = var24 - var39;
      var17 = var31 + var48;
      var18 = var32 - var47;
      var19 = var8 * (var17 - var18);
      var20 = var8 * (var18 + var17);
      var0.method9685(var1 + 12L, var15 - var20);
      var0.method9685(var1 + 13L, var16 + var19);
      var0.method9685(var1 + 14L, var15 + var20);
      var0.method9685(var1 + 15L, var16 - var19);
      var15 = var25 + var41;
      var16 = var26 + var42;
      var19 = var33 - var49;
      var20 = var34 - var50;
      var0.method9685(var1 + 16L, var15 + var19);
      var0.method9685(var1 + 17L, var16 + var20);
      var0.method9685(var1 + 18L, var15 - var19);
      var0.method9685(var1 + 19L, var16 - var20);
      var15 = var25 - var41;
      var16 = var26 - var42;
      var19 = var33 + var49;
      var20 = var34 + var50;
      var0.method9685(var1 + 20L, var15 - var20);
      var0.method9685(var1 + 21L, var16 + var19);
      var0.method9685(var1 + 22L, var15 + var20);
      var0.method9685(var1 + 23L, var16 - var19);
      var15 = var27 - var44;
      var16 = var28 + var43;
      var17 = var35 + var52;
      var18 = var36 - var51;
      var19 = var8 * (var17 - var18);
      var20 = var8 * (var18 + var17);
      var0.method9685(var1 + 24L, var15 + var19);
      var0.method9685(var1 + 25L, var16 + var20);
      var0.method9685(var1 + 26L, var15 - var19);
      var0.method9685(var1 + 27L, var16 - var20);
      var15 = var27 + var44;
      var16 = var28 - var43;
      var17 = var35 - var52;
      var18 = var36 + var51;
      var19 = var8 * (var17 - var18);
      var20 = var8 * (var18 + var17);
      var0.method9685(var1 + 28L, var15 - var20);
      var0.method9685(var1 + 29L, var16 + var19);
      var0.method9685(var1 + 30L, var15 + var20);
      var0.method9685(var1 + 31L, var16 - var19);
   }

   public static void method26016(float[] var0, int var1, float[] var2, int var3) {
      float var6 = var2[var3 + 1];
      float var7 = var0[var1] + var0[var1 + 8];
      float var8 = var0[var1 + 1] + var0[var1 + 9];
      float var9 = var0[var1] - var0[var1 + 8];
      float var10 = var0[var1 + 1] - var0[var1 + 9];
      float var11 = var0[var1 + 4] + var0[var1 + 12];
      float var12 = var0[var1 + 5] + var0[var1 + 13];
      float var13 = var0[var1 + 4] - var0[var1 + 12];
      float var14 = var0[var1 + 5] - var0[var1 + 13];
      float var15 = var7 + var11;
      float var16 = var8 + var12;
      float var17 = var7 - var11;
      float var18 = var8 - var12;
      float var19 = var9 - var14;
      float var20 = var10 + var13;
      float var21 = var9 + var14;
      float var22 = var10 - var13;
      var7 = var0[var1 + 2] + var0[var1 + 10];
      var8 = var0[var1 + 3] + var0[var1 + 11];
      var9 = var0[var1 + 2] - var0[var1 + 10];
      var10 = var0[var1 + 3] - var0[var1 + 11];
      var11 = var0[var1 + 6] + var0[var1 + 14];
      var12 = var0[var1 + 7] + var0[var1 + 15];
      var13 = var0[var1 + 6] - var0[var1 + 14];
      var14 = var0[var1 + 7] - var0[var1 + 15];
      float var23 = var7 + var11;
      float var24 = var8 + var12;
      float var25 = var7 - var11;
      float var26 = var8 - var12;
      var7 = var9 - var14;
      var8 = var10 + var13;
      var11 = var9 + var14;
      var12 = var10 - var13;
      float var27 = var6 * (var7 - var8);
      float var28 = var6 * (var7 + var8);
      float var29 = var6 * (var11 - var12);
      float var30 = var6 * (var11 + var12);
      var0[var1 + 8] = var19 + var27;
      var0[var1 + 9] = var20 + var28;
      var0[var1 + 10] = var19 - var27;
      var0[var1 + 11] = var20 - var28;
      var0[var1 + 12] = var21 - var30;
      var0[var1 + 13] = var22 + var29;
      var0[var1 + 14] = var21 + var30;
      var0[var1 + 15] = var22 - var29;
      var0[var1] = var15 + var23;
      var0[var1 + 1] = var16 + var24;
      var0[var1 + 2] = var15 - var23;
      var0[var1 + 3] = var16 - var24;
      var0[var1 + 4] = var17 - var26;
      var0[var1 + 5] = var18 + var25;
      var0[var1 + 6] = var17 + var26;
      var0[var1 + 7] = var18 - var25;
   }

   public static void method26017(Class2378 var0, long var1, Class2378 var3, long var4) {
      float var8 = var3.method9651(var4 + 1L);
      float var9 = var0.method9651(var1) + var0.method9651(var1 + 8L);
      float var10 = var0.method9651(var1 + 1L) + var0.method9651(var1 + 9L);
      float var11 = var0.method9651(var1) - var0.method9651(var1 + 8L);
      float var12 = var0.method9651(var1 + 1L) - var0.method9651(var1 + 9L);
      float var13 = var0.method9651(var1 + 4L) + var0.method9651(var1 + 12L);
      float var14 = var0.method9651(var1 + 5L) + var0.method9651(var1 + 13L);
      float var15 = var0.method9651(var1 + 4L) - var0.method9651(var1 + 12L);
      float var16 = var0.method9651(var1 + 5L) - var0.method9651(var1 + 13L);
      float var17 = var9 + var13;
      float var18 = var10 + var14;
      float var19 = var9 - var13;
      float var20 = var10 - var14;
      float var21 = var11 - var16;
      float var22 = var12 + var15;
      float var23 = var11 + var16;
      float var24 = var12 - var15;
      var9 = var0.method9651(var1 + 2L) + var0.method9651(var1 + 10L);
      var10 = var0.method9651(var1 + 3L) + var0.method9651(var1 + 11L);
      var11 = var0.method9651(var1 + 2L) - var0.method9651(var1 + 10L);
      var12 = var0.method9651(var1 + 3L) - var0.method9651(var1 + 11L);
      var13 = var0.method9651(var1 + 6L) + var0.method9651(var1 + 14L);
      var14 = var0.method9651(var1 + 7L) + var0.method9651(var1 + 15L);
      var15 = var0.method9651(var1 + 6L) - var0.method9651(var1 + 14L);
      var16 = var0.method9651(var1 + 7L) - var0.method9651(var1 + 15L);
      float var25 = var9 + var13;
      float var26 = var10 + var14;
      float var27 = var9 - var13;
      float var28 = var10 - var14;
      var9 = var11 - var16;
      var10 = var12 + var15;
      var13 = var11 + var16;
      var14 = var12 - var15;
      float var29 = var8 * (var9 - var10);
      float var30 = var8 * (var9 + var10);
      float var31 = var8 * (var13 - var14);
      float var32 = var8 * (var13 + var14);
      var0.method9685(var1 + 8L, var21 + var29);
      var0.method9685(var1 + 9L, var22 + var30);
      var0.method9685(var1 + 10L, var21 - var29);
      var0.method9685(var1 + 11L, var22 - var30);
      var0.method9685(var1 + 12L, var23 - var32);
      var0.method9685(var1 + 13L, var24 + var31);
      var0.method9685(var1 + 14L, var23 + var32);
      var0.method9685(var1 + 15L, var24 - var31);
      var0.method9685(var1, var17 + var25);
      var0.method9685(var1 + 1L, var18 + var26);
      var0.method9685(var1 + 2L, var17 - var25);
      var0.method9685(var1 + 3L, var18 - var26);
      var0.method9685(var1 + 4L, var19 - var28);
      var0.method9685(var1 + 5L, var20 + var27);
      var0.method9685(var1 + 6L, var19 + var28);
      var0.method9685(var1 + 7L, var20 - var27);
   }

   public static void method26018(float[] var0, int var1, float[] var2, int var3) {
      float var6 = var2[var3 + 1];
      float var7 = var2[var3 + 2];
      float var8 = var2[var3 + 3];
      float var9 = var0[var1] - var0[var1 + 9];
      float var10 = var0[var1 + 1] + var0[var1 + 8];
      float var11 = var0[var1] + var0[var1 + 9];
      float var12 = var0[var1 + 1] - var0[var1 + 8];
      float var13 = var0[var1 + 4] - var0[var1 + 13];
      float var14 = var0[var1 + 5] + var0[var1 + 12];
      float var15 = var6 * (var13 - var14);
      float var16 = var6 * (var14 + var13);
      var13 = var0[var1 + 4] + var0[var1 + 13];
      var14 = var0[var1 + 5] - var0[var1 + 12];
      float var17 = var6 * (var13 - var14);
      float var18 = var6 * (var14 + var13);
      var13 = var0[var1 + 2] - var0[var1 + 11];
      var14 = var0[var1 + 3] + var0[var1 + 10];
      float var19 = var7 * var13 - var8 * var14;
      float var20 = var7 * var14 + var8 * var13;
      var13 = var0[var1 + 2] + var0[var1 + 11];
      var14 = var0[var1 + 3] - var0[var1 + 10];
      float var21 = var8 * var13 - var7 * var14;
      float var22 = var8 * var14 + var7 * var13;
      var13 = var0[var1 + 6] - var0[var1 + 15];
      var14 = var0[var1 + 7] + var0[var1 + 14];
      float var23 = var8 * var13 - var7 * var14;
      float var24 = var8 * var14 + var7 * var13;
      var13 = var0[var1 + 6] + var0[var1 + 15];
      var14 = var0[var1 + 7] - var0[var1 + 14];
      float var25 = var7 * var13 - var8 * var14;
      float var26 = var7 * var14 + var8 * var13;
      var13 = var9 + var15;
      var14 = var10 + var16;
      float var27 = var19 + var23;
      float var28 = var20 + var24;
      var0[var1] = var13 + var27;
      var0[var1 + 1] = var14 + var28;
      var0[var1 + 2] = var13 - var27;
      var0[var1 + 3] = var14 - var28;
      var13 = var9 - var15;
      var14 = var10 - var16;
      var27 = var19 - var23;
      var28 = var20 - var24;
      var0[var1 + 4] = var13 - var28;
      var0[var1 + 5] = var14 + var27;
      var0[var1 + 6] = var13 + var28;
      var0[var1 + 7] = var14 - var27;
      var13 = var11 - var18;
      var14 = var12 + var17;
      var27 = var21 - var25;
      var28 = var22 - var26;
      var0[var1 + 8] = var13 + var27;
      var0[var1 + 9] = var14 + var28;
      var0[var1 + 10] = var13 - var27;
      var0[var1 + 11] = var14 - var28;
      var13 = var11 + var18;
      var14 = var12 - var17;
      var27 = var21 + var25;
      var28 = var22 + var26;
      var0[var1 + 12] = var13 - var28;
      var0[var1 + 13] = var14 + var27;
      var0[var1 + 14] = var13 + var28;
      var0[var1 + 15] = var14 - var27;
   }

   public static void method26019(Class2378 var0, long var1, Class2378 var3, long var4) {
      float var8 = var3.method9651(var4 + 1L);
      float var9 = var3.method9651(var4 + 2L);
      float var10 = var3.method9651(var4 + 3L);
      float var11 = var0.method9651(var1) - var0.method9651(var1 + 9L);
      float var12 = var0.method9651(var1 + 1L) + var0.method9651(var1 + 8L);
      float var13 = var0.method9651(var1) + var0.method9651(var1 + 9L);
      float var14 = var0.method9651(var1 + 1L) - var0.method9651(var1 + 8L);
      float var15 = var0.method9651(var1 + 4L) - var0.method9651(var1 + 13L);
      float var16 = var0.method9651(var1 + 5L) + var0.method9651(var1 + 12L);
      float var17 = var8 * (var15 - var16);
      float var18 = var8 * (var16 + var15);
      var15 = var0.method9651(var1 + 4L) + var0.method9651(var1 + 13L);
      var16 = var0.method9651(var1 + 5L) - var0.method9651(var1 + 12L);
      float var19 = var8 * (var15 - var16);
      float var20 = var8 * (var16 + var15);
      var15 = var0.method9651(var1 + 2L) - var0.method9651(var1 + 11L);
      var16 = var0.method9651(var1 + 3L) + var0.method9651(var1 + 10L);
      float var21 = var9 * var15 - var10 * var16;
      float var22 = var9 * var16 + var10 * var15;
      var15 = var0.method9651(var1 + 2L) + var0.method9651(var1 + 11L);
      var16 = var0.method9651(var1 + 3L) - var0.method9651(var1 + 10L);
      float var23 = var10 * var15 - var9 * var16;
      float var24 = var10 * var16 + var9 * var15;
      var15 = var0.method9651(var1 + 6L) - var0.method9651(var1 + 15L);
      var16 = var0.method9651(var1 + 7L) + var0.method9651(var1 + 14L);
      float var25 = var10 * var15 - var9 * var16;
      float var26 = var10 * var16 + var9 * var15;
      var15 = var0.method9651(var1 + 6L) + var0.method9651(var1 + 15L);
      var16 = var0.method9651(var1 + 7L) - var0.method9651(var1 + 14L);
      float var27 = var9 * var15 - var10 * var16;
      float var28 = var9 * var16 + var10 * var15;
      var15 = var11 + var17;
      var16 = var12 + var18;
      float var29 = var21 + var25;
      float var30 = var22 + var26;
      var0.method9685(var1, var15 + var29);
      var0.method9685(var1 + 1L, var16 + var30);
      var0.method9685(var1 + 2L, var15 - var29);
      var0.method9685(var1 + 3L, var16 - var30);
      var15 = var11 - var17;
      var16 = var12 - var18;
      var29 = var21 - var25;
      var30 = var22 - var26;
      var0.method9685(var1 + 4L, var15 - var30);
      var0.method9685(var1 + 5L, var16 + var29);
      var0.method9685(var1 + 6L, var15 + var30);
      var0.method9685(var1 + 7L, var16 - var29);
      var15 = var13 - var20;
      var16 = var14 + var19;
      var29 = var23 - var27;
      var30 = var24 - var28;
      var0.method9685(var1 + 8L, var15 + var29);
      var0.method9685(var1 + 9L, var16 + var30);
      var0.method9685(var1 + 10L, var15 - var29);
      var0.method9685(var1 + 11L, var16 - var30);
      var15 = var13 + var20;
      var16 = var14 - var19;
      var29 = var23 + var27;
      var30 = var24 + var28;
      var0.method9685(var1 + 12L, var15 - var30);
      var0.method9685(var1 + 13L, var16 + var29);
      var0.method9685(var1 + 14L, var15 + var30);
      var0.method9685(var1 + 15L, var16 - var29);
   }

   public static void method26020(float[] var0, int var1) {
      float var4 = var0[var1] + var0[var1 + 4];
      float var5 = var0[var1 + 1] + var0[var1 + 5];
      float var6 = var0[var1] - var0[var1 + 4];
      float var7 = var0[var1 + 1] - var0[var1 + 5];
      float var8 = var0[var1 + 2] + var0[var1 + 6];
      float var9 = var0[var1 + 3] + var0[var1 + 7];
      float var10 = var0[var1 + 2] - var0[var1 + 6];
      float var11 = var0[var1 + 3] - var0[var1 + 7];
      var0[var1] = var4 + var8;
      var0[var1 + 1] = var5 + var9;
      var0[var1 + 2] = var6 - var11;
      var0[var1 + 3] = var7 + var10;
      var0[var1 + 4] = var4 - var8;
      var0[var1 + 5] = var5 - var9;
      var0[var1 + 6] = var6 + var11;
      var0[var1 + 7] = var7 - var10;
   }

   public static void method26021(Class2378 var0, long var1) {
      float var5 = var0.method9651(var1) + var0.method9651(var1 + 4L);
      float var6 = var0.method9651(var1 + 1L) + var0.method9651(var1 + 5L);
      float var7 = var0.method9651(var1) - var0.method9651(var1 + 4L);
      float var8 = var0.method9651(var1 + 1L) - var0.method9651(var1 + 5L);
      float var9 = var0.method9651(var1 + 2L) + var0.method9651(var1 + 6L);
      float var10 = var0.method9651(var1 + 3L) + var0.method9651(var1 + 7L);
      float var11 = var0.method9651(var1 + 2L) - var0.method9651(var1 + 6L);
      float var12 = var0.method9651(var1 + 3L) - var0.method9651(var1 + 7L);
      var0.method9685(var1, var5 + var9);
      var0.method9685(var1 + 1L, var6 + var10);
      var0.method9685(var1 + 2L, var7 - var12);
      var0.method9685(var1 + 3L, var8 + var11);
      var0.method9685(var1 + 4L, var5 - var9);
      var0.method9685(var1 + 5L, var6 - var10);
      var0.method9685(var1 + 6L, var7 + var12);
      var0.method9685(var1 + 7L, var8 - var11);
   }

   public static void method26022(float[] var0, int var1) {
      float var4 = var0[var1] + var0[var1 + 4];
      float var5 = var0[var1 + 1] + var0[var1 + 5];
      float var6 = var0[var1] - var0[var1 + 4];
      float var7 = var0[var1 + 1] - var0[var1 + 5];
      float var8 = var0[var1 + 2] + var0[var1 + 6];
      float var9 = var0[var1 + 3] + var0[var1 + 7];
      float var10 = var0[var1 + 2] - var0[var1 + 6];
      float var11 = var0[var1 + 3] - var0[var1 + 7];
      var0[var1] = var4 + var8;
      var0[var1 + 1] = var5 + var9;
      var0[var1 + 2] = var6 + var11;
      var0[var1 + 3] = var7 - var10;
      var0[var1 + 4] = var4 - var8;
      var0[var1 + 5] = var5 - var9;
      var0[var1 + 6] = var6 - var11;
      var0[var1 + 7] = var7 + var10;
   }

   public static void method26023(Class2378 var0, long var1) {
      float var5 = var0.method9651(var1) + var0.method9651(var1 + 4L);
      float var6 = var0.method9651(var1 + 1L) + var0.method9651(var1 + 5L);
      float var7 = var0.method9651(var1) - var0.method9651(var1 + 4L);
      float var8 = var0.method9651(var1 + 1L) - var0.method9651(var1 + 5L);
      float var9 = var0.method9651(var1 + 2L) + var0.method9651(var1 + 6L);
      float var10 = var0.method9651(var1 + 3L) + var0.method9651(var1 + 7L);
      float var11 = var0.method9651(var1 + 2L) - var0.method9651(var1 + 6L);
      float var12 = var0.method9651(var1 + 3L) - var0.method9651(var1 + 7L);
      var0.method9685(var1, var5 + var9);
      var0.method9685(var1 + 1L, var6 + var10);
      var0.method9685(var1 + 2L, var7 + var12);
      var0.method9685(var1 + 3L, var8 - var11);
      var0.method9685(var1 + 4L, var5 - var9);
      var0.method9685(var1 + 5L, var6 - var10);
      var0.method9685(var1 + 6L, var7 - var12);
      var0.method9685(var1 + 7L, var8 + var11);
   }

   public static void method26024(float[] var0, int var1) {
      float var4 = var0[var1] - var0[var1 + 2];
      float var5 = -var0[var1 + 1] + var0[var1 + 3];
      var0[var1] += var0[var1 + 2];
      var0[var1 + 1] = var0[var1 + 1] + var0[var1 + 3];
      var0[var1 + 2] = var4;
      var0[var1 + 3] = var5;
   }

   public static void method26025(Class2378 var0, long var1) {
      float var5 = var0.method9651(var1) - var0.method9651(var1 + 2L);
      float var6 = -var0.method9651(var1 + 1L) + var0.method9651(var1 + 3L);
      var0.method9685(var1, var0.method9651(var1) + var0.method9651(var1 + 2L));
      var0.method9685(var1 + 1L, var0.method9651(var1 + 1L) + var0.method9651(var1 + 3L));
      var0.method9685(var1 + 2L, var5);
      var0.method9685(var1 + 3L, var6);
   }

   public static void method26026(float[] var0, int var1) {
      float var4 = var0[var1] - var0[var1 + 2];
      float var5 = var0[var1 + 1] - var0[var1 + 3];
      var0[var1] += var0[var1 + 2];
      var0[var1 + 1] = var0[var1 + 1] + var0[var1 + 3];
      var0[var1 + 2] = var4;
      var0[var1 + 3] = var5;
   }

   public static void method26027(Class2378 var0, long var1) {
      float var5 = var0.method9651(var1) - var0.method9651(var1 + 2L);
      float var6 = var0.method9651(var1 + 1L) - var0.method9651(var1 + 3L);
      var0.method9685(var1, var0.method9651(var1) + var0.method9651(var1 + 2L));
      var0.method9685(var1 + 1L, var0.method9651(var1 + 1L) + var0.method9651(var1 + 3L));
      var0.method9685(var1 + 2L, var5);
      var0.method9685(var1 + 3L, var6);
   }

   public static void method26028(float[] var0, int var1) {
      float var4 = var0[var1] - var0[var1 + 2];
      float var5 = var0[var1 + 1] + var0[var1 + 3];
      var0[var1] += var0[var1 + 2];
      var0[var1 + 1] = var0[var1 + 1] - var0[var1 + 3];
      var0[var1 + 2] = var4;
      var0[var1 + 3] = var5;
   }

   public static void method26029(Class2378 var0, long var1) {
      float var5 = var0.method9651(var1) - var0.method9651(var1 + 2L);
      float var6 = var0.method9651(var1 + 1L) + var0.method9651(var1 + 3L);
      var0.method9685(var1, var0.method9651(var1) + var0.method9651(var1 + 2L));
      var0.method9685(var1 + 1L, var0.method9651(var1 + 1L) - var0.method9651(var1 + 3L));
      var0.method9685(var1 + 2L, var5);
      var0.method9685(var1 + 3L, var6);
   }

   public static void method26030(int var0, float[] var1, int var2, int var3, float[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (int var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         float var13 = 0.5F - var4[var5 + var3 - var10];
         float var14 = var4[var5 + var10];
         int var15 = var2 + var11;
         int var16 = var2 + var12;
         float var17 = var1[var15] - var1[var16];
         float var18 = var1[var15 + 1] + var1[var16 + 1];
         float var19 = var13 * var17 - var14 * var18;
         float var20 = var13 * var18 + var14 * var17;
         var1[var15] -= var19;
         var1[var15 + 1] = var20 - var1[var15 + 1];
         var1[var16] += var19;
         var1[var16 + 1] = var20 - var1[var16 + 1];
      }

      var1[var2 + var8 + 1] = -var1[var2 + var8 + 1];
   }

   public static void method26031(long var0, Class2378 var2, long var3, long var5, Class2378 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         float var22 = 0.5F - var7.method9651(var8 + var5 - var16);
         float var23 = var7.method9651(var8 + var16);
         long var24 = var3 + var18;
         long var26 = var3 + var20;
         float var28 = var2.method9651(var24) - var2.method9651(var26);
         float var29 = var2.method9651(var24 + 1L) + var2.method9651(var26 + 1L);
         float var30 = var22 * var28 - var23 * var29;
         float var31 = var22 * var29 + var23 * var28;
         var2.method9685(var24, var2.method9651(var24) - var30);
         var2.method9685(var24 + 1L, var31 - var2.method9651(var24 + 1L));
         var2.method9685(var26, var2.method9651(var26) + var30);
         var2.method9685(var26 + 1L, var31 - var2.method9651(var26 + 1L));
      }

      var2.method9685(var3 + var12 + 1L, -var2.method9651(var3 + var12 + 1L));
   }

   public static void method26032(int var0, float[] var1, int var2, int var3, float[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = 2 * var3 / var8;
      int var10 = 0;

      for (int var11 = 2; var11 < var8; var11 += 2) {
         int var12 = var0 - var11;
         var10 += var9;
         float var13 = 0.5F - var4[var5 + var3 - var10];
         float var14 = var4[var5 + var10];
         int var15 = var2 + var11;
         int var16 = var2 + var12;
         float var17 = var1[var15] - var1[var16];
         float var18 = var1[var15 + 1] + var1[var16 + 1];
         float var19 = var13 * var17 - var14 * var18;
         float var20 = var13 * var18 + var14 * var17;
         var1[var15] -= var19;
         var1[var15 + 1] = var1[var15 + 1] - var20;
         var1[var16] += var19;
         var1[var16 + 1] = var1[var16 + 1] - var20;
      }
   }

   public static void method26033(long var0, Class2378 var2, long var3, long var5, Class2378 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = 2L * var5 / var12;
      long var16 = 0L;

      for (long var18 = 2L; var18 < var12; var18 += 2L) {
         long var20 = var0 - var18;
         var16 += var14;
         float var22 = 0.5F - var7.method9651(var8 + var5 - var16);
         float var23 = var7.method9651(var8 + var16);
         long var24 = var3 + var18;
         long var26 = var3 + var20;
         float var28 = var2.method9651(var24) - var2.method9651(var26);
         float var29 = var2.method9651(var24 + 1L) + var2.method9651(var26 + 1L);
         float var30 = var22 * var28 - var23 * var29;
         float var31 = var22 * var29 + var23 * var28;
         var2.method9685(var24, var2.method9651(var24) - var30);
         var2.method9685(var24 + 1L, var2.method9651(var24 + 1L) - var31);
         var2.method9685(var26, var2.method9651(var26) + var30);
         var2.method9685(var26 + 1L, var2.method9651(var26 + 1L) - var31);
      }
   }

   public static void method26034(int var0, float[] var1, int var2, int var3, float[] var4, int var5) {
      int var8 = var0 >> 1;
      int var9 = var3 / var0;
      int var10 = 0;

      for (int var11 = 1; var11 < var8; var11++) {
         int var12 = var0 - var11;
         var10 += var9;
         int var13 = var5 + var10;
         int var14 = var2 + var11;
         int var15 = var2 + var12;
         float var16 = var4[var13] - var4[var5 + var3 - var10];
         float var17 = var4[var13] + var4[var5 + var3 - var10];
         float var18 = var17 * var1[var14] - var16 * var1[var15];
         var1[var14] = var16 * var1[var14] + var17 * var1[var15];
         var1[var15] = var18;
      }

      var1[var2 + var8] = var1[var2 + var8] * var4[var5];
   }

   public static void method26035(long var0, Class2378 var2, long var3, long var5, Class2378 var7, long var8) {
      long var12 = var0 >> 1;
      long var14 = var5 / var0;
      long var16 = 0L;

      for (long var18 = 1L; var18 < var12; var18++) {
         long var20 = var0 - var18;
         var16 += var14;
         long var22 = var8 + var16;
         long var24 = var3 + var18;
         long var26 = var3 + var20;
         float var28 = var7.method9651(var22) - var7.method9651(var8 + var5 - var16);
         float var29 = var7.method9651(var22) + var7.method9651(var8 + var5 - var16);
         float var30 = var29 * var2.method9651(var24) - var28 * var2.method9651(var26);
         var2.method9685(var24, var28 * var2.method9651(var24) + var29 * var2.method9651(var26));
         var2.method9685(var26, var30);
      }

      var2.method9685(var3 + var12, var2.method9651(var3 + var12) * var7.method9651(var8));
   }

   public static void method26036(int var0, double var1, double[] var3, int var4, boolean var5) {
      int var8 = Class7008.method21726();
      int var9;
      if (var5) {
         var9 = 2 * var0;
      } else {
         var9 = var0;
      }

      if (var8 > 1 && (long)var9 > method25891()) {
         byte var17 = 2;
         int var10 = var9 / var17;
         Future[] var18 = new Future[var17];

         for (int var19 = 0; var19 < var17; var19++) {
            int var13 = var4 + var19 * var10;
            int var14 = var19 == var17 - 1 ? var4 + var9 : var13 + var10;
            var18[var19] = Class7008.method21729(new Class785(var13, var14, var3, var1));
         }

         try {
            Class7008.method21730(var18);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var16);
         }
      } else {
         int var11 = var4 + var9;

         for (int var12 = var4; var12 < var11; var12++) {
            var3[var12] *= var1;
         }
      }
   }

   public static void method26037(long var0, double var2, Class2381 var4, long var5, boolean var7) {
      int var10 = Class7008.method21726();
      long var11;
      if (var7) {
         var11 = 2L * var0;
      } else {
         var11 = var0;
      }

      if (var10 > 1 && var11 >= method25891()) {
         long var23 = var11 / (long)var10;
         Future[] var15 = new Future[var10];

         for (int var16 = 0; var16 < var10; var16++) {
            long var17 = var5 + (long)var16 * var23;
            long var19 = var16 == var10 - 1 ? var5 + var11 : var17 + var23;
            var15[var16] = Class7008.method21729(new Class740(var17, var19, var4, var2));
         }

         try {
            Class7008.method21730(var15);
         } catch (InterruptedException var21) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var21);
         } catch (ExecutionException var22) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var22);
         }
      } else {
         for (long var13 = var5; var13 < var5 + var11; var13++) {
            var4.method9687(var13, var4.method9653(var13) * var2);
         }
      }
   }

   public static void method26038(int var0, float var1, float[] var2, int var3, boolean var4) {
      int var7 = Class7008.method21726();
      int var8;
      if (var4) {
         var8 = 2 * var0;
      } else {
         var8 = var0;
      }

      if (var7 > 1 && (long)var8 > method25891()) {
         byte var16 = 2;
         int var9 = var8 / var16;
         Future[] var17 = new Future[var16];

         for (int var18 = 0; var18 < var16; var18++) {
            int var12 = var3 + var18 * var9;
            int var13 = var18 == var16 - 1 ? var3 + var8 : var12 + var9;
            var17[var18] = Class7008.method21729(new Class1526(var12, var13, var2, var1));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var15);
         }
      } else {
         int var10 = var3 + var8;

         for (int var11 = var3; var11 < var10; var11++) {
            var2[var11] *= var1;
         }
      }
   }

   public static void method26039(long var0, float var2, Class2378 var3, long var4, boolean var6) {
      int var9 = Class7008.method21726();
      long var10;
      if (var6) {
         var10 = 2L * var0;
      } else {
         var10 = var0;
      }

      if (var9 > 1 && var10 >= method25891()) {
         long var22 = var10 / (long)var9;
         Future[] var14 = new Future[var9];

         for (int var15 = 0; var15 < var9; var15++) {
            long var16 = var4 + (long)var15 * var22;
            long var18 = var15 == var9 - 1 ? var4 + var10 : var16 + var22;
            var14[var15] = Class7008.method21729(new Class504(var16, var18, var3, var2));
         }

         try {
            Class7008.method21730(var14);
         } catch (InterruptedException var20) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(Class7796.class.getName()).log(Level.SEVERE, null, var21);
         }
      } else {
         for (long var12 = var4; var12 < var4 + var10; var12++) {
            var3.method9687(var12, var3.method9653(var12) * (double)var2);
         }
      }
   }
}
