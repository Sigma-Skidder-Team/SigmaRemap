// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Objects;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5432 extends Class5419<Class787>
{
    private static String[] field22625;
    private final Class8233<Class363> field22626;
    private final int field22627;
    private final int field22628;
    private long field22629;
    
    public Class5432(final Class8233<Class363> field22626, final int field22627, final int field22628) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10630, (Object)field22626, (Object)Class1952.field10628));
        this.field22626 = field22626;
        this.field22627 = field22627;
        this.field22628 = field22628;
    }
    
    public boolean method16553(final Class1849 class1849, final Class787 class1850) {
        final Optional<Class363> method1198 = class1850.method2618().method1198(this.field22626);
        if (method1198.isPresent()) {
            if (Objects.equals(class1849.method6789().method20487(), method1198.get().method1169())) {
                if (method1198.get().method1170().withinDistance(class1850.method1934(), this.field22628)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void method16554(final Class1849 class1849, final Class787 class1850, final long n) {
        if (n > this.field22629) {
            class1850.method2618().method1198(this.field22626).ifPresent(class1852 -> class1851.method1196(Class8233.field33809, new Class6949(class1852.method1170(), 0.4f, this.field22627)));
            this.field22629 = n + 80L;
        }
    }
}
