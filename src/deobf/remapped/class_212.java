package remapped;

public class class_212 {
   private static String[] field_710;
   private final class_5155[] field_711 = new class_5155[2];
   private final class_5155[] field_712 = new class_5155[2];
   private class_5155 field_709;

   public void method_896() {
      this.field_711[0] = MinecraftClient.getInstance().method_8535().method_33946().method_43946(class_4783.field_23811.method_29260()).method_33587();
      this.field_711[1] = class_6560.field_33438.method_12947();
      this.field_712[0] = MinecraftClient.getInstance().method_8535().method_33946().method_43946(class_4783.field_23900.method_29260()).method_33587();
      this.field_712[1] = class_6560.field_33450.method_12947();
      this.field_709 = class_6560.field_33464.method_12947();
   }

   private static boolean method_906(class_6163 var0, class_1331 var1, class_240 var2, class_4774 var3) {
      class_1331 var6 = var1.method_6098(var2);
      class_4774 var7 = var0.method_28258(var6);
      return var7.method_22005().method_10723(var3.method_22005());
   }

   private static boolean method_901(class_6163 var0, class_240 var1, float var2, class_1331 var3, class_2522 var4) {
      if (!var4.method_8302()) {
         return false;
      } else {
         class_4190 var7 = class_3370.method_15522(0.0, 0.0, 0.0, 1.0, (double)var2, 1.0);
         class_4190 var8 = var4.method_8377(var0, var3);
         return class_3370.method_15534(var7, var8, var1);
      }
   }

   private static boolean method_898(class_6163 var0, class_1331 var1, class_240 var2, float var3) {
      class_1331 var6 = var1.method_6098(var2);
      class_2522 var7 = var0.method_28262(var6);
      return method_901(var0, var2, var3, var6, var7);
   }

   private static boolean method_897(class_6163 var0, class_1331 var1, class_2522 var2, class_240 var3) {
      return method_901(var0, var3.method_1046(), 1.0F, var1, var2);
   }

   public static boolean method_895(class_5561 var0, class_1331 var1, class_4774 var2, class_2522 var3, class_240 var4) {
      return !method_897(var0, var1, var3, var4) && !method_906(var0, var1, var4, var2);
   }

