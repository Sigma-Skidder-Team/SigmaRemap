package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8018 extends class_8958 {
   private static final Logger field_41060 = LogManager.getLogger();
   public long field_41061;
   public int field_41063;
   public class_8489 field_41062 = class_8489.field_43492;

   public static class_8018 method_36392(String var0) {
      class_8018 var3 = new class_8018();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         var3.field_41061 = class_274.method_1244("startDate", var5, 0L);
         var3.field_41063 = class_274.method_1245("daysLeft", var5, 0);
         var3.field_41062 = method_36393(class_274.method_1243("subscriptionType", var5, class_8489.field_43492.name()));
      } catch (Exception var6) {
         field_41060.error("Could not parse Subscription: " + var6.getMessage());
      }

      return var3;
   }

   private static class_8489 method_36393(String var0) {
      try {
         return class_8489.valueOf(var0);
      } catch (Exception var4) {
         return class_8489.field_43492;
      }
   }
}
