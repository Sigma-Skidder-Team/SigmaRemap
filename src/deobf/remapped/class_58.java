package remapped;

import com.google.gson.JsonObject;

public class class_58 implements class_5590<class_5601> {
   public void method_28(class_5601 var1, class_8248 var2) {
      byte var5 = 0;
      if (class_5601.method_25418(var1)) {
         var5 = (byte)(var5 | 1);
      }

      if (class_5601.method_25419(var1)) {
         var5 = (byte)(var5 | 2);
      }

      var2.writeByte(var5);
   }

   public class_5601 method_26(class_8248 var1) {
      byte var4 = var1.readByte();
      return new class_5601(false, false);
   }

   public void method_27(class_5601 var1, JsonObject var2) {
      var2.addProperty("amount", !class_5601.method_25418(var1) ? "multiple" : "single");
      var2.addProperty("type", !class_5601.method_25419(var1) ? "entities" : "players");
   }
}
