package mapped;

import java.util.Arrays;

public class Class8626 {
   private static int field38796 = 8;
   private static int field38797 = 200;
   private static int field38798 = 16;
   private static int field38799 = 65636;
   private static int field38800 = 65636;
   private static boolean field38801 = true;
   private static long[] field38802 = new long[]{
      262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 10368L, 27000L, 75600L, 165375L, 362880L, 1562500L, 3211264L, 6250000L
   };
   private static long[] field38803 = new long[]{256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 260L, 520L, 1050L, 1458L, 1960L, 2916L, 4116L, 5832L};
   private static long[] field38804 = new long[]{16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 5L, 17L, 30L, 95L, 180L, 270L, 324L, 420L};
   private static boolean field38805 = false;

   private Class8626() {
   }

   public static void method30918(String[] var0) {
      if (var0.length <= 0) {
         System.out.println("Default settings are used.");
      } else {
         field38796 = Integer.parseInt(var0[0]);
         field38799 = Integer.parseInt(var0[1]);
         field38800 = Integer.parseInt(var0[2]);
         field38797 = Integer.parseInt(var0[3]);
         field38801 = Boolean.parseBoolean(var0[4]);
         field38805 = Boolean.parseBoolean(var0[5]);
         field38798 = Integer.parseInt(var0[6]);
         field38802 = new long[field38798];
         field38803 = new long[field38798];
         field38804 = new long[field38798];

         for (int var3 = 0; var3 < field38798; var3++) {
            field38802[var3] = (long)Integer.parseInt(var0[7 + var3]);
         }

         for (int var4 = 0; var4 < field38798; var4++) {
            field38803[var4] = (long)Integer.parseInt(var0[7 + field38798 + var4]);
         }

         for (int var5 = 0; var5 < field38798; var5++) {
            field38804[var5] = (long)Integer.parseInt(var0[7 + field38798 + field38798 + var5]);
         }
      }

      Class7008.method21727(field38796);
      Class7796.method25897((long)field38799);
      Class7796.method25898((long)field38800);
      System.out.println("nthred = " + field38796);
      System.out.println("threadsBegin2D = " + field38799);
      System.out.println("threadsBegin3D = " + field38800);
      System.out.println("niter = " + field38797);
      System.out.println("doWarmup = " + field38801);
      System.out.println("doScaling = " + field38805);
      System.out.println("nsize = " + field38798);
      System.out.println("sizes1D[] = " + Arrays.toString(field38802));
      System.out.println("sizes2D[] = " + Arrays.toString(field38803));
      System.out.println("sizes3D[] = " + Arrays.toString(field38804));
   }

