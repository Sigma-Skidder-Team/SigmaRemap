package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Class4944 implements ILootSerializer<Class160> {
   public void serialize(JsonObject var1, Class160 var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();

      for (Entry<String, Class6872> var8 : Class160.method484(var2).entrySet()) {
         var6.add((String)var8.getKey(), var3.serialize(var8.getValue()));
      }

      var1.add("scores", var6);
      var1.add("entity", var3.serialize(Class160.method485(var2)));
   }

   public Class160 method15248(JsonObject var1, JsonDeserializationContext var2) {
      Set<Entry<String, JsonElement>> var5 = JSONUtils.method32782(var1, "scores").entrySet();
      Map<String, Class6872> var6 = Maps.newLinkedHashMap();

      for (Entry<String, JsonElement> var8 : var5) {
         var6.put(var8.getKey(), JSONUtils.method32787(var8.getValue(), "score", var2, Class6872.class));
      }

      return new Class160(var6, JSONUtils.<Class2063>method32788(var1, "entity", var2, Class2063.class));
   }
}
