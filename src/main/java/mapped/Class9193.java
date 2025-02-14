package mapped;

import java.util.Arrays;

public class Class9193 {
   private static int field42223 = 16;
   private static int field42224 = 100;
   private static int field42225 = 8;
   private static int field42226 = 65536;
   private static int field42227 = 65536;
   private static boolean field42228 = true;
   private static long[] field42229 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field42230 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field42231 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field42232 = false;

   private Class9193() {
   }

   public static void method34443(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field42223 = Integer.parseInt(var0[0]);
         field42226 = Integer.parseInt(var0[1]);
         field42227 = Integer.parseInt(var0[2]);
         field42224 = Integer.parseInt(var0[3]);
         field42228 = Boolean.parseBoolean(var0[4]);
         field42232 = Boolean.parseBoolean(var0[5]);
         field42225 = Integer.parseInt(var0[6]);
         field42229 = new long[field42225];
         field42230 = new long[field42225];
         field42231 = new long[field42225];

         for (int var3 = 0; var3 < field42225; var3++) {
            field42229[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field42225; var4++) {
            field42230[var4] = (long)Integer.parseInt(var0[7 + field42225 + var4]);
         }

         for (int var5 = 0; var5 < field42225; var5++) {
            field42231[var5] = (long)Integer.parseInt(var0[7 + field42225 + field42225 + var5]);
         }
      }

      Class7008.method21727(field42223);
      Class7796.method25897((long)field42226);
      Class7796.method25898((long)field42227);
      System.out.println("nthred = " + field42223);
      System.out.println("threadsBegin2D = " + field42226);
      System.out.println("threadsBegin3D = " + field42227);
      System.out.println("niter = " + field42224);
      System.out.println("doWarmup = " + field42228);
      System.out.println("doScaling = " + field42232);
      System.out.println("nsize = " + field42225);
      System.out.println("sizes1D[] = " + Arrays.toString(field42229));
      System.out.println("sizes2D[] = " + Arrays.toString(field42230));
      System.out.println("sizes3D[] = " + Arrays.toString(field42231));
   }

   public static void method34444() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Complex forward FFT 1D of size " + field42229[var4]);
         if (field42228) {
            Class8630 var12 = new Class8630(field42229[var4]);
            float[] var8 = new float[(int)(2L * field42229[var4])];
            Class9836.method38848(2L * field42229[var4], var8);
            var12.method30929(var8);
            Class9836.method38848(2L * field42229[var4], var8);
            var12.method30929(var8);
         }

