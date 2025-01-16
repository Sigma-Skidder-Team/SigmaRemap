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
    private static final BlockState[] field2186;
    private static final BlockState[] field2187;
    
    public Class359() {
        super(Class8804.field37006);
    }
    
    public <T> Class359(final Dynamic<T> dynamic) {
        this();
    }
    
    @Override
    public BlockState method1164(final Random random, final BlockPos class354) {
        if (Class3090.field15442.method29027(class354.getX() / 200.0, class354.getZ() / 200.0, false) >= -0.8) {
            return (random.nextInt(3) <= 0) ? Class7521.field29265.getDefaultState() : Class359.field2187[random.nextInt(Class359.field2187.length)];
        }
        return Class359.field2186[random.nextInt(Class359.field2186.length)];
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Registry.field218.getKey(this.field2184).toString()));
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
    
    static {
        field2186 = new BlockState[] { Class7521.field29271.getDefaultState(), Class7521.field29270.getDefaultState(), Class7521.field29273.getDefaultState(), Class7521.field29272.getDefaultState() };
        field2187 = new BlockState[] { Class7521.field29266.getDefaultState(), Class7521.field29269.getDefaultState(), Class7521.field29274.getDefaultState(), Class7521.field29275.getDefaultState() };
    }
}
