package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class class_6748 implements JsonDeserializer<class_6751> {
   public class_6751 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Map var7 = this.method_30916(var3, var6);
      class_9846 var8 = this.method_30917(var3, var6);
      if (var7.isEmpty() && (var8 == null || var8.method_45356().isEmpty())) {
         throw new JsonParseException("Neither 'variants' nor 'multipart' found");
      } else {
         return new class_6751(var7, var8);
      }
   }

   public Map<String, class_9798> method_30916(JsonDeserializationContext var1, JsonObject var2) {
      HashMap var5 = Maps.newHashMap();
      if (var2.has("variants")) {
         JsonObject var6 = class_6539.method_29783(var2, "variants");

         for (Entry var8 : var6.entrySet()) {
            var5.put(var8.getKey(), var1.deserialize((JsonElement)var8.getValue(), class_9798.class));
         }
      }

      return var5;
   }

   @Nullable
   public class_9846 method_30917(JsonDeserializationContext var1, JsonObject var2) {
      if (var2.has("multipart")) {
         JsonArray var5 = class_6539.method_29787(var2, "multipart");
         return (class_9846)var1.deserialize(var5, class_9846.class);
      } else {
         return null;
      }
   }
}
