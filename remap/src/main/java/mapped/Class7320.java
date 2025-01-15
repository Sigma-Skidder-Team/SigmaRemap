// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.function.BiFunction;

public final class Class7320 implements Class7318
{
    private static String[] field28310;
    public final /* synthetic */ Class1847 field28311;
    public final /* synthetic */ Class354 field28312;
    
    public Class7320(final Class1847 field28311, final Class354 field28312) {
        this.field28311 = field28311;
        this.field28312 = field28312;
    }
    
    @Override
    public <T> Optional<T> method22435(final BiFunction<Class1847, Class354, T> biFunction) {
        return Optional.of(biFunction.apply(this.field28311, this.field28312));
    }
}
