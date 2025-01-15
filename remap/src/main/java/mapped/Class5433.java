// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5433 extends Class5419<Class511>
{
    private static String[] field22630;
    
    public Class5433() {
        super((Map)ImmutableMap.of());
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final Class511 class1850) {
        return class1849.field10062.nextInt(20) == 0;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final Class511 class1850, final long n) {
        final Class365<?> method2618 = class1850.method2618();
        final Class8792 method2619 = class1849.method6927(new Class354(class1850));
        if (method2619 != null) {
            if (!method2619.method30621()) {
                if (!method2619.method30623()) {
                    return;
                }
            }
        }
        method2618.method1206(Class7635.field30227);
        method2618.method1205(class1849.method6755(), class1849.method6754());
    }
}
