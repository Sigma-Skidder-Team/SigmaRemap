package remapped;

import java.util.Arrays;

public class class_6471 {
   private static int field_32984 = 8;
   private static int field_32980 = 200;
   private static int field_32983 = 16;
   private static int field_32985 = 65636;
   private static int field_32981 = 65636;
   private static boolean field_32988 = true;
   private static long[] field_32990 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field_32982 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field_32989 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field_32987 = false;

   private class_6471() {
   }

   public static void method_29479(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field_32984 = Integer.parseInt(var0[0]);
         field_32985 = Integer.parseInt(var0[1]);
         field_32981 = Integer.parseInt(var0[2]);
         field_32980 = Integer.parseInt(var0[3]);
         field_32988 = Boolean.parseBoolean(var0[4]);
         field_32987 = Boolean.parseBoolean(var0[5]);
         field_32983 = Integer.parseInt(var0[6]);
         field_32990 = new long[field_32983];
         field_32982 = new long[field_32983];
         field_32989 = new long[field_32983];

         for (int var3 = 0; var3 < field_32983; var3++) {
            field_32990[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field_32983; var4++) {
            field_32982[var4] = (long)Integer.parseInt(var0[7 + field_32983 + var4]);
         }

         for (int var5 = 0; var5 < field_32983; var5++) {
            field_32989[var5] = (long)Integer.parseInt(var0[7 + field_32983 + field_32983 + var5]);
         }
      }

      class_1266.method_5697(field_32984);
      class_2751.method_12397((long)field_32985);
      class_2751.method_12498((long)field_32981);
      System.out.println("nthred = " + field_32984);
      System.out.println("threadsBegin2D = " + field_32985);
      System.out.println("threadsBegin3D = " + field_32981);
      System.out.println("niter = " + field_32980);
      System.out.println("doWarmup = " + field_32988);
      System.out.println("doScaling = " + field_32987);
      System.out.println("nsize = " + field_32983);
      System.out.println("sizes1D[] = " + Arrays.toString(field_32990));
      System.out.println("sizes2D[] = " + Arrays.toString(field_32982));
      System.out.println("sizes3D[] = " + Arrays.toString(field_32989));
   }

