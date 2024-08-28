package mapped;

import com.google.common.collect.Maps;
import com.google.gson.*;

import javax.annotation.Nullable;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class2571 implements JsonDeserializer<Class9032> {
   public Class9032 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Map var7 = this.method10767(var3, var6);
      Class7498 var8 = this.method10768(var3, var6);
      if (var7.isEmpty() && (var8 == null || var8.method24448().isEmpty())) {
         throw new JsonParseException("Neither 'variants' nor 'multipart' found");
      } else {
         return new Class9032(var7, var8);
      }
   }

   public Map<String, Class7497> method10767(JsonDeserializationContext var1, JsonObject var2) {
      HashMap var5 = Maps.newHashMap();
      if (var2.has("variants")) {
         JsonObject var6 = JSONUtils.method32782(var2, "variants");

         for (Entry var8 : var6.entrySet()) {
            var5.put(var8.getKey(), var1.deserialize((JsonElement)var8.getValue(), Class7497.class));
         }
      }

      return var5;
   }

   @Nullable
   public Class7498 method10768(JsonDeserializationContext var1, JsonObject var2) {
      if (var2.has("multipart")) {
         JsonArray var5 = JSONUtils.method32785(var2, "multipart");
         return (Class7498)var1.deserialize(var5, Class7498.class);
      } else {
         return null;
      }
   }
}
