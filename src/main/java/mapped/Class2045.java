// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public enum Class2045
{
    field11650(Class377::method1257), 
    field11651(Class377::method1258), 
    field11652(p0 -> true);
    
    private final Predicate<? super Class377> field11653;
    
    private Class2045(final Predicate<? super Class377> field11653) {
        this.field11653 = field11653;
    }
    
    public Predicate<? super Class377> method8130() {
        return this.field11653;
    }
}
