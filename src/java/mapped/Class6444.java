// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Set;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;

public class Class6444
{
    private static int[] field25579;
    private static boolean field25580;
    
    public static int method19214(final int n) {
        if (Class6444.field25579 == null) {
            return -1;
        }
        if (n >= 0 && n < Class6444.field25579.length) {
            return Class6444.field25579[n];
        }
        return -1;
    }
    
    public static void method19215() {
        if (Class6444.field25580) {
            Class6444.field25580 = false;
            method19216(Class9216.method33710());
        }
    }
    
    public static void method19216(final Class7038 class7038) {
        method19221();
        if (class7038 != null) {
            if (Class9570.field41383.method22605() && Class869.method5277().method5291() == null) {
                Class8571.method28847("[Shaders] Delayed loading of item mappings after resources are loaded");
                Class6444.field25580 = true;
            }
            else {
                final ArrayList list = new ArrayList();
                final String s = "/shaders/item.properties";
                final InputStream method21531 = class7038.method21531(s);
                if (method21531 != null) {
                    method19218(method21531, s, list);
                }
                method19217(list);
                if (list.size() > 0) {
                    Class6444.field25579 = method19220(list);
                }
            }
        }
    }
    
    private static void method19217(final List<Integer> list) {
        final String[] method24308 = Class7667.method24308();
        for (int i = 0; i < method24308.length; ++i) {
            final String s = method24308[i];
            try {
                final Class1932 class1932 = new Class1932(s, "shaders/item.properties");
                method19218(Class8571.method28897(class1932), class1932.toString(), list);
            }
            catch (final IOException ex) {}
        }
    }
    
    private static void method19218(InputStream method26733, final String s, final List<Integer> list) {
        if (method26733 != null) {
            try {
                method26733 = Class8121.method26733(method26733, s);
                final Class27 class27 = new Class27();
                class27.load(method26733);
                method26733.close();
                Class8571.method28847("[Shaders] Parsing item mappings: " + s);
                final Class8652 class28 = new Class8652("Shaders");
                for (final String str : class27.keySet()) {
                    final String property = class27.getProperty(str);
                    final String prefix = "item.";
                    if (!str.startsWith(prefix)) {
                        Class8571.method28848("[Shaders] Invalid item ID: " + str);
                    }
                    else {
                        final int method26734 = Class8571.method28933(Class9518.method35517(str, prefix), -1);
                        if (method26734 < 0) {
                            Class8571.method28848("[Shaders] Invalid item alias ID: " + method26734);
                        }
                        else {
                            final int[] method26735 = class28.method29479(property);
                            if (method26735 != null && method26735.length >= 1) {
                                for (int i = 0; i < method26735.length; ++i) {
                                    method19219(list, method26735[i], method26734);
                                }
                            }
                            else {
                                Class8571.method28848("[Shaders] Invalid item ID mapping: " + str + "=" + property);
                            }
                        }
                    }
                }
            }
            catch (final IOException ex) {
                Class8571.method28848("[Shaders] Error reading: " + s);
            }
        }
    }
    
    private static void method19219(final List<Integer> list, final int n, final int i) {
        while (list.size() <= n) {
            list.add(-1);
        }
        list.set(n, i);
    }
    
    private static int[] method19220(final List<Integer> list) {
        final int[] array = new int[list.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int)list.get(i);
        }
        return array;
    }
    
    public static void method19221() {
        Class6444.field25579 = null;
    }
    
    static {
        Class6444.field25579 = null;
    }
}
