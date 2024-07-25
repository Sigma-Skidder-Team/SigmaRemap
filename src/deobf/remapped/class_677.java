package remapped;

import com.google.gson.JsonObject;

public class class_677 extends class_4569 {
   private final class_7781 field_3741;

   public class_677(class_8938 var1, class_7781 var2) {
      super(class_1986.method_9161(), var1);
      this.field_3741 = var2;
   }

   public static class_677 method_3087(class_7781 var0) {
      return new class_677(class_8938.field_45798, var0);
   }

   public boolean method_3086(class_1100 var1) {
      return this.field_3741.method_35307(var1.method_4880());
   }

   @Override
   public JsonObject method_23586(class_3630 var1) {
      JsonObject var4 = super.method_23586(var1);
      var4.add("level", this.field_3741.method_27853());
      return var4;
   }
}
