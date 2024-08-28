package mapped;

import java.util.Arrays;

public class Class8945 {
   private static int field40444 = 8;
   private static int field40445 = 200;
   private static int field40446 = 16;
   private static int field40447 = 65636;
   private static int field40448 = 65636;
   private static boolean field40449 = true;
   private static long[] field40450 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field40451 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field40452 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field40453 = false;

   private Class8945() {
   }

   public static void method32682(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field40444 = Integer.parseInt(var0[0]);
         field40447 = Integer.parseInt(var0[1]);
         field40448 = Integer.parseInt(var0[2]);
         field40445 = Integer.parseInt(var0[3]);
         field40449 = Boolean.parseBoolean(var0[4]);
         field40453 = Boolean.parseBoolean(var0[5]);
         field40446 = Integer.parseInt(var0[6]);
         field40450 = new long[field40446];
         field40451 = new long[field40446];
         field40452 = new long[field40446];

         for (int var3 = 0; var3 < field40446; var3++) {
            field40450[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field40446; var4++) {
            field40451[var4] = (long)Integer.parseInt(var0[7 + field40446 + var4]);
         }

         for (int var5 = 0; var5 < field40446; var5++) {
            field40452[var5] = (long)Integer.parseInt(var0[7 + field40446 + field40446 + var5]);
         }
      }

      Class7008.method21727(field40444);
      Class7796.method25897((long)field40447);
      Class7796.method25898((long)field40448);
      System.out.println("nthred = " + field40444);
      System.out.println("threadsBegin2D = " + field40447);
      System.out.println("threadsBegin3D = " + field40448);
      System.out.println("niter = " + field40445);
      System.out.println("doWarmup = " + field40449);
      System.out.println("doScaling = " + field40453);
      System.out.println("nsize = " + field40446);
      System.out.println("sizes1D[] = " + Arrays.toString(field40450));
      System.out.println("sizes2D[] = " + Arrays.toString(field40451));
      System.out.println("sizes3D[] = " + Arrays.toString(field40452));
   }

