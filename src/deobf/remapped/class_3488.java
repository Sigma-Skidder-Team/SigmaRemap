package remapped;

import com.google.gson.JsonObject;

public class class_3488 extends class_8273<class_9203> {
   private static final Identifier field_17129 = new Identifier("villager_trade");

   @Override
   public Identifier method_3899() {
      return field_17129;
   }

   public class_9203 method_16039(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8938 var6 = class_8938.method_41065(var1, "villager", var3);
      class_5319 var7 = class_5319.method_24267(var1.get("item"));
      return new class_9203(var2, var6, var7);
   }

   public void method_16038(class_9359 var1, AbstractVillagerEntity var2, ItemStack var3) {
      class_2792 var6 = class_865.method_3739(var1, var2);
      this.method_38137(var1, var2x -> var2x.method_42462(var6, var3));
   }
}
