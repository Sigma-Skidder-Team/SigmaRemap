package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

public class class_8744 implements JsonDeserializer<class_3604>, JsonSerializer<class_3604> {
   public JsonElement serialize(class_3604 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      JsonObject var7 = new JsonObject();

      for (Entry var9 : class_3604.method_16815(var1).entrySet()) {
         class_8984 var10 = (class_8984)var9.getValue();
         if (var10.method_41192()) {
            var7.add((String)var9.getKey(), var10.method_41186());
         }
      }

      if (!var7.entrySet().isEmpty()) {
         var6.add("criteria", var7);
      }

      var6.addProperty("done", var1.method_16811());
      return var6;
   }

   public class_3604 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = class_6539.method_29782(var1, "advancement");
      JsonObject var7 = class_6539.method_29784(var6, "criteria", new JsonObject());
      class_3604 var8 = new class_3604();

      for (Entry var10 : var7.entrySet()) {
         String var11 = (String)var10.getKey();
         class_3604.method_16815(var8).put(var11, class_8984.method_41187(class_6539.method_29795((JsonElement)var10.getValue(), var11)));
      }

      return var8;
   }
}
