package remapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class class_7709 {
   private static final class_9078 field_39109 = new class_8242();

   public static void method_34891(JsonElement var0, class_1455 var1) {
      if (var0 instanceof JsonObject) {
         JsonObject var4 = (JsonObject)var0;
         JsonElement var5 = var4.get("translate");
         if (var5 != null && var5.getAsString().startsWith("chat.type.achievement")) {
            field_39109.method_41802(var4);
         }
      }
   }
}
