package remapped;

import com.google.gson.JsonObject;

public class class_3324 extends class_4569 {
   private final class_8255 field_16418;
   private final class_8938 field_16417;

   public class_3324(class_8938 var1, class_8255 var2, class_8938 var3) {
      super(class_7121.method_32723(), var1);
      this.field_16418 = var2;
      this.field_16417 = var3;
   }

   public static class_3324 method_15278(class_6724 var0) {
      return new class_3324(class_8938.field_45798, var0.method_30856(), class_8938.field_45798);
   }

   public boolean method_15277(class_9359 var1, class_2792 var2, class_6199 var3, float var4, float var5, boolean var6) {
      return this.field_16418.method_37842(var1, var3, var4, var5, var6) ? this.field_16417.method_41071(var2) : false;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("damage", this.field_16418.method_37843());
      var4.add("entity", this.field_16417.method_41067(var1));
      return var4;
   }
}
