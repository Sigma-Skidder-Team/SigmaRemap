package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class class_8994 {
   public static void method_41264(JsonObject var0, class_1455 var1) {
      if (var0.get("translate") != null && var0.get("translate").getAsString().equals("gameMode.changed")) {
         String var4 = var1.<class_1189>method_6746(class_1189.class).method_5269().method_2112();
         JsonObject var5 = new JsonObject();
         var5.addProperty("text", var4);
         var5.addProperty("color", "gray");
         var5.addProperty("italic", true);
         JsonArray var6 = new JsonArray();
         var6.add(var5);
         var0.add("with", var6);
      }
   }
}
