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
    
    public <S extends IStateHolder<S>> boolean method23885(final StateContainer<?, S> class9104, final S n) {
        final IProperty<?> method32906 = class9104.getProperty(this.field30112);
        return method32906 != null && this.method23883(n, method32906);
    }
    
    public abstract <T extends Comparable<T>> boolean method23883(final IStateHolder<?> p0, final IProperty<T> p1);
    
    public abstract JsonElement method23884();
    
    public String method23886() {
        return this.field30112;
    }
    
    public void method23887(final StateContainer<?, ?> class9104, final Consumer<String> consumer) {
        if (class9104.getProperty(this.field30112) == null) {
            consumer.accept(this.field30112);
        }
    }
}
