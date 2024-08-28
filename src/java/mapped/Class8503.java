package mapped;

import java.util.IdentityHashMap;
import java.util.Map;

public class Class8503 {
   private static String[] field37185;
   private static final int field37186 = 0;
   private static final int field37187 = 1;
   private static final int field37188 = 2;
   private static final int field37189 = 3;
   private static final int field37190 = 4;

   public static Class8557[] method30093(int var0, Class7104 var1, int var2, Class8557 var3, Class8391 var4) {
      if (var1.field30562 != null && var0 >= 0 && var0 < var1.field30562.length) {
         int var7 = var1.field30562[var0];
         if (var7 >= 0 && var7 <= var1.field30573.length) {
            return method30097(var7, var1.field30573, var3, var4);
         }
      }

      switch (var0) {
         case 1:
            return method30094(0, 3, var1.field30573, var2, var3, var4);
         case 2:
            return method30097(3, var1.field30573, var3, var4);
         case 3:
            return method30094(3, 0, var1.field30573, var2, var3, var4);
         case 4:
            return method30096(0, 3, 2, 4, var1.field30573, var2, var3, var4);
         case 5:
            return method30096(3, 0, 4, 2, var1.field30573, var2, var3, var4);
         case 6:
            return method30096(2, 4, 2, 4, var1.field30573, var2, var3, var4);
         case 7:
            return method30096(3, 3, 4, 4, var1.field30573, var2, var3, var4);
         case 8:
            return method30096(4, 1, 4, 4, var1.field30573, var2, var3, var4);
         case 9:
            return method30096(4, 4, 4, 1, var1.field30573, var2, var3, var4);
         case 10:
            return method30096(1, 4, 1, 4, var1.field30573, var2, var3, var4);
         case 11:
            return method30096(1, 1, 4, 4, var1.field30573, var2, var3, var4);
         case 12:
            return method30095(0, 2, var1.field30573, var2, var3, var4);
         case 13:
            return method30096(0, 3, 2, 1, var1.field30573, var2, var3, var4);
         case 14:
            return method30095(3, 1, var1.field30573, var2, var3, var4);
         case 15:
            return method30096(3, 0, 1, 2, var1.field30573, var2, var3, var4);
         case 16:
            return method30096(2, 4, 0, 3, var1.field30573, var2, var3, var4);
         case 17:
            return method30096(4, 2, 3, 0, var1.field30573, var2, var3, var4);
         case 18:
            return method30096(4, 4, 3, 3, var1.field30573, var2, var3, var4);
         case 19:
            return method30096(4, 2, 4, 2, var1.field30573, var2, var3, var4);
         case 20:
            return method30096(1, 4, 4, 4, var1.field30573, var2, var3, var4);
         case 21:
            return method30096(4, 4, 1, 4, var1.field30573, var2, var3, var4);
         case 22:
            return method30096(4, 4, 1, 1, var1.field30573, var2, var3, var4);
         case 23:
            return method30096(4, 1, 4, 1, var1.field30573, var2, var3, var4);
         case 24:
            return method30097(2, var1.field30573, var3, var4);
         case 25:
            return method30094(2, 1, var1.field30573, var2, var3, var4);
         case 26:
            return method30097(1, var1.field30573, var3, var4);
         case 27:
            return method30094(1, 2, var1.field30573, var2, var3, var4);
         case 28:
            return method30096(2, 4, 2, 1, var1.field30573, var2, var3, var4);
         case 29:
            return method30096(3, 3, 1, 4, var1.field30573, var2, var3, var4);
         case 30:
            return method30096(2, 1, 2, 4, var1.field30573, var2, var3, var4);
         case 31:
            return method30096(3, 3, 4, 1, var1.field30573, var2, var3, var4);
         case 32:
            return method30096(1, 1, 1, 4, var1.field30573, var2, var3, var4);
         case 33:
            return method30096(1, 1, 4, 1, var1.field30573, var2, var3, var4);
         case 34:
            return method30096(4, 1, 1, 4, var1.field30573, var2, var3, var4);
         case 35:
            return method30096(1, 4, 4, 1, var1.field30573, var2, var3, var4);
         case 36:
            return method30095(2, 0, var1.field30573, var2, var3, var4);
         case 37:
            return method30096(2, 1, 0, 3, var1.field30573, var2, var3, var4);
         case 38:
            return method30095(1, 3, var1.field30573, var2, var3, var4);
         case 39:
            return method30096(1, 2, 3, 0, var1.field30573, var2, var3, var4);
         case 40:
            return method30096(4, 1, 3, 3, var1.field30573, var2, var3, var4);
         case 41:
            return method30096(1, 2, 4, 2, var1.field30573, var2, var3, var4);
         case 42:
            return method30096(1, 4, 3, 3, var1.field30573, var2, var3, var4);
         case 43:
            return method30096(4, 2, 1, 2, var1.field30573, var2, var3, var4);
         case 44:
            return method30096(1, 4, 1, 1, var1.field30573, var2, var3, var4);
         case 45:
            return method30096(4, 1, 1, 1, var1.field30573, var2, var3, var4);
         case 46:
            return method30097(4, var1.field30573, var3, var4);
         default:
            return method30097(0, var1.field30573, var3, var4);
      }
   }

