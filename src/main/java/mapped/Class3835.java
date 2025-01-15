// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3835 extends Class3834
{
    private static String[] field17416;
    public static final Class7114<Class178> field17417;
    public static final Class7113 field17418;
    public static final Class7702 field17419;
    public static final Class7702 field17420;
    public static final Class7702 field17421;
    public static final Class7702 field17422;
    public static final Class7702 field17423;
    public static final Class7702 field17424;
    public static final Class7702 field17425;
    public static final Class7702 field17426;
    public static final Class7702 field17427;
    public static final Class7702 field17428;
    public static final Class7702 field17429;
    public static final Class7702 field17430;
    public static final Class7702 field17431;
    public static final Class7702 field17432;
    public static final Class7702 field17433;
    public static final Class7702 field17434;
    public static final Class7702 field17435;
    public static final Class7702 field17436;
    
    public Class3835(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3835.field17415, Class179.field513)).method21773(Class3835.field17417, Class178.field507)).method21773((Class7111<Comparable>)Class3835.field17418, false));
    }
    
    private Class7702 method11890(final Class7096 class7096) {
        switch (Class9565.field41155[class7096.method21772((Class7111<Class179>)Class3835.field17415).ordinal()]) {
            default: {
                return Class3835.field17424;
            }
            case 2: {
                return Class3835.field17423;
            }
            case 3: {
                return Class3835.field17422;
            }
            case 4: {
                return Class3835.field17421;
            }
            case 5: {
                return Class3835.field17420;
            }
            case 6: {
                return Class3835.field17419;
            }
        }
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class7698.method24492(this.method11890(class7096), this.method11891(class7096));
    }
    
    private Class7702 method11891(final Class7096 class7096) {
        final boolean booleanValue = class7096.method21772((Class7111<Boolean>)Class3835.field17418);
        switch (Class9565.field41155[class7096.method21772((Class7111<Class179>)Class3835.field17415).ordinal()]) {
            default: {
                return booleanValue ? Class3835.field17432 : Class3835.field17426;
            }
            case 2: {
                return booleanValue ? Class3835.field17431 : Class3835.field17425;
            }
            case 3: {
                return booleanValue ? Class3835.field17434 : Class3835.field17428;
            }
            case 4: {
                return booleanValue ? Class3835.field17433 : Class3835.field17427;
            }
            case 5: {
                return booleanValue ? Class3835.field17436 : Class3835.field17430;
            }
            case 6: {
                return booleanValue ? Class3835.field17435 : Class3835.field17429;
            }
        }
    }
    
    @Override
    public void method11870(final Class1847 class1847, final Class354 class1848, final Class7096 class1849, final Class512 class1850) {
        if (!class1847.field10067) {
            if (class1850.field3025.field27304) {
                final Class354 method1149 = class1848.method1149(class1849.method21772((Class7111<Class179>)Class3835.field17415).method782());
                final Class3833 method1150 = class1847.method6701(method1149).method21696();
                if (method1150 == Class7521.field29246 || method1150 == Class7521.field29239) {
                    class1847.method6690(method1149, false);
                }
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Override
    public void method11829(final Class7096 class7096, final Class1847 class7097, Class354 method1149, final Class7096 class7098, final boolean b) {
        if (class7096.method21696() != class7098.method21696()) {
            super.method11829(class7096, class7097, method1149, class7098, b);
            method1149 = method1149.method1149(class7096.method21772((Class7111<Class179>)Class3835.field17415).method782());
            final Class7096 method1150 = class7097.method6701(method1149);
            if (method1150.method21696() == Class7521.field29246 || method1150.method21696() == Class7521.field29239) {
                if (method1150.method21772((Class7111<Boolean>)Class3836.field17438)) {
                    Class3833.method11836(method1150, class7097, method1149);
                    class7097.method6690(method1149, false);
                }
            }
        }
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        return (class7097.method782() == class7096.method21772((Class7111<Class179>)Class3835.field17415) && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.method11878() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        final Class3833 method21696 = class7097.method6701(class7098.method1149(class7096.method21772((Class7111<Class179>)Class3835.field17415).method782())).method21696();
        if (method21696 != Class7521.field29246) {
            if (method21696 != Class7521.field29239) {
                if (method21696 != Class7521.field29264) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public void method11825(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class3833 class7099, final Class354 class7100, final boolean b) {
        if (class7096.method21752(class7097, class7098)) {
            final Class354 method1149 = class7098.method1149(class7096.method21772((Class7111<Class179>)Class3835.field17415).method782());
            class7097.method6701(method1149).method21734(class7097, method1149, class7099, class7100, false);
        }
    }
    
    @Override
    public Class8321 method11862(final Class1855 class1855, final Class354 class1856, final Class7096 class1857) {
        return new Class8321((class1857.method21772(Class3835.field17417) != Class178.field508) ? Class7521.field29246 : Class7521.field29239);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3835.field17415, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3835.field17415)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3835.field17415)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3835.field17415, Class3835.field17417, Class3835.field17418);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17417 = Class8970.field37799;
        field17418 = Class8970.field37742;
        field17419 = Class3833.method11778(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        field17420 = Class3833.method11778(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
        field17421 = Class3833.method11778(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
        field17422 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
        field17423 = Class3833.method11778(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
        field17424 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
        field17425 = Class3833.method11778(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
        field17426 = Class3833.method11778(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
        field17427 = Class3833.method11778(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
        field17428 = Class3833.method11778(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
        field17429 = Class3833.method11778(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
        field17430 = Class3833.method11778(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
        field17431 = Class3833.method11778(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
        field17432 = Class3833.method11778(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
        field17433 = Class3833.method11778(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
        field17434 = Class3833.method11778(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
        field17435 = Class3833.method11778(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
        field17436 = Class3833.method11778(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
    }
}
