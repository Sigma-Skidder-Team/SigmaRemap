package remapped;

import java.util.Arrays;

public class class_7140 {
   private static int field_36786 = 8;
   private static int field_36788 = 200;
   private static int field_36778 = 16;
   private static int field_36783 = 65636;
   private static int field_36782 = 65636;
   private static boolean field_36784 = true;
   private static long[] field_36780 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field_36779 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field_36781 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field_36785 = false;

   private class_7140() {
   }

   public static void method_32787(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field_36786 = Integer.parseInt(var0[0]);
         field_36783 = Integer.parseInt(var0[1]);
         field_36782 = Integer.parseInt(var0[2]);
         field_36788 = Integer.parseInt(var0[3]);
         field_36784 = Boolean.parseBoolean(var0[4]);
         field_36785 = Boolean.parseBoolean(var0[5]);
         field_36778 = Integer.parseInt(var0[6]);
         field_36780 = new long[field_36778];
         field_36779 = new long[field_36778];
         field_36781 = new long[field_36778];

         for (int var3 = 0; var3 < field_36778; var3++) {
            field_36780[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field_36778; var4++) {
            field_36779[var4] = (long)Integer.parseInt(var0[7 + field_36778 + var4]);
         }

         for (int var5 = 0; var5 < field_36778; var5++) {
            field_36781[var5] = (long)Integer.parseInt(var0[7 + field_36778 + field_36778 + var5]);
         }
      }

      class_1266.method_5697(field_36786);
      class_2751.method_12397((long)field_36783);
      class_2751.method_12498((long)field_36782);
      System.out.println("nthred = " + field_36786);
      System.out.println("threadsBegin2D = " + field_36783);
      System.out.println("threadsBegin3D = " + field_36782);
      System.out.println("niter = " + field_36788);
      System.out.println("doWarmup = " + field_36784);
      System.out.println("doScaling = " + field_36785);
      System.out.println("nsize = " + field_36778);
      System.out.println("sizes1D[] = " + Arrays.toString(field_36780));
      System.out.println("sizes2D[] = " + Arrays.toString(field_36779));
      System.out.println("sizes3D[] = " + Arrays.toString(field_36781));
   }

