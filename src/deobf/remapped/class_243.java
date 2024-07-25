package remapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.util.text.ITextComponent;

public class class_243 implements JsonDeserializer<class_5880>, JsonSerializer<class_5880> {
   public class_5880 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = class_6539.method_29782(var1, "status");
      class_5880 var7 = new class_5880();
      if (var6.has("description")) {
         var7.method_26814((ITextComponent)var3.deserialize(var6.get("description"), ITextComponent.class));
      }

      if (var6.has("players")) {
         var7.method_26819((class_9608)var3.deserialize(var6.get("players"), class_9608.class));
      }

      if (var6.has("version")) {
         var7.method_26813((class_7543)var3.deserialize(var6.get("version"), class_7543.class));
      }

      if (var6.has("favicon")) {
         var7.method_26821(class_6539.method_29796(var6, "favicon"));
      }

      return var7;
   }

   public JsonElement serialize(class_5880 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var6 = new JsonObject();
      if (var1.method_26817() != null) {
         var6.add("description", var3.serialize(var1.method_26817()));
      }

      if (var1.method_26816() != null) {
         var6.add("players", var3.serialize(var1.method_26816()));
      }

      if (var1.method_26818() != null) {
         var6.add("version", var3.serialize(var1.method_26818()));
      }

      if (var1.method_26815() != null) {
         var6.addProperty("favicon", var1.method_26815());
      }

      return var6;
   }
}
