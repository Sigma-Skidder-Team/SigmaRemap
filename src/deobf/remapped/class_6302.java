package remapped;

public class class_6302 extends class_7157 {
   private static String[] field_32195;

   public class_6302(class_4639 var1) {
      super(var1);
   }

   public boolean method_28757(class_6946 var1, class_6486 var2) {
      int var5 = 0;
      class_6098 var6 = class_6098.field_31203;

      for (int var7 = 0; var7 < var1.method_31505(); var7++) {
         class_6098 var8 = var1.method_31498(var7);
         if (!var8.method_28022()) {
            if (var8.method_27960() != class_4897.field_25262) {
               if (var8.method_27960() != class_4897.field_25113) {
                  return false;
               }

               var5++;
            } else {
               if (!var6.method_28022()) {
                  return false;
               }

               var6 = var8;
            }
         }
      }

      return !var6.method_28022() && var5 > 0;
   }

   public class_6098 method_28756(class_6946 var1) {
      int var4 = 0;
      class_6098 var5 = class_6098.field_31203;

      for (int var6 = 0; var6 < var1.method_31505(); var6++) {
         class_6098 var7 = var1.method_31498(var6);
         if (!var7.method_28022()) {
            if (var7.method_27960() != class_4897.field_25262) {
               if (var7.method_27960() != class_4897.field_25113) {
                  return class_6098.field_31203;
               }

               var4++;
            } else {
               if (!var5.method_28022()) {
                  return class_6098.field_31203;
               }

               var5 = var7;
            }
         }
      }

      if (!var5.method_28022() && var4 >= 1) {
         class_6098 var8 = var5.method_27973();
         var8.method_28017(var4 + 1);
         return var8;
      } else {
         return class_6098.field_31203;
      }
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14714;
   }
}