   private static Class8557[] method30094(int var0, int var1, Class1713[] var2, int var3, Class8557 var4, Class8391 var5) {
      return method30098(Class1988.field12980, var0, Class1988.field12976, var1, var2, var3, var4, var5);
   }

   private static Class8557[] method30095(int var0, int var1, Class1713[] var2, int var3, Class8557 var4, Class8391 var5) {
      return method30098(Class1988.field12974, var0, Class1988.field12978, var1, var2, var3, var4, var5);
   }

   private static Class8557[] method30096(int var0, int var1, int var2, int var3, Class1713[] var4, int var5, Class8557 var6, Class8391 var7) {
      if (var0 != var1) {
         if (var2 != var3) {
            if (var0 != var2) {
               return var1 != var3
                  ? method30100(
                     Class1988.field12981, var0, Class1988.field12975, var1, Class1988.field12979, var2, Class1988.field12977, var3, var4, var5, var6, var7
                  )
                  : method30099(Class1988.field12981, var0, Class1988.field12979, var2, Class1988.field12976, var1, var4, var5, var6, var7);
            } else {
               return var1 != var3
                  ? method30099(Class1988.field12980, var0, Class1988.field12975, var1, Class1988.field12977, var3, var4, var5, var6, var7)
                  : method30098(Class1988.field12980, var0, Class1988.field12976, var1, var4, var5, var6, var7);
            }
         } else {
            return method30099(Class1988.field12981, var0, Class1988.field12975, var1, Class1988.field12978, var2, var4, var5, var6, var7);
         }
      } else {
         return var2 != var3
            ? method30099(Class1988.field12974, var0, Class1988.field12979, var2, Class1988.field12977, var3, var4, var5, var6, var7)
            : method30098(Class1988.field12974, var0, Class1988.field12978, var2, var4, var5, var6, var7);
      }
   }

   private static Class8557[] method30097(int var0, Class1713[] var1, Class8557 var2, Class8391 var3) {
      Class1713 var6 = var1[var0];
      return Class9619.method37444(var6, var2, var3);
   }

   private static Class8557[] method30098(Class1988 var0, int var1, Class1988 var2, int var3, Class1713[] var4, int var5, Class8557 var6, Class8391 var7) {
      Class8557 var10 = method30101(var4[var1], var0, var5, var6, var7);
      Class8557 var11 = method30101(var4[var3], var2, var5, var6, var7);
      return var7.method29430(var10, var11);
   }

   private static Class8557[] method30099(
      Class1988 var0, int var1, Class1988 var2, int var3, Class1988 var4, int var5, Class1713[] var6, int var7, Class8557 var8, Class8391 var9
   ) {
      Class8557 var12 = method30101(var6[var1], var0, var7, var8, var9);
      Class8557 var13 = method30101(var6[var3], var2, var7, var8, var9);
      Class8557 var14 = method30101(var6[var5], var4, var7, var8, var9);
      return var9.method29431(var12, var13, var14);
   }

