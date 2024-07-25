package remapped;

import com.google.gson.JsonObject;

public class class_5483 extends class_4569 {
   private final class_6414 field_27924;
   private final class_1827 field_27925;

   public class_5483(class_8938 var1, class_6414 var2, class_1827 var3) {
      super(class_1836.method_8114(), var1);
      this.field_27924 = var2;
      this.field_27925 = var3;
   }

   public static class_5483 method_24904(class_6414 var0) {
      return new class_5483(class_8938.field_45798, var0, class_1827.field_9269);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      if (this.field_27924 != null) {
         var4.addProperty("block", class_8669.field_44462.method_39797(this.field_27924).toString());
      }

      var4.add("state", this.field_27925.method_8078());
      return var4;
   }

   public boolean method_24905(class_2522 var1) {
      return this.field_27924 != null && !var1.method_8350(this.field_27924) ? false : this.field_27925.method_8076(var1);
   }
}
