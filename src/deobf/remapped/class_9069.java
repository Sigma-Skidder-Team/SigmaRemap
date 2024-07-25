package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class class_9069 extends class_7157 {
   private static final class_8137 field_46405 = class_8137.method_37019(class_4897.field_24554);

   public class_9069(Identifier var1) {
      super(var1);
   }

   public boolean method_41624(class_6946 var1, class_6486 var2) {
      boolean var5 = false;
      boolean var6 = false;

      for (int var7 = 0; var7 < var1.method_31505(); var7++) {
         class_6098 var8 = var1.method_31498(var7);
         if (!var8.method_28022()) {
            if (!(var8.method_27960() instanceof class_239)) {
               if (!field_46405.test(var8)) {
                  return false;
               }

               if (var6) {
                  return false;
               }

               var6 = true;
            } else {
               var5 = true;
            }
         }
      }

      return var6 && var5;
   }

   public class_6098 method_41623(class_6946 var1) {
      ArrayList var4 = Lists.newArrayList();
      class_6098 var5 = null;

      for (int var6 = 0; var6 < var1.method_31505(); var6++) {
         class_6098 var7 = var1.method_31498(var6);
         class_2451 var8 = var7.method_27960();
         if (!(var8 instanceof class_239)) {
            if (field_46405.test(var7)) {
               var5 = var7.method_27973();
               var5.method_28017(1);
            }
         } else {
            var4.add(((class_239)var8).method_1015().method_41793());
         }
      }

      if (var5 != null && !var4.isEmpty()) {
         var5.method_27978("Explosion").method_25968("FadeColors", var4);
         return var5;
      } else {
         return class_6098.field_31203;
      }
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14712;
   }
}
