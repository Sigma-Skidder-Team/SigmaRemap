// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;

public final class Class6390 implements Class6389<Class475, Optional<IInventory>>
{
    private static String[] field25504;
    
    public Optional<IInventory> method19078(final Class475 class475, final Class475 class476) {
        return (Optional<IInventory>)Optional.of(new Class451(class475, class476));
    }
    
    public Optional<IInventory> method19079(final Class475 value) {
        return (Optional<IInventory>)Optional.of(value);
    }
    
    public Optional<IInventory> method19080() {
        return Optional.empty();
    }
}
