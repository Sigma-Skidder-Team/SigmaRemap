package remapped;

import java.io.PrintStream;
import org.apache.commons.math3.exception.MathArithmeticException;

public class class_6806 {
   public static final double field_35082 = Math.PI;
   public static final double field_35096 = Math.E;
   public static final int field_35070 = 750;
   public static final int field_35091 = 1500;
   public static final int field_35080 = 1024;
   public static final int field_35104 = 1025;
   private static final double field_35071 = StrictMath.log(Double.MAX_VALUE);
   private static final boolean field_35106 = false;
   private static final double field_35094 = 0.69314706F;
   private static final double field_35087 = 1.1730463525082348E-7;
   private static final double[][] field_35075 = new double[][]{
      {1.0, 5.669184079525E-24},
      {-0.25, -0.25},
      {0.3333333F, 1.986821492305628E-8},
      {-0.25, -6.663542893624021E-14},
      {0.19999999F, 1.1921056801463227E-8},
      {-0.16666666F, -7.800414592973399E-9},
      {0.14285713F, 5.650007086920087E-9},
      {-0.1250253F, -7.44321345601866E-11},
      {0.111138076F, 9.219544613762692E-9}
   };
   private static final double[][] field_35068 = new double[][]{
      {1.0, -6.032174644509064E-23},
      {-0.25, -0.25},
      {0.3333333F, 1.9868161777724352E-8},
      {-0.24999997F, -2.957007209750105E-8},
      {0.19999954F, 1.5830993332061267E-10},
      {-0.1662488F, -2.6033824355191673E-8}
   };
   private static final int field_35083 = 14;
   private static final double[] field_35101 = new double[]{
      0.0,
      0.12467474F,
      0.24740395F,
      0.3662725F,
      0.47942555F,
      0.5850973F,
      0.6816387F,
      0.76754355F,
      0.84147096F,
      0.9022676F,
      0.9489846F,
      0.980893F,
      0.99749494F,
      0.99853134F
   };
   private static final double[] field_35099 = new double[]{
      0.0,
      -4.068233003401932E-9,
      9.755392680573412E-9,
      1.9987994582857286E-8,
      -1.0902938113007961E-8,
      -3.9986783938944604E-8,
      4.23719669792332E-8,
      -5.207000323380292E-8,
      2.800552834259E-8,
      1.883511811213715E-8,
      -3.5997360512765566E-9,
      4.116164446561962E-8,
      5.0614674548127384E-8,
      -1.0129027912496858E-9
   };
   private static final double[] field_35103 = new double[]{
      1.0,
      0.99219763F,
      0.96891236F,
      0.93050766F,
      0.87758255F,
      0.81096315F,
      0.73168886F,
      0.6409968F,
      0.5403023F,
      0.43117654F,
      0.31532234F,
      0.19454771F,
      0.0707372F,
      -0.054177135F
   };
   private static final double[] field_35086 = new double[]{
      0.0,
      3.4439717236742845E-8,
      5.865827662008209E-8,
      -3.7999795083850525E-8,
      1.184154459111628E-8,
      -3.43338934259355E-8,
      1.1795268640216787E-8,
      4.438921624363781E-8,
      2.925681159240093E-8,
      -2.6437112632041807E-8,
      2.2860509143963117E-8,
      -4.813899778443457E-9,
      3.6725170580355583E-9,
      2.0217439756338078E-10
   };
   private static final double[] field_35098 = new double[]{
      0.0,
      0.12565514F,
      0.25534195F,
      0.39362657F,
      0.54630244F,
      0.7214844F,
      0.9315965F,
      1.1974216F,
      1.5574076F,
      2.0925713F,
      3.0095696F,
      5.041915F,
      14.101419F,
      -18.430862F
   };
   private static final double[] field_35081 = new double[]{
      0.0,
      -7.877917738262007E-9,
      -2.5857668567479893E-8,
      5.2240336371356666E-9,
      5.206150291559893E-8,
      1.8307188599677033E-8,
      -5.7618793749770706E-8,
      7.848361555046424E-8,
      1.0708593250394448E-7,
      1.7827257129423813E-8,
      2.893485277253286E-8,
      3.1660099222737955E-7,
      4.983191803254889E-7,
      -3.356118100840571E-7
   };
   private static final long[] field_35089 = new long[]{
      2935890503282001226L,
      9154082963658192752L,
      3952090531849364496L,
      9193070505571053912L,
      7910884519577875640L,
      113236205062349959L,
      4577762542105553359L,
      -5034868814120038111L,
      4208363204685324176L,
      5648769086999809661L,
      2819561105158720014L,
      -4035746434778044925L,
      -302932621132653753L,
      -2644281811660520851L,
      -3183605296591799669L,
      6722166367014452318L,
      -3512299194304650054L,
      -7278142539171889152L
   };
   private static final long[] field_35102 = new long[]{-3958705157555305932L, -4267615245585081135L};
   private static final double[] field_35073 = new double[]{0.0, 0.125, 0.25, 0.375, 0.5, 0.625, 0.75, 0.875, 1.0, 1.125, 1.25, 1.375, 1.5, 1.625};
   private static final double[] field_35107 = new double[]{0.6299605249474366, 0.7937005259840998, 1.0, 1.2599210498948732, 1.5874010519681994};
   private static final long field_35067 = 1073741824L;
   private static final long field_35111 = -1073741824L;
   private static final int field_35112 = Integer.MAX_VALUE;
   private static final long field_35077 = Long.MAX_VALUE;
   private static final double field_35076 = 4.5035996E15F;
   private static final double field_35093 = 9.007199E15F;
   private static final double field_35108 = 0.3333333333333333;
   private static final double field_35109 = 0.2;
   private static final double field_35084 = 0.14285714285714285;
   private static final double field_35105 = 0.1111111111111111;
   private static final double field_35069 = 0.09090909090909091;
   private static final double field_35088 = 0.07692307692307693;
   private static final double field_35097 = 0.06666666666666667;
   private static final double field_35072 = 0.058823529411764705;
   private static final double field_35085 = 0.75;
   private static final double field_35090 = 0.9375;
   private static final double field_35092 = 0.9285714285714286;
   private static final double field_35095 = 0.9166666666666666;
   private static final double field_35078 = 0.9;
   private static final double field_35079 = 0.875;
   private static final double field_35100 = 0.8333333333333334;
   private static final double field_35110 = 0.5;
   private static final double field_35074 = 0.25;

   private class_6806() {
   }

   private static double method_31189(double var0) {
      if (var0 > -class_8056.field_41236 && var0 < class_8056.field_41236) {
         return var0;
      } else {
         long var4 = Double.doubleToRawLongBits(var0);
         var4 &= -1073741824L;
         return Double.longBitsToDouble(var4);
      }
   }

   public static double method_31206(double var0) {
      return Math.sqrt(var0);
   }

   public static double method_31192(double var0) {
      if (var0 == var0) {
         if (!(var0 > 20.0)) {
            if (!(var0 < -20.0)) {
               double[] var4 = new double[2];
               if (var0 < 0.0) {
                  var0 = -var0;
               }

               method_31218(var0, 0.0, var4);
               double var5 = var4[0] + var4[1];
               double var7 = -(var5 - var4[0] - var4[1]);
               double var9 = var5 * 1.0737418E9F;
               double var11 = var5 + var9 - var9;
               double var13 = var5 - var11;
               double var15 = 1.0 / var5;
               var9 = var15 * 1.0737418E9F;
               double var17 = var15 + var9 - var9;
               double var19 = var15 - var17;
               var19 += (1.0 - var11 * var17 - var11 * var19 - var13 * var17 - var13 * var19) * var15;
               var19 += -var7 * var15 * var15;
               var9 = var5 + var17;
               var7 += -(var9 - var5 - var17);
               double var30 = var9 + var19;
               var7 += -(var30 - var9 - var19);
               double var21 = var30 + var7;
               return var21 * 0.5;
            } else if (!(var0 <= -field_35071)) {
               return 0.5 * method_31217(-var0);
            } else {
               double var33 = method_31217(-0.5 * var0);
               return 0.5 * var33 * var33;
            }
         } else if (!(var0 >= field_35071)) {
            return 0.5 * method_31217(var0);
         } else {
            double var23 = method_31217(0.5 * var0);
            return 0.5 * var23 * var23;
         }
      } else {
         return var0;
      }
   }

   public static double method_31163(double var0) {
      boolean var4 = false;
      if (var0 == var0) {
         if (!(var0 > 20.0)) {
            if (!(var0 < -20.0)) {
               if (var0 != 0.0) {
                  if (var0 < 0.0) {
                     var0 = -var0;
                     var4 = true;
                  }

                  double var60;
                  if (!(var0 > 0.25)) {
                     double[] var5 = new double[2];
                     method_31242(var0, var5);
                     double var6 = var5[0] + var5[1];
                     double var8 = -(var6 - var5[0] - var5[1]);
                     double var10 = 1.0 + var6;
                     double var12 = 1.0 / var10;
                     double var14 = -(var10 - 1.0 - var6) + var8;
                     double var16 = var6 * var12;
                     double var18 = var16 * 1.0737418E9F;
                     double var20 = var16 + var18 - var18;
                     double var22 = var16 - var20;
                     var18 = var10 * 1.0737418E9F;
                     double var24 = var10 + var18 - var18;
                     double var26 = var10 - var24;
                     var22 += (var6 - var24 * var20 - var24 * var22 - var26 * var20 - var26 * var22) * var12;
                     var22 += var8 * var12;
                     var22 += -var6 * var14 * var12 * var12;
                     var18 = var6 + var20;
                     var8 += -(var18 - var6 - var20);
                     double var48 = var18 + var22;
                     var8 += -(var48 - var18 - var22);
                     var60 = var48 + var8;
                     var60 *= 0.5;
                  } else {
                     double[] var30 = new double[2];
                     method_31218(var0, 0.0, var30);
                     double var32 = var30[0] + var30[1];
                     double var36 = -(var32 - var30[0] - var30[1]);
                     double var39 = var32 * 1.0737418E9F;
                     double var43 = var32 + var39 - var39;
                     double var44 = var32 - var43;
                     double var45 = 1.0 / var32;
                     var39 = var45 * 1.0737418E9F;
                     double var49 = var45 + var39 - var39;
                     double var51 = var45 - var49;
                     var51 += (1.0 - var43 * var49 - var43 * var51 - var44 * var49 - var44 * var51) * var45;
                     var51 += -var36 * var45 * var45;
                     var49 = -var49;
                     var51 = -var51;
                     var39 = var32 + var49;
                     var36 += -(var39 - var32 - var49);
                     double var42 = var39 + var51;
                     var36 += -(var42 - var39 - var51);
                     var60 = var42 + var36;
                     var60 *= 0.5;
                  }

                  if (var4) {
                     var60 = -var60;
                  }

                  return var60;
               } else {
                  return var0;
               }
            } else if (!(var0 <= -field_35071)) {
               return -0.5 * method_31217(-var0);
            } else {
               double var58 = method_31217(-0.5 * var0);
               return -0.5 * var58 * var58;
            }
         } else if (!(var0 >= field_35071)) {
            return 0.5 * method_31217(var0);
         } else {
            double var28 = method_31217(0.5 * var0);
            return 0.5 * var28 * var28;
         }
      } else {
         return var0;
      }
   }

