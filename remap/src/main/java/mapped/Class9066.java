// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.UUID;
import java.util.Map;

public class Class9066
{
    private static Map<String, Class9594> field38381;
    private static boolean field38382;
    private static Class1656 field38383;
    private static Class8443 field38384;
    private static Class9550 field38385;
    private static Class8445 field38386;
    private static boolean field38387;
    public static final String field38388 = ".png";
    public static final String field38389 = ".properties";
    public static final String field38390 = "textures/entity/";
    public static final String field38391 = "textures/painting/";
    public static final String field38392 = "textures/";
    public static final String field38393 = "optifine/random/";
    public static final String field38394 = "optifine/mob/";
    private static final String[] field38395;
    private static final String field38396 = "horse/";
    private static final String[] field38397;
    private static final String[] field38398;
    
    public static void method32639(final Entity class399, final Class1847 class400) {
        if (class400 != null) {
            final Class9184 method1650 = class399.method1650();
            method1650.field38922 = class399.method1894();
            method1650.field38921 = class400.method6959(method1650.field38922);
            if (class399 instanceof Class795) {
                method32641((Class795)class399, false);
            }
        }
    }
    
    public static void method32640(final Entity class399, final Class1847 class400) {
        if (class399 instanceof Class795) {
            method32641((Class795)class399, true);
        }
    }
    
    private static void method32641(final Class795 class795, final boolean b) {
        Class511 class796 = class795.method4488();
        if (class796 == null) {
            class796 = Class8571.method28894().field4684;
        }
        if (class796 instanceof Class754) {
            final Class754 class797 = (Class754)class796;
            final UUID method1865 = class795.method1865();
            if (!b) {
                final Class9184 method1866 = class795.method1650();
                if (class797.field4065 != null) {
                    if (Class8571.equals(class797.field4065.method1865(), method1865)) {
                        final Class9184 method1867 = class797.field4065.method1650();
                        method1866.field38922 = method1867.field38922;
                        method1866.field38921 = method1867.field38921;
                        class797.field4065 = null;
                    }
                }
                if (class797.field4066 != null) {
                    if (Class8571.equals(class797.field4066.method1865(), method1865)) {
                        final Class9184 method1868 = class797.field4066.method1650();
                        method1866.field38922 = method1868.field38922;
                        method1866.field38921 = method1868.field38921;
                        class797.field4066 = null;
                    }
                }
            }
            else {
                final Class51 method1869 = class797.method2899();
                if (method1869 != null) {
                    if (Class8571.equals(method1869.method301("UUID"), method1865)) {
                        class797.field4065 = class795;
                    }
                }
                final Class51 method1870 = class797.method2901();
                if (method1870 != null) {
                    if (Class8571.equals(method1870.method301("UUID"), method1865)) {
                        class797.field4066 = class795;
                    }
                }
            }
        }
    }
    
    public static void method32642(final Class1847 class1847, final Class1847 class1848) {
        if (class1848 instanceof Class1848) {
            final Iterator<Entity> iterator = ((Class1848)class1848).method6806().iterator();
            while (iterator.hasNext()) {
                method32639(iterator.next(), class1848);
            }
        }
        Class9066.field38384.method28184(null);
        Class9066.field38386.method28186(null);
    }
    
    public static Class1932 method32643(final Class1932 class1932) {
        if (!Class9066.field38382) {
            return class1932;
        }
        if (Class9066.field38387) {
            return class1932;
        }
        try {
            Class9066.field38387 = true;
            final Class8444 method32645 = method32645();
            if (method32645 != null) {
                String s = class1932.method7797();
                if (s.startsWith("horse/")) {
                    s = method32644(s, "horse/".length());
                }
                if (!s.startsWith("textures/entity/") && !s.startsWith("textures/painting/")) {
                    return class1932;
                }
                final Class9594 class1933 = Class9066.field38381.get(s);
                if (class1933 == null) {
                    return class1932;
                }
                return class1933.method35981(class1932, method32645);
            }
        }
        finally {
            Class9066.field38387 = false;
        }
        return class1932;
    }
    
    private static String method32644(final String s, final int toffset) {
        if (Class9066.field38397 != null && Class9066.field38398 != null) {
            for (int i = 0; i < Class9066.field38398.length; ++i) {
                if (s.startsWith(Class9066.field38398[i], toffset)) {
                    return Class9066.field38397[i];
                }
            }
            return s;
        }
        return s;
    }
    
    private static Class8444 method32645() {
        if (Class9066.field38383.field9343 == null) {
            if (Class9066.field38385.field41133 != null) {
                final Class436 field41133 = Class9066.field38385.field41133;
                if (field41133.method2186() != null) {
                    Class9066.field38386.method28186(field41133);
                    return Class9066.field38386;
                }
            }
            return null;
        }
        Class9066.field38384.method28184(Class9066.field38383.field9343);
        return Class9066.field38384;
    }
    
    private static Class9594 method32646(final Class1932 class1932, final boolean b) {
        final String method7797 = class1932.method7797();
        final Class1932 method7798 = method32648(class1932, b);
        if (method7798 != null) {
            final Class9594 method7799 = method32647(method7798, class1932);
            if (method7799 != null) {
                return method7799;
            }
        }
        final Class1932[] method7800 = method32653(class1932, b);
        return (method7800 != null) ? new Class9594(method7797, method7800) : null;
    }
    
