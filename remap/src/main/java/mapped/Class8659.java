// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.json.JSONException;
import totalcross.json.JSONObject;
import totalcross.json.JSONTokener;

public class Class8659
{
    public static JSONObject method29530(final String s) throws JSONException {
        final JSONObject JSONObject = new JSONObject();
        final JSONTokener class4406 = new JSONTokener(s);
        while (class4406.more()) {
            final String method26951 = Class8160.method26951(class4406.nextTo('='));
            class4406.next('=');
            JSONObject.put(method26951, Class8160.method26951(class4406.nextTo(';')));
            class4406.next();
        }
        return JSONObject;
    }
    
    public static String toString(final JSONObject JSONObject) throws JSONException {
        int n = 0;
        final Iterator<String> method13272 = JSONObject.keys();
        final StringBuilder sb = new StringBuilder();
        while (method13272.hasNext()) {
            final String s = method13272.next();
            if (JSONObject.isNull(s)) {
                continue;
            }
            if (n != 0) {
                sb.append(';');
            }
            sb.append(Class8160.method26949(s));
            sb.append("=");
            sb.append(Class8160.method26949(JSONObject.getString(s)));
            n = 1;
        }
        return sb.toString();
    }
}
