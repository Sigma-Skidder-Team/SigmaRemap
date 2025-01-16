// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8910
{
    private static final Logger field37453;
    private final Class6632 field37454;
    
    public Class8910(final Class7538<Class6632> class7538) {
        this.field37454 = class7538.method23618();
    }
    
    private Class3090 method31392(final int n) {
        final Class3090 class3090 = Registry.field217.method499(n);
        if (class3090 != null) {
            return class3090;
        }
        if (!Class9528.field41021) {
            Class8910.field37453.warn("Unknown biome id: ", (Object)n);
            return Class7102.field27632;
        }
        throw Class8349.method27859(new IllegalStateException("Unknown biome id: " + n));
    }
    
    public Class3090 method31393(final int n, final int n2) {
        return this.method31392(this.field37454.method20074(n, n2));
    }
    
    static {
        field37453 = LogManager.getLogger();
    }
}
