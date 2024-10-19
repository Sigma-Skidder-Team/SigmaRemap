package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;

import java.util.Map;

public class Class9288 {
   private static final Map<ResourceLocation, Class<? extends Class6870>> field42711 = Maps.newHashMap();

   public static Class6870 method35013(JsonElement var0, JsonDeserializationContext var1) throws JsonParseException {
      if (!var0.isJsonPrimitive()) {
         JsonObject var4 = var0.getAsJsonObject();
         String var5 = JSONUtils.getString(var4, "type", Class6870.field29798.toString());
         Class var6 = field42711.get(new ResourceLocation(var5));
         if (var6 != null) {
            return (Class6870)var1.deserialize(var4, var6);
         } else {
            throw new JsonParseException("Unknown generator: " + var5);
         }
      } else {
         return (Class6870)var1.deserialize(var0, Class6871.class);
      }
   }

   public static JsonElement method35014(Class6870 var0, JsonSerializationContext var1) {
      JsonElement var4 = var1.serialize(var0);
      if (var4.isJsonObject()) {
         var4.getAsJsonObject().addProperty("type", var0.method20916().toString());
      }

      return var4;
   }

   static {
      field42711.put(Class6870.field29798, Class6872.class);
      field42711.put(Class6870.field29799, Class6869.class);
      field42711.put(Class6870.field29797, Class6871.class);
   }
}
