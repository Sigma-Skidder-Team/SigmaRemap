// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.json.JSONException;

public class Class8659
{
    public static JSONObject method29530(final String s) throws JSONException {
        final JSONObject JSONObject = new JSONObject();
        final JSONTokener class4406 = new JSONTokener(s);
        while (class4406.method30784()) {
            final String method26951 = Class8160.method26951(class4406.method30790('='));
            class4406.method30786('=');
            JSONObject.put(method26951, Class8160.method26951(class4406.method30790(';')));
            class4406.method30785();
        }
        return JSONObject;
    }
    
    public static String toString(final JSONObject JSONObject) throws JSONException {
        int n = 0;
        final Iterator<String> method13272 = JSONObject.method13272();
        final StringBuilder sb = new StringBuilder();
        while (method13272.hasNext()) {
            final String s = method13272.next();
            if (JSONObject.method13271(s)) {
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
