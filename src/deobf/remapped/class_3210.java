package remapped;

public class class_3210 implements class_4529 {
   private static String[] field_16016;

   private class_3210(class_1223 var1) {
      this.field_16017 = var1;
   }

   @Override
   public class_8087 method_21045() {
      if (!this.field_16017.field_6776.method_6622(class_7523.field_38403)) {
         class_1223.method_5427(this.field_16017, new class_2594(this.field_16017, false));
         class_4610 var4 = this.field_16017.field_6776.method_6623();
         return class_1223.method_5421(this.field_16017, var4.method_21372());
      } else {
         class_4610 var3 = this.field_16017.field_6776.method_6624();
         if (this.field_16017.field_6776.method_6622(class_7523.field_38419, class_7523.field_38404)) {
            class_1223.method_5427(this.field_16017, new class_2594(this.field_16017, false));
            return class_1223.method_5421(this.field_16017, var3.method_21374());
         } else {
            class_1223.method_5417(this.field_16017).method_39588(new class_2594(this.field_16017, false));
            return class_1223.method_5424(this.field_16017);
         }
      }
   }
}
