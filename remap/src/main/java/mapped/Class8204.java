// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class8204
{
    public static void method27177(final int n, final Class2148 class2148, final List<Class7276> c, final Class6108 class2149) {
        for (final Class7276 obj : new ArrayList(c)) {
            try {
                if (obj.method22295() == Class1969.field10781) {
                    Class9553.method35739((Class7562)obj.method22296());
                }
                else if (obj.method22295() == Class1969.field10788) {
                    obj.method22299(Class5220.method16332((int)obj.method22296()));
                }
                if (class2148 == null) {
                    continue;
                }
                if (class2148.method8316(Class2148.field12759) && obj.method22294() == 9) {
                    obj.method22299(Class5220.method16332((int)obj.method22296()));
                }
                if (!class2148.method8316(Class2148.field12744) || obj.method22294() < 7) {
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
