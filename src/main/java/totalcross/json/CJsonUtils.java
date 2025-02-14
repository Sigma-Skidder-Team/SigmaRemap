package totalcross.json;

public class CJsonUtils {

   public static boolean getBooleanOrDefault(JSONObject jsonObject, String key, boolean defaultValue) {
      try {
         return jsonObject.getBoolean(key);
      } catch (JSONException2 e) {
         return defaultValue;
      }
   }

   public static byte getByteOrDefault(JSONObject jsonObject, String key, byte defaultValue) {
      try {
         return (byte)jsonObject.getInt(key);
      } catch (JSONException2 | JSONException e) {
         return defaultValue;
      }
   }

   public static int getIntOrDefault(JSONObject jsonObject, String key, int defaultValue) {
      try {
         return jsonObject.getInt(key);
      } catch (JSONException2 | JSONException e) {
         return defaultValue;
      }
   }

   public static long getLongOrDefault(JSONObject jsonObject, String key, long defaultValue) {
      try {
         return jsonObject.getLong(key);
      } catch (JSONException2 | JSONException e) {
         return defaultValue;
      }
   }

   public static float getFloatOrDefault(JSONObject jsonObject, String key, float defaultValue) {
      try {
         return (float)jsonObject.getDouble(key);
      } catch (JSONException2 | JSONException e) {
         return defaultValue;
      }
   }

   public static double getDoubleOrDefault(JSONObject jsonObject, String key, double defaultValue) {
      try {
         return jsonObject.getDouble(key);
      } catch (JSONException2 | JSONException e) {
         return defaultValue;
      }
   }

   public static String getStringOrDefault(JSONObject jsonObject, String key, String defaultValue) {
      try {
         return jsonObject.getString(key);
      } catch (JSONException2 | JSONException e) {
         return defaultValue;
      }
   }

   public static JSONObject getJSONObjectOrNull(JSONObject jsonObject, String key) {
      try {
         return jsonObject.getJSONObject(key);
      } catch (JSONException2 | JSONException e) {
         return null;
      }
   }

   public static JSONArray getJSONArrayOrNull(JSONObject jsonObject, String key) {
      try {
         return jsonObject.getJSONArray(key);
      } catch (JSONException2 | JSONException e) {
         System.out.println(e + " - key: " + key   );
         return null;
      }
   }
}
