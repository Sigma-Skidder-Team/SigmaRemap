package remapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9131 {
   private static final Logger field_46717 = LogManager.getLogger();
   private final String field_46719;
   private final int field_46718;

   private class_9131(String var1, int var2) {
      this.field_46719 = var1;
      this.field_46718 = var2;
   }

   public static class_9131 method_42028(String var0) {
      try {
         JsonParser var3 = new JsonParser();
         JsonObject var4 = var3.parse(var0).getAsJsonObject();
         String var5 = class_274.method_1243("errorMsg", var4, "");
         int var6 = class_274.method_1245("errorCode", var4, -1);
         return new class_9131(var5, var6);
      } catch (Exception var7) {
         field_46717.error("Could not parse RealmsError: " + var7.getMessage());
         field_46717.error("The error was: " + var0);
         return new class_9131("Failed to parse response from server", -1);
      }
   }

   public String method_42029() {
      return this.field_46719;
   }

   public int method_42031() {
      return this.field_46718;
   }
}
