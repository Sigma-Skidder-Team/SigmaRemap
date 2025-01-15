// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Objects;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.List;

public class Class5459 extends Class5419<Class824>
{
    private static String[] field22704;
    private final Class8233<List<Class363>> field22705;
    private final Class8233<Class363> field22706;
    private final float field22707;
    private final int field22708;
    private final int field22709;
    private long field22710;
    private Class363 field22711;
    
    public Class5459(final Class8233<List<Class363>> field22705, final float field22706, final int field22707, final int field22708, final Class8233<Class363> field22709) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10630, (Object)field22705, (Object)Class1952.field10628, (Object)field22709, (Object)Class1952.field10628));
        this.field22705 = field22705;
        this.field22707 = field22706;
        this.field22708 = field22707;
        this.field22709 = field22708;
        this.field22706 = field22709;
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        final Optional<List<Class363>> method1198 = class1850.method2618().method1198(this.field22705);
        final Optional<Class363> method1199 = class1850.method2618().method1198(this.field22706);
        if (method1198.isPresent()) {
            if (method1199.isPresent()) {
                final List list = method1198.get();
                if (!list.isEmpty()) {
                    this.field22711 = (Class363)list.get(class1849.method6790().nextInt(list.size()));
                    if (this.field22711 != null) {
                        if (Objects.equals(class1849.method6789().getType(), this.field22711.method1169())) {
                            if (method1199.get().method1170().withinDistance(class1850.method1934(), this.field22709)) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        if (n > this.field22710) {
            if (this.field22711 != null) {
                class1850.method2618().method1196(Class8233.field33809, new Class6949(this.field22711.method1170(), this.field22707, this.field22708));
                this.field22710 = n + 100L;
            }
        }
    }
}
