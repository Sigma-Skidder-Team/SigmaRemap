package remapped;

import com.google.gson.JsonObject;

public class class_4947 extends class_8273<class_2162> {
   private static final class_4639 field_25606 = new class_4639("effects_changed");

   @Override
   public class_4639 method_3899() {
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
