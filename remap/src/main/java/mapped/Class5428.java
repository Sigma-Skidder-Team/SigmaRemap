// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Objects;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5428 extends Class5419<Class787>
{
    private static String[] field22616;
    private final Class8233<Class363> field22617;
    private long field22618;
    private final int field22619;
    
    public Class5428(final Class8233<Class363> field22617, final int field22618) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10630, (Object)field22617, (Object)Class1952.field10628));
        this.field22617 = field22617;
        this.field22619 = field22618;
    }
    
    public boolean method16553(final Class1849 class1849, final Class787 class1850) {
        final Optional<Class363> method1198 = class1850.method2618().method1198(this.field22617);
        if (method1198.isPresent()) {
            if (Objects.equals(class1849.method6789().getType(), method1198.get().method1169())) {
                if (method1198.get().method1170().withinDistance(class1850.method1934(), this.field22619)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void method16554(final Class1849 class1849, final Class787 class1850, final long n) {
        if (n > this.field22618) {
            class1850.method2618().method1197(Class8233.field33809, Optional.ofNullable(Class7775.method24902(class1850, 8, 6)).map(class1851 -> new Class6949(class1851, 0.4f, 1)));
            this.field22618 = n + 180L;
        }
    }
}
