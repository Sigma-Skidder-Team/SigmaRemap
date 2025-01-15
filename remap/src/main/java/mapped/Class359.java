// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class359 extends Class357
{
    private static final Class7096[] field2186;
    private static final Class7096[] field2187;
    
    public Class359() {
        super(Class8804.field37006);
    }
    
    public <T> Class359(final Dynamic<T> dynamic) {
        this();
    }
    
    @Override
    public Class7096 method1164(final Random random, final Class354 class354) {
        if (Class3090.field15442.method29027(class354.method1074() / 200.0, class354.method1076() / 200.0, false) >= -0.8) {
            return (random.nextInt(3) <= 0) ? Class7521.field29265.method11878() : Class359.field2187[random.nextInt(Class359.field2187.length)];
        }
        return Class359.field2186[random.nextInt(Class359.field2186.length)];
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Class90.field218.method503(this.field2184).toString()));
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
    
    static {
        field2186 = new Class7096[] { Class7521.field29271.method11878(), Class7521.field29270.method11878(), Class7521.field29273.method11878(), Class7521.field29272.method11878() };
        field2187 = new Class7096[] { Class7521.field29266.method11878(), Class7521.field29269.method11878(), Class7521.field29274.method11878(), Class7521.field29275.method11878() };
    }
}
