// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import org.apache.logging.log4j.LogManager;
import java.util.Random;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import com.mojang.datafixers.Dynamic;
import org.apache.logging.log4j.Logger;

public class Class8530<FC extends Class5113, F extends Class4535<FC>>
{
    public static final Logger field35803;
    public final F field35804;
    public final FC field35805;
    
    public Class8530(final F field35804, final FC field35805) {
        this.field35804 = field35804;
        this.field35805 = field35805;
    }
    
    public Class8530(final F n, final Dynamic<?> dynamic) {
        this(n, ((Class4535<Class5113>)n).method13528(dynamic));
    }
    
    public Class8530<?, ?> method28610(final Class9166<?> class9166) {
        return ((this.field35804 instanceof Class4572) ? Class4535.field20022 : Class4535.field20021).method13527((Object)new Class5114(this, class9166));
    }
    
    public Class9337<FC> method28611(final float n) {
        return new Class9337<FC>(this, n);
    }
    
    public <T> Dynamic<T> method28612(final DynamicOps<T> dynamicOps) {
        return (Dynamic<T>)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("name"), dynamicOps.createString(Registry.field215.getKey(this.field35804).toString()), dynamicOps.createString("config"), this.field35805.method16010((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps).getValue())));
    }
    
    public boolean method28613(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853) {
        return this.field35804.method13525(class1851, class1852, random, class1853, this.field35805);
    }
    
    public static <T> Class8530<?, ?> method28614(final Dynamic<T> dynamic) {
        final String string = dynamic.get("name").asString("");
        final Class4535<?> class4535 = Registry.field215.getOrDefault(new ResourceLocation(string));
        try {
            return new Class8530<Object, Object>(class4535, (Dynamic<?>)dynamic.get("config").orElseEmptyMap());
        }
        catch (final RuntimeException ex) {
            Class8530.field35803.warn("Error while deserializing {}", (Object)string);
            return new Class8530<Object, Object>(Class4535.field19973, Class5122.field22059);
        }
    }
    
    static {
        field35803 = LogManager.getLogger();
    }
}
