package remapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8960 extends class_8958 {
   private static final Logger field_45904 = LogManager.getLogger();
   public String field_45902;
   public Date field_45899;
   public long field_45905;
   private boolean field_45901;
   public Map<String, String> field_45898 = Maps.newHashMap();
   public Map<String, String> field_45903 = Maps.newHashMap();

   public static class_8960 method_41112(JsonElement var0) {
      JsonObject var3 = var0.getAsJsonObject();
      class_8960 var4 = new class_8960();

      try {
         var4.field_45902 = class_274.method_1243("backupId", var3, "");
         var4.field_45899 = class_274.method_1242("lastModifiedDate", var3);
         var4.field_45905 = class_274.method_1244("size", var3, 0L);
         if (var3.has("metadata")) {
            JsonObject var5 = var3.getAsJsonObject("metadata");

            for (Entry var7 : var5.entrySet()) {
               if (!((JsonElement)var7.getValue()).isJsonNull()) {
                  var4.field_45898.put(method_41111((String)var7.getKey()), ((JsonElement)var7.getValue()).getAsString());
               }
            }
         }
      } catch (Exception var8) {
         field_45904.error("Could not parse Backup: " + var8.getMessage());
      }

      return var4;
   }

   private static String method_41111(String var0) {
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

   public boolean method_41113() {
      return this.field_45901;
   }

   public void method_41114(boolean var1) {
      this.field_45901 = var1;
   }
}
