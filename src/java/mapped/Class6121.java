package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6121 extends Class6109 {
   private static final Logger field27405 = LogManager.getLogger();
   public long field27406;
   public int field27407;
   public Class2144 field27408 = Class2144.field14031;

   public static Class6121 method18888(String var0) {
      Class6121 var3 = new Class6121();

      try {
         JsonParser var4 = new JsonParser();
         JsonObject var5 = var4.parse(var0).getAsJsonObject();
         var3.field27406 = Class5420.method17018("startDate", var5, 0L);
         var3.field27407 = Class5420.method17017("daysLeft", var5, 0);
         var3.field27408 = method18889(Class5420.method17016("subscriptionType", var5, Class2144.field14031.name()));
      } catch (Exception var6) {
         field27405.error("Could not parse Subscription: " + var6.getMessage());
      }

      return var3;
   }

   private static Class2144 method18889(String var0) {
      try {
         return Class2144.valueOf(var0);
      } catch (Exception var4) {
         return Class2144.field14031;
      }
   }
}
