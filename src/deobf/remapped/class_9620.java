package remapped;

import com.google.gson.JsonObject;

public class class_9620 extends class_8273<class_5755> {
   private static final class_4639 field_49011 = new class_4639("filled_bucket");

   @Override
   public class_4639 method_3899() {
      return field_49011;
   }

   public class_5755 method_44415(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5319 var6 = class_5319.method_24267(var1.get("item"));
      return new class_5755(var2, var6);
   }

   public void method_44414(class_9359 var1, class_6098 var2) {
      this.method_38137(var1, var1x -> var1x.method_26043(var2));
   }
}
