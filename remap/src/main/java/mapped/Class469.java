// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import java.util.Collections;
import javax.annotation.Nullable;

public interface Class469
{
    void method2401(final Class3662<?> p0);
    
    @Nullable
    Class3662<?> method2402();
    
    default void method2403(final Class512 class512) {
        final Class3662<?> method2402 = this.method2402();
        if (method2402 != null) {
            if (!method2402.method11295()) {
                class512.method2862((Collection<Class3662<?>>)Collections.singleton(method2402));
                this.method2401(null);
            }
        }
    }
    
    default boolean method2416(final Class1847 class1847, final Class513 class1848, final Class3662<?> class1849) {
        if (!class1849.method11295()) {
            if (class1847.method6765().method31216(Class8878.field37335)) {
                if (!class1848.method2948().method19695(class1849)) {
                    return false;
                }
            }
        }
        this.method2401(class1849);
        return true;
    }
}
