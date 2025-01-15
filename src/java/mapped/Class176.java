// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class176 implements Predicate<Class8321>
{
    private static String[] field504;
    private final Class7909<Class3820> field505;
    private final Class51 field506;
    
    public Class176(final Class7909<Class3820> field505, final Class51 field506) {
        this.field505 = field505;
        this.field506 = field506;
    }
    
    @Override
    public boolean test(final Class8321 class8321) {
        return this.field505.method25618(class8321.method27622()) && Class9346.method34642(this.field506, class8321.method27657(), true);
    }
}
