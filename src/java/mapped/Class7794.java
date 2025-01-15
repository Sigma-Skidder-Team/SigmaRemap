// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.UnaryOperator;
import java.nio.file.Path;

public class Class7794
{
    private static String[] field31937;
    private final Path field31938;
    private Class9277 field31939;
    
    public Class7794(final Path field31938) {
        this.field31938 = field31938;
        this.field31939 = Class9277.method34223(field31938);
    }
    
    public Class9277 method25121() {
        return this.field31939;
    }
    
    public void method25122() {
        this.field31939.method34229(this.field31938);
    }
    
    public Class7794 method25123(final UnaryOperator<Class9277> unaryOperator) {
        (this.field31939 = unaryOperator.apply(this.field31939)).method34229(this.field31938);
        return this;
    }
}
