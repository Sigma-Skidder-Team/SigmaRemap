// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.List;

public class Class7652
{
    private static final List<Class7388<Class8061>> field30383;
    private static final List<Class7388<Class3820>> field30384;
    private static final List<Class120> field30385;
    private static final Predicate<Class8321> field30386;
    
    public static boolean method24240(final Class8321 class8321) {
        return method24241(class8321) || method24242(class8321);
    }
    
    public static boolean method24241(final Class8321 class8321) {
        for (int i = 0; i < Class7652.field30384.size(); ++i) {
            if (Class7388.method22689((Class7388<Object>)Class7652.field30384.get(i)).test(class8321)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method24242(final Class8321 class8321) {
        for (int i = 0; i < Class7652.field30383.size(); ++i) {
            if (Class7388.method22689((Class7388<Object>)Class7652.field30383.get(i)).test(class8321)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method24243(final Class8061 class8061) {
        for (int i = 0; i < Class7652.field30383.size(); ++i) {
            if (Class7388.method22690((Class7388<Object>)Class7652.field30383.get(i)) == class8061) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method24244(final Class8321 class8321, final Class8321 class8322) {
        return Class7652.field30386.test(class8321) && (method24245(class8321, class8322) || method24246(class8321, class8322));
    }
    
    public static boolean method24245(final Class8321 class8321, final Class8321 class8322) {
        final Class3820 method27622 = class8321.method27622();
        for (int i = 0; i < Class7652.field30384.size(); ++i) {
            final Class7388 class8323 = Class7652.field30384.get(i);
            if (Class7388.method22691(class8323) == method27622 && Class7388.method22689(class8323).test(class8322)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method24246(final Class8321 class8321, final Class8321 class8322) {
        final Class8061 method16474 = Class5333.method16474(class8321);
        for (int i = 0; i < Class7652.field30383.size(); ++i) {
            final Class7388 class8323 = Class7652.field30383.get(i);
            if (Class7388.method22691(class8323) == method16474 && Class7388.method22689(class8323).test(class8322)) {
                return true;
            }
        }
        return false;
    }
    
    public static Class8321 method24247(final Class8321 class8321, final Class8321 class8322) {
        if (!class8322.method27620()) {
            final Class8061 method16474 = Class5333.method16474(class8322);
            final Class3820 method16475 = class8322.method27622();
            for (int i = 0; i < Class7652.field30384.size(); ++i) {
                final Class7388 class8323 = Class7652.field30384.get(i);
                if (Class7388.method22691(class8323) == method16475 && Class7388.method22689(class8323).test(class8321)) {
                    return Class5333.method16476(new Class8321((Class3832)Class7388.method22690(class8323)), method16474);
                }
            }
            for (int j = 0; j < Class7652.field30383.size(); ++j) {
                final Class7388 class8324 = Class7652.field30383.get(j);
                if (Class7388.method22691(class8324) == method16474 && Class7388.method22689(class8324).test(class8321)) {
                    return Class5333.method16476(new Class8321(method16475), (Class8061)Class7388.method22690(class8324));
                }
            }
        }
        return class8322;
    }
    
    public static void method24248() {
        method24250(Class7739.field31441);
        method24250(Class7739.field31579);
        method24250(Class7739.field31582);
        method24249(Class7739.field31441, Class7739.field31308, Class7739.field31579);
        method24249(Class7739.field31579, Class7739.field31578, Class7739.field31582);
        method24251(Class8644.field36251, Class7739.field31450, Class8644.field36252);
        method24251(Class8644.field36251, Class7739.field31438, Class8644.field36252);
        method24251(Class8644.field36251, Class7739.field31544, Class8644.field36252);
        method24251(Class8644.field36251, Class7739.field31445, Class8644.field36252);
        method24251(Class8644.field36251, Class7739.field31443, Class8644.field36252);
        method24251(Class8644.field36251, Class7739.field31406, Class8644.field36252);
        method24251(Class8644.field36251, Class7739.field31446, Class8644.field36252);
        method24251(Class8644.field36251, Class7739.field31378, Class8644.field36253);
        method24251(Class8644.field36251, Class7739.field31354, Class8644.field36252);
        method24251(Class8644.field36251, Class7739.field31440, Class8644.field36254);
        method24251(Class8644.field36254, Class7739.field31522, Class8644.field36255);
        method24251(Class8644.field36255, Class7739.field31354, Class8644.field36256);
        method24251(Class8644.field36255, Class7739.field31444, Class8644.field36257);
        method24251(Class8644.field36256, Class7739.field31444, Class8644.field36258);
        method24251(Class8644.field36257, Class7739.field31354, Class8644.field36258);
        method24251(Class8644.field36254, Class7739.field31446, Class8644.field36262);
        method24251(Class8644.field36262, Class7739.field31354, Class8644.field36263);
        method24251(Class8644.field36254, Class7739.field31544, Class8644.field36259);
        method24251(Class8644.field36259, Class7739.field31354, Class8644.field36260);
        method24251(Class8644.field36259, Class7739.field31378, Class8644.field36261);
        method24251(Class8644.field36259, Class7739.field31444, Class8644.field36267);
        method24251(Class8644.field36260, Class7739.field31444, Class8644.field36268);
        method24251(Class8644.field36267, Class7739.field31354, Class8644.field36268);
        method24251(Class8644.field36267, Class7739.field31378, Class8644.field36269);
        method24251(Class8644.field36254, Class7739.field31272, Class8644.field36270);
        method24251(Class8644.field36270, Class7739.field31354, Class8644.field36271);
        method24251(Class8644.field36270, Class7739.field31378, Class8644.field36272);
        method24251(Class8644.field36264, Class7739.field31444, Class8644.field36267);
        method24251(Class8644.field36265, Class7739.field31444, Class8644.field36268);
        method24251(Class8644.field36254, Class7739.field31406, Class8644.field36264);
        method24251(Class8644.field36264, Class7739.field31354, Class8644.field36265);
        method24251(Class8644.field36264, Class7739.field31378, Class8644.field36266);
        method24251(Class8644.field36254, Class7739.field31382, Class8644.field36273);
        method24251(Class8644.field36273, Class7739.field31354, Class8644.field36274);
        method24251(Class8644.field36254, Class7739.field31450, Class8644.field36275);
        method24251(Class8644.field36275, Class7739.field31378, Class8644.field36276);
        method24251(Class8644.field36275, Class7739.field31444, Class8644.field36277);
        method24251(Class8644.field36276, Class7739.field31444, Class8644.field36278);
        method24251(Class8644.field36277, Class7739.field31378, Class8644.field36278);
        method24251(Class8644.field36279, Class7739.field31444, Class8644.field36277);
        method24251(Class8644.field36280, Class7739.field31444, Class8644.field36277);
        method24251(Class8644.field36281, Class7739.field31444, Class8644.field36278);
        method24251(Class8644.field36254, Class7739.field31443, Class8644.field36279);
        method24251(Class8644.field36279, Class7739.field31354, Class8644.field36280);
        method24251(Class8644.field36279, Class7739.field31378, Class8644.field36281);
        method24251(Class8644.field36254, Class7739.field31438, Class8644.field36282);
        method24251(Class8644.field36282, Class7739.field31354, Class8644.field36283);
        method24251(Class8644.field36282, Class7739.field31378, Class8644.field36284);
        method24251(Class8644.field36254, Class7739.field31445, Class8644.field36285);
        method24251(Class8644.field36285, Class7739.field31354, Class8644.field36286);
        method24251(Class8644.field36285, Class7739.field31378, Class8644.field36287);
        method24251(Class8644.field36251, Class7739.field31444, Class8644.field36288);
        method24251(Class8644.field36288, Class7739.field31354, Class8644.field36289);
        method24251(Class8644.field36254, Class7739.field31608, Class8644.field36291);
        method24251(Class8644.field36291, Class7739.field31354, Class8644.field36292);
    }
    
    private static void method24249(final Class3820 class3820, final Class3820 class3821, final Class3820 class3822) {
        if (!(class3820 instanceof Class4089)) {
            throw new IllegalArgumentException("Expected a potion, got: " + Class90.field211.method503(class3820));
        }
        if (class3822 instanceof Class4089) {
            Class7652.field30384.add(new Class7388<Class3820>(class3820, Class120.method618(class3821), class3822));
            return;
        }
        throw new IllegalArgumentException("Expected a potion, got: " + Class90.field211.method503(class3822));
    }
    
    private static void method24250(final Class3820 class3820) {
        if (class3820 instanceof Class4089) {
            Class7652.field30385.add(Class120.method618(class3820));
            return;
        }
        throw new IllegalArgumentException("Expected a potion, got: " + Class90.field211.method503(class3820));
    }
    
    private static void method24251(final Class8061 class8061, final Class3820 class8062, final Class8061 class8063) {
        Class7652.field30383.add(new Class7388<Class8061>(class8061, Class120.method618(class8062), class8063));
    }
    
    static {
        field30383 = Lists.newArrayList();
        field30384 = Lists.newArrayList();
        field30385 = Lists.newArrayList();
        field30386 = (class8321 -> {
            Class7652.field30385.iterator();
            final Iterator iterator;
            while (iterator.hasNext()) {
                if (!iterator.next().test(class8321)) {
                    continue;
                }
                else {
                    return true;
                }
            }
            return false;
        });
    }
}
