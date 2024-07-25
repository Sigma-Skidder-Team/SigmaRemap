package remapped;

public class class_4760 implements class_4529 {
   private class_4760(class_1223 var1) {
      this.field_23044 = var1;
   }

   @Override
   public class_8087 method_21045() {
      while (this.field_23044.field_6776.method_6622(class_7523.field_38421)) {
         this.field_23044.field_6776.method_6624();
      }

      Object var4;
      if (this.field_23044.field_6776.method_6622(class_7523.field_38408)) {
         class_2223 var3 = (class_2223)this.field_23044.field_6776.method_6624();
         var4 = new class_2946(var3.method_21372(), var3.method_21374());
         if (!class_1223.method_5417(this.field_23044).method_39591()) {
            throw new class_5251("Unexpected end of stream. States left: " + class_1223.method_5417(this.field_23044));
         }

         if (!class_1223.method_5416(this.field_23044).method_39591()) {
            throw new class_5251("Unexpected end of stream. Marks left: " + class_1223.method_5416(this.field_23044));
         }

         class_1223.method_5427(this.field_23044, null);
      } else {
         class_4610 var8 = this.field_23044.field_6776.method_6623();
         class_404 var5 = var8.method_21372();
         class_4319 var6 = class_1223.method_5420(this.field_23044);
         if (!this.field_23044.field_6776.method_6622(class_7523.field_38409)) {
            throw new class_7936(
               null,
               null,
               "expected '<document start>', but found '" + this.field_23044.field_6776.method_6623().method_21371() + "'",
               this.field_23044.field_6776.method_6623().method_21372()
            );
         }

         var8 = this.field_23044.field_6776.method_6624();
         class_404 var7 = var8.method_21374();
         var4 = new class_922(var5, var7, true, var6.method_20102(), var6.method_20101());
         class_1223.method_5417(this.field_23044).method_39588(new class_8301(this.field_23044, null));
         class_1223.method_5427(this.field_23044, new class_492(this.field_23044, null));
      }

      return (class_8087)var4;
   }
}
