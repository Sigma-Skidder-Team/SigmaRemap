// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class Class4146
{
    public static void method12381(final int n, final Class2148 class2148, final List<Class7276> c, final Class6108 class2149) {
        int intValue = -1;
        int intValue2 = 0;
        int intValue3 = 0;
        for (final Class7276 obj : new ArrayList(c)) {
            try {
                if (obj.method22295().method7968() > 4) {
                    obj.method22298(Class1969.method7971(obj.method22295().method7968() + 1));
                }
                else {
                    obj.method22298(Class1969.method7971(obj.method22295().method7968()));
                }
                if (obj.method22294() == 2) {
                    obj.method22298(Class1969.field10780);
                    if (obj.method22296() != null && !((String)obj.method22296()).isEmpty()) {
                        obj.method22299(Class8672.method29685((String)obj.method22296()));
                    }
                    else {
                        obj.method22299(null);
                    }
                }
                if (obj.method22295() == Class1969.field10781) {
                    obj.method22298(Class1969.field10781);
                    Class8748.method30243((Class7562)obj.method22296());
                }
                else if (obj.method22295() == Class1969.field10788) {
                    obj.method22299(Class7559.method23731((int)obj.method22296()));
                }
                if (class2148 == null) {
                    continue;
                }
                if (class2148.method8315(Class2148.field12680) && obj.method22294() == 17) {
                    obj.method22299(15 - (int)obj.method22296());
                }
                if (class2148.method8316(Class2148.field12723) && obj.method22294() > 14) {
                    obj.method22297(obj.method22294() + 1);
                }
                if (class2148.method8316(Class2148.field12759) && obj.method22294() == 9) {
                    final int intValue4 = (int)obj.method22296();
                    obj.method22299(Class7559.method23731((intValue4 & 0xFFF) << 4 | (intValue4 >> 12 & 0xF)));
                }
                if (class2148.method8315(Class2148.field12649)) {
                    if (obj.method22294() == 9) {
                        intValue = (int)obj.method22296();
                    }
                    else if (obj.method22294() == 10) {
                        intValue2 = (int)obj.method22296();
                    }
                    else if (obj.method22294() == 11) {
                        intValue3 = (int)obj.method22296();
                    }
                    if (obj.method22294() >= 9) {
                        c.remove(obj);
                    }
                }
                if (obj.method22294() != 0) {
                    continue;
                }
                obj.method22299((byte)((byte)obj.method22296() & 0xFFFFFFEF));
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
        if (class2148 != null && class2148.method8315(Class2148.field12649) && intValue != -1) {
            final Class8087 method21327 = Class6948.method21327(intValue, new Integer[] { intValue2, intValue3 });
            if (method21327 != null && method21327.method26549() != -1) {
                c.add(new Class7276(9, Class1969.field10790, method21327));
            }
        }
    }
}
