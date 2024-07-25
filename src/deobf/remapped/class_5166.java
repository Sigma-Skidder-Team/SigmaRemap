package remapped;

import java.io.PrintStream;
import org.apache.commons.math3.exception.DimensionMismatchException;

public class class_5166 {
   private static final long field_26602 = 1073741824L;
   private static final double[] field_26598 = new double[]{
      1.0,
      1.0,
      2.0,
      6.0,
      24.0,
      120.0,
      720.0,
      5040.0,
      40320.0,
      362880.0,
      3628800.0,
      3.99168E7,
      4.790016E8,
      6.227021E9F,
      8.71782912E10,
      1.307674368E12,
      2.0922789888E13,
      3.55687428096E14,
      6.402373705728E15,
      1.21645100408832E17
   };
   private static final double[][] field_26599 = new double[][]{
      {2.0, 0.0},
      {0.6666666F, 3.9736429850260626E-8},
      {0.39999998F, 2.3841857910019882E-8},
      {0.28571427F, 1.7029898543501842E-8},
      {0.22222221F, 1.3245471311735498E-8},
      {0.18181816F, 2.4384203044354907E-8},
      {0.15384614F, 9.140260083262505E-9},
      {0.13333333F, 9.220590270857665E-9},
      {0.11764701F, 1.2393345855018391E-8},
      {0.10526404F, 8.251545029714408E-9},
      {0.09522332F, 1.2675934823758863E-8},
      {0.087136224F, 1.1430250008909141E-8},
      {0.07842259F, 2.404307984052299E-9},
      {0.08371849F, 1.176342548272881E-8},
      {0.03058958F, 1.2958646899018938E-9},
      {0.14982304F, 1.225743062930824E-8}
   };
   private static final String field_26603 = "    {";
   private static final String field_26600 = "    };";

   private class_5166() {
   }

   private static void method_23674(double[] var0, double[] var1, double[] var2, double[] var3, int var4, double[] var5, double[] var6) {
      double[] var9 = new double[2];

      for (int var10 = 0; var10 < 7; var10++) {
         double var11 = (double)var10 / 8.0;
         method_23683(var11, var9);
         var0[var10] = var9[0];
         var1[var10] = var9[1];
         method_23673(var11, var9);
         var2[var10] = var9[0];
         var3[var10] = var9[1];
      }

      for (int var18 = 7; var18 < var4; var18++) {
         double[] var13 = new double[2];
         double[] var14 = new double[2];
         double[] var15 = new double[2];
         double[] var16 = new double[2];
         double[] var17 = new double[2];
         if ((var18 & 1) != 0) {
            var13[0] = var0[var18 / 2];
            var13[1] = var1[var18 / 2];
            var14[0] = var2[var18 / 2];
            var14[1] = var3[var18 / 2];
            var15[0] = var0[var18 / 2 + 1];
            var15[1] = var1[var18 / 2 + 1];
            var16[0] = var2[var18 / 2 + 1];
            var16[1] = var3[var18 / 2 + 1];
            method_23672(var13, var16, var17);
            method_23672(var14, var15, var9);
            method_23671(var9, var17, var9);
            var0[var18] = var9[0];
            var1[var18] = var9[1];
            method_23672(var14, var16, var9);
            method_23672(var13, var15, var17);
            var17[0] = -var17[0];
            var17[1] = -var17[1];
            method_23671(var9, var17, var9);
            var2[var18] = var9[0];
            var3[var18] = var9[1];
         } else {
            var13[0] = var0[var18 / 2];
            var13[1] = var1[var18 / 2];
            var14[0] = var2[var18 / 2];
            var14[1] = var3[var18 / 2];
            method_23672(var13, var14, var9);
            var0[var18] = var9[0] * 2.0;
            var1[var18] = var9[1] * 2.0;
            method_23672(var14, var14, var15);
            method_23672(var13, var13, var17);
            var17[0] = -var17[0];
            var17[1] = -var17[1];
            method_23671(var15, var17, var9);
            var2[var18] = var9[0];
            var3[var18] = var9[1];
         }
      }

      for (int var19 = 0; var19 < var4; var19++) {
         double[] var20 = new double[2];
         double[] var21 = new double[2];
         double[] var22 = new double[]{var2[var19], var3[var19]};
         method_23681(var22, var21);
         var20[0] = var0[var19];
         var20[1] = var1[var19];
         method_23672(var20, var21, var22);
         var5[var19] = var22[0];
         var6[var19] = var22[1];
      }
   }

