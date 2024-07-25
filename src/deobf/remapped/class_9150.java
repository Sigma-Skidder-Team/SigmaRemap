package remapped;

import com.google.gson.JsonObject;

public class class_9150 extends class_4569 {
   private final class_6414 field_46819;
   private final class_1827 field_46821;

   public class_9150(class_8938 var1, class_6414 var2, class_1827 var3) {
      super(class_7363.method_33533(), var1);
      this.field_46819 = var2;
      this.field_46821 = var3;
   }

   public static class_9150 method_42115(class_6414 var0) {
      return new class_9150(class_8938.field_45798, var0, class_1827.field_9269);
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      if (this.field_46819 != null) {
         var4.addProperty("block", class_8669.field_44462.method_39797(this.field_46819).toString());
      }

      var4.add("state", this.field_46821.method_8078());
      return var4;
   }

   public boolean method_42114(class_2522 var1) {
      return this.field_46819 != null && !var1.method_8350(this.field_46819) ? false : this.field_46821.method_8076(var1);
   }
}
