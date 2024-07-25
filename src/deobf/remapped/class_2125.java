package remapped;

import com.google.gson.JsonObject;

public class class_2125 extends class_4569 {
   private final class_5319 field_10644;

   public class_2125(class_8938 var1, class_5319 var2) {
      super(class_9386.method_43402(), var1);
      this.field_10644 = var2;
   }

   public static class_2125 method_9927() {
      return new class_2125(class_8938.field_45798, class_5319.field_27132);
   }

   public static class_2125 method_9928(class_8525 var0) {
      return new class_2125(
         class_8938.field_45798,
         new class_5319(
            (class_2307<class_2451>)null,
            var0.method_10803(),
            class_7781.field_39439,
            class_7781.field_39439,
            class_5187.field_26690,
            class_5187.field_26690,
            (class_6004)null,
            class_6000.field_30559
         )
      );
   }

   public boolean method_9929(class_6098 var1) {
      return this.field_10644.method_24266(var1);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("item", this.field_10644.method_24265());
      return var4;
   }
}
