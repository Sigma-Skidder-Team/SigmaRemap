package remapped;

public class class_3980 {
   public static final int field_19369 = 1;
   public static final int field_19370 = 2;
   public static final int field_19371 = 3;
   public static final int field_19374 = 4;
   private static class_1299 field_19375 = new class_360();
   private static class_1810 field_19372 = new class_5114();

   public static void method_18364(int var0) {
      switch (var0) {
         case 1:
            method_18365(new class_360());
            return;
         case 2:
            method_18365(new class_9644());
            return;
         default:
            throw new RuntimeException("Unknown renderer type: " + var0);
      }
   }

   public static void method_18366(int var0) {
      switch (var0) {
         case 3:
            method_18367(new class_5114());
            return;
         case 4:
            method_18367(new class_2873());
            return;
         default:
            throw new RuntimeException("Unknown line strip renderer type: " + var0);
      }
   }

   public static void method_18367(class_1810 var0) {
      field_19372 = var0;
   }

   public static void method_18365(class_1299 var0) {
      field_19375 = var0;
   }

   public static class_1299 method_18363() {
      return field_19375;
   }

   public static class_1810 method_18361() {
      return field_19372;
   }
}
