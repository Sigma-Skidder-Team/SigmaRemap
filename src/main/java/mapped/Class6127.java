package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6127 extends Class6109 {
   private static final Logger field27438 = LogManager.getLogger();
   public String field27439;
   public String field27440;
   public String field27441;

   public static Class6127 method18905(String var0) {
      JsonParser var3 = new JsonParser();
      Class6127 var4 = new Class6127();

      try {
         JsonObject var5 = var3.parse(var0).getAsJsonObject();
         var4.field27439 = Class5420.method17016("address", var5, (String)null);
         var4.field27440 = Class5420.method17016("resourcePackUrl", var5, (String)null);
         var4.field27441 = Class5420.method17016("resourcePackHash", var5, (String)null);
      } catch (Exception var6) {
         field27438.error("Could not parse RealmsServerAddress: " + var6.getMessage());
      }

      return var4;
   }
}
