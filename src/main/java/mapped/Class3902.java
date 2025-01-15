// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class3902 extends Class3892
{
    private static String[] field17617;
    public static final Class7114<Class107> field17618;
    
    public Class3902(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        return method12002(class7097, class7098, method12003(class7096).method782());
    }
    
    public static boolean method12002(final Class1852 class1852, final Class354 class1853, final Class179 class1854) {
        final Class354 method1149 = class1853.method1149(class1854);
        return class1852.method6701(method1149).method21761(class1852, method1149, class1854.method782());
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        for (final Class179 class7075 : class7074.method21643()) {
            Class7096 class7076;
            if (class7075.method790() != Class111.field352) {
                class7076 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773(Class3902.field17618, Class107.field333)).method21773((Class7111<Comparable>)Class3902.field17564, class7075.method782());
            }
            else {
                class7076 = ((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773(Class3902.field17618, (class7075 != Class179.field512) ? Class107.field332 : Class107.field334)).method21773((Class7111<Comparable>)Class3902.field17564, class7074.method21644());
            }
            if (class7076.method21752(class7074.method21654(), class7074.method21639())) {
                return class7076;
            }
        }
        return null;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        return (method12003(class7096).method782() == class7097 && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.method11878() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    public static Class179 method12003(final Class7096 class7096) {
        switch (Class9247.field39656[class7096.method21772(Class3902.field17618).ordinal()]) {
            case 1: {
                return Class179.field511;
            }
            case 2: {
                return Class179.field512;
            }
            default: {
                return class7096.method21772((Class7111<Class179>)Class3902.field17564);
            }
        }
    }
    
    static {
        field17618 = Class8970.field37759;
    }
}