   public static double method_31182(double var0) {
      boolean var4 = false;
      if (var0 == var0) {
         if (!(var0 > 20.0)) {
            if (!(var0 < -20.0)) {
               if (var0 != 0.0) {
                  if (var0 < 0.0) {
                     var0 = -var0;
                     var4 = true;
                  }

                  double var30;
                  if (!(var0 >= 0.5)) {
                     double[] var5 = new double[2];
                     method_31242(var0 * 2.0, var5);
                     double var6 = var5[0] + var5[1];
                     double var8 = -(var6 - var5[0] - var5[1]);
                     double var14 = 2.0 + var6;
                     double var16 = -(var14 - 2.0 - var6);
                     double var18 = var14 + var8;
                     var16 += -(var18 - var14 - var8);
                     double var45 = var18 * 1.0737418E9F;
                     double var20 = var18 + var45 - var45;
                     double var22 = var18 - var20;
                     double var24 = var6 / var18;
                     double var46 = var24 * 1.0737418E9F;
                     double var26 = var24 + var46 - var46;
                     double var28 = var24 - var26;
                     var28 += (var6 - var20 * var26 - var20 * var28 - var22 * var26 - var22 * var28) / var18;
                     var28 += var8 / var18;
                     var28 += -var16 * var6 / var18 / var18;
                     var30 = var26 + var28;
                  } else {
                     double[] var32 = new double[2];
                     method_31218(var0 * 2.0, 0.0, var32);
                     double var33 = var32[0] + var32[1];
                     double var34 = -(var33 - var32[0] - var32[1]);
                     double var10 = -1.0 + var33;
                     double var12 = -(var10 + 1.0 - var33);
                     double var38 = var10 + var34;
                     var12 += -(var38 - var10 - var34);
                     double var43 = 1.0 + var33;
                     double var47 = -(var43 - 1.0 - var33);
                     double var39 = var43 + var34;
                     var47 += -(var39 - var43 - var34);
                     double var40 = var39 * 1.0737418E9F;
                     double var49 = var39 + var40 - var40;
                     double var50 = var39 - var49;
                     double var51 = var38 / var39;
                     double var41 = var51 * 1.0737418E9F;
                     double var52 = var51 + var41 - var41;
                     double var56 = var51 - var52;
                     var56 += (var38 - var49 * var52 - var49 * var56 - var50 * var52 - var50 * var56) / var39;
                     var56 += var12 / var39;
                     var56 += -var47 * var38 / var39 / var39;
                     var30 = var52 + var56;
                  }

                  if (var4) {
                     var30 = -var30;
                  }

                  return var30;
               } else {
                  return var0;
               }
            } else {
               return -1.0;
            }
         } else {
            return 1.0;
         }
      } else {
         return var0;
      }
   }

   public static double method_31204(double var0) {
      return method_31231(var0 + method_31206(var0 * var0 - 1.0));
   }

   public static double method_31167(double var0) {
      boolean var4 = false;
      if (var0 < 0.0) {
         var4 = true;
         var0 = -var0;
      }

      double var7;
      if (!(var0 > 0.167)) {
         double var5 = var0 * var0;
         if (!(var0 > 0.097)) {
            if (!(var0 > 0.036)) {
               if (!(var0 > 0.0036)) {
                  var7 = var0 * (1.0 - var5 * (0.3333333333333333 - var5 * 0.2 * 0.75) * 0.5);
               } else {
                  var7 = var0
                     * (
                        1.0
                           - var5
                              * (
                                 0.3333333333333333
                                    - var5 * (0.2 - var5 * (0.14285714285714285 - var5 * 0.1111111111111111 * 0.875) * 0.8333333333333334) * 0.75
                              )
                              * 0.5
                     );
               }
            } else {
               var7 = var0
                  * (
                     1.0
                        - var5
                           * (
                              0.3333333333333333
                                 - var5
                                    * (
                                       0.2
                                          - var5
                                             * (
                                                0.14285714285714285
                                                   - var5
                                                      * (
                                                         0.1111111111111111
                                                            - var5 * (0.09090909090909091 - var5 * 0.07692307692307693 * 0.9166666666666666) * 0.9
                                                      )
                                                      * 0.875
                                             )
                                             * 0.8333333333333334
                                    )
                                    * 0.75
                           )
                           * 0.5
                  );
            }
         } else {
            var7 = var0
               * (
                  1.0
                     - var5
                        * (
                           0.3333333333333333
                              - var5
                                 * (
                                    0.2
                                       - var5
                                          * (
                                             0.14285714285714285
                                                - var5
                                                   * (
                                                      0.1111111111111111
                                                         - var5
                                                            * (
                                                               0.09090909090909091
                                                                  - var5
                                                                     * (
                                                                        0.07692307692307693
                                                                           - var5
                                                                              * (0.06666666666666667 - var5 * 0.058823529411764705 * 0.9375)
                                                                              * 0.9285714285714286
                                                                     )
                                                                     * 0.9166666666666666
                                                            )
                                                            * 0.9
                                                   )
                                                   * 0.875
                                          )
                                          * 0.8333333333333334
                                 )
                                 * 0.75
                        )
                        * 0.5
               );
         }
      } else {
         var7 = method_31231(method_31206(var0 * var0 + 1.0) + var0);
      }

      return !var4 ? var7 : -var7;
   }

   public static double method_31185(double var0) {
      boolean var4 = false;
      if (var0 < 0.0) {
         var4 = true;
         var0 = -var0;
      }

      double var7;
      if (!(var0 > 0.15)) {
         double var5 = var0 * var0;
         if (!(var0 > 0.087)) {
            if (!(var0 > 0.031)) {
               if (!(var0 > 0.003)) {
                  var7 = var0 * (1.0 + var5 * (0.3333333333333333 + var5 * 0.2));
               } else {
                  var7 = var0 * (1.0 + var5 * (0.3333333333333333 + var5 * (0.2 + var5 * (0.14285714285714285 + var5 * 0.1111111111111111))));
               }
            } else {
               var7 = var0
                  * (
                     1.0
                        + var5
                           * (
                              0.3333333333333333
                                 + var5
                                    * (
                                       0.2
                                          + var5
                                             * (0.14285714285714285 + var5 * (0.1111111111111111 + var5 * (0.09090909090909091 + var5 * 0.07692307692307693)))
                                    )
                           )
                  );
            }
         } else {
            var7 = var0
               * (
                  1.0
                     + var5
                        * (
                           0.3333333333333333
                              + var5
                                 * (
                                    0.2
                                       + var5
                                          * (
                                             0.14285714285714285
                                                + var5
                                                   * (
                                                      0.1111111111111111
                                                         + var5
                                                            * (
                                                               0.09090909090909091
                                                                  + var5 * (0.07692307692307693 + var5 * (0.06666666666666667 + var5 * 0.058823529411764705))
                                                            )
                                                   )
                                          )
                                 )
                        )
               );
         }
      } else {
         var7 = 0.5 * method_31231((1.0 + var0) / (1.0 - var0));
      }

      return !var4 ? var7 : -var7;
   }

   public static double method_31168(double var0) {
      return !(var0 < 0.0) ? (!(var0 > 0.0) ? var0 : 1.0) : -1.0;
   }

   public static float method_31169(float var0) {
      return !(var0 < 0.0F) ? (!(var0 > 0.0F) ? var0 : 1.0F) : -1.0F;
   }

   public static double method_31207(double var0) {
      return method_31221(var0, Double.POSITIVE_INFINITY);
   }

   public static float method_31208(float var0) {
      return method_31222(var0, Double.POSITIVE_INFINITY);
   }

   public static double method_31227(double var0) {
      return method_31221(var0, Double.NEGATIVE_INFINITY);
   }

   public static float method_31228(float var0) {
      return method_31222(var0, Double.NEGATIVE_INFINITY);
   }

   public static double method_31234() {
      return Math.random();
   }

   public static double method_31217(double var0) {
      return method_31218(var0, 0.0, null);
   }

