package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_6877 extends class_7389 {
   private static final class_2522 field_35414 = class_4783.field_23264.method_29260();
   private static final class_2522 field_35413 = class_4783.field_23486.method_29260();
   private static final class_2522 field_35415 = class_4783.field_23344.method_29260();

   public class_6877(Codec<class_5194> var1) {
      super(var1);
   }

   @Override
   public void method_33650(
      Random var1,
      class_5990 var2,
      class_6325 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      class_2522 var9,
      class_2522 var10,
      int var11,
      long var12,
      class_5194 var14
   ) {
      int var17 = var4 & 15;
      int var18 = var5 & 15;
      class_2522 var19 = field_35414;
      class_4139 var20 = var3.method_28875().method_9460();
      class_2522 var21 = var20.method_19216();
      class_2522 var22 = var20.method_19215();
      class_2522 var23 = var21;
      int var24 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var25 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var26 = -1;
      boolean var27 = false;
      int var28 = 0;
      class_2921 var29 = new class_2921();

      for (int var30 = var6; var30 >= 0; var30--) {
         if (var28 < 15) {
            var29.method_13362(var17, var30, var18);
            class_2522 var31 = var2.method_28262(var29);
            if (!var31.method_8345()) {
               if (var31.method_8350(var9.method_8360())) {
                  if (var26 != -1) {
                     if (var26 > 0) {
                        var26--;
                        if (!var27) {
                           var2.method_27348(var29, this.method_33648(var4, var30, var5), false);
                        } else {
                           var2.method_27348(var29, field_35413, false);
                        }
                     }
                  } else {
                     var27 = false;
                     if (var24 > 0) {
                        if (var30 >= var11 - 4 && var30 <= var11 + 1) {
                           var19 = field_35414;
                           var23 = var21;
                        }
                     } else {
                        var19 = class_4783.field_23184.method_29260();
                        var23 = var9;
                     }

                     if (var30 < var11 && (var19 == null || var19.method_8345())) {
                        var19 = var10;
                     }

                     var26 = var24 + Math.max(0, var30 - var11);
                     if (var30 < var11 - 1) {
                        var2.method_27348(var29, var23, false);
                        if (var23 == field_35414) {
                           var2.method_27348(var29, field_35413, false);
                        }
                     } else if (var30 <= 86 + var24 * 2) {
                        if (var30 <= var11 + 3 + var24) {
                           var2.method_27348(var29, var22, false);
                           var27 = true;
                        } else {
                           class_2522 var32;
                           if (var30 < 64 || var30 > 127) {
                              var32 = field_35413;
                           } else if (!var25) {
                              var32 = this.method_33648(var4, var30, var5);
                           } else {
                              var32 = field_35415;
                           }

                           var2.method_27348(var29, var32, false);
                        }
                     } else if (!var25) {
                        var2.method_27348(var29, class_4783.field_23259.method_29260(), false);
                     } else {
                        var2.method_27348(var29, class_4783.field_23577.method_29260(), false);
                     }
                  }

                  var28++;
               }
            } else {
               var26 = -1;
            }
         }
      }
   }
}
