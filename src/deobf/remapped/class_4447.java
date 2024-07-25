package remapped;

import com.google.gson.JsonObject;

public class class_4447 extends class_4569 {
   private final class_5319 field_21680;
   private final class_8938 field_21679;

   public class_4447(class_8938 var1, class_5319 var2, class_8938 var3) {
      super(class_3165.method_14610(), var1);
      this.field_21680 = var2;
      this.field_21679 = var3;
   }

   public static class_4447 method_20623(class_8938 var0, class_9518 var1, class_8938 var2) {
      return new class_4447(var0, var1.method_43921(), var2);
   }

   public boolean method_20622(class_9359 var1, class_6098 var2, class_2792 var3) {
      return this.field_21680.method_24266(var2) ? this.field_21679.method_41071(var3) : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("item", this.field_21680.method_24265());
      var4.add("entity", this.field_21679.method_41067(var1));
      return var4;
   }
}
