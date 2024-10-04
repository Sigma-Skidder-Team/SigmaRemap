package totalcross.json;

public class CJsonUtils {

    public static boolean getBooleanOrDefault(JSONObject jsonObject, String key, boolean defaultValue) {
      try {
         return jsonObject.method21763(key);
      } catch (JSONException2 e) {
         return defaultValue;
      }
   }

   public static byte getByteOrDefault(JSONObject jsonObject, String key, byte defaultValue) {
      try {
         return (byte)jsonObject.method21767(key);
      } catch (JSONException2 e) {
         return defaultValue;
      }
   }

   public static int getIntOrDefault(JSONObject jsonObject, String key, int defaultValue) {
      try {
         return jsonObject.method21767(key);
      } catch (JSONException2 e) {
         return defaultValue;
      }
   }

   public static long getLongOrDefault(JSONObject jsonObject, String key, long defaultValue) {
      try {
         return jsonObject.method21770(key);
      } catch (JSONException2 e) {
         return defaultValue;
      }
   }

   public static float getFloatOrDefault(JSONObject jsonObject, String key, float defaultValue) {
      try {
         return (float)jsonObject.method21766(key);
      } catch (JSONException2 e) {
         return defaultValue;
      }
   }

   public static double getDoubleOrDefault(JSONObject jsonObject, String key, double defaultValue) {
      try {
         return jsonObject.method21766(key);
      } catch (JSONException2 e) {
         return defaultValue;
      }
   }

   public static String getStringOrDefault(JSONObject jsonObject, String key, String defaultValue) {
      try {
         return jsonObject.getString(key);
      } catch (JSONException2 e) {
         return defaultValue;
      }
   }

   public static JSONObject getJSONObjectOrNull(JSONObject jsonObject, String key) {
      try {
         return jsonObject.getJsonObject(key);
      } catch (JSONException2 e) {
         return null;
      }
   }

   public static JSONArray getJSONArrayOrNull(JSONObject jsonObject, String key) {
      try {
         return jsonObject.getJSONArray(key);
      } catch (JSONException2 e) {
         return null;
      }
   }
}
