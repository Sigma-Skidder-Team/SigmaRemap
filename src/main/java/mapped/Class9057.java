package mapped;

import java.util.Arrays;

public class Class9057 {
   private static int field41455 = 8;
   private static int field41456 = 200;
   private static int field41457 = 16;
   private static int field41458 = 65636;
   private static int field41459 = 65636;
   private static boolean field41460 = true;
   private static long[] field41461 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field41462 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field41463 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field41464 = false;

   private Class9057() {
   }

   public static void method33704(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field41455 = Integer.parseInt(var0[0]);
         field41458 = Integer.parseInt(var0[1]);
         field41459 = Integer.parseInt(var0[2]);
         field41456 = Integer.parseInt(var0[3]);
         field41460 = Boolean.parseBoolean(var0[4]);
         field41464 = Boolean.parseBoolean(var0[5]);
         field41457 = Integer.parseInt(var0[6]);
         field41461 = new long[field41457];
         field41462 = new long[field41457];
         field41463 = new long[field41457];

         for (int var3 = 0; var3 < field41457; var3++) {
            field41461[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field41457; var4++) {
            field41462[var4] = (long)Integer.parseInt(var0[7 + field41457 + var4]);
         }

         for (int var5 = 0; var5 < field41457; var5++) {
            field41463[var5] = (long)Integer.parseInt(var0[7 + field41457 + field41457 + var5]);
         }
      }

      Class7008.method21727(field41455);
      Class7796.method25897((long)field41458);
      Class7796.method25898((long)field41459);
      System.out.println("nthred = " + field41455);
      System.out.println("threadsBegin2D = " + field41458);
      System.out.println("threadsBegin3D = " + field41459);
      System.out.println("niter = " + field41456);
      System.out.println("doWarmup = " + field41460);
      System.out.println("doScaling = " + field41464);
      System.out.println("nsize = " + field41457);
      System.out.println("sizes1D[] = " + Arrays.toString(field41461));
      System.out.println("sizes2D[] = " + Arrays.toString(field41462));
      System.out.println("sizes3D[] = " + Arrays.toString(field41463));
   }

