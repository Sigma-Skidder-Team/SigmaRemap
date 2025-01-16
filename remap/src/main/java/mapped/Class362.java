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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class Class362 extends Class357
{
    private static final BlockState[] field2190;
    
    public Class362() {
        super(Class8804.field37007);
    }
    
    public <T> Class362(final Dynamic<T> dynamic) {
        this();
    }
    
    @Override
    public BlockState method1164(final Random random, final BlockPos class354) {
        return Class362.field2190[(int)(MathHelper.clamp((1.0 + Class3090.field15442.method29027(class354.getX() / 48.0, class354.getZ() / 48.0, false)) / 2.0, 0.0, 0.9999) * Class362.field2190.length)];
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Registry.field218.getKey(this.field2184).toString()));
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
    
    static {
        field2190 = new BlockState[] { Class7521.field29265.getDefaultState(), Class7521.field29266.getDefaultState(), Class7521.field29268.getDefaultState(), Class7521.field29269.getDefaultState(), Class7521.field29270.getDefaultState(), Class7521.field29271.getDefaultState(), Class7521.field29272.getDefaultState(), Class7521.field29273.getDefaultState(), Class7521.field29274.getDefaultState(), Class7521.field29275.getDefaultState(), Class7521.field29277.getDefaultState() };
    }
}
