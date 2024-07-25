package remapped;

import com.google.gson.JsonObject;

public class class_3165 extends class_8273<class_4447> {
   private static final Identifier field_15832 = new Identifier("thrown_item_picked_up_by_entity");

   @Override
   public Identifier method_3899() {
      return field_15832;
   }

   public class_4447 method_14611(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5319 var6 = class_5319.method_24267(var1.get("item"));
      class_8938 var7 = class_8938.method_41065(var1, "entity", var3);
      return new class_4447(var2, var6, var7);
   }

   public void method_14612(class_9359 var1, ItemStack var2, Entity var3) {
      class_2792 var6 = class_865.method_3739(var1, var3);
      this.method_38137(var1, var3x -> var3x.method_20622(var1, var2, var6));
   }
}
