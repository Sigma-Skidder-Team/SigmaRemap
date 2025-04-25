// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

import java.util.Iterator;

public class Class9308
{
    public static final String field39947 = "\r\n";
    
    public static JSONObject method34426(final String s) throws org.json.JSONException {
        final JSONObject JSONObject = new JSONObject();
        final Class8825 class4406 = new Class8825(s);
        final String method30780 = class4406.method30780();
        if (!method30780.toUpperCase().startsWith("HTTP")) {
            JSONObject.put("Method", method30780);
            JSONObject.put("Request-URI", class4406.method30780());
            JSONObject.put("HTTP-Version", class4406.method30780());
        }
        else {
            JSONObject.put("HTTP-Version", method30780);
            JSONObject.put("Status-Code", class4406.method30780());
            JSONObject.put("Reason-Phrase", class4406.nextTo('\0'));
            class4406.next();
        }
        while (class4406.more()) {
            final String method30781 = class4406.nextTo(':');
            class4406.next(':');
            JSONObject.put(method30781, class4406.nextTo('\0'));
            class4406.next();
        }
        return JSONObject;
    }
    
    public static String toString(final JSONObject JSONObject) throws org.json.JSONException {
        final Iterator<String> method13272 = JSONObject.keys();
        final StringBuilder sb = new StringBuilder();
        if (JSONObject.has("Status-Code") && JSONObject.has("Reason-Phrase")) {
            sb.append(JSONObject.getString("HTTP-Version"));
            sb.append(' ');
            sb.append(JSONObject.getString("Status-Code"));
            sb.append(' ');
            sb.append(JSONObject.getString("Reason-Phrase"));
        }
        else {
            if (!JSONObject.has("Method") || !JSONObject.has("Request-URI")) {
                throw new JSONException("Not enough material for an HTTP header.");
            }
            sb.append(JSONObject.getString("Method"));
            sb.append(' ');
            sb.append('\"');
            sb.append(JSONObject.getString("Request-URI"));
            sb.append('\"');
            sb.append(' ');
            sb.append(JSONObject.getString("HTTP-Version"));
        }
        sb.append("\r\n");
        while (method13272.hasNext()) {
            final String s = method13272.next();
            if ("HTTP-Version".equals(s)) {
                continue;
            }
            if ("Status-Code".equals(s)) {
                continue;
            }
            if ("Reason-Phrase".equals(s)) {
                continue;
            }
            if ("Method".equals(s)) {
                continue;
            }
            if ("Request-URI".equals(s)) {
                continue;
            }
            if (JSONObject.isNull(s)) {
                continue;
            }
            sb.append(s);
            sb.append(": ");
            sb.append(JSONObject.getString(s));
            sb.append("\r\n");
        }
        sb.append("\r\n");
        return sb.toString();
    }
}
