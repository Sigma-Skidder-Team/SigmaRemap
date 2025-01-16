// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonArray;
import java.util.Collection;
import java.util.function.Function;

public interface Class6967<T>
{
    default boolean method21378(final Function<ResourceLocation, Class7909<T>> function) {
        return true;
    }
    
    void method21379(final Collection<T> p0);
    
    void method21381(final JsonArray p0, final Function<T, ResourceLocation> p1);
}
