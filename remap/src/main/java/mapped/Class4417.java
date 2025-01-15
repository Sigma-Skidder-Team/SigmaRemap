// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public final class Class4417 implements Class4410<Optional<BlockState>>
{
    private static String[] field19748;
    
    public void method13342(final PacketBuffer class8654, final Optional<BlockState> optional) {
        if (!optional.isPresent()) {
            class8654.writeVarInt(0);
        }
        else {
            class8654.writeVarInt(Class3833.method11774(optional.get()));
        }
    }
    
    public Optional<BlockState> method13343(final PacketBuffer class8654) {
        final int method29501 = class8654.readVarInt();
        return (method29501 != 0) ? Optional.of(Class3833.method11775(method29501)) : Optional.empty();
    }
    
    public Optional<BlockState> method13344(final Optional<BlockState> optional) {
        return optional;
    }
}
