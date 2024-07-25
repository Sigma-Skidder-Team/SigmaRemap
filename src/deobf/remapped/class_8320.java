package remapped;

public class class_8320 implements class_7446 {
   public class_8320(class_6586 var1, class_6586 var2) {
      this.field_42616 = var1;
      this.field_42618 = var2;
   }

   @Override
   public boolean method_33885(class_8970 var1, int var2, int var3) {
      if (class_6586.method_30083(this.field_42618) == class_8029.field_41097) {
         class_6586.method_30095(this.field_42618);
      }

      if (!"close".equals(var1.field_45957)) {
         class_6586.method_30096(this.field_42618, var1);
         return true;
      } else {
         class_6586.method_30088(this.field_42618);
         return false;
      }
   }
}
