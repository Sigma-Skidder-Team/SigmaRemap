// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5453 extends Class5419<Class824>
{
    private static String[] field22689;
    
    public Class5453() {
        super((Map)ImmutableMap.of());
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        boolean b = false;
        Label_0039: {
            if (!Class5429.method16587(class1850)) {
                if (!Class5429.method16586(class1850)) {
                    if (!method16641(class1850)) {
                        b = false;
                        break Label_0039;
                    }
                }
            }
            b = true;
        }
        if (!b) {
            class1850.method2618().method1195(Class8233.field33817);
            class1850.method2618().method1195(Class8233.field33818);
            class1850.method2618().method1205(class1849.method6755(), class1849.method6754());
        }
    }
    
    private static boolean method16641(final Class824 class824) {
        return class824.method2618().method1198(Class8233.field33818).filter(class826 -> class826.method1734(class825) <= 36.0).isPresent();
    }
}
