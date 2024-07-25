package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.regex.Pattern;

public class class_2580 {
   private static final Pattern field_12776 = Pattern.compile("(?<![\\w-.+])\\d+:(?=([^\"\\\\]*(\\\\.|\"([^\"\\\\]*\\\\.)*[^\"\\\\]*\"))*[^\"]*$)");

   public static void method_11745(JsonElement var0, class_1455 var1) {
      if (!(var0 instanceof JsonObject)) {
         if (var0 instanceof JsonArray) {
            for (JsonElement var6 : (JsonArray)var0) {
               method_11745(var6, var1);
            }
         }
      } else {
         JsonObject var12 = (JsonObject)var0;
         if (!var12.has("hoverEvent")) {
            if (var12.has("extra")) {
               method_11745(var12.get("extra"), var1);
            }
         } else if (var12.get("hoverEvent") instanceof JsonObject) {
            JsonObject var13 = (JsonObject)var12.get("hoverEvent");
            if (var13.has("action") && var13.has("value")) {
               String var14 = var13.get("action").getAsString();
               if (var14.equals("show_item") || var14.equals("show_entity")) {
                  JsonElement var7 = var13.get("value");
                  if (var7.isJsonPrimitive() && var7.getAsJsonPrimitive().isString()) {
                     String var15 = field_12776.matcher(var7.getAsString()).replaceAll("");
                     var13.addProperty("value", var15);
                  } else if (var7.isJsonArray()) {
                     JsonArray var8 = new JsonArray();

                     for (JsonElement var10 : var7.getAsJsonArray()) {
                        if (var10.isJsonPrimitive() && var10.getAsJsonPrimitive().isString()) {
                           String var11 = field_12776.matcher(var10.getAsString()).replaceAll("");
                           var8.add(new JsonPrimitive(var11));
                        }
                     }

                     var13.add("value", var8);
                  }
               }
            }
         }
      }
   }
}
