package remapped;

import com.google.gson.JsonObject;

public class class_7695 extends class_4569 {
   private final class_8255 field_39069;

   public class_7695(class_8938 var1, class_8255 var2) {
      super(class_3242.method_14840(), var1);
      this.field_39069 = var2;
   }

   public static class_7695 method_34864(class_6724 var0) {
      return new class_7695(class_8938.field_45798, var0.method_30856());
   }

   public boolean method_34865(class_9359 var1, class_6199 var2, float var3, float var4, boolean var5) {
      return this.field_39069.method_37842(var1, var2, var3, var4, var5);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("damage", this.field_39069.method_37843());
      return var4;
   }
}
