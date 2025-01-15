// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class Class5443 extends Class5419<Class511>
{
    private static String[] field22658;
    private final Predicate<Class511> field22659;
    private final float field22660;
    
    public Class5443(final Class1976 class1976, final float n) {
        this(class1978 -> class1977.equals(class1978.method1642().method23365()), n);
    }
    
    public Class5443(final Class7499<?> class7499, final float n) {
        this(class7501 -> class7500.equals(class7501.method1642()), n);
    }
    
    public Class5443(final Predicate<Class511> field22659, final float n) {
        super((Map)ImmutableMap.of((Object)Class8233.field33810, (Object)Class1952.field10629, (Object)Class8233.field33805, (Object)Class1952.field10628));
        this.field22659 = field22659;
        this.field22660 = n * n;
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final Class511 class1850) {
        return class1850.method2618().method1198(Class8233.field33805).get().stream().anyMatch(this.field22659);
    }
    
    @Override
    public void method16539(final Class1849 class1849, final Class511 class1850, final long n) {
        class1850.method2618().method1198(Class8233.field33805).ifPresent(list -> list.stream().filter(this.field22659).filter(class1852 -> class1852.method1734(class1851) <= this.field22660).findFirst().ifPresent(class1854 -> class1853.method1196(Class8233.field33810, new Class6440(class1854))));
    }
}
