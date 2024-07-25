package remapped;

public class class_2685 implements class_4529 {
   private class_2685(class_1223 var1) {
      this.field_13159 = var1;
   }

   @Override
   public class_8087 method_21045() {
      if (!this.field_13159.field_6776.method_6622(class_7523.field_38416)) {
         if (this.field_13159.field_6776.method_6622(class_7523.field_38399)) {
            class_4610 var6 = this.field_13159.field_6776.method_6624();
            class_6130 var4 = new class_6130(var6.method_21372(), var6.method_21374());
            class_1223.method_5427(this.field_13159, (class_4529)class_1223.method_5417(this.field_13159).method_39590());
            class_1223.method_5416(this.field_13159).method_39590();
            return var4;
         } else {
            class_4610 var5 = this.field_13159.field_6776.method_6623();
            throw new class_7936(
               "while parsing a block collection",
               (class_404)class_1223.method_5416(this.field_13159).method_39590(),
               "expected <block end>, but found '" + var5.method_21371() + "'",
               var5.method_21372()
            );
         }
      } else {
         class_5308 var3 = (class_5308)this.field_13159.field_6776.method_6624();
         if (this.field_13159.field_6776.method_6622(class_7523.field_38416, class_7523.field_38399)) {
            class_1223.method_5427(this.field_13159, new class_2685(this.field_13159));
            return class_1223.method_5421(this.field_13159, var3.method_21374());
         } else {
            class_1223.method_5417(this.field_13159).method_39588(new class_2685(this.field_13159));
            return new class_2217(this.field_13159, null).method_21045();
         }
      }
   }
}
