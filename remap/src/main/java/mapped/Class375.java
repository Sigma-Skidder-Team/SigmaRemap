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

public class Class375 extends Class373
{
    public Class375() {
        super(Class8372.field34331);
    }
    
    public <T> Class375(final Dynamic<T> dynamic) {
        this();
    }
    
    @Override
    public void method1254(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final Random random) {
        class1851.setBlockState(class1852, class1853, 2);
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic(dynamicOps, dynamicOps.createMap(ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Registry.field219.getKey(this.field2213).toString())))).getValue();
    }
}
