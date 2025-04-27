// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5439 extends Class5419<Class824>
{
    private static String[] field22647;
    
    public Class5439() {
        super((Map)ImmutableMap.of((Object)Class8233.field33801, (Object)Class1952.field10629));
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        final Class8562 method4870 = class1850.method4870();
        if (method4870.method28781() != Class9334.field40060) {
            if (method4870.method28781() != Class9334.field40071) {
                if (class1850.method4821() == 0) {
                    return method4870.method28782() <= 1;
                }
            }
        }
        return false;
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        class1850.method4869(class1850.method4870().method28784(Class9334.field40060));
        class1850.method4856(class1849);
    }
}
