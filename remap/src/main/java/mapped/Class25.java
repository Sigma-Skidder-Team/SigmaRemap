// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import java.util.function.Function;

public final class Class25 implements Function<Map.Entry<IProperty<?>, Comparable<?>>, String>
{
    @Override
    public String apply(final Map.Entry<IProperty<?>, Comparable<?>> entry) {
        if (entry != null) {
            final IProperty class7111 = entry.getKey();
            return class7111.getName() + "=" + this.method256((IProperty<Comparable>)class7111, entry.getValue());
        }
        return "<NULL>";
    }
    
    private <T extends Comparable<T>> String method256(final IProperty<T> class7111, final Comparable<?> comparable) {
        return class7111.getName((T)comparable);
    }
}
