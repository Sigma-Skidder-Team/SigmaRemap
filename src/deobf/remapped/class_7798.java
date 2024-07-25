package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7798 extends class_8958 {
   private static final Logger field_39502 = LogManager.getLogger();
   public String field_39499;
   public String field_39501;
   public String field_39503;

   public static class_7798 method_35372(String var0) {
      JsonParser var3 = new JsonParser();
      class_7798 var4 = new class_7798();

      try {
         JsonObject var5 = var3.parse(var0).getAsJsonObject();
         var4.field_39499 = class_274.method_1243("address", var5, (String)null);
         var4.field_39501 = class_274.method_1243("resourcePackUrl", var5, (String)null);
         var4.field_39503 = class_274.method_1243("resourcePackHash", var5, (String)null);
      } catch (Exception var6) {
         field_39502.error("Could not parse RealmsServerAddress: " + var6.getMessage());
      }

      return var4;
   }
}
