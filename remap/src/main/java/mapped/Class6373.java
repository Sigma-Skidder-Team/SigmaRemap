// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface Class6373
{
    public static final Class6373 field25479 = (class7529, consumer) -> false;
    public static final Class6373 field25480 = (class7529, consumer) -> true;
    
    boolean method19016(final Class7529 p0, final Consumer<Class7182> p1);
    
    default Class6373 method19027(final Class6373 obj) {
        Objects.requireNonNull(obj);
        return (class6374, consumer) -> this.method19016(class6374, consumer) && obj.method19016(class6374, consumer);
    }
    
    default Class6373 method19028(final Class6373 obj) {
        Objects.requireNonNull(obj);
        return (class6374, consumer) -> this.method19016(class6374, consumer) || obj.method19016(class6374, consumer);
    }
}
