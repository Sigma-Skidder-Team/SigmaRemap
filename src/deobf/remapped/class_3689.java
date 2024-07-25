package remapped;

import java.util.Arrays;

public class class_3689 {
   private static int field_18087 = 16;
   private static int field_18084 = 100;
   private static int field_18083 = 8;
   private static int field_18088 = 65536;
   private static int field_18082 = 65536;
   private static boolean field_18081 = true;
   private static long[] field_18089 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field_18086 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field_18080 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field_18079 = false;

   private class_3689() {
   }

   public static void method_17162(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field_18087 = Integer.parseInt(var0[0]);
         field_18088 = Integer.parseInt(var0[1]);
         field_18082 = Integer.parseInt(var0[2]);
         field_18084 = Integer.parseInt(var0[3]);
         field_18081 = Boolean.parseBoolean(var0[4]);
         field_18079 = Boolean.parseBoolean(var0[5]);
         field_18083 = Integer.parseInt(var0[6]);
         field_18089 = new long[field_18083];
         field_18086 = new long[field_18083];
         field_18080 = new long[field_18083];

         for (int var3 = 0; var3 < field_18083; var3++) {
            field_18089[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field_18083; var4++) {
            field_18086[var4] = (long)Integer.parseInt(var0[7 + field_18083 + var4]);
         }

         for (int var5 = 0; var5 < field_18083; var5++) {
            field_18080[var5] = (long)Integer.parseInt(var0[7 + field_18083 + field_18083 + var5]);
         }
      }

      class_1266.method_5697(field_18087);
      class_2751.method_12397((long)field_18088);
      class_2751.method_12498((long)field_18082);
      System.out.println("nthred = " + field_18087);
      System.out.println("threadsBegin2D = " + field_18088);
      System.out.println("threadsBegin3D = " + field_18082);
      System.out.println("niter = " + field_18084);
      System.out.println("doWarmup = " + field_18081);
      System.out.println("doScaling = " + field_18079);
      System.out.println("nsize = " + field_18083);
      System.out.println("sizes1D[] = " + Arrays.toString(field_18089));
      System.out.println("sizes2D[] = " + Arrays.toString(field_18086));
      System.out.println("sizes3D[] = " + Arrays.toString(field_18080));
   }

   public static void method_17160() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Complex forward FFT 1D of size " + field_18089[var4]);
         if (field_18081) {
            class_3281 var12 = new class_3281(field_18089[var4]);
            double[] var8 = new double[(int)(2L * field_18089[var4])];
            class_9858.method_45421(2L * field_18089[var4], var8);
            var12.method_15028(var8);
            class_9858.method_45421(2L * field_18089[var4], var8);
            var12.method_15028(var8);
         }

