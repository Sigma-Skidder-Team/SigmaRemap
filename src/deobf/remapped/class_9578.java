package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.lang.reflect.Type;
import java.util.HashSet;

public class class_9578 implements JsonDeserializer<class_6349> {
   private static final JsonParser field_48717 = new JsonParser();
   private static final Gson field_48719 = new GsonBuilder()
      .registerTypeAdapter(class_6349.class, new class_9578())
      .registerTypeAdapter(class_5028.class, new class_9105())
      .registerTypeAdapter(class_3083.class, new class_7964())
      .registerTypeAdapter(class_9117.class, new class_578())
      .registerTypeAdapter(class_2337.class, new class_6251())
      .registerTypeAdapter(class_5057.class, new class_8530())
      .create();
   public static final ThreadLocal<HashSet<class_6349>> field_48718 = new ThreadLocal<HashSet<class_6349>>();

   public static class_6349[] method_44258(String var0) {
      JsonElement var3 = field_48717.parse(var0);
      return !var3.isJsonArray()
         ? new class_6349[]{(class_6349)field_48719.fromJson(var3, class_6349.class)}
         : (class_6349[])field_48719.fromJson(var3, class_6349[].class);
   }

   public static String toString(class_6349 var0) {
      return field_48719.toJson(var0);
   }

   public static String toString(class_6349... var0) {
      return var0.length != 1 ? field_48719.toJson(new class_5028(var0)) : field_48719.toJson(var0[0]);
   }

   public class_6349 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      if (!var1.isJsonPrimitive()) {
         JsonObject var6 = var1.getAsJsonObject();
         if (!var6.has("translate")) {
            if (!var6.has("keybind")) {
               if (!var6.has("score")) {
                  return !var6.has("selector") ? (class_6349)var3.deserialize(var1, class_5028.class) : (class_6349)var3.deserialize(var1, class_5057.class);
               } else {
                  return (class_6349)var3.deserialize(var1, class_2337.class);
               }
            } else {
               return (class_6349)var3.deserialize(var1, class_9117.class);
            }
         } else {
            return (class_6349)var3.deserialize(var1, class_3083.class);
         }
      } else {
         return new class_5028(var1.getAsString());
      }
   }
}
