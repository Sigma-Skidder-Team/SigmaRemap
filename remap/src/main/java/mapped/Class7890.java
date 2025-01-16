// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Calendar;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Class7890
{
    private static Class869 field32394;
    private static Class8246 field32395;
    private static Class4995[][] field32396;
    public static boolean field32397;
    
    public static ResourceLocation method25542(final ResourceLocation class1932) {
        if (Class7890.field32396 == null) {
            return class1932;
        }
        final Class527 field4700 = Class7890.field32394.field4700;
        if (!(field4700 instanceof Class516)) {
            return class1932;
        }
        if (!class1932.method7798().equals("minecraft") || !class1932.method7797().startsWith("textures/gui/")) {
            return class1932;
        }
        if (Class7890.field32395 == null) {
            return class1932;
        }
        final Class1848 field4701 = Class7890.field32394.field4683;
        if (field4701 == null) {
            return class1932;
        }
        if (field4700 instanceof Class525) {
            return method25543(Class2005.field11267, Class7890.field32394.field4684.method1894(), field4701, class1932, field4700);
        }
        if (!(field4700 instanceof Class518)) {
            final BlockPos method27342 = Class7890.field32395.method27342();
            if (method27342 != null) {
                if (field4700 instanceof Class515) {
                    return method25543(Class2005.field11255, method27342, field4701, class1932, field4700);
                }
                if (field4700 instanceof Class748) {
                    return method25543(Class2005.field11256, method27342, field4701, class1932, field4700);
                }
                if (field4700 instanceof Class743) {
                    return method25543(Class2005.field11257, method27342, field4701, class1932, field4700);
                }
                if (field4700 instanceof Class726) {
                    return method25543(Class2005.field11258, method27342, field4701, class1932, field4700);
                }
                if (field4700 instanceof Class520) {
                    return method25543(Class2005.field11259, method27342, field4701, class1932, field4700);
                }
                if (field4700 instanceof Class740) {
                    return method25543(Class2005.field11260, method27342, field4701, class1932, field4700);
                }
                if (field4700 instanceof Class526) {
                    return method25543(Class2005.field11261, method27342, field4701, class1932, field4700);
                }
                if (field4700 instanceof Class522) {
                    return method25543(Class2005.field11262, method27342, field4701, class1932, field4700);
                }
                if (field4700 instanceof Class741) {
                    return method25543(Class2005.field11263, method27342, field4701, class1932, field4700);
                }
                if (field4700 instanceof Class745) {
                    return method25543(Class2005.field11266, method27342, field4701, class1932, field4700);
                }
            }
            final Entity method27343 = Class7890.field32395.method27343();
            if (method27343 != null) {
                if (field4700 instanceof Class742) {
                    return method25544(Class2005.field11264, method27343, field4701, class1932);
                }
                if (field4700 instanceof Class746) {
                    return method25544(Class2005.field11265, method27343, field4701, class1932);
                }
            }
            return class1932;
        }
        return method25543(Class2005.field11268, Class7890.field32394.field4684.method1894(), field4701, class1932, field4700);
    }
    
    private static ResourceLocation method25543(final Class2005 class2005, final BlockPos class2006, final Class1852 class2007, final ResourceLocation class2008, final Class527 class2009) {
        final Class4995[] array = Class7890.field32396[class2005.ordinal()];
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class4995 class2010 = array[i];
                if (class2010.method15169(class2005, class2006, class2007, class2009)) {
                    return class2010.method15184(class2008);
                }
            }
            return class2008;
        }
        return class2008;
    }
    
    private static ResourceLocation method25544(final Class2005 class2005, final Entity class2006, final Class1852 class2007, final ResourceLocation class2008) {
        final Class4995[] array = Class7890.field32396[class2005.ordinal()];
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final Class4995 class2009 = array[i];
                if (class2009.method15179(class2005, class2006, class2007)) {
                    return class2009.method15184(class2008);
                }
            }
            return class2008;
        }
        return class2008;
    }
    
    public static void method25545() {
        Class7890.field32396 = null;
        if (Config.method29006()) {
            final ArrayList list = new ArrayList();
            final Class1727[] method28903 = Config.method28903();
            for (int i = method28903.length - 1; i >= 0; --i) {
                method25547(method28903[i], list);
            }
            Class7890.field32396 = method25546(list);
        }
    }
    
    private static Class4995[][] method25546(final List<List<Class4995>> list) {
        if (!list.isEmpty()) {
            final Class4995[][] array = new Class4995[Class2005.values().length][];
            for (int i = 0; i < array.length; ++i) {
                if (list.size() > i) {
                    final List list2 = list.get(i);
                    if (list2 != null) {
                        array[i] = (Class4995[])list2.toArray(new Class4995[list2.size()]);
                    }
                }
            }
            return array;
        }
        return null;
    }
    
    private static void method25547(final Class1727 class1727, final List<List<Class4995>> list) {
        final String[] method32777 = Class9084.method32777(class1727, "optifine/gui/container/", ".properties", null);
        Arrays.sort(method32777);
        for (int i = 0; i < method32777.length; ++i) {
            final String str = method32777[i];
            Config.method28847("CustomGuis: " + str);
            try {
                final InputStream method32778 = class1727.method6097(Class346.field2137, new ResourceLocation(str));
                if (method32778 == null) {
                    Config.warn("CustomGuis file not found: " + str);
                }
                else {
                    final Class27 class1728 = new Class27();
                    class1728.load(method32778);
                    method32778.close();
                    final Class4995 class1729 = new Class4995(class1728, str);
                    if (class1729.method15166(str)) {
                        method25548(class1729, list);
                    }
                }
            }
            catch (final FileNotFoundException ex) {
                Config.warn("CustomGuis file not found: " + str);
            }
            catch (final Exception ex2) {
                ex2.printStackTrace();
            }
        }
    }
    
    private static void method25548(final Class4995 class4995, final List<List<Class4995>> list) {
        if (class4995.method15183() != null) {
            final int ordinal = class4995.method15183().ordinal();
            while (list.size() <= ordinal) {
                list.add((List<?>)null);
            }
            List list2 = list.get(ordinal);
            if (list2 == null) {
                list2 = new ArrayList();
                list.set(ordinal, list2);
            }
            list2.add(class4995);
        }
        else {
            method25552("Invalid container: " + class4995.method15183());
        }
    }
    
    public static Class8246 method25549() {
        return Class7890.field32395;
    }
    
    public static void method25550(final Class8246 field32395) {
        Class7890.field32395 = field32395;
    }
    
    private static boolean method25551() {
        final Calendar instance = Calendar.getInstance();
        if (instance.get(2) + 1 == 12) {
            if (instance.get(5) >= 24) {
                if (instance.get(5) <= 26) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static void method25552(final String str) {
        Config.warn("[CustomGuis] " + str);
    }
    
    static {
        Class7890.field32394 = Config.method28894();
        Class7890.field32395 = null;
        Class7890.field32396 = null;
        Class7890.field32397 = method25551();
    }
}
