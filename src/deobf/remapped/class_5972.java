package remapped;

import com.google.gson.JsonObject;

public class class_5972 extends class_4569 {
   private final class_6414 field_30418;
   private final class_1827 field_30419;
   private final class_5093 field_30421;
   private final class_5319 field_30420;

   public class_5972(class_8938 var1, class_6414 var2, class_1827 var3, class_5093 var4, class_5319 var5) {
      super(class_2319.method_10663(), var1);
      this.field_30418 = var2;
      this.field_30419 = var3;
      this.field_30421 = var4;
      this.field_30420 = var5;
   }

   public static class_5972 method_27270(class_6414 var0) {
      return new class_5972(class_8938.field_45798, var0, class_1827.field_9269, class_5093.field_26274, class_5319.field_27132);
   }

   public boolean method_27271(class_2522 var1, BlockPos var2, class_6331 var3, ItemStack var4) {
      if (this.field_30418 != null && !var1.method_8350(this.field_30418)) {
         return false;
      } else if (this.field_30419.method_8076(var1)) {
         return this.field_30421.method_23402(var3, (float)var2.method_12173(), (float)var2.method_12165(), (float)var2.method_12185())
            ? this.field_30420.method_24266(var4)
            : false;
      } else {
         return false;
      }
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      if (this.field_30418 != null) {
         var4.addProperty("block", class_8669.field_44462.method_39797(this.field_30418).toString());
      }

      var4.add("state", this.field_30419.method_8078());
      var4.add("location", this.field_30421.method_23398());
      var4.add("item", this.field_30420.method_24265());
      return var4;
   }
}
