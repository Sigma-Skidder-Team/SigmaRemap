// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4019 extends Class4017
{
    private static String[] field18099;
    public static final Class7114<Class104> field18100;
    public static final Class7113 field18101;
    
    public Class4019(final Class9288 class9288) {
        super(true, class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773(Class4019.field18100, Class104.field311)).method21773((Class7111<Comparable>)Class4019.field18101, false));
    }
    
    public boolean method12210(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849, final boolean b, final int n) {
        if (n >= 8) {
            return false;
        }
        int method1074 = class1848.getX();
        int method1075 = class1848.getY();
        int method1076 = class1848.getZ();
        boolean b2 = true;
        Class104 class1850 = class1849.method21772(Class4019.field18100);
        switch (Class8913.field37487[class1850.ordinal()]) {
            case 1: {
                if (b) {
                    ++method1076;
                    break;
                }
                --method1076;
                break;
            }
            case 2: {
                if (b) {
                    --method1074;
                    break;
                }
                ++method1074;
                break;
            }
            case 3: {
                if (b) {
                    --method1074;
                }
                else {
                    ++method1074;
                    ++method1075;
                    b2 = false;
                }
                class1850 = Class104.field312;
                break;
            }
            case 4: {
                if (b) {
                    --method1074;
                    ++method1075;
                    b2 = false;
                }
                else {
                    ++method1074;
                }
                class1850 = Class104.field312;
                break;
            }
            case 5: {
                if (b) {
                    ++method1076;
                }
                else {
                    --method1076;
                    ++method1075;
                    b2 = false;
                }
                class1850 = Class104.field311;
                break;
            }
            case 6: {
                if (b) {
                    ++method1076;
                    ++method1075;
                    b2 = false;
                }
                else {
                    --method1076;
                }
                class1850 = Class104.field311;
                break;
            }
        }
        return this.method12211(class1847, new BlockPos(method1074, method1075, method1076), b, n, class1850) || (b2 && this.method12211(class1847, new BlockPos(method1074, method1075 - 1, method1076), b, n, class1850));
    }
    
    public boolean method12211(final Class1847 class1847, final BlockPos class1848, final boolean b, final int n, final Class104 class1849) {
        final Class7096 method6701 = class1847.method6701(class1848);
        if (method6701.method21696() == this) {
            final Class104 class1850 = method6701.method21772(Class4019.field18100);
            Label_0037: {
                if (class1849 == Class104.field312) {
                    if (class1850 != Class104.field311) {
                        if (class1850 != Class104.field315) {
                            if (class1850 != Class104.field316) {
                                break Label_0037;
                            }
                        }
                    }
                    return false;
                }
            }
            if (class1849 == Class104.field311) {
                if (class1850 != Class104.field312) {
                    if (class1850 != Class104.field313) {
                        if (class1850 != Class104.field314) {
                            return method6701.method21772((Class7111<Boolean>)Class4019.field18101) && (class1847.method6749(class1848) || this.method12210(class1847, class1848, method6701, b, n + 1));
                        }
                    }
                }
                return false;
            }
            return method6701.method21772((Class7111<Boolean>)Class4019.field18101) && (class1847.method6749(class1848) || this.method12210(class1847, class1848, method6701, b, n + 1));
        }
        return false;
    }
    
    @Override
    public void method12203(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class3833 class7099) {
        final boolean booleanValue = class7096.method21772((Class7111<Boolean>)Class4019.field18101);
        boolean b = false;
        Label_0065: {
            if (!class7097.method6749(class7098)) {
                if (!this.method12210(class7097, class7098, class7096, true, 0)) {
                    if (!this.method12210(class7097, class7098, class7096, false, 0)) {
                        b = false;
                        break Label_0065;
                    }
                }
            }
            b = true;
        }
        final boolean b2 = b;
        if (b2 != booleanValue) {
            class7097.method6688(class7098, (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class4019.field18101, b2), 3);
            class7097.method6696(class7098.method1139(), this);
            if (class7096.method21772(Class4019.field18100).method597()) {
                class7097.method6696(class7098.method1137(), this);
            }
        }
    }
    
    @Override
    public Class7111<Class104> method12205() {
        return Class4019.field18100;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        Label_0443: {
            switch (Class8913.field37488[class7097.ordinal()]) {
                case 1: {
                    switch (Class8913.field37487[class7096.method21772(Class4019.field18100).ordinal()]) {
                        case 3: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field314);
                        }
                        case 4: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field313);
                        }
                        case 5: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field316);
                        }
                        case 6: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field315);
                        }
                        case 7: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field319);
                        }
                        case 8: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field320);
                        }
                        case 9: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field317);
                        }
                        case 10: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field318);
                        }
                        default: {
                            break Label_0443;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (Class8913.field37487[class7096.method21772(Class4019.field18100).ordinal()]) {
                        case 1: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field312);
                        }
                        case 2: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field311);
                        }
                        case 3: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field315);
                        }
                        case 4: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field316);
                        }
                        case 5: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field314);
                        }
                        case 6: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field313);
                        }
                        case 7: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field320);
                        }
                        case 8: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field317);
                        }
                        case 9: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field318);
                        }
                        case 10: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field319);
                        }
                        default: {
                            break Label_0443;
                        }
                    }
                    break;
                }
                case 3: {
                    switch (Class8913.field37487[class7096.method21772(Class4019.field18100).ordinal()]) {
                        case 1: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field312);
                        }
                        case 2: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field311);
                        }
                        case 3: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field316);
                        }
                        case 4: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field315);
                        }
                        case 5: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field313);
                        }
                        case 6: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field314);
                        }
                        case 7: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field318);
                        }
                        case 8: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field319);
                        }
                        case 9: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field320);
                        }
                        case 10: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field317);
                        }
                        default: {
                            break Label_0443;
                        }
                    }
                    break;
                }
            }
        }
        return class7096;
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        final Class104 class7098 = class7096.method21772(Class4019.field18100);
        Label_0347: {
            switch (Class8913.field37489[class7097.ordinal()]) {
                case 1: {
                    switch (Class8913.field37487[class7098.ordinal()]) {
                        case 5: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field316);
                        }
                        case 6: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field315);
                        }
                        case 7: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field320);
                        }
                        case 8: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field319);
                        }
                        case 9: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field318);
                        }
                        case 10: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field317);
                        }
                        default: {
                            return super.method11791(class7096, class7097);
                        }
                    }
                    break;
                }
                case 2: {
                    switch (Class8913.field37487[class7098.ordinal()]) {
                        case 3: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field314);
                        }
                        case 4: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field313);
                        }
                        default: {
                            break Label_0347;
                        }
                        case 7: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field318);
                        }
                        case 8: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field317);
                        }
                        case 9: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field320);
                        }
                        case 10: {
                            return ((Class7097<O, Class7096>)class7096).method21773(Class4019.field18100, Class104.field319);
                        }
                    }
                    break;
                }
            }
        }
        return super.method11791(class7096, class7097);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class4019.field18100, Class4019.field18101);
    }
    
    static {
        field18100 = Class8970.field37768;
        field18101 = Class8970.field37741;
    }
}
