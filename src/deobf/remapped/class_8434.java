package remapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8434 extends class_8958 {
   private static final Logger field_43157 = LogManager.getLogger();
   private static final JsonParser field_43158 = new JsonParser();
   public long field_43161;
   public List<String> field_43159;

   public static class_8434 method_38803(JsonObject var0) {
      class_8434 var3 = new class_8434();

      try {
         var3.field_43161 = class_274.method_1244("serverId", var0, -1L);
         String var4 = class_274.method_1243("playerList", var0, (String)null);
         if (var4 != null) {
            JsonElement var5 = field_43158.parse(var4);
            if (var5.isJsonArray()) {
               var3.field_43159 = method_38802(var5.getAsJsonArray());
            } else {
               var3.field_43159 = Lists.newArrayList();
            }
         } else {
            var3.field_43159 = Lists.newArrayList();
         }
      } catch (Exception var6) {
         field_43157.error("Could not parse RealmsServerPlayerList: " + var6.getMessage());
      }

      return var3;
   }

   private static List<String> method_38802(JsonArray var0) {
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
