// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class369 extends Class367
{
    private final float field2211;
    
    public Class369(final float field2211) {
        super(Class7742.field31649);
        this.field2211 = field2211;
    }
    
    public <T> Class369(final Dynamic<T> dynamic) {
        this(dynamic.get("probability").asFloat(0.0f));
    }
    
    @Override
    public void method1241(final Class1851 class1851, final Random random, final List<Class354> list3, final List<Class354> list2, final Set<Class354> set, final Class6997 class1852) {
        if (random.nextFloat() < this.field2211) {
            list3.stream().filter(class1853 -> {
                list3.get(0).method1075();
                return class1853.method1075() - n <= 2;
            }).forEach(class1856 -> {
                Class98.field268.iterator();
                final Iterator iterator;
                while (iterator.hasNext()) {
                    final Class179 class1857 = iterator.next();
                    if (random2.nextFloat() > 0.25f) {
                        continue;
                    }
                    else {
                        class1857.method782();
                        final Class179 class1858;
                        class1856.method1134(class1858.method785(), 0, class1858.method787());
                        final Class354 class1859;
                        if (!Class4592.method13609(class1854, class1859)) {
                            continue;
                        }
                        else {
                            this.method1243(class1854, class1859, (Class7096)((Class7097<Object, Object>)((Class7097<O, Class7096>)Class7521.field29406.method11878()).method21773((Class7111<Comparable>)Class3891.field17559, random2.nextInt(3))).method21773((Class7111<Comparable>)Class3891.field17564, class1857), set2, class1855);
                        }
                    }
                }
            });
        }
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Class90.field221.method503(this.field2209).toString()), dynamicOps.createString("probability"), dynamicOps.createFloat(this.field2211)))).getValue();
    }
}
