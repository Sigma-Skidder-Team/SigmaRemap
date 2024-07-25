package remapped;

import java.util.Arrays;

public class class_5281 {
   private static int field_27011 = 8;
   private static int field_27013 = 200;
   private static int field_27012 = 16;
   private static int field_27015 = 65636;
   private static int field_27009 = 65636;
   private static boolean field_27017 = true;
   private static long[] field_27016 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field_27014 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field_27008 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field_27010 = false;

   private class_5281() {
   }

   public static void method_24111(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field_27011 = Integer.parseInt(var0[0]);
         field_27015 = Integer.parseInt(var0[1]);
         field_27009 = Integer.parseInt(var0[2]);
         field_27013 = Integer.parseInt(var0[3]);
         field_27017 = Boolean.parseBoolean(var0[4]);
         field_27010 = Boolean.parseBoolean(var0[5]);
         field_27012 = Integer.parseInt(var0[6]);
         field_27016 = new long[field_27012];
         field_27014 = new long[field_27012];
         field_27008 = new long[field_27012];

         for (int var3 = 0; var3 < field_27012; var3++) {
            field_27016[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field_27012; var4++) {
            field_27014[var4] = (long)Integer.parseInt(var0[7 + field_27012 + var4]);
         }

         for (int var5 = 0; var5 < field_27012; var5++) {
            field_27008[var5] = (long)Integer.parseInt(var0[7 + field_27012 + field_27012 + var5]);
         }
      }

      class_1266.method_5697(field_27011);
      class_2751.method_12397((long)field_27015);
      class_2751.method_12498((long)field_27009);
      System.out.println("nthred = " + field_27011);
      System.out.println("threadsBegin2D = " + field_27015);
      System.out.println("threadsBegin3D = " + field_27009);
      System.out.println("niter = " + field_27013);
      System.out.println("doWarmup = " + field_27017);
      System.out.println("doScaling = " + field_27010);
      System.out.println("nsize = " + field_27012);
      System.out.println("sizes1D[] = " + Arrays.toString(field_27016));
      System.out.println("sizes2D[] = " + Arrays.toString(field_27014));
      System.out.println("sizes3D[] = " + Arrays.toString(field_27008));
   }

