package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7788 extends class_8958 {
   private static final Logger field_39468 = LogManager.getLogger();
   public String field_39466;

   public static class_7788 method_35343(String var0) {
      class_7788 var3 = new class_7788();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         var3.field_39466 = class_274.method_1243("newsLink", var5, (String)null);
      } catch (Exception var6) {
         field_39468.error("Could not parse RealmsNews: " + var6.getMessage());
      }

      return var3;
   }
}
