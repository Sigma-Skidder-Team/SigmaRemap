// 
// Decompiled by Procyon v0.6.0
// 

package totalcross.json;

public class CJsonUtils
{
    public static boolean getBooleanOrDefault(final JSONObject JSONObject, final String s, final boolean b) {
        try {
            return JSONObject.getBoolean(s);
        }
        catch (final JSONException class4406) {
            return b;
        }
    }
    
    public static byte getByteOrDefault(final JSONObject JSONObject, final String s, final byte b) {
        try {
            return (byte) JSONObject.getInt(s);
        }
        catch (final JSONException class4406) {
            return b;
        }
    }
    
    public static int getIntOrDefault(final JSONObject JSONObject, final String s, final int n) {
        try {
            return JSONObject.getInt(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static long getLongOrDefault(final JSONObject JSONObject, final String s, final long n) {
        try {
            return JSONObject.getLong(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static float getFloatOrDefault(final JSONObject JSONObject, final String s, final float n) {
        try {
            return (float) JSONObject.getDouble(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static double getDoubleOrDefault(final JSONObject JSONObject, final String s, final double n) {
        try {
            return JSONObject.getDouble(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static String getStringOrDefault(final JSONObject JSONObject, final String s, final String s2) {
        try {
            return JSONObject.getString(s);
        }
        catch (final JSONException class4406) {
            return s2;
        }
    }
    
    public static JSONObject getJSONObjectOrNull(final JSONObject JSONObject, final String s) {
        try {
            return JSONObject.getJSONObject(s);
        }
        catch (final JSONException class4406) {
            return null;
        }
    }
    
    public static JSONArray getJSONArrayOrNull(final JSONObject JSONObject, final String s) {
        try {
            return JSONObject.getJSONArray(s);
        }
        catch (final JSONException class4406) {
            return null;
        }
    }
}
