// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3889 extends Class3874 implements Class3872, Class3856
{
    private static String[] field17519;
    public static final Class7112 field17551;
    public static final Class7113 field17552;
    public static final Class7702 field17553;
    public static final Class7702 field17554;
    public static final Class7702 field17555;
    public static final Class7702 field17556;
    
    public Class3889(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3889.field17551, 1)).method21773((Class7111<Comparable>)Class3889.field17552, true));
    }
    
    @Override
    public int method11781(final Class7096 class7096) {
        return this.method11964(class7096) ? 0 : (super.method11781(class7096) + 3 * class7096.method21772((Class7111<Integer>)Class3889.field17551));
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7096 method6701 = class7074.method21654().method6701(class7074.method21639());
        if (method6701.method21696() != this) {
            final Class7099 method6702 = class7074.method21654().method6702(class7074.method21639());
            return (Class7096)((Class7097<Object, Object>)super.method11846(class7074)).method21773((Class7111<Comparable>)Class3889.field17552, method6702.method21793(Class7324.field28319) && method6702.method21784() == 8);
        }
        return ((Class7097<Object, Class7096>)method6701).method21773((Class7111<Comparable>)Class3889.field17551, Math.min(4, ((Class7097<Object, Class7096>)method6701).method21772((Class7111<Integer>)Class3889.field17551) + 1));
    }
    
    private boolean method11964(final Class7096 class7096) {
        return !class7096.method21772((Class7111<Boolean>)Class3889.field17552);
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return !class7096.method21727(class7097, class7098).method24551(Direction.UP).method24540();
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        return this.method11943(class7097.method6701(method1139), class7097, method1139);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21752(class7099, class7100)) {
            if (class7096.method21772((Class7111<Boolean>)Class3889.field17552)) {
                class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
            }
            return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        return Class7521.field29147.method11878();
    }
    
    @Override
    public boolean method11798(final Class7096 class7096, final Class7074 class7097) {
        return (class7097.method21651().method27622() == this.method11704() && class7096.method21772((Class7111<Integer>)Class3889.field17551) < 4) || super.method11798(class7096, class7097);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        switch (class7096.method21772((Class7111<Integer>)Class3889.field17551)) {
            default: {
                return Class3889.field17553;
            }
            case 2: {
                return Class3889.field17554;
            }
            case 3: {
                return Class3889.field17555;
            }
            case 4: {
                return Class3889.field17556;
            }
        }
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3889.field17552) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3889.field17551, Class3889.field17552);
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final boolean b) {
        return true;
    }
    
    @Override
    public boolean method11946(final Class1847 class1847, final Random random, final BlockPos class1848, final Class7096 class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final Class7096 class1851) {
        if (!this.method11964(class1851)) {
            if (class1849.method6701(class1850.method1139()).method21755(Class7188.field27921)) {
                int n = 1;
                int n2 = 0;
                final int n3 = class1850.getX() - 2;
                int n4 = 0;
                for (int i = 0; i < 5; ++i) {
                    for (int j = 0; j < n; ++j) {
                        for (int n5 = 2 + class1850.getY() - 1, k = n5 - 2; k < n5; ++k) {
                            final BlockPos class1852 = new BlockPos(n3 + i, k, class1850.getZ() - n4 + j);
                            if (class1852 != class1850) {
                                if (random.nextInt(6) == 0) {
                                    if (class1849.method6701(class1852).method21696() == Class7521.field29173) {
                                        if (class1849.method6701(class1852.method1139()).method21755(Class7188.field27921)) {
                                            class1849.method6688(class1852, ((Class7097<O, Class7096>)Class7521.field29757.method11878()).method21773((Class7111<Comparable>)Class3889.field17551, random.nextInt(4) + 1), 3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (n2 >= 2) {
                        n -= 2;
                        --n4;
                    }
                    else {
                        n += 2;
                        ++n4;
                    }
                    ++n2;
                }
                class1849.method6688(class1850, ((Class7097<O, Class7096>)class1851).method21773((Class7111<Comparable>)Class3889.field17551, 4), 2);
            }
        }
    }
    
    static {
        field17551 = Class8970.field37789;
        field17552 = Class8970.field37747;
        field17553 = Class3833.method11778(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
        field17554 = Class3833.method11778(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
        field17555 = Class3833.method11778(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
        field17556 = Class3833.method11778(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);
    }
}
