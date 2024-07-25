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

public class class_9752 extends class_8958 {
   private static final Logger field_49551 = LogManager.getLogger();
   public List<class_7675> field_49553;

   public static class_9752 method_45025(String var0) {
      class_9752 var3 = new class_9752();
      var3.field_49553 = Lists.newArrayList();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         if (var5.get("servers").isJsonArray()) {
            JsonArray var6 = var5.get("servers").getAsJsonArray();
            Iterator var7 = var6.iterator();

            while (var7.hasNext()) {
               var3.field_49553.add(class_7675.method_34775(((JsonElement)var7.next()).getAsJsonObject()));
            }
         }
      } catch (Exception var8) {
         field_49551.error("Could not parse McoServerList: " + var8.getMessage());
      }

      return var3;
   }
}
