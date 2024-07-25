package remapped;

import com.google.gson.JsonObject;

public class class_3789 extends class_4569 {
   private final class_4639 field_18508;

   public class_3789(class_8938 var1, class_4639 var2) {
      super(class_8435.method_38808(), var1);
      this.field_18508 = var2;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.addProperty("recipe", this.field_18508.toString());
      return var4;
   }

   public boolean method_17593(class_8932<?> var1) {
      return this.field_18508.equals(var1.method_41050());
   }
}
