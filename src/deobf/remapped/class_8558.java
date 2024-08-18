package remapped;

import com.google.gson.JsonObject;

public class class_8558 extends class_8273<class_7104> {
   private static final Identifier field_43783 = new Identifier("levitation");

   @Override
   public Identifier method_3899() {
      return field_43783;
   }

   public class_7104 method_39388(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_6254 var6 = class_6254.method_28552(var1.get("distance"));
      class_7781 var7 = class_7781.method_35310(var1.get("duration"));
      return new class_7104(var2, var6, var7);
   }

   public void method_39389(class_9359 var1, Vector3d var2, int var3) {
      this.method_38137(var1, var3x -> var3x.method_32648(var1, var2, var3));
   }
}
