// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.OptionalInt;

public final class Class4428 implements Class4410<OptionalInt>
{
    private static String[] field19759;
    
    public void method13392(final Class8654 class8654, final OptionalInt optionalInt) {
        class8654.method29505(optionalInt.orElse(-1) + 1);
    }
    
    public OptionalInt method13393(final Class8654 class8654) {
        final int method29501 = class8654.method29501();
        return (method29501 != 0) ? OptionalInt.of(method29501 - 1) : OptionalInt.empty();
    }
    
    public OptionalInt method13394(final OptionalInt optionalInt) {
        return optionalInt;
    }
}
