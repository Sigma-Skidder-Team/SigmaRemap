package remapped;

import com.google.gson.JsonObject;

public class class_5800 extends class_8273<class_9853> {
   private static final Identifier field_29294 = new Identifier("enchanted_item");

   @Override
   public Identifier method_3899() {
      return field_29294;
   }

   public class_9853 method_26282(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5319 var6 = class_5319.method_24267(var1.get("item"));
      class_7781 var7 = class_7781.method_35310(var1.get("levels"));
      return new class_9853(var2, var6, var7);
   }

   public void method_26281(class_9359 var1, ItemStack var2, int var3) {
      this.method_38137(var1, var2x -> var2x.method_45373(var2, var3));
   }
}
