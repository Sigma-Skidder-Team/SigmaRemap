package remapped;

import com.google.gson.JsonObject;

public class class_9386 extends class_8273<class_2125> {
   private static final Identifier field_47969 = new Identifier("consume_item");

   @Override
   public Identifier method_3899() {
      return field_47969;
   }

   public class_2125 method_43403(JsonObject var1, class_8938 var2, class_8096 var3) {
      return new class_2125(var2, class_5319.method_24267(var1.get("item")));
   }

   public void method_43401(class_9359 var1, ItemStack var2) {
      this.method_38137(var1, var1x -> var1x.method_9929(var2));
   }
}
