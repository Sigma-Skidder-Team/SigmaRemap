// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.function.Function;

public interface Class9276
{
    default boolean method34220(final Class6582 class6582, final Class1932 class6583) {
        return false;
    }
    
    default boolean method34221(final Class6582 class6582, final Class1932 class6583, final Function<Class1932, Class1912> function) {
        return true;
    }
    
    default Collection<Class1932> method34222() {
        return (Collection<Class1932>)ImmutableList.of();
    }
}
