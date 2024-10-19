package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Streams;
import com.google.gson.*;
import net.minecraft.util.JSONUtils;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Class2570 implements JsonDeserializer<Class9350> {
   public Class9350 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      return new Class9350(this.method10762(var6), (Class7497)var3.deserialize(var6.get("apply"), Class7497.class));
   }

   private Class7562 method10762(JsonObject var1) {
      return !var1.has("when") ? Class7562.field32488 : method10763(JSONUtils.method32782(var1, "when"));
   }

   @VisibleForTesting
   public static Class7562 method10763(JsonObject var0) {
      Set<Entry<String, JsonElement>> var3 = var0.entrySet();
      if (!var3.isEmpty()) {
         if (var3.size() != 1) {
            return new Class7563(var3.stream().map(Class2570::method10764).collect(Collectors.<Class7562>toList()));
         } else if (!var0.has("OR")) {
            if (!var0.has("AND")) {
               return method10764(var3.iterator().next());
            } else {
               List var5 = Streams.stream(JSONUtils.method32785(var0, "AND"))
                  .<Class7562>map(var0x -> method10763(var0x.getAsJsonObject()))
                  .collect(Collectors.toList());
               return new Class7563(var5);
            }
         } else {
            List var4 = Streams.stream(JSONUtils.method32785(var0, "OR"))
               .<Class7562>map(var0x -> method10763(var0x.getAsJsonObject()))
               .collect(Collectors.toList());
            return new Class7564(var4);
         }
      } else {
         throw new JsonParseException("No elements found in selector");
      }
   }

   private static Class7562 method10764(Entry<String, JsonElement> var0) {
      return new Class7565(var0.getKey(), var0.getValue().getAsString());
   }
}
