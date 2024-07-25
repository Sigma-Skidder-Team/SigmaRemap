package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_7658 extends class_4285<class_204> {
   public class_7658(Codec<class_204> var1) {
      super(var1);
   }

   public boolean method_34665(class_700 var1, class_6541 var2, Random var3, class_1331 var4, class_204 var5) {
      if (var5.field_685.contains(var1.method_28262(var4.method_6081()).method_8360())) {
         if (var5.field_683 && !var5.field_685.contains(var1.method_28262(var4.method_6100()).method_8360())) {
            return false;
         } else {
            class_2522 var8 = var1.method_28262(var4);
            if (!var8.method_8345() && !var5.field_685.contains(var8.method_8360())) {
               return false;
            } else {
               int var9 = 0;
               int var10 = 0;
               if (var5.field_685.contains(var1.method_28262(var4.method_6108()).method_8360())) {
                  var10++;
               }

               if (var5.field_685.contains(var1.method_28262(var4.method_6090()).method_8360())) {
                  var10++;
               }

               if (var5.field_685.contains(var1.method_28262(var4.method_6094()).method_8360())) {
                  var10++;
               }

               if (var5.field_685.contains(var1.method_28262(var4.method_6073()).method_8360())) {
                  var10++;
               }

               if (var5.field_685.contains(var1.method_28262(var4.method_6100()).method_8360())) {
                  var10++;
               }

               int var11 = 0;
               if (var1.method_22548(var4.method_6108())) {
                  var11++;
               }

               if (var1.method_22548(var4.method_6090())) {
                  var11++;
               }

               if (var1.method_22548(var4.method_6094())) {
                  var11++;
               }

               if (var1.method_22548(var4.method_6073())) {
                  var11++;
               }

               if (var1.method_22548(var4.method_6100())) {
                  var11++;
               }

               if (var10 == var5.field_684 && var11 == var5.field_682) {
                  var1.method_7513(var4, var5.field_679.method_22006(), 2);
                  var1.method_43362().method_14011(var4, var5.field_679.method_22005(), 0);
                  var9++;
               }

               return var9 > 0;
            }
         }
      } else {
         return false;
      }
   }
}
