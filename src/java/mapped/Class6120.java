package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6120 extends Class6109 {
   private static final Logger field27401 = LogManager.getLogger();
   public String field27402;
   public String field27403;
   public String field27404;

   public static Class6120 method18887(String var0) {
      JsonParser var3 = new JsonParser();
      JsonObject var4 = var3.parse(var0).getAsJsonObject();
      Class6120 var5 = new Class6120();

      try {
         var5.field27402 = Class5420.method17016("downloadLink", var4, "");
         var5.field27403 = Class5420.method17016("resourcePackUrl", var4, "");
         var5.field27404 = Class5420.method17016("resourcePackHash", var4, "");
      } catch (Exception var7) {
         field27401.error("Could not parse WorldDownload: " + var7.getMessage());
      }

      return var5;
   }
}
