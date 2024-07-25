package remapped;

import com.google.gson.JsonObject;

public class class_5027 extends class_8273<class_6338> {
   private static final Identifier field_26003 = new Identifier("used_ender_eye");

   @Override
   public Identifier method_3899() {
      return field_26003;
   }

   public class_6338 method_23186(JsonObject var1, class_8938 var2, class_8096 var3) {
      class_6115 var6 = class_6115.method_28093(var1.get("distance"));
      return new class_6338(var2, var6);
   }

   public void method_23185(class_9359 var1, BlockPos var2) {
      double var5 = var1.getPosX() - (double)var2.method_12173();
      double var7 = var1.getPosZ() - (double)var2.method_12185();
      double var9 = var5 * var5 + var7 * var7;
      this.method_38137(var1, var2x -> var2x.method_29010(var9));
   }
}