         long var5 = System.nanoTime();
         Class8630 var7 = new Class8630(field42229[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)(2L * field42229[var4])];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field42224; var11++) {
            Class9836.method38848(2L * field42229[var4], var16);
            var5 = System.nanoTime();
            var7.method30929(var16);
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

      Class9836.method38883("benchmarkFloatComplexForwardFFT_1D.txt", field42223, field42224, field42228, field42232, field42229, var2, var3);
   }

   public static void method34445() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Real forward FFT 1D of size " + field42229[var4]);
         if (field42228) {
            Class8630 var12 = new Class8630(field42229[var4]);
            float[] var8 = new float[(int)(2L * field42229[var4])];
            Class9836.method38848(field42229[var4], var8);
            var12.method30941(var8);
            Class9836.method38848(field42229[var4], var8);
            var12.method30941(var8);
         }

         long var5 = System.nanoTime();
         Class8630 var7 = new Class8630(field42229[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)(2L * field42229[var4])];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field42224; var11++) {
            Class9836.method38848(field42229[var4], var16);
            var5 = System.nanoTime();
            var7.method30941(var16);
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

      Class9836.method38883("benchmarkFloatRealForwardFFT_1D.txt", field42223, field42224, field42228, field42232, field42229, var2, var3);
   }

   public static void method34446() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Complex forward FFT 2D (input 1D) of size " + field42230[var4] + " x " + field42230[var4]);
         if (field42228) {
            Class8543 var13 = new Class8543(field42230[var4], field42230[var4]);
            Class2378 var8 = new Class2378(field42230[var4] * 2L * field42230[var4], false);
            Class9836.method38850(field42230[var4], 2L * field42230[var4], var8);
            var13.method30393(var8);
            Class9836.method38850(field42230[var4], 2L * field42230[var4], var8);
            var13.method30393(var8);
         }

         long var5 = System.nanoTime();
         Class8543 var7 = new Class8543(field42230[var4], field42230[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var17 = new Class2378(field42230[var4] * 2L * field42230[var4], false);
         double var9 = Double.MAX_VALUE;
         int var11 = field42224;
         if (field42230[var4] >= 8192L) {
            var11 = Class9044.method33607(1, field42224 / 10);
         }

         for (int var12 = 0; var12 < var11; var12++) {
            Class9836.method38850(field42230[var4], 2L * field42230[var4], var17);
            var5 = System.nanoTime();
            var7.method30393(var17);
            var5 = System.nanoTime() - var5;
            if ((double)var5 < var9) {
               var9 = (double)var5;
            }
         }

         var2[var4] = var9 / 1000000.0;
         var3[var4] += var2[var4];
         System.out.println("\tBest execution time without constructor: " + String.format("%.2f", var2[var4]) + " msec");
         System.out.println("\tBest execution time with constructor: " + String.format("%.2f", var3[var4]) + " msec");
         var17 = null;
         Object var16 = null;
         System.gc();
         Class7796.method25890(5000L);
      }

      Class9836.method38883("benchmarkFloatComplexForwardFFT_2D_input_1D.txt", field42223, field42224, field42228, field42232, field42230, var2, var3);
   }

   public static void method34447() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Complex forward FFT 2D (input 2D) of size " + field42230[var4] + " x " + field42230[var4]);
         if (field42228) {
            Class8543 var12 = new Class8543(field42230[var4], field42230[var4]);
            float[][] var8 = new float[(int)field42230[var4]][2 * (int)field42230[var4]];
            Class9836.method38854(field42230[var4], 2L * field42230[var4], var8);
            var12.method30394(var8);
            Class9836.method38854(field42230[var4], 2L * field42230[var4], var8);
            var12.method30394(var8);
         }

         long var5 = System.nanoTime();
         Class8543 var7 = new Class8543(field42230[var4], field42230[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field42230[var4]][2 * (int)field42230[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field42224; var11++) {
            Class9836.method38854(field42230[var4], 2L * field42230[var4], var16);
            var5 = System.nanoTime();
            var7.method30394(var16);
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

      Class9836.method38883("benchmarkFloatComplexForwardFFT_2D_input_2D.txt", field42223, field42224, field42228, field42232, field42230, var2, var3);
   }

   public static void method34448() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Real forward FFT 2D (input 1D) of size " + field42230[var4] + " x " + field42230[var4]);
         if (field42228) {
            Class8543 var12 = new Class8543(field42230[var4], field42230[var4]);
            Class2378 var8 = new Class2378(field42230[var4] * 2L * field42230[var4], false);
            Class9836.method38850(field42230[var4], field42230[var4], var8);
            var12.method30402(var8);
            Class9836.method38850(field42230[var4], field42230[var4], var8);
            var12.method30402(var8);
         }

         long var5 = System.nanoTime();
         Class8543 var7 = new Class8543(field42230[var4], field42230[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var16 = new Class2378(field42230[var4] * 2L * field42230[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field42224; var11++) {
            Class9836.method38850(field42230[var4], field42230[var4], var16);
            var5 = System.nanoTime();
            var7.method30402(var16);
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

      Class9836.method38883("benchmarkFloatRealForwardFFT_2D_input_1D.txt", field42223, field42224, field42228, field42232, field42230, var2, var3);
   }

   public static void method34449() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Real forward FFT 2D (input 2D) of size " + field42230[var4] + " x " + field42230[var4]);
         if (field42228) {
            Class8543 var12 = new Class8543(field42230[var4], field42230[var4]);
            float[][] var8 = new float[(int)field42230[var4]][2 * (int)field42230[var4]];
            Class9836.method38854(field42230[var4], field42230[var4], var8);
            var12.method30403(var8);
            Class9836.method38854(field42230[var4], field42230[var4], var8);
            var12.method30403(var8);
         }

         long var5 = System.nanoTime();
         Class8543 var7 = new Class8543(field42230[var4], field42230[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field42230[var4]][2 * (int)field42230[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field42224; var11++) {
            Class9836.method38854(field42230[var4], field42230[var4], var16);
            var5 = System.nanoTime();
            var7.method30403(var16);
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

      Class9836.method38883("benchmarkFloatRealForwardFFT_2D_input_2D.txt", field42223, field42224, field42228, field42232, field42230, var2, var3);
   }

   public static void method34450() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Complex forward FFT 3D (input 1D) of size " + field42231[var4] + " x " + field42231[var4] + " x " + field42231[var4]);
         if (field42228) {
            Class8026 var13 = new Class8026(field42231[var4], field42231[var4], field42231[var4]);
            Class2378 var8 = new Class2378(field42231[var4] * field42231[var4] * 2L * field42231[var4], false);
            Class9836.method38857(field42231[var4], field42231[var4], 2L * field42231[var4], var8);
            var13.method27465(var8);
            Class9836.method38857(field42231[var4], field42231[var4], 2L * field42231[var4], var8);
            var13.method27465(var8);
         }

         long var5 = System.nanoTime();
         Class8026 var7 = new Class8026(field42231[var4], field42231[var4], field42231[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var17 = new Class2378(field42231[var4] * field42231[var4] * 2L * field42231[var4], false);
         double var9 = Double.MAX_VALUE;
         int var11 = field42224;
         if (field42231[var4] >= 1024L) {
            var11 = Class9044.method33607(1, field42224 / 10);
         }

         for (int var12 = 0; var12 < var11; var12++) {
            Class9836.method38857(field42231[var4], field42231[var4], 2L * field42231[var4], var17);
            var5 = System.nanoTime();
            var7.method27465(var17);
            var5 = System.nanoTime() - var5;
            if ((double)var5 < var9) {
               var9 = (double)var5;
            }
         }

         var2[var4] = var9 / 1000000.0;
         var3[var4] += var2[var4];
         System.out.println("\tBest execution time without constructor: " + String.format("%.2f", var2[var4]) + " msec");
         System.out.println("\tBest execution time with constructor: " + String.format("%.2f", var3[var4]) + " msec");
         var17 = null;
         Object var16 = null;
         System.gc();
         Class7796.method25890(5000L);
      }

      Class9836.method38883("benchmarkFloatComplexForwardFFT_3D_input_1D.txt", field42223, field42224, field42228, field42232, field42231, var2, var3);
   }

   public static void method34451() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Complex forward FFT 3D (input 3D) of size " + field42231[var4] + " x " + field42231[var4] + " x " + field42231[var4]);
         if (field42228) {
            Class8026 var12 = new Class8026(field42231[var4], field42231[var4], field42231[var4]);
            float[][][] var8 = new float[(int)field42231[var4]][(int)field42231[var4]][2 * (int)field42231[var4]];
            Class9836.method38860(field42231[var4], field42231[var4], 2L * field42231[var4], var8);
            var12.method27466(var8);
            Class9836.method38860(field42231[var4], field42231[var4], 2L * field42231[var4], var8);
            var12.method27466(var8);
         }

         long var5 = System.nanoTime();
         Class8026 var7 = new Class8026(field42231[var4], field42231[var4], field42231[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field42231[var4]][(int)field42231[var4]][2 * (int)field42231[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field42224; var11++) {
            Class9836.method38860(field42231[var4], field42231[var4], 2L * field42231[var4], var16);
            var5 = System.nanoTime();
            var7.method27466(var16);
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

      Class9836.method38883("benchmarkFloatComplexForwardFFT_3D_input_3D.txt", field42223, field42224, field42228, field42232, field42231, var2, var3);
   }

   public static void method34452() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Real forward FFT 3D (input 1D) of size " + field42231[var4] + " x " + field42231[var4] + " x " + field42231[var4]);
         if (field42228) {
            Class8026 var12 = new Class8026(field42231[var4], field42231[var4], field42231[var4]);
            Class2378 var8 = new Class2378(field42231[var4] * field42231[var4] * 2L * field42231[var4], false);
            var12.method27474(var8);
            Class9836.method38857(field42231[var4], field42231[var4], field42231[var4], var8);
            var12.method27474(var8);
         }

         long var5 = System.nanoTime();
         Class8026 var7 = new Class8026(field42231[var4], field42231[var4], field42231[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var16 = new Class2378(field42231[var4] * field42231[var4] * 2L * field42231[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field42224; var11++) {
            Class9836.method38857(field42231[var4], field42231[var4], field42231[var4], var16);
            var5 = System.nanoTime();
            var7.method27474(var16);
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

      Class9836.method38883("benchmarkFloatRealForwardFFT_3D_input_1D.txt", field42223, field42224, field42228, field42232, field42231, var2, var3);
   }

   public static void method34453() {
      double[] var2 = new double[field42225];
      double[] var3 = new double[field42225];

      for (int var4 = 0; var4 < field42225; var4++) {
         System.out.println("Real forward FFT 3D (input 3D) of size " + field42231[var4] + " x " + field42231[var4] + " x " + field42231[var4]);
         if (field42228) {
            Class8026 var12 = new Class8026(field42231[var4], field42231[var4], field42231[var4]);
            float[][][] var8 = new float[(int)field42231[var4]][(int)field42231[var4]][2 * (int)field42231[var4]];
            Class9836.method38860(field42231[var4], field42231[var4], field42231[var4], var8);
            var12.method27475(var8);
            Class9836.method38860(field42231[var4], field42231[var4], field42231[var4], var8);
            var12.method27475(var8);
         }

         long var5 = System.nanoTime();
         Class8026 var7 = new Class8026(field42231[var4], field42231[var4], field42231[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field42231[var4]][(int)field42231[var4]][2 * (int)field42231[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field42224; var11++) {
            Class9836.method38860(field42231[var4], field42231[var4], field42231[var4], var16);
            var5 = System.nanoTime();
            var7.method27475(var16);
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

      Class9836.method38883("benchmarkFloatRealForwardFFT_3D_input_3D.txt", field42223, field42224, field42228, field42232, field42231, var2, var3);
   }

   public static void main(String[] var0) {
      method34443(var0);
      method34444();
      method34445();
      method34446();
      method34447();
      method34448();
      method34449();
      method34450();
      method34451();
      method34452();
      method34453();
      System.exit(0);
   }
}
