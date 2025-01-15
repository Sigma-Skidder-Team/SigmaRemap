// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5463 extends Class5419<Class824>
{
    private static String[] field22721;
    private final float field22722;
    private final int field22723;
    
    public Class5463(final float field22722, final int field22723) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10629));
        this.field22722 = field22722;
        this.field22723 = field22723;
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        return !class1849.method6922(new BlockPos(class1850));
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        final Class1883 method6921 = class1849.method6921();
        final int method6922 = method6921.method7211(Class353.method1089(new BlockPos(class1850)));
        Vec3d class1851 = null;
        for (int i = 0; i < 5; ++i) {
            final Vec3d method6923 = Class7775.method24903(class1850, 15, 7, class1853 -> -class1852.method6925(Class353.method1089(class1853)));
            if (method6923 != null) {
                final int method6924 = method6921.method7211(Class353.method1089(new BlockPos(method6923)));
                if (method6924 < method6922) {
                    class1851 = method6923;
                    break;
                }
                if (method6924 == method6922) {
                    class1851 = method6923;
                }
            }
        }
        if (class1851 != null) {
            class1850.method2618().method1196(Class8233.field33809, new Class6949(class1851, this.field22722, this.field22723));
        }
    }
}
