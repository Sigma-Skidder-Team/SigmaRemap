// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class7636
{
    public static void method24009(final int n, final Class1989 class1989, final List<Class7276> c, final Class6108 class1990) {
        for (final Class7276 obj : new ArrayList(c)) {
            try {
                if (obj.method22295() == Class1966.field10741) {
                    Class9560.method35772((Class7562)obj.method22296());
                }
                else if (obj.method22295() == Class1966.field10748) {
                    obj.method22299(Class5209.method16320((int)obj.method22296()));
                }
                if (class1989 == null) {
                    continue;
                }
                if (obj.method22294() > 11 && class1989.method8007(Class1989.field11012)) {
                    obj.method22297(obj.method22294() + 1);
                }
                if (!class1989.method8007(Class1989.field11037)) {
                    continue;
                }
                if (obj.method22294() == 18) {
                    c.remove(obj);
                }
                else {
                    if (obj.method22294() <= 18) {
                        continue;
                    }
                    obj.method22297(obj.method22294() - 1);
                }
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
