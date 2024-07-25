package remapped;

import com.google.gson.JsonObject;

public class class_6398 extends class_4569 {
   private final class_5093 field_32668;
   private final class_5319 field_32667;

   public class_6398(class_8938 var1, class_5093 var2, class_5319 var3) {
      super(class_321.method_1492(), var1);
      this.field_32668 = var2;
      this.field_32667 = var3;
   }

   public static class_6398 method_29212(class_6352 var0, class_9518 var1) {
      return new class_6398(class_8938.field_45798, var0.method_29097(), var1.method_43921());
   }

   public boolean method_29213(class_2522 var1, class_6331 var2, class_1331 var3, class_6098 var4) {
      return this.field_32668.method_23401(var2, (double)var3.method_12173() + 0.5, (double)var3.method_12165() + 0.5, (double)var3.method_12185() + 0.5)
         ? this.field_32667.method_24266(var4)
         : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("location", this.field_32668.method_23398());
      var4.add("item", this.field_32667.method_24265());
      return var4;
   }
}
