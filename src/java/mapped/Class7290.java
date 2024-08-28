package mapped;

import java.util.Arrays;

public class Class7290 {
   private static String[] field31269;
   public static final int field31270 = 64;
   private static final byte[] field31271 = new byte[2048];
   public static int field31272;
   public static int field31273;
   public static int field31274;

   public static void method23050(Class6371 var0) {
      Class9524 var3 = new Class9524(var0, null);
      var0.method19360(Class1932.field12190, new Class3915());
      var0.method19360(Class1932.field12191, new Class3909());
      var0.method19360(Class1932.field12192, new Class3852(var0));
      var0.method19360(Class1932.field12193, new Class3823(var0));
      var0.method19360(Class1932.field12195, new Class3866());
      var3.method36801(Class1932.field12197);
      var0.method19360(Class1932.field12212, new Class3932());
      var0.method19360(Class1932.field12216, new Class3790(var0));
      var0.method19360(Class1932.field12217, new Class3906(var0));
      var0.method19360(Class1932.field12219, new Class4028(var0));
      var0.method19360(Class1932.field12220, new Class3969());
      var0.method19360(Class1932.field12238, new Class3918(var0));
      var0.method19360(Class1932.field12255, new Class3971());
   }

   private static long[] method23051(int[] var0) {
      return Class8505.method30110(9, var0.length, var1 -> (long)var0[var1]);
   }

   private static void method23052(Class8173 var0, Class8225 var1, int var2, int var3, int var4, int var5) {
      int var8 = 0;
      int var9 = 0;

      for (Class1983 var13 : Class1983.values()) {
         Class7873 var14 = var1.method28643();
         Class7873 var15 = var1.method28641();
         int var16 = var3 + var13.method8266();
         int var17 = var4 + var13.method8267();
         int var18 = var5 + var13.method8268();
         if (var13.method8266() == 0) {
            if (var13.method8267() == 0) {
               if (var13.method8268() != 0 && (var18 == 16 || var18 == -1)) {
                  continue;
               }
            } else if (var17 == 16 || var17 == -1) {
               if (var17 != 16) {
                  var2--;
                  var17 = 15;
               } else {
                  var2++;
                  var17 = 0;
               }

               if (var2 == 16 || var2 == -1) {
                  continue;
               }

               Class8225 var19 = var0.method28446()[var2];
               if (var19 == null) {
                  continue;
               }

               var14 = var19.method28643();
               var15 = var19.method28641();
            }
         } else if (var16 == 16 || var16 == -1) {
            continue;
         }

         if (var15 != null && var9 != 15) {
            byte var21 = var15.method26402(var16, var17, var18);
            if (var21 != 15) {
               if (var21 > var9) {
                  var9 = var21 - 1;
               }
            } else {
               var9 = 14;
            }
         }

         if (var14 != null && var8 != 15) {
            byte var22 = var14.method26402(var16, var17, var18);
            if (var22 != 15) {
               if (var22 > var8) {
                  var8 = var22 - 1;
               }
            } else if (var13.method8267() != 1) {
               var8 = 14;
            } else {
               var8 = 15;
            }
         }
      }

      if (var8 != 0) {
         if (!var1.method28649()) {
            byte[] var20 = new byte[2028];
            var1.method28639(var20);
         }

         var1.method28643().method26404(var3, var4, var5, var8);
      }

      if (var9 != 0) {
         var1.method28641().method26404(var3, var4, var5, var9);
      }
   }

   private static long method23053(int var0, int var1) {
      return ((long)var0 & 67108863L) << 38 | (long)var1 & 67108863L;
   }

   // $VF: synthetic method
   public static void method23055(Class8173 var0, Class8225 var1, int var2, int var3, int var4, int var5) {
      method23052(var0, var1, var2, var3, var4, var5);
   }

   // $VF: synthetic method
   public static long[] method23056(int[] var0) {
      return method23051(var0);
   }

   // $VF: synthetic method
   public static byte[] method23057() {
      return field31271;
   }

   static {
      Arrays.fill(field31271, (byte)-1);
   }
}
