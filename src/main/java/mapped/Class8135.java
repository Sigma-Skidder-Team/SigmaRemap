package mapped;

import java.util.Arrays;

public class Class8135 {
   private static int field34964 = 16;
   private static int field34965 = 100;
   private static int field34966 = 8;
   private static int field34967 = 65536;
   private static int field34968 = 65536;
   private static boolean field34969 = true;
   private static long[] field34970 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field34971 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field34972 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field34973 = false;

   private Class8135() {
   }

   public static void method28201(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field34964 = Integer.parseInt(var0[0]);
         field34967 = Integer.parseInt(var0[1]);
         field34968 = Integer.parseInt(var0[2]);
         field34965 = Integer.parseInt(var0[3]);
         field34969 = Boolean.parseBoolean(var0[4]);
         field34973 = Boolean.parseBoolean(var0[5]);
         field34966 = Integer.parseInt(var0[6]);
         field34970 = new long[field34966];
         field34971 = new long[field34966];
         field34972 = new long[field34966];

         for (int var3 = 0; var3 < field34966; var3++) {
            field34970[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field34966; var4++) {
            field34971[var4] = (long)Integer.parseInt(var0[7 + field34966 + var4]);
         }

         for (int var5 = 0; var5 < field34966; var5++) {
            field34972[var5] = (long)Integer.parseInt(var0[7 + field34966 + field34966 + var5]);
         }
      }

      Class7008.method21727(field34964);
      Class7796.method25897((long)field34967);
      Class7796.method25898((long)field34968);
      System.out.println("nthred = " + field34964);
      System.out.println("threadsBegin2D = " + field34967);
      System.out.println("threadsBegin3D = " + field34968);
      System.out.println("niter = " + field34965);
      System.out.println("doWarmup = " + field34969);
      System.out.println("doScaling = " + field34973);
      System.out.println("nsize = " + field34966);
      System.out.println("sizes1D[] = " + Arrays.toString(field34970));
      System.out.println("sizes2D[] = " + Arrays.toString(field34971));
      System.out.println("sizes3D[] = " + Arrays.toString(field34972));
   }

   public static void method28202() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Complex forward FFT 1D of size " + field34970[var4]);
         if (field34969) {
            Class7990 var12 = new Class7990(field34970[var4]);
            double[] var8 = new double[(int)(2L * field34970[var4])];
            Class9836.method38845(2L * field34970[var4], var8);
            var12.method27162(var8);
            Class9836.method38845(2L * field34970[var4], var8);
            var12.method27162(var8);
         }

