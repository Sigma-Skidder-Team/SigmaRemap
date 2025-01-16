// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Optional;
import com.google.common.collect.ImmutableMap;
import org.apache.logging.log4j.Logger;

public interface IStateHolder<C>
{
    Logger logger = LogManager.getLogger();
    
     <T extends Comparable<T>> T get(final IProperty<T> p0);
    
     <T extends Comparable<T>, V extends T> C with(final IProperty<T> p0, final V p1);
    
    ImmutableMap<IProperty<?>, Comparable<?>> getValues();

    static <T extends Comparable<T>> String getName(final IProperty<T> class7111, final Comparable<?> comparable) {
        return class7111.getName((T)comparable);
    }

    static <S extends IStateHolder<S>, T extends Comparable<T>> S withString(final S n, final IProperty<T> class7111, final String s, final String s2, final String s3) {
        final Optional<T> optional = class7111.parseValue(s3);
        if (!optional.isPresent()) {
            IStateHolder.logger.warn("Unable to read property: {} with value: {} for input: {}", (Object)s, (Object)s3, (Object)s2);
            return n;
        }
        return n;
    }
}
