package remapped;

import com.google.gson.JsonObject;

public class class_146 extends class_4569 {
   private final class_8938 field_421;

   public class_146(class_8938 var1, class_8938 var2) {
      super(class_4950.method_22683(), var1);
      this.field_421 = var2;
   }

   public static class_146 method_566(class_2184 var0) {
      return new class_146(class_8938.field_45798, class_8938.method_41064(var0.method_10139()));
   }

   public boolean method_567(class_2792 var1) {
      return this.field_421.method_41071(var1);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("entity", this.field_421.method_41067(var1));
      return var4;
   }
}
