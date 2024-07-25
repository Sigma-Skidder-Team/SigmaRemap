package remapped;

import com.google.gson.JsonObject;
import java.util.Collection;

public class class_1441 extends class_8273<class_1691> {
   private static final Identifier field_7768 = new Identifier("fishing_rod_hooked");

   @Override
   public Identifier method_3899() {
      return field_7768;
   }

   public class_1691 method_6615(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5319 var6 = class_5319.method_24267(var1.get("rod"));
      class_8938 var7 = class_8938.method_41065(var1, "entity", var3);
      class_5319 var8 = class_5319.method_24267(var1.get("item"));
      return new class_1691(var2, var6, var7, var8);
   }

   public void method_6617(class_9359 var1, class_6098 var2, class_3942 var3, Collection<class_6098> var4) {
      class_2792 var7 = class_865.method_3739(var1, (class_8145)(var3.method_18226() == null ? var3 : var3.method_18226()));
      this.method_38137(var1, var3x -> var3x.method_7616(var2, var7, var4));
   }
}
