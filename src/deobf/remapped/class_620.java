package remapped;

import com.google.gson.JsonObject;

public class class_620 implements class_5590<class_2282> {
   public void method_2897(class_2282 var1, class_8248 var2) {
      byte var5 = 0;
      if (class_2282.method_10527(var1)) {
         var5 = (byte)(var5 | 1);
      }

      var2.writeByte(var5);
   }

   public class_2282 method_2894(class_8248 var1) {
      byte var4 = var1.readByte();
      boolean var5 = false;
      return new class_2282(var5);
   }

   public void method_2896(class_2282 var1, JsonObject var2) {
      var2.addProperty("amount", !class_2282.method_10527(var1) ? "single" : "multiple");
   }
}