   public static void method_29476() {
      double[] var2 = new double[field_32983];
      double[] var3 = new double[field_32983];

      for (int var4 = 0; var4 < field_32983; var4++) {
         System.out.println("Forward DCT 1D of size " + field_32990[var4]);
         if (field_32988) {
            class_4560 var12 = new class_4560(field_32990[var4]);
            float[] var8 = new float[(int)field_32990[var4]];
            class_9858.method_45422(field_32990[var4], var8);
            var12.method_21140(var8, field_32987);
            class_9858.method_45422(field_32990[var4], var8);
            var12.method_21140(var8, field_32987);
         }

         long var5 = System.nanoTime();
         class_4560 var7 = new class_4560(field_32990[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)field_32990[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_32980; var11++) {
            class_9858.method_45422(field_32990[var4], var16);
            var5 = System.nanoTime();
            var7.method_21140(var16, field_32987);
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

      class_9858.method_45454("benchmarkFloatForwardDCT_1D.txt", field_32984, field_32980, field_32988, field_32987, field_32990, var2, var3);
   }

   public static void method_29474() {
      double[] var2 = new double[field_32983];
      double[] var3 = new double[field_32983];

      for (int var4 = 0; var4 < field_32983; var4++) {
         System.out.println("Forward DCT 2D (input 1D) of size " + field_32982[var4] + " x " + field_32982[var4]);
         if (field_32988) {
            class_8751 var12 = new class_8751(field_32982[var4], field_32982[var4]);
            class_4330 var8 = new class_4330(field_32982[var4] * field_32982[var4], false);
            class_9858.method_45425(field_32982[var4], field_32982[var4], var8);
            var12.method_40181(var8, field_32987);
            class_9858.method_45425(field_32982[var4], field_32982[var4], var8);
            var12.method_40181(var8, field_32987);
         }

         long var5 = System.nanoTime();
         class_8751 var7 = new class_8751(field_32982[var4], field_32982[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var16 = new class_4330(field_32982[var4] * field_32982[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_32980; var11++) {
            class_9858.method_45425(field_32982[var4], field_32982[var4], var16);
            var5 = System.nanoTime();
            var7.method_40181(var16, field_32987);
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

      class_9858.method_45454("benchmarkFloatForwardDCT_2D_input_1D.txt", field_32984, field_32980, field_32988, field_32987, field_32982, var2, var3);
   }

   public static void method_29477() {
      double[] var2 = new double[field_32983];
      double[] var3 = new double[field_32983];

      for (int var4 = 0; var4 < field_32983; var4++) {
         System.out.println("Forward DCT 2D (input 2D) of size " + field_32982[var4] + " x " + field_32982[var4]);
         if (field_32988) {
            class_8751 var12 = new class_8751(field_32982[var4], field_32982[var4]);
            float[][] var8 = new float[(int)field_32982[var4]][(int)field_32982[var4]];
            class_9858.method_45429(field_32982[var4], field_32982[var4], var8);
            var12.method_40183(var8, field_32987);
            class_9858.method_45429(field_32982[var4], field_32982[var4], var8);
            var12.method_40183(var8, field_32987);
         }

         long var5 = System.nanoTime();
         class_8751 var7 = new class_8751(field_32982[var4], field_32982[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field_32982[var4]][(int)field_32982[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_32980; var11++) {
            class_9858.method_45429(field_32982[var4], field_32982[var4], var16);
            var5 = System.nanoTime();
            var7.method_40183(var16, field_32987);
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

      class_9858.method_45454("benchmarkFloatForwardDCT_2D_input_2D.txt", field_32984, field_32980, field_32988, field_32987, field_32982, var2, var3);
   }

   public static void method_29475() {
      double[] var2 = new double[field_32983];
      double[] var3 = new double[field_32983];

      for (int var4 = 0; var4 < field_32983; var4++) {
         System.out.println("Forward DCT 3D (input 1D) of size " + field_32989[var4] + " x " + field_32989[var4] + " x " + field_32989[var4]);
         if (field_32988) {
            class_2841 var12 = new class_2841(field_32989[var4], field_32989[var4], field_32989[var4]);
            class_4330 var8 = new class_4330(field_32989[var4] * field_32989[var4] * field_32989[var4], false);
            class_9858.method_45462(field_32989[var4], field_32989[var4], field_32989[var4], var8);
            var12.method_12915(var8, field_32987);
            class_9858.method_45462(field_32989[var4], field_32989[var4], field_32989[var4], var8);
            var12.method_12915(var8, field_32987);
         }

         long var5 = System.nanoTime();
         class_2841 var7 = new class_2841(field_32989[var4], field_32989[var4], field_32989[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var16 = new class_4330(field_32989[var4] * field_32989[var4] * field_32989[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_32980; var11++) {
            class_9858.method_45462(field_32989[var4], field_32989[var4], field_32989[var4], var16);
            var5 = System.nanoTime();
            var7.method_12915(var16, field_32987);
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

      class_9858.method_45454("benchmarkFloatForwardDCT_3D_input_1D.txt", field_32984, field_32980, field_32988, field_32987, field_32989, var2, var3);
   }

   public static void method_29478() {
      double[] var2 = new double[field_32983];
      double[] var3 = new double[field_32983];

      for (int var4 = 0; var4 < field_32983; var4++) {
         System.out.println("Forward DCT 3D (input 3D) of size " + field_32989[var4] + " x " + field_32989[var4] + " x " + field_32989[var4]);
         if (field_32988) {
            class_2841 var12 = new class_2841(field_32989[var4], field_32989[var4], field_32989[var4]);
            float[][][] var8 = new float[(int)field_32989[var4]][(int)field_32989[var4]][(int)field_32989[var4]];
            class_9858.method_45466(field_32989[var4], field_32989[var4], field_32989[var4], var8);
            var12.method_12917(var8, field_32987);
            class_9858.method_45466(field_32989[var4], field_32989[var4], field_32989[var4], var8);
            var12.method_12917(var8, field_32987);
         }

         long var5 = System.nanoTime();
         class_2841 var7 = new class_2841(field_32989[var4], field_32989[var4], field_32989[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field_32989[var4]][(int)field_32989[var4]][(int)field_32989[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_32980; var11++) {
            class_9858.method_45466(field_32989[var4], field_32989[var4], field_32989[var4], var16);
            var5 = System.nanoTime();
            var7.method_12917(var16, field_32987);
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

      class_9858.method_45454("benchmarkFloatForwardDCT_3D_input_3D.txt", field_32984, field_32980, field_32988, field_32987, field_32989, var2, var3);
   }

   public static void main(String[] var0) {
      method_29479(var0);
      method_29476();
      method_29474();
      method_29477();
      method_29475();
      method_29478();
      System.exit(0);
   }
}
