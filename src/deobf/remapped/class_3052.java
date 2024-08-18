package remapped;

import com.google.gson.JsonObject;

public class class_3052 extends class_8273<class_2230> {
   private static final Identifier field_14973 = new Identifier("nether_travel");

   @Override
   public Identifier method_3899() {
      return field_14973;
   }

   public class_2230 method_13943(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_5093 var6 = class_5093.method_23396(var1.get("entered"));
      class_5093 var7 = class_5093.method_23396(var1.get("exited"));
      class_6254 var8 = class_6254.method_28552(var1.get("distance"));
      return new class_2230(var2, var6, var7, var8);
   }

   public void method_13945(class_9359 var1, Vector3d var2) {
      this.method_38137(var1, var2x -> var2x.method_10274(var1.method_43235(), var2, var1.getPosX(), var1.method_37309(), var1.getPosZ()));
   }
}
