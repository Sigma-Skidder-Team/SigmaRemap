package remapped;

import com.google.gson.JsonObject;

public class class_2270 extends class_4569 {
   private final class_5093 field_11283;

   public class_2270(Identifier var1, class_8938 var2, class_5093 var3) {
      super(var1, var2);
      this.field_11283 = var3;
   }

   public static class_2270 method_10475(class_5093 var0) {
      return new class_2270(class_1663.method_7407(class_8807.field_45067), class_8938.field_45798, var0);
   }

   public static class_2270 method_10474() {
      return new class_2270(class_1663.method_7407(class_8807.field_45071), class_8938.field_45798, class_5093.field_26274);
   }

   public static class_2270 method_10472() {
      return new class_2270(class_1663.method_7407(class_8807.field_45064), class_8938.field_45798, class_5093.field_26274);
   }

   public boolean method_10473(class_6331 var1, double var2, double var4, double var6) {
      return this.field_11283.method_23401(var1, var2, var4, var6);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("location", this.field_11283.method_23398());
      return var4;
   }
}
