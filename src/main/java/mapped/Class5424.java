// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5424 extends Class5419<Class824>
{
    private static String[] field22610;
    private final float field22611;
    
    public Class5424(final float field22611) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10630, (Object)Class8233.field33810, (Object)Class1952.field10630), Integer.MAX_VALUE);
        this.field22611 = field22611;
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        final Class512 method4823 = class1850.method4823();
        if (class1850.method1768()) {
            if (method4823 != null) {
                if (!class1850.method1706()) {
                    if (!class1850.field2408) {
                        if (class1850.method1734(method4823) <= 16.0) {
                            if (method4823.field3009 != null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method16560(final Class1849 class1849, final Class824 class1850, final long n) {
        return this.method16559(class1849, class1850);
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        this.method16571(class1850);
    }
    
    public void method16563(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class365<Class824> method2618 = class1850.method2618();
        method2618.method1195(Class8233.field33809);
        method2618.method1195(Class8233.field33810);
    }
    
    public void method16562(final Class1849 class1849, final Class824 class1850, final long n) {
        this.method16571(class1850);
    }
    
    @Override
    public boolean method16550(final long n) {
        return false;
    }
    
    private void method16571(final Class824 class824) {
        final Class6440 class825 = new Class6440(class824.method4823());
        final Class365<Class824> method2618 = class824.method2618();
        method2618.method1196(Class8233.field33809, new Class6949(class825, this.field22611, 2));
        method2618.method1196(Class8233.field33810, class825);
    }
}
