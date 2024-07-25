package remapped;

import com.google.gson.JsonObject;

public class class_1986 extends class_8273<class_677> {
   private static final class_4639 field_10059 = new class_4639("construct_beacon");

   @Override
   public class_4639 method_3899() {
      return field_10059;
   }

   public class_677 method_9159(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_7781 var6 = class_7781.method_35310(var1.get("level"));
      return new class_677(var2, var6);
   }

   public void method_9160(class_9359 var1, class_1100 var2) {
      this.method_38137(var1, var1x -> var1x.method_3086(var2));
   }
}
