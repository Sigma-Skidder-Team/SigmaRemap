package remapped;

import com.google.gson.JsonObject;

public class class_8892 extends class_8273<class_6716> {
   private static final Identifier field_45614 = new Identifier("target_hit");

   @Override
   public Identifier method_3899() {
      return field_45614;
   }

   public class_6716 method_40926(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_7781 var6 = class_7781.method_35310(var1.get("signal_strength"));
      class_8938 var7 = class_8938.method_41065(var1, "projectile", var3);
      return new class_6716(var2, var6, var7);
   }

   public void method_40927(class_9359 var1, class_8145 var2, class_1343 var3, int var4) {
      class_2792 var7 = class_865.method_3739(var1, var2);
      this.method_38137(var1, var3x -> var3x.method_30837(var7, var3, var4));
   }
}