   private static double method_31218(double var0, double var2, double[] var4) {
      int var7 = (int)var0;
      if (!(var0 < 0.0)) {
         if (var7 > 709) {
            if (var4 != null) {
               var4[0] = Double.POSITIVE_INFINITY;
               var4[1] = 0.0;
            }

            return Double.POSITIVE_INFINITY;
         }
      } else {
         if (var0 < -746.0) {
            if (var4 != null) {
               var4[0] = 0.0;
               var4[1] = 0.0;
            }

            return 0.0;
         }

         if (var7 < -709) {
            double var35 = method_31218(var0 + 40.191406F, var2, var4) / 2.8504009514401178E17;
            if (var4 != null) {
               var4[0] /= 2.8504009514401178E17;
               var4[1] /= 2.8504009514401178E17;
            }

            return var35;
         }

         if (var7 == -709) {
            double var29 = method_31218(var0 + 1.4941406F, var2, var4) / 4.455505956692757;
            if (var4 != null) {
               var4[0] /= 4.455505956692757;
               var4[1] /= 4.455505956692757;
            }

            return var29;
         }

         var7--;
      }

      double var8 = class_8787.method_40385()[750 + var7];
      double var10 = class_8787.method_40384()[750 + var7];
      int var12 = (int)((var0 - (double)var7) * 1024.0);
      double var13 = class_4142.method_19221()[var12];
      double var15 = class_4142.method_19220()[var12];
      double var17 = var0 - ((double)var7 + (double)var12 / 1024.0);
      double var19 = 0.04168701738764507;
      var19 = var19 * var17 + 0.1666666505023083;
      var19 = var19 * var17 + 0.5000000000042687;
      var19 = var19 * var17 + 1.0;
      var19 = var19 * var17 + -3.940510424527919E-20;
      double var21 = var8 * var13;
      double var23 = var8 * var15 + var10 * var13 + var10 * var15;
      double var25 = var23 + var21;
      double var27;
      if (var2 == 0.0) {
         var27 = var25 * var19 + var23 + var21;
      } else {
         var27 = var25 * var2 * var19 + var25 * var2 + var25 * var19 + var23 + var21;
      }

      if (var4 != null) {
         var4[0] = var21;
         var4[1] = var25 * var2 * var19 + var25 * var2 + var25 * var19 + var23;
      }

      return var27;
   }

   public static double method_31241(double var0) {
      return method_31242(var0, null);
   }

   private static double method_31242(double var0, double[] var2) {
      if (var0 != var0 || var0 == 0.0) {
         return var0;
      } else if (!(var0 <= -1.0) && !(var0 >= 1.0)) {
         boolean var10 = false;
         if (var0 < 0.0) {
            var0 = -var0;
            var10 = true;
         }

         int var11 = (int)(var0 * 1024.0);
         double var12 = class_4142.method_19221()[var11] - 1.0;
         double var14 = class_4142.method_19220()[var11];
         double var16 = var12 + var14;
         var14 = -(var16 - var12 - var14);
         double var49 = var16 * 1.0737418E9F;
         double var18 = var16 + var49 - var49;
         double var20 = var14 + (var16 - var18);
         double var22 = var0 - (double)var11 / 1024.0;
         double var24 = 0.008336750013465571;
         var24 = var24 * var22 + 0.041666663879186654;
         var24 = var24 * var22 + 0.16666666666745392;
         var24 = var24 * var22 + 0.49999999999999994;
         var24 *= var22;
         var24 *= var22;
         double var28 = var22 + var24;
         var24 = -(var28 - var22 - var24);
         double var60 = var28 * 1.0737418E9F;
         double var61 = var28 + var60 - var60;
         var24 += var28 - var61;
         double var30 = var61 * var18;
         var28 = var30 + var61 * var20;
         double var32 = -(var28 - var30 - var61 * var20);
         double var63 = var28 + var24 * var18;
         var32 += -(var63 - var28 - var24 * var18);
         var28 = var63 + var24 * var20;
         var32 += -(var28 - var63 - var24 * var20);
         double var65 = var28 + var18;
         var32 += -(var65 - var18 - var28);
         var28 = var65 + var61;
         var32 += -(var28 - var65 - var61);
         double var67 = var28 + var20;
         var32 += -(var67 - var28 - var20);
         var28 = var67 + var24;
         var32 += -(var28 - var67 - var24);
         var30 = var28;
         if (var10) {
            double var34 = 1.0 + var28;
            double var36 = 1.0 / var34;
            double var38 = -(var34 - 1.0 - var28) + var32;
            double var40 = var28 * var36;
            double var69 = var40 * 1.0737418E9F;
            double var42 = var40 + var69 - var69;
            double var44 = var40 - var42;
            double var70 = var34 * 1.0737418E9F;
            double var59 = var34 + var70 - var70;
            var24 = var34 - var59;
            var44 += (var28 - var59 * var42 - var59 * var44 - var24 * var42 - var24 * var44) * var36;
            var44 += var32 * var36;
            var44 += -var28 * var38 * var36 * var36;
            var30 = -var42;
            var32 = -var44;
         }

         if (var2 != null) {
            var2[0] = var30;
            var2[1] = var32;
         }

         return var30 + var32;
      } else {
         double[] var5 = new double[2];
         method_31218(var0, 0.0, var5);
         if (!(var0 > 0.0)) {
            double var6 = -1.0 + var5[0];
            double var8 = -(var6 + 1.0 - var5[0]);
            var8 += var5[1];
            return var6 + var8;
         } else {
            return -1.0 + var5[0] + var5[1];
         }
      }
   }

   public static double method_31231(double var0) {
      return method_31233(var0, null);
   }

   private static double method_31233(double var0, double[] var2) {
      if (var0 == 0.0) {
         return Double.NEGATIVE_INFINITY;
      } else {
         long var5 = Double.doubleToRawLongBits(var0);
         if (((var5 & Long.MIN_VALUE) != 0L || var0 != var0) && var0 != 0.0) {
            if (var2 != null) {
               var2[0] = Double.NaN;
            }

            return Double.NaN;
         } else if (var0 == Double.POSITIVE_INFINITY) {
            if (var2 != null) {
               var2[0] = Double.POSITIVE_INFINITY;
            }

            return Double.POSITIVE_INFINITY;
         } else {
            int var7 = (int)(var5 >> 52) - 1023;
            if ((var5 & 9218868437227405312L) == 0L) {
               if (var0 == 0.0) {
                  if (var2 != null) {
                     var2[0] = Double.NEGATIVE_INFINITY;
                  }

                  return Double.NEGATIVE_INFINITY;
               }

               for (var5 <<= 1; (var5 & 4503599627370496L) == 0L; var5 <<= 1) {
                  var7--;
               }
            }

            if ((var7 == -1 || var7 == 0) && var0 < 1.01 && var0 > 0.99 && var2 == null) {
               double var15 = var0 - 1.0;
               double var17 = var15 - var0 + 1.0;
               double var19 = var15 * 1.0737418E9F;
               double var21 = var15 + var19 - var19;
               double var23 = var15 - var21;
               var15 = var21;
               var17 = var23;
               double[] var25 = field_35075[field_35075.length - 1];
               double var75 = var25[0];
               double var83 = var25[1];

               for (int var30 = field_35075.length - 2; var30 >= 0; var30--) {
                  var21 = var75 * var15;
                  var23 = var75 * var17 + var83 * var15 + var83 * var17;
                  var19 = var21 * 1.0737418E9F;
                  double var76 = var21 + var19 - var19;
                  var83 = var21 - var76 + var23;
                  double[] var31 = field_35075[var30];
                  var21 = var76 + var31[0];
                  var23 = var83 + var31[1];
                  var19 = var21 * 1.0737418E9F;
                  var75 = var21 + var19 - var19;
                  var83 = var21 - var75 + var23;
               }

               var21 = var75 * var15;
               var23 = var75 * var17 + var83 * var15 + var83 * var17;
               var19 = var21 * 1.0737418E9F;
               var75 = var21 + var19 - var19;
               var83 = var21 - var75 + var23;
               return var75 + var83;
            } else {
               double[] var8 = class_2037.method_9556()[(int)((var5 & 4499201580859392L) >> 42)];
               double var9 = (double)(var5 & 4398046511103L) / (4.5035996E15F + (double)(var5 & 4499201580859392L));
               double var11 = 0.0;
               double var13 = 0.0;
               if (var2 == null) {
                  var11 = -0.16624882440418567;
                  var11 = var11 * var9 + 0.19999954120254515;
                  var11 = var11 * var9 + -0.2499999997677497;
                  var11 = var11 * var9 + 0.3333333333332802;
                  var11 = var11 * var9 + -0.5;
                  var11 = var11 * var9 + 1.0;
                  var11 *= var9;
               } else {
                  double var32 = var9 * 1.0737418E9F;
                  double var34 = var9 + var32 - var32;
                  double var26 = var9 - var34;
                  double var28 = var34;
                  double var38 = (double)(var5 & 4398046511103L);
                  double var40 = 4.5035996E15F + (double)(var5 & 4499201580859392L);
                  var34 = var38 - var34 * var40 - var26 * var40;
                  double var36 = var26 + var34 / var40;
                  double[] var42 = field_35068[field_35068.length - 1];
                  double var43 = var42[0];
                  double var45 = var42[1];

                  for (int var47 = field_35068.length - 2; var47 >= 0; var47--) {
                     var34 = var43 * var28;
                     var26 = var43 * var36 + var45 * var28 + var45 * var36;
                     var32 = var34 * 1.0737418E9F;
                     double var103 = var34 + var32 - var32;
                     var45 = var34 - var103 + var26;
                     double[] var48 = field_35068[var47];
                     var34 = var103 + var48[0];
                     var26 = var45 + var48[1];
                     var32 = var34 * 1.0737418E9F;
                     var43 = var34 + var32 - var32;
                     var45 = var34 - var43 + var26;
                  }

                  var34 = var43 * var28;
                  var26 = var43 * var36 + var45 * var28 + var45 * var36;
                  var11 = var34 + var26;
                  var13 = -(var11 - var34 - var26);
               }

               double var88 = 0.69314706F * (double)var7;
               double var97 = 0.0;
               double var70 = var88 + var8[0];
               double var78 = -(var70 - var88 - var8[0]);
               var97 += var78;
               double var71 = var70 + var11;
               var78 = -(var71 - var70 - var11);
               var97 += var78;
               var70 = var71 + 1.1730463525082348E-7 * (double)var7;
               var78 = -(var70 - var71 - 1.1730463525082348E-7 * (double)var7);
               var97 += var78;
               double var73 = var70 + var8[1];
               var78 = -(var73 - var70 - var8[1]);
               var97 += var78;
               var70 = var73 + var13;
               var78 = -(var70 - var73 - var13);
               var97 += var78;
               if (var2 != null) {
                  var2[0] = var70;
                  var2[1] = var97;
               }

               return var70 + var97;
            }
         }
      }
   }

