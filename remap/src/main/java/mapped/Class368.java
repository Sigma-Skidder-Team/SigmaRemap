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
import java.util.function.Supplier;
import com.mojang.datafixers.Dynamic;

public class Class368 extends Class367
{
    private final Class357 field2210;
    
    public Class368(final Class357 field2210) {
        super(Class7742.field31651);
        this.field2210 = field2210;
    }
    
    public <T> Class368(final Dynamic<T> dynamic) {
        this(Class90.field218.method505(new Class1932(dynamic.get("provider").get("type").asString().orElseThrow(RuntimeException::new))).method30718((Dynamic<?>)dynamic.get("provider").orElseEmptyMap()));
    }
    
    @Override
    public void method1241(final Class1851 class1851, final Random random, final List<Class354> list3, final List<Class354> list2, final Set<Class354> set, final Class6997 class1852) {
        list3.stream().filter(class1853 -> {
            list3.get(0).method1075();
            return class1853.method1075() == n;
        }).forEach(class1855 -> {
            this.method1244(class1854, random2, class1855.method1145().method1141());
            this.method1244(class1854, random2, class1855.method1148(2).method1141());
            this.method1244(class1854, random2, class1855.method1145().method1144(2));
            this.method1244(class1854, random2, class1855.method1148(2).method1144(2));
            int i = 0;
            while (i < 5) {
                random2.nextInt(64);
                Label_0146_2: {
                    final int n2;
                    final int n3;
                    if (n2 != 0) {
                        if (n2 != 7) {
                            if (n3 != 0) {
                                if (n3 != 7) {
                                    break Label_0146_2;
                                }
                            }
                        }
                    }
                    this.method1244(class1854, random2, class1855.method1134(-3 + n2, 0, -3 + n3));
                }
                ++i;
            }
        });
    }
    
    private void method1244(final Class1875 class1875, final Random random, final Class354 class1876) {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (Math.abs(i) != 2 || Math.abs(j) != 2) {
                    this.method1245(class1875, random, class1876.method1134(i, 0, j));
                }
            }
        }
    }
    
    private void method1245(final Class1875 class1875, final Random random, final Class354 class1876) {
        for (int i = 2; i >= -3; --i) {
            final Class354 method1138 = class1876.method1138(i);
            if (Class4592.method13614(class1875, method1138)) {
                class1875.method6688(method1138, this.field2210.method1164(random, class1876), 19);
                break;
            }
            if (!Class4592.method13609(class1875, method1138) && i < 0) {
                break;
            }
        }
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Class90.field221.method503(this.field2209).toString()), dynamicOps.createString("provider"), this.field2210.method1123((com.mojang.datafixers.types.DynamicOps<Object>)dynamicOps)))).getValue();
    }
}
