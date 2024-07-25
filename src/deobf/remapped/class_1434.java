package remapped;

import com.google.gson.JsonObject;

public class class_1434 extends class_4569 {
   private final class_6004 field_7744;

   public class_1434(class_8938 var1, class_6004 var2) {
      super(class_2809.method_12762(), var1);
      this.field_7744 = var2;
   }

   public static class_1434 method_6585() {
      return new class_1434(class_8938.field_45798, (class_6004)null);
   }

   public boolean method_6584(class_6004 var1) {
      return this.field_7744 == null || this.field_7744 == var1;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      if (this.field_7744 != null) {
         var4.addProperty("potion", class_8669.field_44365.method_39797(this.field_7744).toString());
      }

      return var4;
   }
}