   public static double method_31214(double var0) {
      if (var0 != -1.0) {
         if (var0 != Double.POSITIVE_INFINITY) {
            if (!(var0 > 1.0E-6) && !(var0 < -1.0E-6)) {
               double var15 = (var0 * 0.3333333333333333 - 0.5) * var0 + 1.0;
               return var15 * var0;
            } else {
               double var4 = 1.0 + var0;
               double var6 = -(var4 - 1.0 - var0);
               double[] var8 = new double[2];
               double var9 = method_31233(var4, var8);
               if (!Double.isInfinite(var9)) {
                  double var11 = var6 / var4;
                  double var13 = 0.5 * var11 + 1.0;
                  return var13 * var11 + var8[1] + var8[0];
               } else {
                  return var9;
               }
            }
         } else {
            return Double.POSITIVE_INFINITY;
         }
      } else {
         return Double.NEGATIVE_INFINITY;
      }
   }

   public static double method_31210(double var0) {
      double[] var4 = new double[2];
      double var5 = method_31233(var0, var4);
      if (!Double.isInfinite(var5)) {
         double var7 = var4[0] * 1.0737418E9F;
         double var9 = var4[0] + var7 - var7;
         double var11 = var4[0] - var9 + var4[1];
         double var13 = 0.43429446F;
         double var15 = 1.9699272335463627E-8;
         return 1.9699272335463627E-8 * var11 + 1.9699272335463627E-8 * var9 + 0.43429446F * var11 + 0.43429446F * var9;
      } else {
         return var5;
      }
   }

   public static double method_31232(double var0, double var2) {
      return method_31231(var2) / method_31231(var0);
   }

   public static double method_31237(double var0, double var2) {
      double[] var6 = new double[2];
      if (var2 != 0.0) {
         if (var0 != var0) {
            return var0;
         } else if (var0 != 0.0) {
            if (var0 == Double.POSITIVE_INFINITY) {
               if (var2 == var2) {
                  return !(var2 < 0.0) ? Double.POSITIVE_INFINITY : 0.0;
               } else {
                  return var2;
               }
            } else if (var2 != Double.POSITIVE_INFINITY) {
               if (var0 == Double.NEGATIVE_INFINITY) {
                  if (var2 != var2) {
                     return var2;
                  }

                  if (var2 < 0.0) {
                     long var35 = (long)var2;
                     if (var2 == (double)var35 && (var35 & 1L) == 1L) {
                        return -0.0;
                     }

                     return 0.0;
                  }

                  if (var2 > 0.0) {
                     long var34 = (long)var2;
                     if (var2 == (double)var34 && (var34 & 1L) == 1L) {
                        return Double.NEGATIVE_INFINITY;
                     }

                     return Double.POSITIVE_INFINITY;
                  }
               }

               if (var2 != Double.NEGATIVE_INFINITY) {
                  if (var0 < 0.0) {
                     if (var2 >= 9.007199E15F || var2 <= -9.007199E15F) {
                        return method_31237(-var0, var2);
                     } else if (var2 != (double)((long)var2)) {
                        return Double.NaN;
                     } else {
                        return ((long)var2 & 1L) != 0L ? -method_31237(-var0, var2) : method_31237(-var0, var2);
                     }
                  } else {
                     double var33;
                     double var36;
                     if (var2 < 8.0E298 && var2 > -8.0E298) {
                        double var29 = var2 * 1.0737418E9F;
                        var33 = var2 + var29 - var29;
                        var36 = var2 - var33;
                     } else {
                        double var7 = var2 * 9.313226E-10F;
                        double var9 = var7 * 9.313226E-10F;
                        var33 = (var7 + var9 - var7) * 1.0737418E9F * 1.0737418E9F;
                        var36 = var2 - var33;
                     }

                     double var30 = method_31233(var0, var6);
                     if (!Double.isInfinite(var30)) {
                        double var31 = var6[0];
                        double var15 = var6[1];
                        double var17 = var31 * 1.0737418E9F;
                        double var19 = var31 + var17 - var17;
                        var15 += var31 - var19;
                        double var21 = var19 * var33;
                        double var23 = var19 * var36 + var15 * var33 + var15 * var36;
                        var31 = var21 + var23;
                        var15 = -(var31 - var21 - var23);
                        double var25 = 0.008333333333333333;
                        var25 = var25 * var15 + 0.041666666666666664;
                        var25 = var25 * var15 + 0.16666666666666666;
                        var25 = var25 * var15 + 0.5;
                        var25 = var25 * var15 + 1.0;
                        var25 *= var15;
                        return method_31218(var31, var25, null);
                     } else {
                        return var30;
                     }
                  }
               } else if (var0 * var0 != 1.0) {
                  return !(var0 * var0 < 1.0) ? 0.0 : Double.POSITIVE_INFINITY;
               } else {
                  return Double.NaN;
               }
            } else if (var0 * var0 != 1.0) {
               return !(var0 * var0 > 1.0) ? 0.0 : Double.POSITIVE_INFINITY;
            } else {
               return Double.NaN;
            }
         } else {
            long var11 = Double.doubleToRawLongBits(var0);
            if ((var11 & Long.MIN_VALUE) != 0L) {
               long var13 = (long)var2;
               if (var2 < 0.0 && var2 == (double)var13 && (var13 & 1L) == 1L) {
                  return Double.NEGATIVE_INFINITY;
               }

               if (var2 > 0.0 && var2 == (double)var13 && (var13 & 1L) == 1L) {
                  return -0.0;
               }
            }

            if (!(var2 < 0.0)) {
               return !(var2 > 0.0) ? Double.NaN : 0.0;
            } else {
               return Double.POSITIVE_INFINITY;
            }
         }
      } else {
         return 1.0;
      }
   }

   public static double method_31238(double var0, int var2) {
      if (var2 != 0) {
         if (var2 < 0) {
            var2 = -var2;
            var0 = 1.0 / var0;
         }

         double var6 = 1.34217729E8 * var0;
         double var8 = var6 - (var6 - var0);
         double var10 = var0 - var8;
         double var12 = 1.0;
         double var14 = 0.0;
         double var16 = var0;
         double var18 = var8;

         for (double var20 = var10; var2 != 0; var2 >>= 1) {
            if ((var2 & 1) != 0) {
               double var22 = var12 * var16;
               double var24 = 1.34217729E8 * var12;
               double var26 = var24 - (var24 - var12);
               double var28 = var12 - var26;
               double var30 = var28 * var20 - (var22 - var26 * var18 - var28 * var18 - var26 * var20);
               var12 = var22;
               var14 = var14 * var16 + var30;
            }

            double var34 = var18 * var16;
            double var35 = 1.34217729E8 * var18;
            double var36 = var35 - (var35 - var18);
            double var37 = var18 - var36;
            double var38 = var37 * var20 - (var34 - var36 * var18 - var37 * var18 - var36 * var20);
            double var32 = 1.34217729E8 * var34;
            var18 = var32 - (var32 - var34);
            var20 = var20 * var16 + var38 + (var34 - var18);
            var16 = var18 + var20;
         }

         return var12 + var14;
      } else {
         return 1.0;
      }
   }

   private static double method_31212(double var0) {
      double var4 = var0 * var0;
      double var6 = 2.7553817452272217E-6;
      var6 = var6 * var4 + -1.9841269659586505E-4;
      var6 = var6 * var4 + 0.008333333333329196;
      var6 = var6 * var4 + -0.16666666666666666;
      return var6 * var4 * var0;
   }

   private static double method_31203(double var0) {
      double var4 = var0 * var0;
      double var6 = 2.479773539153719E-5;
      var6 = var6 * var4 + -0.0013888888689039883;
      var6 = var6 * var4 + 0.041666666666621166;
      var6 = var6 * var4 + -0.49999999999999994;
      return var6 * var4;
   }

   private static double method_31177(double var0, double var2) {
      int var6 = (int)(var0 * 8.0 + 0.5);
      double var7 = var0 - field_35073[var6];
      double var9 = field_35101[var6];
      double var11 = field_35099[var6];
      double var13 = field_35103[var6];
      double var15 = field_35086[var6];
      double var19 = method_31212(var7);
      double var21 = 1.0;
      double var23 = method_31203(var7);
      double var25 = var7 * 1.0737418E9F;
      double var27 = var7 + var25 - var25;
      var19 += var7 - var27;
      double var29 = 0.0;
      double var31 = 0.0;
      double var35 = var29 + var9;
      double var37 = -(var35 - var29 - var9);
      var31 += var37;
      double var33 = var13 * var27;
      double var49 = var35 + var33;
      var37 = -(var49 - var35 - var33);
      var29 = var49;
      var31 += var37;
      var31 = var31 + var9 * var23 + var13 * var19;
      var31 = var31 + var11 + var15 * var27 + var11 * var23 + var15 * var19;
      if (var2 != 0.0) {
         var33 = ((var13 + var15) * (1.0 + var23) - (var9 + var11) * (var27 + var19)) * var2;
         var35 = var49 + var33;
         var37 = -(var35 - var49 - var33);
         var29 = var35;
         var31 += var37;
      }

      return var29 + var31;
   }

   private static double method_31216(double var0, double var2) {
      double var6 = Math.PI / 2;
      double var8 = 6.123233995736766E-17;
      double var10 = (Math.PI / 2) - var0;
      double var12 = -(var10 - (Math.PI / 2) + var0);
      var12 += 6.123233995736766E-17 - var2;
      return method_31177(var10, var12);
   }

