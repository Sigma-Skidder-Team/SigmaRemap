package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Date;

public class Class5420 {
   private static String[] field24102;

   public static String method17016(String var0, JsonObject var1, String var2) {
      JsonElement var5 = var1.get(var0);
      if (var5 == null) {
         return var2;
      } else {
         return !var5.isJsonNull() ? var5.getAsString() : var2;
      }
   }

   public static int method17017(String var0, JsonObject var1, int var2) {
      JsonElement var5 = var1.get(var0);
      if (var5 == null) {
         return var2;
      } else {
         return !var5.isJsonNull() ? var5.getAsInt() : var2;
      }
   }

   public static long method17018(String var0, JsonObject var1, long var2) {
      JsonElement var6 = var1.get(var0);
      if (var6 == null) {
         return var2;
      } else {
         return !var6.isJsonNull() ? var6.getAsLong() : var2;
      }
   }

   public static boolean method17019(String var0, JsonObject var1, boolean var2) {
      JsonElement var5 = var1.get(var0);
      if (var5 == null) {
         return var2;
      } else {
         return !var5.isJsonNull() ? var5.getAsBoolean() : var2;
      }
   }

   public static Date method17020(String var0, JsonObject var1) {
      JsonElement var4 = var1.get(var0);
      return var4 == null ? new Date() : new Date(Long.parseLong(var4.getAsString()));
   }
}
