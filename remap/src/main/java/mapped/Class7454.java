// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.function.Predicate;
import java.util.Map;

public class Class7454
{
    private static final Map<Class1932, Class7020<?>> field28756;
    private static final Map<Class<? extends Class122>, Class7020<?>> field28757;
    
    public static <T extends Class122> void method22940(final Class7020<? extends T> class7020) {
        final Class1932 method21484 = class7020.method21484();
        final Class method21485 = class7020.method21485();
        if (Class7454.field28756.containsKey(method21484)) {
            throw new IllegalArgumentException("Can't re-register item condition name " + method21484);
        }
        if (!Class7454.field28757.containsKey(method21485)) {
            Class7454.field28756.put(method21484, class7020);
            Class7454.field28757.put(method21485, class7020);
            return;
        }
        throw new IllegalArgumentException("Can't re-register item condition class " + method21485.getName());
    }
    
    public static Class7020<?> method22941(final Class1932 obj) {
        final Class7020 class7020 = Class7454.field28756.get(obj);
        if (class7020 != null) {
            return class7020;
        }
        throw new IllegalArgumentException("Unknown loot item condition '" + obj + "'");
    }
    
    public static <T extends Class122> Class7020<T> method22942(final T obj) {
        final Class7020 class7020 = Class7454.field28757.get(obj.getClass());
        if (class7020 != null) {
            return class7020;
        }
        throw new IllegalArgumentException("Unknown loot item condition " + obj);
    }
    
    public static <T> Predicate<T> method22943(final Predicate<T>[] array) {
        switch (array.length) {
            case 0: {
                return p0 -> true;
            }
            case 1: {
                return array[0];
            }
            case 2: {
                return array[0].and(array[1]);
            }
            default: {
                return o -> {
                    final int length = array2.length;
                    int i = 0;
                    while (i < length) {
                        if (array2[i].test(o)) {
                            ++i;
                        }
                        else {
                            return false;
                        }
                    }
                    return true;
                };
            }
        }
    }
    
    public static <T> Predicate<T> method22944(final Predicate<T>[] array) {
        switch (array.length) {
            case 0: {
                return p0 -> false;
            }
            case 1: {
                return array[0];
            }
            case 2: {
                return array[0].or(array[1]);
            }
            default: {
                return o -> {
                    final int length = array2.length;
                    int i = 0;
                    while (i < length) {
                        if (!array2[i].test(o)) {
                            ++i;
                        }
                        else {
                            return true;
                        }
                    }
                    return false;
                };
            }
        }
    }
    
    static {
        field28756 = Maps.newHashMap();
        field28757 = Maps.newHashMap();
        method22940((Class7020<? extends Class122>)new Class7025());
        method22940((Class7020<? extends Class122>)new Class7032());
        method22940((Class7020<? extends Class122>)new Class7027());
        method22940((Class7020<? extends Class122>)new Class7035());
        method22940((Class7020<? extends Class122>)new Class7034());
        method22940((Class7020<? extends Class122>)new Class7028());
        method22940((Class7020<? extends Class122>)new Class7026());
        method22940((Class7020<? extends Class122>)new Class7030());
        method22940((Class7020<? extends Class122>)new Class7029());
        method22940((Class7020<? extends Class122>)new Class7023());
        method22940((Class7020<? extends Class122>)new Class7031());
        method22940((Class7020<? extends Class122>)new Class7033());
        method22940((Class7020<? extends Class122>)new Class7021());
        method22940((Class7020<? extends Class122>)new Class7019());
        method22940((Class7020<? extends Class122>)new Class7022());
        method22940((Class7020<? extends Class122>)new Class7024());
    }
}
