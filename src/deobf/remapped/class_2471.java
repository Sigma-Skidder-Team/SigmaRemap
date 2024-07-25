package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class class_2471 extends class_7157 {
   private static String[] field_12343;

   public class_2471(Identifier var1) {
      super(var1);
   }

   public boolean method_11366(class_6946 var1, World var2) {
      class_6098 var5 = class_6098.field_31203;
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < var1.method_31505(); var7++) {
         class_6098 var8 = var1.method_31498(var7);
         if (!var8.method_28022()) {
            if (!(var8.method_27960() instanceof class_9168)) {
               if (!(var8.method_27960() instanceof class_239)) {
                  return false;
               }

               var6.add(var8);
            } else {
               if (!var5.method_28022()) {
                  return false;
               }

               var5 = var8;
            }
         }
      }

      return !var5.method_28022() && !var6.isEmpty();
   }

   public class_6098 method_11365(class_6946 var1) {
      ArrayList var4 = Lists.newArrayList();
      class_6098 var5 = class_6098.field_31203;

      for (int var6 = 0; var6 < var1.method_31505(); var6++) {
         class_6098 var7 = var1.method_31498(var6);
         if (!var7.method_28022()) {
            class_2451 var8 = var7.method_27960();
            if (!(var8 instanceof class_9168)) {
               if (!(var8 instanceof class_239)) {
                  return class_6098.field_31203;
               }

               var4.add((class_239)var8);
            } else {
               if (!var5.method_28022()) {
                  return class_6098.field_31203;
               }

               var5 = var7.method_27973();
            }
         }
      }

      return !var5.method_28022() && !var4.isEmpty() ? class_9168.method_42264(var5, var4) : class_6098.field_31203;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14717;
   }
}
