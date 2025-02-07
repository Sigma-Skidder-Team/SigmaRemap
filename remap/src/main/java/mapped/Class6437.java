// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class6437
{
    private static final Logger field25565;
    
    private Class6437() {
    }
    
    public static boolean method19202(final Object o) {
        return method19203(o);
    }
    
    private static boolean method19203(final Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof byte[]) {
            return true;
        }
        if (o instanceof JSONArray) {
            final JSONArray JSONArray = (JSONArray)o;
            for (int method462 = JSONArray.length(), i = 0; i < method462; ++i) {
                Object o2;
                try {
                    o2 = (JSONArray.method460(i) ? null : JSONArray.method449(i));
                }
                catch (final JSONException thrown) {
                    Class6437.field25565.log(Level.WARNING, "An error occured while retrieving data from JSONArray", thrown);
                    return false;
                }
                if (method19203(o2)) {
                    return true;
                }
            }
        }
        else if (o instanceof JSONObject) {
            final JSONObject class89 = (JSONObject)o;
            final Iterator<String> method463 = class89.method13272();
            while (method463.hasNext()) {
                final String s = method463.next();
                Object method464;
                try {
                    method464 = class89.get(s);
                }
                catch (final JSONException thrown2) {
                    Class6437.field25565.log(Level.WARNING, "An error occured while retrieving data from JSONObject", thrown2);
                    return false;
                }
                if (method19203(method464)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    static {
        field25565 = Logger.getLogger(Class6437.class.getName());
    }
}
