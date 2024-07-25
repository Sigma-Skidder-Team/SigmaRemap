package remapped;

import java.util.function.IntToLongFunction;

public class class_4847 {
   private static String[] field_24176;
   private static final int[] field_24177 = new int[]{
      -1,
      -1,
      0,
      Integer.MIN_VALUE,
      0,
      0,
      1431655765,
      1431655765,
      0,
      Integer.MIN_VALUE,
      0,
      1,
      858993459,
      858993459,
      0,
      715827882,
      715827882,
      0,
      613566756,
      613566756,
      0,
      Integer.MIN_VALUE,
      0,
      2,
      477218588,
      477218588,
      0,
      429496729,
      429496729,
      0,
      390451572,
      390451572,
      0,
      357913941,
      357913941,
      0,
      330382099,
      330382099,
      0,
      306783378,
      306783378,
      0,
      286331153,
      286331153,
      0,
      Integer.MIN_VALUE,
      0,
      3,
      252645135,
      252645135,
      0,
      238609294,
      238609294,
      0,
      226050910,
      226050910,
      0,
      214748364,
      214748364,
      0,
      204522252,
      204522252,
      0,
      195225786,
      195225786,
      0,
      186737708,
      186737708,
      0,
      178956970,
      178956970,
      0,
      171798691,
      171798691,
      0,
      165191049,
      165191049,
      0,
      159072862,
      159072862,
      0,
      153391689,
      153391689,
      0,
      148102320,
      148102320,
      0,
      143165576,
      143165576,
      0,
      138547332,
      138547332,
      0,
      Integer.MIN_VALUE,
      0,
      4,
      130150524,
      130150524,
      0,
      126322567,
      126322567,
      0,
      122713351,
      122713351,
      0,
      119304647,
      119304647,
      0,
      116080197,
      116080197,
      0,
      113025455,
      113025455,
      0,
      110127366,
      110127366,
      0,
      107374182,
      107374182,
      0,
      104755299,
      104755299,
      0,
      102261126,
      102261126,
      0,
      99882960,
      99882960,
      0,
      97612893,
      97612893,
      0,
      95443717,
      95443717,
      0,
      93368854,
      93368854,
      0,
      91382282,
      91382282,
      0,
      89478485,
      89478485,
      0,
      87652393,
      87652393,
      0,
      85899345,
      85899345,
      0,
      84215045,
      84215045,
      0,
      82595524,
      82595524,
      0,
      81037118,
      81037118,
      0,
      79536431,
      79536431,
      0,
      78090314,
      78090314,
      0,
      76695844,
      76695844,
      0,
      75350303,
      75350303,
      0,
      74051160,
      74051160,
      0,
      72796055,
      72796055,
      0,
      71582788,
      71582788,
      0,
      70409299,
      70409299,
      0,
      69273666,
      69273666,
      0,
      68174084,
      68174084,
      0,
      Integer.MIN_VALUE,
      0,
      5
   };

   private class_4847() {
      throw new AssertionError();
   }

   public static long[] method_22286(int var0, int var1, IntToLongFunction var2) {
      long var5 = (1L << var0) - 1L;
      char var7 = (char)(64 / var0);
      int var8 = 3 * (var7 - 1);
      long var9 = Integer.toUnsignedLong(field_24177[var8]);
      long var11 = Integer.toUnsignedLong(field_24177[var8 + 1]);
      int var13 = field_24177[var8 + 2];
      int var14 = (var1 + var7 - 1) / var7;
      long[] var15 = new long[var14];

      for (int var16 = 0; var16 < var1; var16++) {
         long var17 = var2.applyAsLong(var16);
         int var19 = (int)((long)var16 * var9 + var11 >> 32 >> var13);
         int var20 = (var16 - var19 * var7) * var0;
         var15[var19] = var15[var19] & ~(var5 << var20) | (var17 & var5) << var20;
      }

      return var15;
   }

   public static void method_22290(int var0, int var1, long[] var2, class_2756 var3) {
      long var6 = (1L << var0) - 1L;
      char var8 = (char)(64 / var0);
      int var9 = 3 * (var8 - 1);
      long var10 = Integer.toUnsignedLong(field_24177[var9]);
      long var12 = Integer.toUnsignedLong(field_24177[var9 + 1]);
      int var14 = field_24177[var9 + 2];

      for (int var15 = 0; var15 < var1; var15++) {
         int var16 = (int)((long)var15 * var10 + var12 >> 32 >> var14);
         int var17 = (var15 - var16 * var8) * var0;
         int var18 = (int)(var2[var16] >> var17 & var6);
         var3.method_12550(var15, var18);
      }
   }

   public static long[] method_22287(int var0, int var1, IntToLongFunction var2) {
      long var5 = (1L << var0) - 1L;
      long[] var7 = new long[(int)Math.ceil((double)(var1 * var0) / 64.0)];

      for (int var8 = 0; var8 < var1; var8++) {
         long var9 = var2.applyAsLong(var8);
         int var11 = var8 * var0;
         int var12 = var11 / 64;
         int var13 = ((var8 + 1) * var0 - 1) / 64;
         int var14 = var11 % 64;
         var7[var12] = var7[var12] & ~(var5 << var14) | (var9 & var5) << var14;
         if (var12 != var13) {
            int var15 = 64 - var14;
            var7[var13] = var7[var13] >>> var15 << var15 | (var9 & var5) >> var15;
         }
      }

      return var7;
   }

   public static void method_22288(int var0, int var1, long[] var2, class_2756 var3) {
      long var6 = (1L << var0) - 1L;

      for (int var8 = 0; var8 < var1; var8++) {
         int var9 = var8 * var0;
         int var10 = var9 / 64;
         int var11 = ((var8 + 1) * var0 - 1) / 64;
         int var12 = var9 % 64;
         int var14;
         if (var10 != var11) {
            int var13 = 64 - var12;
            var14 = (int)((var2[var10] >>> var12 | var2[var11] << var13) & var6);
         } else {
            var14 = (int)(var2[var10] >>> var12 & var6);
         }

         var3.method_12550(var8, var14);
      }
   }
}
