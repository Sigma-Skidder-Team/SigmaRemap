package remapped;

public class class_5222 implements class_4529 {
   private boolean field_26803;

   public class_5222(class_1223 var1, boolean var2) {
      this.field_26801 = var1;
      this.field_26803 = false;
      this.field_26803 = var2;
   }

   @Override
   public class_8087 method_21045() {
      if (!this.field_26801.field_6776.method_6622(class_7523.field_38418)) {
         if (!this.field_26803) {
            if (!this.field_26801.field_6776.method_6622(class_7523.field_38419)) {
               class_4610 var6 = this.field_26801.field_6776.method_6623();
               throw new class_7936(
                  "while parsing a flow sequence",
                  (class_404)class_1223.method_5416(this.field_26801).method_39590(),
                  "expected ',' or ']', but got " + var6.method_21371(),
                  var6.method_21372()
               );
            }

            this.field_26801.field_6776.method_6624();
         }

         if (this.field_26801.field_6776.method_6622(class_7523.field_38401)) {
            class_4610 var5 = this.field_26801.field_6776.method_6623();
            class_3659 var7 = new class_3659(null, null, true, var5.method_21372(), var5.method_21374(), class_435.field_1826);
            class_1223.method_5427(this.field_26801, new class_1132(this.field_26801, null));
            return var7;
         }

         if (!this.field_26801.field_6776.method_6622(class_7523.field_38418)) {
            class_1223.method_5417(this.field_26801).method_39588(new class_5222(this.field_26801, false));
            return class_1223.method_5424(this.field_26801);
         }
      }

      class_4610 var3 = this.field_26801.field_6776.method_6624();
      class_6130 var4 = new class_6130(var3.method_21372(), var3.method_21374());
      class_1223.method_5427(this.field_26801, (class_4529)class_1223.method_5417(this.field_26801).method_39590());
      class_1223.method_5416(this.field_26801).method_39590();
      return var4;
   }
}
