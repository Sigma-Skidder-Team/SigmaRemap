// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8105
{
    private static String[] field33370;
    
    public static boolean method26630(final JSONObject JSONObject, final String s, final boolean b) {
        try {
            return JSONObject.getBoolean(s);
        }
        catch (final JSONException class4406) {
            return b;
        }
    }
    
    public static byte method26631(final JSONObject JSONObject, final String s, final byte b) {
        try {
            return (byte) JSONObject.method13262(s);
        }
        catch (final JSONException class4406) {
            return b;
        }
    }
    
    public static int method26632(final JSONObject JSONObject, final String s, final int n) {
        try {
            return JSONObject.method13262(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static long method26633(final JSONObject JSONObject, final String s, final long n) {
        try {
            return JSONObject.method13265(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static float method26634(final JSONObject JSONObject, final String s, final float n) {
        try {
            return (float) JSONObject.method13261(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static double method26635(final JSONObject JSONObject, final String s, final double n) {
        try {
            return JSONObject.method13261(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static String method26636(final JSONObject JSONObject, final String s, final String s2) {
        try {
            return JSONObject.getString(s);
        }
        catch (final JSONException class4406) {
            return s2;
        }
    }
    
    public static JSONObject method26637(final JSONObject JSONObject, final String s) {
        try {
            return JSONObject.method13264(s);
        }
        catch (final JSONException class4406) {
            return null;
        }
    }
    
    public static JSONArray method26638(final JSONObject JSONObject, final String s) {
        try {
            return JSONObject.method13263(s);
        }
        catch (final JSONException class4406) {
            return null;
        }
    }
}
