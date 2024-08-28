package mapped;

import com.google.gson.JsonObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6130 extends Class6109 {
   private static final Logger field27463 = LogManager.getLogger();
   public String field27464 = "";
   public String field27465 = "";
   public String field27466 = "";
   public String field27467 = "";
   public String field27468 = "";
   public String field27469;
   public String field27470 = "";
   public String field27471 = "";
   public Class2320 field27472 = Class2320.field15898;

   public static Class6130 method18924(JsonObject var0) {
      Class6130 var3 = new Class6130();

      try {
         var3.field27464 = Class5420.method17016("id", var0, "");
         var3.field27465 = Class5420.method17016("name", var0, "");
         var3.field27466 = Class5420.method17016("version", var0, "");
         var3.field27467 = Class5420.method17016("author", var0, "");
         var3.field27468 = Class5420.method17016("link", var0, "");
         var3.field27469 = Class5420.method17016("image", var0, (String)null);
         var3.field27470 = Class5420.method17016("trailer", var0, "");
         var3.field27471 = Class5420.method17016("recommendedPlayers", var0, "");
         var3.field27472 = Class2320.valueOf(Class5420.method17016("type", var0, Class2320.field15898.name()));
      } catch (Exception var5) {
         field27463.error("Could not parse WorldTemplate: " + var5.getMessage());
      }

      return var3;
   }
}
