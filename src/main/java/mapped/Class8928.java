// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;
import java.util.Collection;

public class Class8928
{
    private final String field37528;
    private final Collection<Class6812> field37529;
    private final Consumer<Class1849> field37530;
    
    public Class8928(final String field37528, final Collection<Class6812> field37529, final Consumer<Class1849> field37530) {
        if (!field37529.isEmpty()) {
            this.field37528 = field37528;
            this.field37529 = field37529;
            this.field37530 = field37530;
            return;
        }
        throw new IllegalArgumentException("A GameTestBatch must include at least one TestFunction!");
    }
    
    public String method31483() {
        return this.field37528;
    }
    
    public Collection<Class6812> method31484() {
        return this.field37529;
    }
    
    public void method31485(final Class1849 class1849) {
        if (this.field37530 != null) {
            this.field37530.accept(class1849);
        }
    }
}
