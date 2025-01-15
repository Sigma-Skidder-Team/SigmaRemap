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
        if (o instanceof Class88) {
            final Class88 class88 = (Class88)o;
            for (int method462 = class88.method462(), i = 0; i < method462; ++i) {
                Object o2;
                try {
                    o2 = (class88.method460(i) ? null : class88.method449(i));
                }
                catch (final Class2381 thrown) {
                    Class6437.field25565.log(Level.WARNING, "An error occured while retrieving data from JSONArray", thrown);
                    return false;
                }
                if (method19203(o2)) {
                    return true;
                }
            }
        }
        else if (o instanceof Class4405) {
            final Class4405 class89 = (Class4405)o;
            final Iterator<String> method463 = class89.method13272();
            while (method463.hasNext()) {
                final String s = method463.next();
                Object method464;
                try {
                    method464 = class89.method13257(s);
                }
                catch (final Class2381 thrown2) {
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
