// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.json.JSONException;
import totalcross.json.JSONObject;

import java.util.Enumeration;
import java.util.Properties;

public class Class7672
{
    private static String[] field30467;
    
    public static JSONObject method24354(final Properties properties) throws JSONException {
        final JSONObject JSONObject = new JSONObject();
        if (properties != null) {
            if (!properties.isEmpty()) {
                final Enumeration<?> propertyNames = properties.propertyNames();
                while (propertyNames.hasMoreElements()) {
                    final String key = (String)propertyNames.nextElement();
                    JSONObject.put(key, properties.getProperty(key));
                }
            }
        }
        return JSONObject;
    }
    
    public static Properties method24355(final JSONObject JSONObject) throws JSONException {
        final Properties properties = new Properties();
        if (JSONObject != null) {
            final Iterator<String> method13272 = JSONObject.keys();
            while (method13272.hasNext()) {
                final String key = method13272.next();
                properties.put(key, JSONObject.getString(key));
            }
        }
        return properties;
    }
}
