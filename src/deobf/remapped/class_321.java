package remapped;

import com.google.gson.JsonObject;

public class class_321 extends class_8273<class_6398> {
   private static final Identifier field_1183 = new Identifier("item_used_on_block");

   @Override
   public Identifier method_3899() {
      return field_1183;
   }

   public class_6398 method_1491(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5093 var6 = class_5093.method_23396(var1.get("location"));
      class_5319 var7 = class_5319.method_24267(var1.get("item"));
      return new class_6398(var2, var6, var7);
   }

   public void method_1490(class_9359 var1, BlockPos var2, ItemStack var3) {
      class_2522 var6 = var1.method_43235().method_28262(var2);
      this.method_38137(var1, var4 -> var4.method_29213(var6, var1.method_43235(), var2, var3));
   }
}
