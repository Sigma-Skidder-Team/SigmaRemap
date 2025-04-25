// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.json.JSONException;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;
import totalcross.json.JSONTokener;

public class Class9524
{
    private static String method35550(final JSONTokener JSONTokener) throws JSONException {
        char method30785;
        do {
            method30785 = JSONTokener.next();
        } while (method30785 == ' ' || method30785 == '\t');
        switch (method30785) {
            case 0: {
                return null;
            }
            case 34:
            case 39: {
                final char c = method30785;
                final StringBuffer sb = new StringBuffer();
                while (true) {
                    final char method30786 = JSONTokener.next();
                    if (method30786 == c) {
                        return sb.toString();
                    }
                    if (method30786 == '\0' || method30786 == '\n' || method30786 == '\r') {
                        throw JSONTokener.syntaxError("Missing close quote '" + c + "'.");
                    }
                    sb.append(method30786);
                }
                break;
            }
            case 44: {
                JSONTokener.back();
                return "";
            }
            default: {
                JSONTokener.back();
                return JSONTokener.nextTo(',');
            }
        }
    }
    
    public static JSONArray method35551(final JSONTokener JSONTokener) throws JSONException {
        final JSONArray class8827 = new JSONArray();
        char c = '\0';
        Label_0101: {
            while (true) {
                final String method35550 = method35550(JSONTokener);
                c = JSONTokener.next();
                if (method35550 == null) {
                    break;
                }
                if (class8827.length() == 0) {
                    if (method35550.length() == 0) {
                        if (c != ',') {
                            break;
                        }
                    }
                }
                class8827.put(method35550);
                while (c != ',') {
                    if (c != ' ') {
                        break Label_0101;
                    }
                    c = JSONTokener.next();
                }
            }
            return null;
        }
        if (c != '\n') {
            if (c != '\r') {
                if (c != '\0') {
                    throw JSONTokener.syntaxError("Bad character '" + c + "' (" + (int)c + ").");
                }
            }
        }
        return class8827;
    }
    
    public static JSONObject method35552(final JSONArray JSONArray, final JSONTokener class89) throws JSONException {
        final JSONArray method35551 = method35551(class89);
        return (method35551 == null) ? null : method35551.toJSONObject(JSONArray);
    }
    
    public static String method35553(final JSONArray JSONArray) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < JSONArray.length(); ++i) {
            if (i > 0) {
                sb.append(',');
            }
            final Object method463 = JSONArray.opt(i);
            if (method463 != null) {
                final String string = method463.toString();
                Label_0084: {
                    if (string.length() > 0) {
                        if (string.indexOf(44) < 0) {
                            if (string.indexOf(10) < 0) {
                                if (string.indexOf(13) < 0) {
                                    if (string.indexOf(0) < 0) {
                                        if (string.charAt(0) != '\"') {
                                            break Label_0084;
                                        }
                                    }
                                }
                            }
                        }
                        sb.append('\"');
                        for (int length = string.length(), j = 0; j < length; ++j) {
                            final char char1 = string.charAt(j);
                            if (char1 >= ' ') {
                                if (char1 != '\"') {
                                    sb.append(char1);
                                }
                            }
                        }
                        sb.append('\"');
                        continue;
                    }
                }
                sb.append(string);
            }
        }
        sb.append('\n');
        return sb.toString();
    }
    
    public static JSONArray method35554(final String s) throws JSONException {
        return method35555(new JSONTokener(s));
    }
    
    public static JSONArray method35555(final JSONTokener JSONTokener) throws JSONException {
        return method35557(method35551(JSONTokener), JSONTokener);
    }
    
    public static JSONArray method35556(final JSONArray JSONArray, final String s) throws JSONException {
        return method35557(JSONArray, new JSONTokener(s));
    }
    
    public static JSONArray method35557(final JSONArray JSONArray, final JSONTokener class89) throws JSONException {
        if (JSONArray == null || JSONArray.length() == 0) {
            return null;
        }
        final JSONArray class90 = new JSONArray();
        while (true) {
            final JSONObject method35552 = method35552(JSONArray, class89);
            if (method35552 == null) {
                break;
            }
            class90.put(method35552);
        }
        if (class90.length() != 0) {
            return class90;
        }
        return null;
    }
    
    public static String toString(final JSONArray JSONArray) throws JSONException {
        final JSONObject method475 = JSONArray.optJSONObject(0);
        if (method475 != null) {
            final JSONArray method476 = method475.names();
            if (method476 != null) {
                return method35553(method476) + toString(method476, JSONArray);
            }
        }
        return null;
    }
    
    public static String toString(final JSONArray JSONArray, final JSONArray class89) throws JSONException {
        if (JSONArray != null && JSONArray.length() != 0) {
            final StringBuffer sb = new StringBuffer();
            for (int i = 0; i < class89.length(); ++i) {
                final JSONObject method475 = class89.optJSONObject(i);
                if (method475 != null) {
                    sb.append(method35553(method475.toJSONArray(JSONArray)));
                }
            }
            return sb.toString();
        }
        return null;
    }
}
