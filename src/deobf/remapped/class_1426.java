package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_1426 extends class_3133<class_5194> {
   public class_1426(Codec<class_5194> var1) {
      super(var1);
   }

   public void method_6552(
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
      this.method_6553(var1, var2, var3, var4, var5, var6, var7, var9, var10, var14.method_19215(), var14.method_19216(), var14.method_23858(), var11);
   }

   public void method_6553(
      Random var1,
      class_5990 var2,
      class_6325 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      class_2522 var9,
      class_2522 var10,
      class_2522 var11,
      class_2522 var12,
      class_2522 var13,
      int var14
   ) {
      class_2522 var17 = var11;
      class_2522 var18 = var12;
      class_2921 var19 = new class_2921();
      int var20 = -1;
      int var21 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var22 = var4 & 15;
      int var23 = var5 & 15;

      for (int var24 = var6; var24 >= 0; var24--) {
         var19.method_13362(var22, var24, var23);
         class_2522 var25 = var2.method_28262(var19);
         if (!var25.method_8345()) {
            if (var25.method_8350(var9.method_8360())) {
               if (var20 != -1) {
                  if (var20 > 0) {
                     var20--;
                     var2.method_27348(var19, var18, false);
                     if (var20 == 0 && var18.method_8350(class_4783.field_23216) && var21 > 1) {
                        var20 = var1.nextInt(4) + Math.max(0, var24 - 63);
                        var18 = !var18.method_8350(class_4783.field_23814) ? class_4783.field_23459.method_29260() : class_4783.field_23160.method_29260();
                     }
                  }
               } else {
                  if (var21 > 0) {
                     if (var24 >= var14 - 4 && var24 <= var14 + 1) {
                        var17 = var11;
                        var18 = var12;
                     }
                  } else {
                     var17 = class_4783.field_23184.method_29260();
                     var18 = var9;
                  }

                  if (var24 < var14 && (var17 == null || var17.method_8345())) {
                     if (!(var3.method_28865(var19.method_13362(var4, var24, var5)) < 0.15F)) {
                        var17 = var10;
                     } else {
                        var17 = class_4783.field_23496.method_29260();
                     }

                     var19.method_13362(var22, var24, var23);
                  }

                  var20 = var21;
                  if (var24 < var14 - 1) {
                     if (var24 >= var14 - 7 - var21) {
                        var2.method_27348(var19, var18, false);
                     } else {
                        var17 = class_4783.field_23184.method_29260();
                        var18 = var9;
                        var2.method_27348(var19, var13, false);
                     }
                  } else {
                     var2.method_27348(var19, var17, false);
                  }
               }
            }
         } else {
            var20 = -1;
         }
      }
   }
}
