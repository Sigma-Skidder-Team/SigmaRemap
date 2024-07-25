package remapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Streams;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class class_9389 implements JsonDeserializer<class_8023> {
   public class_8023 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var6 = var1.getAsJsonObject();
      return new class_8023(this.method_43432(var6), (class_9798)var3.deserialize(var6.get("apply"), class_9798.class));
   }

   private class_2218 method_43432(JsonObject var1) {
      return !var1.has("when") ? class_2218.field_11095 : method_43431(class_6539.method_29783(var1, "when"));
   }

   @VisibleForTesting
   public static class_2218 method_43431(JsonObject var0) {
      Set var3 = var0.entrySet();
      if (!var3.isEmpty()) {
         if (var3.size() != 1) {
            return new class_6790(var3.stream().<class_2218>map(class_9389::method_43434).collect(Collectors.<class_2218>toList()));
         } else if (!var0.has("OR")) {
            if (!var0.has("AND")) {
               return method_43434((Entry<String, JsonElement>)var3.iterator().next());
            } else {
               List var5 = Streams.stream(class_6539.method_29787(var0, "AND"))
                  .<class_2218>map(var0x -> method_43431(var0x.getAsJsonObject()))
                  .collect(Collectors.toList());
               return new class_6790(var5);
            }
         } else {
            List var4 = Streams.stream(class_6539.method_29787(var0, "OR"))
               .<class_2218>map(var0x -> method_43431(var0x.getAsJsonObject()))
               .collect(Collectors.toList());
            return new class_3455(var4);
         }
      } else {
         throw new JsonParseException("No elements found in selector");
      }
   }

   private static class_2218 method_43434(Entry<String, JsonElement> var0) {
      return new class_6884(var0.getKey(), var0.getValue().getAsString());
   }
}