   public boolean method_905(class_5561 var1, class_1331 var2, class_7907 var3, class_4774 var4) {
      class_2522 var7 = var4.method_22006();

      boolean var23;
      try {
         if (class_3111.method_14424()) {
            class_2448.method_11201(var7, var3);
         }

         boolean var8 = var4.method_22007(class_6503.field_33095);
         class_5155[] var9 = var8 ? this.field_711 : this.field_712;
         class_2522 var10 = var1.method_28262(var2);
         if (class_7860.field_40001.method_3596()) {
            class_5155[] var11 = (class_5155[])class_7860.method_35556(class_7860.field_40001, var1, var2, var4);
            if (var11 != null) {
               var9 = var11;
            }
         }

         class_4460 var81 = var3.method_35749(var7, var2);
         int var12 = -1;
         float var13 = 1.0F;
         if (class_7860.field_39950.method_3596()) {
            Object var14 = class_7860.method_35555(var4.method_22005(), class_7860.field_39950);
            if (var14 != null && class_7860.field_40042.method_3596()) {
               var12 = class_7860.method_35569(var14, class_7860.field_40042, var1, var2);
               var13 = (float)(var12 >> 24 & 0xFF) / 255.0F;
            }
         }

         boolean var82 = !method_906(var1, var2, class_240.field_817, var4);
         boolean var15 = method_895(var1, var2, var4, var10, class_240.field_802) && !method_898(var1, var2, class_240.field_802, 0.8888889F);
         boolean var16 = method_895(var1, var2, var4, var10, class_240.field_818);
         boolean var17 = method_895(var1, var2, var4, var10, class_240.field_800);
         boolean var18 = method_895(var1, var2, var4, var10, class_240.field_809);
         boolean var19 = method_895(var1, var2, var4, var10, class_240.field_804);
         if (var82 || var15 || var19 || var18 || var16 || var17) {
            if (var12 < 0) {
               var12 = class_9300.method_42889(var1, var7, var2, var81);
            }

            float var20 = (float)(var12 >> 16 & 0xFF) / 255.0F;
            float var21 = (float)(var12 >> 8 & 0xFF) / 255.0F;
            float var22 = (float)(var12 & 0xFF) / 255.0F;
            var23 = false;
            float var24 = var1.method_25265(class_240.field_802, true);
            float var25 = var1.method_25265(class_240.field_817, true);
            float var26 = var1.method_25265(class_240.field_818, true);
            float var27 = var1.method_25265(class_240.field_809, true);
            float var28 = this.method_899(var1, var2, var4.method_22005());
            float var29 = this.method_899(var1, var2.method_6073(), var4.method_22005());
            float var30 = this.method_899(var1, var2.method_6090().method_6073(), var4.method_22005());
            float var31 = this.method_899(var1, var2.method_6090(), var4.method_22005());
            double var32 = (double)(var2.method_12173() & 15);
            double var34 = (double)(var2.method_12165() & 15);
            double var36 = (double)(var2.method_12185() & 15);
            if (class_3111.method_14351()) {
               int var38 = var2.method_12173() >> 4 << 4;
               int var39 = var2.method_12165() >> 4 << 4;
               int var40 = var2.method_12185() >> 4 << 4;
               byte var41 = 8;
               int var42 = var38 >> var41 << var41;
               int var43 = var40 >> var41 << var41;
               int var44 = var38 - var42;
               int var45 = var40 - var43;
               var32 += (double)var44;
               var34 += (double)var39;
               var36 += (double)var45;
            }

            float var84 = 0.001F;
            float var85 = var15 ? 0.001F : 0.0F;
            if (var82 && !method_898(var1, var2, class_240.field_817, Math.min(Math.min(var28, var29), Math.min(var30, var31)))) {
               var23 = true;
               var28 -= 0.001F;
               var29 -= 0.001F;
               var30 -= 0.001F;
               var31 -= 0.001F;
               class_1343 var86 = var4.method_22003(var1, var2);
               float var47;
               float var48;
               float var49;
               float var90;
               float var94;
               float var98;
               float var101;
               float var104;
               if (var86.field_7336 == 0.0 && var86.field_7334 == 0.0) {
                  class_5155 var107 = var9[0];
                  var3.method_35752(var107);
                  var101 = var107.method_23602(0.0);
                  var90 = var107.method_23639(0.0);
                  var104 = var101;
                  var47 = var107.method_23639(16.0);
                  var48 = var107.method_23602(16.0);
                  var94 = var47;
                  var49 = var48;
                  var98 = var90;
               } else {
                  class_5155 var46 = var9[1];
                  var3.method_35752(var46);
                  float var50 = (float)class_9299.method_42821(var86.field_7334, var86.field_7336) - (float) (Math.PI / 2);
                  float var51 = class_9299.method_42818(var50) * 0.25F;
                  float var52 = class_9299.method_42840(var50) * 0.25F;
                  float var53 = 8.0F;
                  var101 = var46.method_23602((double)(8.0F + (-var52 - var51) * 16.0F));
                  var90 = var46.method_23639((double)(8.0F + (-var52 + var51) * 16.0F));
                  var104 = var46.method_23602((double)(8.0F + (-var52 + var51) * 16.0F));
                  var47 = var46.method_23639((double)(8.0F + (var52 + var51) * 16.0F));
                  var48 = var46.method_23602((double)(8.0F + (var52 + var51) * 16.0F));
                  var94 = var46.method_23639((double)(8.0F + (var52 - var51) * 16.0F));
                  var49 = var46.method_23602((double)(8.0F + (var52 - var51) * 16.0F));
                  var98 = var46.method_23639((double)(8.0F + (-var52 - var51) * 16.0F));
               }

               float var108 = (var101 + var104 + var48 + var49) / 4.0F;
               float var115 = (var90 + var47 + var94 + var98) / 4.0F;
               float var116 = (float)var9[0].method_23625() / (var9[0].method_23619() - var9[0].method_23630());
               float var118 = (float)var9[0].method_23615() / (var9[0].method_23640() - var9[0].method_23642());
               float var120 = 4.0F / Math.max(var118, var116);
               var101 = class_9299.method_42795(var120, var101, var108);
               var104 = class_9299.method_42795(var120, var104, var108);
               var48 = class_9299.method_42795(var120, var48, var108);
               var49 = class_9299.method_42795(var120, var49, var108);
               var90 = class_9299.method_42795(var120, var90, var115);
               var47 = class_9299.method_42795(var120, var47, var115);
               var94 = class_9299.method_42795(var120, var94, var115);
               var98 = class_9299.method_42795(var120, var98, var115);
               int var54 = this.method_904(var1, var2);
               float var55 = var25 * var20;
               float var56 = var25 * var21;
               float var57 = var25 * var22;
               this.method_902(var3, var32 + 0.0, var34 + (double)var28, var36 + 0.0, var55, var56, var57, var13, var101, var90, var54);
               this.method_902(var3, var32 + 0.0, var34 + (double)var29, var36 + 1.0, var55, var56, var57, var13, var104, var47, var54);
               this.method_902(var3, var32 + 1.0, var34 + (double)var30, var36 + 1.0, var55, var56, var57, var13, var48, var94, var54);
               this.method_902(var3, var32 + 1.0, var34 + (double)var31, var36 + 0.0, var55, var56, var57, var13, var49, var98, var54);
               if (var4.method_21997(var1, var2.method_6081())) {
                  this.method_902(var3, var32 + 0.0, var34 + (double)var28, var36 + 0.0, var55, var56, var57, var13, var101, var90, var54);
                  this.method_902(var3, var32 + 1.0, var34 + (double)var31, var36 + 0.0, var55, var56, var57, var13, var49, var98, var54);
                  this.method_902(var3, var32 + 1.0, var34 + (double)var30, var36 + 1.0, var55, var56, var57, var13, var48, var94, var54);
                  this.method_902(var3, var32 + 0.0, var34 + (double)var29, var36 + 1.0, var55, var56, var57, var13, var104, var47, var54);
               }
            }

            if (var15) {
               var3.method_35752(var9[0]);
               float var87 = var9[0].method_23630();
               float var92 = var9[0].method_23619();
               float var96 = var9[0].method_23642();
               float var100 = var9[0].method_23640();
               int var103 = this.method_904(var1, var2.method_6100());
               float var106 = var1.method_25265(class_240.field_802, true);
               float var112 = var106 * var20;
               float var114 = var106 * var21;
               float var110 = var106 * var22;
               this.method_902(var3, var32, var34 + (double)var85, var36 + 1.0, var112, var114, var110, var13, var87, var100, var103);
               this.method_902(var3, var32, var34 + (double)var85, var36, var112, var114, var110, var13, var87, var96, var103);
               this.method_902(var3, var32 + 1.0, var34 + (double)var85, var36, var112, var114, var110, var13, var92, var96, var103);
               this.method_902(var3, var32 + 1.0, var34 + (double)var85, var36 + 1.0, var112, var114, var110, var13, var92, var100, var103);
               var23 = true;
            }

            for (int var88 = 0; var88 < 4; var88++) {
               double var58;
               double var60;
               double var62;
               double var64;
               float var93;
               float var97;
               class_240 var117;
               boolean var119;
               if (var88 == 0) {
                  var93 = var28;
                  var97 = var31;
                  var58 = var32;
                  var60 = var32 + 1.0;
                  var62 = var36 + 0.001F;
                  var64 = var36 + 0.001F;
                  var117 = class_240.field_818;
                  var119 = var16;
               } else if (var88 == 1) {
                  var93 = var30;
                  var97 = var29;
                  var58 = var32 + 1.0;
                  var60 = var32;
                  var62 = var36 + 1.0 - 0.001F;
                  var64 = var36 + 1.0 - 0.001F;
                  var117 = class_240.field_800;
                  var119 = var17;
               } else if (var88 == 2) {
                  var93 = var29;
                  var97 = var28;
                  var58 = var32 + 0.001F;
                  var60 = var32 + 0.001F;
                  var62 = var36 + 1.0;
                  var64 = var36;
                  var117 = class_240.field_809;
                  var119 = var18;
               } else {
                  var93 = var31;
                  var97 = var30;
                  var58 = var32 + 1.0 - 0.001F;
                  var60 = var32 + 1.0 - 0.001F;
                  var62 = var36;
                  var64 = var36 + 1.0;
                  var117 = class_240.field_804;
                  var119 = var19;
               }

               if (var119 && !method_898(var1, var2, var117, Math.max(var93, var97))) {
                  var23 = true;
                  class_1331 var121 = var2.method_6098(var117);
                  class_5155 var122 = var9[1];
                  float var123 = 0.0F;
                  float var125 = 0.0F;
                  boolean var127 = !var8;
                  if (class_7860.field_40080.method_3596()) {
                     var127 = var9[2] != null;
                  }

                  if (var127) {
                     class_2522 var66 = var1.method_28262(var121);
                     class_6414 var67 = var66.method_8360();
                     boolean var68 = false;
                     if (class_7860.field_40080.method_3596()) {
                        var68 = class_7860.method_35565(var66, class_7860.field_40080, var1, var121, var4);
                     }

                     if (var68 || var67 instanceof class_3333 || var67 instanceof class_4423 || var67 == class_4783.field_23862) {
                        var122 = this.field_709;
                     }

                     if (var67 == class_4783.field_23421 || var67 == class_4783.field_23608) {
                        var123 = 0.9375F;
                        var125 = 0.9375F;
                     }

                     if (var67 instanceof class_6344) {
                        class_6344 var69 = (class_6344)var67;
                        if (var66.<class_6666>method_10313(class_6344.field_32395) == class_6666.field_34465) {
                           var123 = 0.5F;
                           var125 = 0.5F;
                        }
                     }
                  }

                  var3.method_35752(var122);
                  if (!(var93 <= var123) || !(var97 <= var125)) {
                     var123 = Math.min(var123, var93);
                     var125 = Math.min(var125, var97);
                     if (var123 > var84) {
                        var123 -= var84;
                     }

                     if (var125 > var84) {
                        var125 -= var84;
                     }

                     float var128 = var122.method_23639((double)((1.0F - var123) * 16.0F * 0.5F));
                     float var129 = var122.method_23639((double)((1.0F - var125) * 16.0F * 0.5F));
                     float var130 = var122.method_23602(0.0);
                     float var131 = var122.method_23602(8.0);
                     float var70 = var122.method_23639((double)((1.0F - var93) * 16.0F * 0.5F));
                     float var71 = var122.method_23639((double)((1.0F - var97) * 16.0F * 0.5F));
                     float var72 = var122.method_23639(8.0);
                     int var73 = this.method_904(var1, var121);
                     float var74 = var88 < 2 ? var1.method_25265(class_240.field_818, true) : var1.method_25265(class_240.field_809, true);
                     float var75 = 1.0F * var74 * var20;
                     float var76 = 1.0F * var74 * var21;
                     float var77 = 1.0F * var74 * var22;
                     this.method_902(var3, var58, var34 + (double)var93, var62, var75, var76, var77, var13, var130, var70, var73);
                     this.method_902(var3, var60, var34 + (double)var97, var64, var75, var76, var77, var13, var131, var71, var73);
                     this.method_902(var3, var60, var34 + (double)var85, var64, var75, var76, var77, var13, var131, var129, var73);
                     this.method_902(var3, var58, var34 + (double)var85, var62, var75, var76, var77, var13, var130, var128, var73);
                     if (var122 != this.field_709) {
                        this.method_902(var3, var58, var34 + (double)var85, var62, var75, var76, var77, var13, var130, var128, var73);
                        this.method_902(var3, var60, var34 + (double)var85, var64, var75, var76, var77, var13, var131, var129, var73);
                        this.method_902(var3, var60, var34 + (double)var97, var64, var75, var76, var77, var13, var131, var71, var73);
                        this.method_902(var3, var58, var34 + (double)var93, var62, var75, var76, var77, var13, var130, var70, var73);
                     }
                  }
               }
            }

            var3.method_35752((class_5155)null);
            return var23;
         }

         var23 = false;
      } finally {
         if (class_3111.method_14424()) {
            class_2448.method_11191(var3);
         }
      }

      return var23;
   }

