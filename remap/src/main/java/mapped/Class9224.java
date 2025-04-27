// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.types.templates.Hook$HookFunction;

public final class Class9224 implements Hook$HookFunction
{
    public <T> T apply(final DynamicOps<T> dynamicOps, final T t) {
        return Class8173.method27026((com.mojang.datafixers.Dynamic<T>)new Dynamic(dynamicOps, t), Class9327.field40036, "minecraft:armor_stand");
    }
}