   private static double method_31160(double var0, double var2, boolean var4) {
      int var7 = (int)(var0 * 8.0 + 0.5);
      double var8 = var0 - field_35073[var7];
      double var10 = field_35101[var7];
      double var12 = field_35099[var7];
      double var14 = field_35103[var7];
      double var16 = field_35086[var7];
      double var20 = method_31212(var8);
      double var22 = 1.0;
      double var24 = method_31203(var8);
      double var26 = var8 * 1.0737418E9F;
      double var28 = var8 + var26 - var26;
      var20 += var8 - var28;
      double var30 = 0.0;
      double var32 = 0.0;
      double var36 = var30 + var10;
      double var38 = -(var36 - var30 - var10);
      var32 += var38;
      double var34 = var14 * var28;
      double var79 = var36 + var34;
      var38 = -(var79 - var36 - var34);
      var32 += var38;
      var32 += var10 * var24 + var14 * var20;
      var32 += var12 + var16 * var28 + var12 * var24 + var16 * var20;
      double var40 = var79 + var32;
      double var42 = -(var40 - var79 - var32);
      var38 = 0.0;
      var36 = 0.0;
      var32 = 0.0;
      var30 = 0.0;
      var34 = var14 * 1.0;
      var36 = var30 + var34;
      var38 = -(var36 - var30 - var34);
      var32 += var38;
      var34 = -var10 * var28;
      double var82 = var36 + var34;
      var38 = -(var82 - var36 - var34);
      var32 += var38;
      var32 += var16 * 1.0 + var14 * var24 + var16 * var24;
      var32 -= var12 * var28 + var10 * var20 + var12 * var20;
      double var44 = var82 + var32;
      double var46 = -(var44 - var82 - var32);
      if (var4) {
         double var48 = var44;
         var44 = var40;
         var40 = var48;
         var48 = var46;
         var46 = var42;
         var42 = var48;
      }

      double var88 = var40 / var44;
      var26 = var88 * 1.0737418E9F;
      double var50 = var88 + var26 - var26;
      double var52 = var88 - var50;
      var26 = var44 * 1.0737418E9F;
      double var54 = var44 + var26 - var26;
      double var56 = var44 - var54;
      double var58 = (var40 - var50 * var54 - var50 * var56 - var52 * var54 - var52 * var56) / var44;
      var58 += var42 / var44;
      var58 += -var40 * var46 / var44 / var44;
      if (var2 != 0.0) {
         double var60 = var2 + var88 * var88 * var2;
         if (var4) {
            var60 = -var60;
         }

         var58 += var60;
      }

      return var88 + var58;
   }

   private static void method_31202(double var0, double[] var2) {
      long var5 = Double.doubleToRawLongBits(var0);
      int var7 = (int)(var5 >> 52 & 2047L) - 1023;
      var5 &= 4503599627370495L;
      var5 |= 4503599627370496L;
      var7++;
      var5 <<= 11;
      int var8 = var7 >> 6;
      int var9 = var7 - (var8 << 6);
      long var10;
      long var12;
      long var14;
      if (var9 == 0) {
         var10 = var8 != 0 ? field_35089[var8 - 1] : 0L;
         var12 = field_35089[var8];
         var14 = field_35089[var8 + 1];
      } else {
         var10 = var8 != 0 ? field_35089[var8 - 1] << var9 : 0L;
         var10 |= field_35089[var8] >>> 64 - var9;
         var12 = field_35089[var8] << var9 | field_35089[var8 + 1] >>> 64 - var9;
         var14 = field_35089[var8 + 1] << var9 | field_35089[var8 + 2] >>> 64 - var9;
      }

      long var16 = var5 >>> 32;
      long var18 = var5 & 4294967295L;
      long var20 = var12 >>> 32;
      long var22 = var12 & 4294967295L;
      long var24 = var16 * var20;
      long var26 = var18 * var22;
      long var28 = var18 * var20;
      long var30 = var16 * var22;
      long var32 = var26 + (var30 << 32);
      long var34 = var24 + (var30 >>> 32);
      boolean var36 = (var26 & Long.MIN_VALUE) != 0L;
      boolean var37 = (var30 & 2147483648L) != 0L;
      boolean var38 = (var32 & Long.MIN_VALUE) != 0L;
      if (var36 && var37 || (var36 || var37) && !var38) {
         var34++;
      }

      var36 = (var32 & Long.MIN_VALUE) != 0L;
      var37 = (var28 & 2147483648L) != 0L;
      var32 += var28 << 32;
      var34 += var28 >>> 32;
      var38 = (var32 & Long.MIN_VALUE) != 0L;
      if (var36 && var37 || (var36 || var37) && !var38) {
         var34++;
      }

      var20 = var14 >>> 32;
      var22 = var14 & 4294967295L;
      var24 = var16 * var20;
      var28 = var18 * var20;
      var30 = var16 * var22;
      var24 += var28 + var30 >>> 32;
      var36 = (var32 & Long.MIN_VALUE) != 0L;
      var37 = (var24 & Long.MIN_VALUE) != 0L;
      var32 += var24;
      var38 = (var32 & Long.MIN_VALUE) != 0L;
      if (var36 && var37 || (var36 || var37) && !var38) {
         var34++;
      }

      var20 = var10 >>> 32;
      var22 = var10 & 4294967295L;
      var26 = var18 * var22;
      var28 = var18 * var20;
      var30 = var16 * var22;
      var34 += var26 + (var28 + var30 << 32);
      int var39 = (int)(var34 >>> 62);
      var34 <<= 2;
      var34 |= var32 >>> 62;
      var32 <<= 2;
      var16 = var34 >>> 32;
      var18 = var34 & 4294967295L;
      var20 = field_35102[0] >>> 32;
      var22 = field_35102[0] & 4294967295L;
      var24 = var16 * var20;
      var26 = var18 * var22;
      var28 = var18 * var20;
      var30 = var16 * var22;
      long var40 = var26 + (var30 << 32);
      long var42 = var24 + (var30 >>> 32);
      var36 = (var26 & Long.MIN_VALUE) != 0L;
      var37 = (var30 & 2147483648L) != 0L;
      var38 = (var40 & Long.MIN_VALUE) != 0L;
      if (var36 && var37 || (var36 || var37) && !var38) {
         var42++;
      }

      var36 = (var40 & Long.MIN_VALUE) != 0L;
      var37 = (var28 & 2147483648L) != 0L;
      var40 += var28 << 32;
      var42 += var28 >>> 32;
      var38 = (var40 & Long.MIN_VALUE) != 0L;
      if (var36 && var37 || (var36 || var37) && !var38) {
         var42++;
      }

      var20 = field_35102[1] >>> 32;
      var22 = field_35102[1] & 4294967295L;
      var24 = var16 * var20;
      var28 = var18 * var20;
      var30 = var16 * var22;
      var24 += var28 + var30 >>> 32;
      var36 = (var40 & Long.MIN_VALUE) != 0L;
      var37 = (var24 & Long.MIN_VALUE) != 0L;
      var40 += var24;
      var38 = (var40 & Long.MIN_VALUE) != 0L;
      if (var36 && var37 || (var36 || var37) && !var38) {
         var42++;
      }

      var16 = var32 >>> 32;
      var18 = var32 & 4294967295L;
      var20 = field_35102[0] >>> 32;
      var22 = field_35102[0] & 4294967295L;
      var24 = var16 * var20;
      var28 = var18 * var20;
      var30 = var16 * var22;
      var24 += var28 + var30 >>> 32;
      var36 = (var40 & Long.MIN_VALUE) != 0L;
      var37 = (var24 & Long.MIN_VALUE) != 0L;
      var40 += var24;
      var38 = (var40 & Long.MIN_VALUE) != 0L;
      if (var36 && var37 || (var36 || var37) && !var38) {
         var42++;
      }

      double var44 = (double)(var42 >>> 12) / 4.5035996E15F;
      double var46 = (double)(((var42 & 4095L) << 40) + (var40 >>> 24)) / 4.5035996E15F / 4.5035996E15F;
      double var48 = var44 + var46;
      double var50 = -(var48 - var44 - var46);
      var2[0] = (double)var39;
      var2[1] = var48 * 2.0;
      var2[2] = var50 * 2.0;
   }

   public static double method_31165(double var0) {
      boolean var4 = false;
      int var5 = 0;
      double var6 = 0.0;
      double var8 = var0;
      if (var0 < 0.0) {
         var4 = true;
         var8 = -var0;
      }

      if (var8 == 0.0) {
         long var10 = Double.doubleToRawLongBits(var0);
         return var10 < 0L ? -0.0 : 0.0;
      } else if (var8 == var8 && var8 != Double.POSITIVE_INFINITY) {
         if (var8 > 3294198.0) {
            double[] var12 = new double[3];
            method_31202(var8, var12);
            var5 = (int)var12[0] & 3;
            var8 = var12[1];
            var6 = var12[2];
         } else if (var8 > Math.PI / 2) {
            class_6793 var13 = new class_6793(var8);
            var5 = var13.method_31139() & 3;
            var8 = var13.method_31138();
            var6 = var13.method_31136();
         }

         if (var4) {
            var5 ^= 2;
         }

         switch (var5) {
            case 0:
               return method_31177(var8, var6);
            case 1:
               return method_31216(var8, var6);
            case 2:
               return -method_31177(var8, var6);
            case 3:
               return -method_31216(var8, var6);
            default:
               return Double.NaN;
         }
      } else {
         return Double.NaN;
      }
   }

   public static double method_31223(double var0) {
      int var4 = 0;
      double var5 = var0;
      if (var0 < 0.0) {
         var5 = -var0;
      }

      if (var5 == var5 && var5 != Double.POSITIVE_INFINITY) {
         double var7 = 0.0;
         if (var5 > 3294198.0) {
            double[] var9 = new double[3];
            method_31202(var5, var9);
            var4 = (int)var9[0] & 3;
            var5 = var9[1];
            var7 = var9[2];
         } else if (var5 > Math.PI / 2) {
            class_6793 var10 = new class_6793(var5);
            var4 = var10.method_31139() & 3;
            var5 = var10.method_31138();
            var7 = var10.method_31136();
         }

         switch (var4) {
            case 0:
               return method_31216(var5, var7);
            case 1:
               return -method_31177(var5, var7);
            case 2:
               return -method_31216(var5, var7);
            case 3:
               return method_31177(var5, var7);
            default:
               return Double.NaN;
         }
      } else {
         return Double.NaN;
      }
   }

   public static double method_31199(double var0) {
      boolean var4 = false;
      int var5 = 0;
      double var6 = var0;
      if (var0 < 0.0) {
         var4 = true;
         var6 = -var0;
      }

      if (var6 != 0.0) {
         if (var6 == var6 && var6 != Double.POSITIVE_INFINITY) {
            double var19 = 0.0;
            if (!(var6 > 3294198.0)) {
               if (var6 > Math.PI / 2) {
                  class_6793 var12 = new class_6793(var6);
                  var5 = var12.method_31139() & 3;
                  var6 = var12.method_31138();
                  var19 = var12.method_31136();
               }
            } else {
               double[] var21 = new double[3];
               method_31202(var6, var21);
               var5 = (int)var21[0] & 3;
               var6 = var21[1];
               var19 = var21[2];
            }

            if (var6 > 1.5) {
               double var10 = Math.PI / 2;
               double var13 = 6.123233995736766E-17;
               double var15 = (Math.PI / 2) - var6;
               double var17 = -(var15 - (Math.PI / 2) + var6);
               var17 += 6.123233995736766E-17 - var19;
               var6 = var15 + var17;
               var19 = -(var6 - var15 - var17);
               var5 ^= 1;
               var4 ^= true;
            }

            double var20;
            if ((var5 & 1) != 0) {
               var20 = -method_31160(var6, var19, true);
            } else {
               var20 = method_31160(var6, var19, false);
            }

            if (var4) {
               var20 = -var20;
            }

            return var20;
         } else {
            return Double.NaN;
         }
      } else {
         long var8 = Double.doubleToRawLongBits(var0);
         return var8 >= 0L ? 0.0 : -0.0;
      }
   }

