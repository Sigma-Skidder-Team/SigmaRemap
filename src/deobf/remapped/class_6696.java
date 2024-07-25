package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6696 extends class_8958 {
   private static final Logger field_34590 = LogManager.getLogger();
   public List<class_2926> field_34591 = Lists.newArrayList();

   public static class_6696 method_30693(String var0) {
      class_6696 var3 = new class_6696();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         if (var5.get("invites").isJsonArray()) {
            Iterator var6 = var5.get("invites").getAsJsonArray().iterator();

            while (var6.hasNext()) {
               var3.field_34591.add(class_2926.method_13379(((JsonElement)var6.next()).getAsJsonObject()));
            }
         }
      } catch (Exception var7) {
         field_34590.error("Could not parse PendingInvitesList: " + var7.getMessage());
      }

      return var3;
   }
}
