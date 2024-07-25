package remapped;

import java.util.IdentityHashMap;
import java.util.Map;

public class class_4841 {
   private static String[] field_24160;
   private static final int field_24158 = 0;
   private static final int field_24161 = 1;
   private static final int field_24159 = 2;
   private static final int field_24157 = 3;
   private static final int field_24162 = 4;

   public static class_5024[] method_22266(int var0, class_1385 var1, int var2, class_5024 var3, class_4460 var4) {
      if (var1.field_7504 != null && var0 >= 0 && var0 < var1.field_7504.length) {
         int var7 = var1.field_7504[var0];
         if (var7 >= 0 && var7 <= var1.field_7503.length) {
            return method_22267(var7, var1.field_7503, var3, var4);
         }
      }

      switch (var0) {
         case 1:
            return method_22265(0, 3, var1.field_7503, var2, var3, var4);
         case 2:
            return method_22267(3, var1.field_7503, var3, var4);
         case 3:
            return method_22265(3, 0, var1.field_7503, var2, var3, var4);
         case 4:
            return method_22271(0, 3, 2, 4, var1.field_7503, var2, var3, var4);
         case 5:
            return method_22271(3, 0, 4, 2, var1.field_7503, var2, var3, var4);
         case 6:
            return method_22271(2, 4, 2, 4, var1.field_7503, var2, var3, var4);
         case 7:
            return method_22271(3, 3, 4, 4, var1.field_7503, var2, var3, var4);
         case 8:
            return method_22271(4, 1, 4, 4, var1.field_7503, var2, var3, var4);
         case 9:
            return method_22271(4, 4, 4, 1, var1.field_7503, var2, var3, var4);
         case 10:
            return method_22271(1, 4, 1, 4, var1.field_7503, var2, var3, var4);
         case 11:
            return method_22271(1, 1, 4, 4, var1.field_7503, var2, var3, var4);
         case 12:
            return method_22275(0, 2, var1.field_7503, var2, var3, var4);
         case 13:
            return method_22271(0, 3, 2, 1, var1.field_7503, var2, var3, var4);
         case 14:
            return method_22275(3, 1, var1.field_7503, var2, var3, var4);
         case 15:
            return method_22271(3, 0, 1, 2, var1.field_7503, var2, var3, var4);
         case 16:
            return method_22271(2, 4, 0, 3, var1.field_7503, var2, var3, var4);
         case 17:
            return method_22271(4, 2, 3, 0, var1.field_7503, var2, var3, var4);
         case 18:
            return method_22271(4, 4, 3, 3, var1.field_7503, var2, var3, var4);
         case 19:
            return method_22271(4, 2, 4, 2, var1.field_7503, var2, var3, var4);
         case 20:
            return method_22271(1, 4, 4, 4, var1.field_7503, var2, var3, var4);
         case 21:
            return method_22271(4, 4, 1, 4, var1.field_7503, var2, var3, var4);
         case 22:
            return method_22271(4, 4, 1, 1, var1.field_7503, var2, var3, var4);
         case 23:
            return method_22271(4, 1, 4, 1, var1.field_7503, var2, var3, var4);
         case 24:
            return method_22267(2, var1.field_7503, var3, var4);
         case 25:
            return method_22265(2, 1, var1.field_7503, var2, var3, var4);
         case 26:
            return method_22267(1, var1.field_7503, var3, var4);
         case 27:
            return method_22265(1, 2, var1.field_7503, var2, var3, var4);
         case 28:
            return method_22271(2, 4, 2, 1, var1.field_7503, var2, var3, var4);
         case 29:
            return method_22271(3, 3, 1, 4, var1.field_7503, var2, var3, var4);
         case 30:
            return method_22271(2, 1, 2, 4, var1.field_7503, var2, var3, var4);
         case 31:
            return method_22271(3, 3, 4, 1, var1.field_7503, var2, var3, var4);
         case 32:
            return method_22271(1, 1, 1, 4, var1.field_7503, var2, var3, var4);
         case 33:
            return method_22271(1, 1, 4, 1, var1.field_7503, var2, var3, var4);
         case 34:
            return method_22271(4, 1, 1, 4, var1.field_7503, var2, var3, var4);
         case 35:
            return method_22271(1, 4, 4, 1, var1.field_7503, var2, var3, var4);
         case 36:
            return method_22275(2, 0, var1.field_7503, var2, var3, var4);
         case 37:
            return method_22271(2, 1, 0, 3, var1.field_7503, var2, var3, var4);
         case 38:
            return method_22275(1, 3, var1.field_7503, var2, var3, var4);
         case 39:
            return method_22271(1, 2, 3, 0, var1.field_7503, var2, var3, var4);
         case 40:
            return method_22271(4, 1, 3, 3, var1.field_7503, var2, var3, var4);
         case 41:
            return method_22271(1, 2, 4, 2, var1.field_7503, var2, var3, var4);
         case 42:
            return method_22271(1, 4, 3, 3, var1.field_7503, var2, var3, var4);
         case 43:
            return method_22271(4, 2, 1, 2, var1.field_7503, var2, var3, var4);
         case 44:
            return method_22271(1, 4, 1, 1, var1.field_7503, var2, var3, var4);
         case 45:
            return method_22271(4, 1, 1, 1, var1.field_7503, var2, var3, var4);
         case 46:
            return method_22267(4, var1.field_7503, var3, var4);
         default:
            return method_22267(0, var1.field_7503, var3, var4);
      }
   }