   public static void method30919() {
      double[] var2 = new double[field38798];
      double[] var3 = new double[field38798];

      for (int var4 = 0; var4 < field38798; var4++) {
         System.out.println("Forward DCT 1D of size " + field38802[var4]);
         if (field38801) {
            Class9788 var12 = new Class9788(field38802[var4]);
            double[] var8 = new double[(int)field38802[var4]];
            Class9836.method38845(field38802[var4], var8);
            var12.method38576(var8, field38805);
            Class9836.method38845(field38802[var4], var8);
            var12.method38576(var8, field38805);
         }

         long var5 = System.nanoTime();
         Class9788 var7 = new Class9788(field38802[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[] var16 = new double[(int)field38802[var4]];
         if (field38801) {
            Class9836.method38845(field38802[var4], var16);
            var7.method38576(var16, field38805);
            Class9836.method38845(field38802[var4], var16);
            var7.method38576(var16, field38805);
         }

         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field38797; var11++) {
            Class9836.method38845(field38802[var4], var16);
            var5 = System.nanoTime();
            var7.method38576(var16, field38805);
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

      Class9836.method38883("benchmarkDoubleForwardDCT_1D.txt", field38796, field38797, field38801, field38805, field38802, var2, var3);
   }

   public static void method30920() {
      double[] var2 = new double[field38798];
      double[] var3 = new double[field38798];

      for (int var4 = 0; var4 < field38798; var4++) {
         System.out.println("Forward DCT 2D (input 1D) of size " + field38803[var4] + " x " + field38803[var4]);
         if (field38801) {
            Class9330 var12 = new Class9330(field38803[var4], field38803[var4]);
            Class2381 var8 = new Class2381(field38803[var4] * field38803[var4], false);
            Class9836.method38851(field38803[var4], field38803[var4], var8);
            var12.method35263(var8, field38805);
            Class9836.method38851(field38803[var4], field38803[var4], var8);
            var12.method35263(var8, field38805);
         }

         long var5 = System.nanoTime();
         Class9330 var7 = new Class9330(field38803[var4], field38803[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var16 = new Class2381(field38803[var4] * field38803[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field38797; var11++) {
            Class9836.method38851(field38803[var4], field38803[var4], var16);
            var5 = System.nanoTime();
            var7.method35263(var16, field38805);
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

      Class9836.method38883("benchmarkDoubleForwardDCT_2D_input_1D.txt", field38796, field38797, field38801, field38805, field38803, var2, var3);
   }

   public static void method30921() {
      double[] var2 = new double[field38798];
      double[] var3 = new double[field38798];

      for (int var4 = 0; var4 < field38798; var4++) {
         System.out.println("Forward DCT 2D (input 2D) of size " + field38803[var4] + " x " + field38803[var4]);
         if (field38801) {
            Class9330 var12 = new Class9330(field38803[var4], field38803[var4]);
            double[][] var8 = new double[(int)field38803[var4]][(int)field38803[var4]];
            Class9836.method38853(field38803[var4], field38803[var4], var8);
            var12.method35264(var8, field38805);
            Class9836.method38853(field38803[var4], field38803[var4], var8);
            var12.method35264(var8, field38805);
         }

         long var5 = System.nanoTime();
         Class9330 var7 = new Class9330(field38803[var4], field38803[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][] var16 = new double[(int)field38803[var4]][(int)field38803[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field38797; var11++) {
            Class9836.method38853(field38803[var4], field38803[var4], var16);
            var5 = System.nanoTime();
            var7.method35264(var16, field38805);
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

      Class9836.method38883("benchmarkDoubleForwardDCT_2D_input_2D.txt", field38796, field38797, field38801, field38805, field38803, var2, var3);
   }

   public static void method30922() {
      double[] var2 = new double[field38798];
      double[] var3 = new double[field38798];

      for (int var4 = 0; var4 < field38798; var4++) {
         System.out.println("Forward DCT 3D (input 1D) of size " + field38804[var4] + " x " + field38804[var4] + " x " + field38804[var4]);
         if (field38801) {
            Class6352 var12 = new Class6352(field38804[var4], field38804[var4], field38804[var4]);
            Class2381 var8 = new Class2381(field38804[var4] * field38804[var4] * field38804[var4], false);
            Class9836.method38856(field38804[var4], field38804[var4], field38804[var4], var8);
            var12.method19310(var8, field38805);
            Class9836.method38856(field38804[var4], field38804[var4], field38804[var4], var8);
            var12.method19310(var8, field38805);
         }

         long var5 = System.nanoTime();
         Class6352 var7 = new Class6352(field38804[var4], field38804[var4], field38804[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         Class2381 var16 = new Class2381(field38804[var4] * field38804[var4] * field38804[var4], false);
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field38797; var11++) {
            Class9836.method38856(field38804[var4], field38804[var4], field38804[var4], var16);
            var5 = System.nanoTime();
            var7.method19310(var16, field38805);
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

      Class9836.method38883("benchmarkDoubleForwardDCT_3D_input_1D.txt", field38796, field38797, field38801, field38805, field38804, var2, var3);
   }

   public static void method30923() {
      double[] var2 = new double[field38798];
      double[] var3 = new double[field38798];

      for (int var4 = 0; var4 < field38798; var4++) {
         System.out.println("Forward DCT 3D (input 3D) of size " + field38804[var4] + " x " + field38804[var4] + " x " + field38804[var4]);
         if (field38801) {
            Class6352 var12 = new Class6352(field38804[var4], field38804[var4], field38804[var4]);
            double[][][] var8 = new double[(int)field38804[var4]][(int)field38804[var4]][(int)field38804[var4]];
            Class9836.method38859(field38804[var4], field38804[var4], field38804[var4], var8);
            var12.method19311(var8, field38805);
            Class9836.method38859(field38804[var4], field38804[var4], field38804[var4], var8);
            var12.method19311(var8, field38805);
         }

         long var5 = System.nanoTime();
         Class6352 var7 = new Class6352(field38804[var4], field38804[var4], field38804[var4]);
         var3[var4] = (double)(System.nanoTime() - var5) / 1000000.0;
         double[][][] var16 = new double[(int)field38804[var4]][(int)field38804[var4]][(int)field38804[var4]];
         double var9 = Double.MAX_VALUE;

         for (int var11 = 0; var11 < field38797; var11++) {
            Class9836.method38859(field38804[var4], field38804[var4], field38804[var4], var16);
            var5 = System.nanoTime();
            var7.method19311(var16, field38805);
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

      Class9836.method38883("benchmarkDoubleForwardDCT_3D_input_3D.txt", field38796, field38797, field38801, field38805, field38804, var2, var3);
   }

   public static void main(String[] var0) {
      method30918(var0);
      method30919();
      method30920();
      method30921();
      method30922();
      method30923();
      System.exit(0);
   }
}
