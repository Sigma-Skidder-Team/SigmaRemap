// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Set;
import java.util.List;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class371 extends Class367
{
    public Class371() {
        super(Class7742.field31647);
    }
    
    public <T> Class371(final Dynamic<T> dynamic) {
        this();
    }
    
    @Override
    public void method1241(final Class1851 class1851, final Random random, final List<Class354> list, final List<Class354> list2, final Set<Class354> set, final Class6997 class1852) {
        list.forEach(class1855 -> {
            if (random2.nextInt(3) > 0) {
                class1855.method1145();
                final Class354 class1856;
                if (!(!Class4592.method13609(class1853, class1856))) {
                    this.method1242(class1853, class1856, Class4006.field18057, set2, class1854);
                }
            }
            if (random2.nextInt(3) > 0) {
                class1855.method1147();
                final Class354 class1857;
                if (!(!Class4592.method13609(class1853, class1857))) {
                    this.method1242(class1853, class1857, Class4006.field18059, set2, class1854);
                }
            }
            if (random2.nextInt(3) > 0) {
                class1855.method1141();
                final Class354 class1858;
                if (!(!Class4592.method13609(class1853, class1858))) {
                    this.method1242(class1853, class1858, Class4006.field18058, set2, class1854);
                }
            }
            if (random2.nextInt(3) > 0) {
                class1855.method1143();
                final Class354 class1859;
                if (!(!Class4592.method13609(class1853, class1859))) {
                    this.method1242(class1853, class1859, Class4006.field18056, set2, class1854);
                }
            }
        });
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Class90.field221.method503(this.field2209).toString())))).getValue();
    }
}