   private static class_5024[] method_22265(int var0, int var1, class_5155[] var2, int var3, class_5024 var4, class_4460 var5) {
      return method_22270(class_7816.field_39659, var0, class_7816.field_39657, var1, var2, var3, var4, var5);
   }

   private static class_5024[] method_22275(int var0, int var1, class_5155[] var2, int var3, class_5024 var4, class_4460 var5) {
      return method_22270(class_7816.field_39649, var0, class_7816.field_39651, var1, var2, var3, var4, var5);
   }

   private static class_5024[] method_22271(int var0, int var1, int var2, int var3, class_5155[] var4, int var5, class_5024 var6, class_4460 var7) {
      if (var0 != var1) {
         if (var2 != var3) {
            if (var0 != var2) {
               return var1 != var3
                  ? method_22268(
                     class_7816.field_39655,
                     var0,
                     class_7816.field_39658,
                     var1,
                     class_7816.field_39654,
                     var2,
                     class_7816.field_39653,
                     var3,
                     var4,
                     var5,
                     var6,
                     var7
                  )
                  : method_22269(class_7816.field_39655, var0, class_7816.field_39654, var2, class_7816.field_39657, var1, var4, var5, var6, var7);
            } else {
               return var1 != var3
                  ? method_22269(class_7816.field_39659, var0, class_7816.field_39658, var1, class_7816.field_39653, var3, var4, var5, var6, var7)
                  : method_22270(class_7816.field_39659, var0, class_7816.field_39657, var1, var4, var5, var6, var7);
            }
         } else {
            return method_22269(class_7816.field_39655, var0, class_7816.field_39658, var1, class_7816.field_39651, var2, var4, var5, var6, var7);
         }
      } else {
         return var2 != var3
            ? method_22269(class_7816.field_39649, var0, class_7816.field_39654, var2, class_7816.field_39653, var3, var4, var5, var6, var7)
            : method_22270(class_7816.field_39649, var0, class_7816.field_39651, var2, var4, var5, var6, var7);
      }
   }

   private static class_5024[] method_22267(int var0, class_5155[] var1, class_5024 var2, class_4460 var3) {
      class_5155 var6 = var1[var0];
      return class_9049.method_41583(var6, var2, var3);
   }

   private static class_5024[] method_22270(class_7816 var0, int var1, class_7816 var2, int var3, class_5155[] var4, int var5, class_5024 var6, class_4460 var7) {
      class_5024 var10 = method_22274(var4[var1], var0, var5, var6, var7);
      class_5024 var11 = method_22274(var4[var3], var2, var5, var6, var7);
      return var7.method_20684(var10, var11);
   }

   private static class_5024[] method_22269(
      class_7816 var0, int var1, class_7816 var2, int var3, class_7816 var4, int var5, class_5155[] var6, int var7, class_5024 var8, class_4460 var9
   ) {
      class_5024 var12 = method_22274(var6[var1], var0, var7, var8, var9);
      class_5024 var13 = method_22274(var6[var3], var2, var7, var8, var9);
      class_5024 var14 = method_22274(var6[var5], var4, var7, var8, var9);
      return var9.method_20685(var12, var13, var14);
   }

   private static class_5024[] method_22268(
      class_7816 var0,
      int var1,
      class_7816 var2,
      int var3,
      class_7816 var4,
      int var5,
      class_7816 var6,
      int var7,
      class_5155[] var8,
      int var9,
      class_5024 var10,
      class_4460 var11
   ) {
      class_5024 var14 = method_22274(var8[var1], var0, var9, var10, var11);
      class_5024 var15 = method_22274(var8[var3], var2, var9, var10, var11);
      class_5024 var16 = method_22274(var8[var5], var4, var9, var10, var11);
      class_5024 var17 = method_22274(var8[var7], var6, var9, var10, var11);
      return var11.method_20686(var14, var15, var16, var17);
   }

   private static class_5024 method_22274(class_5155 var0, class_7816 var1, int var2, class_5024 var3, class_4460 var4) {
      switch (var1) {
         case field_39649:
            return method_22273(var0, var1, 0, 0, 16, 8, var2, var3, var4);
         case field_39658:
            return method_22273(var0, var1, 8, 0, 16, 8, var2, var3, var4);
         case field_39657:
            return method_22273(var0, var1, 8, 0, 16, 16, var2, var3, var4);
         case field_39653:
            return method_22273(var0, var1, 8, 8, 16, 16, var2, var3, var4);
         case field_39651:
            return method_22273(var0, var1, 0, 8, 16, 16, var2, var3, var4);
         case field_39654:
            return method_22273(var0, var1, 0, 8, 8, 16, var2, var3, var4);
         case field_39659:
            return method_22273(var0, var1, 0, 0, 8, 16, var2, var3, var4);
         case field_39655:
            return method_22273(var0, var1, 0, 0, 8, 8, var2, var3, var4);
         default:
            return var3;
      }
   }

