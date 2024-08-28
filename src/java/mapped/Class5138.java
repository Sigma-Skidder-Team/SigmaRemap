package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class Class5138 implements Supplier<JsonElement> {
   private final Map<Class8866<?>, Class8866<?>.Class8767> field23356 = Maps.newLinkedHashMap();

   public <T> Class5138 method15911(Class8866<T> var1, T var2) {
      Class8866<?>.Class8767 var5 = this.field23356.put(var1, var1.method32265(var2));
      if (var5 == null) {
         return this;
      } else {
         throw new IllegalStateException("Replacing value of " + var5 + " with " + var2);
      }
   }

   public static Class5138 method15912() {
      return new Class5138();
   }

   public static Class5138 method15913(Class5138 var0, Class5138 var1) {
      Class5138 var4 = new Class5138();
      var4.field23356.putAll(var0.field23356);
      var4.field23356.putAll(var1.field23356);
      return var4;
   }

   public JsonElement get() {
      JsonObject var3 = new JsonObject();
      this.field23356.values().forEach(var1 -> var1.method31624(var3));
      return var3;
   }

   public static JsonElement method15914(List<Class5138> var0) {
      if (var0.size() != 1) {
         JsonArray var3 = new JsonArray();
         var0.forEach(var1 -> var3.add(var1.get()));
         return var3;
      } else {
         return var0.get(0).get();
      }
   }
}
