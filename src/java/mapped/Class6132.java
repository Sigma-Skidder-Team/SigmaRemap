package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6132 extends Class6109 {
   private static final Logger field27475 = LogManager.getLogger();
   public List<Class6110> field27476 = Lists.newArrayList();

   public static Class6132 method18926(String var0) {
      Class6132 var3 = new Class6132();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         if (var5.get("invites").isJsonArray()) {
            Iterator var6 = var5.get("invites").getAsJsonArray().iterator();

            while (var6.hasNext()) {
               var3.field27476.add(Class6110.method18873(((JsonElement)var6.next()).getAsJsonObject()));
            }
         }
      } catch (Exception var7) {
         field27475.error("Could not parse PendingInvitesList: " + var7.getMessage());
      }

      return var3;
   }
}
