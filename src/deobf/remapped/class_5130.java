package remapped;

import com.google.gson.JsonObject;

public class class_5130 extends class_4569 {
   private final class_6414 field_26464;
   private final class_5319 field_26463;
   private final class_7781 field_26462;

   public class_5130(class_8938 var1, class_6414 var2, class_5319 var3, class_7781 var4) {
      super(class_5784.method_26173(), var1);
      this.field_26464 = var2;
      this.field_26463 = var3;
      this.field_26462 = var4;
   }

   public static class_5130 method_23529(class_6414 var0, class_9518 var1, class_7781 var2) {
      return new class_5130(class_8938.field_45798, var0, var1.method_43921(), var2);
   }

   public boolean method_23530(class_6414 var1, class_6098 var2, int var3) {
      if (this.field_26464 != null && var1 != this.field_26464) {
         return false;
      } else {
         return this.field_26463.method_24266(var2) ? this.field_26462.method_35307(var3) : false;
      }
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      if (this.field_26464 != null) {
         var4.addProperty("block", class_8669.field_44462.method_39797(this.field_26464).toString());
      }

      var4.add("item", this.field_26463.method_24265());
      var4.add("num_bees_inside", this.field_26462.method_27853());
      return var4;
   }
}
