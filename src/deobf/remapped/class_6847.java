package remapped;

import java.util.Arrays;

public class class_6847 {
   private static int field_35298 = 8;
   private static int field_35297 = 200;
   private static int field_35306 = 16;
   private static int field_35304 = 65636;
   private static int field_35303 = 65636;
   private static boolean field_35299 = true;
   private static long[] field_35301 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field_35305 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field_35307 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field_35302 = false;

   private class_6847() {
   }

   public static void method_31414(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field_35298 = Integer.parseInt(var0[0]);
         field_35304 = Integer.parseInt(var0[1]);
         field_35303 = Integer.parseInt(var0[2]);
         field_35297 = Integer.parseInt(var0[3]);
         field_35299 = Boolean.parseBoolean(var0[4]);
         field_35302 = Boolean.parseBoolean(var0[5]);
         field_35306 = Integer.parseInt(var0[6]);
         field_35301 = new long[field_35306];
         field_35305 = new long[field_35306];
         field_35307 = new long[field_35306];

         for (int var3 = 0; var3 < field_35306; var3++) {
            field_35301[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field_35306; var4++) {
            field_35305[var4] = (long)Integer.parseInt(var0[7 + field_35306 + var4]);
         }

         for (int var5 = 0; var5 < field_35306; var5++) {
            field_35307[var5] = (long)Integer.parseInt(var0[7 + field_35306 + field_35306 + var5]);
         }
      }

      class_1266.method_5697(field_35298);
      class_2751.method_12397((long)field_35304);
      class_2751.method_12498((long)field_35303);
      System.out.println("nthred = " + field_35298);
      System.out.println("threadsBegin2D = " + field_35304);
      System.out.println("threadsBegin3D = " + field_35303);
      System.out.println("niter = " + field_35297);
      System.out.println("doWarmup = " + field_35299);
      System.out.println("doScaling = " + field_35302);
      System.out.println("nsize = " + field_35306);
      System.out.println("sizes1D[] = " + Arrays.toString(field_35301));
      System.out.println("sizes2D[] = " + Arrays.toString(field_35305));
      System.out.println("sizes3D[] = " + Arrays.toString(field_35307));
   }

