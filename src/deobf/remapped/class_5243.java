package remapped;

public class class_5243 extends class_7764 {
   private static String[] field_26864;
   private class_1331 field_26866;
   private class_4190 field_26863;
   public static boolean field_26865 = false;

   public class_5243(class_1331 var1, class_4190 var2) {
      this.field_26866 = var1;
      this.field_26863 = var2;
   }

   public class_1331 method_23989() {
      return this.field_26866;
   }

   public class_4190 method_23988() {
      return this.field_26863;
   }

   public void method_23987(class_1331 var1) {
      this.field_26866 = var1;
   }

   public void method_23986(class_4190 var1) {
      if (var1 == null) {
         var1 = class_3370.method_15522(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      }

      this.field_26863 = var1;
   }
}