         long var5 = System.nanoTime();
         Class7990 var7 = new Class7990(field34970[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)(2L * field34970[var4])];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field34965; var11++) {
            Class9836.method38845(2L * field34970[var4], var16);
            var5 = System.nanoTime();
            var7.method27162(var16);
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

      Class9836.method38883("benchmarkDoubleComplexForwardFFT_1D.txt", field34964, field34965, field34969, field34973, field34970, var2, var3);
   }

   public static void method28203() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Real forward FFT 1D of size " + field34970[var4]);
         if (field34969) {
            Class7990 var12 = new Class7990(field34970[var4]);
            double[] var8 = new double[(int)(2L * field34970[var4])];
            Class9836.method38845(field34970[var4], var8);
            var12.method27174(var8);
            Class9836.method38845(field34970[var4], var8);
            var12.method27174(var8);
         }

         long var5 = System.nanoTime();
         Class7990 var7 = new Class7990(field34970[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)(2L * field34970[var4])];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field34965; var11++) {
            Class9836.method38845(field34970[var4], var16);
            var5 = System.nanoTime();
            var7.method27174(var16);
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

      Class9836.method38883("benchmarkDoubleRealForwardFFT_1D.txt", field34964, field34965, field34969, field34973, field34970, var2, var3);
   }

   public static void method28204() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Complex forward FFT 2D (input 1D) of size " + field34971[var4] + " x " + field34971[var4]);
         if (field34969) {
            Class9615 var13 = new Class9615(field34971[var4], field34971[var4]);
            Class2381 var8 = new Class2381(field34971[var4] * 2L * field34971[var4], false);
            Class9836.method38851(field34971[var4], 2L * field34971[var4], var8);
            var13.method37382(var8);
            Class9836.method38851(field34971[var4], 2L * field34971[var4], var8);
            var13.method37382(var8);
         }

         long var5 = System.nanoTime();
         Class9615 var7 = new Class9615(field34971[var4], field34971[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var17 = new Class2381(field34971[var4] * 2L * field34971[var4], false);
         double var9 = Double.MAX_VALUE;
         int var11 = field34965;
         if (field34971[var4] >= 8192L) {
            var11 = Class9044.method33607(1, field34965 / 10);
         }

         for (int var12 = 0; var12 < var11; var12++) {
            Class9836.method38851(field34971[var4], 2L * field34971[var4], var17);
            var5 = System.nanoTime();
            var7.method37382(var17);
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

      Class9836.method38883("benchmarkDoubleComplexForwardFFT_2D_input_1D.txt", field34964, field34965, field34969, field34973, field34971, var2, var3);
   }

   public static void method28205() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Complex forward FFT 2D (input 2D) of size " + field34971[var4] + " x " + field34971[var4]);
         if (field34969) {
            Class9615 var12 = new Class9615(field34971[var4], field34971[var4]);
            double[][] var8 = new double[(int)field34971[var4]][2 * (int)field34971[var4]];
            Class9836.method38853(field34971[var4], 2L * field34971[var4], var8);
            var12.method37383(var8);
            Class9836.method38853(field34971[var4], 2L * field34971[var4], var8);
            var12.method37383(var8);
         }

         long var5 = System.nanoTime();
         Class9615 var7 = new Class9615(field34971[var4], field34971[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field34971[var4]][2 * (int)field34971[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field34965; var11++) {
            Class9836.method38853(field34971[var4], 2L * field34971[var4], var16);
            var5 = System.nanoTime();
            var7.method37383(var16);
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

      Class9836.method38883("benchmarkDoubleComplexForwardFFT_2D_input_2D.txt", field34964, field34965, field34969, field34973, field34971, var2, var3);
   }

   public static void method28206() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Real forward FFT 2D (input 1D) of size " + field34971[var4] + " x " + field34971[var4]);
         if (field34969) {
            Class9615 var12 = new Class9615(field34971[var4], field34971[var4]);
            Class2381 var8 = new Class2381(field34971[var4] * 2L * field34971[var4], false);
            Class9836.method38851(field34971[var4], field34971[var4], var8);
            var12.method37391(var8);
            Class9836.method38851(field34971[var4], field34971[var4], var8);
            var12.method37391(var8);
         }

         long var5 = System.nanoTime();
         Class9615 var7 = new Class9615(field34971[var4], field34971[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var16 = new Class2381(field34971[var4] * 2L * field34971[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field34965; var11++) {
            Class9836.method38851(field34971[var4], field34971[var4], var16);
            var5 = System.nanoTime();
            var7.method37391(var16);
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

      Class9836.method38883("benchmarkDoubleRealForwardFFT_2D_input_1D.txt", field34964, field34965, field34969, field34973, field34971, var2, var3);
   }

   public static void method28207() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Real forward FFT 2D (input 2D) of size " + field34971[var4] + " x " + field34971[var4]);
         if (field34969) {
            Class9615 var12 = new Class9615(field34971[var4], field34971[var4]);
            double[][] var8 = new double[(int)field34971[var4]][2 * (int)field34971[var4]];
            Class9836.method38853(field34971[var4], field34971[var4], var8);
            var12.method37392(var8);
            Class9836.method38853(field34971[var4], field34971[var4], var8);
            var12.method37392(var8);
         }

         long var5 = System.nanoTime();
         Class9615 var7 = new Class9615(field34971[var4], field34971[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field34971[var4]][2 * (int)field34971[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field34965; var11++) {
            Class9836.method38853(field34971[var4], field34971[var4], var16);
            var5 = System.nanoTime();
            var7.method37392(var16);
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

      Class9836.method38883("benchmarkDoubleRealForwardFFT_2D_input_2D.txt", field34964, field34965, field34969, field34973, field34971, var2, var3);
   }

   public static void method28208() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Complex forward FFT 3D (input 1D) of size " + field34972[var4] + " x " + field34972[var4] + " x " + field34972[var4]);
         if (field34969) {
            Class7274 var13 = new Class7274(field34972[var4], field34972[var4], field34972[var4]);
            Class2381 var8 = new Class2381(field34972[var4] * field34972[var4] * 2L * field34972[var4], false);
            Class9836.method38856(field34972[var4], field34972[var4], 2L * field34972[var4], var8);
            var13.method22847(var8);
            Class9836.method38856(field34972[var4], field34972[var4], 2L * field34972[var4], var8);
            var13.method22847(var8);
         }

         long var5 = System.nanoTime();
         Class7274 var7 = new Class7274(field34972[var4], field34972[var4], field34972[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var17 = new Class2381(field34972[var4] * field34972[var4] * 2L * field34972[var4], false);
         double var9 = Double.MAX_VALUE;
         int var11 = field34965;
         if (field34972[var4] >= 1024L) {
            var11 = Class9044.method33607(1, field34965 / 10);
         }

         for (int var12 = 0; var12 < var11; var12++) {
            Class9836.method38856(field34972[var4], field34972[var4], 2L * field34972[var4], var17);
            var5 = System.nanoTime();
            var7.method22847(var17);
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

      Class9836.method38883("benchmarkDoubleComplexForwardFFT_3D_input_1D.txt", field34964, field34965, field34969, field34973, field34972, var2, var3);
   }

   public static void method28209() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Complex forward FFT 3D (input 3D) of size " + field34972[var4] + " x " + field34972[var4] + " x " + field34972[var4]);
         if (field34969) {
            Class7274 var12 = new Class7274(field34972[var4], field34972[var4], field34972[var4]);
            double[][][] var8 = new double[(int)field34972[var4]][(int)field34972[var4]][2 * (int)field34972[var4]];
            Class9836.method38859(field34972[var4], field34972[var4], 2L * field34972[var4], var8);
            var12.method22848(var8);
            Class9836.method38859(field34972[var4], field34972[var4], 2L * field34972[var4], var8);
            var12.method22848(var8);
         }

         long var5 = System.nanoTime();
         Class7274 var7 = new Class7274(field34972[var4], field34972[var4], field34972[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field34972[var4]][(int)field34972[var4]][2 * (int)field34972[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field34965; var11++) {
            Class9836.method38859(field34972[var4], field34972[var4], 2L * field34972[var4], var16);
            var5 = System.nanoTime();
            var7.method22848(var16);
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

      Class9836.method38883("benchmarkDoubleComplexForwardFFT_3D_input_3D.txt", field34964, field34965, field34969, field34973, field34972, var2, var3);
   }

   public static void method28210() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Real forward FFT 3D (input 1D) of size " + field34972[var4] + " x " + field34972[var4] + " x " + field34972[var4]);
         if (field34969) {
            Class7274 var12 = new Class7274(field34972[var4], field34972[var4], field34972[var4]);
            Class2381 var8 = new Class2381(field34972[var4] * field34972[var4] * 2L * field34972[var4], false);
            Class9836.method38856(field34972[var4], field34972[var4], field34972[var4], var8);
            var12.method22856(var8);
            Class9836.method38856(field34972[var4], field34972[var4], field34972[var4], var8);
            var12.method22856(var8);
         }

         long var5 = System.nanoTime();
         Class7274 var7 = new Class7274(field34972[var4], field34972[var4], field34972[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var16 = new Class2381(field34972[var4] * field34972[var4] * 2L * field34972[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field34965; var11++) {
            Class9836.method38856(field34972[var4], field34972[var4], field34972[var4], var16);
            var5 = System.nanoTime();
            var7.method22856(var16);
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

      Class9836.method38883("benchmarkDoubleRealForwardFFT_3D_input_1D.txt", field34964, field34965, field34969, field34973, field34972, var2, var3);
   }

   public static void method28211() {
      double[] var2 = new double[field34966];
      double[] var3 = new double[field34966];

      for (int var4 = 0; var4 < field34966; var4++) {
         System.out.println("Real forward FFT 3D (input 3D) of size " + field34972[var4] + " x " + field34972[var4] + " x " + field34972[var4]);
         if (field34969) {
            Class7274 var12 = new Class7274(field34972[var4], field34972[var4], field34972[var4]);
            double[][][] var8 = new double[(int)field34972[var4]][(int)field34972[var4]][2 * (int)field34972[var4]];
            Class9836.method38859(field34972[var4], field34972[var4], field34972[var4], var8);
            var12.method22857(var8);
            Class9836.method38859(field34972[var4], field34972[var4], field34972[var4], var8);
            var12.method22857(var8);
         }

         long var5 = System.nanoTime();
         Class7274 var7 = new Class7274(field34972[var4], field34972[var4], field34972[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field34972[var4]][(int)field34972[var4]][2 * (int)field34972[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field34965; var11++) {
            Class9836.method38859(field34972[var4], field34972[var4], field34972[var4], var16);
            var5 = System.nanoTime();
            var7.method22857(var16);
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

      Class9836.method38883("benchmarkDoubleRealForwardFFT_3D_input_3D.txt", field34964, field34965, field34969, field34973, field34972, var2, var3);
   }

   public static void main(String[] var0) {
      method28201(var0);
      method28202();
      method28203();
      method28204();
      method28205();
      method28206();
      method28207();
      method28208();
      method28209();
      method28210();
      method28211();
      System.exit(0);
   }
}
