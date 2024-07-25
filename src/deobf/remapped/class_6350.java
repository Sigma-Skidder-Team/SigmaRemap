package remapped;

import java.util.Arrays;

public class class_6350 {
   private static int field_32423 = 8;
   private static int field_32422 = 200;
   private static int field_32425 = 16;
   private static int field_32417 = 65636;
   private static int field_32418 = 65636;
   private static boolean field_32419 = true;
   private static long[] field_32416 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field_32421 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field_32426 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field_32420 = false;

   private class_6350() {
   }

   public static void method_29089(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field_32423 = Integer.parseInt(var0[0]);
         field_32417 = Integer.parseInt(var0[1]);
         field_32418 = Integer.parseInt(var0[2]);
         field_32422 = Integer.parseInt(var0[3]);
         field_32419 = Boolean.parseBoolean(var0[4]);
         field_32420 = Boolean.parseBoolean(var0[5]);
         field_32425 = Integer.parseInt(var0[6]);
         field_32416 = new long[field_32425];
         field_32421 = new long[field_32425];
         field_32426 = new long[field_32425];

         for (int var3 = 0; var3 < field_32425; var3++) {
            field_32416[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field_32425; var4++) {
            field_32421[var4] = (long)Integer.parseInt(var0[7 + field_32425 + var4]);
         }

         for (int var5 = 0; var5 < field_32425; var5++) {
            field_32426[var5] = (long)Integer.parseInt(var0[7 + field_32425 + field_32425 + var5]);
         }
      }

      class_1266.method_5697(field_32423);
      class_2751.method_12397((long)field_32417);
      class_2751.method_12498((long)field_32418);
      System.out.println("nthred = " + field_32423);
      System.out.println("threadsBegin2D = " + field_32417);
      System.out.println("threadsBegin3D = " + field_32418);
      System.out.println("niter = " + field_32422);
      System.out.println("doWarmup = " + field_32419);
      System.out.println("doScaling = " + field_32420);
      System.out.println("nsize = " + field_32425);
      System.out.println("sizes1D[] = " + Arrays.toString(field_32416));
      System.out.println("sizes2D[] = " + Arrays.toString(field_32421));
      System.out.println("sizes3D[] = " + Arrays.toString(field_32426));
   }

