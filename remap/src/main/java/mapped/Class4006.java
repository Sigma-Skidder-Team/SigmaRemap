// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.stream.Collector;
import javax.annotation.Nullable;
import java.util.Random;
import java.util.Iterator;
import java.util.Map;

public class Class4006 extends Class3833
{
    private static String[] field18054;
    public static final Class7113 field18055;
    public static final Class7113 field18056;
    public static final Class7113 field18057;
    public static final Class7113 field18058;
    public static final Class7113 field18059;
    public static final Map<Direction, Class7113> field18060;
    public static final Class7702 field18061;
    public static final Class7702 field18062;
    public static final Class7702 field18063;
    public static final Class7702 field18064;
    public static final Class7702 field18065;
    
    public Class4006(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class4006.field18055, false)).method21773((Class7111<Comparable>)Class4006.field18056, false)).method21773((Class7111<Comparable>)Class4006.field18057, false)).method21773((Class7111<Comparable>)Class4006.field18058, false)).method21773((Class7111<Comparable>)Class4006.field18059, false));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        Class7702 class7100 = Class7698.method24486();
        if (class7096.method21772((Class7111<Boolean>)Class4006.field18055)) {
            class7100 = Class7698.method24492(class7100, Class4006.field18061);
        }
        if (class7096.method21772((Class7111<Boolean>)Class4006.field18056)) {
            class7100 = Class7698.method24492(class7100, Class4006.field18064);
        }
        if (class7096.method21772((Class7111<Boolean>)Class4006.field18057)) {
            class7100 = Class7698.method24492(class7100, Class4006.field18063);
        }
        if (class7096.method21772((Class7111<Boolean>)Class4006.field18058)) {
            class7100 = Class7698.method24492(class7100, Class4006.field18065);
        }
        if (class7096.method21772((Class7111<Boolean>)Class4006.field18059)) {
            class7100 = Class7698.method24492(class7100, Class4006.field18062);
        }
        return class7100;
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        return this.method12173(this.method12177(class7096, class7097, class7098));
    }
    
    private boolean method12173(final Class7096 class7096) {
        return this.method12174(class7096) > 0;
    }
    
    private int method12174(final Class7096 class7096) {
        int n = 0;
        final Iterator<Class7113> iterator = Class4006.field18060.values().iterator();
        while (iterator.hasNext()) {
            if (!class7096.method21772((Class7111<Boolean>)iterator.next())) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    private boolean method12175(final Class1855 class1855, final BlockPos class1856, final Direction class1857) {
        if (class1857 == Direction.DOWN) {
            return false;
        }
        if (method12176(class1855, class1856.method1149(class1857), class1857)) {
            return true;
        }
        if (class1857.getAxis() != Axis.Y) {
            final Class7113 class1858 = Class4006.field18060.get(class1857);
            final Class7096 method6701 = class1855.method6701(class1856.method1137());
            return method6701.method21696() == this && method6701.method21772((Class7111<Boolean>)class1858);
        }
        return false;
    }
    
    public static boolean method12176(final Class1855 class1855, final BlockPos class1856, final Direction class1857) {
        return Class3833.method11815(class1855.method6701(class1856).method21727(class1855, class1856), class1857.getOpposite());
    }
    
    private Class7096 method12177(Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        final BlockPos method1137 = class7098.method1137();
        if (class7096.method21772((Class7111<Boolean>)Class4006.field18055)) {
            class7096 = (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class4006.field18055, method12176(class7097, method1137, Direction.DOWN));
        }
        Class7096 method1138 = null;
        for (final Direction class7099 : Plane.HORIZONTAL) {
            final Class7113 method1139 = method12181(class7099);
            if (!class7096.method21772((Class7111<Boolean>)method1139)) {
                continue;
            }
            boolean method1140 = this.method12175(class7097, class7098, class7099);
            if (!method1140) {
                if (method1138 == null) {
                    method1138 = class7097.method6701(method1137);
                }
                method1140 = (method1138.method21696() == this && method1138.method21772((Class7111<Boolean>)method1139));
            }
            class7096 = (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<T>)method1139, method1140);
        }
        return class7096;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 != Direction.DOWN) {
            final Class7096 method12177 = this.method12177(class7096, class7099, class7100);
            return this.method12173(method12177) ? method12177 : Class7521.field29147.method11878();
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        final Class7096 method12177 = this.method12177(class7096, class7097, class7098);
        if (method12177 == class7096) {
            if (class7097.field10062.nextInt(4) == 0) {
                final Direction method12178 = Direction.random(random);
                final BlockPos method12179 = class7098.method1137();
                if (method12178.getAxis().isHorizontal() && !class7096.method21772((Class7111<Boolean>)method12181(method12178))) {
                    if (this.method12180(class7097, class7098)) {
                        final BlockPos method12180 = class7098.method1149(method12178);
                        if (!class7097.method6701(method12180).method21706()) {
                            if (method12176(class7097, method12180, method12178)) {
                                class7097.method6688(class7098, (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)method12181(method12178), true), 2);
                            }
                        }
                        else {
                            final Direction method12181 = method12178.rotateY();
                            final Direction method12182 = method12178.method784();
                            final boolean booleanValue = class7096.method21772((Class7111<Boolean>)method12181(method12181));
                            final boolean booleanValue2 = class7096.method21772((Class7111<Boolean>)method12181(method12182));
                            final BlockPos method12183 = method12180.method1149(method12181);
                            final BlockPos method12184 = method12180.method1149(method12182);
                            if (booleanValue && method12176(class7097, method12183, method12181)) {
                                class7097.method6688(method12180, (Class7096)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)method12181(method12181), true), 2);
                            }
                            else if (booleanValue2 && method12176(class7097, method12184, method12182)) {
                                class7097.method6688(method12180, (Class7096)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)method12181(method12182), true), 2);
                            }
                            else {
                                final Direction method12185 = method12178.getOpposite();
                                if (booleanValue) {
                                    if (class7097.method6961(method12183)) {
                                        if (method12176(class7097, class7098.method1149(method12181), method12185)) {
                                            class7097.method6688(method12183, (Class7096)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)method12181(method12185), true), 2);
                                            return;
                                        }
                                    }
                                }
                                if (booleanValue2) {
                                    if (class7097.method6961(method12184)) {
                                        if (method12176(class7097, class7098.method1149(method12182), method12185)) {
                                            class7097.method6688(method12184, (Class7096)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)method12181(method12185), true), 2);
                                            return;
                                        }
                                    }
                                }
                                if (class7097.field10062.nextFloat() < 0.05) {
                                    if (method12176(class7097, method12180.method1137(), Direction.UP)) {
                                        class7097.method6688(method12180, ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class4006.field18055, true), 2);
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    if (method12178 == Direction.UP) {
                        if (class7098.getY() < 255) {
                            if (this.method12175(class7097, class7098, method12178)) {
                                class7097.method6688(class7098, ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class4006.field18055, true), 2);
                                return;
                            }
                            if (class7097.method6961(method12179)) {
                                if (this.method12180(class7097, class7098)) {
                                    Class7096 class7099 = class7096;
                                    for (final Direction class7100 : Plane.HORIZONTAL) {
                                        if (!random.nextBoolean() && method12176(class7097, method12179.method1149(class7100), Direction.UP)) {
                                            continue;
                                        }
                                        class7099 = ((Class7097<Object, Class7096>)class7099).method21773((Class7111<Comparable>)method12181(class7100), false);
                                    }
                                    if (this.method12179(class7099)) {
                                        class7097.method6688(method12179, class7099, 2);
                                    }
                                }
                                return;
                            }
                        }
                    }
                    if (class7098.getY() > 0) {
                        final BlockPos method12186 = class7098.method1139();
                        final Class7096 method12187 = class7097.method6701(method12186);
                        if (method12187.method21706() || method12187.method21696() == this) {
                            final Class7096 class7101 = method12187.method21706() ? this.method11878() : method12187;
                            final Class7096 method12188 = this.method12178(class7096, class7101, random);
                            if (class7101 != method12188) {
                                if (this.method12179(method12188)) {
                                    class7097.method6688(method12186, method12188, 2);
                                }
                            }
                        }
                    }
                }
            }
        }
        else if (!this.method12173(method12177)) {
            Class3833.method11836(class7096, class7097, class7098);
            class7097.method6690(class7098, false);
        }
        else {
            class7097.method6688(class7098, method12177, 2);
        }
    }
    
    private Class7096 method12178(final Class7096 class7096, Class7096 class7097, final Random random) {
        for (final Direction class7098 : Plane.HORIZONTAL) {
            if (!random.nextBoolean()) {
                continue;
            }
            final Class7113 method12181 = method12181(class7098);
            if (!class7096.method21772((Class7111<Boolean>)method12181)) {
                continue;
            }
            class7097 = (Class7096)((Class7097<Object, Object>)class7097).method21773((Class7111<T>)method12181, true);
        }
        return class7097;
    }
    
    private boolean method12179(final Class7096 class7096) {
        if (!class7096.method21772((Class7111<Boolean>)Class4006.field18056)) {
            if (!class7096.method21772((Class7111<Boolean>)Class4006.field18057)) {
                if (!class7096.method21772((Class7111<Boolean>)Class4006.field18058)) {
                    if (!class7096.method21772((Class7111<Boolean>)Class4006.field18059)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean method12180(final Class1855 class1855, final BlockPos class1856) {
        final Iterable<BlockPos> method1158 = BlockPos.method1158(class1856.getX() - 4, class1856.getY() - 1, class1856.getZ() - 4, class1856.getX() + 4, class1856.getY() + 1, class1856.getZ() + 4);
        int n = 5;
        final Iterator<BlockPos> iterator = method1158.iterator();
        while (iterator.hasNext()) {
            if (class1855.method6701(iterator.next()).method21696() == this && --n <= 0) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean method11798(final Class7096 class7096, final Class7074 class7097) {
        final Class7096 method6701 = class7097.method21654().method6701(class7097.method21639());
        if (method6701.method21696() != this) {
            return super.method11798(class7096, class7097);
        }
        return this.method12174(method6701) < Class4006.field18060.size();
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7096 method6701 = class7074.method21654().method6701(class7074.method21639());
        final boolean b = method6701.method21696() == this;
        final Class7096 class7075 = b ? method6701 : this.method11878();
        for (final Direction class7076 : class7074.method21643()) {
            if (class7076 != Direction.DOWN) {
                final Class7113 method6703 = method12181(class7076);
                if (!b || !((Class7097<O, Class7096>)method6701).method21772((Class7111<Boolean>)method6703)) {
                    if (this.method12175(class7074.method21654(), class7074.method21639(), class7076)) {
                        return ((Class7097<O, Class7096>)class7075).method21773((Class7111<T>)method6703, true);
                    }
                }
            }
        }
        return b ? class7075 : null;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class4006.field18055, Class4006.field18056, Class4006.field18057, Class4006.field18058, Class4006.field18059);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        switch (Class7414.field28554[class7097.ordinal()]) {
            case 1: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class4006.field18056, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18058))).method21773((Class7111<Comparable>)Class4006.field18057, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18059))).method21773((Class7111<Comparable>)Class4006.field18058, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18056))).method21773((Class7111<Comparable>)Class4006.field18059, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18057));
            }
            case 2: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class4006.field18056, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18057))).method21773((Class7111<Comparable>)Class4006.field18057, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18058))).method21773((Class7111<Comparable>)Class4006.field18058, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18059))).method21773((Class7111<Comparable>)Class4006.field18059, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18056));
            }
            case 3: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class4006.field18056, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18059))).method21773((Class7111<Comparable>)Class4006.field18057, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18056))).method21773((Class7111<Comparable>)Class4006.field18058, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18057))).method21773((Class7111<Comparable>)Class4006.field18059, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18058));
            }
            default: {
                return class7096;
            }
        }
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        switch (Class7414.field28555[class7097.ordinal()]) {
            case 1: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class4006.field18056, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18058))).method21773((Class7111<Comparable>)Class4006.field18058, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18056));
            }
            case 2: {
                return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class4006.field18057, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18059))).method21773((Class7111<Comparable>)Class4006.field18059, (Comparable)class7096.method21772((Class7111<V>)Class4006.field18057));
            }
            default: {
                return super.method11791(class7096, class7097);
            }
        }
    }
    
    public static Class7113 method12181(final Direction class179) {
        return Class4006.field18060.get(class179);
    }
    
    static {
        field18055 = Class3967.field17925;
        field18056 = Class3967.field17921;
        field18057 = Class3967.field17922;
        field18058 = Class3967.field17923;
        field18059 = Class3967.field17924;
        field18060 = Class3967.field17927.entrySet().stream().filter(entry -> entry.getKey() != Direction.DOWN).collect((Collector<? super Object, ?, Map<Direction, Class7113>>)Class8349.method27834());
        field18061 = Class3833.method11778(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
        field18062 = Class3833.method11778(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
        field18063 = Class3833.method11778(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        field18064 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
        field18065 = Class3833.method11778(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
    }
}
