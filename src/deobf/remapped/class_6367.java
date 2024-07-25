package remapped;

import com.google.gson.JsonObject;

public class class_6367 extends class_4569 {
   private final class_5319 field_32545;
   private final class_8938 field_32546;

   public class_6367(class_8938 var1, class_5319 var2, class_8938 var3) {
      super(class_3662.method_17000(), var1);
      this.field_32545 = var2;
      this.field_32546 = var3;
   }

   public static class_6367 method_29144(class_8938 var0, class_9518 var1, class_8938 var2) {
      return new class_6367(var0, var1.method_43921(), var2);
   }

   public boolean method_29145(class_6098 var1, class_2792 var2) {
      return this.field_32545.method_24266(var1) ? this.field_32546.method_41071(var2) : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("item", this.field_32545.method_24265());
      var4.add("entity", this.field_32546.method_41067(var1));
      return var4;
   }
}
