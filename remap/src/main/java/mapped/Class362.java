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
        field2190 = new BlockState[] { Blocks.DANDELION.getDefaultState(), Blocks.POPPY.getDefaultState(), Blocks.ALLIUM.getDefaultState(), Blocks.AZURE_BLUET.getDefaultState(), Blocks.RED_TULIP.getDefaultState(), Blocks.ORANGE_TULIP.getDefaultState(), Blocks.WHITE_TULIP.getDefaultState(), Blocks.PINK_TULIP.getDefaultState(), Blocks.OXEYE_DAISY.getDefaultState(), Blocks.CORNFLOWER.getDefaultState(), Blocks.LILY_OF_THE_VALLEY.getDefaultState() };
    }
}
