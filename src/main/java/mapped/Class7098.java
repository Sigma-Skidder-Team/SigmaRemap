// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Optional;
import com.google.common.collect.ImmutableMap;
import org.apache.logging.log4j.Logger;

public interface Class7098<C>
{
    public static final Logger field27627 = LogManager.getLogger();
    
     <T extends Comparable<T>> T method21772(final Class7111<T> p0);
    
     <T extends Comparable<T>, V extends T> C method21773(final Class7111<T> p0, final V p1);
    
    ImmutableMap<Class7111<?>, Comparable<?>> method21776();
    
    default <T extends Comparable<T>> String method21777(final Class7111<T> class7111, final Comparable<?> comparable) {
        return class7111.method21831((T)comparable);
    }
    
    default <S extends Class7098<S>, T extends Comparable<T>> S method21778(final S n, final Class7111<T> class7111, final String s, final String s2, final String s3) {
        final Optional<T> method21830 = class7111.method21830(s3);
        if (!method21830.isPresent()) {
            Class7098.field27627.warn("Unable to read property: {} with value: {} for input: {}", (Object)s, (Object)s3, (Object)s2);
            return n;
        }
        return n.method21773(class7111, (Comparable)method21830.get());
    }
}
