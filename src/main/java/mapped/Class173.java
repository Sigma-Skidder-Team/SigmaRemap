// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public final class Class173 implements Predicate<Class759>
{
    private static String[] field497;
    
    @Override
    public boolean test(final Class759 class759) {
        return class759 != null && Class796.method4506().containsKey(class759.method1642());
    }
}
