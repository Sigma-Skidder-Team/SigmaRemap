// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.ArrayList;
import com.google.common.base.Optional;
import java.util.List;

public class Class9140
{
    public static Class2137 method33331(final int i, final List<Class7276> list) {
        final Optional<Class2137> method8292 = Class2137.method8292(i);
        if (!method8292.isPresent()) {
            Class8563.method28794().method33558().method34742().severe("Error: could not find Entity type " + i + " with metadata: " + list);
            return null;
        }
        final Class2137 class2137 = method8292.get();
        try {
            if (class2137.method8294(Class2137.field12536)) {
                final Optional<Class7276> method8293 = method33333(list, 12);
                if (method8293.isPresent() && ((byte) method8293.get().method22296() & 0x4) == 0x4) {
                    return Class2137.field12537;
                }
            }
            if (class2137.method8294(Class2137.field12515)) {
                final Optional<Class7276> method8294 = method33333(list, 12);
                if (method8294.isPresent()) {
                    if ((int) method8294.get().method22296() == 1) {
                        return Class2137.field12516;
                    }
                    if ((int) method8294.get().method22296() == 2) {
                        return Class2137.field12517;
                    }
                }
            }
            if (class2137.method8294(Class2137.field12520)) {
                final Optional<Class7276> method8295 = method33333(list, 13);
                if (method8295.isPresent()) {
                    final int intValue = (int) method8295.get().method22296();
                    if (intValue > 0 && intValue < 6) {
                        list.add(new Class7276(16, Class1968.field10759, intValue - 1));
                        return Class2137.field12522;
                    }
                    if (intValue == 6) {
                        return Class2137.field12521;
                    }
                }
            }
            if (class2137.method8294(Class2137.field12550)) {
                final Optional<Class7276> method8296 = method33333(list, 14);
                if (method8296.isPresent()) {
                    if ((int) method8296.get().method22296() == 0) {
                        return Class2137.field12550;
                    }
                    if ((int) method8296.get().method22296() == 1) {
                        return Class2137.field12554;
                    }
                    if ((int) method8296.get().method22296() == 2) {
                        return Class2137.field12555;
                    }
                    if ((int) method8296.get().method22296() == 3) {
                        return Class2137.field12552;
                    }
                    if ((int) method8296.get().method22296() == 4) {
                        return Class2137.field12551;
                    }
                }
            }
        }
        catch (final Exception ex) {
            if (!Class8563.method28792().method23266() || Class8563.method28794().method33559()) {
                Class8563.method28793().method34742().warning("An error occurred with entity type rewriter");
                Class8563.method28793().method34742().warning("Metadata: " + list);
                ex.printStackTrace();
            }
        }
        return class2137;
    }
    
    public static void method33332(final int i, final Class2137 class2137, final List<Class7276> c, final Class6108 class2138) {
        for (final Class7276 obj : new ArrayList(c)) {
            try {
                if (obj.method22296() instanceof Class7562) {
                    Class9325.method34546((Class7562)obj.method22296());
                }
                if ((class2137.method8294(Class2137.field12537) || class2137.method8294(Class2137.field12536)) && obj.method22294() == 12) {
                    obj.method22298(Class1968.field10764);
                    obj.method22299(((byte)obj.method22296() & 0x2) == 0x2);
                }
                if (class2137.method8295(Class2137.field12514)) {
                    final int method22294 = obj.method22294();
                    if (method22294 == 12) {
                        c.remove(obj);
                    }
                    if (method22294 == 13) {
                        obj.method22297(12);
                    }
                }
                if (class2137.method8295(Class2137.field12520)) {
                    if (class2137.method8293(Class2137.field12520, Class2137.field12521) && obj.method22294() == 14) {
                        c.remove(obj);
                    }
                    else if (obj.method22294() == 15) {
                        obj.method22297(14);
                    }
                    else if (obj.method22294() == 14) {
                        obj.method22297(15);
                    }
                }
                if (class2137.method8295(Class2137.field12549)) {
                    final int method22295 = obj.method22294();
                    if (method22295 == 14) {
                        c.remove(obj);
                    }
                    if (method22295 == 16) {
                        obj.method22297(14);
                    }
                    if (method22295 == 17) {
                        obj.method22297(16);
                    }
                    if (!class2137.method8294(Class2137.field12550)) {
                        if (obj.method22294() == 15 || obj.method22294() == 16) {
                            c.remove(obj);
                        }
                    }
                    if (class2137.method8293(Class2137.field12554, Class2137.field12555) && obj.method22294() == 13) {
                        if (((byte)obj.method22296() & 0x8) == 0x8) {
                            c.add(new Class7276(15, Class1968.field10764, true));
                        }
                        else {
                            c.add(new Class7276(15, Class1968.field10764, false));
                        }
                    }
                }
                if (!class2137.method8294(Class2137.field12500) || !Class8563.method28792().method23268()) {
                    continue;
                }
                final Optional<Class7276> method22296 = method33333(c, 11);
                final Optional<Class7276> method22297 = method33333(c, 2);
                final Optional<Class7276> method22298 = method33333(c, 3);
                if (obj.method22294() != 0 || !method22296.isPresent() || !method22297.isPresent() || !method22298.isPresent()) {
                    continue;
                }
                final Class7276 class2139 = method22296.get();
                if (((byte)obj.method22296() & 0x20) != 0x20 || ((byte)class2139.method22296() & 0x1) != 0x1 || ((String) method22297.get().method22296()).length() == 0 || !(boolean) method22298.get().method22296()) {
                    continue;
                }
                final Class6642 class2140 = class2138.method18207(Class6642.class);
                if (class2140.method20170(i)) {
                    continue;
                }
                class2140.method20169(i);
                try {
                    final Class8699 class2141 = new Class8699(37, null, class2138);
                    class2141.method29823(Class5260.field22312, i);
                    class2141.method29823(Class5260.field22304, (Short)0);
                    class2141.method29823(Class5260.field22304, (short)(128.0 * (-Class8563.method28792().method23273() * 32.0)));
                    class2141.method29823(Class5260.field22304, (Short)0);
                    class2141.method29823(Class5260.field22294, true);
                    class2141.method29833(Class5226.class);
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
            }
            catch (final Exception ex2) {
                c.remove(obj);
                if (Class8563.method28792().method23266() && !Class8563.method28794().method33559()) {
                    continue;
                }
                Class8563.method28793().method34742().warning("An error occurred with entity metadata handler");
                Class8563.method28793().method34742().warning("Metadata: " + obj);
                ex2.printStackTrace();
            }
        }
    }
    
    public static Optional<Class7276> method33333(final List<Class7276> list, final int n) {
        for (final Class7276 class7276 : list) {
            if (class7276.method22294() != n) {
                continue;
            }
            return (Optional<Class7276>)Optional.of((Object)class7276);
        }
        return Optional.absent();
    }
}
