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
        if (Biome.field15442.method29027(class354.getX() / 200.0, class354.getZ() / 200.0, false) >= -0.8) {
            return (random.nextInt(3) <= 0) ? Blocks.DANDELION.getDefaultState() : Class359.field2187[random.nextInt(Class359.field2187.length)];
        }
        return Class359.field2186[random.nextInt(Class359.field2186.length)];
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        final ImmutableMap$Builder builder = ImmutableMap.builder();
        builder.put(dynamicOps.createString("type"), dynamicOps.createString(Registry.field218.getKey(this.field2184).toString()));
        return (T)new Dynamic(dynamicOps, dynamicOps.createMap((Map)builder.build())).getValue();
    }
    
    static {
        field2186 = new BlockState[] { Blocks.ORANGE_TULIP.getDefaultState(), Blocks.RED_TULIP.getDefaultState(), Blocks.PINK_TULIP.getDefaultState(), Blocks.WHITE_TULIP.getDefaultState() };
        field2187 = new BlockState[] { Blocks.POPPY.getDefaultState(), Blocks.AZURE_BLUET.getDefaultState(), Blocks.OXEYE_DAISY.getDefaultState(), Blocks.CORNFLOWER.getDefaultState() };
    }
}
