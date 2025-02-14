package mapped;

import java.util.Arrays;

public class Class9131 {
   private static int field41959 = 8;
   private static int field41960 = 200;
   private static int field41961 = 16;
   private static int field41962 = 65636;
   private static int field41963 = 65636;
   private static boolean field41964 = true;
   private static long[] field41965 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field41966 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field41967 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field41968 = false;

   private Class9131() {
   }

   public static void method34072(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field41959 = Integer.parseInt(var0[0]);
         field41962 = Integer.parseInt(var0[1]);
         field41963 = Integer.parseInt(var0[2]);
         field41960 = Integer.parseInt(var0[3]);
         field41964 = Boolean.parseBoolean(var0[4]);
         field41968 = Boolean.parseBoolean(var0[5]);
         field41961 = Integer.parseInt(var0[6]);
         field41965 = new long[field41961];
         field41966 = new long[field41961];
         field41967 = new long[field41961];

         for (int var3 = 0; var3 < field41961; var3++) {
            field41965[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field41961; var4++) {
            field41966[var4] = (long)Integer.parseInt(var0[7 + field41961 + var4]);
         }

         for (int var5 = 0; var5 < field41961; var5++) {
            field41967[var5] = (long)Integer.parseInt(var0[7 + field41961 + field41961 + var5]);
         }
      }

      Class7008.method21727(field41959);
      Class7796.method25897((long)field41962);
      Class7796.method25898((long)field41963);
      System.out.println("nthred = " + field41959);
      System.out.println("threadsBegin2D = " + field41962);
      System.out.println("threadsBegin3D = " + field41963);
      System.out.println("niter = " + field41960);
      System.out.println("doWarmup = " + field41964);
      System.out.println("doScaling = " + field41968);
      System.out.println("nsize = " + field41961);
      System.out.println("sizes1D[] = " + Arrays.toString(field41965));
      System.out.println("sizes2D[] = " + Arrays.toString(field41966));
      System.out.println("sizes3D[] = " + Arrays.toString(field41967));
   }

