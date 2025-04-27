// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public enum Class321
{
    field1903(p0 -> {}), 
    field1904(Class8841::method30873);
    
    private final Consumer<Class8841<?>> field1905;
    
    Class321(final Consumer<Class8841<?>> field1905) {
        this.field1905 = field1905;
    }
    
    public void method991(final Class8841<?> class8841) {
        this.field1905.accept(class8841);
    }
}
