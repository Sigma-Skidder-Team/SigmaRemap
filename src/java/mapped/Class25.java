// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.function.Function;

public final class Class25 implements Function<Map.Entry<Class7111<?>, Comparable<?>>, String>
{
    @Override
    public String apply(final Map.Entry<Class7111<?>, Comparable<?>> entry) {
        if (entry != null) {
            final Class7111 class7111 = entry.getKey();
            return class7111.method21826() + "=" + this.method256((Class7111<Comparable>)class7111, entry.getValue());
        }
        return "<NULL>";
    }
    
    private <T extends Comparable<T>> String method256(final Class7111<T> class7111, final Comparable<?> comparable) {
        return class7111.method21831((T)comparable);
    }
}
