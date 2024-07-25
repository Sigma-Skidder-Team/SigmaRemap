package remapped;

import com.google.gson.JsonObject;

public class class_4947 extends class_8273<class_2162> {
   private static final Identifier field_25606 = new Identifier("effects_changed");

   @Override
   public Identifier method_3899() {
      return field_25606;
   }

   public class_2162 method_22665(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8286 var6 = class_8286.method_38243(var1.get("effects"));
      return new class_2162(var2, var6);
   }

   public void method_22666(class_9359 var1) {
      this.method_38137(var1, var1x -> var1x.method_10058(var1));
   }
}
