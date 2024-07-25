package remapped;

import com.google.gson.JsonObject;

public class class_4558 extends class_4569 {
   private final class_8938 field_22204;
   private final class_8938 field_22206;

   public class_4558(class_8938 var1, class_8938 var2, class_8938 var3) {
      super(class_8565.method_39402(), var1);
      this.field_22204 = var2;
      this.field_22206 = var3;
   }

   public static class_4558 method_21126() {
      return new class_4558(class_8938.field_45798, class_8938.field_45798, class_8938.field_45798);
   }

   public boolean method_21125(class_2792 var1, class_2792 var2) {
      return this.field_22204.method_41071(var1) ? this.field_22206.method_41071(var2) : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("zombie", this.field_22204.method_41067(var1));
      var4.add("villager", this.field_22206.method_41067(var1));
      return var4;
   }
}
