package mapped;

import java.util.Arrays;

public class Class8911 {
   private static int field40325 = 8;
   private static int field40326 = 200;
   private static int field40327 = 16;
   private static int field40328 = 65636;
   private static int field40329 = 65636;
   private static boolean field40330 = true;
   private static long[] field40331 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field40332 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field40333 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field40334 = false;

   private Class8911() {
   }

   public static void method32570(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field40325 = Integer.parseInt(var0[0]);
         field40328 = Integer.parseInt(var0[1]);
         field40329 = Integer.parseInt(var0[2]);
         field40326 = Integer.parseInt(var0[3]);
         field40330 = Boolean.parseBoolean(var0[4]);
         field40334 = Boolean.parseBoolean(var0[5]);
         field40327 = Integer.parseInt(var0[6]);
         field40331 = new long[field40327];
         field40332 = new long[field40327];
         field40333 = new long[field40327];

         for (int var3 = 0; var3 < field40327; var3++) {
            field40331[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field40327; var4++) {
            field40332[var4] = (long)Integer.parseInt(var0[7 + field40327 + var4]);
         }

         for (int var5 = 0; var5 < field40327; var5++) {
            field40333[var5] = (long)Integer.parseInt(var0[7 + field40327 + field40327 + var5]);
         }
      }

      Class7008.method21727(field40325);
      Class7796.method25897((long)field40328);
      Class7796.method25898((long)field40329);
      System.out.println("nthred = " + field40325);
      System.out.println("threadsBegin2D = " + field40328);
      System.out.println("threadsBegin3D = " + field40329);
      System.out.println("niter = " + field40326);
      System.out.println("doWarmup = " + field40330);
      System.out.println("doScaling = " + field40334);
      System.out.println("nsize = " + field40327);
      System.out.println("sizes1D[] = " + Arrays.toString(field40331));
      System.out.println("sizes2D[] = " + Arrays.toString(field40332));
      System.out.println("sizes3D[] = " + Arrays.toString(field40333));
   }

