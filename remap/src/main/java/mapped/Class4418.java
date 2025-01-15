// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public final class Class4418 implements Class4410<Optional<BlockPos>>
{
    private static String[] field19749;
    
    public void method13342(final Class8654 class8654, final Optional<BlockPos> optional) {
        class8654.writeBoolean(optional.isPresent());
        if (optional.isPresent()) {
            class8654.method29495(optional.get());
        }
    }
    
    public Optional<BlockPos> method13343(final Class8654 class8654) {
        return class8654.readBoolean() ? Optional.of(class8654.method29494()) : Optional.empty();
    }
    
    public Optional<BlockPos> method13344(final Optional<BlockPos> optional) {
        return optional;
    }
}
