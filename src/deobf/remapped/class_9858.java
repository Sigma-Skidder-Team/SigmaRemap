package remapped;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class class_9858 {
   private static final String field_49895 = "%.4f";

   private class_9858() {
   }

   public static double method_45435(float var0, float var1) {
      double var4 = (double)(var0 - var1);
      double var6 = var4 * var4;
      return class_6806.method_31206(var6);
   }

   public static double method_45439(float[] var0, float[] var1) {
      if (var0.length != var1.length) {
         throw new IllegalArgumentException("Arrays are not the same size");
      } else {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            double var7 = (double)(var0[var6] - var1[var6]);
            var4 += var7 * var7;
         }

         return class_6806.method_31206(var4 / (double)var0.length);
      }
   }

   public static double method_45437(class_4330 var0, class_4330 var1) {
      if (var0.method_36136() != var1.method_36136()) {
         throw new IllegalArgumentException("Arrays are not the same size.");
      } else {
         double var4 = 0.0;

         for (long var6 = 0L; var6 < var0.method_36136(); var6++) {
            double var8 = (double)(var0.method_36133(var6) - var1.method_36133(var6));
            var4 += var8 * var8;
         }

         return class_6806.method_31206(var4 / (double)var0.method_36136());
      }
   }

   public static double method_45441(float[][] var0, float[][] var1) {
      if (var0.length == var1.length && var0[0].length == var1[0].length) {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            for (int var7 = 0; var7 < var0[0].length; var7++) {
               double var8 = (double)(var0[var6][var7] - var1[var6][var7]);
               var4 += var8 * var8;
            }
         }

         return class_6806.method_31206(var4 / (double)(var0.length * var0[0].length));
      } else {
         throw new IllegalArgumentException("Arrays are not the same size");
      }
   }

   public static double method_45443(float[][][] var0, float[][][] var1) {
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

         return class_6806.method_31206(var4 / (double)(var0.length * var0[0].length * var0[0][0].length));
      } else {
         throw new IllegalArgumentException("Arrays are not the same size");
      }
   }

   public static double method_45434(double var0, double var2) {
      double var6 = var0 - var2;
      double var8 = var6 * var6;
      return class_6806.method_31206(var8);
   }

   public static double method_45438(double[] var0, double[] var1) {
      if (var0.length != var1.length) {
         throw new IllegalArgumentException("Arrays are not the same size");
      } else {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            double var7 = var0[var6] - var1[var6];
            var4 += var7 * var7;
         }

         return class_6806.method_31206(var4 / (double)var0.length);
      }
   }

   public static double method_45436(class_1702 var0, class_1702 var1) {
      if (var0.method_36136() != var1.method_36136()) {
         throw new IllegalArgumentException("Arrays are not the same size.");
      } else {
         double var4 = 0.0;

         for (long var6 = 0L; var6 < var0.method_36136(); var6++) {
            double var8 = var0.method_36107(var6) - var1.method_36107(var6);
            var4 += var8 * var8;
         }

         return class_6806.method_31206(var4 / (double)var0.method_36136());
      }
   }

   public static double method_45440(double[][] var0, double[][] var1) {
      if (var0.length == var1.length && var0[0].length == var1[0].length) {
         double var4 = 0.0;

         for (int var6 = 0; var6 < var0.length; var6++) {
            for (int var7 = 0; var7 < var0[0].length; var7++) {
               double var8 = var0[var6][var7] - var1[var6][var7];
               var4 += var8 * var8;
            }
         }

         return class_6806.method_31206(var4 / (double)(var0.length * var0[0].length));
      } else {
         throw new IllegalArgumentException("Arrays are not the same size");
      }
   }

   public static double method_45442(double[][][] var0, double[][][] var1) {
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

         return class_6806.method_31206(var4 / (double)(var0.length * var0[0].length * var0[0][0].length));
      } else {
         throw new IllegalArgumentException("Arrays are not the same size");
      }
   }

   public static void method_45421(long var0, double[] var2) {
      Random var5 = new Random(2L);

      for (int var6 = 0; (long)var6 < var0; var6++) {
         var2[var6] = var5.nextDouble();
      }
   }

   public static void method_45419(long var0, class_1702 var2) {
      Random var5 = new Random(2L);

      for (long var6 = 0L; var6 < var0; var6++) {
         var2.method_36114(var6, var5.nextDouble());
      }
   }

   public static void method_45420(long var0, class_4330 var2) {
      Random var5 = new Random(2L);

      for (long var6 = 0L; var6 < var0; var6++) {
         var2.method_36114(var6, (double)var5.nextFloat());
      }
   }

   public static void method_45422(long var0, float[] var2) {
      Random var5 = new Random(2L);

      for (int var6 = 0; (long)var6 < var0; var6++) {
         var2[var6] = var5.nextFloat();
      }
   }

   public static void method_45426(long var0, long var2, double[] var4) {
      Random var7 = new Random(2L);

      for (int var8 = 0; (long)var8 < var0; var8++) {
         for (int var9 = 0; (long)var9 < var2; var9++) {
            var4[(int)((long)var8 * var2 + (long)var9)] = var7.nextDouble();
         }
      }
   }

   public static void method_45425(long var0, long var2, class_4330 var4) {
      Random var7 = new Random(2L);

      for (long var8 = 0L; var8 < var0; var8++) {
         for (long var10 = 0L; var10 < var2; var10++) {
            var4.method_36123(var8 * var2 + var10, var7.nextFloat());
         }
      }
   }

   public static void method_45424(long var0, long var2, class_1702 var4) {
      Random var7 = new Random(2L);

      for (long var8 = 0L; var8 < var0; var8++) {
         for (long var10 = 0L; var10 < var2; var10++) {
            var4.method_36114(var8 * var2 + var10, var7.nextDouble());
         }
      }
   }

   public static void method_45427(long var0, long var2, float[] var4) {
      Random var7 = new Random(2L);

      for (int var8 = 0; (long)var8 < var0; var8++) {
         for (int var9 = 0; (long)var9 < var2; var9++) {
            var4[(int)((long)var8 * var2 + (long)var9)] = var7.nextFloat();
         }
      }
   }

   public static void method_45428(long var0, long var2, double[][] var4) {
      Random var7 = new Random(2L);

      for (int var8 = 0; (long)var8 < var0; var8++) {
         for (int var9 = 0; (long)var9 < var2; var9++) {
            var4[var8][var9] = var7.nextDouble();
         }
      }
   }

   public static void method_45429(long var0, long var2, float[][] var4) {
      Random var7 = new Random(2L);

      for (int var8 = 0; (long)var8 < var0; var8++) {
         for (int var9 = 0; (long)var9 < var2; var9++) {
            var4[var8][var9] = var7.nextFloat();
         }
      }
   }

   public static void method_45463(long var0, long var2, long var4, double[] var6) {
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

   public static void method_45461(long var0, long var2, long var4, class_1702 var6) {
      Random var9 = new Random(2L);
      long var10 = var2 * var4;
      long var12 = var4;

      for (long var14 = 0L; var14 < var0; var14++) {
         for (long var16 = 0L; var16 < var2; var16++) {
            for (long var18 = 0L; var18 < var4; var18++) {
               var6.method_36114(var14 * var10 + var16 * var12 + var18, var9.nextDouble());
            }
         }
      }
   }

   public static void method_45462(long var0, long var2, long var4, class_4330 var6) {
      Random var9 = new Random(2L);
      long var10 = var2 * var4;
      long var12 = var4;

      for (long var14 = 0L; var14 < var0; var14++) {
         for (long var16 = 0L; var16 < var2; var16++) {
            for (long var18 = 0L; var18 < var4; var18++) {
               var6.method_36114(var14 * var10 + var16 * var12 + var18, (double)var9.nextFloat());
            }
         }
      }
   }

   public static void method_45464(long var0, long var2, long var4, float[] var6) {
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

   public static void method_45465(long var0, long var2, long var4, double[][][] var6) {
      Random var9 = new Random(2L);

      for (int var10 = 0; (long)var10 < var0; var10++) {
         for (int var11 = 0; (long)var11 < var2; var11++) {
            for (int var12 = 0; (long)var12 < var4; var12++) {
               var6[var10][var11][var12] = var9.nextDouble();
            }
         }
      }
   }

   public static void method_45466(long var0, long var2, long var4, float[][][] var6) {
      Random var9 = new Random(2L);

      for (int var10 = 0; (long)var10 < var0; var10++) {
         for (int var11 = 0; (long)var11 < var2; var11++) {
            for (int var12 = 0; (long)var12 < var4; var12++) {
               var6[var10][var11][var12] = var9.nextFloat();
            }
         }
      }
   }

   public static void method_45450(double[] var0, String var1) {
      System.out.println(var1);
      System.out.println("-------------------");

      for (byte var4 = 0; var4 < var0.length; var4 += 2) {
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

   public static void method_45444(int var0, int var1, double[] var2, String var3) {
      StringBuilder var6 = new StringBuilder(String.format(var3 + ": complex array 2D: %d rows, %d columns\n\n", var0, var1));

      for (int var7 = 0; var7 < var0; var7++) {
         for (byte var8 = 0; var8 < 2 * var1; var8 += 2) {
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

   public static void method_45445(double[][] var0, String var1) {
      int var4 = var0.length;
      int var5 = var0[0].length;
      StringBuilder var6 = new StringBuilder(String.format(var1 + ": complex array 2D: %d rows, %d columns\n\n", var4, var5));

      for (int var7 = 0; var7 < var4; var7++) {
         for (byte var8 = 0; var8 < var5; var8 += 2) {
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

   public static void method_45457(int var0, int var1, int var2, double[] var3, String var4) {
      int var7 = var1 * 2 * var2;
      int var8 = 2 * var2;
      System.out.println(var4);
      System.out.println("-------------------");

      for (byte var9 = 0; var9 < 2 * var2; var9 += 2) {
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

   public static void method_45459(double[][][] var0, String var1) {
      System.out.println(var1);
      System.out.println("-------------------");
      int var4 = var0.length;
      int var5 = var0[0].length;
      int var6 = var0[0][0].length;

      for (byte var7 = 0; var7 < var6; var7 += 2) {
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

   public static void method_45458(int var0, int var1, int var2, float[] var3, String var4) {
      int var7 = var1 * 2 * var2;
      int var8 = 2 * var2;
      System.out.println(var4);
      System.out.println("-------------------");

      for (byte var9 = 0; var9 < 2 * var2; var9 += 2) {
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

   public static void method_45453(double[] var0, String var1) {
      System.out.println(var1);
      System.out.println("-------------------");

      for (int var4 = 0; var4 < var0.length; var4++) {
         System.out.println(String.format("%.4f", var0[var4]));
      }

      System.out.println();
   }

   public static void method_45423(int var0, int var1, double[] var2, String var3) {
      System.out.println(var3);
      System.out.println("-------------------");

      for (int var6 = 0; var6 < var0; var6++) {
         for (int var7 = 0; var7 < var1; var7++) {
            if (!(class_6806.method_31178(var2[var6 * var1 + var7]) < 5.0E-5)) {
               System.out.print(String.format("%.4f", var2[var6 * var1 + var7]) + "\t");
            } else {
               System.out.print("0\t");
            }
         }

         System.out.println();
      }

      System.out.println();
   }

   public static void method_45432(int var0, int var1, int var2, double[] var3, String var4) {
      int var7 = var1 * var2;
      int var8 = var2;
      System.out.println(var4);
      System.out.println("-------------------");

      for (int var9 = 0; var9 < var2; var9++) {
         System.out.println();
         System.out.println("(:,:," + var9 + ")=\n");

         for (int var10 = 0; var10 < var0; var10++) {
            for (int var11 = 0; var11 < var1; var11++) {
               if (!(class_6806.method_31178(var3[var10 * var7 + var11 * var8 + var9]) <= 5.0E-5)) {
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

   public static void method_45433(double[][][] var0, String var1) {
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
               if (!(class_6806.method_31178(var0[var8][var9][var7]) <= 5.0E-5)) {
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

   public static void method_45430(double[] var0, String var1) {
      try {
         BufferedWriter var4 = new BufferedWriter(new FileWriter(var1));

         for (byte var5 = 0; var5 < var0.length; var5 += 2) {
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

   public static void method_45431(float[] var0, String var1) {
      try {
         BufferedWriter var4 = new BufferedWriter(new FileWriter(var1));

         for (byte var5 = 0; var5 < var0.length; var5 += 2) {
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

   public static void method_45446(int var0, int var1, double[] var2, String var3) {
      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var3));

         for (int var7 = 0; var7 < var0; var7++) {
            for (byte var8 = 0; var8 < 2 * var1; var8 += 2) {
               if (class_6806.method_31178(var2[var7 * 2 * var1 + var8]) < 5.0E-5 && class_6806.method_31178(var2[var7 * 2 * var1 + var8 + 1]) < 5.0E-5) {
                  if (var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write("0 + 0i\t");
                  } else {
                     var6.write("0 - 0i\t");
                  }
               } else if (class_6806.method_31178(var2[var7 * 2 * var1 + var8 + 1]) < 5.0E-5) {
                  if (var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " + 0i\t");
                  } else {
                     var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " - 0i\t");
                  }
               } else if (class_6806.method_31178(var2[var7 * 2 * var1 + var8]) < 5.0E-5) {
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

   public static void method_45447(int var0, int var1, float[] var2, String var3) {
      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var3));

         for (int var7 = 0; var7 < var0; var7++) {
            for (byte var8 = 0; var8 < 2 * var1; var8 += 2) {
               if ((double)class_6806.method_31179(var2[var7 * 2 * var1 + var8]) < 5.0E-5
                  && (double)class_6806.method_31179(var2[var7 * 2 * var1 + var8 + 1]) < 5.0E-5) {
                  if ((double)var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write("0 + 0i\t");
                  } else {
                     var6.write("0 - 0i\t");
                  }
               } else if ((double)class_6806.method_31179(var2[var7 * 2 * var1 + var8 + 1]) < 5.0E-5) {
                  if ((double)var2[var7 * 2 * var1 + var8 + 1] >= 0.0) {
                     var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " + 0i\t");
                  } else {
                     var6.write(String.format("%.4f", var2[var7 * 2 * var1 + var8]) + " - 0i\t");
                  }
               } else if ((double)class_6806.method_31179(var2[var7 * 2 * var1 + var8]) < 5.0E-5) {
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

   public static void method_45448(double[][] var0, String var1) {
      int var4 = var0.length;
      int var5 = var0[0].length;

      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var1));

         for (int var7 = 0; var7 < var4; var7++) {
            for (byte var8 = 0; var8 < 2 * var5; var8 += 2) {
               if (class_6806.method_31178(var0[var7][var8]) < 5.0E-5 && class_6806.method_31178(var0[var7][var8 + 1]) < 5.0E-5) {
                  if (var0[var7][var8 + 1] >= 0.0) {
                     var6.write("0 + 0i\t");
                  } else {
                     var6.write("0 - 0i\t");
                  }
               } else if (class_6806.method_31178(var0[var7][var8 + 1]) < 5.0E-5) {
                  if (var0[var7][var8 + 1] >= 0.0) {
                     var6.write(String.format("%.4f", var0[var7][var8]) + " + 0i\t");
                  } else {
                     var6.write(String.format("%.4f", var0[var7][var8]) + " - 0i\t");
                  }
               } else if (class_6806.method_31178(var0[var7][var8]) < 5.0E-5) {
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

   public static void method_45451(int var0, int var1, int var2, double[] var3, String var4) {
      int var7 = var1 * var2 * 2;
      int var8 = var2 * 2;

      try {
         BufferedWriter var9 = new BufferedWriter(new FileWriter(var4));

         for (byte var10 = 0; var10 < 2 * var2; var10 += 2) {
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

   public static void method_45452(double[][][] var0, String var1) {
      int var4 = var0.length;
      int var5 = var0[0].length;
      int var6 = var0[0][0].length;

      try {
         BufferedWriter var7 = new BufferedWriter(new FileWriter(var1));

         for (byte var8 = 0; var8 < 2 * var6; var8 += 2) {
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

   public static void method_45455(double[] var0, String var1) {
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

   public static void method_45456(float[] var0, String var1) {
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

   public static void method_45417(int var0, int var1, double[] var2, String var3) {
      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var3));

         for (int var7 = 0; var7 < var0; var7++) {
            for (int var8 = 0; var8 < var1; var8++) {
               if (class_6806.method_31178(var2[var7 * var1 + var8]) < 5.0E-5) {
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

   public static void method_45418(int var0, int var1, float[] var2, String var3) {
      try {
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var3));

         for (int var7 = 0; var7 < var0; var7++) {
            for (int var8 = 0; var8 < var1; var8++) {
               if ((double)class_6806.method_31179(var2[var7 * var1 + var8]) < 5.0E-5) {
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

   public static void method_45449(int var0, int var1, int var2, double[] var3, String var4) {
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

   public static void method_45454(String var0, int var1, int var2, boolean var3, boolean var4, long[] var5, double[] var6, double[] var7) {
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
         var11.write("\tTHREADS_BEGIN_N_2D = " + class_2751.method_12428());
         var11.newLine();
         var11.write("\tTHREADS_BEGIN_N_3D = " + class_2751.method_12537());
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
