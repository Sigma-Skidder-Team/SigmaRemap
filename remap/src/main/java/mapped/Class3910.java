// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public abstract class Class3910 extends Class3911
{
    public Class3910(final Class9288 class9288) {
        super(class9288);
    }
    
    private static boolean method12015(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1137 = class7098.method1137();
        final Class7096 method1138 = class7097.method6701(method1137);
        return (method1138.method21696() == Class7521.field29329 && method1138.method21772((Class7111<Integer>)Class4030.field18124) == 1) || Class1890.method7299(class7097, class7096, class7098, method1138, method1137, Direction.UP, method1138.method21700(class7097, method1137)) < class7097.method6985();
    }
    
    private static boolean method12016(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1137 = class7098.method1137();
        return method12015(class7096, class7097, class7098) && !class7097.method6702(method1137).method21793(Class7324.field28319);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (method12015(class7096, class7097, class7098)) {
            if (class7097.method6969(class7098.method1137()) >= 9) {
                final Class7096 method11878 = this.method11878();
                for (int i = 0; i < 4; ++i) {
                    final BlockPos method11879 = class7098.method1134(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (class7097.method6701(method11879).method21696() == Class7521.field29156) {
                        if (method12016(method11878, class7097, method11879)) {
                            class7097.method6692(method11879, ((Class7097<Object, Class7096>)method11878).method21773((Class7111<Comparable>)Class3910.field17717, class7097.method6701(method11879.method1137()).method21696() == Class7521.field29329));
                        }
                    }
                }
            }
        }
        else {
            class7097.method6692(class7098, Class7521.field29156.method11878());
        }
    }
}
