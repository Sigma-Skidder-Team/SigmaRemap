package remapped;

import com.google.gson.JsonObject;

public class class_1819 extends class_8273<class_9683> {
   private static final class_4639 field_9235 = new class_4639("item_durability_changed");

   @Override
   public class_4639 method_3899() {
      return field_9235;
   }

   public class_9683 method_8055(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5319 var6 = class_5319.method_24267(var1.get("item"));
      class_7781 var7 = class_7781.method_35310(var1.get("durability"));
      class_7781 var8 = class_7781.method_35310(var1.get("delta"));
      return new class_9683(var2, var6, var7, var8);
   }

   public void method_8054(class_9359 var1, class_6098 var2, int var3) {
      this.method_38137(var1, var2x -> var2x.method_44773(var2, var3));
   }
}
