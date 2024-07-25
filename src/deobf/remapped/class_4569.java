package remapped;

import com.google.gson.JsonObject;

public abstract class class_4569 implements class_5154 {
   private final class_4639 field_22263;
   private final class_8938 field_22262;

   public class_4569(class_4639 var1, class_8938 var2) {
      this.field_22263 = var1;
      this.field_22262 = var2;
   }

   @Override
   public class_4639 method_23585() {
      return this.field_22263;
   }

   public class_8938 method_21209() {
      return this.field_22262;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = new JsonObject();
      var4.add("player", this.field_22262.method_41067(var1));
      return var4;
   }

   @Override
   public String toString() {
      return "AbstractCriterionInstance{criterion=" + this.field_22263 + '}';
   }
}