   public static void method34073() {
      double[] var2 = new double[field41961];
      double[] var3 = new double[field41961];

      for (int var4 = 0; var4 < field41961; var4++) {
         System.out.println("Forward DST 1D of size " + field41965[var4]);
         if (field41964) {
            Class8276 var12 = new Class8276(field41965[var4]);
            float[] var8 = new float[(int)field41965[var4]];
            Class9836.method38848(field41965[var4], var8);
            var12.method28924(var8, field41968);
            Class9836.method38848(field41965[var4], var8);
            var12.method28924(var8, field41968);
         }

         long var5 = System.nanoTime();
         Class8276 var7 = new Class8276(field41965[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[] var16 = new float[(int)field41965[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41960; var11++) {
            Class9836.method38848(field41965[var4], var16);
            var5 = System.nanoTime();
            var7.method28924(var16, field41968);
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

      Class9836.method38883("benchmarkFloatForwardDST_1D.txt", field41959, field41960, field41964, field41968, field41965, var2, var3);
   }

   public static void method34074() {
      double[] var2 = new double[field41961];
      double[] var3 = new double[field41961];

      for (int var4 = 0; var4 < field41961; var4++) {
         System.out.println("Forward DST 2D (input 1D) of size " + field41966[var4] + " x " + field41966[var4]);
         if (field41964) {
            Class8682 var12 = new Class8682(field41966[var4], field41966[var4]);
            Class2378 var8 = new Class2378(field41966[var4] * field41966[var4], false);
            Class9836.method38850(field41966[var4], field41966[var4], var8);
            var12.method31231(var8, field41968);
            Class9836.method38850(field41966[var4], field41966[var4], var8);
            var12.method31231(var8, field41968);
         }

         long var5 = System.nanoTime();
         Class8682 var7 = new Class8682(field41966[var4], field41966[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var16 = new Class2378(field41966[var4] * field41966[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41960; var11++) {
            Class9836.method38850(field41966[var4], field41966[var4], var16);
            var5 = System.nanoTime();
            var7.method31231(var16, field41968);
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

      Class9836.method38883("benchmarkFloatForwardDST_2D_input_1D.txt", field41959, field41960, field41964, field41968, field41966, var2, var3);
   }

   public static void method34075() {
      double[] var2 = new double[field41961];
      double[] var3 = new double[field41961];

      for (int var4 = 0; var4 < field41961; var4++) {
         System.out.println("Forward DST 2D (input 2D) of size " + field41966[var4] + " x " + field41966[var4]);
         if (field41964) {
            Class8682 var12 = new Class8682(field41966[var4], field41966[var4]);
            float[][] var8 = new float[(int)field41966[var4]][(int)field41966[var4]];
            Class9836.method38854(field41966[var4], field41966[var4], var8);
            var12.method31232(var8, field41968);
            Class9836.method38854(field41966[var4], field41966[var4], var8);
            var12.method31232(var8, field41968);
         }

         long var5 = System.nanoTime();
         Class8682 var7 = new Class8682(field41966[var4], field41966[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][] var16 = new float[(int)field41966[var4]][(int)field41966[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41960; var11++) {
            Class9836.method38854(field41966[var4], field41966[var4], var16);
            var5 = System.nanoTime();
            var7.method31232(var16, field41968);
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

      Class9836.method38883("benchmarkFloatForwardDST_2D_input_2D.txt", field41959, field41960, field41964, field41968, field41966, var2, var3);
   }

   public static void method34076() {
      double[] var2 = new double[field41961];
      double[] var3 = new double[field41961];

      for (int var4 = 0; var4 < field41961; var4++) {
         System.out.println("Forward DST 3D (input 1D) of size " + field41967[var4] + " x " + field41967[var4] + " x " + field41967[var4]);
         if (field41964) {
            Class7941 var12 = new Class7941(field41967[var4], field41967[var4], field41967[var4]);
            Class2378 var8 = new Class2378(field41967[var4] * field41967[var4] * field41967[var4], false);
            Class9836.method38857(field41967[var4], field41967[var4], field41967[var4], var8);
            var12.method26746(var8, field41968);
            Class9836.method38857(field41967[var4], field41967[var4], field41967[var4], var8);
            var12.method26746(var8, field41968);
         }

         long var5 = System.nanoTime();
         Class7941 var7 = new Class7941(field41967[var4], field41967[var4], field41967[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2378 var16 = new Class2378(field41967[var4] * field41967[var4] * field41967[var4], false);
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41960; var11++) {
            Class9836.method38857(field41967[var4], field41967[var4], field41967[var4], var16);
            var5 = System.nanoTime();
            var7.method26746(var16, field41968);
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

      Class9836.method38883("benchmarkFloatForwardDST_3D_input_1D.txt", field41959, field41960, field41964, field41968, field41967, var2, var3);
   }

   public static void method34077() {
      double[] var2 = new double[field41961];
      double[] var3 = new double[field41961];

      for (int var4 = 0; var4 < field41961; var4++) {
         System.out.println("Forward DST 3D (input 3D) of size " + field41967[var4] + " x " + field41967[var4] + " x " + field41967[var4]);
         if (field41964) {
            Class7941 var12 = new Class7941(field41967[var4], field41967[var4], field41967[var4]);
            float[][][] var8 = new float[(int)field41967[var4]][(int)field41967[var4]][(int)field41967[var4]];
            Class9836.method38860(field41967[var4], field41967[var4], field41967[var4], var8);
            var12.method26747(var8, field41968);
            Class9836.method38860(field41967[var4], field41967[var4], field41967[var4], var8);
            var12.method26747(var8, field41968);
         }

         long var5 = System.nanoTime();
         Class7941 var7 = new Class7941(field41967[var4], field41967[var4], field41967[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         float[][][] var16 = new float[(int)field41967[var4]][(int)field41967[var4]][(int)field41967[var4]];
         double var9 = 0.0;

         for (int var11 = 0; var11 < field41960; var11++) {
            Class9836.method38860(field41967[var4], field41967[var4], field41967[var4], var16);
            var5 = System.nanoTime();
            var7.method26747(var16, field41968);
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

      Class9836.method38883("benchmarkFloatForwardDST_3D_input_3D.txt", field41959, field41960, field41964, field41968, field41967, var2, var3);
   }

   public static void main(String[] var0) {
      method34072(var0);
      method34073();
      method34074();
      method34075();
      method34076();
      method34077();
      System.exit(0);
   }
}