   public static void method_24108() {
      double[] var2 = new double[field_27012];
      double[] var3 = new double[field_27012];

      for (int var4 = 0; var4 < field_27012; var4++) {
         System.out.println("Forward DCT 1D of size " + field_27016[var4]);
         if (field_27017) {
            class_9697 var12 = new class_9697(field_27016[var4]);
            double[] var8 = new double[(int)field_27016[var4]];
            class_9858.method_45421(field_27016[var4], var8);
            var12.method_44816(var8, field_27010);
            class_9858.method_45421(field_27016[var4], var8);
            var12.method_44816(var8, field_27010);
         }

         long var5 = System.nanoTime();
         class_9697 var7 = new class_9697(field_27016[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)field_27016[var4]];
         if (field_27017) {
            class_9858.method_45421(field_27016[var4], var16);
            var7.method_44816(var16, field_27010);
            class_9858.method_45421(field_27016[var4], var16);
            var7.method_44816(var16, field_27010);
         }

         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_27013; var11++) {
            class_9858.method_45421(field_27016[var4], var16);
            var5 = System.nanoTime();
            var7.method_44816(var16, field_27010);
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

      class_9858.method_45454("benchmarkDoubleForwardDCT_1D.txt", field_27011, field_27013, field_27017, field_27010, field_27016, var2, var3);
   }

   public static void method_24109() {
      double[] var2 = new double[field_27012];
      double[] var3 = new double[field_27012];

      for (int var4 = 0; var4 < field_27012; var4++) {
         System.out.println("Forward DCT 2D (input 1D) of size " + field_27014[var4] + " x " + field_27014[var4]);
         if (field_27017) {
            class_7963 var12 = new class_7963(field_27014[var4], field_27014[var4]);
            class_1702 var8 = new class_1702(field_27014[var4] * field_27014[var4], false);
            class_9858.method_45424(field_27014[var4], field_27014[var4], var8);
            var12.method_36026(var8, field_27010);
            class_9858.method_45424(field_27014[var4], field_27014[var4], var8);
            var12.method_36026(var8, field_27010);
         }

         long var5 = System.nanoTime();
         class_7963 var7 = new class_7963(field_27014[var4], field_27014[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var16 = new class_1702(field_27014[var4] * field_27014[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_27013; var11++) {
            class_9858.method_45424(field_27014[var4], field_27014[var4], var16);
            var5 = System.nanoTime();
            var7.method_36026(var16, field_27010);
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

      class_9858.method_45454("benchmarkDoubleForwardDCT_2D_input_1D.txt", field_27011, field_27013, field_27017, field_27010, field_27014, var2, var3);
   }

   public static void method_24107() {
      double[] var2 = new double[field_27012];
      double[] var3 = new double[field_27012];

      for (int var4 = 0; var4 < field_27012; var4++) {
         System.out.println("Forward DCT 2D (input 2D) of size " + field_27014[var4] + " x " + field_27014[var4]);
         if (field_27017) {
            class_7963 var12 = new class_7963(field_27014[var4], field_27014[var4]);
            double[][] var8 = new double[(int)field_27014[var4]][(int)field_27014[var4]];
            class_9858.method_45428(field_27014[var4], field_27014[var4], var8);
            var12.method_36028(var8, field_27010);
            class_9858.method_45428(field_27014[var4], field_27014[var4], var8);
            var12.method_36028(var8, field_27010);
         }

         long var5 = System.nanoTime();
         class_7963 var7 = new class_7963(field_27014[var4], field_27014[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field_27014[var4]][(int)field_27014[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_27013; var11++) {
            class_9858.method_45428(field_27014[var4], field_27014[var4], var16);
            var5 = System.nanoTime();
            var7.method_36028(var16, field_27010);
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

      class_9858.method_45454("benchmarkDoubleForwardDCT_2D_input_2D.txt", field_27011, field_27013, field_27017, field_27010, field_27014, var2, var3);
   }

   public static void method_24113() {
      double[] var2 = new double[field_27012];
      double[] var3 = new double[field_27012];

      for (int var4 = 0; var4 < field_27012; var4++) {
         System.out.println("Forward DCT 3D (input 1D) of size " + field_27008[var4] + " x " + field_27008[var4] + " x " + field_27008[var4]);
         if (field_27017) {
            class_573 var12 = new class_573(field_27008[var4], field_27008[var4], field_27008[var4]);
            class_1702 var8 = new class_1702(field_27008[var4] * field_27008[var4] * field_27008[var4], false);
            class_9858.method_45461(field_27008[var4], field_27008[var4], field_27008[var4], var8);
            var12.method_2718(var8, field_27010);
            class_9858.method_45461(field_27008[var4], field_27008[var4], field_27008[var4], var8);
            var12.method_2718(var8, field_27010);
         }

         long var5 = System.nanoTime();
         class_573 var7 = new class_573(field_27008[var4], field_27008[var4], field_27008[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_1702 var16 = new class_1702(field_27008[var4] * field_27008[var4] * field_27008[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_27013; var11++) {
            class_9858.method_45461(field_27008[var4], field_27008[var4], field_27008[var4], var16);
            var5 = System.nanoTime();
            var7.method_2718(var16, field_27010);
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

      class_9858.method_45454("benchmarkDoubleForwardDCT_3D_input_1D.txt", field_27011, field_27013, field_27017, field_27010, field_27008, var2, var3);
   }

   public static void method_24110() {
      double[] var2 = new double[field_27012];
      double[] var3 = new double[field_27012];

      for (int var4 = 0; var4 < field_27012; var4++) {
         System.out.println("Forward DCT 3D (input 3D) of size " + field_27008[var4] + " x " + field_27008[var4] + " x " + field_27008[var4]);
         if (field_27017) {
            class_573 var12 = new class_573(field_27008[var4], field_27008[var4], field_27008[var4]);
            double[][][] var8 = new double[(int)field_27008[var4]][(int)field_27008[var4]][(int)field_27008[var4]];
            class_9858.method_45465(field_27008[var4], field_27008[var4], field_27008[var4], var8);
            var12.method_2720(var8, field_27010);
            class_9858.method_45465(field_27008[var4], field_27008[var4], field_27008[var4], var8);
            var12.method_2720(var8, field_27010);
         }

         long var5 = System.nanoTime();
         class_573 var7 = new class_573(field_27008[var4], field_27008[var4], field_27008[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field_27008[var4]][(int)field_27008[var4]][(int)field_27008[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field_27013; var11++) {
            class_9858.method_45465(field_27008[var4], field_27008[var4], field_27008[var4], var16);
            var5 = System.nanoTime();
            var7.method_2720(var16, field_27010);
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

      class_9858.method_45454("benchmarkDoubleForwardDCT_3D_input_3D.txt", field_27011, field_27013, field_27017, field_27010, field_27008, var2, var3);
   }

   public static void main(String[] var0) {
      method_24111(var0);
      method_24108();
      method_24109();
      method_24107();
      method_24113();
      method_24110();
      System.exit(0);
   }
}
