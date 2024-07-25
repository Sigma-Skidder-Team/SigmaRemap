package remapped;

import com.google.gson.JsonObject;

public class class_5755 extends class_4569 {
   private final class_5319 field_29121;

   public class_5755(class_8938 var1, class_5319 var2) {
      super(class_9620.method_44416(), var1);
      this.field_29121 = var2;
   }

   public static class_5755 method_26042(class_5319 var0) {
      return new class_5755(class_8938.field_45798, var0);
   }

   public boolean method_26043(class_6098 var1) {
      return this.field_29121.method_24266(var1);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("item", this.field_29121.method_24265());
      return var4;
   }
}
