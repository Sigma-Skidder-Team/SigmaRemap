// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Collection;
import java.util.Map;

public class Class391 implements AutoCloseable
{
    private static String[] field2277;
    private final Map<ResourceLocation, Class1774> field2278;
    
    public Class391(final Collection<Class1774> collection) {
        this.field2278 = collection.stream().collect(Collectors.toMap((Function<? super Class1774, ? extends ResourceLocation>)Class1774::method6340, (Function<? super Class1774, ? extends Class1774>)Function.identity()));
    }
    
    public Class1774 method1414(final ResourceLocation class1932) {
        return this.field2278.get(class1932);
    }
    
    public Class1912 method1415(final Class3687 class3687) {
        return this.field2278.get(class3687.method11330()).method6338(class3687.method11331());
    }
    
    @Override
    public void close() {
        this.field2278.values().forEach(Class1774::method6339);
        this.field2278.clear();
    }
}
