// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Set;
import java.util.Collection;
import java.util.function.Predicate;
import java.io.IOException;
import java.io.InputStream;
import java.io.Closeable;

public interface Class1727 extends Closeable
{
    InputStream method6096(final String p0) throws IOException;
    
    InputStream method6097(final Class346 p0, final ResourceLocation p1) throws IOException;
    
    Collection<ResourceLocation> method6098(final Class346 p0, final String p1, final String p2, final int p3, final Predicate<String> p4);
    
    boolean method6099(final Class346 p0, final ResourceLocation p1);
    
    Set<String> method6100(final Class346 p0);
    
    @Nullable
     <T> T method6101(final Class5092<T> p0) throws IOException;
    
    String method6102();
}
