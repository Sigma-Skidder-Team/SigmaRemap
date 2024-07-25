package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_4695 extends class_4285<class_2045> {
   private static final class_2522 field_22845 = class_4783.field_23765.method_29260();

   public class_4695(Codec<class_2045> var1) {
      super(var1);
   }

   public boolean method_21669(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_2045 var5) {
      while (var4.method_12165() > 5 && var1.method_22548(var4)) {
         var4 = var4.method_6100();
      }

      if (var4.method_12165() <= 4) {
         return false;
      } else {
         var4 = var4.method_6101(4);
         if (var1.method_3132(class_6979.method_31921(var4), class_5390.field_27516).findAny().isPresent()) {
            return false;
         } else {
            boolean[] var8 = new boolean[2048];
            int var9 = var3.nextInt(4) + 4;

            for (int var10 = 0; var10 < var9; var10++) {
               double var11 = var3.nextDouble() * 6.0 + 3.0;
               double var13 = var3.nextDouble() * 4.0 + 2.0;
               double var15 = var3.nextDouble() * 6.0 + 3.0;
               double var17 = var3.nextDouble() * (16.0 - var11 - 2.0) + 1.0 + var11 / 2.0;
               double var19 = var3.nextDouble() * (8.0 - var13 - 4.0) + 2.0 + var13 / 2.0;
               double var21 = var3.nextDouble() * (16.0 - var15 - 2.0) + 1.0 + var15 / 2.0;

               for (int var23 = 1; var23 < 15; var23++) {
                  for (int var24 = 1; var24 < 15; var24++) {
                     for (int var25 = 1; var25 < 7; var25++) {
                        double var26 = ((double)var23 - var17) / (var11 / 2.0);
                        double var28 = ((double)var25 - var19) / (var13 / 2.0);
                        double var30 = ((double)var24 - var21) / (var15 / 2.0);
                        double var32 = var26 * var26 + var28 * var28 + var30 * var30;
                        if (var32 < 1.0) {
                           var8[(var23 * 16 + var24) * 8 + var25] = true;
                        }
                     }
                  }
               }
            }

            for (int var39 = 0; var39 < 16; var39++) {
               for (int var34 = 0; var34 < 16; var34++) {
                  for (int var35 = 0; var35 < 8; var35++) {
                     boolean var36 = !var8[(var39 * 16 + var34) * 8 + var35]
                        && (
                           var39 < 15 && var8[((var39 + 1) * 16 + var34) * 8 + var35]
                              || var39 > 0 && var8[((var39 - 1) * 16 + var34) * 8 + var35]
                              || var34 < 15 && var8[(var39 * 16 + var34 + 1) * 8 + var35]
                              || var34 > 0 && var8[(var39 * 16 + (var34 - 1)) * 8 + var35]
                              || var35 < 7 && var8[(var39 * 16 + var34) * 8 + var35 + 1]
                              || var35 > 0 && var8[(var39 * 16 + var34) * 8 + (var35 - 1)]
                        );
                     if (var36) {
                        class_5371 var37 = var1.method_28262(var4.method_6104(var39, var35, var34)).method_8362();
                        if (var35 >= 4 && var37.method_24494()) {
                           return false;
                        }

                        if (var35 < 4 && !var37.method_24499() && var1.method_28262(var4.method_6104(var39, var35, var34)) != var5.field_10356) {
                           return false;
                        }
                     }
                  }
               }
            }

            for (int var40 = 0; var40 < 16; var40++) {
               for (int var44 = 0; var44 < 16; var44++) {
                  for (int var48 = 0; var48 < 8; var48++) {
                     if (var8[(var40 * 16 + var44) * 8 + var48]) {
                        var1.method_7513(var4.method_6104(var40, var48, var44), var48 < 4 ? var5.field_10356 : field_22845, 2);
                     }
                  }
               }
            }

            for (int var41 = 0; var41 < 16; var41++) {
               for (int var45 = 0; var45 < 16; var45++) {
                  for (int var49 = 4; var49 < 8; var49++) {
                     if (var8[(var41 * 16 + var45) * 8 + var49]) {
                        class_1331 var52 = var4.method_6104(var41, var49 - 1, var45);
                        if (method_19910(var1.method_28262(var52).method_8360())
                           && var1.method_25266(class_2957.field_14437, var4.method_6104(var41, var49, var45)) > 0) {
                           class_6325 var55 = var1.method_22561(var52);
                           if (!var55.method_28875().method_9460().method_19215().method_8350(class_4783.field_23162)) {
                              var1.method_7513(var52, class_4783.field_23259.method_29260(), 2);
                           } else {
                              var1.method_7513(var52, class_4783.field_23162.method_29260(), 2);
                           }
                        }
                     }
                  }
               }
            }

            if (var5.field_10356.method_8362() == class_5371.field_27413) {
               for (int var42 = 0; var42 < 16; var42++) {
                  for (int var46 = 0; var46 < 16; var46++) {
                     for (int var50 = 0; var50 < 8; var50++) {
                        boolean var53 = !var8[(var42 * 16 + var46) * 8 + var50]
                           && (
                              var42 < 15 && var8[((var42 + 1) * 16 + var46) * 8 + var50]
                                 || var42 > 0 && var8[((var42 - 1) * 16 + var46) * 8 + var50]
                                 || var46 < 15 && var8[(var42 * 16 + var46 + 1) * 8 + var50]
                                 || var46 > 0 && var8[(var42 * 16 + (var46 - 1)) * 8 + var50]
                                 || var50 < 7 && var8[(var42 * 16 + var46) * 8 + var50 + 1]
                                 || var50 > 0 && var8[(var42 * 16 + var46) * 8 + (var50 - 1)]
                           );
                        if (var53
                           && (var50 < 4 || var3.nextInt(2) != 0)
                           && var1.method_28262(var4.method_6104(var42, var50, var46)).method_8362().method_24499()) {
                           var1.method_7513(var4.method_6104(var42, var50, var46), class_4783.field_23644.method_29260(), 2);
                        }
                     }
                  }
               }
            }

            if (var5.field_10356.method_8362() == class_5371.field_27439) {
               for (int var43 = 0; var43 < 16; var43++) {
                  for (int var47 = 0; var47 < 16; var47++) {
                     byte var51 = 4;
                     class_1331 var54 = var4.method_6104(var43, 4, var47);
                     if (var1.method_22561(var54).method_28859(var1, var54, false)) {
                        var1.method_7513(var54, class_4783.field_23496.method_29260(), 2);
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}