   private static class_5024 method_22273(class_5155 var0, class_7816 var1, int var2, int var3, int var4, int var5, int var6, class_5024 var7, class_4460 var8) {
      Map[][] var11 = class_9049.method_41570();
      if (var11 != null) {
         int var12 = var0.method_23624();
         if (var12 >= 0 && var12 < var11.length) {
            Map[] var13 = var11[var12];
            if (var13 == null) {
               var13 = new Map[class_7816.field_39652.length];
               var11[var12] = var13;
            }

            Object var14 = var13[var1.ordinal()];
            if (var14 == null) {
               var14 = new IdentityHashMap(1);
               var13[var1.ordinal()] = (Map)var14;
            }

            class_5024 var15 = (class_5024)var14.get(var7);
            if (var15 == null) {
               var15 = method_22272(var7, var0, var6, var2, var3, var4, var5);
               var14.put(var7, var15);
            }

            return var15;
         } else {
            return var7;
         }
      } else {
         return var7;
      }
   }

   private static class_5024 method_22272(class_5024 var0, class_5155 var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var9 = (int[])var0.method_23155().clone();
      class_5155 var10 = var0.method_23148();

      for (int var11 = 0; var11 < 4; var11++) {
         method_22276(var9, var11, var10, var1, var2, var3, var4, var5, var6);
      }

      return new class_5024(var9, var0.method_23160(), var0.method_23150(), var1, var0.method_23168());
   }

   private static void method_22276(int[] var0, int var1, class_5155 var2, class_5155 var3, int var4, int var5, int var6, int var7, int var8) {
      int var11 = var0.length / 4;
      int var12 = var11 * var1;
      float var13 = Float.intBitsToFloat(var0[var12 + 4]);
      float var14 = Float.intBitsToFloat(var0[var12 + 4 + 1]);
      double var15 = var2.method_23634(var13);
      double var17 = var2.method_23613(var14);
      float var19 = Float.intBitsToFloat(var0[var12 + 0]);
      float var20 = Float.intBitsToFloat(var0[var12 + 1]);
      float var21 = Float.intBitsToFloat(var0[var12 + 2]);
      float var22;
      float var23;
      switch (var4) {
         case 0:
            var22 = var19;
            var23 = 1.0F - var21;
            break;
         case 1:
            var22 = var19;
            var23 = var21;
            break;
         case 2:
            var22 = 1.0F - var19;
            var23 = 1.0F - var20;
            break;
         case 3:
            var22 = var19;
            var23 = 1.0F - var20;
            break;
         case 4:
            var22 = var21;
            var23 = 1.0F - var20;
            break;
         case 5:
            var22 = 1.0F - var21;
            var23 = 1.0F - var20;
            break;
         default:
            return;
      }

      float var24 = (float)var2.method_23625() / (var2.method_23619() - var2.method_23630());
      float var25 = (float)var2.method_23615() / (var2.method_23640() - var2.method_23642());
      float var26 = 4.0F / Math.max(var25, var24);
      float var27 = 16.0F * (1.0F - var26);
      float var28 = 16.0F * (1.0F - var26);
      if (var15 < (double)var5) {
         var22 = (float)((double)var22 + ((double)var5 - var15) / (double)var27);
         var15 = (double)var5;
      }

      if (var15 > (double)var7) {
         var22 = (float)((double)var22 - (var15 - (double)var7) / (double)var27);
         var15 = (double)var7;
      }

      if (var17 < (double)var6) {
         var23 = (float)((double)var23 + ((double)var6 - var17) / (double)var28);
         var17 = (double)var6;
      }

      if (var17 > (double)var8) {
         var23 = (float)((double)var23 - (var17 - (double)var8) / (double)var28);
         var17 = (double)var8;
      }

      switch (var4) {
         case 0:
            var19 = var22;
            var21 = 1.0F - var23;
            break;
         case 1:
            var19 = var22;
            var21 = var23;
            break;
         case 2:
            var19 = 1.0F - var22;
            var20 = 1.0F - var23;
            break;
         case 3:
            var19 = var22;
            var20 = 1.0F - var23;
            break;
         case 4:
            var21 = var22;
            var20 = 1.0F - var23;
            break;
         case 5:
            var21 = 1.0F - var22;
            var20 = 1.0F - var23;
            break;
         default:
            return;
      }

      var0[var12 + 4] = Float.floatToRawIntBits(var3.method_23602(var15));
      var0[var12 + 4 + 1] = Float.floatToRawIntBits(var3.method_23639(var17));
      var0[var12 + 0] = Float.floatToRawIntBits(var19);
      var0[var12 + 1] = Float.floatToRawIntBits(var20);
      var0[var12 + 2] = Float.floatToRawIntBits(var21);
   }
}