   private void method_903(class_7907 var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11, float var12, int var13) {
      var1.method_35761(var2, var4, var6)
         .method_35742(var8, var9, var10, 1.0F)
         .method_35745(var11, var12)
         .method_35747(var13)
         .method_35755(0.0F, 1.0F, 0.0F)
         .method_35735();
   }

   private void method_902(
      class_7907 var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11, float var12, float var13, int var14
   ) {
      var1.method_35761(var2, var4, var6)
         .method_35742(var8, var9, var10, var11)
         .method_35745(var12, var13)
         .method_35747(var14)
         .method_35755(0.0F, 1.0F, 0.0F)
         .method_35735();
   }

   private int method_904(class_5561 var1, class_1331 var2) {
      int var5 = class_4316.method_20002(var1, var2);
      int var6 = class_4316.method_20002(var1, var2.method_6081());
      int var7 = var5 & 0xFF;
      int var8 = var6 & 0xFF;
      int var9 = var5 >> 16 & 0xFF;
      int var10 = var6 >> 16 & 0xFF;
      return (var7 <= var8 ? var8 : var7) | (var9 <= var10 ? var10 : var9) << 16;
   }

   private float method_899(class_6163 var1, class_1331 var2, class_2340 var3) {
      int var6 = 0;
      float var7 = 0.0F;

      for (int var8 = 0; var8 < 4; var8++) {
         class_1331 var9 = var2.method_6104(-(var8 & 1), 0, -(var8 >> 1 & 1));
         if (var1.method_28258(var9.method_6081()).method_22005().method_10723(var3)) {
            return 1.0F;
         }

         class_4774 var10 = var1.method_28258(var9);
         if (!var10.method_22005().method_10723(var3)) {
            if (!var1.method_28262(var9).method_8362().method_24499()) {
               var6++;
            }
         } else {
            float var11 = var10.method_22008(var1, var9);
            if (!(var11 >= 0.8F)) {
               var7 += var11;
               var6++;
            } else {
               var7 += var11 * 10.0F;
               var6 += 10;
            }
         }
      }

      return var7 / (float)var6;
   }
}
