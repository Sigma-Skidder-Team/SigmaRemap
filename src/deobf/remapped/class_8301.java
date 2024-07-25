package remapped;

public class class_8301 implements class_4529 {
   private static String[] field_42534;

   private class_8301(class_1223 var1) {
      this.field_42535 = var1;
   }

   @Override
   public class_8087 method_21045() {
      class_4610 var3 = this.field_42535.field_6776.method_6623();
      class_404 var4 = var3.method_21372();
      class_404 var5 = var4;
      boolean var6 = false;
      if (this.field_42535.field_6776.method_6622(class_7523.field_38421)) {
         var3 = this.field_42535.field_6776.method_6624();
         var5 = var3.method_21374();
         var6 = true;
      }

      class_1927 var7 = new class_1927(var4, var5, var6);
      class_1223.method_5427(this.field_42535, new class_4760(this.field_42535, null));
      return var7;
   }
}
