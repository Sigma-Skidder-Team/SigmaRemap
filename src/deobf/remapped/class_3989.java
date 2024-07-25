package remapped;

import com.google.gson.JsonObject;

public class class_3989 extends class_8273<class_9063> {
   private static final class_4639 field_19387 = new class_4639("shot_crossbow");

   @Override
   public class_4639 method_3899() {
      return field_19387;
   }

   public class_9063 method_18393(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5319 var6 = class_5319.method_24267(var1.get("item"));
      return new class_9063(var2, var6);
   }

   public void method_18394(class_9359 var1, class_6098 var2) {
      this.method_38137(var1, var1x -> var1x.method_41611(var2));
   }
}
