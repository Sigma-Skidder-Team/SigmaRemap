// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class9166<DC extends Class6926>
{
    public final Class7133<DC> field38832;
    public final DC field38833;
    
    public Class9166(final Class7133<DC> class7133, final Dynamic<?> dynamic) {
        this((Class7133<Class6926>)class7133, class7133.method21888(dynamic));
    }
    
    public Class9166(final Class7133<DC> field38832, final DC field38833) {
        this.field38832 = field38832;
        this.field38833 = field38833;
    }
    
    public <FC extends Class5113, F extends Class4535<FC>> boolean method33461(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class8530<FC, F> class1854) {
        return this.field38832.method21890(class1851, class1852, random, class1853, this.field38833, class1854);
    }
    
    public <T> Dynamic<T> method33462(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("name"), dynamicOps.createString(Registry.field216.getKey(this.field38832).toString()), dynamicOps.createString("config"), this.field38833.method21299((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue())));
    }
    
    public static <T> Class9166<?> method33463(final Dynamic<T> dynamic) {
        return new Class9166<Object>(Registry.field216.getOrDefault(new ResourceLocation(dynamic.get("name").asString(""))), (Dynamic<?>)dynamic.get("config").orElseEmptyMap());
    }
}
