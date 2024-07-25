package remapped;

import java.util.Arrays;

public class class_7417 {
   private static int field_37861 = 16;
   private static int field_37864 = 100;
   private static int field_37855 = 8;
   private static int field_37859 = 65536;
   private static int field_37856 = 65536;
   private static boolean field_37863 = true;
   private static long[] field_37865 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field_37858 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field_37862 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field_37857 = false;

   private class_7417() {
   }

   public static void method_33796(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field_37861 = Integer.parseInt(var0[0]);
         field_37859 = Integer.parseInt(var0[1]);
         field_37856 = Integer.parseInt(var0[2]);
         field_37864 = Integer.parseInt(var0[3]);
         field_37863 = Boolean.parseBoolean(var0[4]);
         field_37857 = Boolean.parseBoolean(var0[5]);
         field_37855 = Integer.parseInt(var0[6]);
         field_37865 = new long[field_37855];
         field_37858 = new long[field_37855];
         field_37862 = new long[field_37855];

         for (int var3 = 0; var3 < field_37855; var3++) {
            field_37865[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field_37855; var4++) {
            field_37858[var4] = (long)Integer.parseInt(var0[7 + field_37855 + var4]);
         }

         for (int var5 = 0; var5 < field_37855; var5++) {
            field_37862[var5] = (long)Integer.parseInt(var0[7 + field_37855 + field_37855 + var5]);
         }
      }

      class_1266.method_5697(field_37861);
      class_2751.method_12397((long)field_37859);
      class_2751.method_12498((long)field_37856);
      System.out.println("nthred = " + field_37861);
      System.out.println("threadsBegin2D = " + field_37859);
      System.out.println("threadsBegin3D = " + field_37856);
      System.out.println("niter = " + field_37864);
      System.out.println("doWarmup = " + field_37863);
      System.out.println("doScaling = " + field_37857);
      System.out.println("nsize = " + field_37855);
      System.out.println("sizes1D[] = " + Arrays.toString(field_37865));
      System.out.println("sizes2D[] = " + Arrays.toString(field_37858));
      System.out.println("sizes3D[] = " + Arrays.toString(field_37862));
   }

   public static void method_33792() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Complex forward FFT 1D of size " + field_37865[var4]);
         if (field_37863) {
            class_5298 var12 = new class_5298(field_37865[var4]);
            float[] var8 = new float[(int)(2L * field_37865[var4])];
            class_9858.method_45422(2L * field_37865[var4], var8);
            var12.method_24185(var8);
            class_9858.method_45422(2L * field_37865[var4], var8);
            var12.method_24185(var8);
         }