   public static void method33705() {
      double[] var2 = new double[field41457];
      double[] var3 = new double[field41457];

      for (int var4 = 0; var4 < field41457; var4++) {
         System.out.println("Forward DHT 1D of size " + field41461[var4]);
         if (field41460) {
            Class8174 var12 = new Class8174(field41461[var4]);
            float[] var8 = new float[(int)field41461[var4]];
            Class9836.method38848(field41461[var4], var8);
            var12.method28455(var8);
            Class9836.method38848(field41461[var4], var8);
            var12.method28455(var8);
         }

         long var5 = System.nanoTime();
         Class8174 var7 = new Class8174(field41461[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)field41461[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41456; var11++) {
            Class9836.method38848(field41461[var4], var16);
            var5 = System.nanoTime();
            var7.method28455(var16);
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

      Class9836.method38883("benchmarkFloatForwardDHT_1D.txt", field41455, field41456, field41460, field41464, field41461, var2, var3);
   }

   public static void method33706() {
      double[] var2 = new double[field41457];
      double[] var3 = new double[field41457];

      for (int var4 = 0; var4 < field41457; var4++) {
         System.out.println("Forward DHT 2D (input 1D) of size " + field41462[var4] + " x " + field41462[var4]);
         if (field41460) {
            Class7821 var12 = new Class7821(field41462[var4], field41462[var4]);
            Class2378 var8 = new Class2378(field41462[var4] * field41462[var4], false);
            Class9836.method38850(field41462[var4], field41462[var4], var8);
            var12.method26132(var8);
            Class9836.method38850(field41462[var4], field41462[var4], var8);
            var12.method26132(var8);
         }

         long var5 = System.nanoTime();
         Class7821 var7 = new Class7821(field41462[var4], field41462[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var16 = new Class2378(field41462[var4] * field41462[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41456; var11++) {
            Class9836.method38850(field41462[var4], field41462[var4], var16);
            var5 = System.nanoTime();
            var7.method26132(var16);
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

      Class9836.method38883("benchmarkFloatForwardDHT_2D_input_1D.txt", field41455, field41456, field41460, field41464, field41462, var2, var3);
   }

   public static void method33707() {
      double[] var2 = new double[field41457];
      double[] var3 = new double[field41457];

      for (int var4 = 0; var4 < field41457; var4++) {
         System.out.println("Forward DHT 2D (input 2D) of size " + field41462[var4] + " x " + field41462[var4]);
         if (field41460) {
            Class7821 var12 = new Class7821(field41462[var4], field41462[var4]);
            float[][] var8 = new float[(int)field41462[var4]][(int)field41462[var4]];
            Class9836.method38854(field41462[var4], field41462[var4], var8);
            var12.method26133(var8);
            Class9836.method38854(field41462[var4], field41462[var4], var8);
            var12.method26133(var8);
         }

         long var5 = System.nanoTime();
         Class7821 var7 = new Class7821(field41462[var4], field41462[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field41462[var4]][(int)field41462[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41456; var11++) {
            Class9836.method38854(field41462[var4], field41462[var4], var16);
            var5 = System.nanoTime();
            var7.method26133(var16);
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

      Class9836.method38883("benchmarkFloatForwardDHT_2D_input_2D.txt", field41455, field41456, field41460, field41464, field41462, var2, var3);
   }

   public static void method33708() {
      double[] var2 = new double[field41457];
      double[] var3 = new double[field41457];

      for (int var4 = 0; var4 < field41457; var4++) {
         System.out.println("Forward DHT 3D (input 1D) of size " + field41463[var4] + " x " + field41463[var4] + " x " + field41463[var4]);
         if (field41460) {
            Class8162 var12 = new Class8162(field41463[var4], field41463[var4], field41463[var4]);
            Class2378 var8 = new Class2378(field41463[var4] * field41463[var4] * field41463[var4], false);
            Class9836.method38857(field41463[var4], field41463[var4], field41463[var4], var8);
            var12.method28372(var8);
            Class9836.method38857(field41463[var4], field41463[var4], field41463[var4], var8);
            var12.method28372(var8);
         }

         long var5 = System.nanoTime();
         Class8162 var7 = new Class8162(field41463[var4], field41463[var4], field41463[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var16 = new Class2378(field41463[var4] * field41463[var4] * field41463[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41456; var11++) {
            Class9836.method38857(field41463[var4], field41463[var4], field41463[var4], var16);
            var5 = System.nanoTime();
            var7.method28372(var16);
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

      Class9836.method38883("benchmarkFloatForwardDHT_3D_input_1D.txt", field41455, field41456, field41460, field41464, field41463, var2, var3);
   }

   public static void method33709() {
      double[] var2 = new double[field41457];
      double[] var3 = new double[field41457];

      for (int var4 = 0; var4 < field41457; var4++) {
         System.out.println("Forward DHT 3D (input 3D) of size " + field41463[var4] + " x " + field41463[var4] + " x " + field41463[var4]);
         if (field41460) {
            Class8162 var12 = new Class8162(field41463[var4], field41463[var4], field41463[var4]);
            float[][][] var8 = new float[(int)field41463[var4]][(int)field41463[var4]][(int)field41463[var4]];
            Class9836.method38860(field41463[var4], field41463[var4], field41463[var4], var8);
            var12.method28373(var8);
            Class9836.method38860(field41463[var4], field41463[var4], field41463[var4], var8);
            var12.method28373(var8);
         }

         long var5 = System.nanoTime();
         Class8162 var7 = new Class8162(field41463[var4], field41463[var4], field41463[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field41463[var4]][(int)field41463[var4]][(int)field41463[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41456; var11++) {
            Class9836.method38860(field41463[var4], field41463[var4], field41463[var4], var16);
            var5 = System.nanoTime();
            var7.method28373(var16);
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

      Class9836.method38883("benchmarkFloatForwardDHT_3D_input_3D.txt", field41455, field41456, field41460, field41464, field41463, var2, var3);
   }

   public static void main(String[] var0) {
      method33704(var0);
      method33705();
      method33706();
      method33707();
      method33708();
      method33709();
      System.exit(0);
   }
}
