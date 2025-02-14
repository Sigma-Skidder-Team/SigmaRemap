package mapped;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class Class9836 {
   private static final String field45936 = "%.4f";

   private Class9836() {
   }

   public static double method38835(float var0, float var1) {
      double var4 = (double)(var0 - var1);
      double var6 = var4 * var4;
      return Class9044.method33546(var6);
   }

   public static double method38836(float[] var0, float[] var1) {
      if (var0.length != var1.length) {
         throw new IllegalArgumentException("Arrays are not the same size");
      } else {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            double var7 = (double)(var0[var6] - var1[var6]);
            var4 += var7 * var7;
         }

         return Class9044.method33546(var4 / (double)var0.length);
      }
   }

   public static double method38837(Class2378 var0, Class2378 var1) {
      if (var0.method9634() != var1.method9634()) {
         throw new IllegalArgumentException("Arrays are not the same size.");
      } else {
         double var4 = 0.0;

         for (long var6 = 0L; var6 < var0.method9634(); var6++) {
            double var8 = (double)(var0.method9651(var6) - var1.method9651(var6));
            var4 += var8 * var8;
         }

         return Class9044.method33546(var4 / (double)var0.method9634());
      }
   }

   public static double method38838(float[][] var0, float[][] var1) {
      if (var0.length == var1.length && var0[0].length == var1[0].length) {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            for (int var7 = 0; var7 < var0[0].length; var7++) {
               double var8 = (double)(var0[var6][var7] - var1[var6][var7]);
               var4 += var8 * var8;
            }
         }

         return Class9044.method33546(var4 / (double)(var0.length * var0[0].length));
      } else {
         throw new IllegalArgumentException("Arrays are not the same size");
      }
   }

   public static double method38839(float[][][] var0, float[][][] var1) {
      if (var0.length == var1.length && var0[0].length == var1[0].length && var0[0][0].length == var1[0][0].length) {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            for (int var7 = 0; var7 < var0[0].length; var7++) {
               for (int var8 = 0; var8 < var0[0][0].length; var8++) {
                  double var9 = (double)(var0[var6][var7][var8] - var1[var6][var7][var8]);
                  var4 += var9 * var9;
               }
            }
         }

         return Class9044.method33546(var4 / (double)(var0.length * var0[0].length * var0[0][0].length));
      } else {
         throw new IllegalArgumentException("Arrays are not the same size");
      }
   }

   public static double method38840(double var0, double var2) {
      double var6 = var0 - var2;
      double var8 = var6 * var6;
      return Class9044.method33546(var8);
   }

   public static double method38841(double[] var0, double[] var1) {
      if (var0.length != var1.length) {
         throw new IllegalArgumentException("Arrays are not the same size");
      } else {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            double var7 = var0[var6] - var1[var6];
            var4 += var7 * var7;
         }

         return Class9044.method33546(var4 / (double)var0.length);
      }
   }

   public static double method38842(Class2381 var0, Class2381 var1) {
      if (var0.method9634() != var1.method9634()) {
         throw new IllegalArgumentException("Arrays are not the same size.");
      } else {
         double var4 = 0.0;

         for (long var6 = 0L; var6 < var0.method9634(); var6++) {
            double var8 = var0.method9653(var6) - var1.method9653(var6);
            var4 += var8 * var8;
         }

         return Class9044.method33546(var4 / (double)var0.method9634());
      }
   }

   public static double method38843(double[][] var0, double[][] var1) {
      if (var0.length == var1.length && var0[0].length == var1[0].length) {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            for (int var7 = 0; var7 < var0[0].length; var7++) {
               double var8 = var0[var6][var7] - var1[var6][var7];
               var4 += var8 * var8;
            }
         }

         return Class9044.method33546(var4 / (double)(var0.length * var0[0].length));
      } else {
         throw new IllegalArgumentException("Arrays are not the same size");
      }
   }

   public static double method38844(double[][][] var0, double[][][] var1) {
      if (var0.length == var1.length && var0[0].length == var1[0].length && var0[0][0].length == var1[0][0].length) {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            for (int var7 = 0; var7 < var0[0].length; var7++) {
               for (int var8 = 0; var8 < var0[0][0].length; var8++) {
                  double var9 = var0[var6][var7][var8] - var1[var6][var7][var8];
                  var4 += var9 * var9;
               }
            }
         }

         return Class9044.method33546(var4 / (double)(var0.length * var0[0].length * var0[0][0].length));
      } else {
         throw new IllegalArgumentException("Arrays are not the same size");
      }
   }

   public static void method38845(long var0, double[] var2) {
      Random var5 = new Random(2L);

      for (int var6 = 0; (long)var6 < var0; var6++) {
         var2[var6] = var5.nextDouble();
      }
   }

   public static void method38846(long var0, Class2381 var2) {
      Random var5 = new Random(2L);

      for (long var6 = 0L; var6 < var0; var6++) {
         var2.method9687(var6, var5.nextDouble());
      }
   }

   public static void method38847(long var0, Class2378 var2) {
      Random var5 = new Random(2L);

      for (long var6 = 0L; var6 < var0; var6++) {
         var2.method9687(var6, (double)var5.nextFloat());
      }
   }

   public static void method38848(long var0, float[] var2) {
      Random var5 = new Random(2L);

      for (int var6 = 0; (long)var6 < var0; var6++) {
         var2[var6] = var5.nextFloat();
      }
   }

   public static void method38849(long var0, long var2, double[] var4) {
      Random var7 = new Random(2L);

      for (int var8 = 0; (long)var8 < var0; var8++) {
         for (int var9 = 0; (long)var9 < var2; var9++) {
            var4[(int)((long)var8 * var2 + (long)var9)] = var7.nextDouble();
         }
      }
   }

   public static void method38850(long var0, long var2, Class2378 var4) {
      Random var7 = new Random(2L);

      for (long var8 = 0L; var8 < var0; var8++) {
         for (long var10 = 0L; var10 < var2; var10++) {
            var4.method9685(var8 * var2 + var10, var7.nextFloat());
         }
      }
   }

   public static void method38851(long var0, long var2, Class2381 var4) {
      Random var7 = new Random(2L);

      for (long var8 = 0L; var8 < var0; var8++) {
         for (long var10 = 0L; var10 < var2; var10++) {
            var4.method9687(var8 * var2 + var10, var7.nextDouble());
         }
      }
   }

   public static void method38852(long var0, long var2, float[] var4) {
      Random var7 = new Random(2L);

      for (int var8 = 0; (long)var8 < var0; var8++) {
         for (int var9 = 0; (long)var9 < var2; var9++) {
            var4[(int)((long)var8 * var2 + (long)var9)] = var7.nextFloat();
         }
      }
   }

   public static void method38853(long var0, long var2, double[][] var4) {
      Random var7 = new Random(2L);

      for (int var8 = 0; (long)var8 < var0; var8++) {
         for (int var9 = 0; (long)var9 < var2; var9++) {
            var4[var8][var9] = var7.nextDouble();
         }
      }
   }

   public static void method38854(long var0, long var2, float[][] var4) {
      Random var7 = new Random(2L);

      for (int var8 = 0; (long)var8 < var0; var8++) {
         for (int var9 = 0; (long)var9 < var2; var9++) {
            var4[var8][var9] = var7.nextFloat();
         }
      }
   }

   public static void method38855(long var0, long var2, long var4, double[] var6) {
      Random var9 = new Random(2L);
      long var10 = var2 * var4;
      long var12 = var4;

      for (int var14 = 0; (long)var14 < var0; var14++) {
         for (int var15 = 0; (long)var15 < var2; var15++) {
            for (int var16 = 0; (long)var16 < var4; var16++) {
               var6[(int)((long)var14 * var10 + (long)var15 * var12 + (long)var16)] = var9.nextDouble();
            }
         }
      }
   }

   public static void method38856(long var0, long var2, long var4, Class2381 var6) {
      Random var9 = new Random(2L);
      long var10 = var2 * var4;
      long var12 = var4;

      for (long var14 = 0L; var14 < var0; var14++) {
         for (long var16 = 0L; var16 < var2; var16++) {
            for (long var18 = 0L; var18 < var4; var18++) {
               var6.method9687(var14 * var10 + var16 * var12 + var18, var9.nextDouble());
            }
         }
      }
   }

   public static void method38857(long var0, long var2, long var4, Class2378 var6) {
      Random var9 = new Random(2L);
      long var10 = var2 * var4;
      long var12 = var4;

      for (long var14 = 0L; var14 < var0; var14++) {
         for (long var16 = 0L; var16 < var2; var16++) {
            for (long var18 = 0L; var18 < var4; var18++) {
               var6.method9687(var14 * var10 + var16 * var12 + var18, (double)var9.nextFloat());
            }
         }
      }
   }

   public static void method38858(long var0, long var2, long var4, float[] var6) {
      Random var9 = new Random(2L);
      long var10 = var2 * var4;
      long var12 = var4;

      for (int var14 = 0; (long)var14 < var0; var14++) {
         for (int var15 = 0; (long)var15 < var2; var15++) {
            for (int var16 = 0; (long)var16 < var4; var16++) {
               var6[(int)((long)var14 * var10 + (long)var15 * var12 + (long)var16)] = var9.nextFloat();
            }
         }
      }
   }

   public static void method38859(long var0, long var2, long var4, double[][][] var6) {
      Random var9 = new Random(2L);

      for (int var10 = 0; (long)var10 < var0; var10++) {
         for (int var11 = 0; (long)var11 < var2; var11++) {
            for (int var12 = 0; (long)var12 < var4; var12++) {
               var6[var10][var11][var12] = var9.nextDouble();
            }
         }
      }
   }

   public static void method38860(long var0, long var2, long var4, float[][][] var6) {
      Random var9 = new Random(2L);

      for (int var10 = 0; (long)var10 < var0; var10++) {
         for (int var11 = 0; (long)var11 < var2; var11++) {
            for (int var12 = 0; (long)var12 < var4; var12++) {
               var6[var10][var11][var12] = var9.nextFloat();
            }
         }
      }
   }

   public static void method38861(double[] var0, String var1) {
      System.out.println(var1);
      System.out.println("-------------------");

      for (int var4 = 0; var4 < var0.length; var4 += 2) {
         if (var0[var4 + 1] != 0.0) {
            if (var0[var4] != 0.0) {
               if (!(var0[var4 + 1] < 0.0)) {
                  System.out.println(String.format("%.4f", var0[var4]) + " + " + String.format("%.4f", var0[var4 + 1]) + "i");
               } else {
                  System.out.println(String.format("%.4f", var0[var4]) + " - " + String.format("%.4f", -var0[var4 + 1]) + "i");
               }
            } else {
               System.out.println(String.format("%.4f", var0[var4 + 1]) + "i");
            }
         } else {
            System.out.println(String.format("%.4f", var0[var4]));
         }
      }

      System.out.println();
   }

   public static void method38862(int var0, int var1, double[] var2, String var3) {
      StringBuilder var6 = new StringBuilder(String.format(var3 + ": complex array 2D: %d rows, %d columns\n\n", var0, var1));

      for (int var7 = 0; var7 < var0; var7++) {
         for (int var8 = 0; var8 < 2 * var1; var8 += 2) {
            if (var2[var7 * 2 * var1 + var8 + 1] != 0.0) {
               if (var2[var7 * 2 * var1 + var8] != 0.0) {
                  if (!(var2[var7 * 2 * var1 + var8 + 1] < 0.0)) {
                     var6.append(String.format("%.4f + %.4fi\t", var2[var7 * 2 * var1 + var8], var2[var7 * 2 * var1 + var8 + 1]));
                  } else {
                     var6.append(String.format("%.4f - %.4fi\t", var2[var7 * 2 * var1 + var8], -var2[var7 * 2 * var1 + var8 + 1]));
                  }
               } else {
                  var6.append(String.format("%.4fi\t", var2[var7 * 2 * var1 + var8 + 1]));
               }
            } else {
               var6.append(String.format("%.4f\t", var2[var7 * 2 * var1 + var8]));
            }
         }

         var6.append("\n");
      }

      System.out.println(var6.toString());
   }

   public static void method38863(double[][] var0, String var1) {
      int var4 = var0.length;
      int var5 = var0[0].length;
      StringBuilder var6 = new StringBuilder(String.format(var1 + ": complex array 2D: %d rows, %d columns\n\n", var4, var5));

      for (int var7 = 0; var7 < var4; var7++) {
         for (int var8 = 0; var8 < var5; var8 += 2) {
            if (var0[var7][var8 + 1] != 0.0) {
               if (var0[var7][var8] != 0.0) {
                  if (!(var0[var7][var8 + 1] < 0.0)) {
                     var6.append(String.format("%.4f + %.4fi\t", var0[var7][var8], var0[var7][var8 + 1]));
                  } else {
                     var6.append(String.format("%.4f - %.4fi\t", var0[var7][var8], -var0[var7][var8 + 1]));
                  }
               } else {
                  var6.append(String.format("%.4fi\t", var0[var7][var8 + 1]));
               }
            } else {
               var6.append(String.format("%.4f\t", var0[var7][var8]));
            }
         }

         var6.append("\n");
      }

      System.out.println(var6.toString());
   }

   public static void method38864(int var0, int var1, int var2, double[] var3, String var4) {
      int var7 = var1 * 2 * var2;
      int var8 = 2 * var2;
      System.out.println(var4);
      System.out.println("-------------------");

      for (int var9 = 0; var9 < 2 * var2; var9 += 2) {
         System.out.println("(:,:," + var9 / 2 + ")=\n");

         for (int var10 = 0; var10 < var0; var10++) {
            for (int var11 = 0; var11 < var1; var11++) {
               if (var3[var10 * var7 + var11 * var8 + var9 + 1] != 0.0) {
                  if (var3[var10 * var7 + var11 * var8 + var9] != 0.0) {
                     if (!(var3[var10 * var7 + var11 * var8 + var9 + 1] < 0.0)) {
                        System.out
                           .print(
                              String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9])
                                 + " + "
                                 + String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9 + 1])
                                 + "i\t"
                           );
                     } else {
                        System.out
                           .print(
                              String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9])
                                 + " - "
                                 + String.format("%.4f", -var3[var10 * var7 + var11 * var8 + var9 + 1])
                                 + "i\t"
                           );
                     }
                  } else {
                     System.out.print(String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9 + 1]) + "i\t");
                  }
               } else {
                  System.out.print(String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9]) + "\t");
               }
            }

            System.out.println("");
         }
      }

      System.out.println("");
   }

   public static void method38865(double[][][] var0, String var1) {
      System.out.println(var1);
      System.out.println("-------------------");
      int var4 = var0.length;
      int var5 = var0[0].length;
      int var6 = var0[0][0].length;

      for (int var7 = 0; var7 < var6; var7 += 2) {
         System.out.println("(:,:," + var7 / 2 + ")=\n");

         for (int var8 = 0; var8 < var4; var8++) {
            for (int var9 = 0; var9 < var5; var9++) {
               if (var0[var8][var9][var7 + 1] != 0.0) {
                  if (var0[var8][var9][var7] != 0.0) {
                     if (!(var0[var8][var9][var7 + 1] < 0.0)) {
                        System.out.print(String.format("%.4f", var0[var8][var9][var7]) + " + " + String.format("%.4f", var0[var8][var9][var7 + 1]) + "i\t");
                     } else {
                        System.out.print(String.format("%.4f", var0[var8][var9][var7]) + " - " + String.format("%.4f", -var0[var8][var9][var7 + 1]) + "i\t");
                     }
                  } else {
                     System.out.print(String.format("%.4f", var0[var8][var9][var7 + 1]) + "i\t");
                  }
               } else {
                  System.out.print(String.format("%.4f", var0[var8][var9][var7]) + "\t");
               }
            }

            System.out.println("");
         }
      }

      System.out.println("");
   }

   public static void method38866(int var0, int var1, int var2, float[] var3, String var4) {
      int var7 = var1 * 2 * var2;
      int var8 = 2 * var2;
      System.out.println(var4);
      System.out.println("-------------------");

      for (int var9 = 0; var9 < 2 * var2; var9 += 2) {
         System.out.println("(:,:," + var9 / 2 + ")=\n");

         for (int var10 = 0; var10 < var0; var10++) {
            for (int var11 = 0; var11 < var1; var11++) {
               if (var3[var10 * var7 + var11 * var8 + var9 + 1] != 0.0F) {
                  if (var3[var10 * var7 + var11 * var8 + var9] != 0.0F) {
                     if (!(var3[var10 * var7 + var11 * var8 + var9 + 1] < 0.0F)) {
                        System.out
                           .print(
                              String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9])
                                 + " + "
                                 + String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9 + 1])
                                 + "i\t"
                           );
                     } else {
                        System.out
                           .print(
                              String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9])
                                 + " - "
                                 + String.format("%.4f", -var3[var10 * var7 + var11 * var8 + var9 + 1])
                                 + "i\t"
                           );
                     }
                  } else {
                     System.out.print(String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9 + 1]) + "i\t");
                  }
               } else {
                  System.out.print(String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9]) + "\t");
               }
            }

            System.out.println("");
         }
      }

      System.out.println("");
   }

   public static void method38867(double[] var0, String var1) {
      System.out.println(var1);
      System.out.println("-------------------");

      for (int var4 = 0; var4 < var0.length; var4++) {
         System.out.println(String.format("%.4f", var0[var4]));
      }

      System.out.println();
   }

   public static void method38868(int var0, int var1, double[] var2, String var3) {
      System.out.println(var3);
      System.out.println("-------------------");

      for (int var6 = 0; var6 < var0; var6++) {
         for (int var7 = 0; var7 < var1; var7++) {
            if (!(Class9044.method33591(var2[var6 * var1 + var7]) < 5.0E-5)) {
               System.out.print(String.format("%.4f", var2[var6 * var1 + var7]) + "\t");
            } else {
               System.out.print("0\t");
            }
         }

         System.out.println();
      }

      System.out.println();
   }

   public static void method38869(int var0, int var1, int var2, double[] var3, String var4) {
      int var7 = var1 * var2;
      int var8 = var2;
      System.out.println(var4);
      System.out.println("-------------------");

      for (int var9 = 0; var9 < var2; var9++) {
         System.out.println();
         System.out.println("(:,:," + var9 + ")=\n");

         for (int var10 = 0; var10 < var0; var10++) {
            for (int var11 = 0; var11 < var1; var11++) {
               if (!(Class9044.method33591(var3[var10 * var7 + var11 * var8 + var9]) <= 5.0E-5)) {
                  System.out.print(String.format("%.4f", var3[var10 * var7 + var11 * var8 + var9]) + "\t");
               } else {
                  System.out.print("0\t");
               }
            }

            System.out.println();
         }
      }

      System.out.println();
   }

   public static void method38870(double[][][] var0, String var1) {
      System.out.println(var1);
      System.out.println("-------------------");
      int var4 = var0.length;
      int var5 = var0[0].length;
      int var6 = var0[0][0].length;

      for (int var7 = 0; var7 < var6; var7++) {
         System.out.println();
         System.out.println("(:,:," + var7 + ")=\n");

         for (int var8 = 0; var8 < var4; var8++) {
            for (int var9 = 0; var9 < var5; var9++) {
               if (!(Class9044.method33591(var0[var8][var9][var7]) <= 5.0E-5)) {
                  System.out.print(String.format("%.4f", var0[var8][var9][var7]) + "\t");
               } else {
                  System.out.print("0\t");
               }
            }

            System.out.println();
         }
      }

      System.out.println();
   }

   public static void method38871(double[] var0, String var1) {
      try {
         BufferedWriter var4 = new BufferedWriter(new FileWriter(var1));

         for (int var5 = 0; var5 < var0.length; var5 += 2) {
            if (var0[var5 + 1] == 0.0) {
               var4.write(String.format("%.4f", var0[var5]));
               var4.newLine();
            } else if (var0[var5] == 0.0) {
               var4.write(String.format("%.4f", var0[var5 + 1]) + "i");
               var4.newLine();
            } else if (var0[var5 + 1] < 0.0) {
               var4.write(String.format("%.4f", var0[var5]) + " - " + String.format("%.4f", -var0[var5 + 1]) + "i");
               var4.newLine();
            } else {
               var4.write(String.format("%.4f", var0[var5]) + " + " + String.format("%.4f", var0[var5 + 1]) + "i");
               var4.newLine();
            }
         }

         var4.newLine();
         var4.close();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public static void method38872(float[] var0, String var1) {
      try {
         BufferedWriter var4 = new BufferedWriter(new FileWriter(var1));

         for (int var5 = 0; var5 < var0.length; var5 += 2) {
            if (var0[var5 + 1] == 0.0F) {
               var4.write(String.format("%.4f", var0[var5]));
               var4.newLine();
            } else if (var0[var5] == 0.0F) {
               var4.write(String.format("%.4f", var0[var5 + 1]) + "i");
               var4.newLine();
            } else if (var0[var5 + 1] < 0.0F) {
               var4.write(String.format("%.4f", var0[var5]) + " - " + String.format("%.4f", -var0[var5 + 1]) + "i");
               var4.newLine();
            } else {
               var4.write(String.format("%.4f", var0[var5]) + " + " + String.format("%.4f", var0[var5 + 1]) + "i");
               var4.newLine();
            }
         }

         var4.newLine();
         var4.close();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public static void method38873(int var0, int var1, double[] var2, String var3) {
      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var3));

         for (int var7 = 0; var7 < var0; var7++) {
            for (int var8 = 0; var8 < 2 * var1; var8 += 2) {
               if (Class9044.method33591(var2[var7 * 2 * var1 + var8]) < 5.0E-5 && Class9044.method33591(var2[var7 * 2 * var1 + var8 + 1]) < 5.0E-5) {
                  if (var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write("0 + 0i\t");
                  } else {
                     var6.write("0 - 0i\t");
                  }
               } else if (Class9044.method33591(var2[var7 * 2 * var1 + var8 + 1]) < 5.0E-5) {
                  if (var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " + 0i\t");
                  } else {
                     var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " - 0i\t");
                  }
               } else if (Class9044.method33591(var2[var7 * 2 * var1 + var8]) < 5.0E-5) {
                  if (var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write("0 + " + String.format("%.4f", var2[var7 * 2 * var1 + var8 + 1]) + "i\t");
                  } else {
                     var6.write("0 - " + String.format("%.4f", -var2[var7 * 2 * var1 + var8 + 1]) + "i\t");
                  }
               } else if (var2[var7 * 2 * var1 + var8 + 1] < 0.0) {
                  var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " - " + String.format("%.4f", -var2[var7 * 2 * var1 + var8 + 1]) + "i\t");
               } else {
                  var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " + " + String.format("%.4f", var2[var7 * 2 * var1 + var8 + 1]) + "i\t");
               }
            }

            var6.newLine();
         }

         var6.newLine();
         var6.close();
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public static void method38874(int var0, int var1, float[] var2, String var3) {
      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var3));

         for (int var7 = 0; var7 < var0; var7++) {
            for (int var8 = 0; var8 < 2 * var1; var8 += 2) {
               if ((double)Class9044.method33590(var2[var7 * 2 * var1 + var8]) < 5.0E-5
                  && (double)Class9044.method33590(var2[var7 * 2 * var1 + var8 + 1]) < 5.0E-5) {
                  if ((double)var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write("0 + 0i\t");
                  } else {
                     var6.write("0 - 0i\t");
                  }
               } else if ((double)Class9044.method33590(var2[var7 * 2 * var1 + var8 + 1]) < 5.0E-5) {
                  if ((double)var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " + 0i\t");
                  } else {
                     var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " - 0i\t");
                  }
               } else if ((double)Class9044.method33590(var2[var7 * 2 * var1 + var8]) < 5.0E-5) {
                  if ((double)var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write("0 + " + String.format("%.4f", var2[var7 * 2 * var1 + var8 + 1]) + "i\t");
                  } else {
                     var6.write("0 - " + String.format("%.4f", -var2[var7 * 2 * var1 + var8 + 1]) + "i\t");
                  }
               } else if (var2[var7 * 2 * var1 + var8 + 1] < 0.0F) {
                  var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " - " + String.format("%.4f", -var2[var7 * 2 * var1 + var8 + 1]) + "i\t");
               } else {
                  var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " + " + String.format("%.4f", var2[var7 * 2 * var1 + var8 + 1]) + "i\t");
               }
            }

            var6.newLine();
         }

         var6.newLine();
         var6.close();
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public static void method38875(double[][] var0, String var1) {
      int var4 = var0.length;
      int var5 = var0[0].length;

      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var1));

         for (int var7 = 0; var7 < var4; var7++) {
            for (int var8 = 0; var8 < 2 * var5; var8 += 2) {
               if (Class9044.method33591(var0[var7][var8]) < 5.0E-5 && Class9044.method33591(var0[var7][var8 + 1]) < 5.0E-5) {
                  if (var0[var7][var8 + 1] >= 0.0) {
                     var6.write("0 + 0i\t");
                  } else {
                     var6.write("0 - 0i\t");
                  }
               } else if (Class9044.method33591(var0[var7][var8 + 1]) < 5.0E-5) {
                  if (var0[var7][var8 + 1] >= 0.0) {
                     var6.write(String.format("%.4f", var0[var7][var8]) + " + 0i\t");
                  } else {
                     var6.write(String.format("%.4f", var0[var7][var8]) + " - 0i\t");
                  }
               } else if (Class9044.method33591(var0[var7][var8]) < 5.0E-5) {
                  if (var0[var7][var8 + 1] >= 0.0) {
                     var6.write("0 + " + String.format("%.4f", var0[var7][var8 + 1]) + "i\t");
                  } else {
                     var6.write("0 - " + String.format("%.4f", -var0[var7][var8 + 1]) + "i\t");
                  }
               } else if (var0[var7][var8 + 1] < 0.0) {
                  var6.write(String.format("%.4f", var0[var7][var8]) + " - " + String.format("%.4f", -var0[var7][var8 + 1]) + "i\t");
               } else {
                  var6.write(String.format("%.4f", var0[var7][var8]) + " + " + String.format("%.4f", var0[var7][var8 + 1]) + "i\t");
               }
            }

            var6.newLine();
         }

         var6.newLine();
         var6.close();
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public static void method38876(int var0, int var1, int var2, double[] var3, String var4) {
      int var7 = var1 * var2 * 2;
      int var8 = var2 * 2;

      try {
         BufferedWriter var9 = new BufferedWriter(new FileWriter(var4));

         for (int var10 = 0; var10 < 2 * var2; var10 += 2) {
            var9.newLine();
            var9.write("(:,:," + var10 / 2 + ")=");
            var9.newLine();
            var9.newLine();

            for (int var11 = 0; var11 < var0; var11++) {
               for (int var12 = 0; var12 < var1; var12++) {
                  if (var3[var11 * var7 + var12 * var8 + var10 + 1] == 0.0) {
                     var9.write(String.format("%.4f", var3[var11 * var7 + var12 * var8 + var10]) + "\t");
                  } else if (var3[var11 * var7 + var12 * var8 + var10] == 0.0) {
                     var9.write(String.format("%.4f", var3[var11 * var7 + var12 * var8 + var10 + 1]) + "i\t");
                  } else if (var3[var11 * var7 + var12 * var8 + var10 + 1] < 0.0) {
                     var9.write(
                        String.format("%.4f", var3[var11 * var7 + var12 * var8 + var10])
                           + " - "
                           + String.format("%.4f", -var3[var11 * var7 + var12 * var8 + var10 + 1])
                           + "i\t"
                     );
                  } else {
                     var9.write(
                        String.format("%.4f", var3[var11 * var7 + var12 * var8 + var10])
                           + " + "
                           + String.format("%.4f", var3[var11 * var7 + var12 * var8 + var10 + 1])
                           + "i\t"
                     );
                  }
               }

               var9.newLine();
            }
         }

         var9.newLine();
         var9.close();
      } catch (IOException var13) {
         var13.printStackTrace();
      }
   }

   public static void method38877(double[][][] var0, String var1) {
      int var4 = var0.length;
      int var5 = var0[0].length;
      int var6 = var0[0][0].length;

      try {
         BufferedWriter var7 = new BufferedWriter(new FileWriter(var1));

         for (int var8 = 0; var8 < 2 * var6; var8 += 2) {
            var7.newLine();
            var7.write("(:,:," + var8 / 2 + ")=");
            var7.newLine();
            var7.newLine();

            for (int var9 = 0; var9 < var4; var9++) {
               for (int var10 = 0; var10 < var5; var10++) {
                  if (var0[var9][var10][var8 + 1] == 0.0) {
                     var7.write(String.format("%.4f", var0[var9][var10][var8]) + "\t");
                  } else if (var0[var9][var10][var8] == 0.0) {
                     var7.write(String.format("%.4f", var0[var9][var10][var8 + 1]) + "i\t");
                  } else if (var0[var9][var10][var8 + 1] < 0.0) {
                     var7.write(String.format("%.4f", var0[var9][var10][var8]) + " - " + String.format("%.4f", -var0[var9][var10][var8 + 1]) + "i\t");
                  } else {
                     var7.write(String.format("%.4f", var0[var9][var10][var8]) + " + " + String.format("%.4f", var0[var9][var10][var8 + 1]) + "i\t");
                  }
               }

               var7.newLine();
            }
         }

         var7.newLine();
         var7.close();
      } catch (IOException var11) {
         var11.printStackTrace();
      }
   }

   public static void method38878(double[] var0, String var1) {
      try {
         BufferedWriter var4 = new BufferedWriter(new FileWriter(var1));

         for (int var5 = 0; var5 < var0.length; var5++) {
            var4.write(String.format("%.4f", var0[var5]));
            var4.newLine();
         }

         var4.close();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public static void method38879(float[] var0, String var1) {
      try {
         BufferedWriter var4 = new BufferedWriter(new FileWriter(var1));

         for (int var5 = 0; var5 < var0.length; var5++) {
            var4.write(String.format("%.4f", var0[var5]));
            var4.newLine();
         }

         var4.close();
      } catch (IOException var6) {
         var6.printStackTrace();
      }
   }

   public static void method38880(int var0, int var1, double[] var2, String var3) {
      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var3));

         for (int var7 = 0; var7 < var0; var7++) {
            for (int var8 = 0; var8 < var1; var8++) {
               if (Class9044.method33591(var2[var7 * var1 + var8]) < 5.0E-5) {
                  var6.write("0\t");
               } else {
                  var6.write(String.format("%.4f", var2[var7 * var1 + var8]) + "\t");
               }
            }

            var6.newLine();
         }

         var6.close();
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public static void method38881(int var0, int var1, float[] var2, String var3) {
      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var3));

         for (int var7 = 0; var7 < var0; var7++) {
            for (int var8 = 0; var8 < var1; var8++) {
               if ((double)Class9044.method33590(var2[var7 * var1 + var8]) < 5.0E-5) {
                  var6.write("0\t");
               } else {
                  var6.write(String.format("%.4f", var2[var7 * var1 + var8]) + "\t");
               }
            }

            var6.newLine();
         }

         var6.close();
      } catch (IOException var9) {
         var9.printStackTrace();
      }
   }

   public static void method38882(int var0, int var1, int var2, double[] var3, String var4) {
      int var7 = var1 * var2;
      int var8 = var2;

      try {
         BufferedWriter var9 = new BufferedWriter(new FileWriter(var4));

         for (int var10 = 0; var10 < var2; var10++) {
            var9.newLine();
            var9.write("(:,:," + var10 + ")=");
            var9.newLine();
            var9.newLine();

            for (int var11 = 0; var11 < var0; var11++) {
               for (int var12 = 0; var12 < var1; var12++) {
                  var9.write(String.format("%.4f", var3[var11 * var7 + var12 * var8 + var10]) + "\t");
               }

               var9.newLine();
            }

            var9.newLine();
         }

         var9.close();
      } catch (IOException var13) {
         var13.printStackTrace();
      }
   }

   public static void method38883(String var0, int var1, int var2, boolean var3, boolean var4, long[] var5, double[] var6, double[] var7) {
      String[] var10 = new String[]{"os.name", "os.version", "os.arch", "java.vendor", "java.version"};

      try {
         BufferedWriter var11 = new BufferedWriter(new FileWriter(var0, false));
         var11.write(new Date().toString());
         var11.newLine();
         var11.write("System properties:");
         var11.newLine();
         var11.write("\tos.name = " + System.getProperty(var10[0]));
         var11.newLine();
         var11.write("\tos.version = " + System.getProperty(var10[1]));
         var11.newLine();
         var11.write("\tos.arch = " + System.getProperty(var10[2]));
         var11.newLine();
         var11.write("\tjava.vendor = " + System.getProperty(var10[3]));
         var11.newLine();
         var11.write("\tjava.version = " + System.getProperty(var10[4]));
         var11.newLine();
         var11.write("\tavailable processors = " + Runtime.getRuntime().availableProcessors());
         var11.newLine();
         var11.write("Settings:");
         var11.newLine();
         var11.write("\tused processors = " + var1);
         var11.newLine();
         var11.write("\tTHREADS_BEGIN_N_2D = " + Class7796.method25893());
         var11.newLine();
         var11.write("\tTHREADS_BEGIN_N_3D = " + Class7796.method25894());
         var11.newLine();
         var11.write("\tnumber of iterations = " + var2);
         var11.newLine();
         var11.write("\twarm-up performed = " + var3);
         var11.newLine();
         var11.write("\tscaling performed = " + var4);
         var11.newLine();
         var11.write("--------------------------------------------------------------------------------------------------");
         var11.newLine();
         var11.write("sizes=[");

         for (int var12 = 0; var12 < var5.length; var12++) {
            var11.write(Long.toString(var5[var12]));
            if (var12 < var5.length - 1) {
               var11.write(", ");
            } else {
               var11.write("]");
            }
         }

         var11.newLine();
         var11.write("times without constructor(in msec)=[");

         for (int var14 = 0; var14 < var6.length; var14++) {
            var11.write(String.format("%.2f", var6[var14]));
            if (var14 < var6.length - 1) {
               var11.write(", ");
            } else {
               var11.write("]");
            }
         }

         var11.newLine();
         var11.write("times with constructor(in msec)=[");

         for (int var15 = 0; var15 < var6.length; var15++) {
            var11.write(String.format("%.2f", var7[var15]));
            if (var15 < var7.length - 1) {
               var11.write(", ");
            } else {
               var11.write("]");
            }
         }

         var11.newLine();
         var11.close();
      } catch (IOException var13) {
         var13.printStackTrace();
      }
   }
}
