package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public final class class_8242 extends class_9078 {
   @Override
   public void method_41798(JsonObject var1, String var2) {
      String var5 = class_7188.method_32929(var2);
      if (var5 != null) {
         var1.addProperty("translate", var5);
      }
   }

   @Override
   public void method_41808(JsonObject var1) {
      String var4 = var1.getAsJsonPrimitive("action").getAsString();
      if (!var4.equals("show_achievement")) {
         super.method_41808(var1);
      } else {
         JsonElement var5 = var1.get("value");
         String var6;
         if (var5.isJsonObject()) {
            var6 = var5.getAsJsonObject().get("text").getAsString();
         } else {
            var6 = var5.getAsJsonPrimitive().getAsString();
         }

         if (class_7188.method_32929(var6) == null) {
            JsonObject var13 = new JsonObject();
            var13.addProperty("text", "Invalid statistic/achievement!");
            var13.addProperty("color", "red");
            var1.addProperty("action", "show_text");
            var1.add("value", var13);
            super.method_41808(var1);
         } else {
            try {
               JsonObject var7 = new JsonObject();
               var7.addProperty("text", "\n");
               JsonArray var14 = new JsonArray();
               var14.add("");
               JsonObject var9 = new JsonObject();
               JsonObject var10 = new JsonObject();
               var14.add(var9);
               var14.add(var7);
               var14.add(var10);
               if (var6.startsWith("achievement")) {
                  var9.addProperty("translate", var6);
                  var9.addProperty("color", class_7188.method_32932(var6) ? "dark_purple" : "green");
                  var10.addProperty("translate", "stats.tooltip.type.achievement");
                  JsonObject var11 = new JsonObject();
                  var10.addProperty("italic", true);
                  var11.addProperty("translate", var5 + ".desc");
                  var14.add(var7);
                  var14.add(var11);
               } else if (var6.startsWith("stat")) {
                  var9.addProperty("translate", var6);
                  var9.addProperty("color", "gray");
                  var10.addProperty("translate", "stats.tooltip.type.statistic");
                  var10.addProperty("italic", true);
               }

               var1.addProperty("action", "show_text");
               var1.add("value", var14);
            } catch (Exception var12) {
               class_3446.method_15886().method_34617().warning("Error rewriting show_achievement: " + var1);
               var12.printStackTrace();
               JsonObject var8 = new JsonObject();
               var8.addProperty("text", "Invalid statistic/achievement!");
               var8.addProperty("color", "red");
               var1.addProperty("action", "show_text");
               var1.add("value", var8);
            }

            super.method_41808(var1);
         }
      }
   }
}
