package remapped;

public class class_6469 extends class_7157 {
   private static String[] field_32958;

   public class_6469(Identifier var1) {
      super(var1);
   }

   public boolean method_29458(class_6946 var1, class_6486 var2) {
      int var5 = 0;
      int var6 = 0;

      for (int var7 = 0; var7 < var1.method_31505(); var7++) {
         class_6098 var8 = var1.method_31498(var7);
         if (!var8.method_28022()) {
            if (!(class_6414.method_29269(var8.method_27960()) instanceof class_3153)) {
               if (!(var8.method_27960() instanceof class_239)) {
                  return false;
               }

               var6++;
            } else {
               var5++;
            }

            if (var6 > 1 || var5 > 1) {
               return false;
            }
         }
      }

      return var5 == 1 && var6 == 1;
   }

   public class_6098 method_29457(class_6946 var1) {
      class_6098 var4 = class_6098.field_31203;
      class_239 var5 = (class_239)class_4897.field_24903;

      for (int var6 = 0; var6 < var1.method_31505(); var6++) {
         class_6098 var7 = var1.method_31498(var6);
         if (!var7.method_28022()) {
            class_2451 var8 = var7.method_27960();
            if (!(class_6414.method_29269(var8) instanceof class_3153)) {
               if (var8 instanceof class_239) {
                  var5 = (class_239)var8;
               }
            } else {
               var4 = var7;
            }
         }
      }

      class_6098 var9 = class_3153.method_14550(var5.method_1015());
      if (var4.method_28002()) {
         var9.method_27965(var4.method_27990().method_25944());
      }

      return var9;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14708;
   }
}
