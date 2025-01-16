// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.function.Function;

public interface Class9276
{
    default boolean method34220(final Class6582 class6582, final ResourceLocation class6583) {
        return false;
    }
    
    default boolean method34221(final Class6582 class6582, final ResourceLocation class6583, final Function<ResourceLocation, TextureAtlasSprite> function) {
        return true;
    }
    
    default Collection<ResourceLocation> method34222() {
        return (Collection<ResourceLocation>)ImmutableList.of();
    }
}
