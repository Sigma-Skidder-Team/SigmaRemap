package remapped;

public class class_317 {
   private int field_1172 = 64;
   private int field_1169;
   private class_2451 field_1166;
   private class_8230 field_1173;
   private class_5053 field_1167 = class_5053.field_26116;
   private class_8341 field_1168;
   private boolean field_1170;

   public class_317 method_1483(class_8341 var1) {
      this.field_1168 = var1;
      return this;
   }

   public class_317 method_1480(int var1) {
      if (this.field_1169 <= 0) {
         this.field_1172 = var1;
         return this;
      } else {
         throw new RuntimeException("Unable to have damage AND stack.");
      }
   }

   public class_317 method_1471(int var1) {
      return this.field_1169 != 0 ? this : this.method_1478(var1);
   }

   public class_317 method_1478(int var1) {
      this.field_1169 = var1;
      this.field_1172 = 1;
      return this;
   }

   public class_317 method_1485(class_2451 var1) {
      this.field_1166 = var1;
      return this;
   }

   public class_317 method_1474(class_8230 var1) {
      this.field_1173 = var1;
      return this;
   }

   public class_317 method_1477(class_5053 var1) {
      this.field_1167 = var1;
      return this;
   }

   public class_317 method_1481() {
      this.field_1170 = true;
      return this;
   }
}
