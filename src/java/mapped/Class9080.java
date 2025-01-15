// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class9080
{
    public static void method32718(final int n, final Class266 class266, final List<Class7276> c, final Class6108 class267) {
        if (class266 == null) {
            return;
        }
        for (final Class7276 obj : new ArrayList(c)) {
            try {
                if ((!class266.method909(Class266.field1314) && !class266.method909(Class266.field1315)) || obj.method22294() < 15) {
                    continue;
                }
                obj.method22297(obj.method22294() + 1);
            }
            catch (final Exception ex) {
                c.remove(obj);
                if (Class8563.method28792().method23266() && !Class8563.method28794().method33559()) {
                    continue;
                }
                Class8563.method28793().method34742().warning("An error occurred with entity metadata handler");
                Class8563.method28793().method34742().warning("Metadata: " + obj);
                ex.printStackTrace();
            }
        }
    }
}
