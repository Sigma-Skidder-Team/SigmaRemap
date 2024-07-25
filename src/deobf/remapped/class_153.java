package remapped;

import java.util.BitSet;

public class class_153 {
   private static String[] field_466;
   private static boolean field_463;
   private static BitSet field_464 = new BitSet();
   private static BitSet field_465 = new BitSet();

   public static boolean method_611() {
      return field_463 && !class_6588.field_33945;
   }

   public static void method_613() {
      field_463 = class_3111.method_14310().field_45478;
   }

   public static void method_609(class_5155 var0) {
      if (var0.method_23596()) {
         int var3 = var0.method_23612();
         if (var3 >= 0) {
            field_464.set(var3);
         }
      }
   }

   public static void method_614(BitSet var0) {
      if (var0 != null) {
         field_464.or(var0);
      }
   }

   public static boolean method_618(class_5155 var0) {
      if (var0.method_23596()) {
         int var3 = var0.method_23612();
         return var3 >= 0 ? field_464.get(var3) : false;
      } else {
         return true;
      }
   }

   public static void method_617(class_8359 var0) {
      if (var0.method_38529()) {
         field_464.clear();
      }
   }

   public static void method_612(int var0) {
      if (var0 >= 0) {
         field_465.set(var0);
      }
   }

   public static boolean method_616(int var0) {
      return var0 >= 0 ? field_465.get(var0) : false;
   }

   public static void method_610() {
      field_465.clear();
   }
}
