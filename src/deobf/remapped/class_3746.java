package remapped;

import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Set;

public class class_3746 extends class_8958 {
   public Set<String> field_18320 = Sets.newHashSet();

   public static class_3746 method_17354(String var0) {
      class_3746 var3 = new class_3746();
      JsonParser var4 = new JsonParser();

      try {
         JsonElement var5 = var4.parse(var0);
         JsonObject var6 = var5.getAsJsonObject();
         JsonElement var7 = var6.get("ops");
         if (var7.isJsonArray()) {
            for (JsonElement var9 : var7.getAsJsonArray()) {
               var3.field_18320.add(var9.getAsString());
            }
         }
      } catch (Exception var10) {
      }

      return var3;
   }
}
