package mapped;

import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Set;

public class Class6123 extends Class6109 {
   public Set<String> field27416 = Sets.newHashSet();

   public static Class6123 method18894(String var0) {
      Class6123 var3 = new Class6123();
      JsonParser var4 = new JsonParser();

      try {
         JsonElement var5 = var4.parse(var0);
         JsonObject var6 = var5.getAsJsonObject();
         JsonElement var7 = var6.get("ops");
         if (var7.isJsonArray()) {
            for (JsonElement var9 : var7.getAsJsonArray()) {
               var3.field27416.add(var9.getAsString());
            }
         }
      } catch (Exception var10) {
      }

      return var3;
   }
}
