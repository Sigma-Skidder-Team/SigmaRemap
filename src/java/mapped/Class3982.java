package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Class3982 extends Class3758 {
   public final Class6356 field20280;

   public Class3982(Class6356 var1) {
      this.field20280 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var0 -> {
         String var3 = var0.<String>method30561(Class4750.field22539);
         JsonObject var4 = (JsonObject)Class9610.method37357().fromJson(var3, JsonObject.class);
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
                  var0.method30558(Class4750.field22539, 0, var4.toString());
               }
            }
         }
      });
   }
}
