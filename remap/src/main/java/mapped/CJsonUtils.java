// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

public class CJsonUtils
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
            return (byte) JSONObject.getInt(s);
        }
        catch (final JSONException class4406) {
            return b;
        }
    }
    
    public static int method26632(final JSONObject JSONObject, final String s, final int n) {
        try {
            return JSONObject.getInt(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static long method26633(final JSONObject JSONObject, final String s, final long n) {
        try {
            return JSONObject.getLong(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static float method26634(final JSONObject JSONObject, final String s, final float n) {
        try {
            return (float) JSONObject.getDouble(s);
        }
        catch (final JSONException class4406) {
            return n;
        }
    }
    
    public static double method26635(final JSONObject JSONObject, final String s, final double n) {
        try {
            return JSONObject.getDouble(s);
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
