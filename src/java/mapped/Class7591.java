// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import com.google.gson.JsonElement;

public abstract class Class7591
{
    private final String field30112;
    
    public Class7591(final String field30112) {
        this.field30112 = field30112;
    }
    
    public <S extends Class7098<S>> boolean method23885(final Class9104<?, S> class9104, final S n) {
        final Class7111<?> method32906 = class9104.method32906(this.field30112);
        return method32906 != null && this.method23883(n, method32906);
    }
    
    public abstract <T extends Comparable<T>> boolean method23883(final Class7098<?> p0, final Class7111<T> p1);
    
    public abstract JsonElement method23884();
    
    public String method23886() {
        return this.field30112;
    }
    
    public void method23887(final Class9104<?, ?> class9104, final Consumer<String> consumer) {
        if (class9104.method32906(this.field30112) == null) {
            consumer.accept(this.field30112);
        }
    }
}
