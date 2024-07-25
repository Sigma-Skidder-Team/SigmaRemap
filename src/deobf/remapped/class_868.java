package remapped;

import java.util.Arrays;

public class class_868 {
   private static int field_4503 = 8;
   private static int field_4500 = 200;
   private static int field_4498 = 16;
   private static int field_4505 = 65636;
   private static int field_4497 = 65636;
   private static boolean field_4501 = true;
   private static long[] field_4496 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field_4506 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field_4504 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field_4499 = false;

   private class_868() {
   }

   public static void method_3752(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field_4503 = Integer.parseInt(var0[0]);
         field_4505 = Integer.parseInt(var0[1]);
         field_4497 = Integer.parseInt(var0[2]);
         field_4500 = Integer.parseInt(var0[3]);
         field_4501 = Boolean.parseBoolean(var0[4]);
         field_4499 = Boolean.parseBoolean(var0[5]);
         field_4498 = Integer.parseInt(var0[6]);
         field_4496 = new long[field_4498];
         field_4506 = new long[field_4498];
         field_4504 = new long[field_4498];

         for (int var3 = 0; var3 < field_4498; var3++) {
            field_4496[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field_4498; var4++) {
            field_4506[var4] = (long)Integer.parseInt(var0[7 + field_4498 + var4]);
         }

         for (int var5 = 0; var5 < field_4498; var5++) {
            field_4504[var5] = (long)Integer.parseInt(var0[7 + field_4498 + field_4498 + var5]);
         }
      }

      class_1266.method_5697(field_4503);
      class_2751.method_12397((long)field_4505);
      class_2751.method_12498((long)field_4497);
      System.out.println("nthred = " + field_4503);
      System.out.println("threadsBegin2D = " + field_4505);
      System.out.println("threadsBegin3D = " + field_4497);
      System.out.println("niter = " + field_4500);
      System.out.println("doWarmup = " + field_4501);
      System.out.println("doScaling = " + field_4499);
      System.out.println("nsize = " + field_4498);
      System.out.println("sizes1D[] = " + Arrays.toString(field_4496));
      System.out.println("sizes2D[] = " + Arrays.toString(field_4506));
      System.out.println("sizes3D[] = " + Arrays.toString(field_4504));
   }

