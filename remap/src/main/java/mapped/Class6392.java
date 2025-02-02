// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public final class Class6392 implements Class6389<Class475, Optional<INamedContainerProvider>>
{
    private static String[] field25507;
    
    public Optional<INamedContainerProvider> method19078(final Class475 class475, final Class475 class476) {
        return (Optional<INamedContainerProvider>)Optional.of(new Class503(this, class475, class476, new Class451(class475, class476)));
    }
    
    public Optional<INamedContainerProvider> method19079(final Class475 value) {
        return (Optional<INamedContainerProvider>)Optional.of(value);
    }
    
    public Optional<INamedContainerProvider> method19080() {
        return Optional.empty();
    }
}
