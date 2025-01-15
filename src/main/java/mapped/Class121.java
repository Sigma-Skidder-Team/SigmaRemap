// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class121 implements Predicate<Class511>
{
    private static String[] field378;
    private final Class844 field379;
    
    public Class121(final Class844 field379) {
        this.field379 = field379;
    }
    
    @Override
    public boolean test(final Class511 class511) {
        if (class511 instanceof Class512 || class511 instanceof Class839) {
            if (class511.method1734(this.field379) > 9.0) {
                return true;
            }
        }
        return false;
    }
}
