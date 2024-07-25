package remapped;

import com.google.gson.JsonObject;

public class class_1283 extends class_8273<class_8553> {
   private static final Identifier field_7054 = new Identifier("bred_animals");

   @Override
   public Identifier method_3899() {
      return field_7054;
   }

   public class_8553 method_5732(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_8938 var6 = class_8938.method_41065(var1, "parent", var3);
      class_8938 var7 = class_8938.method_41065(var1, "partner", var3);
      class_8938 var8 = class_8938.method_41065(var1, "child", var3);
      return new class_8553(var2, var6, var7, var8);
   }

   public void method_5733(class_9359 var1, class_5467 var2, class_5467 var3, class_1899 var4) {
      class_2792 var7 = class_865.method_3739(var1, var2);
      class_2792 var8 = class_865.method_3739(var1, var3);
      class_2792 var9 = var4 == null ? null : class_865.method_3739(var1, var4);
      this.method_38137(var1, var3x -> var3x.method_39346(var7, var8, var9));
   }
}
