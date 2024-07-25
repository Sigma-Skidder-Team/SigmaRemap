package remapped;

import com.google.gson.JsonObject;

public class class_1663 extends class_8273<class_2270> {
   private final Identifier field_8619;

   public class_1663(Identifier var1) {
      this.field_8619 = var1;
   }

   @Override
   public Identifier method_3899() {
      return this.field_8619;
   }

   public class_2270 method_7408(JsonObject var1, class_8938 var2, class_8096 var3) {
      JsonObject var6 = class_6539.method_29784(var1, "location", var1);
      class_5093 var7 = class_5093.method_23396(var6);
      return new class_2270(this.field_8619, var2, var7);
   }

   public void method_7409(class_9359 var1) {
      this.method_38137(var1, var1x -> var1x.method_10473(var1.method_43235(), var1.method_37302(), var1.method_37309(), var1.method_37156()));
   }
}
