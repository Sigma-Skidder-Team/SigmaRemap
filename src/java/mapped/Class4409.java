// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;
import java.util.Optional;

public final class Class4409 implements Class4410<Optional<UUID>>
{
    private static String[] field19741;
    
    public void method13342(final Class8654 class8654, final Optional<UUID> optional) {
        class8654.writeBoolean(optional.isPresent());
        if (optional.isPresent()) {
            class8654.method29503(optional.get());
        }
    }
    
    public Optional<UUID> method13343(final Class8654 class8654) {
        return class8654.readBoolean() ? Optional.of(class8654.method29504()) : Optional.empty();
    }
    
    public Optional<UUID> method13344(final Optional<UUID> optional) {
        return optional;
    }
}
