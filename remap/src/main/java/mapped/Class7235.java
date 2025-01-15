// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import java.util.function.Supplier;
import java.util.EnumMap;
import org.apache.logging.log4j.Logger;

public class Class7235
{
    private static String[] field28045;
    private static final Logger field28046;
    public static final EnumMap<Class179, Class9294> field28047;
    public static final EnumMap<Class179, Class9294> field28048;
    
    public static Class9294 method22137(final Class9294 class9294) {
        final Class6789 method20760 = Class6789.method20760(0.5f, 0.5f, 0.5f);
        method20760.method20752(class9294.method34328());
        method20760.method20752(Class6789.method20760(-0.5f, -0.5f, -0.5f));
        return new Class9294(method20760);
    }
    
    public static Class9294 method22138(final Class9294 class9294, final Class179 key, final Supplier<String> supplier) {
        final Class179 method777 = Class179.method777(class9294.method34328(), key);
        final Class9294 method778 = class9294.method34324();
        if (method778 != null) {
            return method22137(Class7235.field28048.get(key).method34323(method778).method34323(Class7235.field28047.get(method777)));
        }
        Class7235.field28046.warn((String)supplier.get());
        return new Class9294(null, null, new Class9138(0.0f, 0.0f, 0.0f), null);
    }
    
    static {
        field28046 = LogManager.getLogger();
        field28047 = Class8349.method27851(Maps.newEnumMap((Class)Class179.class), enumMap -> {
            enumMap.put(Class179.field514, Class9294.method34322());
            final Class179 field28049 = Class179.field516;
            new(mapped.Class9294.class)();
            final Class9138 class9138 = null;
            new Class9389(new Class9138(0.0f, 1.0f, 0.0f), 90.0f, true);
            final Class9389 class9139;
            new Class9294(class9138, class9139, null, null);
            final Class9294 value;
            enumMap.put(field28049, value);
            final Class179 field28050 = Class179.field515;
            new(mapped.Class9294.class)();
            final Class9138 class9140 = null;
            new Class9389(new Class9138(0.0f, 1.0f, 0.0f), -90.0f, true);
            final Class9389 class9141;
            new Class9294(class9140, class9141, null, null);
            final Class9294 value2;
            enumMap.put(field28050, value2);
            final Class179 field28051 = Class179.field513;
            new(mapped.Class9294.class)();
            final Class9138 class9142 = null;
            new Class9389(new Class9138(0.0f, 1.0f, 0.0f), 180.0f, true);
            final Class9389 class9143;
            new Class9294(class9142, class9143, null, null);
            final Class9294 value3;
            enumMap.put(field28051, value3);
            final Class179 field28052 = Class179.field512;
            new(mapped.Class9294.class)();
            final Class9138 class9144 = null;
            new Class9389(new Class9138(1.0f, 0.0f, 0.0f), -90.0f, true);
            final Class9389 class9145;
            new Class9294(class9144, class9145, null, null);
            final Class9294 value4;
            enumMap.put(field28052, value4);
            final Class179 field28053 = Class179.field511;
            new(mapped.Class9294.class)();
            final Class9138 class9146 = null;
            new Class9389(new Class9138(1.0f, 0.0f, 0.0f), 90.0f, true);
            final Class9389 class9147;
            new Class9294(class9146, class9147, null, null);
            final Class9294 value5;
            enumMap.put(field28053, value5);
            return;
        });
        field28048 = Class8349.method27851(Maps.newEnumMap((Class)Class179.class), enumMap2 -> {
            Class179.values();
            final Class179[] array;
            int i = 0;
            for (int length = array.length; i < length; ++i) {
                final Class179 class9148 = array[i];
                enumMap2.put(class9148, Class7235.field28047.get(class9148).method34324());
            }
        });
    }
}
