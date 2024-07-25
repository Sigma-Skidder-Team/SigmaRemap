package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8793 extends class_8958 {
   private static final Logger field_44987 = LogManager.getLogger();
   public List<class_8434> field_44989;

   public static class_8793 method_40392(String var0) {
      class_8793 var3 = new class_8793();
      var3.field_44989 = Lists.newArrayList();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         if (var5.get("lists").isJsonArray()) {
            JsonArray var6 = var5.get("lists").getAsJsonArray();
            Iterator var7 = var6.iterator();

            while (var7.hasNext()) {
               var3.field_44989.add(class_8434.method_38803(((JsonElement)var7.next()).getAsJsonObject()));
            }
         }
      } catch (Exception var8) {
         field_44987.error("Could not parse RealmsServerPlayerLists: " + var8.getMessage());
      }

      return var3;
   }
}
