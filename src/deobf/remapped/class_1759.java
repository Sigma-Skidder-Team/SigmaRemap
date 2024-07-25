package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_1759 extends class_4285<class_1941> {
   public class_1759(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_7875(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_1941 var5) {
      class_2921 var8 = new class_2921();
      class_2921 var9 = new class_2921();

      for (int var10 = 0; var10 < 16; var10++) {
         for (int var11 = 0; var11 < 16; var11++) {
            int var12 = var4.method_12173() + var10;
            int var13 = var4.method_12185() + var11;
            int var14 = var1.method_22562(class_3801.field_18595, var12, var13);
            var8.method_13362(var12, var14, var13);
            var9.method_13364(var8).method_13369(Direction.field_802, 1);
            class_6325 var15 = var1.method_22561(var8);
            if (var15.method_28859(var1, var9, false)) {
               var1.method_7513(var9, class_4783.field_23496.method_29260(), 2);
            }

            if (var15.method_28882(var1, var8)) {
               var1.method_7513(var8, class_4783.field_23552.method_29260(), 2);
               class_2522 var16 = var1.method_28262(var9);
               if (var16.method_10307(class_2985.field_14686)) {
                  var1.method_7513(var9, var16.method_10308(class_2985.field_14686, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