   public static double method_23673(double var0, double[] var2) {
      double[] var5 = new double[2];
      double[] var6 = new double[2];
      double[] var7 = new double[2];
      double[] var8 = new double[2];
      method_23670(var0, var5);
      var6[0] = var6[1] = 0.0;

      for (int var9 = field_26598.length - 1; var9 >= 0; var9--) {
         method_23672(var5, var6, var8);
         var6[0] = var8[0];
         var6[1] = var8[1];
         if ((var9 & 1) == 0) {
            method_23670(field_26598[var9], var8);
            method_23681(var8, var7);
            if ((var9 & 2) != 0) {
               var7[0] = -var7[0];
               var7[1] = -var7[1];
            }

            method_23671(var6, var7, var8);
            var6[0] = var8[0];
            var6[1] = var8[1];
         }
      }

      if (var2 != null) {
         var2[0] = var6[0];
         var2[1] = var6[1];
      }

      return var6[0] + var6[1];
   }

   public static double method_23683(double var0, double[] var2) {
      double[] var5 = new double[2];
      double[] var6 = new double[2];
      double[] var7 = new double[2];
      double[] var8 = new double[2];
      method_23670(var0, var5);
      var6[0] = var6[1] = 0.0;

      for (int var9 = field_26598.length - 1; var9 >= 0; var9--) {
         method_23672(var5, var6, var8);
         var6[0] = var8[0];
         var6[1] = var8[1];
         if ((var9 & 1) != 0) {
            method_23670(field_26598[var9], var8);
            method_23681(var8, var7);
            if ((var9 & 2) != 0) {
               var7[0] = -var7[0];
               var7[1] = -var7[1];
            }

            method_23671(var6, var7, var8);
            var6[0] = var8[0];
            var6[1] = var8[1];
         }
      }

      if (var2 != null) {
         var2[0] = var6[0];
         var2[1] = var6[1];
      }

      return var6[0] + var6[1];
   }

   public static double method_23676(double var0, double[] var2) {
      double[] var5 = new double[2];
      double[] var6 = new double[2];
      double[] var7 = new double[2];
      double[] var8 = new double[2];
      method_23670(var0, var5);
      var6[0] = var6[1] = 0.0;

      for (int var9 = field_26598.length - 1; var9 >= 0; var9--) {
         method_23672(var5, var6, var8);
         var6[0] = var8[0];
         var6[1] = var8[1];
         method_23670(field_26598[var9], var8);
         method_23681(var8, var7);
         method_23671(var6, var7, var8);
         var6[0] = var8[0];
         var6[1] = var8[1];
      }

      if (var2 != null) {
         var2[0] = var6[0];
         var2[1] = var6[1];
      }

      return var6[0] + var6[1];
   }

   private static void method_23670(double var0, double[] var2) {
      if (var0 < 8.0E298 && var0 > -8.0E298) {
         double var7 = var0 * 1.0737418E9F;
         var2[0] = var0 + var7 - var7;
         var2[1] = var0 - var2[0];
      } else {
         double var5 = var0 * 9.313226E-10F;
         var2[0] = (var0 + var5 - var0) * 1.0737418E9F;
         var2[1] = var0 - var2[0];
      }
   }

   private static void method_23682(double[] var0) {
      double var3 = var0[0] + var0[1];
      double var5 = -(var3 - var0[0] - var0[1]);
      if (var3 < 8.0E298 && var3 > -8.0E298) {
         double var9 = var3 * 1.0737418E9F;
         var0[0] = var3 + var9 - var9;
         var0[1] = var3 - var0[0] + var5;
      } else {
         double var7 = var3 * 9.313226E-10F;
         var0[0] = (var3 + var7 - var3) * 1.0737418E9F;
         var0[1] = var3 - var0[0] + var5;
      }
   }

   private static void method_23672(double[] var0, double[] var1, double[] var2) {
      var2[0] = var0[0] * var1[0];
      var2[1] = var0[0] * var1[1] + var0[1] * var1[0] + var0[1] * var1[1];
      method_23682(var2);
   }

   private static void method_23671(double[] var0, double[] var1, double[] var2) {
      var2[0] = var0[0] + var1[0];
      var2[1] = var0[1] + var1[1];
      method_23682(var2);
   }

   public static void method_23681(double[] var0, double[] var1) {
      double var4 = 2.3841858E-7F;
      double var6 = 0.99999976F;
      if (var0[0] == 0.0) {
         var0[0] = var0[1];
         var0[1] = 0.0;
      }

      var1[0] = 0.99999976F / var0[0];
      var1[1] = (2.3841858E-7F * var0[0] - 0.99999976F * var0[1]) / (var0[0] * var0[0] + var0[0] * var0[1]);
      if (var1[1] != var1[1]) {
         var1[1] = 0.0;
      }

      method_23682(var1);

      for (int var8 = 0; var8 < 2; var8++) {
         double var9 = 1.0 - var1[0] * var0[0] - var1[0] * var0[1] - var1[1] * var0[0] - var1[1] * var0[1];
         var9 *= var1[0] + var1[1];
         var1[1] += var9;
      }
   }

