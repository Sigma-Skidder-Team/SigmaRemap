// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Function;
import com.mojang.datafixers.Dynamic;
import java.util.Collection;
import java.util.List;
import com.google.common.collect.ImmutableList;
import net.minecraft.util.math.MathHelper;

public class Class4110 extends Class4107
{
    private final ImmutableList<Class8732> field18213;
    
    public Class4110(final List<Class8732> list) {
        this.field18213 = (ImmutableList<Class8732>)ImmutableList.copyOf((Collection)list);
    }
    
    public Class4110(final Dynamic<?> dynamic) {
        this(dynamic.get("rules").asList((Function)Class8732::method30166));
    }
    
    @Nullable
    @Override
    public Class9038 method12350(final Class1852 class1852, final BlockPos class1853, final Class9038 class1854, final Class9038 class1855, final Class9092 class1856) {
        final Random random = new Random(MathHelper.method35688(class1855.field38248));
        final Class7096 method6701 = class1852.getBlockState(class1855.field38248);
        for (final Class8732 class1857 : this.field18213) {
            if (!class1857.method30162(class1855.field38249, method6701, random)) {
                continue;
            }
            return new Class9038(class1855.field38248, class1857.method30163(), class1857.method30164());
        }
        return class1855;
    }
    
    @Override
    public Class7756 method12351() {
        return Class7756.field31696;
    }
    
    @Override
    public <T> Dynamic<T> method12352(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("rules"), dynamicOps.createList((Stream)this.field18213.stream().map(class8732 -> class8732.method30165((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps2).getValue())))));
    }
}
