package mapped;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.HashSet;

public class Class2577 implements JsonDeserializer<Class7626> {
   private static final JsonParser field16797 = new JsonParser();
   private static final Gson field16798 = new GsonBuilder()
      .registerTypeAdapter(Class7626.class, new Class2577())
      .registerTypeAdapter(Class7630.class, new Class2552())
      .registerTypeAdapter(Class7628.class, new Class2547())
      .registerTypeAdapter(Class7627.class, new Class2568())
      .registerTypeAdapter(Class7625.class, new Class2549())
      .registerTypeAdapter(Class7629.class, new Class2563())
      .create();
   public static final ThreadLocal<HashSet<Class7626>> field16799 = new ThreadLocal<HashSet<Class7626>>();

   public static Class7626[] method10772(String var0) {
      JsonElement var3 = field16797.parse(var0);
      return !var3.isJsonArray()
         ? new Class7626[]{(Class7626)field16798.fromJson(var3, Class7626.class)}
         : (Class7626[])field16798.fromJson(var3, Class7626[].class);
   }

   public static String toString(Class7626 var0) {
      return field16798.toJson(var0);
   }

   public static String toString(Class7626... var0) {
      return var0.length != 1 ? field16798.toJson(new Class7630(var0)) : field16798.toJson(var0[0]);
   }

   public Class7626 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (!var1.isJsonPrimitive()) {
         JsonObject var6 = var1.getAsJsonObject();
         if (!var6.has("translate")) {
            if (!var6.has("keybind")) {
               if (!var6.has("score")) {
                  return !var6.has("selector") ? (Class7626)var3.deserialize(var1, Class7630.class) : (Class7626)var3.deserialize(var1, Class7629.class);
               } else {
                  return (Class7626)var3.deserialize(var1, Class7625.class);
               }
            } else {
               return (Class7626)var3.deserialize(var1, Class7627.class);
            }
         } else {
            return (Class7626)var3.deserialize(var1, Class7628.class);
         }
      } else {
         return new Class7630(var1.getAsString());
      }
   }
}
