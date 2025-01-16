// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public enum Class2191
{
    field13325(p0 -> false), 
    field13326(IFluidState::method21780),
    field13327(class7099 -> !class7099.isEmpty());
    
    private final Predicate<IFluidState> field13328;
    
    private Class2191(final Predicate<IFluidState> field13328) {
        this.field13328 = field13328;
    }
    
    public boolean method8359(final IFluidState IFluidState) {
        return this.field13328.test(IFluidState);
    }
}
