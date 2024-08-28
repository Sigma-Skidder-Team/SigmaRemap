package mapped;

import com.google.common.base.Charsets;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Class7341 implements Class7342 {
   private final Map<String, String> field31447 = new HashMap<String, String>();

   public Class7341(String var1) throws IOException {
      try (InputStreamReader var4 = new InputStreamReader(Class7341.class.getResourceAsStream(var1), Charsets.UTF_8)) {
         JsonObject var6 = (JsonObject)new Gson().fromJson(var4, JsonObject.class);

         for (Entry var8 : var6.entrySet()) {
            this.field31447.put((String)var8.getKey(), ((JsonElement)var8.getValue()).getAsString());
         }
      }
   }

   @Override
   public String method23265(String var1) {
      return this.field31447.get(var1);
   }

   public Map<String, String> method23266() {
      return this.field31447;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof Class7341) {
         Class7341 var4 = (Class7341)var1;
         if (!var4.method23267(this)) {
            return false;
         } else {
            Map var5 = this.method23266();
            Map var6 = var4.method23266();
            return var5 != null ? var5.equals(var6) : var6 == null;
         }
      } else {
         return false;
      }
   }

   public boolean method23267(Object var1) {
      return var1 instanceof Class7341;
   }

   @Override
   public int hashCode() {
      byte var3 = 59;
      byte var4 = 1;
      Map var5 = this.method23266();
      return var4 * 59 + (var5 != null ? var5.hashCode() : 43);
   }

   @Override
   public String toString() {
      return "TranslationRegistry.JsonProvider()";
   }
}
