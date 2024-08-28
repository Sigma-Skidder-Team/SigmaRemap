package mapped;

import com.google.gson.*;
import com.mojang.authlib.GameProfile;

import java.lang.reflect.Type;
import java.util.UUID;

public class Class2556 implements JsonDeserializer<Class9762>, JsonSerializer<Class9762> {
   public Class9762 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = JSONUtils.method32781(var1, "players");
      Class9762 var7 = new Class9762(JSONUtils.method32777(var6, "max"), JSONUtils.method32777(var6, "online"));
      if (JSONUtils.method32759(var6, "sample")) {
         JsonArray var8 = JSONUtils.method32785(var6, "sample");
         if (var8.size() > 0) {
            GameProfile[] var9 = new GameProfile[var8.size()];

            for (int var10 = 0; var10 < var9.length; var10++) {
               JsonObject var11 = JSONUtils.method32781(var8.get(var10), "player[" + var10 + "]");
               String var12 = JSONUtils.method32763(var11, "id");
               var9[var10] = new GameProfile(UUID.fromString(var12), JSONUtils.method32763(var11, "name"));
            }

            var7.method38379(var9);
         }
      }

      return var7;
   }

   public JsonElement serialize(Class9762 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      var6.addProperty("max", var1.method38376());
      var6.addProperty("online", var1.method38377());
      if (var1.method38378() != null && var1.method38378().length > 0) {
         JsonArray var7 = new JsonArray();

         for (int var8 = 0; var8 < var1.method38378().length; var8++) {
            JsonObject var9 = new JsonObject();
            UUID var10 = var1.method38378()[var8].getId();
            var9.addProperty("id", var10 != null ? var10.toString() : "");
            var9.addProperty("name", var1.method38378()[var8].getName());
            var7.add(var9);
         }

         var6.add("sample", var7);
      }

      return var6;
   }
}
