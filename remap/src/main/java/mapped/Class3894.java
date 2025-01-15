// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public class Class3894 extends Class3892 implements Class3856
{
    private static String[] field17566;
    public static final Class7113 field17567;
    public static final Class7114<Class109> field17568;
    public static final Class7113 field17569;
    public static final Class7113 field17570;
    public static final Class7702 field17571;
    public static final Class7702 field17572;
    public static final Class7702 field17573;
    public static final Class7702 field17574;
    public static final Class7702 field17575;
    public static final Class7702 field17576;
    
    public Class3894(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3894.field17564, Direction.NORTH)).method21773((Class7111<Comparable>)Class3894.field17567, false)).method21773(Class3894.field17568, Class109.field344)).method21773((Class7111<Comparable>)Class3894.field17569, false)).method21773((Class7111<Comparable>)Class3894.field17570, false));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        if (!class7096.method21772((Class7111<Boolean>)Class3894.field17567)) {
            return (class7096.method21772(Class3894.field17568) == Class109.field343) ? Class3894.field17576 : Class3894.field17575;
        }
        switch (Class8899.field37409[class7096.method21772((Class7111<Direction>)Class3894.field17564).ordinal()]) {
            default: {
                return Class3894.field17574;
            }
            case 2: {
                return Class3894.field17573;
            }
            case 3: {
                return Class3894.field17572;
            }
            case 4: {
                return Class3894.field17571;
            }
        }
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        switch (Class8899.field37410[class7099.ordinal()]) {
            case 1: {
                return class7096.method21772((Class7111<Boolean>)Class3894.field17567);
            }
            case 2: {
                return class7096.method21772((Class7111<Boolean>)Class3894.field17570);
            }
            case 3: {
                return class7096.method21772((Class7111<Boolean>)Class3894.field17567);
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public Class2201 method11844(Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (this.field17401 != Class8059.field33186) {
            class7096 = ((Class7097<O, Class7096>)class7096).method21768((Class7111<Comparable>)Class3894.field17567);
            class7097.method6688(class7098, class7096, 2);
            if (class7096.method21772((Class7111<Boolean>)Class3894.field17570)) {
                class7097.method6834().method21345(class7098, Class7558.field29976, Class7558.field29976.method22156(class7097));
            }
            this.method11965(class7099, class7097, class7098, class7096.method21772((Class7111<Boolean>)Class3894.field17567));
            return Class2201.field13400;
        }
        return Class2201.field13402;
    }
    
    public void method11965(final Class512 class512, final Class1847 class513, final BlockPos class514, final boolean b) {
        if (!b) {
            class513.method6839(class512, (this.field17401 != Class8059.field33186) ? 1013 : 1036, class514, 0);
        }
        else {
            class513.method6839(class512, (this.field17401 != Class8059.field33186) ? 1007 : 1037, class514, 0);
        }
    }
    
    @Override
    public void method11825(Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class3833 class7099, final BlockPos class7100, final boolean b) {
        if (!class7097.field10067) {
            final boolean method6749 = class7097.method6749(class7098);
            if (method6749 != class7096.method21772((Class7111<Boolean>)Class3894.field17569)) {
                if (class7096.method21772((Class7111<Boolean>)Class3894.field17567) != method6749) {
                    class7096 = (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3894.field17567, method6749);
                    this.method11965(null, class7097, class7098, method6749);
                }
                class7097.method6688(class7098, (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3894.field17569, method6749), 2);
                if (class7096.method21772((Class7111<Boolean>)Class3894.field17570)) {
                    class7097.method6834().method21345(class7098, Class7558.field29976, Class7558.field29976.method22156(class7097));
                }
            }
        }
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7096 method11878 = this.method11878();
        final Class7099 method11879 = class7074.method21654().method6702(class7074.method21639());
        final Direction method11880 = class7074.method21648();
        Class7096 class7075;
        if (!class7074.method21641() && method11880.getAxis().isHorizontal()) {
            class7075 = ((Class7097<O, Class7096>)((Class7097<Object, Class7096>)method11878).method21773((Class7111<Comparable>)Class3894.field17564, method11880)).method21773(Class3894.field17568, (class7074.method21649().field22771 - class7074.method21639().getY() <= 0.5) ? Class109.field344 : Class109.field343);
        }
        else {
            class7075 = ((Class7097<O, Class7096>)((Class7097<Object, Class7096>)method11878).method21773((Class7111<Comparable>)Class3894.field17564, class7074.method21644().getOpposite())).method21773(Class3894.field17568, (method11880 != Direction.UP) ? Class109.field343 : Class109.field344);
        }
        if (class7074.method21654().method6749(class7074.method21639())) {
            class7075 = (Class7096)((Class7097<Object, Object>)((Class7097<Object, Class7096>)class7075).method21773((Class7111<Comparable>)Class3894.field17567, true)).method21773((Class7111<Comparable>)Class3894.field17569, true);
        }
        return ((Class7097<Object, Class7096>)class7075).method21773((Class7111<Comparable>)Class3894.field17570, method11879.method21779() == Class7558.field29976);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3894.field17564, Class3894.field17567, Class3894.field17568, Class3894.field17569, Class3894.field17570);
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3894.field17570) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3894.field17570)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11779(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7499<?> class7099) {
        return false;
    }
    
    static {
        field17567 = Class8970.field37739;
        field17568 = Class8970.field37766;
        field17569 = Class8970.field37741;
        field17570 = Class8970.field37747;
        field17571 = Class3833.method11778(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
        field17572 = Class3833.method11778(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        field17573 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
        field17574 = Class3833.method11778(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
        field17575 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
        field17576 = Class3833.method11778(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
    }
}
