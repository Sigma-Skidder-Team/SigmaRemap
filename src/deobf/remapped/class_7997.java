package remapped;

import com.google.gson.JsonObject;

public class class_7997 extends class_8273<class_7032> {
   private static final class_4639 field_40971 = new class_4639("tame_animal");

   @Override
   public class_4639 method_3899() {
      return field_40971;
   }

   public class_7032 method_36290(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8938 var6 = class_8938.method_41065(var1, "entity", var3);
      return new class_7032(var2, var6);
   }

   public void method_36292(class_9359 var1, class_5467 var2) {
      class_2792 var5 = class_865.method_3739(var1, var2);
      this.method_38137(var1, var1x -> var1x.method_32073(var5));
   }
}
