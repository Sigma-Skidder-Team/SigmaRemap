package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_6413 extends class_3133<class_5194> {
   public class_6413(Codec<class_5194> var1) {
      super(var1);
   }

   public void method_29251(
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
      double var17 = class_6325.field_32304.method_31321((double)var4 * 0.25, (double)var5 * 0.25, false);
      if (var17 > 0.0) {
         int var19 = var4 & 15;
         int var20 = var5 & 15;
         class_2921 var21 = new class_2921();

         for (int var22 = var6; var22 >= 0; var22--) {
            var21.method_13362(var19, var22, var20);
            if (!var2.method_28262(var21).method_8345()) {
               if (var22 == 62 && !var2.method_28262(var21).method_8350(var10.method_8360())) {
                  var2.method_27348(var21, var10, false);
               }
               break;
            }
         }
      }

      class_3133.field_15561.method_14498(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, var14);
   }
}
