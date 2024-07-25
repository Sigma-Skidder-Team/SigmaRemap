package remapped;

import com.google.common.base.Charsets;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class_1831 implements class_2676 {
   private final Map<String, String> field_9285 = new HashMap<String, String>();

   public class_1831(String var1) throws IOException {
      try (InputStreamReader var4 = new InputStreamReader(class_1831.class.getResourceAsStream(var1), Charsets.UTF_8)) {
         JsonObject var6 = (JsonObject)new Gson().fromJson(var4, JsonObject.class);

         for (Entry var8 : var6.entrySet()) {
            this.field_9285.put((String)var8.getKey(), ((JsonElement)var8.getValue()).getAsString());
         }
      }
   }

   public String 醧敤랾樽鷏뼢(String var1) {
      return this.field_9285.get(var1);
   }

   public Map<String, String> method_8087() {
      return this.field_9285;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof class_1831) {
         class_1831 var4 = (class_1831)var1;
         if (!var4.method_8086(this)) {
            return false;
         } else {
            Map var5 = this.method_8087();
            Map var6 = var4.method_8087();
            return var5 != null ? var5.equals(var6) : var6 == null;
         }
      } else {
         return false;
      }
   }

   public boolean method_8086(Object var1) {
      return var1 instanceof class_1831;
   }

   @Override
   public int hashCode() {
      byte var3 = 59;
      byte var4 = 1;
      Map var5 = this.method_8087();
      return var4 * 59 + (var5 != null ? var5.hashCode() : 43);
   }

   @Override
   public String toString() {
      return "TranslationRegistry.JsonProvider()";
   }
}
