package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6119 extends Class6109 {
   private static final Logger field27399 = LogManager.getLogger();
   public List<Class6124> field27400;

   public static Class6119 method18886(String var0) {
      Class6119 var3 = new Class6119();
      var3.field27400 = Lists.newArrayList();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         if (var5.get("lists").isJsonArray()) {
            JsonArray var6 = var5.get("lists").getAsJsonArray();
            Iterator var7 = var6.iterator();

            while (var7.hasNext()) {
               var3.field27400.add(Class6124.method18895(((JsonElement)var7.next()).getAsJsonObject()));
            }
         }
      } catch (Exception var8) {
         field27399.error("Could not parse RealmsServerPlayerLists: " + var8.getMessage());
      }

      return var3;
   }
}
