// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;

public class Class4031 extends Class3833
{
    private static String[] field18126;
    public static final Class7112 field18127;
    private final Class3968 field18128;
    
    public Class4031(final Class3968 field18128, final Class9288 class9288) {
        super(class9288);
        this.field18128 = field18128;
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class4031.field18127, 0));
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final Class354 class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            final Class354 method1137 = class7098.method1137();
            if (class7097.method6961(method1137)) {
                if (method1137.method1075() < 256) {
                    final int intValue = class7096.method21772((Class7111<Integer>)Class4031.field18127);
                    if (intValue < 5) {
                        int n = 0;
                        boolean b = false;
                        final Class7096 method1138 = class7097.method6701(class7098.method1139());
                        final Class3833 method1139 = method1138.method21696();
                        if (method1139 != Class7521.field29403) {
                            if (method1139 != this.field18128) {
                                if (method1138.method21706()) {
                                    n = 1;
                                }
                            }
                            else {
                                int n2 = 1;
                                int i = 0;
                                while (i < 4) {
                                    final Class3833 method1140 = class7097.method6701(class7098.method1140(n2 + 1)).method21696();
                                    if (method1140 == this.field18128) {
                                        ++n2;
                                        ++i;
                                    }
                                    else {
                                        if (method1140 != Class7521.field29403) {
                                            break;
                                        }
                                        b = true;
                                        break;
                                    }
                                }
                                if (n2 < 2 || n2 <= random.nextInt(b ? 5 : 4)) {
                                    n = 1;
                                }
                            }
                        }
                        else {
                            n = 1;
                        }
                        if (n != 0) {
                            if (method12222(class7097, method1137, null)) {
                                if (class7097.method6961(class7098.method1138(2))) {
                                    class7097.method6688(class7098, this.field18128.method12106(class7097, class7098), 2);
                                    this.method12220(class7097, method1137, intValue);
                                    return;
                                }
                            }
                        }
                        if (intValue >= 4) {
                            this.method12221(class7097, class7098);
                        }
                        else {
                            int nextInt = random.nextInt(4);
                            if (b) {
                                ++nextInt;
                            }
                            int n3 = 0;
                            for (int j = 0; j < nextInt; ++j) {
                                final Class179 method1141 = Class98.field268.method576(random);
                                final Class354 method1142 = class7098.method1149(method1141);
                                if (class7097.method6961(method1142)) {
                                    if (class7097.method6961(method1142.method1139())) {
                                        if (method12222(class7097, method1142, method1141.method782())) {
                                            this.method12220(class7097, method1142, intValue + 1);
                                            n3 = 1;
                                        }
                                    }
                                }
                            }
                            if (n3 == 0) {
                                this.method12221(class7097, class7098);
                            }
                            else {
                                class7097.method6688(class7098, this.field18128.method12106(class7097, class7098), 2);
                            }
                        }
                    }
                }
            }
        }
        else {
            class7097.method7149(class7098, true);
        }
    }
    
    private void method12220(final Class1847 class1847, final Class354 class1848, final int i) {
        class1847.method6688(class1848, ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class4031.field18127, i), 2);
        class1847.method6955(1033, class1848, 0);
    }
    
    private void method12221(final Class1847 class1847, final Class354 class1848) {
        class1847.method6688(class1848, ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class4031.field18127, 5), 2);
        class1847.method6955(1034, class1848, 0);
    }
    
    private static boolean method12222(final Class1852 class1852, final Class354 class1853, final Class179 class1854) {
        for (final Class179 class1855 : Class98.field268) {
            if (class1855 != class1854 && !class1852.method6961(class1853.method1149(class1855))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7097 != Class179.field512) {
            if (!class7096.method21752(class7099, class7100)) {
                class7099.method6833().method21345(class7100, this, 1);
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        final Class7096 method6701 = class7097.method6701(class7098.method1139());
        final Class3833 method6702 = method6701.method21696();
        if (method6702 == this.field18128 || method6702 == Class7521.field29403) {
            return true;
        }
        if (method6701.method21706()) {
            boolean b = false;
            final Iterator<Class179> iterator = Class98.field268.iterator();
            while (iterator.hasNext()) {
                final Class7096 method6703 = class7097.method6701(class7098.method1149(iterator.next()));
                if (method6703.method21696() != this.field18128) {
                    if (method6703.method21706()) {
                        continue;
                    }
                    return false;
                }
                else {
                    if (b) {
                        return false;
                    }
                    b = true;
                }
            }
            return b;
        }
        return false;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class4031.field18127);
    }
    
    public static void method12223(final Class1851 class1851, final Class354 class1852, final Random random, final int n) {
        class1851.method6688(class1852, ((Class3968)Class7521.field29630).method12106(class1851, class1852), 2);
        method12224(class1851, class1852, random, class1852, n, 0);
    }
    
    private static void method12224(final Class1851 class1851, final Class354 class1852, final Random random, final Class354 class1853, final int n, final int n2) {
        final Class3968 class1854 = (Class3968)Class7521.field29630;
        int n3 = random.nextInt(4) + 1;
        if (n2 == 0) {
            ++n3;
        }
        for (int i = 0; i < n3; ++i) {
            final Class354 method1138 = class1852.method1138(i + 1);
            if (!method12222(class1851, method1138, null)) {
                return;
            }
            class1851.method6688(method1138, class1854.method12106(class1851, method1138), 2);
            class1851.method6688(method1138.method1139(), class1854.method12106(class1851, method1138.method1139()), 2);
        }
        int n4 = 0;
        if (n2 < 4) {
            int nextInt = random.nextInt(4);
            if (n2 == 0) {
                ++nextInt;
            }
            for (int j = 0; j < nextInt; ++j) {
                final Class179 method1139 = Class98.field268.method576(random);
                final Class354 method1140 = class1852.method1138(n3).method1149(method1139);
                if (Math.abs(method1140.method1074() - class1853.method1074()) < n) {
                    if (Math.abs(method1140.method1076() - class1853.method1076()) < n) {
                        if (class1851.method6961(method1140)) {
                            if (class1851.method6961(method1140.method1139())) {
                                if (method12222(class1851, method1140, method1139.method782())) {
                                    n4 = 1;
                                    class1851.method6688(method1140, class1854.method12106(class1851, method1140), 2);
                                    class1851.method6688(method1140.method1149(method1139.method782()), class1854.method12106(class1851, method1140.method1149(method1139.method782())), 2);
                                    method12224(class1851, method1140, random, class1853, n, n2 + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (n4 == 0) {
            class1851.method6688(class1852.method1138(n3), ((Class7097<O, Class7096>)Class7521.field29631.method11878()).method21773((Class7111<Comparable>)Class4031.field18127, 5), 2);
        }
    }
    
    @Override
    public void method11869(final Class1847 class1847, final Class7096 class1848, final Class7005 class1849, final Class399 class1850) {
        class1847.method6691(class1849.method21447(), true, class1850);
    }
    
    static {
        field18127 = Class8970.field37772;
    }
}
