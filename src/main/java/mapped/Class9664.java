package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class Class9664 {
   public static float method37715(JsonObject var0, String var1, float var2) {
      JsonElement var5 = var0.get(var1);
      return var5 != null ? var5.getAsFloat() : var2;
   }

   public static boolean method37716(JsonObject var0, String var1, boolean var2) {
      JsonElement var5 = var0.get(var1);
      return var5 != null ? var5.getAsBoolean() : var2;
   }

   public static String method37717(JsonObject var0, String var1) {
      return method37718(var0, var1, (String)null);
   }

   public static String method37718(JsonObject var0, String var1, String var2) {
      JsonElement var5 = var0.get(var1);
      return var5 != null ? var5.getAsString() : var2;
   }

   public static float[] method37719(JsonElement var0, int var1) {
      return method37720(var0, var1, (float[])null);
   }

   public static float[] method37720(JsonElement var0, int var1, float[] var2) {
      if (var0 == null) {
         return var2;
      } else {
         JsonArray var5 = var0.getAsJsonArray();
         if (var5.size() != var1) {
            throw new JsonParseException("Wrong array length: " + var5.size() + ", should be: " + var1 + ", array: " + var5);
         } else {
            float[] var6 = new float[var5.size()];

            for (int var7 = 0; var7 < var6.length; var7++) {
               var6[var7] = var5.get(var7).getAsFloat();
            }

            return var6;
         }
      }
   }

   public static int[] method37721(JsonElement var0, int var1) {
      return method37722(var0, var1, (int[])null);
   }

   public static int[] method37722(JsonElement var0, int var1, int[] var2) {
      if (var0 == null) {
         return var2;
      } else {
         JsonArray var5 = var0.getAsJsonArray();
         if (var5.size() != var1) {
            throw new JsonParseException("Wrong array length: " + var5.size() + ", should be: " + var1 + ", array: " + var5);
         } else {
            int[] var6 = new int[var5.size()];

            for (int var7 = 0; var7 < var6.length; var7++) {
               var6[var7] = var5.get(var7).getAsInt();
            }

            return var6;
         }
      }
   }
}
