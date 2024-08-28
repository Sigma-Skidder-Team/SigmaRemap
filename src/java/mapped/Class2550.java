package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;

public class Class2550 implements JsonDeserializer<ResourceLocation>, JsonSerializer<ResourceLocation> {
   public ResourceLocation deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new ResourceLocation(JSONUtils.method32762(var1, "location"));
   }

   public JsonElement serialize(ResourceLocation var1, Type var2, JsonSerializationContext var3) {
      return new JsonPrimitive(var1.toString());
   }
}
