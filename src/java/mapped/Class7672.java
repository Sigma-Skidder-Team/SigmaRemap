// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.json.JSONException;
import java.util.Enumeration;
import java.util.Properties;

public class Class7672
{
    private static String[] field30467;
    
    public static Class4405 method24354(final Properties properties) throws JSONException {
        final Class4405 class4405 = new Class4405();
        if (properties != null) {
            if (!properties.isEmpty()) {
                final Enumeration<?> propertyNames = properties.propertyNames();
                while (propertyNames.hasMoreElements()) {
                    final String key = (String)propertyNames.nextElement();
                    class4405.method13301(key, properties.getProperty(key));
                }
            }
        }
        return class4405;
    }
    
    public static Properties method24355(final Class4405 class4405) throws JSONException {
        final Properties properties = new Properties();
        if (class4405 != null) {
            final Iterator<String> method13272 = class4405.method13272();
            while (method13272.hasNext()) {
                final String key = method13272.next();
                properties.put(key, class4405.method13268(key));
            }
        }
        return properties;
    }
}
