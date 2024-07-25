package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;

public class class_4102 implements JsonDeserializer<class_9608>, JsonSerializer<class_9608> {
   public class_9608 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = class_6539.method_29782(var1, "players");
      class_9608 var7 = new class_9608(class_6539.method_29767(var6, "max"), class_6539.method_29767(var6, "online"));
      if (class_6539.method_29763(var6, "sample")) {
         JsonArray var8 = class_6539.method_29787(var6, "sample");
         if (var8.size() > 0) {
            GameProfile[] var9 = new GameProfile[var8.size()];

            for (int var10 = 0; var10 < var9.length; var10++) {
               JsonObject var11 = class_6539.method_29782(var8.get(var10), "player[" + var10 + "]");
               String var12 = class_6539.method_29796(var11, "id");
               var9[var10] = new GameProfile(UUID.fromString(var12), class_6539.method_29796(var11, "name"));
            }

            var7.method_44366(var9);
         }
      }

      return var7;
   }

   public JsonElement serialize(class_9608 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      var6.addProperty("max", var1.method_44364());
      var6.addProperty("online", var1.method_44362());
      if (var1.method_44363() != null && var1.method_44363().length > 0) {
         JsonArray var7 = new JsonArray();

         for (int var8 = 0; var8 < var1.method_44363().length; var8++) {
            JsonObject var9 = new JsonObject();
            UUID var10 = var1.method_44363()[var8].getId();
            var9.addProperty("id", var10 != null ? var10.toString() : "");
            var9.addProperty("name", var1.method_44363()[var8].getName());
            var7.add(var9);
         }

         var6.add("sample", var7);
      }

      return var6;
   }
}
