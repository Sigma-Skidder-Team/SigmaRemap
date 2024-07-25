package remapped;

public class class_4514 extends class_7157 {
   private static String[] field_22055;

   public class_4514(class_4639 var1) {
      super(var1);
   }

   public boolean method_20978(class_6946 var1, class_6486 var2) {
      if (var1.method_31781() == 3 && var1.method_31782() == 3) {
         for (int var5 = 0; var5 < var1.method_31781(); var5++) {
            for (int var6 = 0; var6 < var1.method_31782(); var6++) {
               class_6098 var7 = var1.method_31498(var5 + var6 * var1.method_31781());
               if (var7.method_28022()) {
                  return false;
               }

               class_2451 var8 = var7.method_27960();
               if (var5 == 1 && var6 == 1) {
                  if (var8 != class_4897.field_24444) {
                     return false;
                  }
               } else if (var8 != class_4897.field_25024) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public class_6098 method_20977(class_6946 var1) {
      class_6098 var4 = var1.method_31498(1 + var1.method_31781());
      if (var4.method_27960() == class_4897.field_24444) {
         class_6098 var5 = new class_6098(class_4897.field_25013, 8);
         class_9541.method_43999(var5, class_9541.method_43990(var4));
         class_9541.method_43992(var5, class_9541.method_43995(var4));
         return var5;
      } else {
         return class_6098.field_31203;
      }
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14722;
   }
}
