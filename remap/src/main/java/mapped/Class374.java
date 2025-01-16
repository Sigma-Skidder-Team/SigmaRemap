// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;

public class Class374 extends Class373
{
    public Class374() {
        super(Class8372.field34332);
    }
    
    public <T> Class374(final Dynamic<T> dynamic) {
        this();
    }
    
    @Override
    public void method1254(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final Random random) {
        ((Class3870)class1853.getBlock()).method11944(class1851, class1852, 2);
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Registry.field219.getKey(this.field2213).toString())))).getValue();
    }
}
