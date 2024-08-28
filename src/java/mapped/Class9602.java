package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Class9602 {
   public static void method37312(JsonObject var0, Class7161 var1) {
      if (var0.get("translate") != null && var0.get("translate").getAsString().equals("gameMode.changed")) {
         String var4 = var1.<Class6057>method22438(Class6057.class).method18768().method8725();
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