   public static void method32571() {
      double[] var2 = new double[field40327];
      double[] var3 = new double[field40327];

      for (int var4 = 0; var4 < field40327; var4++) {
         System.out.println("Forward DST 1D of size " + field40331[var4]);
         if (field40330) {
            Class9050 var12 = new Class9050(field40331[var4]);
            double[] var8 = new double[(int)field40331[var4]];
            Class9836.method38845(field40331[var4], var8);
            var12.method33656(var8, field40334);
            Class9836.method38845(field40331[var4], var8);
            var12.method33656(var8, field40334);
         }

         long var5 = System.nanoTime();
         Class9050 var7 = new Class9050(field40331[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)field40331[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field40326; var11++) {
            Class9836.method38845(field40331[var4], var16);
            var5 = System.nanoTime();
            var7.method33656(var16, field40334);
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

      Class9836.method38883("benchmarkDoubleForwardDST_1D.txt", field40325, field40326, field40330, field40334, field40331, var2, var3);
   }

   public static void method32572() {
      double[] var2 = new double[field40327];
      double[] var3 = new double[field40327];

      for (int var4 = 0; var4 < field40327; var4++) {
         System.out.println("Forward DST 2D (input 1D) of size " + field40332[var4] + " x " + field40332[var4]);
         if (field40330) {
            Class9055 var12 = new Class9055(field40332[var4], field40332[var4]);
            Class2381 var8 = new Class2381(field40332[var4] * field40332[var4], false);
            Class9836.method38851(field40332[var4], field40332[var4], var8);
            var12.method33683(var8, field40334);
            Class9836.method38851(field40332[var4], field40332[var4], var8);
            var12.method33683(var8, field40334);
         }

         long var5 = System.nanoTime();
         Class9055 var7 = new Class9055(field40332[var4], field40332[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var16 = new Class2381(field40332[var4] * field40332[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field40326; var11++) {
            Class9836.method38851(field40332[var4], field40332[var4], var16);
            var5 = System.nanoTime();
            var7.method33683(var16, field40334);
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

      Class9836.method38883("benchmarkDoubleForwardDST_2D_input_1D.txt", field40325, field40326, field40330, field40334, field40332, var2, var3);
   }

   public static void method32573() {
      double[] var2 = new double[field40327];
      double[] var3 = new double[field40327];

      for (int var4 = 0; var4 < field40327; var4++) {
         System.out.println("Forward DST 2D (input 2D) of size " + field40332[var4] + " x " + field40332[var4]);
         if (field40330) {
            Class9055 var12 = new Class9055(field40332[var4], field40332[var4]);
            double[][] var8 = new double[(int)field40332[var4]][(int)field40332[var4]];
            Class9836.method38853(field40332[var4], field40332[var4], var8);
            var12.method33684(var8, field40334);
            Class9836.method38853(field40332[var4], field40332[var4], var8);
            var12.method33684(var8, field40334);
         }

         long var5 = System.nanoTime();
         Class9055 var7 = new Class9055(field40332[var4], field40332[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field40332[var4]][(int)field40332[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field40326; var11++) {
            Class9836.method38853(field40332[var4], field40332[var4], var16);
            var5 = System.nanoTime();
            var7.method33684(var16, field40334);
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

      Class9836.method38883("benchmarkDoubleForwardDST_2D_input_2D.txt", field40325, field40326, field40330, field40334, field40332, var2, var3);
   }

   public static void method32574() {
      double[] var2 = new double[field40327];
      double[] var3 = new double[field40327];

      for (int var4 = 0; var4 < field40327; var4++) {
         System.out.println("Forward DST 3D (input 1D) of size " + field40333[var4] + " x " + field40333[var4] + " x " + field40333[var4]);
         if (field40330) {
            Class3612 var12 = new Class3612(field40333[var4], field40333[var4], field40333[var4]);
            Class2381 var8 = new Class2381(field40333[var4] * field40333[var4] * field40333[var4], false);
            Class9836.method38856(field40333[var4], field40333[var4], field40333[var4], var8);
            var12.method12203(var8, field40334);
            Class9836.method38856(field40333[var4], field40333[var4], field40333[var4], var8);
            var12.method12203(var8, field40334);
         }

         long var5 = System.nanoTime();
         Class3612 var7 = new Class3612(field40333[var4], field40333[var4], field40333[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var16 = new Class2381(field40333[var4] * field40333[var4] * field40333[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field40326; var11++) {
            Class9836.method38856(field40333[var4], field40333[var4], field40333[var4], var16);
            var5 = System.nanoTime();
            var7.method12203(var16, field40334);
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

      Class9836.method38883("benchmarkDoubleForwardDST_3D_input_1D.txt", field40325, field40326, field40330, field40334, field40333, var2, var3);
   }

   public static void method32575() {
      double[] var2 = new double[field40327];
      double[] var3 = new double[field40327];

      for (int var4 = 0; var4 < field40327; var4++) {
         System.out.println("Forward DST 3D (input 3D) of size " + field40333[var4] + " x " + field40333[var4] + " x " + field40333[var4]);
         if (field40330) {
            Class3612 var12 = new Class3612(field40333[var4], field40333[var4], field40333[var4]);
            double[][][] var8 = new double[(int)field40333[var4]][(int)field40333[var4]][(int)field40333[var4]];
            Class9836.method38859(field40333[var4], field40333[var4], field40333[var4], var8);
            var12.method12204(var8, field40334);
            Class9836.method38859(field40333[var4], field40333[var4], field40333[var4], var8);
            var12.method12204(var8, field40334);
         }

         long var5 = System.nanoTime();
         Class3612 var7 = new Class3612(field40333[var4], field40333[var4], field40333[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field40333[var4]][(int)field40333[var4]][(int)field40333[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field40326; var11++) {
            Class9836.method38859(field40333[var4], field40333[var4], field40333[var4], var16);
            var5 = System.nanoTime();
            var7.method12204(var16, field40334);
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

      Class9836.method38883("benchmarkDoubleForwardDST_3D_input_3D.txt", field40325, field40326, field40330, field40334, field40333, var2, var3);
   }

   public static void main(String[] var0) {
      method32570(var0);
      method32571();
      method32572();
      method32573();
      method32574();
      method32575();
      System.exit(0);
   }
}