   public static void method_31419() {
      double[] var2 = new double[field_35306];
      double[] var3 = new double[field_35306];

      for (int var4 = 0; var4 < field_35306; var4++) {
         System.out.println("Forward DHT 1D of size " + field_35301[var4]);
         if (field_35299) {
            class_3817 var12 = new class_3817(field_35301[var4]);
            float[] var8 = new float[(int)field_35301[var4]];
            class_9858.method_45422(field_35301[var4], var8);
            var12.method_17785(var8);
            class_9858.method_45422(field_35301[var4], var8);
            var12.method_17785(var8);
         }

         long var5 = System.nanoTime();
         class_3817 var7 = new class_3817(field_35301[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)field_35301[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_35297; var11++) {
            class_9858.method_45422(field_35301[var4], var16);
            var5 = System.nanoTime();
            var7.method_17785(var16);
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

      class_9858.method_45454("benchmarkFloatForwardDHT_1D.txt", field_35298, field_35297, field_35299, field_35302, field_35301, var2, var3);
   }

   public static void method_31418() {
      double[] var2 = new double[field_35306];
      double[] var3 = new double[field_35306];

      for (int var4 = 0; var4 < field_35306; var4++) {
         System.out.println("Forward DHT 2D (input 1D) of size " + field_35305[var4] + " x " + field_35305[var4]);
         if (field_35299) {
            class_2817 var12 = new class_2817(field_35305[var4], field_35305[var4]);
            class_4330 var8 = new class_4330(field_35305[var4] * field_35305[var4], false);
            class_9858.method_45425(field_35305[var4], field_35305[var4], var8);
            var12.method_12825(var8);
            class_9858.method_45425(field_35305[var4], field_35305[var4], var8);
            var12.method_12825(var8);
         }

         long var5 = System.nanoTime();
         class_2817 var7 = new class_2817(field_35305[var4], field_35305[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var16 = new class_4330(field_35305[var4] * field_35305[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_35297; var11++) {
            class_9858.method_45425(field_35305[var4], field_35305[var4], var16);
            var5 = System.nanoTime();
            var7.method_12825(var16);
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

      class_9858.method_45454("benchmarkFloatForwardDHT_2D_input_1D.txt", field_35298, field_35297, field_35299, field_35302, field_35305, var2, var3);
   }

   public static void method_31420() {
      double[] var2 = new double[field_35306];
      double[] var3 = new double[field_35306];

      for (int var4 = 0; var4 < field_35306; var4++) {
         System.out.println("Forward DHT 2D (input 2D) of size " + field_35305[var4] + " x " + field_35305[var4]);
         if (field_35299) {
            class_2817 var12 = new class_2817(field_35305[var4], field_35305[var4]);
            float[][] var8 = new float[(int)field_35305[var4]][(int)field_35305[var4]];
            class_9858.method_45429(field_35305[var4], field_35305[var4], var8);
            var12.method_12827(var8);
            class_9858.method_45429(field_35305[var4], field_35305[var4], var8);
            var12.method_12827(var8);
         }

         long var5 = System.nanoTime();
         class_2817 var7 = new class_2817(field_35305[var4], field_35305[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field_35305[var4]][(int)field_35305[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_35297; var11++) {
            class_9858.method_45429(field_35305[var4], field_35305[var4], var16);
            var5 = System.nanoTime();
            var7.method_12827(var16);
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

      class_9858.method_45454("benchmarkFloatForwardDHT_2D_input_2D.txt", field_35298, field_35297, field_35299, field_35302, field_35305, var2, var3);
   }

   public static void method_31415() {
      double[] var2 = new double[field_35306];
      double[] var3 = new double[field_35306];

      for (int var4 = 0; var4 < field_35306; var4++) {
         System.out.println("Forward DHT 3D (input 1D) of size " + field_35307[var4] + " x " + field_35307[var4] + " x " + field_35307[var4]);
         if (field_35299) {
            class_3803 var12 = new class_3803(field_35307[var4], field_35307[var4], field_35307[var4]);
            class_4330 var8 = new class_4330(field_35307[var4] * field_35307[var4] * field_35307[var4], false);
            class_9858.method_45462(field_35307[var4], field_35307[var4], field_35307[var4], var8);
            var12.method_17693(var8);
            class_9858.method_45462(field_35307[var4], field_35307[var4], field_35307[var4], var8);
            var12.method_17693(var8);
         }

         long var5 = System.nanoTime();
         class_3803 var7 = new class_3803(field_35307[var4], field_35307[var4], field_35307[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         class_4330 var16 = new class_4330(field_35307[var4] * field_35307[var4] * field_35307[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_35297; var11++) {
            class_9858.method_45462(field_35307[var4], field_35307[var4], field_35307[var4], var16);
            var5 = System.nanoTime();
            var7.method_17693(var16);
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

      class_9858.method_45454("benchmarkFloatForwardDHT_3D_input_1D.txt", field_35298, field_35297, field_35299, field_35302, field_35307, var2, var3);
   }

   public static void method_31417() {
      double[] var2 = new double[field_35306];
      double[] var3 = new double[field_35306];

      for (int var4 = 0; var4 < field_35306; var4++) {
         System.out.println("Forward DHT 3D (input 3D) of size " + field_35307[var4] + " x " + field_35307[var4] + " x " + field_35307[var4]);
         if (field_35299) {
            class_3803 var12 = new class_3803(field_35307[var4], field_35307[var4], field_35307[var4]);
            float[][][] var8 = new float[(int)field_35307[var4]][(int)field_35307[var4]][(int)field_35307[var4]];
            class_9858.method_45466(field_35307[var4], field_35307[var4], field_35307[var4], var8);
            var12.method_17695(var8);
            class_9858.method_45466(field_35307[var4], field_35307[var4], field_35307[var4], var8);
            var12.method_17695(var8);
         }

         long var5 = System.nanoTime();
         class_3803 var7 = new class_3803(field_35307[var4], field_35307[var4], field_35307[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field_35307[var4]][(int)field_35307[var4]][(int)field_35307[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field_35297; var11++) {
            class_9858.method_45466(field_35307[var4], field_35307[var4], field_35307[var4], var16);
            var5 = System.nanoTime();
            var7.method_17695(var16);
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

      class_9858.method_45454("benchmarkFloatForwardDHT_3D_input_3D.txt", field_35298, field_35297, field_35299, field_35302, field_35307, var2, var3);
   }

   public static void main(String[] var0) {
      method_31414(var0);
      method_31419();
      method_31418();
      method_31420();
      method_31415();
      method_31417();
      System.exit(0);
   }
}
