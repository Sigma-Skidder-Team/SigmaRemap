package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class_8344 implements JsonDeserializer<class_2729> {
   public class_2729 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      Identifier var7 = new Identifier(class_6539.method_29796(var6, "model"));
      Map var8 = this.method_38425(var6);
      return new class_2729(var7, var8);
   }

   public Map<Identifier, Float> method_38425(JsonObject var1) {
      LinkedHashMap var4 = Maps.newLinkedHashMap();
      JsonObject var5 = class_6539.method_29783(var1, "predicate");

      for (Entry var7 : var5.entrySet()) {
         var4.put(new Identifier((String)var7.getKey()), class_6539.method_29773((JsonElement)var7.getValue(), (String)var7.getKey()));
      }

      return var4;
   }
}
