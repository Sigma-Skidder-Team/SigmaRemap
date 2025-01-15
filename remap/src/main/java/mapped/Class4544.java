// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4544 extends Class4535<Class5122>
{
    public Class4544(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final BlockPos class1853, final Class5122 class1854) {
        int n = 0;
        BlockPos method1137 = new BlockPos(class1853.getX(), class1851.method6699(Class2020.field11524, class1853.getX(), class1853.getZ()), class1853.getZ());
        if (class1851.method6701(method1137).method21696() == Class7521.field29173) {
            final Class7096 method1138 = Class7521.field29713.method11878();
            final Class7096 method1139 = Class7521.field29714.method11878();
            for (int n2 = 1 + random.nextInt(10), i = 0; i <= n2; ++i) {
                Label_0134: {
                    if (class1851.method6701(method1137).method21696() == Class7521.field29173) {
                        if (class1851.method6701(method1137.method1137()).method21696() == Class7521.field29173) {
                            if (method1139.method21752(class1851, method1137)) {
                                if (i != n2) {
                                    class1851.method6688(method1137, method1139, 2);
                                    break Label_0134;
                                }
                                class1851.method6688(method1137, ((Class7097<Object, Class7096>)method1138).method21773((Class7111<Comparable>)Class3915.field17729, random.nextInt(4) + 20), 2);
                                ++n;
                                break Label_0134;
                            }
                        }
                    }
                    if (i > 0) {
                        final BlockPos method1140 = method1137.method1139();
                        if (!method1138.method21752(class1851, method1140)) {
                            break;
                        }
                        if (class1851.method6701(method1140.method1139()).method21696() == Class7521.field29713) {
                            break;
                        }
                        class1851.method6688(method1140, ((Class7097<Object, Class7096>)method1138).method21773((Class7111<Comparable>)Class3915.field17729, random.nextInt(4) + 20), 2);
                        ++n;
                        break;
                    }
                }
                method1137 = method1137.method1137();
            }
        }
        return n > 0;
    }
}