   public static void method32683() {
      double[] var2 = new double[field40446];
      double[] var3 = new double[field40446];

      for (int var4 = 0; var4 < field40446; var4++) {
         System.out.println("Forward DCT 1D of size " + field40450[var4]);
         if (field40449) {
            Class8431 var12 = new Class8431(field40450[var4]);
            float[] var8 = new float[(int)field40450[var4]];
            Class9836.method38848(field40450[var4], var8);
            var12.method29627(var8, field40453);
            Class9836.method38848(field40450[var4], var8);
            var12.method29627(var8, field40453);
         }

         long var5 = System.nanoTime();
         Class8431 var7 = new Class8431(field40450[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)field40450[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field40445; var11++) {
            Class9836.method38848(field40450[var4], var16);
            var5 = System.nanoTime();
            var7.method29627(var16, field40453);
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

      Class9836.method38883("benchmarkFloatForwardDCT_1D.txt", field40444, field40445, field40449, field40453, field40450, var2, var3);
   }

   public static void method32684() {
      double[] var2 = new double[field40446];
      double[] var3 = new double[field40446];

      for (int var4 = 0; var4 < field40446; var4++) {
         System.out.println("Forward DCT 2D (input 1D) of size " + field40451[var4] + " x " + field40451[var4]);
         if (field40449) {
            Class9533 var12 = new Class9533(field40451[var4], field40451[var4]);
            Class2378 var8 = new Class2378(field40451[var4] * field40451[var4], false);
            Class9836.method38850(field40451[var4], field40451[var4], var8);
            var12.method36842(var8, field40453);
            Class9836.method38850(field40451[var4], field40451[var4], var8);
            var12.method36842(var8, field40453);
         }

         long var5 = System.nanoTime();
         Class9533 var7 = new Class9533(field40451[var4], field40451[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var16 = new Class2378(field40451[var4] * field40451[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field40445; var11++) {
            Class9836.method38850(field40451[var4], field40451[var4], var16);
            var5 = System.nanoTime();
            var7.method36842(var16, field40453);
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

      Class9836.method38883("benchmarkFloatForwardDCT_2D_input_1D.txt", field40444, field40445, field40449, field40453, field40451, var2, var3);
   }

   public static void method32685() {
      double[] var2 = new double[field40446];
      double[] var3 = new double[field40446];

      for (int var4 = 0; var4 < field40446; var4++) {
         System.out.println("Forward DCT 2D (input 2D) of size " + field40451[var4] + " x " + field40451[var4]);
         if (field40449) {
            Class9533 var12 = new Class9533(field40451[var4], field40451[var4]);
            float[][] var8 = new float[(int)field40451[var4]][(int)field40451[var4]];
            Class9836.method38854(field40451[var4], field40451[var4], var8);
            var12.method36843(var8, field40453);
            Class9836.method38854(field40451[var4], field40451[var4], var8);
            var12.method36843(var8, field40453);
         }

         long var5 = System.nanoTime();
         Class9533 var7 = new Class9533(field40451[var4], field40451[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field40451[var4]][(int)field40451[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field40445; var11++) {
            Class9836.method38854(field40451[var4], field40451[var4], var16);
            var5 = System.nanoTime();
            var7.method36843(var16, field40453);
            var5 = System.nanoTime() - var5;
            if ((double)var5 < var9) {
               var9 = (double)var5;
            }
         }

         var2[var4] = var9 / 1000000.0;
         var3[var4] += var2[var4];
         System.out.println("\tBest execution time without constructor: " + String.format("%.2f", var2[var4]) + " msec");
         System.out.println("\tBest execution time with constructor: " + String.format("%.2f", var3[var4]) + " msec");
         var16 = (float[][])null;
         Object var15 = null;
         System.gc();
         Class7796.method25890(5000L);
      }

      Class9836.method38883("benchmarkFloatForwardDCT_2D_input_2D.txt", field40444, field40445, field40449, field40453, field40451, var2, var3);
   }

   public static void method32686() {
      double[] var2 = new double[field40446];
      double[] var3 = new double[field40446];

      for (int var4 = 0; var4 < field40446; var4++) {
         System.out.println("Forward DCT 3D (input 1D) of size " + field40452[var4] + " x " + field40452[var4] + " x " + field40452[var4]);
         if (field40449) {
            Class7824 var12 = new Class7824(field40452[var4], field40452[var4], field40452[var4]);
            Class2378 var8 = new Class2378(field40452[var4] * field40452[var4] * field40452[var4], false);
            Class9836.method38857(field40452[var4], field40452[var4], field40452[var4], var8);
            var12.method26162(var8, field40453);
            Class9836.method38857(field40452[var4], field40452[var4], field40452[var4], var8);
            var12.method26162(var8, field40453);
         }

         long var5 = System.nanoTime();
         Class7824 var7 = new Class7824(field40452[var4], field40452[var4], field40452[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var16 = new Class2378(field40452[var4] * field40452[var4] * field40452[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field40445; var11++) {
            Class9836.method38857(field40452[var4], field40452[var4], field40452[var4], var16);
            var5 = System.nanoTime();
            var7.method26162(var16, field40453);
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

      Class9836.method38883("benchmarkFloatForwardDCT_3D_input_1D.txt", field40444, field40445, field40449, field40453, field40452, var2, var3);
   }

   public static void method32687() {
      double[] var2 = new double[field40446];
      double[] var3 = new double[field40446];

      for (int var4 = 0; var4 < field40446; var4++) {
         System.out.println("Forward DCT 3D (input 3D) of size " + field40452[var4] + " x " + field40452[var4] + " x " + field40452[var4]);
         if (field40449) {
            Class7824 var12 = new Class7824(field40452[var4], field40452[var4], field40452[var4]);
            float[][][] var8 = new float[(int)field40452[var4]][(int)field40452[var4]][(int)field40452[var4]];
            Class9836.method38860(field40452[var4], field40452[var4], field40452[var4], var8);
            var12.method26163(var8, field40453);
            Class9836.method38860(field40452[var4], field40452[var4], field40452[var4], var8);
            var12.method26163(var8, field40453);
         }

         long var5 = System.nanoTime();
         Class7824 var7 = new Class7824(field40452[var4], field40452[var4], field40452[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field40452[var4]][(int)field40452[var4]][(int)field40452[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field40445; var11++) {
            Class9836.method38860(field40452[var4], field40452[var4], field40452[var4], var16);
            var5 = System.nanoTime();
            var7.method26163(var16, field40453);
            var5 = System.nanoTime() - var5;
            if ((double)var5 < var9) {
               var9 = (double)var5;
            }
         }

         var2[var4] = var9 / 1000000.0;
         var3[var4] += var2[var4];
         System.out.println("\tBest execution time without constructor: " + String.format("%.2f", var2[var4]) + " msec");
         System.out.println("\tBest execution time with constructor: " + String.format("%.2f", var3[var4]) + " msec");
         var16 = (float[][][])null;
         Object var15 = null;
         System.gc();
         Class7796.method25890(5000L);
      }

      Class9836.method38883("benchmarkFloatForwardDCT_3D_input_3D.txt", field40444, field40445, field40449, field40453, field40452, var2, var3);
   }

   public static void main(String[] var0) {
      method32682(var0);
      method32683();
      method32684();
      method32685();
      method32686();
      method32687();
      System.exit(0);
   }
}
