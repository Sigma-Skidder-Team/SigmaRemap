// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;

public final class Class4955 extends Class4943<Class4955>
{
    private static String[] field21254;
    private final Function<Class122[], Class125> field21255;
    
    public Class4955(final Function<Class122[], Class125> field21255) {
        this.field21255 = field21255;
    }
    
    public Class4955 method14926() {
        return this;
    }
    
    @Override
    public Class125 method14888() {
        return this.field21255.apply(this.method14892());
    }
}