   private static Class8557[] method30100(
      Class1988 var0,
      int var1,
      Class1988 var2,
      int var3,
      Class1988 var4,
      int var5,
      Class1988 var6,
      int var7,
      Class1713[] var8,
      int var9,
      Class8557 var10,
      Class8391 var11
   ) {
      Class8557 var14 = method30101(var8[var1], var0, var9, var10, var11);
      Class8557 var15 = method30101(var8[var3], var2, var9, var10, var11);
      Class8557 var16 = method30101(var8[var5], var4, var9, var10, var11);
      Class8557 var17 = method30101(var8[var7], var6, var9, var10, var11);
      return var11.method29432(var14, var15, var16, var17);
   }

   private static Class8557 method30101(Class1713 var0, Class1988 var1, int var2, Class8557 var3, Class8391 var4) {
      switch (Class9383.field43534[var1.ordinal()]) {
         case 1:
            return method30102(var0, var1, 0, 0, 16, 8, var2, var3, var4);
         case 2:
            return method30102(var0, var1, 8, 0, 16, 8, var2, var3, var4);
         case 3:
            return method30102(var0, var1, 8, 0, 16, 16, var2, var3, var4);
         case 4:
            return method30102(var0, var1, 8, 8, 16, 16, var2, var3, var4);
         case 5:
            return method30102(var0, var1, 0, 8, 16, 16, var2, var3, var4);
         case 6:
            return method30102(var0, var1, 0, 8, 8, 16, var2, var3, var4);
         case 7:
            return method30102(var0, var1, 0, 0, 8, 16, var2, var3, var4);
         case 8:
            return method30102(var0, var1, 0, 0, 8, 8, var2, var3, var4);
         default:
            return var3;
      }
   }

   private static Class8557 method30102(Class1713 var0, Class1988 var1, int var2, int var3, int var4, int var5, int var6, Class8557 var7, Class8391 var8) {
      Map[][] var11 = Class9619.method37468();
      if (var11 != null) {
         int var12 = var0.method7475();
         if (var12 >= 0 && var12 < var11.length) {
            Map[] var13 = var11[var12];
            if (var13 == null) {
               var13 = new Map[Class1988.field12982.length];
               var11[var12] = var13;
            }

            Map var14 = var13[var1.ordinal()];
            if (var14 == null) {
               var14 = new IdentityHashMap(1);
               var13[var1.ordinal()] = (Map)var14;
            }

            Class8557 var15 = (Class8557)var14.get(var7);
            if (var15 == null) {
               var15 = method30103(var7, var0, var6, var2, var3, var4, var5);
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

   private static Class8557 method30103(Class8557 var0, Class1713 var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var9 = (int[])var0.method30511().clone();
      Class1713 var10 = var0.method30516();

      for (int var11 = 0; var11 < 4; var11++) {
         method30104(var9, var11, var10, var1, var2, var3, var4, var5, var6);
      }

      return new Class8557(var9, var0.method30513(), var0.method30514(), var1, var0.method30515());
   }

   private static void method30104(int[] var0, int var1, Class1713 var2, Class1713 var3, int var4, int var5, int var6, int var7, int var8) {
      int var11 = var0.length / 4;
      int var12 = var11 * var1;
      float var13 = Float.intBitsToFloat(var0[var12 + 4]);
      float var14 = Float.intBitsToFloat(var0[var12 + 4 + 1]);
      double var15 = var2.method7482(var13);
      double var17 = var2.method7483(var14);
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

      float var24 = (float)var2.method7457() / (var2.method7460() - var2.method7459());
      float var25 = (float)var2.method7458() / (var2.method7463() - var2.method7462());
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

      var0[var12 + 4] = Float.floatToRawIntBits(var3.method7461(var15));
      var0[var12 + 4 + 1] = Float.floatToRawIntBits(var3.method7464(var17));
      var0[var12 + 0] = Float.floatToRawIntBits(var19);
      var0[var12 + 1] = Float.floatToRawIntBits(var20);
      var0[var12 + 2] = Float.floatToRawIntBits(var21);
   }
}
