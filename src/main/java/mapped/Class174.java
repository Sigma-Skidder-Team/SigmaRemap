// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class174 implements Predicate<Class8321>
{
    private static String[] field498;
    private final Class3820 field499;
    private final Class51 field500;
    
    public Class174(final Class3820 field499, final Class51 field500) {
        this.field499 = field499;
        this.field500 = field500;
    }
    
    @Override
    public boolean test(final Class8321 class8321) {
        return class8321.method27622() == this.field499 && Class9346.method34642(this.field500, class8321.method27657(), true);
    }
}