   public static double method_31170(double var0) {
      return method_31171(var0, 0.0, false);
   }

   private static double method_31171(double var0, double var2, boolean var4) {
      if (var0 != 0.0) {
         boolean var7;
         if (!(var0 < 0.0)) {
            var7 = false;
         } else {
            var0 = -var0;
            var2 = -var2;
            var7 = true;
         }

         if (!(var0 > 1.633123935319537E16)) {
            int var10;
            if (!(var0 < 1.0)) {
               double var8 = 1.0 / var0;
               var10 = (int)(-((-1.7168146928204135 * var8 * var8 + 8.0) * var8) + 13.07);
            } else {
               var10 = (int)((-1.7168146928204135 * var0 * var0 + 8.0) * var0 + 0.5);
            }

            double var40 = field_35098[var10];
            double var11 = field_35081[var10];
            double var13 = var0 - var40;
            double var15 = -(var13 - var0 + var40);
            var15 += var2 - var11;
            double var17 = var13 + var15;
            var15 = -(var17 - var13 - var15);
            var17 = var0 * 1.0737418E9F;
            double var19 = var0 + var17 - var17;
            double var21 = var2 + var0 - var19;
            var2 += var21;
            if (var10 != 0) {
               double var23 = var19 * var40;
               double var25 = 1.0 + var23;
               double var27 = -(var25 - 1.0 - var23);
               var23 = var2 * var40 + var19 * var11;
               double var46 = var25 + var23;
               var27 += -(var46 - var25 - var23);
               var27 += var2 * var11;
               var19 = var17 / var46;
               double var47 = var19 * 1.0737418E9F;
               double var29 = var19 + var47 - var47;
               double var31 = var19 - var29;
               double var48 = var46 * 1.0737418E9F;
               double var33 = var46 + var48 - var48;
               double var35 = var46 - var33;
               var21 = (var17 - var29 * var33 - var29 * var35 - var31 * var33 - var31 * var35) / var46;
               var21 += -var17 * var27 / var46 / var46;
               var21 += var15 / var46;
            } else {
               double var65 = 1.0 / (1.0 + (var19 + var2) * (var40 + var11));
               var19 = var17 * var65;
               var21 = var15 * var65;
            }

            double var66 = var19 * var19;
            double var55 = 0.07490822288864472;
            double var56 = var55 * var66 - 0.09088450866185192;
            double var57 = var56 * var66 + 0.11111095942313305;
            double var58 = var57 * var66 - 0.1428571423679182;
            double var59 = var58 * var66 + 0.19999999999923582;
            double var60 = var59 * var66 - 0.33333333333333287;
            double var61 = var60 * var66 * var19;
            var17 = var19 + var61;
            double var62 = -(var17 - var19 - var61);
            var21 = var62 + var21 / (1.0 + var19 * var19);
            double var68 = field_35073[var10];
            double var71 = var68 + var17;
            double var73 = -(var71 - var68 - var17);
            var17 = var71 + var21;
            var73 += -(var17 - var71 - var21);
            double var77 = var17 + var73;
            if (var4) {
               double var78 = -(var77 - var17 - var73);
               double var79 = Math.PI;
               double var37 = 1.2246467991473532E-16;
               var71 = Math.PI - var77;
               var73 = -(var71 - Math.PI + var77);
               var73 += 1.2246467991473532E-16 - var78;
               var77 = var71 + var73;
            }

            if (var7 ^ var4) {
               var77 = -var77;
            }

            return var77;
         } else {
            return !(var7 ^ var4) ? Math.PI / 2 : -Math.PI / 2;
         }
      } else {
         return !var4 ? var0 : method_31187(Math.PI, var0);
      }
   }

   public static double method_31213(double var0, double var2) {
      if (var2 != var2 || var0 != var0) {
         return Double.NaN;
      } else if (var0 == 0.0) {
         double var20 = var2 * var0;
         double var22 = 1.0 / var2;
         double var25 = 1.0 / var0;
         if (var22 != 0.0) {
            if (!(var2 < 0.0) && !(var22 < 0.0)) {
               return var20;
            } else {
               return !(var0 < 0.0) && !(var25 < 0.0) ? Math.PI : -Math.PI;
            }
         } else {
            return !(var2 > 0.0) ? method_31187(Math.PI, var0) : var0;
         }
      } else if (var0 != Double.POSITIVE_INFINITY) {
         if (var0 != Double.NEGATIVE_INFINITY) {
            if (var2 == Double.POSITIVE_INFINITY) {
               if (var0 > 0.0 || 1.0 / var0 > 0.0) {
                  return 0.0;
               }

               if (var0 < 0.0 || 1.0 / var0 < 0.0) {
                  return -0.0;
               }
            }

            if (var2 == Double.NEGATIVE_INFINITY) {
               if (var0 > 0.0 || 1.0 / var0 > 0.0) {
                  return Math.PI;
               }

               if (var0 < 0.0 || 1.0 / var0 < 0.0) {
                  return -Math.PI;
               }
            }

            if (var2 == 0.0) {
               if (var0 > 0.0 || 1.0 / var0 > 0.0) {
                  return Math.PI / 2;
               }

               if (var0 < 0.0 || 1.0 / var0 < 0.0) {
                  return -Math.PI / 2;
               }
            }

            double var6 = var0 / var2;
            if (!Double.isInfinite(var6)) {
               double var8 = method_31189(var6);
               double var10 = var6 - var8;
               double var12 = method_31189(var2);
               double var14 = var2 - var12;
               var10 += (var0 - var8 * var12 - var8 * var14 - var10 * var12 - var10 * var14) / var2;
               double var16 = var8 + var10;
               var10 = -(var16 - var8 - var10);
               var8 = var16;
               if (var16 == 0.0) {
                  var8 = method_31187(0.0, var0);
               }

               return method_31171(var8, var10, var2 < 0.0);
            } else {
               return method_31171(var6, 0.0, var2 < 0.0);
            }
         } else if (var2 == Double.POSITIVE_INFINITY) {
            return -Math.PI / 4;
         } else {
            return var2 != Double.NEGATIVE_INFINITY ? -Math.PI / 2 : -Math.PI * 3.0 / 4.0;
         }
      } else if (var2 == Double.POSITIVE_INFINITY) {
         return Math.PI / 4;
      } else {
         return var2 != Double.NEGATIVE_INFINITY ? Math.PI / 2 : Math.PI * 3.0 / 4.0;
      }
   }

   public static double method_31172(double var0) {
      if (var0 == var0) {
         if (var0 > 1.0 || var0 < -1.0) {
            return Double.NaN;
         } else if (var0 == 1.0) {
            return Math.PI / 2;
         } else if (var0 == -1.0) {
            return -Math.PI / 2;
         } else if (var0 != 0.0) {
            double var4 = var0 * 1.0737418E9F;
            double var6 = var0 + var4 - var4;
            double var8 = var0 - var6;
            double var10 = var6 * var6;
            double var12 = var6 * var8 * 2.0 + var8 * var8;
            var10 = -var10;
            var12 = -var12;
            double var14 = 1.0 + var10;
            double var16 = -(var14 - 1.0 - var10);
            var4 = var14 + var12;
            var16 += -(var4 - var14 - var12);
            double var18 = method_31206(var4);
            double var29 = var18 * 1.0737418E9F;
            var10 = var18 + var29 - var29;
            var12 = var18 - var10;
            var12 += (var4 - var10 * var10 - 2.0 * var10 * var12 - var12 * var12) / (2.0 * var18);
            double var20 = var16 / (2.0 * var18);
            double var22 = var0 / var18;
            var4 = var22 * 1.0737418E9F;
            double var24 = var22 + var4 - var4;
            double var26 = var22 - var24;
            var26 += (var0 - var24 * var10 - var24 * var12 - var26 * var10 - var26 * var12) / var18;
            var26 += -var0 * var20 / var18 / var18;
            var4 = var24 + var26;
            var26 = -(var4 - var24 - var26);
            return method_31171(var4, var26, false);
         } else {
            return var0;
         }
      } else {
         return Double.NaN;
      }
   }

   public static double method_31209(double var0) {
      if (var0 == var0) {
         if (var0 > 1.0 || var0 < -1.0) {
            return Double.NaN;
         } else if (var0 == -1.0) {
            return Math.PI;
         } else if (var0 == 1.0) {
            return 0.0;
         } else if (var0 != 0.0) {
            double var4 = var0 * 1.0737418E9F;
            double var6 = var0 + var4 - var4;
            double var8 = var0 - var6;
            double var10 = var6 * var6;
            double var12 = var6 * var8 * 2.0 + var8 * var8;
            var10 = -var10;
            var12 = -var12;
            double var14 = 1.0 + var10;
            double var16 = -(var14 - 1.0 - var10);
            var4 = var14 + var12;
            var16 += -(var4 - var14 - var12);
            double var18 = method_31206(var4);
            double var27 = var18 * 1.0737418E9F;
            var10 = var18 + var27 - var27;
            var12 = var18 - var10;
            var12 += (var4 - var10 * var10 - 2.0 * var10 * var12 - var12 * var12) / (2.0 * var18);
            var12 += var16 / (2.0 * var18);
            var18 = var10 + var12;
            var12 = -(var18 - var10 - var12);
            double var20 = var18 / var0;
            if (!Double.isInfinite(var20)) {
               double var22 = method_31189(var20);
               double var24 = var20 - var22;
               var24 += (var18 - var22 * var6 - var22 * var8 - var24 * var6 - var24 * var8) / var0;
               var24 += var12 / var0;
               var4 = var22 + var24;
               var24 = -(var4 - var22 - var24);
               return method_31171(var4, var24, var0 < 0.0);
            } else {
               return Math.PI / 2;
            }
         } else {
            return Math.PI / 2;
         }
      } else {
         return Double.NaN;
      }
   }

