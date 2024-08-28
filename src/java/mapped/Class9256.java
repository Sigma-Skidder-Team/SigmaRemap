package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Class9256 {
   private static final Class7080 field42563 = new Class7083();

   public static void method34813(JsonElement var0, Class7161 var1) {
      if (var0 instanceof JsonObject) {
         JsonObject var4 = (JsonObject)var0;
         JsonElement var5 = var4.get("translate");
         if (var5 != null && var5.getAsString().startsWith("chat.type.achievement")) {
            field42563.method21999(var4);
         }
      }
   }
}
