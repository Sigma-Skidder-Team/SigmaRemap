// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.List;
import java.io.IOException;
import java.util.Set;

public interface Class6582
{
    Set<String> method19932();
    
    Class1671 method19933(final ResourceLocation p0) throws IOException;
    
    boolean method19934(final ResourceLocation p0);
    
    List<Class1671> method19935(final ResourceLocation p0) throws IOException;
    
    Collection<ResourceLocation> method19936(final String p0, final Predicate<String> p1);
}