   public static double method_31224(double var0) {
      long var4 = Double.doubleToRawLongBits(var0);
      int var6 = (int)(var4 >> 52 & 2047L) - 1023;
      boolean var7 = false;
      if (var6 == -1023) {
         if (var0 == 0.0) {
            return var0;
         }

         var7 = true;
         var0 *= 1.8014398E16F;
         var4 = Double.doubleToRawLongBits(var0);
         var6 = (int)(var4 >> 52 & 2047L) - 1023;
      }

      if (var6 != 1024) {
         int var8 = var6 / 3;
         double var9 = Double.longBitsToDouble(var4 & Long.MIN_VALUE | (long)(var8 + 1023 & 2047) << 52);
         double var11 = Double.longBitsToDouble(var4 & 4503599627370495L | 4607182418800017408L);
         double var13 = -0.010714690733195933;
         var13 = var13 * var11 + 0.0875862700108075;
         var13 = var13 * var11 + -0.3058015757857271;
         var13 = var13 * var11 + 0.7249995199969751;
         var13 = var13 * var11 + 0.5039018405998233;
         var13 *= field_35107[var6 % 3 + 2];
         double var15 = var0 / (var9 * var9 * var9);
         var13 += (var15 - var13 * var13 * var13) / (3.0 * var13 * var13);
         var13 += (var15 - var13 * var13 * var13) / (3.0 * var13 * var13);
         double var17 = var13 * 1.0737418E9F;
         double var19 = var13 + var17 - var17;
         double var21 = var13 - var19;
         double var23 = var19 * var19;
         double var25 = var19 * var21 * 2.0 + var21 * var21;
         var17 = var23 * 1.0737418E9F;
         double var27 = var23 + var17 - var17;
         var25 += var23 - var27;
         var25 = var27 * var21 + var19 * var25 + var25 * var21;
         var23 = var27 * var19;
         double var29 = var15 - var23;
         double var31 = -(var29 - var15 + var23);
         var31 -= var25;
         var13 += (var29 + var31) / (3.0 * var13 * var13);
         var13 *= var9;
         if (var7) {
            var13 *= 3.8146973E-6F;
         }

         return var13;
      } else {
         return var0;
      }
   }

   public static double method_31236(double var0) {
      if (!Double.isInfinite(var0) && var0 != 0.0) {
         double var4 = 0.01745329F;
         double var6 = 1.997844754509471E-9;
         double var8 = method_31189(var0);
         double var10 = var0 - var8;
         double var12 = var10 * 1.997844754509471E-9 + var10 * 0.01745329F + var8 * 1.997844754509471E-9 + var8 * 0.01745329F;
         if (var12 == 0.0) {
            var12 *= var0;
         }

         return var12;
      } else {
         return var0;
      }
   }

   public static double method_31164(double var0) {
      if (!Double.isInfinite(var0) && var0 != 0.0) {
         double var4 = 180.0F / (float)Math.PI;
         double var6 = 3.145894820876798E-6;
         double var8 = method_31189(var0);
         double var10 = var0 - var8;
         return var10 * 3.145894820876798E-6 + var10 * 180.0F / (float)Math.PI + var8 * 3.145894820876798E-6 + var8 * 180.0F / (float)Math.PI;
      } else {
         return var0;
      }
   }

   public static int method_31180(int var0) {
      int var3 = var0 >>> 31;
      return (var0 ^ ~var3 + 1) + var3;
   }

   public static long method_31181(long var0) {
      long var4 = var0 >>> 63;
      return (var0 ^ ~var4 + 1L) + var4;
   }

   public static float method_31179(float var0) {
      return Float.intBitsToFloat(2147483647 & Float.floatToRawIntBits(var0));
   }

   public static double method_31178(double var0) {
      return Double.longBitsToDouble(Long.MAX_VALUE & Double.doubleToRawLongBits(var0));
   }

   public static double method_31239(double var0) {
      return !Double.isInfinite(var0) ? method_31178(var0 - Double.longBitsToDouble(Double.doubleToRawLongBits(var0) ^ 1L)) : Double.POSITIVE_INFINITY;
   }

   public static float method_31240(float var0) {
      return !Float.isInfinite(var0) ? method_31179(var0 - Float.intBitsToFloat(Float.floatToIntBits(var0) ^ 1)) : Float.POSITIVE_INFINITY;
   }

