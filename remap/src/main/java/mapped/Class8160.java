// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.json.JSONException;
import java.io.Serializable;

public class Class8160
{
    public static String method26949(final String s) {
        final String trim = s.trim();
        final int length = trim.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = trim.charAt(i);
            if (char1 >= ' ') {
                if (char1 != '+') {
                    if (char1 != '%') {
                        if (char1 != '=') {
                            if (char1 != ';') {
                                sb.append(char1);
                                continue;
                            }
                        }
                    }
                }
            }
            sb.append('%');
            sb.append(Character.forDigit((char)(char1 >>> 4 & 0xF), 16));
            sb.append(Character.forDigit((char)(char1 & '\u000f'), 16));
        }
        return sb.toString();
    }
    
    public static JSONObject method26950(final String s) throws JSONException {
        final JSONObject JSONObject = new JSONObject();
        final JSONTokener class4406 = new JSONTokener(s);
        JSONObject.put("name", class4406.method30790('='));
        class4406.method30786('=');
        JSONObject.put("value", class4406.method30790(';'));
        class4406.method30785();
        while (class4406.method30784()) {
            final String method26951 = method26951(class4406.method30791("=;"));
            Serializable s2;
            if (class4406.method30785() == '=') {
                s2 = method26951(class4406.method30790(';'));
                class4406.method30785();
            }
            else {
                if (!method26951.equals("secure")) {
                    throw class4406.syntaxError("Missing '=' in cookie parameter.");
                }
                s2 = Boolean.TRUE;
            }
            JSONObject.put(method26951, s2);
        }
        return JSONObject;
    }
    
    public static String toString(final JSONObject JSONObject) throws JSONException {
        final StringBuilder sb = new StringBuilder();
        sb.append(method26949(JSONObject.getString("name")));
        sb.append("=");
        sb.append(method26949(JSONObject.getString("value")));
        if (JSONObject.has("expires")) {
            sb.append(";expires=");
            sb.append(JSONObject.getString("expires"));
        }
        if (JSONObject.has("domain")) {
            sb.append(";domain=");
            sb.append(method26949(JSONObject.getString("domain")));
        }
        if (JSONObject.has("path")) {
            sb.append(";path=");
            sb.append(method26949(JSONObject.getString("path")));
        }
        if (JSONObject.method13280("secure")) {
            sb.append(";secure");
        }
        return sb.toString();
    }
    
    public static String method26951(final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            char char1 = s.charAt(i);
            if (char1 != '+') {
                if (char1 == '%') {
                    if (i + 2 < length) {
                        final int method30782 = JSONTokener.method30782(s.charAt(i + 1));
                        final int method30783 = JSONTokener.method30782(s.charAt(i + 2));
                        if (method30782 >= 0) {
                            if (method30783 >= 0) {
                                char1 = (char)(method30782 * 16 + method30783);
                                i += 2;
                            }
                        }
                    }
                }
            }
            else {
                char1 = ' ';
            }
            sb.append(char1);
        }
        return sb.toString();
    }
}