   private static void method_23675(double[] var0, double[] var1, double[] var2) {
      double[] var5 = new double[2];
      double[] var6 = new double[2];
      double[] var7 = new double[2];
      method_23670(var0[0], var5);
      method_23670(var1[0], var6);
      method_23672(var5, var6, var7);
      var2[0] = var7[0];
      var2[1] = var7[1];
      method_23670(var1[1], var6);
      method_23672(var5, var6, var7);
      double var8 = var2[0] + var7[0];
      var2[1] -= var8 - var2[0] - var7[0];
      var2[0] = var8;
      var8 = var2[0] + var7[1];
      var2[1] -= var8 - var2[0] - var7[1];
      var2[0] = var8;
      method_23670(var0[1], var5);
      method_23670(var1[0], var6);
      method_23672(var5, var6, var7);
      var8 = var2[0] + var7[0];
      var2[1] -= var8 - var2[0] - var7[0];
      var2[0] = var8;
      var8 = var2[0] + var7[1];
      var2[1] -= var8 - var2[0] - var7[1];
      var2[0] = var8;
      method_23670(var0[1], var5);
      method_23670(var1[1], var6);
      method_23672(var5, var6, var7);
      var8 = var2[0] + var7[0];
      var2[1] -= var8 - var2[0] - var7[0];
      var2[0] = var8;
      var8 = var2[0] + var7[1];
      var2[1] -= var8 - var2[0] - var7[1];
      var2[0] = var8;
   }

   public static double method_23685(int var0, double[] var1) {
      double[] var4 = new double[2];
      double[] var5 = new double[2];
      double[] var6 = new double[2];
      var4[0] = Math.E;
      var4[1] = 1.4456468917292502E-16;
      method_23670(1.0, var6);

      while (var0 > 0) {
         if ((var0 & 1) != 0) {
            method_23675(var6, var4, var5);
            var6[0] = var5[0];
            var6[1] = var5[1];
         }

         method_23675(var4, var4, var5);
         var4[0] = var5[0];
         var4[1] = var5[1];
         var0 >>= 1;
      }

      if (var1 != null) {
         var1[0] = var6[0];
         var1[1] = var6[1];
         method_23682(var1);
      }

      return var6[0] + var6[1];
   }

   public static double[] method_23679(double var0) {
      double[] var4 = new double[2];
      double[] var5 = new double[2];
      double[] var6 = new double[2];
      double[] var7 = new double[2];
      method_23670(var0, var4);
      var4[0]++;
      method_23682(var4);
      method_23681(var4, var7);
      var4[0] -= 2.0;
      method_23682(var4);
      method_23672(var4, var7, var6);
      var4[0] = var6[0];
      var4[1] = var6[1];
      method_23672(var4, var4, var5);
      var6[0] = field_26599[field_26599.length - 1][0];
      var6[1] = field_26599[field_26599.length - 1][1];

      for (int var8 = field_26599.length - 2; var8 >= 0; var8--) {
         method_23672(var6, var5, var7);
         var6[0] = var7[0];
         var6[1] = var7[1];
         method_23671(var6, field_26599[var8], var7);
         var6[0] = var7[0];
         var6[1] = var7[1];
      }

      method_23672(var6, var4, var7);
      var6[0] = var7[0];
      var6[1] = var7[1];
      return var6;
   }

   public static void method_23678(PrintStream var0, String var1, int var2, double[][] var3) {
      var0.println(var1);
      method_23680(var2, var3.length);
      var0.println("    { ");
      int var6 = 0;

      for (double[] var10 : var3) {
         var0.print("        {");

         for (double var14 : var10) {
            var0.printf("%-25.25s", method_23686(var14));
         }

         var0.println("}, // " + var6++);
      }

      var0.println("    };");
   }

   public static void method_23677(PrintStream var0, String var1, int var2, double[] var3) {
      var0.println(var1 + "=");
      method_23680(var2, var3.length);
      var0.println("    {");

      for (double var9 : var3) {
         var0.printf("        %s%n", method_23686(var9));
      }

      var0.println("    };");
   }

   public static String method_23686(double var0) {
      return var0 == var0 ? (!(var0 >= 0.0) ? "" : "+") + Double.toString(var0) + "d," : "Double.NaN,";
   }

   private static void method_23680(int var0, int var1) throws DimensionMismatchException {
      if (var0 != var1) {
         throw new class_2145(var1, var0);
      }
   }
}
