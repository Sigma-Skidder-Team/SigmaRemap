package remapped;

import com.google.gson.JsonObject;

public class class_9203 extends class_4569 {
   private final class_8938 field_47082;
   private final class_5319 field_47081;

   public class_9203(class_8938 var1, class_8938 var2, class_5319 var3) {
      super(class_3488.method_16040(), var1);
      this.field_47082 = var2;
      this.field_47081 = var3;
   }

   public static class_9203 method_42463() {
      return new class_9203(class_8938.field_45798, class_8938.field_45798, class_5319.field_27132);
   }

   public boolean method_42462(class_2792 var1, ItemStack var2) {
      return this.field_47082.method_41071(var1) ? this.field_47081.method_24266(var2) : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("item", this.field_47081.method_24265());
      var4.add("villager", this.field_47082.method_41067(var1));
      return var4;
   }
}
