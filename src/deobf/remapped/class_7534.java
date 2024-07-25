package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_7534 extends class_7389 {
   private static final class_2522 field_38459 = class_4783.field_23264.method_29260();
   private static final class_2522 field_38458 = class_4783.field_23486.method_29260();
   private static final class_2522 field_38460 = class_4783.field_23344.method_29260();

   public class_7534(Codec<class_5194> var1) {
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
      double var17 = 0.0;
      double var19 = Math.min(Math.abs(var7), this.field_37734.method_31321((double)var4 * 0.25, (double)var5 * 0.25, false) * 15.0);
      if (var19 > 0.0) {
         double var29 = 0.001953125;
         double var31 = Math.abs(this.field_37724.method_31321((double)var4 * 0.001953125, (double)var5 * 0.001953125, false));
         var17 = var19 * var19 * 2.5;
         double var33 = Math.ceil(var31 * 50.0) + 14.0;
         if (var17 > var33) {
            var17 = var33;
         }

         var17 += 64.0;
      }

      int var21 = var4 & 15;
      int var22 = var5 & 15;
      class_2522 var23 = field_38459;
      class_4139 var24 = var3.method_28875().method_9460();
      class_2522 var25 = var24.method_19216();
      class_2522 var26 = var24.method_19215();
      class_2522 var27 = var25;
      int var28 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var35 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var36 = -1;
      boolean var37 = false;
      class_2921 var38 = new class_2921();

      for (int var39 = Math.max(var6, (int)var17 + 1); var39 >= 0; var39--) {
         var38.method_13362(var21, var39, var22);
         if (var2.method_28262(var38).method_8345() && var39 < (int)var17) {
            var2.method_27348(var38, var9, false);
         }

         class_2522 var40 = var2.method_28262(var38);
         if (!var40.method_8345()) {
            if (var40.method_8350(var9.method_8360())) {
               if (var36 != -1) {
                  if (var36 > 0) {
                     var36--;
                     if (!var37) {
                        var2.method_27348(var38, this.method_33648(var4, var39, var5), false);
                     } else {
                        var2.method_27348(var38, field_38458, false);
                     }
                  }
               } else {
                  var37 = false;
                  if (var28 > 0) {
                     if (var39 >= var11 - 4 && var39 <= var11 + 1) {
                        var23 = field_38459;
                        var27 = var25;
                     }
                  } else {
                     var23 = class_4783.field_23184.method_29260();
                     var27 = var9;
                  }

                  if (var39 < var11 && (var23 == null || var23.method_8345())) {
                     var23 = var10;
                  }

                  var36 = var28 + Math.max(0, var39 - var11);
                  if (var39 < var11 - 1) {
                     var2.method_27348(var38, var27, false);
                     class_6414 var41 = var27.method_8360();
                     if (var41 == class_4783.field_23264
                        || var41 == class_4783.field_23486
                        || var41 == class_4783.field_23908
                        || var41 == class_4783.field_23840
                        || var41 == class_4783.field_23243
                        || var41 == class_4783.field_23857
                        || var41 == class_4783.field_23625
                        || var41 == class_4783.field_23198
                        || var41 == class_4783.field_23229
                        || var41 == class_4783.field_23387
                        || var41 == class_4783.field_23816
                        || var41 == class_4783.field_23793
                        || var41 == class_4783.field_23330
                        || var41 == class_4783.field_23773
                        || var41 == class_4783.field_23659
                        || var41 == class_4783.field_23711) {
                        var2.method_27348(var38, field_38458, false);
                     }
                  } else if (var39 > var11 + 3 + var28) {
                     class_2522 var43;
                     if (var39 < 64 || var39 > 127) {
                        var43 = field_38458;
                     } else if (!var35) {
                        var43 = this.method_33648(var4, var39, var5);
                     } else {
                        var43 = field_38460;
                     }

                     var2.method_27348(var38, var43, false);
                  } else {
                     var2.method_27348(var38, var26, false);
                     var37 = true;
                  }
               }
            }
         } else {
            var36 = -1;
         }
      }
   }
}
