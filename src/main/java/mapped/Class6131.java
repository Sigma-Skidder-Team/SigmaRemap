package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6131 extends Class6109 {
   private static final Logger field27473 = LogManager.getLogger();
   public String field27474;

   public static Class6131 method18925(String var0) {
      Class6131 var3 = new Class6131();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         var3.field27474 = Class5420.method17016("newsLink", var5, (String)null);
      } catch (Exception var6) {
         field27473.error("Could not parse RealmsNews: " + var6.getMessage());
      }

      return var3;
   }
}
