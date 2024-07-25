package remapped;

import com.google.gson.JsonObject;

public class class_7032 extends class_4569 {
   private final class_8938 field_36208;

   public class_7032(class_8938 var1, class_8938 var2) {
      super(class_7997.method_36291(), var1);
      this.field_36208 = var2;
   }

   public static class_7032 method_32074() {
      return new class_7032(class_8938.field_45798, class_8938.field_45798);
   }

   public static class_7032 method_32072(class_865 var0) {
      return new class_7032(class_8938.field_45798, class_8938.method_41064(var0));
   }

   public boolean method_32073(class_2792 var1) {
      return this.field_36208.method_41071(var1);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("entity", this.field_36208.method_41067(var1));
      return var4;
   }
}
