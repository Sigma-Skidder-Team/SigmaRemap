package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6122 extends Class6109 {
   private static final Logger field27409 = LogManager.getLogger();
   public String field27410;
   public Date field27411;
   public long field27412;
   private boolean field27413;
   public Map<String, String> field27414 = Maps.newHashMap();
   public Map<String, String> field27415 = Maps.newHashMap();

   public static Class6122 method18890(JsonElement var0) {
      JsonObject var3 = var0.getAsJsonObject();
      Class6122 var4 = new Class6122();

      try {
         var4.field27410 = Class5420.method17016("backupId", var3, "");
         var4.field27411 = Class5420.method17020("lastModifiedDate", var3);
         var4.field27412 = Class5420.method17018("size", var3, 0L);
         if (var3.has("metadata")) {
            JsonObject var5 = var3.getAsJsonObject("metadata");

            for (Entry var7 : var5.entrySet()) {
               if (!((JsonElement)var7.getValue()).isJsonNull()) {
                  var4.field27414.put(method18891((String)var7.getKey()), ((JsonElement)var7.getValue()).getAsString());
               }
            }
         }
      } catch (Exception var8) {
         field27409.error("Could not parse Backup: " + var8.getMessage());
      }

      return var4;
   }

   private static String method18891(String var0) {
      String[] var3 = var0.split("_");
      StringBuilder var4 = new StringBuilder();

      for (String var8 : var3) {
         if (var8 != null && var8.length() >= 1) {
            if (!"of".equals(var8)) {
               char var9 = Character.toUpperCase(var8.charAt(0));
               var4.append(var9).append(var8.substring(1)).append(" ");
            } else {
               var4.append(var8).append(" ");
            }
         }
      }

      return var4.toString();
   }

   public boolean method18892() {
      return this.field27413;
   }

   public void method18893(boolean var1) {
      this.field27413 = var1;
   }
}
