package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class class_289 extends class_3893 {
   public class_289(class_757 var1) {
      this.field_1014 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var0 -> {
         String var3 = var0.<String>method_23261(class_8039.field_41171);
         JsonObject var4 = (JsonObject)class_9012.method_41350().fromJson(var3, JsonObject.class);
         JsonObject var5 = var4.getAsJsonObject("players");
         if (var5 != null) {
            JsonArray var6 = var5.getAsJsonArray("sample");
            if (var6 != null) {
               JsonArray var7 = new JsonArray();

               for (JsonElement var9 : var6) {
                  JsonObject var10 = var9.getAsJsonObject();
                  String var11 = var10.getAsJsonPrimitive("name").getAsString();
                  if (var11.indexOf(10) != -1) {
                     String var12 = var10.getAsJsonPrimitive("id").getAsString();

                     for (String var16 : var11.split("\n")) {
                        JsonObject var17 = new JsonObject();
                        var17.addProperty("name", var16);
                        var17.addProperty("id", var12);
                        var7.add(var17);
                     }
                  } else {
                     var7.add(var10);
                  }
               }

               if (var7.size() != var6.size()) {
                  var5.add("sample", var7);
                  var0.method_23257(class_8039.field_41171, 0, var4.toString());
               }
            }
         }
      });
   }
}