   public static void method_32781() {
      double[] var2 = new double[field_36778];
      double[] var3 = new double[field_36778];

      for (int var4 = 0; var4 < field_36778; var4++) {
         System.out.println("Forward DST 1D of size " + field_36780[var4]);
         if (field_36784) {
            class_4133 var12 = new class_4133(field_36780[var4]);
            float[] var8 = new float[(int)field_36780[var4]];
            class_9858.method_45422(field_36780[var4], var8);
            var12.method_19197(var8, field_36785);
            class_9858.method_45422(field_36780[var4], var8);
            var12.method_19197(var8, field_36785);
         }

         long var5 = System.nanoTime();
         class_4133 var7 = new class_4133(field_36780[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)field_36780[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_36788; var11++) {
            class_9858.method_45422(field_36780[var4], var16);
            var5 = System.nanoTime();
            var7.method_19197(var16, field_36785);
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

      class_9858.method_45454("benchmarkFloatForwardDST_1D.txt", field_36786, field_36788, field_36784, field_36785, field_36780, var2, var3);
   }

   public static void method_32782() {
      double[] var2 = new double[field_36778];
      double[] var3 = new double[field_36778];

      for (int var4 = 0; var4 < field_36778; var4++) {
         System.out.println("Forward DST 2D (input 1D) of size " + field_36779[var4] + " x " + field_36779[var4]);
         if (field_36784) {
            class_5519 var12 = new class_5519(field_36779[var4], field_36779[var4]);
            class_4330 var8 = new class_4330(field_36779[var4] * field_36779[var4], false);
            class_9858.method_45425(field_36779[var4], field_36779[var4], var8);
            var12.method_24992(var8, field_36785);
            class_9858.method_45425(field_36779[var4], field_36779[var4], var8);
            var12.method_24992(var8, field_36785);
         }

         long var5 = System.nanoTime();
         class_5519 var7 = new class_5519(field_36779[var4], field_36779[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var16 = new class_4330(field_36779[var4] * field_36779[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_36788; var11++) {
            class_9858.method_45425(field_36779[var4], field_36779[var4], var16);
            var5 = System.nanoTime();
            var7.method_24992(var16, field_36785);
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

      class_9858.method_45454("benchmarkFloatForwardDST_2D_input_1D.txt", field_36786, field_36788, field_36784, field_36785, field_36779, var2, var3);
   }

   public static void method_32786() {
      double[] var2 = new double[field_36778];
      double[] var3 = new double[field_36778];

      for (int var4 = 0; var4 < field_36778; var4++) {
         System.out.println("Forward DST 2D (input 2D) of size " + field_36779[var4] + " x " + field_36779[var4]);
         if (field_36784) {
            class_5519 var12 = new class_5519(field_36779[var4], field_36779[var4]);
            float[][] var8 = new float[(int)field_36779[var4]][(int)field_36779[var4]];
            class_9858.method_45429(field_36779[var4], field_36779[var4], var8);
            var12.method_24994(var8, field_36785);
            class_9858.method_45429(field_36779[var4], field_36779[var4], var8);
            var12.method_24994(var8, field_36785);
         }

         long var5 = System.nanoTime();
         class_5519 var7 = new class_5519(field_36779[var4], field_36779[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field_36779[var4]][(int)field_36779[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_36788; var11++) {
            class_9858.method_45429(field_36779[var4], field_36779[var4], var16);
            var5 = System.nanoTime();
            var7.method_24994(var16, field_36785);
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

      class_9858.method_45454("benchmarkFloatForwardDST_2D_input_2D.txt", field_36786, field_36788, field_36784, field_36785, field_36779, var2, var3);
   }

   public static void method_32785() {
      double[] var2 = new double[field_36778];
      double[] var3 = new double[field_36778];

      for (int var4 = 0; var4 < field_36778; var4++) {
         System.out.println("Forward DST 3D (input 1D) of size " + field_36781[var4] + " x " + field_36781[var4] + " x " + field_36781[var4]);
         if (field_36784) {
            class_3101 var12 = new class_3101(field_36781[var4], field_36781[var4], field_36781[var4]);
            class_4330 var8 = new class_4330(field_36781[var4] * field_36781[var4] * field_36781[var4], false);
            class_9858.method_45462(field_36781[var4], field_36781[var4], field_36781[var4], var8);
            var12.method_14188(var8, field_36785);
            class_9858.method_45462(field_36781[var4], field_36781[var4], field_36781[var4], var8);
            var12.method_14188(var8, field_36785);
         }

         long var5 = System.nanoTime();
         class_3101 var7 = new class_3101(field_36781[var4], field_36781[var4], field_36781[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var16 = new class_4330(field_36781[var4] * field_36781[var4] * field_36781[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_36788; var11++) {
            class_9858.method_45462(field_36781[var4], field_36781[var4], field_36781[var4], var16);
            var5 = System.nanoTime();
            var7.method_14188(var16, field_36785);
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

      class_9858.method_45454("benchmarkFloatForwardDST_3D_input_1D.txt", field_36786, field_36788, field_36784, field_36785, field_36781, var2, var3);
   }

   public static void method_32784() {
      double[] var2 = new double[field_36778];
      double[] var3 = new double[field_36778];

      for (int var4 = 0; var4 < field_36778; var4++) {
         System.out.println("Forward DST 3D (input 3D) of size " + field_36781[var4] + " x " + field_36781[var4] + " x " + field_36781[var4]);
         if (field_36784) {
            class_3101 var12 = new class_3101(field_36781[var4], field_36781[var4], field_36781[var4]);
            float[][][] var8 = new float[(int)field_36781[var4]][(int)field_36781[var4]][(int)field_36781[var4]];
            class_9858.method_45466(field_36781[var4], field_36781[var4], field_36781[var4], var8);
            var12.method_14190(var8, field_36785);
            class_9858.method_45466(field_36781[var4], field_36781[var4], field_36781[var4], var8);
            var12.method_14190(var8, field_36785);
         }

         long var5 = System.nanoTime();
         class_3101 var7 = new class_3101(field_36781[var4], field_36781[var4], field_36781[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field_36781[var4]][(int)field_36781[var4]][(int)field_36781[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_36788; var11++) {
            class_9858.method_45466(field_36781[var4], field_36781[var4], field_36781[var4], var16);
            var5 = System.nanoTime();
            var7.method_14190(var16, field_36785);
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

      class_9858.method_45454("benchmarkFloatForwardDST_3D_input_3D.txt", field_36786, field_36788, field_36784, field_36785, field_36781, var2, var3);
   }

   public static void main(String[] var0) {
      method_32787(var0);
      method_32781();
      method_32782();
      method_32786();
      method_32785();
      method_32784();
      System.exit(0);
   }
}