         long var5 = System.nanoTime();
         class_3281 var7 = new class_3281(field_18089[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)(2L * field_18089[var4])];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_18084; var11++) {
            class_9858.method_45421(2L * field_18089[var4], var16);
            var5 = System.nanoTime();
            var7.method_15028(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleComplexForwardFFT_1D.txt", field_18087, field_18084, field_18081, field_18079, field_18089, var2, var3);
   }

   public static void method_17161() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Real forward FFT 1D of size " + field_18089[var4]);
         if (field_18081) {
            class_3281 var12 = new class_3281(field_18089[var4]);
            double[] var8 = new double[(int)(2L * field_18089[var4])];
            class_9858.method_45421(field_18089[var4], var8);
            var12.method_14981(var8);
            class_9858.method_45421(field_18089[var4], var8);
            var12.method_14981(var8);
         }

         long var5 = System.nanoTime();
         class_3281 var7 = new class_3281(field_18089[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)(2L * field_18089[var4])];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_18084; var11++) {
            class_9858.method_45421(field_18089[var4], var16);
            var5 = System.nanoTime();
            var7.method_14981(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleRealForwardFFT_1D.txt", field_18087, field_18084, field_18081, field_18079, field_18089, var2, var3);
   }

   public static void method_17164() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Complex forward FFT 2D (input 1D) of size " + field_18086[var4] + " x " + field_18086[var4]);
         if (field_18081) {
            class_9035 var13 = new class_9035(field_18086[var4], field_18086[var4]);
            class_1702 var8 = new class_1702(field_18086[var4] * 2L * field_18086[var4], false);
            class_9858.method_45424(field_18086[var4], 2L * field_18086[var4], var8);
            var13.method_41467(var8);
            class_9858.method_45424(field_18086[var4], 2L * field_18086[var4], var8);
            var13.method_41467(var8);
         }

         long var5 = System.nanoTime();
         class_9035 var7 = new class_9035(field_18086[var4], field_18086[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var17 = new class_1702(field_18086[var4] * 2L * field_18086[var4], false);
         double var9 = Double.MAX_VALUE;
         int var11 = field_18084;
         if (field_18086[var4] >= 8192L) {
            var11 = class_6806.method_31158(1, field_18084 / 10);
         }

         for (int var12 = 0; var12 < var11; var12++) {
            class_9858.method_45424(field_18086[var4], 2L * field_18086[var4], var17);
            var5 = System.nanoTime();
            var7.method_41467(var17);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleComplexForwardFFT_2D_input_1D.txt", field_18087, field_18084, field_18081, field_18079, field_18086, var2, var3);
   }

   public static void method_17163() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Complex forward FFT 2D (input 2D) of size " + field_18086[var4] + " x " + field_18086[var4]);
         if (field_18081) {
            class_9035 var12 = new class_9035(field_18086[var4], field_18086[var4]);
            double[][] var8 = new double[(int)field_18086[var4]][2 * (int)field_18086[var4]];
            class_9858.method_45428(field_18086[var4], 2L * field_18086[var4], var8);
            var12.method_41469(var8);
            class_9858.method_45428(field_18086[var4], 2L * field_18086[var4], var8);
            var12.method_41469(var8);
         }

         long var5 = System.nanoTime();
         class_9035 var7 = new class_9035(field_18086[var4], field_18086[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field_18086[var4]][2 * (int)field_18086[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_18084; var11++) {
            class_9858.method_45428(field_18086[var4], 2L * field_18086[var4], var16);
            var5 = System.nanoTime();
            var7.method_41469(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleComplexForwardFFT_2D_input_2D.txt", field_18087, field_18084, field_18081, field_18079, field_18086, var2, var3);
   }

   public static void method_17166() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Real forward FFT 2D (input 1D) of size " + field_18086[var4] + " x " + field_18086[var4]);
         if (field_18081) {
            class_9035 var12 = new class_9035(field_18086[var4], field_18086[var4]);
            class_1702 var8 = new class_1702(field_18086[var4] * 2L * field_18086[var4], false);
            class_9858.method_45424(field_18086[var4], field_18086[var4], var8);
            var12.method_41460(var8);
            class_9858.method_45424(field_18086[var4], field_18086[var4], var8);
            var12.method_41460(var8);
         }

         long var5 = System.nanoTime();
         class_9035 var7 = new class_9035(field_18086[var4], field_18086[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var16 = new class_1702(field_18086[var4] * 2L * field_18086[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_18084; var11++) {
            class_9858.method_45424(field_18086[var4], field_18086[var4], var16);
            var5 = System.nanoTime();
            var7.method_41460(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleRealForwardFFT_2D_input_1D.txt", field_18087, field_18084, field_18081, field_18079, field_18086, var2, var3);
   }

   public static void method_17167() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Real forward FFT 2D (input 2D) of size " + field_18086[var4] + " x " + field_18086[var4]);
         if (field_18081) {
            class_9035 var12 = new class_9035(field_18086[var4], field_18086[var4]);
            double[][] var8 = new double[(int)field_18086[var4]][2 * (int)field_18086[var4]];
            class_9858.method_45428(field_18086[var4], field_18086[var4], var8);
            var12.method_41462(var8);
            class_9858.method_45428(field_18086[var4], field_18086[var4], var8);
            var12.method_41462(var8);
         }

         long var5 = System.nanoTime();
         class_9035 var7 = new class_9035(field_18086[var4], field_18086[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field_18086[var4]][2 * (int)field_18086[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_18084; var11++) {
            class_9858.method_45428(field_18086[var4], field_18086[var4], var16);
            var5 = System.nanoTime();
            var7.method_41462(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleRealForwardFFT_2D_input_2D.txt", field_18087, field_18084, field_18081, field_18079, field_18086, var2, var3);
   }

   public static void method_17159() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Complex forward FFT 3D (input 1D) of size " + field_18080[var4] + " x " + field_18080[var4] + " x " + field_18080[var4]);
         if (field_18081) {
            class_1637 var13 = new class_1637(field_18080[var4], field_18080[var4], field_18080[var4]);
            class_1702 var8 = new class_1702(field_18080[var4] * field_18080[var4] * 2L * field_18080[var4], false);
            class_9858.method_45461(field_18080[var4], field_18080[var4], 2L * field_18080[var4], var8);
            var13.method_7297(var8);
            class_9858.method_45461(field_18080[var4], field_18080[var4], 2L * field_18080[var4], var8);
            var13.method_7297(var8);
         }

         long var5 = System.nanoTime();
         class_1637 var7 = new class_1637(field_18080[var4], field_18080[var4], field_18080[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var17 = new class_1702(field_18080[var4] * field_18080[var4] * 2L * field_18080[var4], false);
         double var9 = Double.MAX_VALUE;
         int var11 = field_18084;
         if (field_18080[var4] >= 1024L) {
            var11 = class_6806.method_31158(1, field_18084 / 10);
         }

         for (int var12 = 0; var12 < var11; var12++) {
            class_9858.method_45461(field_18080[var4], field_18080[var4], 2L * field_18080[var4], var17);
            var5 = System.nanoTime();
            var7.method_7297(var17);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleComplexForwardFFT_3D_input_1D.txt", field_18087, field_18084, field_18081, field_18079, field_18080, var2, var3);
   }

   public static void method_17169() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Complex forward FFT 3D (input 3D) of size " + field_18080[var4] + " x " + field_18080[var4] + " x " + field_18080[var4]);
         if (field_18081) {
            class_1637 var12 = new class_1637(field_18080[var4], field_18080[var4], field_18080[var4]);
            double[][][] var8 = new double[(int)field_18080[var4]][(int)field_18080[var4]][2 * (int)field_18080[var4]];
            class_9858.method_45465(field_18080[var4], field_18080[var4], 2L * field_18080[var4], var8);
            var12.method_7299(var8);
            class_9858.method_45465(field_18080[var4], field_18080[var4], 2L * field_18080[var4], var8);
            var12.method_7299(var8);
         }

         long var5 = System.nanoTime();
         class_1637 var7 = new class_1637(field_18080[var4], field_18080[var4], field_18080[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field_18080[var4]][(int)field_18080[var4]][2 * (int)field_18080[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_18084; var11++) {
            class_9858.method_45465(field_18080[var4], field_18080[var4], 2L * field_18080[var4], var16);
            var5 = System.nanoTime();
            var7.method_7299(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleComplexForwardFFT_3D_input_3D.txt", field_18087, field_18084, field_18081, field_18079, field_18080, var2, var3);
   }

   public static void method_17168() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Real forward FFT 3D (input 1D) of size " + field_18080[var4] + " x " + field_18080[var4] + " x " + field_18080[var4]);
         if (field_18081) {
            class_1637 var12 = new class_1637(field_18080[var4], field_18080[var4], field_18080[var4]);
            class_1702 var8 = new class_1702(field_18080[var4] * field_18080[var4] * 2L * field_18080[var4], false);
            class_9858.method_45461(field_18080[var4], field_18080[var4], field_18080[var4], var8);
            var12.method_7339(var8);
            class_9858.method_45461(field_18080[var4], field_18080[var4], field_18080[var4], var8);
            var12.method_7339(var8);
         }

         long var5 = System.nanoTime();
         class_1637 var7 = new class_1637(field_18080[var4], field_18080[var4], field_18080[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var16 = new class_1702(field_18080[var4] * field_18080[var4] * 2L * field_18080[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_18084; var11++) {
            class_9858.method_45461(field_18080[var4], field_18080[var4], field_18080[var4], var16);
            var5 = System.nanoTime();
            var7.method_7339(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleRealForwardFFT_3D_input_1D.txt", field_18087, field_18084, field_18081, field_18079, field_18080, var2, var3);
   }

   public static void method_17165() {
      double[] var2 = new double[field_18083];
      double[] var3 = new double[field_18083];

      for (int var4 = 0; var4 < field_18083; var4++) {
         System.out.println("Real forward FFT 3D (input 3D) of size " + field_18080[var4] + " x " + field_18080[var4] + " x " + field_18080[var4]);
         if (field_18081) {
            class_1637 var12 = new class_1637(field_18080[var4], field_18080[var4], field_18080[var4]);
            double[][][] var8 = new double[(int)field_18080[var4]][(int)field_18080[var4]][2 * (int)field_18080[var4]];
            class_9858.method_45465(field_18080[var4], field_18080[var4], field_18080[var4], var8);
            var12.method_7341(var8);
            class_9858.method_45465(field_18080[var4], field_18080[var4], field_18080[var4], var8);
            var12.method_7341(var8);
         }

         long var5 = System.nanoTime();
         class_1637 var7 = new class_1637(field_18080[var4], field_18080[var4], field_18080[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field_18080[var4]][(int)field_18080[var4]][2 * (int)field_18080[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_18084; var11++) {
            class_9858.method_45465(field_18080[var4], field_18080[var4], field_18080[var4], var16);
            var5 = System.nanoTime();
            var7.method_7341(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkDoubleRealForwardFFT_3D_input_3D.txt", field_18087, field_18084, field_18081, field_18079, field_18080, var2, var3);
   }

   public static void main(String[] var0) {
      method_17162(var0);
      method_17160();
      method_17161();
      method_17164();
      method_17163();
      method_17166();
      method_17167();
      method_17159();
      method_17169();
      method_17168();
      method_17165();
      System.exit(0);
   }
}