    private static Class9594 method32647(final Class1932 class1932, final Class1932 class1933) {
        try {
            final String method7797 = class1932.method7797();
            method32656(class1933.method7797() + ", properties: " + method7797);
            final InputStream method7798 = Class8571.method28897(class1932);
            if (method7798 == null) {
                method32657("Properties not found: " + method7797);
                return null;
            }
            final Class27 class1934 = new Class27();
            class1934.load(method7798);
            method7798.close();
            final Class9594 class1935 = new Class9594(class1934, method7797, class1933);
            return class1935.method35983(method7797) ? class1935 : null;
        }
        catch (final FileNotFoundException ex) {
            method32657("File not found: " + class1933.method7797());
            return null;
        }
        catch (final IOException ex2) {
            ex2.printStackTrace();
            return null;
        }
    }
    
    private static Class1932 method32648(final Class1932 class1932, final boolean b) {
        final Class1932 method32649 = method32649(class1932, b);
        if (method32649 == null) {
            return null;
        }
        final String method32650 = method32649.method7798();
        final String method32651 = Class9518.method35518(method32649.method7797(), ".png");
        final Class1932 class1933 = new Class1932(method32650, method32651 + ".properties");
        if (Class8571.method28900(class1933)) {
            return class1933;
        }
        final String method32652 = method32652(method32651);
        if (method32652 != null) {
            final Class1932 class1934 = new Class1932(method32650, method32652 + ".properties");
            return Class8571.method28900(class1934) ? class1934 : null;
        }
        return null;
    }
    
    public static Class1932 method32649(final Class1932 class1932, final boolean b) {
        final String method7798 = class1932.method7798();
        final String method7799 = class1932.method7797();
        String prefix = "textures/";
        String s = "optifine/random/";
        if (b) {
            prefix = "textures/entity/";
            s = "optifine/mob/";
        }
        if (method7799.startsWith(prefix)) {
            return new Class1932(method7798, Class9518.method35520(method7799, prefix, s));
        }
        return null;
    }
    
    private static String method32650(final String s) {
        if (!s.startsWith("optifine/random/")) {
            return s.startsWith("optifine/mob/") ? Class9518.method35520(s, "optifine/mob/", "textures/entity/") : null;
        }
        return Class9518.method35520(s, "optifine/random/", "textures/");
    }
    
    public static Class1932 method32651(final Class1932 class1932, final int i) {
        if (class1932 == null) {
            return null;
        }
        final String method7797 = class1932.method7797();
        final int lastIndex = method7797.lastIndexOf(46);
        if (lastIndex >= 0) {
            return new Class1932(class1932.method7798(), method7797.substring(0, lastIndex) + i + method7797.substring(lastIndex));
        }
        return null;
    }
    
    private static String method32652(final String s) {
        for (int i = 0; i < Class9066.field38395.length; ++i) {
            final String suffix = Class9066.field38395[i];
            if (s.endsWith(suffix)) {
                return Class9518.method35518(s, suffix);
            }
        }
        return null;
    }
    
    private static Class1932[] method32653(final Class1932 class1932, final boolean b) {
        final ArrayList list = new ArrayList();
        list.add(class1932);
        final Class1932 method32649 = method32649(class1932, b);
        if (method32649 == null) {
            return null;
        }
        for (int i = 1; i < list.size() + 10; ++i) {
            final Class1932 method32650 = method32651(method32649, i + 1);
            if (Class8571.method28900(method32650)) {
                list.add(method32650);
            }
        }
        if (list.size() > 1) {
            final Class1932[] array = (Class1932[])list.toArray(new Class1932[list.size()]);
            method32656(class1932.method7797() + ", variants: " + array.length);
            return array;
        }
        return null;
    }
    
    public static void method32654() {
        Class9066.field38381.clear();
        Class9066.field38382 = false;
        if (Class8571.method28941()) {
            method32655();
        }
    }
    
    private static void method32655() {
        Class9066.field38383 = Class8571.method28908();
        Class9066.field38385 = Class9550.field41126;
        final String[] array = { "optifine/random/", "optifine/mob/" };
        final String[] array2 = { ".png", ".properties" };
        final String[] method32776 = Class9084.method32776(array, array2);
        final HashSet set = new HashSet();
        for (int i = 0; i < method32776.length; ++i) {
            final String method32777 = method32650(Class9518.method35533(Class9518.method35524(method32776[i], array2), "0123456789") + ".png");
            if (!set.contains(method32777)) {
                set.add(method32777);
                final Class1932 class1932 = new Class1932(method32777);
                if (Class8571.method28900(class1932)) {
                    if (Class9066.field38381.get(method32777) == null) {
                        Class9594 class1933 = method32646(class1932, false);
                        if (class1933 == null) {
                            class1933 = method32646(class1932, true);
                        }
                        if (class1933 != null) {
                            Class9066.field38381.put(method32777, class1933);
                        }
                    }
                }
            }
        }
        Class9066.field38382 = !Class9066.field38381.isEmpty();
    }
    
    public static void method32656(final String str) {
        Class8571.method28847("RandomEntities: " + str);
    }
    
    public static void method32657(final String str) {
        Class8571.method28848("RandomEntities: " + str);
    }
    
    static {
        Class9066.field38381 = new HashMap<String, Class9594>();
        Class9066.field38382 = false;
        Class9066.field38384 = new Class8443();
        Class9066.field38386 = new Class8445();
        Class9066.field38387 = false;
        field38395 = new String[] { "_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar" };
        field38397 = (String[])Class5256.method16370(null, Class808.class, String[].class, 0);
        field38398 = (String[])Class5256.method16370(null, Class808.class, String[].class, 1);
    }
}
