package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_9028 implements class_3471 {
   private static final int field_46195 = 6;
   private static final int field_46204 = 22;
   private static final int field_46205 = 32;
   private static final int field_46198 = 16;
   private static final int field_46197 = 31;
   private static final int[] field_46200 = new int[]{11, 9, 7, 5, 3, 1};
   private static final int[] field_46202 = new int[]{11, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 9, 7, 5, 3, 1};
   private static final int[] field_46201 = new int[]{
      0, 11, 9, 20, 16, 13, 11, 14, 12, 17, 14, 49, 0, 0, 0, 0, 14, 17, 21, 21, 25, 25, 29, 29, 29, 29, 33, 33, 33, 37, 37, 41
   };
   private static final int[] field_46199 = new int[]{1, 2, 4, 8, 16};
   private static final int[] field_46196 = new int[]{1431655765, 858993459, 252645135, 16711935, 65535};

   private static int method_41413(int var0, int var1) {
      var0 = var0 >> field_46199[0] & field_46196[0] | var0 << field_46199[0] & ~field_46196[0];
      var0 = var0 >> field_46199[1] & field_46196[1] | var0 << field_46199[1] & ~field_46196[1];
      var0 = var0 >> field_46199[2] & field_46196[2] | var0 << field_46199[2] & ~field_46196[2];
      var0 = var0 >> field_46199[3] & field_46196[3] | var0 << field_46199[3] & ~field_46196[3];
      var0 = var0 >> field_46199[4] & field_46196[4] | var0 << field_46199[4] & ~field_46196[4];
      return var0 >> 32 - var1;
   }

   public static int[] method_41411(int var0, int var1, int var2) {
      int[] var5 = new int[2];
      if (var2 > 32) {
         var1 = var1 >> field_46199[0] & field_46196[0] | var1 << field_46199[0] & ~field_46196[0];
         var0 = var0 >> field_46199[0] & field_46196[0] | var0 << field_46199[0] & ~field_46196[0];
         var1 = var1 >> field_46199[1] & field_46196[1] | var1 << field_46199[1] & ~field_46196[1];
         var0 = var0 >> field_46199[1] & field_46196[1] | var0 << field_46199[1] & ~field_46196[1];
         var1 = var1 >> field_46199[2] & field_46196[2] | var1 << field_46199[2] & ~field_46196[2];
         var0 = var0 >> field_46199[2] & field_46196[2] | var0 << field_46199[2] & ~field_46196[2];
         var1 = var1 >> field_46199[3] & field_46196[3] | var1 << field_46199[3] & ~field_46196[3];
         var0 = var0 >> field_46199[3] & field_46196[3] | var0 << field_46199[3] & ~field_46196[3];
         var1 = var1 >> field_46199[4] & field_46196[4] | var1 << field_46199[4] & ~field_46196[4];
         var0 = var0 >> field_46199[4] & field_46196[4] | var0 << field_46199[4] & ~field_46196[4];
         var5[1] = var0 >> 64 - var2 | var1 << var2 - 32;
         var5[1] = var1 >> 64 - var2;
      } else {
         var5[0] = 0;
         var5[1] = method_41413(var1, var2);
      }

      return var5;
   }

   private static boolean method_41412(int var0, int var1) {
      boolean var4 = false;
      if (var1 > 0 && var1 <= 11 || var1 >= 16 && var1 <= 31) {
         if (var0 >= 11) {
            var4 = var1 == var0;
         } else {
            var4 = var1 == var0 || var1 == var0 + 1;
         }
      }

      return var4;
   }

   public static void method_41414(class_9143 var0, class_7390 var1, short[] var2, boolean var3) throws AACException {
      class_2568 var6 = var0.method_42072();
      int var7 = var6.method_11670();
      int var8 = var6.method_11671();
      int[] var9 = var6.method_11674();
      int var10 = var6.method_11660();
      int[][] var11 = (int[][])null;
      int[][] var12 = (int[][])null;
      Object var13 = null;
      int[][] var14 = (int[][])null;
      int[][] var15 = (int[][])null;
      int var16 = var0.method_42066();
      if (var16 != 0) {
         int var17 = var0.method_42071();
         if (var17 != 0 && var17 < var16) {
            int[] var18 = new int[8];
            int var19 = var2.length / 8;
            var18[0] = 0;

            for (int var20 = 1; var20 < var7; var20++) {
               var18[var20] = var18[var20 - 1] + var19 * var6.method_11665(var20 - 1);
            }

            class_634[] var21 = new class_634[512];
            class_8707[] var22 = new class_8707[512];
            int[] var23;
            byte var24;
            if (!var3) {
               var23 = field_46200;
               var24 = 6;
            } else {
               var23 = field_46202;
               var24 = 22;
            }

            boolean var25 = false;
            int var26 = 0;
            int var27 = 0;
            int var28 = 0;

            for (int var29 = 0; var29 < var24; var29++) {
               int var31 = var23[var29];

               for (int var32 = 0; var32 < var8; var32++) {
                  for (int var33 = 0; 4 * var33 < Math.min(var9[var32 + 1], var10) - var9[var32]; var33++) {
                     for (int var42 = 0; var42 < var7; var42++) {
                        for (int var34 = 0; !(var34 >= ((Object[])var13)[var42]); var34++) {
                           if (var11[var42][var34] <= var32 && var12[var42][var34] > var32) {
                              int var35 = var14[var42][var34];
                              if (method_41412(var31, var35)) {
                                 int var36 = var15[var42][var32 + 1] - var15[var42][var32];
                                 int var37 = var35 >= 5 ? 2 : 4;
                                 int var38 = 4 * var6.method_11665(var42) / var37;
                                 int var39 = Math.min(field_46201[var35], var17);

                                 for (int var40 = 0; var40 < var38 && var40 + var33 * var38 < var36; var40++) {
                                    int var30 = var18[var42] + var15[var42][var32] + var37 * (var40 + var33 * var38);
                                    if (var25) {
                                       class_634.method_2934(var21[var27 - var26], var30, var35);
                                    } else if (var28 + var39 > var16) {
                                       if (var28 < var16) {
                                          int var41 = var16 - var28;
                                          var22[var26].method_40010(var41, var1);
                                          var22[var26].field_44640 = var22[var26].field_44640 + var22[var26 - 1].field_44640;
                                          var22[var26].method_40006();
                                          if (var22[var26 - 1].field_44640 <= 32) {
                                             var22[var26 - 1].field_44641 = var22[var26].field_44641
                                                + var22[var26 - 1].method_40008(var22[var26 - 1].field_44640);
                                             var22[var26 - 1].field_44638 = var22[var26].field_44638;
                                          } else {
                                             var22[var26 - 1].field_44638 = var22[var26].field_44638
                                                + var22[var26 - 1].method_40008(var22[var26 - 1].field_44640 - 32);
                                             var22[var26 - 1].field_44641 = var22[var26].field_44641 + var22[var26 - 1].method_40008(32);
                                          }

                                          var22[var26 - 1].field_44640 += var41;
                                       }

                                       var28 = var16;
                                       var25 = true;
                                       class_634.method_2934(var21[0], var30, var35);
                                    } else {
                                       var22[var26].method_40010(var39, var1);
                                       var28 += var39;
                                       var22[var26].method_40006();
                                       var26++;
                                    }

                                    var27++;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (var26 == 0) {
               throw new class_5060("no segments in HCR");
            } else {
               int var43 = var27 / var26;

               for (int var44 = 1; var44 <= var43; var44++) {
                  for (int var46 = 0; var46 < var26; var46++) {
                     for (int var47 = 0; var47 < var26; var47++) {
                        int var48 = (var46 + var47) % var26;
                        int var49 = var47 + var44 * var26 - var26;
                        if (var49 >= var27 - var26) {
                           break;
                        }

                        if (var21[var49].field_3571 == 0 && var22[var48].field_44640 > 0) {
                           if (var21[var49].field_3568.field_44640 != 0) {
                              var22[var48].method_40011(var21[var49].field_3568);
                           }

                           int var50 = var22[var48].field_44640;
                        }
                     }
                  }

                  for (int var45 = 0; var45 < var26; var45++) {
                     var22[var45].method_40006();
                  }
               }
            }
         } else {
            throw new class_5060("length of longest HCR codeword out of range");
         }
      }
   }
}
