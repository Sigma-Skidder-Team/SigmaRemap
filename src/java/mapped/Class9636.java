package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9636 {
   private static final Logger field45062 = LogManager.getLogger();
   private final String field45063;
   private final int field45064;

   private Class9636(String var1, int var2) {
      this.field45063 = var1;
      this.field45064 = var2;
   }

   public static Class9636 method37559(String var0) {
      try {
         JsonParser var3 = new JsonParser();
         JsonObject var4 = var3.parse(var0).getAsJsonObject();
         String var5 = Class5420.method17016("errorMsg", var4, "");
         int var6 = Class5420.method17017("errorCode", var4, -1);
         return new Class9636(var5, var6);
      } catch (Exception var7) {
         field45062.error("Could not parse RealmsError: " + var7.getMessage());
         field45062.error("The error was: " + var0);
         return new Class9636("Failed to parse response from server", -1);
      }
   }

   public String method37560() {
      return this.field45063;
   }

   public int method37561() {
      return this.field45064;
   }
}