   public static void method_3756() {
      double[] var2 = new double[field_4498];
      double[] var3 = new double[field_4498];

      for (int var4 = 0; var4 < field_4498; var4++) {
         System.out.println("Forward DHT 1D of size " + field_4496[var4]);
         if (field_4501) {
            class_6816 var12 = new class_6816(field_4496[var4]);
            double[] var8 = new double[(int)field_4496[var4]];
            class_9858.method_45421(field_4496[var4], var8);
            var12.method_31275(var8);
            class_9858.method_45421(field_4496[var4], var8);
            var12.method_31275(var8);
         }

         long var5 = System.nanoTime();
         class_6816 var7 = new class_6816(field_4496[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)field_4496[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_4500; var11++) {
            class_9858.method_45421(field_4496[var4], var16);
            var5 = System.nanoTime();
            var7.method_31275(var16);
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

      class_9858.method_45454("benchmarkDoubleForwardDHT_1D.txt", field_4503, field_4500, field_4501, field_4499, field_4496, var2, var3);
   }

   public static void method_3757() {
      double[] var2 = new double[field_4498];
      double[] var3 = new double[field_4498];

      for (int var4 = 0; var4 < field_4498; var4++) {
         System.out.println("Forward DHT 2D (input 1D) of size " + field_4506[var4] + " x " + field_4506[var4]);
         if (field_4501) {
            class_7380 var12 = new class_7380(field_4506[var4], field_4506[var4]);
            class_1702 var8 = new class_1702(field_4506[var4] * field_4506[var4], false);
            class_9858.method_45424(field_4506[var4], field_4506[var4], var8);
            var12.method_33601(var8);
            class_9858.method_45424(field_4506[var4], field_4506[var4], var8);
            var12.method_33601(var8);
         }

         long var5 = System.nanoTime();
         class_7380 var7 = new class_7380(field_4506[var4], field_4506[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var16 = new class_1702(field_4506[var4] * field_4506[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_4500; var11++) {
            class_9858.method_45424(field_4506[var4], field_4506[var4], var16);
            var5 = System.nanoTime();
            var7.method_33601(var16);
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

      class_9858.method_45454("benchmarkDoubleForwardDHT_2D_input_1D.txt", field_4503, field_4500, field_4501, field_4499, field_4506, var2, var3);
   }

   public static void method_3755() {
      double[] var2 = new double[field_4498];
      double[] var3 = new double[field_4498];

      for (int var4 = 0; var4 < field_4498; var4++) {
         System.out.println("Forward DHT 2D (input 2D) of size " + field_4506[var4] + " x " + field_4506[var4]);
         if (field_4501) {
            class_7380 var12 = new class_7380(field_4506[var4], field_4506[var4]);
            double[][] var8 = new double[(int)field_4506[var4]][(int)field_4506[var4]];
            class_9858.method_45428(field_4506[var4], field_4506[var4], var8);
            var12.method_33603(var8);
            class_9858.method_45428(field_4506[var4], field_4506[var4], var8);
            var12.method_33603(var8);
         }

         long var5 = System.nanoTime();
         class_7380 var7 = new class_7380(field_4506[var4], field_4506[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field_4506[var4]][(int)field_4506[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_4500; var11++) {
            class_9858.method_45428(field_4506[var4], field_4506[var4], var16);
            var5 = System.nanoTime();
            var7.method_33603(var16);
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

      class_9858.method_45454("benchmarkDoubleForwardDHT_2D_input_2D.txt", field_4503, field_4500, field_4501, field_4499, field_4506, var2, var3);
   }

   public static void method_3758() {
      double[] var2 = new double[field_4498];
      double[] var3 = new double[field_4498];

      for (int var4 = 0; var4 < field_4498; var4++) {
         System.out.println("Forward DHT 3D (input 1D) of size " + field_4504[var4] + " x " + field_4504[var4] + " x " + field_4504[var4]);
         if (field_4501) {
            class_6056 var12 = new class_6056(field_4504[var4], field_4504[var4], field_4504[var4]);
            class_1702 var8 = new class_1702(field_4504[var4] * field_4504[var4] * field_4504[var4], false);
            class_9858.method_45461(field_4504[var4], field_4504[var4], field_4504[var4], var8);
            var12.method_27650(var8);
            class_9858.method_45461(field_4504[var4], field_4504[var4], field_4504[var4], var8);
            var12.method_27650(var8);
         }

         long var5 = System.nanoTime();
         class_6056 var7 = new class_6056(field_4504[var4], field_4504[var4], field_4504[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var16 = new class_1702(field_4504[var4] * field_4504[var4] * field_4504[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_4500; var11++) {
            class_9858.method_45461(field_4504[var4], field_4504[var4], field_4504[var4], var16);
            var5 = System.nanoTime();
            var7.method_27650(var16);
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

      class_9858.method_45454("benchmarkDoubleForwardDHT_3D_input_1D.txt", field_4503, field_4500, field_4501, field_4499, field_4504, var2, var3);
   }

   public static void method_3754() {
      double[] var2 = new double[field_4498];
      double[] var3 = new double[field_4498];

      for (int var4 = 0; var4 < field_4498; var4++) {
         System.out.println("Forward DHT 3D (input 3D) of size " + field_4504[var4] + " x " + field_4504[var4] + " x " + field_4504[var4]);
         if (field_4501) {
            class_6056 var12 = new class_6056(field_4504[var4], field_4504[var4], field_4504[var4]);
            double[][][] var8 = new double[(int)field_4504[var4]][(int)field_4504[var4]][(int)field_4504[var4]];
            class_9858.method_45465(field_4504[var4], field_4504[var4], field_4504[var4], var8);
            var12.method_27652(var8);
            class_9858.method_45465(field_4504[var4], field_4504[var4], field_4504[var4], var8);
            var12.method_27652(var8);
         }

         long var5 = System.nanoTime();
         class_6056 var7 = new class_6056(field_4504[var4], field_4504[var4], field_4504[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field_4504[var4]][(int)field_4504[var4]][(int)field_4504[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_4500; var11++) {
            class_9858.method_45465(field_4504[var4], field_4504[var4], field_4504[var4], var16);
            var5 = System.nanoTime();
            var7.method_27652(var16);
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

      class_9858.method_45454("benchmarkDoubleForwardDHT_3D_input_3D.txt", field_4503, field_4500, field_4501, field_4499, field_4504, var2, var3);
   }

   public static void main(String[] var0) {
      method_3752(var0);
      method_3756();
      method_3757();
      method_3755();
      method_3758();
      method_3754();
      System.exit(0);
   }
}
