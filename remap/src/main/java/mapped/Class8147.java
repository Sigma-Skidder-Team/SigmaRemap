// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Properties;
import java.util.function.Function;
import java.util.function.Supplier;

public class Class8147<V> implements Supplier<V>
{
    private static String[] field33553;
    private final String field33554;
    private final V field33555;
    private final Function<V, String> field33556;
    public final /* synthetic */ Class9278 field33557;
    
    private Class8147(final Class9278 field33557, final String field33558, final V field33559, final Function<V, String> field33560) {
        this.field33557 = field33557;
        this.field33554 = field33558;
        this.field33555 = field33559;
        this.field33556 = field33560;
    }
    
    @Override
    public V get() {
        return this.field33555;
    }
    
    public Class9278 method26842(final Object o) {
        final Properties method34248 = this.field33557.method34248();
        method34248.put(this.field33554, this.field33556.apply((V)o));
        return this.field33557.method34225(method34248);
    }
}
