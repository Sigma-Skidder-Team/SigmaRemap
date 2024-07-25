package remapped;

import com.google.gson.JsonObject;

public class class_2544 extends class_8273<class_3780> {
   private final class_4639 field_12601;

   public class_2544(class_4639 var1) {
      this.field_12601 = var1;
   }

   @Override
   public class_4639 method_3899() {
      return this.field_12601;
   }

   public class_3780 method_11577(JsonObject var1, class_8938 var2, class_8096 var3) {
      return new class_3780(this.field_12601, var2, class_8938.method_41065(var1, "entity", var3), class_8772.method_40298(var1.get("killing_blow")));
   }

   public void method_11578(class_9359 var1, class_8145 var2, class_6199 var3) {
      class_2792 var6 = class_865.method_3739(var1, var2);
      this.method_38137(var1, var3x -> var3x.method_17507(var1, var6, var3));
   }
}
