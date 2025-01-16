// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.mojang.datafixers.Dynamic;
import org.apache.logging.log4j.Logger;

public interface Class7754<T>
{
    public static final Logger field31687 = LogManager.getLogger();
    
    T method24752(final Dynamic<?> p0);
    
    default <T, V, U extends Class7754<V>> V method24753(final Dynamic<T> dynamic, final Registry<U> class90, final String s, final V v) {
        final Class7754<V> class91 = class90.getOrDefault(new ResourceLocation(dynamic.get(s).asString("")));
        V method24752;
        if (class91 == null) {
            Class7754.field31687.error("Unknown type {}, replacing with {}", (Object)dynamic.get(s).asString(""), (Object)v);
            method24752 = v;
        }
        else {
            method24752 = class91.method24752(dynamic);
        }
        return method24752;
    }
}
