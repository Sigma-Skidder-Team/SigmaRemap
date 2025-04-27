// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;

public class Class5122 implements Class5113
{
    private static String[] field22072;
    
    @Override
    public <T> Dynamic<T> method16010(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic(dynamicOps, dynamicOps.emptyMap());
    }
    
    public static <T> Class5122 method16027(final Dynamic<T> dynamic) {
        return Class5122.field22059;
    }
}
