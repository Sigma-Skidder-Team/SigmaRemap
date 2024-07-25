package remapped;

public class class_6883 implements class_4529 {
   private static String[] field_35430;

   private class_6883(class_1223 var1) {
      this.field_35429 = var1;
   }

   @Override
   public class_8087 method_21045() {
      if (!this.field_35429.field_6776.method_6622(class_7523.field_38416)) {
         class_4610 var5 = this.field_35429.field_6776.method_6623();
         class_6130 var4 = new class_6130(var5.method_21372(), var5.method_21374());
         class_1223.method_5427(this.field_35429, (class_4529)class_1223.method_5417(this.field_35429).method_39590());
         return var4;
      } else {
         class_4610 var3 = this.field_35429.field_6776.method_6624();
         if (this.field_35429.field_6776.method_6622(class_7523.field_38416, class_7523.field_38401, class_7523.field_38403, class_7523.field_38399)) {
            class_1223.method_5427(this.field_35429, new class_6883(this.field_35429));
            return class_1223.method_5421(this.field_35429, var3.method_21374());
         } else {
            class_1223.method_5417(this.field_35429).method_39588(new class_6883(this.field_35429));
            return new class_2217(this.field_35429, null).method_21045();
         }
      }
   }
}
