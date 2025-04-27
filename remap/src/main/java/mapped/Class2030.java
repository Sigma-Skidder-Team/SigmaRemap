// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import java.util.function.Function;
import java.util.Map;

public enum Class2030
{
    field11568("bitmap", Class7822::method25275),
    field11569("ttf", Class7825::method25279), 
    field11570("legacy_unicode", Class7824::method25278);
    
    private static final Map<String, Class2030> field11571;
    private final String field11572;
    private final Function<JsonObject, Class7823> field11573;
    
    Class2030(final String field11572, final Function<JsonObject, Class7823> field11573) {
        this.field11572 = field11572;
        this.field11573 = field11573;
    }
    
    public static Class2030 method8086(final String str) {
        final Class2030 class2030 = Class2030.field11571.get(str);
        if (class2030 != null) {
            return class2030;
        }
        throw new IllegalArgumentException("Invalid type: " + str);
    }
    
    public Class7823 method8087(final JsonObject jsonObject) {
        return this.field11573.apply(jsonObject);
    }
    
    static {
        field11571 = Util.method27851(Maps.newHashMap(), hashMap -> {
            values();
            final Class2030[] array;
            int i = 0;
            for (int length = array.length; i < length; ++i) {
                final Class2030 value = array[i];
                hashMap.put(value.field11572, value);
            }
        });
    }
}
