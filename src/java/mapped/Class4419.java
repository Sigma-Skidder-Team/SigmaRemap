// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public final class Class4419 implements Class4410<Optional<Class2250>>
{
    private static String[] field19750;
    
    public void method13342(final Class8654 class8654, final Optional<Class2250> optional) {
        if (!optional.isPresent()) {
            class8654.writeBoolean(false);
        }
        else {
            class8654.writeBoolean(true);
            class8654.method29498(optional.get());
        }
    }
    
    public Optional<Class2250> method13343(final Class8654 class8654) {
        return class8654.readBoolean() ? Optional.of(class8654.method29497()) : Optional.empty();
    }
    
    public Optional<Class2250> method13344(final Optional<Class2250> optional) {
        return optional.isPresent() ? Optional.of(optional.get().method8466()) : Optional.empty();
    }
}
