// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
import com.github.steveice10.opennbt.conversion.ConversionException;
import com.github.steveice10.opennbt.conversion.ConverterRegisterException;
import java.util.Map;

public class Class7185
{
    private static final Map<Class<? extends Class61>, Class5157<? extends Class61, ?>> field27868;
    private static final Map<Class<?>, Class5157<? extends Class61, ?>> field27869;
    
    public static <T extends Class61, V> void method22024(final Class<T> clazz, final Class<V> clazz2, final Class5157<T, V> class5157) throws ConverterRegisterException {
        if (Class7185.field27868.containsKey(clazz)) {
            throw new Class2396("Type conversion to tag " + clazz.getName() + " is already registered.");
        }
        if (!Class7185.field27869.containsKey(clazz2)) {
            Class7185.field27868.put(clazz, class5157);
            Class7185.field27869.put(clazz2, class5157);
            return;
        }
        throw new Class2396("Tag conversion to type " + clazz2.getName() + " is already registered.");
    }
    
    public static <T extends Class61, V> void method22025(final Class<T> clazz, final Class<V> clazz2) {
        Class7185.field27868.remove(clazz);
        Class7185.field27869.remove(clazz2);
    }
    
    public static <T extends Class61, V> V method22026(final T t) throws ConversionException {
        if (t == null || t.method374() == null) {
            return null;
        }
        if (Class7185.field27868.containsKey(t.getClass())) {
            return (V)Class7185.field27868.get(t.getClass()).method16108((Class61)t);
        }
        throw new Class2358("Tag type " + t.getClass().getName() + " has no converter.");
    }
    
    public static <V, T extends Class61> T method22027(final String s, final V v) throws ConversionException {
        if (v == null) {
            return null;
        }
        Class5157 class5157 = Class7185.field27869.get(v.getClass());
        if (class5157 == null) {
            for (final Class clazz : method22028(v.getClass())) {
                if (Class7185.field27869.containsKey(clazz)) {
                    try {
                        class5157 = Class7185.field27869.get(clazz);
                        break;
                    }
                    catch (final ClassCastException ex) {}
                }
            }
        }
        if (class5157 == null) {
            throw new Class2358("Value type " + v.getClass().getName() + " has no converter.");
        }
        return (T)class5157.method16107(s, v);
    }
    
    private static Set<Class<?>> method22028(final Class<?> clazz) {
        final LinkedHashSet set = new LinkedHashSet();
        for (Class<?> superclass = clazz; superclass != null; superclass = superclass.getSuperclass()) {
            set.add(superclass);
            set.addAll(method22029(superclass));
        }
        if (set.contains(Serializable.class)) {
            set.remove(Serializable.class);
            set.add(Serializable.class);
        }
        return set;
    }
    
    private static Set<Class<?>> method22029(final Class<?> clazz) {
        final HashSet set = new HashSet();
        for (final Class clazz2 : clazz.getInterfaces()) {
            set.add(clazz2);
            set.addAll(method22029(clazz2));
        }
        return set;
    }
    
    static {
        field27868 = new HashMap<Class<? extends Class61>, Class5157<? extends Class61, ?>>();
        field27869 = new HashMap<Class<?>, Class5157<? extends Class61, ?>>();
        method22024(Class72.class, Byte.class, new Class5162());
        method22024(Class70.class, Short.class, new Class5159());
        method22024(Class68.class, Integer.class, new Class5165());
        method22024(Class69.class, Long.class, new Class5167());
        method22024(Class65.class, Float.class, new Class5158());
        method22024(Class66.class, Double.class, new Class5164());
        method22024(Class67.class, byte[].class, new Class5168());
        method22024(Class71.class, String.class, new Class5169());
        method22024(Class60.class, List.class, new Class5170());
        method22024(Class74.class, Map.class, new Class5156());
        method22024(Class62.class, int[].class, new Class5161());
        method22024(Class75.class, long[].class, new Class5160());
        method22024(Class73.class, double[].class, new Class5171());
        method22024(Class64.class, float[].class, new Class5163());
        method22024(Class63.class, short[].class, new Class5166());
    }
}
