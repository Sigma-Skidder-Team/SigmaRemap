// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class7341
{
    public static void method22550(final int n, final Class2072 class2072, final List<Class7276> c, final Class6108 class2073) {
        for (final Class7276 obj : new ArrayList(c)) {
            try {
                if (obj.method22296() instanceof Class7562) {
                    Class9238.method34061((Class7562)obj.method22296());
                }
                if (!class2072.method8164(Class2072.field11883) || obj.method22294() != 12) {
                    continue;
                }
                obj.method22297(13);
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
