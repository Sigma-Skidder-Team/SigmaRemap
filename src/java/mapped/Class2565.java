package mapped;

import com.google.gson.*;
import net.minecraft.util.text.ITextComponent;

import java.lang.reflect.Type;

public class Class2565 implements JsonDeserializer<Class8783>, JsonSerializer<Class8783> {
   public Class8783 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = JSONUtils.method32781(var1, "status");
      Class8783 var7 = new Class8783();
      if (var6.has("description")) {
         var7.method31701((ITextComponent)var3.deserialize(var6.get("description"), ITextComponent.class));
      }

      if (var6.has("players")) {
         var7.method31703((Class9762)var3.deserialize(var6.get("players"), Class9762.class));
      }

      if (var6.has("version")) {
         var7.method31705((Class9226)var3.deserialize(var6.get("version"), Class9226.class));
      }

      if (var6.has("favicon")) {
         var7.method31706(JSONUtils.method32763(var6, "favicon"));
      }

      return var7;
   }

   public JsonElement serialize(Class8783 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      if (var1.method31700() != null) {
         var6.add("description", var3.serialize(var1.method31700()));
      }

      if (var1.method31702() != null) {
         var6.add("players", var3.serialize(var1.method31702()));
      }

      if (var1.method31704() != null) {
         var6.add("version", var3.serialize(var1.method31704()));
      }

      if (var1.method31707() != null) {
         var6.addProperty("favicon", var1.method31707());
      }

      return var6;
   }
}
