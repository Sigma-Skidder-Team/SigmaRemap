// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5441 extends Class5419<Class824>
{
    private static String[] field22649;
    
    public Class5441() {
        super((Map)ImmutableMap.of((Object)Class8233.field33801, (Object)Class1952.field10628));
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        return class1850.method4870().method28781() == Class9334.field40060;
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class363 class1851 = class1850.method2618().method1198(Class8233.field33801).get();
        class1849.method6679().method1481(class1851.method1169()).method6921().method7210(class1851.method1170()).ifPresent(p2 -> Class90.field240.method509().filter(class1853 -> class1853.method34575() == class1852).findFirst().ifPresent(class1856 -> {
            class1854.method4869(class1854.method4870().method28784(class1856));
            class1854.method4856(class1855);
        }));
    }
}
