// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5429 extends Class5419<Class824>
{
    private static String[] field22620;
    
    public Class5429() {
        super((Map)ImmutableMap.of());
    }
    
    public boolean method16560(final Class1849 class1849, final Class824 class1850, final long n) {
        return method16587(class1850) || method16586(class1850);
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        if (method16587(class1850) || method16586(class1850)) {
            final Class365<Class824> method2618 = class1850.method2618();
            if (!method2618.method1209(Class7635.field30232)) {
                method2618.method1195(Class8233.field33813);
                method2618.method1195(Class8233.field33809);
                method2618.method1195(Class8233.field33810);
                method2618.method1195(Class8233.field33812);
                method2618.method1195(Class8233.field33811);
            }
            method2618.method1204(Class7635.field30232);
        }
    }
    
    public void method16562(final Class1849 class1849, final Class824 class1850, final long n) {
        if (n % 100L == 0L) {
            class1850.method4891(n, 3);
        }
    }
    
    public static boolean method16586(final Class511 class511) {
        return class511.method2618().method1193(Class8233.field33819);
    }
    
    public static boolean method16587(final Class511 class511) {
        return class511.method2618().method1193(Class8233.field33817);
    }
}
