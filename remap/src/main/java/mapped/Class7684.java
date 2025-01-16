// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.mojang.datafixers.util.Pair;
import java.util.Set;
import java.util.function.Function;
import java.util.Collection;

public interface Class7684
{
    Collection<ResourceLocation> method24381();
    
    Collection<Class3687> method24382(final Function<ResourceLocation, Class7684> p0, final Set<Pair<String, String>> p1);
    
    @Nullable
    Class6313 method24383(final Class7637 p0, final Function<Class3687, Class1912> p1, final Class2123 p2, final ResourceLocation p3);
}
