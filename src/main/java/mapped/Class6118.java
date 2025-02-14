package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Iterator;
import java.util.List;

import com.mojang.realmsclient.dto.RealmsServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6118 extends Class6109 {
   private static final Logger field27397 = LogManager.getLogger();
   public List<RealmsServer> field27398;

   public static Class6118 method18885(String var0) {
      Class6118 var3 = new Class6118();
      var3.field27398 = Lists.newArrayList();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         if (var5.get("servers").isJsonArray()) {
            JsonArray var6 = var5.get("servers").getAsJsonArray();
            Iterator var7 = var6.iterator();

            while (var7.hasNext()) {
               var3.field27398.add(RealmsServer.method18912(((JsonElement)var7.next()).getAsJsonObject()));
            }
         }
      } catch (Exception var8) {
         field27397.error("Could not parse McoServerList: " + var8.getMessage());
      }

      return var3;
   }
}
