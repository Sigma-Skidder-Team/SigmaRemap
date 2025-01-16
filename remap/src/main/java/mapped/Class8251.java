// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

public class Class8251
{
    private static int[] field33891;
    private static boolean field33892;
    
    public static int method27360(final int n) {
        if (Class8251.field33891 == null) {
            return -1;
        }
        if (n >= 0 && n < Class8251.field33891.length) {
            return Class8251.field33891[n];
        }
        return -1;
    }
    
    public static void method27361() {
        if (Class8251.field33892) {
            Class8251.field33892 = false;
            method27362(Class9216.method33710());
        }
    }
    
    public static void method27362(final Class7038 class7038) {
        method27367();
        if (class7038 != null) {
            if (Class9570.field41383.method22605() && Class869.method5277().method5291() == null) {
                Config.method28847("[Shaders] Delayed loading of entity mappings after resources are loaded");
                Class8251.field33892 = true;
            }
            else {
                final ArrayList list = new ArrayList();
                final String s = "/shaders/entity.properties";
                final InputStream method21531 = class7038.method21531(s);
                if (method21531 != null) {
                    method27364(method21531, s, list);
                }
                method27363(list);
                if (list.size() > 0) {
                    Class8251.field33891 = method27366(list);
                }
            }
        }
    }
    
    private static void method27363(final List<Integer> list) {
        final String[] method24308 = Class7667.method24308();
        for (int i = 0; i < method24308.length; ++i) {
            final String s = method24308[i];
            try {
                final ResourceLocation class1932 = new ResourceLocation(s, "shaders/entity.properties");
                method27364(Config.method28897(class1932), class1932.toString(), list);
            }
            catch (final IOException ex) {}
        }
    }
    
    private static void method27364(InputStream method26733, final String s, final List<Integer> list) {
        if (method26733 != null) {
            try {
                method26733 = Class8121.method26733(method26733, s);
                final Class27 class27 = new Class27();
                class27.load(method26733);
                method26733.close();
                Config.method28847("[Shaders] Parsing entity mappings: " + s);
                final Class8652 class28 = new Class8652("Shaders");
                for (final String str : class27.keySet()) {
                    final String property = class27.getProperty(str);
                    final String prefix = "entity.";
                    if (!str.startsWith(prefix)) {
                        Config.warn("[Shaders] Invalid entity ID: " + str);
                    }
                    else {
                        final int method26734 = Config.method28933(Class9518.method35517(str, prefix), -1);
                        if (method26734 < 0) {
                            Config.warn("[Shaders] Invalid entity alias ID: " + method26734);
                        }
                        else {
                            final int[] method26735 = class28.method29480(property);
                            if (method26735 != null && method26735.length >= 1) {
                                for (int i = 0; i < method26735.length; ++i) {
                                    method27365(list, method26735[i], method26734);
                                }
                            }
                            else {
                                Config.warn("[Shaders] Invalid entity ID mapping: " + str + "=" + property);
                            }
                        }
                    }
                }
            }
            catch (final IOException ex) {
                Config.warn("[Shaders] Error reading: " + s);
            }
        }
    }
    
    private static void method27365(final List<Integer> list, final int n, final int i) {
        while (list.size() <= n) {
            list.add(-1);
        }
        list.set(n, i);
    }
    
    private static int[] method27366(final List<Integer> list) {
        final int[] array = new int[list.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int)list.get(i);
        }
        return array;
    }
    
    public static void method27367() {
        Class8251.field33891 = null;
    }
    
    static {
        Class8251.field33891 = null;
    }
}
