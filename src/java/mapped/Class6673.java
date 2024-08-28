package mapped;

import java.util.Arrays;

public class Class6673 {
   private static int field29259 = 8;
   private static int field29260 = 200;
   private static int field29261 = 16;
   private static int field29262 = 65636;
   private static int field29263 = 65636;
   private static boolean field29264 = true;
   private static long[] field29265 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field29266 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field29267 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field29268 = false;

   private Class6673() {
   }

   public static void method20343(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field29259 = Integer.parseInt(var0[0]);
         field29262 = Integer.parseInt(var0[1]);
         field29263 = Integer.parseInt(var0[2]);
         field29260 = Integer.parseInt(var0[3]);
         field29264 = Boolean.parseBoolean(var0[4]);
         field29268 = Boolean.parseBoolean(var0[5]);
         field29261 = Integer.parseInt(var0[6]);
         field29265 = new long[field29261];
         field29266 = new long[field29261];
         field29267 = new long[field29261];

         for (int var3 = 0; var3 < field29261; var3++) {
            field29265[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field29261; var4++) {
            field29266[var4] = (long)Integer.parseInt(var0[7 + field29261 + var4]);
         }

         for (int var5 = 0; var5 < field29261; var5++) {
            field29267[var5] = (long)Integer.parseInt(var0[7 + field29261 + field29261 + var5]);
         }
      }

      Class7008.method21727(field29259);
      Class7796.method25897((long)field29262);
      Class7796.method25898((long)field29263);
      System.out.println("nthred = " + field29259);
      System.out.println("threadsBegin2D = " + field29262);
      System.out.println("threadsBegin3D = " + field29263);
      System.out.println("niter = " + field29260);
      System.out.println("doWarmup = " + field29264);
      System.out.println("doScaling = " + field29268);
      System.out.println("nsize = " + field29261);
      System.out.println("sizes1D[] = " + Arrays.toString(field29265));
      System.out.println("sizes2D[] = " + Arrays.toString(field29266));
      System.out.println("sizes3D[] = " + Arrays.toString(field29267));
   }

