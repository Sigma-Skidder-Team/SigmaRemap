package remapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class class_9235 {
   public static float method_42594(JsonObject var0, String var1, float var2) {
      JsonElement var5 = var0.get(var1);
      return var5 != null ? var5.getAsFloat() : var2;
   }

   public static boolean method_42600(JsonObject var0, String var1, boolean var2) {
      JsonElement var5 = var0.get(var1);
      return var5 != null ? var5.getAsBoolean() : var2;
   }

   public static String method_42595(JsonObject var0, String var1) {
      return method_42596(var0, var1, (String)null);
   }

   public static String method_42596(JsonObject var0, String var1, String var2) {
      JsonElement var5 = var0.get(var1);
      return var5 != null ? var5.getAsString() : var2;
   }

   public static float[] method_42597(JsonElement var0, int var1) {
      return method_42598(var0, var1, (float[])null);
   }

   public static float[] method_42598(JsonElement var0, int var1, float[] var2) {
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

   public static int[] method_42601(JsonElement var0, int var1) {
      return method_42602(var0, var1, (int[])null);
   }

   public static int[] method_42602(JsonElement var0, int var1, int[] var2) {
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
