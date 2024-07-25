package remapped;

import com.google.gson.JsonObject;

public class class_8367 extends class_4569 {
   private final class_5319 field_42838;

   public class_8367(class_8938 var1, class_5319 var2) {
      super(class_2074.method_9681(), var1);
      this.field_42838 = var2;
   }

   public static class_8367 method_38555(class_8525 var0) {
      return new class_8367(class_8938.field_45798, class_9518.method_43918().method_43915(var0).method_43921());
   }

   public boolean method_38556(ItemStack var1) {
      return this.field_42838.method_24266(var1);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("item", this.field_42838.method_24265());
      return var4;
   }
}