         long var5 = System.nanoTime();
         class_5298 var7 = new class_5298(field_37865[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)(2L * field_37865[var4])];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_37864; var11++) {
            class_9858.method_45422(2L * field_37865[var4], var16);
            var5 = System.nanoTime();
            var7.method_24185(var16);
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

      class_9858.method_45454("benchmarkFloatComplexForwardFFT_1D.txt", field_37861, field_37864, field_37863, field_37857, field_37865, var2, var3);
   }

   public static void method_33795() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Real forward FFT 1D of size " + field_37865[var4]);
         if (field_37863) {
            class_5298 var12 = new class_5298(field_37865[var4]);
            float[] var8 = new float[(int)(2L * field_37865[var4])];
            class_9858.method_45422(field_37865[var4], var8);
            var12.method_24160(var8);
            class_9858.method_45422(field_37865[var4], var8);
            var12.method_24160(var8);
         }

         long var5 = System.nanoTime();
         class_5298 var7 = new class_5298(field_37865[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)(2L * field_37865[var4])];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_37864; var11++) {
            class_9858.method_45422(field_37865[var4], var16);
            var5 = System.nanoTime();
            var7.method_24160(var16);
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

      class_9858.method_45454("benchmarkFloatRealForwardFFT_1D.txt", field_37861, field_37864, field_37863, field_37857, field_37865, var2, var3);
   }

   public static void method_33793() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Complex forward FFT 2D (input 1D) of size " + field_37858[var4] + " x " + field_37858[var4]);
         if (field_37863) {
            class_4993 var13 = new class_4993(field_37858[var4], field_37858[var4]);
            class_4330 var8 = new class_4330(field_37858[var4] * 2L * field_37858[var4], false);
            class_9858.method_45425(field_37858[var4], 2L * field_37858[var4], var8);
            var13.method_22957(var8);
            class_9858.method_45425(field_37858[var4], 2L * field_37858[var4], var8);
            var13.method_22957(var8);
         }

         long var5 = System.nanoTime();
         class_4993 var7 = new class_4993(field_37858[var4], field_37858[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var17 = new class_4330(field_37858[var4] * 2L * field_37858[var4], false);
         double var9 = Double.MAX_VALUE;
         int var11 = field_37864;
         if (field_37858[var4] >= 8192L) {
            var11 = class_6806.method_31158(1, field_37864 / 10);
         }

         for (int var12 = 0; var12 < var11; var12++) {
            class_9858.method_45425(field_37858[var4], 2L * field_37858[var4], var17);
            var5 = System.nanoTime();
            var7.method_22957(var17);
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

      class_9858.method_45454("benchmarkFloatComplexForwardFFT_2D_input_1D.txt", field_37861, field_37864, field_37863, field_37857, field_37858, var2, var3);
   }

   public static void method_33794() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Complex forward FFT 2D (input 2D) of size " + field_37858[var4] + " x " + field_37858[var4]);
         if (field_37863) {
            class_4993 var12 = new class_4993(field_37858[var4], field_37858[var4]);
            float[][] var8 = new float[(int)field_37858[var4]][2 * (int)field_37858[var4]];
            class_9858.method_45429(field_37858[var4], 2L * field_37858[var4], var8);
            var12.method_22959(var8);
            class_9858.method_45429(field_37858[var4], 2L * field_37858[var4], var8);
            var12.method_22959(var8);
         }

         long var5 = System.nanoTime();
         class_4993 var7 = new class_4993(field_37858[var4], field_37858[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field_37858[var4]][2 * (int)field_37858[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_37864; var11++) {
            class_9858.method_45429(field_37858[var4], 2L * field_37858[var4], var16);
            var5 = System.nanoTime();
            var7.method_22959(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkFloatComplexForwardFFT_2D_input_2D.txt", field_37861, field_37864, field_37863, field_37857, field_37858, var2, var3);
   }

   public static void method_33791() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Real forward FFT 2D (input 1D) of size " + field_37858[var4] + " x " + field_37858[var4]);
         if (field_37863) {
            class_4993 var12 = new class_4993(field_37858[var4], field_37858[var4]);
            class_4330 var8 = new class_4330(field_37858[var4] * 2L * field_37858[var4], false);
            class_9858.method_45425(field_37858[var4], field_37858[var4], var8);
            var12.method_23003(var8);
            class_9858.method_45425(field_37858[var4], field_37858[var4], var8);
            var12.method_23003(var8);
         }

         long var5 = System.nanoTime();
         class_4993 var7 = new class_4993(field_37858[var4], field_37858[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var16 = new class_4330(field_37858[var4] * 2L * field_37858[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_37864; var11++) {
            class_9858.method_45425(field_37858[var4], field_37858[var4], var16);
            var5 = System.nanoTime();
            var7.method_23003(var16);
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

      class_9858.method_45454("benchmarkFloatRealForwardFFT_2D_input_1D.txt", field_37861, field_37864, field_37863, field_37857, field_37858, var2, var3);
   }

   public static void method_33787() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Real forward FFT 2D (input 2D) of size " + field_37858[var4] + " x " + field_37858[var4]);
         if (field_37863) {
            class_4993 var12 = new class_4993(field_37858[var4], field_37858[var4]);
            float[][] var8 = new float[(int)field_37858[var4]][2 * (int)field_37858[var4]];
            class_9858.method_45429(field_37858[var4], field_37858[var4], var8);
            var12.method_23005(var8);
            class_9858.method_45429(field_37858[var4], field_37858[var4], var8);
            var12.method_23005(var8);
         }

         long var5 = System.nanoTime();
         class_4993 var7 = new class_4993(field_37858[var4], field_37858[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field_37858[var4]][2 * (int)field_37858[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_37864; var11++) {
            class_9858.method_45429(field_37858[var4], field_37858[var4], var16);
            var5 = System.nanoTime();
            var7.method_23005(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkFloatRealForwardFFT_2D_input_2D.txt", field_37861, field_37864, field_37863, field_37857, field_37858, var2, var3);
   }

   public static void method_33790() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Complex forward FFT 3D (input 1D) of size " + field_37862[var4] + " x " + field_37862[var4] + " x " + field_37862[var4]);
         if (field_37863) {
            class_3381 var13 = new class_3381(field_37862[var4], field_37862[var4], field_37862[var4]);
            class_4330 var8 = new class_4330(field_37862[var4] * field_37862[var4] * 2L * field_37862[var4], false);
            class_9858.method_45462(field_37862[var4], field_37862[var4], 2L * field_37862[var4], var8);
            var13.method_15607(var8);
            class_9858.method_45462(field_37862[var4], field_37862[var4], 2L * field_37862[var4], var8);
            var13.method_15607(var8);
         }

         long var5 = System.nanoTime();
         class_3381 var7 = new class_3381(field_37862[var4], field_37862[var4], field_37862[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var17 = new class_4330(field_37862[var4] * field_37862[var4] * 2L * field_37862[var4], false);
         double var9 = Double.MAX_VALUE;
         int var11 = field_37864;
         if (field_37862[var4] >= 1024L) {
            var11 = class_6806.method_31158(1, field_37864 / 10);
         }

         for (int var12 = 0; var12 < var11; var12++) {
            class_9858.method_45462(field_37862[var4], field_37862[var4], 2L * field_37862[var4], var17);
            var5 = System.nanoTime();
            var7.method_15607(var17);
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

      class_9858.method_45454("benchmarkFloatComplexForwardFFT_3D_input_1D.txt", field_37861, field_37864, field_37863, field_37857, field_37862, var2, var3);
   }

   public static void method_33789() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Complex forward FFT 3D (input 3D) of size " + field_37862[var4] + " x " + field_37862[var4] + " x " + field_37862[var4]);
         if (field_37863) {
            class_3381 var12 = new class_3381(field_37862[var4], field_37862[var4], field_37862[var4]);
            float[][][] var8 = new float[(int)field_37862[var4]][(int)field_37862[var4]][2 * (int)field_37862[var4]];
            class_9858.method_45466(field_37862[var4], field_37862[var4], 2L * field_37862[var4], var8);
            var12.method_15609(var8);
            class_9858.method_45466(field_37862[var4], field_37862[var4], 2L * field_37862[var4], var8);
            var12.method_15609(var8);
         }

         long var5 = System.nanoTime();
         class_3381 var7 = new class_3381(field_37862[var4], field_37862[var4], field_37862[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field_37862[var4]][(int)field_37862[var4]][2 * (int)field_37862[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_37864; var11++) {
            class_9858.method_45466(field_37862[var4], field_37862[var4], 2L * field_37862[var4], var16);
            var5 = System.nanoTime();
            var7.method_15609(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkFloatComplexForwardFFT_3D_input_3D.txt", field_37861, field_37864, field_37863, field_37857, field_37862, var2, var3);
   }

   public static void method_33797() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Real forward FFT 3D (input 1D) of size " + field_37862[var4] + " x " + field_37862[var4] + " x " + field_37862[var4]);
         if (field_37863) {
            class_3381 var12 = new class_3381(field_37862[var4], field_37862[var4], field_37862[var4]);
            class_4330 var8 = new class_4330(field_37862[var4] * field_37862[var4] * 2L * field_37862[var4], false);
            var12.method_15610(var8);
            class_9858.method_45462(field_37862[var4], field_37862[var4], field_37862[var4], var8);
            var12.method_15610(var8);
         }

         long var5 = System.nanoTime();
         class_3381 var7 = new class_3381(field_37862[var4], field_37862[var4], field_37862[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var16 = new class_4330(field_37862[var4] * field_37862[var4] * 2L * field_37862[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_37864; var11++) {
            class_9858.method_45462(field_37862[var4], field_37862[var4], field_37862[var4], var16);
            var5 = System.nanoTime();
            var7.method_15610(var16);
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

      class_9858.method_45454("benchmarkFloatRealForwardFFT_3D_input_1D.txt", field_37861, field_37864, field_37863, field_37857, field_37862, var2, var3);
   }

   public static void method_33788() {
      double[] var2 = new double[field_37855];
      double[] var3 = new double[field_37855];

      for (int var4 = 0; var4 < field_37855; var4++) {
         System.out.println("Real forward FFT 3D (input 3D) of size " + field_37862[var4] + " x " + field_37862[var4] + " x " + field_37862[var4]);
         if (field_37863) {
            class_3381 var12 = new class_3381(field_37862[var4], field_37862[var4], field_37862[var4]);
            float[][][] var8 = new float[(int)field_37862[var4]][(int)field_37862[var4]][2 * (int)field_37862[var4]];
            class_9858.method_45466(field_37862[var4], field_37862[var4], field_37862[var4], var8);
            var12.method_15612(var8);
            class_9858.method_45466(field_37862[var4], field_37862[var4], field_37862[var4], var8);
            var12.method_15612(var8);
         }

         long var5 = System.nanoTime();
         class_3381 var7 = new class_3381(field_37862[var4], field_37862[var4], field_37862[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field_37862[var4]][(int)field_37862[var4]][2 * (int)field_37862[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_37864; var11++) {
            class_9858.method_45466(field_37862[var4], field_37862[var4], field_37862[var4], var16);
            var5 = System.nanoTime();
            var7.method_15612(var16);
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
         class_2751.method_12405(5000L);
      }

      class_9858.method_45454("benchmarkFloatRealForwardFFT_3D_input_3D.txt", field_37861, field_37864, field_37863, field_37857, field_37862, var2, var3);
   }

   public static void main(String[] var0) {
      method_33796(var0);
      method_33792();
      method_33795();
      method_33793();
      method_33794();
      method_33791();
      method_33787();
      method_33790();
      method_33789();
      method_33797();
      method_33788();
      System.exit(0);
   }
}
