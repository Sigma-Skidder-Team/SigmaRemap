package remapped;

import com.google.gson.JsonObject;

public class class_9853 extends class_4569 {
   private final class_5319 field_49879;
   private final class_7781 field_49878;

   public class_9853(class_8938 var1, class_5319 var2, class_7781 var3) {
      super(class_5800.method_26283(), var1);
      this.field_49879 = var2;
      this.field_49878 = var3;
   }

   public static class_9853 method_45374() {
      return new class_9853(class_8938.field_45798, class_5319.field_27132, class_7781.field_39439);
   }

   public boolean method_45373(class_6098 var1, int var2) {
      return this.field_49879.method_24266(var1) ? this.field_49878.method_35307(var2) : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("item", this.field_49879.method_24265());
      var4.add("levels", this.field_49878.method_27853());
      return var4;
   }
}
