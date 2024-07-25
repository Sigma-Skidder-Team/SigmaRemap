package remapped;

import com.google.gson.JsonObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2496 extends class_8958 {
   private static final Logger field_12421 = LogManager.getLogger();
   public String field_12412 = "";
   public String field_12418 = "";
   public String field_12417 = "";
   public String field_12413 = "";
   public String field_12422 = "";
   public String field_12416;
   public String field_12415 = "";
   public String field_12414 = "";
   public class_8422 field_12419 = class_8422.field_43081;

   public static class_2496 method_11409(JsonObject var0) {
      class_2496 var3 = new class_2496();

      try {
         var3.field_12412 = class_274.method_1243("id", var0, "");
         var3.field_12418 = class_274.method_1243("name", var0, "");
         var3.field_12417 = class_274.method_1243("version", var0, "");
         var3.field_12413 = class_274.method_1243("author", var0, "");
         var3.field_12422 = class_274.method_1243("link", var0, "");
         var3.field_12416 = class_274.method_1243("image", var0, (String)null);
         var3.field_12415 = class_274.method_1243("trailer", var0, "");
         var3.field_12414 = class_274.method_1243("recommendedPlayers", var0, "");
         var3.field_12419 = class_8422.valueOf(class_274.method_1243("type", var0, class_8422.field_43081.name()));
      } catch (Exception var5) {
         field_12421.error("Could not parse WorldTemplate: " + var5.getMessage());
      }

      return var3;
   }
}
