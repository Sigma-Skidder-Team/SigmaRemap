package remapped;

import com.google.gson.JsonObject;

public class class_7888 extends class_4569 {
   private final class_5621<class_6486> field_40356;
   private final class_5621<class_6486> field_40355;

   public class_7888(class_8938 var1, class_5621<class_6486> var2, class_5621<class_6486> var3) {
      super(class_8459.method_38906(), var1);
      this.field_40356 = var2;
      this.field_40355 = var3;
   }

   public static class_7888 method_35667(class_5621<class_6486> var0) {
      return new class_7888(class_8938.field_45798, (class_5621<class_6486>)null, var0);
   }

   public boolean method_35666(class_5621<class_6486> var1, class_5621<class_6486> var2) {
      return this.field_40356 != null && this.field_40356 != var1 ? false : this.field_40355 == null || this.field_40355 == var2;
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      if (this.field_40356 != null) {
         var4.addProperty("from", this.field_40356.method_25499().toString());
      }

      if (this.field_40355 != null) {
         var4.addProperty("to", this.field_40355.method_25499().toString());
      }

      return var4;
   }
}
