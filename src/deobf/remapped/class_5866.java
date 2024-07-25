package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class class_5866 implements class_6478<class_1232> {
   public void method_26725(JsonObject var1, class_1232 var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();

      for (Entry var8 : class_1232.method_5482(var2).entrySet()) {
         var6.add((String)var8.getKey(), var3.serialize(var8.getValue()));
      }

      var1.add("scores", var6);
      var1.add("entity", var3.serialize(class_1232.method_5480(var2)));
   }

   public class_1232 method_26726(JsonObject var1, JsonDeserializationContext var2) {
      Set var5 = class_6539.method_29783(var1, "scores").entrySet();
      LinkedHashMap var6 = Maps.newLinkedHashMap();

      for (Entry var8 : var5) {
         var6.put(var8.getKey(), class_6539.<class_7986>method_29777((JsonElement)var8.getValue(), "score", var2, class_7986.class));
      }

      return new class_1232(var6, class_6539.<class_5848>method_29778(var1, "entity", var2, class_5848.class), null);
   }
}
