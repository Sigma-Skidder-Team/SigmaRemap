package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6124 extends Class6109 {
   private static final Logger field27417 = LogManager.getLogger();
   private static final JsonParser field27418 = new JsonParser();
   public long field27419;
   public List<String> field27420;

   public static Class6124 method18895(JsonObject var0) {
      Class6124 var3 = new Class6124();

      try {
         var3.field27419 = Class5420.method17018("serverId", var0, -1L);
         String var4 = Class5420.method17016("playerList", var0, (String)null);
         if (var4 != null) {
            JsonElement var5 = field27418.parse(var4);
            if (var5.isJsonArray()) {
               var3.field27420 = method18896(var5.getAsJsonArray());
            } else {
               var3.field27420 = Lists.newArrayList();
            }
         } else {
            var3.field27420 = Lists.newArrayList();
         }
      } catch (Exception var6) {
         field27417.error("Could not parse RealmsServerPlayerList: " + var6.getMessage());
      }

      return var3;
   }

   private static List<String> method18896(JsonArray var0) {
      ArrayList var3 = Lists.newArrayList();

      for (JsonElement var5 : var0) {
         try {
            var3.add(var5.getAsString());
         } catch (Exception var7) {
         }
      }

      return var3;
   }
}
