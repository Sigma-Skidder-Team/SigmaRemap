package mapped;

import totalcross.json.JSONArray;
import totalcross.json.JSONException2;
import totalcross.json.JSONObject;

public class Class8000 {
   private static String[] field34399;

   public static boolean method27324(JSONObject var0, String var1, boolean var2) {
      try {
         return var0.method21763(var1);
      } catch (JSONException2 var6) {
         return var2;
      }
   }

   public static byte method27325(JSONObject var0, String var1, byte var2) {
      try {
         return (byte)var0.method21767(var1);
      } catch (JSONException2 var6) {
         return var2;
      }
   }

   public static int method27326(JSONObject var0, String var1, int var2) {
      try {
         return var0.method21767(var1);
      } catch (JSONException2 var6) {
         return var2;
      }
   }

   public static long method27327(JSONObject var0, String var1, long var2) {
      try {
         return var0.method21770(var1);
      } catch (JSONException2 var7) {
         return var2;
      }
   }

   public static float method27328(JSONObject var0, String var1, float var2) {
      try {
         return (float)var0.method21766(var1);
      } catch (JSONException2 var6) {
         return var2;
      }
   }

   public static double method27329(JSONObject var0, String var1, double var2) {
      try {
         return var0.method21766(var1);
      } catch (JSONException2 var7) {
         return var2;
      }
   }

   public static String method27330(JSONObject var0, String var1, String var2) {
      try {
         return var0.getString(var1);
      } catch (JSONException2 var6) {
         return var2;
      }
   }

   public static JSONObject method27331(JSONObject var0, String var1) {
      try {
         return var0.method21769(var1);
      } catch (JSONException2 var5) {
         return null;
      }
   }

   public static JSONArray method27332(JSONObject var0, String var1) {
      try {
         return var0.getJSONArray(var1);
      } catch (JSONException2 var5) {
         return null;
      }
   }
}
