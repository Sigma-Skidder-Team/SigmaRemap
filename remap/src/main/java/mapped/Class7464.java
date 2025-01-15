// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Class7464
{
    private static Class6313 field28820;
    private static Class6313 field28821;
    private static Class6313 field28822;
    private static Class6313 field28823;
    private static Class6313 field28824;
    private static Class6313 field28825;
    private static List field28826;
    private static List field28827;
    private static List field28828;
    private static List field28829;
    private static List field28830;
    private static List field28831;
    private static Class6313 field28832;
    private static Class6313 field28833;
    private static Class6313 field28834;
    private static Class6313 field28835;
    private static Class6313 field28836;
    private static Class6313 field28837;
    private static final Random field28838;
    
    public static Class6313 method22995(final Class6313 class6313, final Class7096 class6314) {
        if (!Class8571.method28862()) {
            return class6313;
        }
        final List<Class8754> method18691 = class6313.method18691(class6314, null, Class7464.field28838);
        if (method18691 == Class7464.field28826) {
            return Class7464.field28832;
        }
        if (method18691 == Class7464.field28827) {
            return Class7464.field28833;
        }
        if (method18691 == Class7464.field28828) {
            return Class7464.field28834;
        }
        if (method18691 == Class7464.field28829) {
            return Class7464.field28835;
        }
        if (method18691 != Class7464.field28830) {
            return (method18691 != Class7464.field28831) ? class6313 : Class7464.field28837;
        }
        return Class7464.field28836;
    }
    
    public static boolean method22996(final Class7096 class7096, final Class7096 class7097) {
        return class7096 == class7097 || class7096.method21696() == class7097.method21696();
    }
    
    public static void method22997() {
        final ArrayList list = new ArrayList();
        Class7464.field28820 = method22999("acacia", list);
        Class7464.field28821 = method22999("birch", list);
        Class7464.field28822 = method22999("dark_oak", list);
        Class7464.field28823 = method22999("jungle", list);
        Class7464.field28824 = method22999("oak", list);
        Class7464.field28825 = method22999("spruce", list);
        Class7464.field28826 = method22998(Class7464.field28820);
        Class7464.field28827 = method22998(Class7464.field28821);
        Class7464.field28828 = method22998(Class7464.field28822);
        Class7464.field28829 = method22998(Class7464.field28823);
        Class7464.field28830 = method22998(Class7464.field28824);
        Class7464.field28831 = method22998(Class7464.field28825);
        Class7464.field28832 = method23000(Class7464.field28820);
        Class7464.field28833 = method23000(Class7464.field28821);
        Class7464.field28834 = method23000(Class7464.field28822);
        Class7464.field28835 = method23000(Class7464.field28823);
        Class7464.field28836 = method23000(Class7464.field28824);
        Class7464.field28837 = method23000(Class7464.field28825);
        if (list.size() > 0) {
            Class8571.method28847("Enable face culling: " + Class8571.method28888(list.toArray()));
        }
    }
    
    private static List method22998(final Class6313 class6313) {
        return (class6313 != null) ? class6313.method18691(null, null, Class7464.field28838) : null;
    }
    
    public static Class6313 method22999(final String s, final List list) {
        final Class1790 method28860 = Class8571.method28860();
        if (method28860 == null) {
            return null;
        }
        if (!Class8571.method28906(new Class1932("blockstates/" + s + "_leaves.json"))) {
            return null;
        }
        if (!Class8571.method28906(new Class1932("models/block/" + s + "_leaves.json"))) {
            return null;
        }
        final Class6313 method28861 = method28860.method6451(new Class1933(s + "_leaves", "normal"));
        if (method28861 == null || method28861 == method28860.method6452()) {
            return null;
        }
        final List<Class8754> method28862 = method28861.method18691(null, null, Class7464.field28838);
        if (method28862.size() == 0) {
            return method28861;
        }
        if (method28862.size() == 6) {
            for (final Class8754 class8754 : method28862) {
                final List<Class8754> method28863 = method28861.method18691(null, class8754.method30294(), Class7464.field28838);
                if (method28863.size() > 0) {
                    return null;
                }
                method28863.add(class8754);
            }
            method28862.clear();
            list.add(s + "_leaves");
            return method28861;
        }
        return null;
    }
    
    private static Class6313 method23000(final Class6313 class6313) {
        if (class6313 == null) {
            return null;
        }
        if (class6313.method18691(null, null, Class7464.field28838).size() <= 0) {
            final Class179[] field524 = Class179.field524;
            for (int i = 0; i < field524.length; ++i) {
                final Class179 obj = field524[i];
                final List<Class8754> method18691 = class6313.method18691(null, obj, Class7464.field28838);
                if (method18691.size() != 1) {
                    Class8571.method28848("SmartLeaves: Model is not cube, side: " + obj + ", quads: " + method18691.size() + ", model: " + class6313);
                    return class6313;
                }
            }
            final Class6313 method18692 = Class9058.method32621(class6313);
            final List[] array = new List[field524.length];
            for (int j = 0; j < field524.length; ++j) {
                final List<Class8754> method18693 = method18692.method18691(null, field524[j], Class7464.field28838);
                final Class8754 class6314 = method18693.get(0);
                final Class8754 class6315 = new Class8754(class6314.method30291().clone(), class6314.method30293(), class6314.method30294(), class6314.method30295());
                final int[] method18694 = class6315.method30291();
                final int[] array2 = method18694.clone();
                final int n = method18694.length / 4;
                System.arraycopy(method18694, 0 * n, array2, 3 * n, n);
                System.arraycopy(method18694, 1 * n, array2, 2 * n, n);
                System.arraycopy(method18694, 2 * n, array2, 1 * n, n);
                System.arraycopy(method18694, 3 * n, array2, 0 * n, n);
                System.arraycopy(array2, 0, method18694, 0, array2.length);
                method18693.add(class6315);
            }
            return method18692;
        }
        Class8571.method28848("SmartLeaves: Model is not cube, general quads: " + class6313.method18691(null, null, Class7464.field28838).size() + ", model: " + class6313);
        return class6313;
    }
    
    static {
        Class7464.field28820 = null;
        Class7464.field28821 = null;
        Class7464.field28822 = null;
        Class7464.field28823 = null;
        Class7464.field28824 = null;
        Class7464.field28825 = null;
        Class7464.field28826 = null;
        Class7464.field28827 = null;
        Class7464.field28828 = null;
        Class7464.field28829 = null;
        Class7464.field28830 = null;
        Class7464.field28831 = null;
        Class7464.field28832 = null;
        Class7464.field28833 = null;
        Class7464.field28834 = null;
        Class7464.field28835 = null;
        Class7464.field28836 = null;
        Class7464.field28837 = null;
        field28838 = new Random();
    }
}