   public static double method_31219(double var0, int var2) {
      if (var2 > -1023 && var2 < 1024) {
         return var0 * Double.longBitsToDouble((long)(var2 + 1023) << 52);
      } else if (Double.isNaN(var0) || Double.isInfinite(var0) || var0 == 0.0) {
         return var0;
      } else if (var2 < -2098) {
         return !(var0 > 0.0) ? -0.0 : 0.0;
      } else if (var2 > 2097) {
         return !(var0 > 0.0) ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
      } else {
         long var5 = Double.doubleToRawLongBits(var0);
         long var7 = var5 & Long.MIN_VALUE;
         int var9 = (int)(var5 >>> 52) & 2047;
         long var10 = var5 & 4503599627370495L;
         int var12 = var9 + var2;
         if (var2 < 0) {
            if (var12 > 0) {
               return Double.longBitsToDouble(var7 | (long)var12 << 52 | var10);
            } else if (var12 <= -53) {
               return var7 != 0L ? -0.0 : 0.0;
            } else {
               var10 |= 4503599627370496L;
               long var13 = var10 & 1L << -var12;
               var10 >>>= 1 - var12;
               if (var13 != 0L) {
                  var10++;
               }

               return Double.longBitsToDouble(var7 | var10);
            }
         } else if (var9 == 0) {
            while (var10 >>> 52 != 1L) {
               var10 <<= 1;
               var12--;
            }

            var12++;
            var10 &= 4503599627370495L;
            if (var12 >= 2047) {
               return var7 != 0L ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            } else {
               return Double.longBitsToDouble(var7 | (long)var12 << 52 | var10);
            }
         } else if (var12 >= 2047) {
            return var7 != 0L ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
         } else {
            return Double.longBitsToDouble(var7 | (long)var12 << 52 | var10);
         }
      }
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static float method_31220(float var0, int var1) {
      if (var1 > -127 && var1 < 128) {
         return var0 * Float.intBitsToFloat(var1 + 127 << 23);
      } else if (Float.isNaN(var0) || Float.isInfinite(var0) || var0 == 0.0F) {
         return var0;
      } else if (var1 < -277) {
         return !(var0 > 0.0F) ? -0.0F : 0.0F;
      } else if (var1 > 276) {
         return !(var0 > 0.0F) ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
      } else {
         int var4 = Float.floatToIntBits(var0);
         int var6 = var4 >>> 23 & 0xFF;
         int var8 = var6 + var1;
         byte var5;
         byte var7;
         if (var1 < 0) {
            if (var8 > 0) {
               return Float.intBitsToFloat(var5 | var8 << 23 | var7);
            } else if (var8 <= -24) {
               return var5_4 != false ? -0.0F : 0.0F;
            } else {
               var7 |= 8388608;
               int var9 = var7 & 1 << -var8;
               var7 >>>= 1 - var8;
               if (var9 != 0) {
                  var7++;
               }

               return Float.intBitsToFloat(var5 | var7);
            }
         } else if (var6 == 0) {
            while (var19 >>> 23 != 1) {
               var19 <<= 1;
               var8--;
            }

            if (++var8 >= 255) {
               return var5_3 != false ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            } else {
               return Float.intBitsToFloat(var5 | var8 << 23 | var19);
            }
         } else if (var8 >= 255) {
            return var5_2 != false ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
         } else {
            return Float.intBitsToFloat(var5 | var8 << 23 | var7);
         }
      }
   }

   public static double method_31221(double var0, double var2) {
      if (Double.isNaN(var0) || Double.isNaN(var2)) {
         return Double.NaN;
      } else if (var0 == var2) {
         return var2;
      } else if (Double.isInfinite(var0)) {
         return !(var0 < 0.0) ? Double.MAX_VALUE : -Double.MAX_VALUE;
      } else if (var0 != 0.0) {
         long var6 = Double.doubleToRawLongBits(var0);
         long var8 = var6 & Long.MIN_VALUE;
         return !(var2 < var0 ^ var8 == 0L)
            ? Double.longBitsToDouble(var8 | (var6 & Long.MAX_VALUE) - 1L)
            : Double.longBitsToDouble(var8 | (var6 & Long.MAX_VALUE) + 1L);
      } else {
         return !(var2 < 0.0) ? Double.MIN_VALUE : -Double.MIN_VALUE;
      }
   }

   public static float method_31222(float var0, double var1) {
      if (!Double.isNaN((double)var0) && !Double.isNaN(var1)) {
         if ((double)var0 == var1) {
            return (float)var1;
         } else if (Float.isInfinite(var0)) {
            return !(var0 < 0.0F) ? Float.MAX_VALUE : -Float.MAX_VALUE;
         } else if (var0 != 0.0F) {
            int var5 = Float.floatToIntBits(var0);
            byte var6;
            return !(var1 < (double)var0 ^ var6 == 0)
               ? Float.intBitsToFloat(var6 | (var5 & 2147483647) - 1)
               : Float.intBitsToFloat(var6 | (var5 & 2147483647) + 1);
         } else {
            return !(var1 < 0.0) ? Float.MIN_VALUE : -Float.MIN_VALUE;
         }
      } else {
         return Float.NaN;
      }
   }

   public static double method_31166(double var0) {
      if (var0 == var0) {
         if (!(var0 >= 4.5035996E15F) && !(var0 <= -4.5035996E15F)) {
            long var4 = (long)var0;
            if (var0 < 0.0 && (double)var4 != var0) {
               var4--;
            }

            return var4 != 0L ? (double)var4 : var0 * (double)var4;
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   public static double method_31211(double var0) {
      if (var0 == var0) {
         double var4 = method_31166(var0);
         if (var4 != var0) {
            var4++;
            return var4 != 0.0 ? var4 : var0 * var4;
         } else {
            return var4;
         }
      } else {
         return var0;
      }
   }

   public static double method_31243(double var0) {
      double var4 = method_31166(var0);
      double var6 = var0 - var4;
      if (!(var6 > 0.5)) {
         if (!(var6 < 0.5)) {
            long var8 = (long)var4;
            return (var8 & 1L) != 0L ? var4 + 1.0 : var4;
         } else {
            return var4;
         }
      } else {
         return var4 != -1.0 ? var4 + 1.0 : -0.0;
      }
   }

   public static long method_31190(double var0) {
      return (long)method_31166(var0 + 0.5);
   }

   public static int method_31191(float var0) {
      return (int)method_31166((double)(var0 + 0.5F));
   }

   public static int method_31195(int var0, int var1) {
      return var0 > var1 ? var1 : var0;
   }

   public static long method_31196(long var0, long var2) {
      return var0 > var2 ? var2 : var0;
   }

   public static float method_31194(float var0, float var1) {
      if (!(var0 > var1)) {
         if (!(var0 < var1)) {
            if (var0 == var1) {
               int var4 = Float.floatToRawIntBits(var0);
               return var4 != Integer.MIN_VALUE ? var1 : var0;
            } else {
               return Float.NaN;
            }
         } else {
            return var0;
         }
      } else {
         return var1;
      }
   }

   public static double method_31193(double var0, double var2) {
      if (!(var0 > var2)) {
         if (!(var0 < var2)) {
            if (var0 == var2) {
               long var6 = Double.doubleToRawLongBits(var0);
               return var6 != Long.MIN_VALUE ? var2 : var0;
            } else {
               return Double.NaN;
            }
         } else {
            return var0;
         }
      } else {
         return var2;
      }
   }

   public static int method_31158(int var0, int var1) {
      return var0 > var1 ? var0 : var1;
   }

   public static long method_31159(long var0, long var2) {
      return var0 > var2 ? var0 : var2;
   }

   public static float method_31157(float var0, float var1) {
      if (!(var0 > var1)) {
         if (!(var0 < var1)) {
            if (var0 == var1) {
               int var4 = Float.floatToRawIntBits(var0);
               return var4 != Integer.MIN_VALUE ? var0 : var1;
            } else {
               return Float.NaN;
            }
         } else {
            return var1;
         }
      } else {
         return var0;
      }
   }

   public static double method_31156(double var0, double var2) {
      if (!(var0 > var2)) {
         if (!(var0 < var2)) {
            if (var0 == var2) {
               long var6 = Double.doubleToRawLongBits(var0);
               return var6 != Long.MIN_VALUE ? var0 : var2;
            } else {
               return Double.NaN;
            }
         } else {
            return var2;
         }
      } else {
         return var0;
      }
   }

   public static double method_31235(double var0, double var2) {
      if (Double.isInfinite(var0) || Double.isInfinite(var2)) {
         return Double.POSITIVE_INFINITY;
      } else if (!Double.isNaN(var0) && !Double.isNaN(var2)) {
         int var6 = method_31197(var0);
         int var7 = method_31197(var2);
         if (var6 > var7 + 27) {
            return method_31178(var0);
         } else if (var7 <= var6 + 27) {
            int var8 = (var6 + var7) / 2;
            double var9 = method_31219(var0, -var8);
            double var11 = method_31219(var2, -var8);
            double var13 = method_31206(var9 * var9 + var11 * var11);
            return method_31219(var13, var8);
         } else {
            return method_31178(var2);
         }
      } else {
         return Double.NaN;
      }
   }

   public static double method_31186(double var0, double var2) {
      return StrictMath.IEEEremainder(var0, var2);
   }

   public static int method_31215(long var0) throws MathArithmeticException {
      if (var0 >= -2147483648L && var0 <= 2147483647L) {
         return (int)var0;
      } else {
         throw new class_8040(class_1023.field_5596);
      }
   }

   public static int method_31173(int var0) throws MathArithmeticException {
      if (var0 != Integer.MAX_VALUE) {
         return var0 + 1;
      } else {
         throw new class_8040(class_1023.field_5524, var0, 1);
      }
   }

   public static long method_31174(long var0) throws MathArithmeticException {
      if (var0 != Long.MAX_VALUE) {
         return var0 + 1L;
      } else {
         throw new class_8040(class_1023.field_5524, var0, 1);
      }
   }

   public static int method_31229(int var0) throws MathArithmeticException {
      if (var0 != Integer.MIN_VALUE) {
         return var0 - 1;
      } else {
         throw new class_8040(class_1023.field_5406, var0, 1);
      }
   }

   public static long method_31230(long var0) throws MathArithmeticException {
      if (var0 != Long.MIN_VALUE) {
         return var0 - 1L;
      } else {
         throw new class_8040(class_1023.field_5406, var0, 1);
      }
   }

   public static int method_31161(int var0, int var1) throws MathArithmeticException {
      int var4 = var0 + var1;
      if ((var0 ^ var1) >= 0 && (var4 ^ var1) < 0) {
         throw new class_8040(class_1023.field_5524, var0, var1);
      } else {
         return var4;
      }
   }

   public static long method_31162(long var0, long var2) throws MathArithmeticException {
      long var6 = var0 + var2;
      if ((var0 ^ var2) >= 0L && (var6 ^ var2) < 0L) {
         throw new class_8040(class_1023.field_5524, var0, var2);
      } else {
         return var6;
      }
   }

   public static int method_31225(int var0, int var1) {
      int var4 = var0 - var1;
      if ((var0 ^ var1) < 0 && (var4 ^ var1) >= 0) {
         throw new class_8040(class_1023.field_5406, var0, var1);
      } else {
         return var4;
      }
   }

   public static long method_31226(long var0, long var2) {
      long var6 = var0 - var2;
      if ((var0 ^ var2) < 0L && (var6 ^ var2) >= 0L) {
         throw new class_8040(class_1023.field_5406, var0, var2);
      } else {
         return var6;
      }
   }

   public static int method_31183(int var0, int var1) {
      if (var1 > 0 && (var0 > Integer.MAX_VALUE / var1 || var0 < Integer.MIN_VALUE / var1)
         || var1 < -1 && (var0 > Integer.MIN_VALUE / var1 || var0 < Integer.MAX_VALUE / var1)
         || var1 == -1 && var0 == Integer.MIN_VALUE) {
         throw new class_8040(class_1023.field_5454, var0, var1);
      } else {
         return var0 * var1;
      }
   }

   public static long method_31184(long var0, long var2) {
      if (var2 > 0L && (var0 > Long.MAX_VALUE / var2 || var0 < Long.MIN_VALUE / var2)
         || var2 < -1L && (var0 > Long.MIN_VALUE / var2 || var0 < Long.MAX_VALUE / var2)
         || var2 == -1L && var0 == Long.MIN_VALUE) {
         throw new class_8040(class_1023.field_5454, var0, var2);
      } else {
         return var0 * var2;
      }
   }

   public static int method_31200(int var0, int var1) throws MathArithmeticException {
      if (var1 != 0) {
         int var4 = var0 % var1;
         return (var0 ^ var1) < 0 && var4 != 0 ? var0 / var1 - 1 : var0 / var1;
      } else {
         throw new class_8040(class_1023.field_5364);
      }
   }

   public static long method_31201(long var0, long var2) throws MathArithmeticException {
      if (var2 != 0L) {
         long var6 = var0 % var2;
         return (var0 ^ var2) < 0L && var6 != 0L ? var0 / var2 - 1L : var0 / var2;
      } else {
         throw new class_8040(class_1023.field_5364);
      }
   }

   public static int method_31175(int var0, int var1) throws MathArithmeticException {
      if (var1 != 0) {
         int var4 = var0 % var1;
         return (var0 ^ var1) < 0 && var4 != 0 ? var1 + var4 : var4;
      } else {
         throw new class_8040(class_1023.field_5364);
      }
   }

   public static long method_31176(long var0, long var2) {
      if (var2 != 0L) {
         long var6 = var0 % var2;
         return (var0 ^ var2) < 0L && var6 != 0L ? var2 + var6 : var6;
      } else {
         throw new class_8040(class_1023.field_5364);
      }
   }

   public static double method_31187(double var0, double var2) {
      long var6 = Double.doubleToRawLongBits(var0);
      long var8 = Double.doubleToRawLongBits(var2);
      return (var6 ^ var8) < 0L ? -var0 : var0;
   }

   public static float method_31188(float var0, float var1) {
      int var4 = Float.floatToRawIntBits(var0);
      int var5 = Float.floatToRawIntBits(var1);
      return (var4 ^ var5) < 0 ? -var0 : var0;
   }

   public static int method_31197(double var0) {
      return (int)(Double.doubleToRawLongBits(var0) >>> 52 & 2047L) - 1023;
   }

   public static int method_31198(float var0) {
      return (Float.floatToRawIntBits(var0) >>> 23 & 0xFF) - 127;
   }

   public static void main(String[] var0) {
      PrintStream var3 = System.out;
      class_5166.method_23677(var3, "EXP_INT_TABLE_A", 1500, class_8787.method_40385());
      class_5166.method_23677(var3, "EXP_INT_TABLE_B", 1500, class_8787.method_40384());
      class_5166.method_23677(var3, "EXP_FRAC_TABLE_A", 1025, class_4142.method_19221());
      class_5166.method_23677(var3, "EXP_FRAC_TABLE_B", 1025, class_4142.method_19220());
      class_5166.method_23678(var3, "LN_MANT", 1024, class_2037.method_9556());
      class_5166.method_23677(var3, "SINE_TABLE_A", 14, field_35101);
      class_5166.method_23677(var3, "SINE_TABLE_B", 14, field_35099);
      class_5166.method_23677(var3, "COSINE_TABLE_A", 14, field_35103);
      class_5166.method_23677(var3, "COSINE_TABLE_B", 14, field_35086);
      class_5166.method_23677(var3, "TANGENT_TABLE_A", 14, field_35098);
      class_5166.method_23677(var3, "TANGENT_TABLE_B", 14, field_35081);
   }
}
