// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Random;

public class Class3909 extends Class3910 implements Class3872
{
    private static String[] field17715;
    
    public Class3909(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final Class354 class1856, final Class7096 class1857, final boolean b) {
        return class1855.method6701(class1856.method1137()).method21706();
    }
    
    @Override
    public boolean method11946(final Class1847 class1847, final Random random, final Class354 class1848, final Class7096 class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final Class354 class1850, final Class7096 class1851) {
        final Class354 method1137 = class1850.method1137();
        final Class7096 method1138 = Class7521.field29241.method11878();
        int i = 0;
    Label_0096_Outer:
        while (i < 128) {
            Class354 method1139 = method1137;
            int j = 0;
            while (true) {
                while (j < i / 16) {
                    method1139 = method1139.method1134(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                    if (class1849.method6701(method1139.method1139()).method21696() == this) {
                        if (!class1849.method6701(method1139).method21762(class1849, method1139)) {
                            ++j;
                            continue Label_0096_Outer;
                        }
                    }
                    ++i;
                    continue Label_0096_Outer;
                }
                final Class7096 method1140 = class1849.method6701(method1139);
                if (method1140.method21696() == method1138.method21696()) {
                    if (random.nextInt(10) == 0) {
                        ((Class3872)method1138.method21696()).method11947(class1849, random, method1139, method1140);
                    }
                }
                if (!method1140.method21706()) {
                    continue;
                }
                Class7096 method1141;
                if (random.nextInt(8) != 0) {
                    method1141 = method1138;
                }
                else {
                    final List<Class8530<?, ?>> method1142 = class1849.method6959(method1139).method9855();
                    if (method1142.isEmpty()) {
                        continue;
                    }
                    final Class8530<?, ?> field22060 = ((Class5114)method1142.get(0).field35805).field22060;
                    method1141 = ((Class4572)field22060.field35804).method13583(random, method1139, (FC)field22060.field35805);
                }
                if (!method1141.method21752(class1849, method1139)) {
                    continue;
                }
                class1849.method6688(method1139, method1141, 3);
                continue;
            }
        }
    }
}
