// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class117 implements Predicate<Class7096>
{
    private static String[] field364;
    private final Block field365;
    
    public Class117(final Block field365) {
        this.field365 = field365;
    }
    
    public static Class117 method608(final Block class3833) {
        return new Class117(class3833);
    }
    
    @Override
    public boolean test(final Class7096 class7096) {
        return class7096 != null && class7096.method21696() == this.field365;
    }
}
