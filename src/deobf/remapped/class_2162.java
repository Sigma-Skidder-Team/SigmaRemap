package remapped;

import com.google.gson.JsonObject;

public class class_2162 extends class_4569 {
   private final class_8286 field_10792;

   public class_2162(class_8938 var1, class_8286 var2) {
      super(class_4947.method_22667(), var1);
      this.field_10792 = var2;
   }

   public static class_2162 method_10059(class_8286 var0) {
      return new class_2162(class_8938.field_45798, var0);
   }

   public boolean method_10058(class_9359 var1) {
      return this.field_10792.method_38240(var1);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("effects", this.field_10792.method_38236());
      return var4;
   }
}
