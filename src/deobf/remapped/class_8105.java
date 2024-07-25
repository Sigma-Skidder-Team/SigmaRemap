package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8105 extends class_8958 {
   private static final Logger field_41511 = LogManager.getLogger();
   public String field_41509;
   public String field_41513;
   public String field_41510;

   public static class_8105 method_36794(String var0) {
      JsonParser var3 = new JsonParser();
      JsonObject var4 = var3.parse(var0).getAsJsonObject();
      class_8105 var5 = new class_8105();

      try {
         var5.field_41509 = class_274.method_1243("downloadLink", var4, "");
         var5.field_41513 = class_274.method_1243("resourcePackUrl", var4, "");
         var5.field_41510 = class_274.method_1243("resourcePackHash", var4, "");
      } catch (Exception var7) {
         field_41511.error("Could not parse WorldDownload: " + var7.getMessage());
      }

      return var5;
   }
}
