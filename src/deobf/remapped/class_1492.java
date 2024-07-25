package remapped;

import com.google.gson.JsonObject;

public class class_1492 extends class_4569 {
   private final Identifier field_7945;

   public class_1492(class_8938 var1, Identifier var2) {
      super(class_6087.method_27871(), var1);
      this.field_7945 = var2;
   }

   public static class_1492 method_6886(Identifier var0) {
      return new class_1492(class_8938.field_45798, var0);
   }

   public boolean method_6887(Identifier var1) {
      return this.field_7945.equals(var1);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.addProperty("loot_table", this.field_7945.toString());
      return var4;
   }
}
