package remapped;

public class class_4754 {
   private static String[] field_23027;

   public static class_954<class_6098> method_21939(World var0, class_704 var1, class_2584 var2) {
      var1.method_26462(var2);
      return class_954.<class_6098>method_4206(var1.method_26617(var2));
   }

   public static class_6098 method_21942(class_6098 var0, class_704 var1, class_6098 var2, boolean var3) {
      boolean var6 = var1.field_3876.field_4944;
      if (var3 && var6) {
         if (!var1.field_3853.method_32405(var2)) {
            var1.field_3853.method_32414(var2);
         }

         return var0;
      } else {
         if (!var6) {
            var0.method_27970(1);
         }

         if (!var0.method_28022()) {
            if (!var1.field_3853.method_32414(var2)) {
               var1.method_3153(var2, false);
            }

            return var0;
         } else {
            return var2;
         }
      }
   }

   public static class_6098 method_21940(class_6098 var0, class_704 var1, class_6098 var2) {
      return method_21942(var0, var1, var2, true);
   }
}
