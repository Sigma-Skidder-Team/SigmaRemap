// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5438 extends Class5419<Class824>
{
    private static String[] field22645;
    private long field22646;
    
    public Class5438() {
        super((Map)ImmutableMap.of((Object)Class8233.field33801, (Object)Class1952.field10628, (Object)Class8233.field33810, (Object)Class1952.field10630));
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        if (class1849.method6754() - this.field22646 < 300L) {
            return false;
        }
        if (class1849.field10062.nextInt(2) == 0) {
            this.field22646 = class1849.method6754();
            final Class363 class1851 = class1850.method2618().method1198(Class8233.field33801).get();
            return Objects.equals(class1851.method1169(), class1849.method6789().method20487()) && class1851.method1170().method1082(class1850.method1934(), 1.73);
        }
        return false;
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class365<Class824> method2618 = class1850.method2618();
        method2618.method1196(Class8233.field33826, Class366.method1240(n));
        method2618.method1198(Class8233.field33801).ifPresent(class1852 -> class1851.method1196(Class8233.field33810, new Class6439(class1852.method1170())));
        class1850.method4868();
        if (class1850.method4864()) {
            class1850.method4861();
        }
    }
}
