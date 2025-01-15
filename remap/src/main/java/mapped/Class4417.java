// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public final class Class4417 implements Class4410<Optional<Class7096>>
{
    private static String[] field19748;
    
    public void method13342(final Class8654 class8654, final Optional<Class7096> optional) {
        if (!optional.isPresent()) {
            class8654.method29505(0);
        }
        else {
            class8654.method29505(Class3833.method11774(optional.get()));
        }
    }
    
    public Optional<Class7096> method13343(final Class8654 class8654) {
        final int method29501 = class8654.method29501();
        return (method29501 != 0) ? Optional.of(Class3833.method11775(method29501)) : Optional.empty();
    }
    
    public Optional<Class7096> method13344(final Optional<Class7096> optional) {
        return optional;
    }
}
