// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Optional;

public final class Class4419 implements Class4410<Optional<ITextComponent>>
{
    private static String[] field19750;
    
    public void method13342(final PacketBuffer class8654, final Optional<ITextComponent> optional) {
        if (!optional.isPresent()) {
            class8654.writeBoolean(false);
        }
        else {
            class8654.writeBoolean(true);
            class8654.method29498(optional.get());
        }
    }
    
    public Optional<ITextComponent> method13343(final PacketBuffer class8654) {
        return class8654.readBoolean() ? Optional.of(class8654.method29497()) : Optional.empty();
    }
    
    public Optional<ITextComponent> method13344(final Optional<ITextComponent> optional) {
        return optional.isPresent() ? Optional.of(optional.get().deepCopy()) : Optional.empty();
    }
}
