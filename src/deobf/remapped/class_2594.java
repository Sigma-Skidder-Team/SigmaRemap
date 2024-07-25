package remapped;

public class class_2594 implements class_4529 {
   private boolean field_12826;

   public class_2594(class_1223 var1, boolean var2) {
      this.field_12825 = var1;
      this.field_12826 = false;
      this.field_12826 = var2;
   }

   @Override
   public class_8087 method_21045() {
      if (!this.field_12825.field_6776.method_6622(class_7523.field_38404)) {
         if (!this.field_12826) {
            if (!this.field_12825.field_6776.method_6622(class_7523.field_38419)) {
               class_4610 var6 = this.field_12825.field_6776.method_6623();
               throw new class_7936(
                  "while parsing a flow mapping",
                  (class_404)class_1223.method_5416(this.field_12825).method_39590(),
                  "expected ',' or '}', but got " + var6.method_21371(),
                  var6.method_21372()
               );
            }

            this.field_12825.field_6776.method_6624();
         }

         if (this.field_12825.field_6776.method_6622(class_7523.field_38401)) {
            class_4610 var5 = this.field_12825.field_6776.method_6624();
            if (this.field_12825.field_6776.method_6622(class_7523.field_38403, class_7523.field_38419, class_7523.field_38404)) {
               class_1223.method_5427(this.field_12825, new class_3210(this.field_12825, null));
               return class_1223.method_5421(this.field_12825, var5.method_21374());
            }

            class_1223.method_5417(this.field_12825).method_39588(new class_3210(this.field_12825, null));
            return class_1223.method_5424(this.field_12825);
         }

         if (!this.field_12825.field_6776.method_6622(class_7523.field_38404)) {
            class_1223.method_5417(this.field_12825).method_39588(new class_5713(this.field_12825, null));
            return class_1223.method_5424(this.field_12825);
         }
      }

      class_4610 var3 = this.field_12825.field_6776.method_6624();
      class_4363 var4 = new class_4363(var3.method_21372(), var3.method_21374());
      class_1223.method_5427(this.field_12825, (class_4529)class_1223.method_5417(this.field_12825).method_39590());
      class_1223.method_5416(this.field_12825).method_39590();
      return var4;
   }
}
