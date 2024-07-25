package remapped;

import com.google.gson.JsonObject;

public class class_2074 extends class_8273<class_8367> {
   private static final class_4639 field_10447 = new class_4639("used_totem");

   @Override
   public class_4639 method_3899() {
      return field_10447;
   }

   public class_8367 method_9682(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5319 var6 = class_5319.method_24267(var1.get("item"));
      return new class_8367(var2, var6);
   }

   public void method_9683(class_9359 var1, class_6098 var2) {
      this.method_38137(var1, var1x -> var1x.method_38556(var2));
   }
}