   public static void method20344() {
      double[] var2 = new double[field29261];
      double[] var3 = new double[field29261];

      for (int var4 = 0; var4 < field29261; var4++) {
         System.out.println("Forward DHT 1D of size " + field29265[var4]);
         if (field29264) {
            Class9049 var12 = new Class9049(field29265[var4]);
            double[] var8 = new double[(int)field29265[var4]];
            Class9836.method38845(field29265[var4], var8);
            var12.method33646(var8);
            Class9836.method38845(field29265[var4], var8);
            var12.method33646(var8);
         }

         long var5 = System.nanoTime();
         Class9049 var7 = new Class9049(field29265[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)field29265[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field29260; var11++) {
            Class9836.method38845(field29265[var4], var16);
            var5 = System.nanoTime();
            var7.method33646(var16);
            var5 = System.nanoTime() - var5;
            if ((double)var5 < var9) {
               var9 = (double)var5;
            }
         }

         var2[var4] = var9 / 1000000.0;
         var3[var4] += var2[var4];
         System.out.println("\tBest execution time without constructor: " + String.format("%.2f", var2[var4]) + " msec");
         System.out.println("\tBest execution time with constructor: " + String.format("%.2f", var3[var4]) + " msec");
         var16 = null;
         Object var15 = null;
         System.gc();
         Class7796.method25890(5000L);
      }

      Class9836.method38883("benchmarkDoubleForwardDHT_1D.txt", field29259, field29260, field29264, field29268, field29265, var2, var3);
   }

   public static void method20345() {
      double[] var2 = new double[field29261];
      double[] var3 = new double[field29261];

      for (int var4 = 0; var4 < field29261; var4++) {
         System.out.println("Forward DHT 2D (input 1D) of size " + field29266[var4] + " x " + field29266[var4]);
         if (field29264) {
            Class9186 var12 = new Class9186(field29266[var4], field29266[var4]);
            Class2381 var8 = new Class2381(field29266[var4] * field29266[var4], false);
            Class9836.method38851(field29266[var4], field29266[var4], var8);
            var12.method34364(var8);
            Class9836.method38851(field29266[var4], field29266[var4], var8);
            var12.method34364(var8);
         }

         long var5 = System.nanoTime();
         Class9186 var7 = new Class9186(field29266[var4], field29266[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var16 = new Class2381(field29266[var4] * field29266[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field29260; var11++) {
            Class9836.method38851(field29266[var4], field29266[var4], var16);
            var5 = System.nanoTime();
            var7.method34364(var16);
            var5 = System.nanoTime() - var5;
            if ((double)var5 < var9) {
               var9 = (double)var5;
            }
         }

         var2[var4] = var9 / 1000000.0;
         var3[var4] += var2[var4];
         System.out.println("\tBest execution time without constructor: " + String.format("%.2f", var2[var4]) + " msec");
         System.out.println("\tBest execution time with constructor: " + String.format("%.2f", var3[var4]) + " msec");
         var16 = null;
         Object var15 = null;
         System.gc();
         Class7796.method25890(5000L);
      }

      Class9836.method38883("benchmarkDoubleForwardDHT_2D_input_1D.txt", field29259, field29260, field29264, field29268, field29266, var2, var3);
   }

   public static void method20346() {
      double[] var2 = new double[field29261];
      double[] var3 = new double[field29261];

      for (int var4 = 0; var4 < field29261; var4++) {
         System.out.println("Forward DHT 2D (input 2D) of size " + field29266[var4] + " x " + field29266[var4]);
         if (field29264) {
            Class9186 var12 = new Class9186(field29266[var4], field29266[var4]);
            double[][] var8 = new double[(int)field29266[var4]][(int)field29266[var4]];
            Class9836.method38853(field29266[var4], field29266[var4], var8);
            var12.method34365(var8);
            Class9836.method38853(field29266[var4], field29266[var4], var8);
            var12.method34365(var8);
         }

         long var5 = System.nanoTime();
         Class9186 var7 = new Class9186(field29266[var4], field29266[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field29266[var4]][(int)field29266[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field29260; var11++) {
            Class9836.method38853(field29266[var4], field29266[var4], var16);
            var5 = System.nanoTime();
            var7.method34365(var16);
            var5 = System.nanoTime() - var5;
            if ((double)var5 < var9) {
               var9 = (double)var5;
            }
         }

         var2[var4] = var9 / 1000000.0;
         var3[var4] += var2[var4];
         System.out.println("\tBest execution time without constructor: " + String.format("%.2f", var2[var4]) + " msec");
         System.out.println("\tBest execution time with constructor: " + String.format("%.2f", var3[var4]) + " msec");
         var16 = (double[][])null;
         Object var15 = null;
         System.gc();
         Class7796.method25890(5000L);
      }

      Class9836.method38883("benchmarkDoubleForwardDHT_2D_input_2D.txt", field29259, field29260, field29264, field29268, field29266, var2, var3);
   }

   public static void method20347() {
      double[] var2 = new double[field29261];
      double[] var3 = new double[field29261];

      for (int var4 = 0; var4 < field29261; var4++) {
         System.out.println("Forward DHT 3D (input 1D) of size " + field29267[var4] + " x " + field29267[var4] + " x " + field29267[var4]);
         if (field29264) {
            Class8832 var12 = new Class8832(field29267[var4], field29267[var4], field29267[var4]);
            Class2381 var8 = new Class2381(field29267[var4] * field29267[var4] * field29267[var4], false);
            Class9836.method38856(field29267[var4], field29267[var4], field29267[var4], var8);
            var12.method31935(var8);
            Class9836.method38856(field29267[var4], field29267[var4], field29267[var4], var8);
            var12.method31935(var8);
         }

         long var5 = System.nanoTime();
         Class8832 var7 = new Class8832(field29267[var4], field29267[var4], field29267[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var16 = new Class2381(field29267[var4] * field29267[var4] * field29267[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field29260; var11++) {
            Class9836.method38856(field29267[var4], field29267[var4], field29267[var4], var16);
            var5 = System.nanoTime();
            var7.method31935(var16);
            var5 = System.nanoTime() - var5;
            if ((double)var5 < var9) {
               var9 = (double)var5;
            }
         }

         var2[var4] = var9 / 1000000.0;
         var3[var4] += var2[var4];
         System.out.println("\tBest execution time without constructor: " + String.format("%.2f", var2[var4]) + " msec");
         System.out.println("\tBest execution time with constructor: " + String.format("%.2f", var3[var4]) + " msec");
         var16 = null;
         Object var15 = null;
         System.gc();
         Class7796.method25890(5000L);
      }

      Class9836.method38883("benchmarkDoubleForwardDHT_3D_input_1D.txt", field29259, field29260, field29264, field29268, field29267, var2, var3);
   }

   public static void method20348() {
      double[] var2 = new double[field29261];
      double[] var3 = new double[field29261];

      for (int var4 = 0; var4 < field29261; var4++) {
         System.out.println("Forward DHT 3D (input 3D) of size " + field29267[var4] + " x " + field29267[var4] + " x " + field29267[var4]);
         if (field29264) {
            Class8832 var12 = new Class8832(field29267[var4], field29267[var4], field29267[var4]);
            double[][][] var8 = new double[(int)field29267[var4]][(int)field29267[var4]][(int)field29267[var4]];
            Class9836.method38859(field29267[var4], field29267[var4], field29267[var4], var8);
            var12.method31936(var8);
            Class9836.method38859(field29267[var4], field29267[var4], field29267[var4], var8);
            var12.method31936(var8);
         }

         long var5 = System.nanoTime();
         Class8832 var7 = new Class8832(field29267[var4], field29267[var4], field29267[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field29267[var4]][(int)field29267[var4]][(int)field29267[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field29260; var11++) {
            Class9836.method38859(field29267[var4], field29267[var4], field29267[var4], var16);
            var5 = System.nanoTime();
            var7.method31936(var16);
            var5 = System.nanoTime() - var5;
            if ((double)var5 < var9) {
               var9 = (double)var5;
            }
         }

         var2[var4] = var9 / 1000000.0;
         var3[var4] += var2[var4];
         System.out.println("\tBest execution time without constructor: " + String.format("%.2f", var2[var4]) + " msec");
         System.out.println("\tBest execution time with constructor: " + String.format("%.2f", var3[var4]) + " msec");
         var16 = (double[][][])null;
         Object var15 = null;
         System.gc();
         Class7796.method25890(5000L);
      }

      Class9836.method38883("benchmarkDoubleForwardDHT_3D_input_3D.txt", field29259, field29260, field29264, field29268, field29267, var2, var3);
   }

   public static void main(String[] var0) {
      method20343(var0);
      method20344();
      method20345();
      method20346();
      method20347();
      method20348();
      System.exit(0);
   }
}
