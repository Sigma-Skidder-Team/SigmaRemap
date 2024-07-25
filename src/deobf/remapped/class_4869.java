package remapped;

public class class_4869 {
   private static String[] field_24234;

   public static int method_22375(class_6486 var0) {
      return var0 != null ? method_22374(var0.method_29545()) : 0;
   }

   public static int method_22374(class_5621<class_6486> var0) {
      if (var0 != class_6486.field_33029) {
         if (var0 != class_6486.field_33048) {
            return var0 != class_6486.field_33038 ? 0 : 1;
         } else {
            return 0;
         }
      } else {
         return -1;
      }
   }

   public static boolean method_22377(class_6486 var0) {
      return var0.method_29545() == class_6486.field_33029;
   }

   public static boolean method_22376(class_6486 var0) {
      class_5621 var3 = var0.method_29545();
      return method_22374(var3) == 0;
   }

   public static boolean method_22378(class_6486 var0) {
      return var0.method_29545() == class_6486.field_33038;
   }
}