   public static void method_29085() {
      double[] var2 = new double[field_32425];
      double[] var3 = new double[field_32425];

      for (int var4 = 0; var4 < field_32425; var4++) {
         System.out.println("Forward DST 1D of size " + field_32416[var4]);
         if (field_32419) {
            class_6819 var12 = new class_6819(field_32416[var4]);
            double[] var8 = new double[(int)field_32416[var4]];
            class_9858.method_45421(field_32416[var4], var8);
            var12.method_31295(var8, field_32420);
            class_9858.method_45421(field_32416[var4], var8);
            var12.method_31295(var8, field_32420);
         }

         long var5 = System.nanoTime();
         class_6819 var7 = new class_6819(field_32416[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)field_32416[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_32422; var11++) {
            class_9858.method_45421(field_32416[var4], var16);
            var5 = System.nanoTime();
            var7.method_31295(var16, field_32420);
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

      class_9858.method_45454("benchmarkDoubleForwardDST_1D.txt", field_32423, field_32422, field_32419, field_32420, field_32416, var2, var3);
   }

   public static void method_29088() {
      double[] var2 = new double[field_32425];
      double[] var3 = new double[field_32425];

      for (int var4 = 0; var4 < field_32425; var4++) {
         System.out.println("Forward DST 2D (input 1D) of size " + field_32421[var4] + " x " + field_32421[var4]);
         if (field_32419) {
            class_6842 var12 = new class_6842(field_32421[var4], field_32421[var4]);
            class_1702 var8 = new class_1702(field_32421[var4] * field_32421[var4], false);
            class_9858.method_45424(field_32421[var4], field_32421[var4], var8);
            var12.method_31362(var8, field_32420);
            class_9858.method_45424(field_32421[var4], field_32421[var4], var8);
            var12.method_31362(var8, field_32420);
         }

         long var5 = System.nanoTime();
         class_6842 var7 = new class_6842(field_32421[var4], field_32421[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var16 = new class_1702(field_32421[var4] * field_32421[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_32422; var11++) {
            class_9858.method_45424(field_32421[var4], field_32421[var4], var16);
            var5 = System.nanoTime();
            var7.method_31362(var16, field_32420);
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

      class_9858.method_45454("benchmarkDoubleForwardDST_2D_input_1D.txt", field_32423, field_32422, field_32419, field_32420, field_32421, var2, var3);
   }

   public static void method_29086() {
      double[] var2 = new double[field_32425];
      double[] var3 = new double[field_32425];

      for (int var4 = 0; var4 < field_32425; var4++) {
         System.out.println("Forward DST 2D (input 2D) of size " + field_32421[var4] + " x " + field_32421[var4]);
         if (field_32419) {
            class_6842 var12 = new class_6842(field_32421[var4], field_32421[var4]);
            double[][] var8 = new double[(int)field_32421[var4]][(int)field_32421[var4]];
            class_9858.method_45428(field_32421[var4], field_32421[var4], var8);
            var12.method_31364(var8, field_32420);
            class_9858.method_45428(field_32421[var4], field_32421[var4], var8);
            var12.method_31364(var8, field_32420);
         }

         long var5 = System.nanoTime();
         class_6842 var7 = new class_6842(field_32421[var4], field_32421[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field_32421[var4]][(int)field_32421[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_32422; var11++) {
            class_9858.method_45428(field_32421[var4], field_32421[var4], var16);
            var5 = System.nanoTime();
            var7.method_31364(var16, field_32420);
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

      class_9858.method_45454("benchmarkDoubleForwardDST_2D_input_2D.txt", field_32423, field_32422, field_32419, field_32420, field_32421, var2, var3);
   }

   public static void method_29087() {
      double[] var2 = new double[field_32425];
      double[] var3 = new double[field_32425];

      for (int var4 = 0; var4 < field_32425; var4++) {
         System.out.println("Forward DST 3D (input 1D) of size " + field_32426[var4] + " x " + field_32426[var4] + " x " + field_32426[var4]);
         if (field_32419) {
            class_84 var12 = new class_84(field_32426[var4], field_32426[var4], field_32426[var4]);
            class_1702 var8 = new class_1702(field_32426[var4] * field_32426[var4] * field_32426[var4], false);
            class_9858.method_45461(field_32426[var4], field_32426[var4], field_32426[var4], var8);
            var12.method_176(var8, field_32420);
            class_9858.method_45461(field_32426[var4], field_32426[var4], field_32426[var4], var8);
            var12.method_176(var8, field_32420);
         }

         long var5 = System.nanoTime();
         class_84 var7 = new class_84(field_32426[var4], field_32426[var4], field_32426[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var16 = new class_1702(field_32426[var4] * field_32426[var4] * field_32426[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_32422; var11++) {
            class_9858.method_45461(field_32426[var4], field_32426[var4], field_32426[var4], var16);
            var5 = System.nanoTime();
            var7.method_176(var16, field_32420);
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

      class_9858.method_45454("benchmarkDoubleForwardDST_3D_input_1D.txt", field_32423, field_32422, field_32419, field_32420, field_32426, var2, var3);
   }

   public static void method_29084() {
      double[] var2 = new double[field_32425];
      double[] var3 = new double[field_32425];

      for (int var4 = 0; var4 < field_32425; var4++) {
         System.out.println("Forward DST 3D (input 3D) of size " + field_32426[var4] + " x " + field_32426[var4] + " x " + field_32426[var4]);
         if (field_32419) {
            class_84 var12 = new class_84(field_32426[var4], field_32426[var4], field_32426[var4]);
            double[][][] var8 = new double[(int)field_32426[var4]][(int)field_32426[var4]][(int)field_32426[var4]];
            class_9858.method_45465(field_32426[var4], field_32426[var4], field_32426[var4], var8);
            var12.method_178(var8, field_32420);
            class_9858.method_45465(field_32426[var4], field_32426[var4], field_32426[var4], var8);
            var12.method_178(var8, field_32420);
         }

         long var5 = System.nanoTime();
         class_84 var7 = new class_84(field_32426[var4], field_32426[var4], field_32426[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field_32426[var4]][(int)field_32426[var4]][(int)field_32426[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_32422; var11++) {
            class_9858.method_45465(field_32426[var4], field_32426[var4], field_32426[var4], var16);
            var5 = System.nanoTime();
            var7.method_178(var16, field_32420);
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

      class_9858.method_45454("benchmarkDoubleForwardDST_3D_input_3D.txt", field_32423, field_32422, field_32419, field_32420, field_32426, var2, var3);
   }

   public static void main(String[] var0) {
      method_29089(var0);
      method_29085();
      method_29088();
      method_29086();
      method_29087();
      method_29084();
      System.exit(0);
   }
}
