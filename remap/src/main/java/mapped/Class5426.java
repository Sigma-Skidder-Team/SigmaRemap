// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5426 extends Class5419<Class759>
{
    private static String[] field22613;
    
    public Class5426(final int n, final int n2) {
        super((Map)ImmutableMap.of((Object)Class8233.field33810, (Object)Class1952.field10628), n, n2);
    }
    
    public boolean method16580(final Class1849 class1849, final Class759 class1850, final long n) {
        return class1850.method2618().method1198(Class8233.field33810).filter(class1852 -> class1852.method19206(class1851)).isPresent();
    }
    
    public void method16581(final Class1849 class1849, final Class759 class1850, final long n) {
        class1850.method2618().method1195(Class8233.field33810);
    }
    
    public void method16582(final Class1849 class1849, final Class759 class1850, final long n) {
        class1850.method2618().method1198(Class8233.field33810).ifPresent(class1852 -> class1851.method4147().method24666(class1852.method19205()));
    }
}
