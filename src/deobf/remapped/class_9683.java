package remapped;

import com.google.gson.JsonObject;

public class class_9683 extends class_4569 {
   private final class_5319 field_49291;
   private final class_7781 field_49293;
   private final class_7781 field_49292;

   public class_9683(class_8938 var1, class_5319 var2, class_7781 var3, class_7781 var4) {
      super(class_1819.method_8056(), var1);
      this.field_49291 = var2;
      this.field_49293 = var3;
      this.field_49292 = var4;
   }

   public static class_9683 method_44772(class_8938 var0, class_5319 var1, class_7781 var2) {
      return new class_9683(var0, var1, var2, class_7781.field_39439);
   }

   public boolean method_44773(class_6098 var1, int var2) {
      if (this.field_49291.method_24266(var1)) {
         return this.field_49293.method_35307(var1.method_27957() - var2) ? this.field_49292.method_35307(var1.method_28026() - var2) : false;
      } else {
         return false;
      }
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("item", this.field_49291.method_24265());
      var4.add("durability", this.field_49293.method_27853());
      var4.add("delta", this.field_49292.method_27853());
      return var4;
   }
}
