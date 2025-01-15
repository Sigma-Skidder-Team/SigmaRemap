// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class3870 extends Class3874
{
    private static String[] field17512;
    public static final Class7114<Class182> field17513;
    
    public Class3870(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773(Class3870.field17513, Class182.field565));
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        final Class182 class7102 = class7096.method21772(Class3870.field17513);
        if (class7097.method790() == Class111.field352) {
            if (class7102 == Class182.field565 == (class7097 == Class179.field512)) {
                if (class7098.method21696() != this || class7098.method21772(Class3870.field17513) == class7102) {
                    return Class7521.field29147.method11878();
                }
            }
        }
        if (class7102 == Class182.field565) {
            if (class7097 == Class179.field511) {
                if (!class7096.method21752(class7099, class7100)) {
                    return Class7521.field29147.method11878();
                }
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class354 method21639 = class7074.method21639();
        return (method21639.method1075() < 255 && class7074.method21654().method6701(method21639.method1137()).method21750(class7074)) ? super.method11846(class7074) : null;
    }
    
    @Override
    public void method11853(final Class1847 class1847, final Class354 class1848, final Class7096 class1849, final Class511 class1850, final Class8321 class1851) {
        class1847.method6688(class1848.method1137(), ((Class7097<O, Class7096>)this.method11878()).method21773(Class3870.field17513, Class182.field564), 3);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        if (class7096.method21772(Class3870.field17513) == Class182.field564) {
            final Class7096 method6701 = class7097.method6701(class7098.method1139());
            return method6701.method21696() == this && method6701.method21772(Class3870.field17513) == Class182.field565;
        }
        return super.method11843(class7096, class7097, class7098);
    }
    
    public void method11944(final Class1851 class1851, final Class354 class1852, final int n) {
        class1851.method6688(class1852, ((Class7097<O, Class7096>)this.method11878()).method21773(Class3870.field17513, Class182.field565), n);
        class1851.method6688(class1852.method1137(), ((Class7097<O, Class7096>)this.method11878()).method21773(Class3870.field17513, Class182.field564), n);
    }
    
    @Override
    public void method11852(final Class1847 class1847, final Class512 class1848, final Class354 class1849, final Class7096 class1850, final Class436 class1851, final Class8321 class1852) {
        super.method11852(class1847, class1848, class1849, Class7521.field29147.method11878(), class1851, class1852);
    }
    
    @Override
    public void method11870(final Class1847 class1847, final Class354 class1848, final Class7096 class1849, final Class512 class1850) {
        final Class182 class1851 = class1849.method21772(Class3870.field17513);
        final Class354 class1852 = (class1851 != Class182.field565) ? class1848.method1139() : class1848.method1137();
        final Class7096 method6701 = class1847.method6701(class1852);
        if (method6701.method21696() == this) {
            if (method6701.method21772(Class3870.field17513) != class1851) {
                class1847.method6688(class1852, Class7521.field29147.method11878(), 35);
                class1847.method6839(class1850, 2001, class1852, Class3833.method11774(method6701));
                if (!class1847.field10067) {
                    if (!class1850.method2889()) {
                        Class3833.method11838(class1849, class1847, class1848, null, class1850, class1850.method2713());
                        Class3833.method11838(method6701, class1847, class1852, null, class1850, class1850.method2713());
                    }
                }
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3870.field17513);
    }
    
    @Override
    public Class2180 method11879() {
        return Class2180.field12914;
    }
    
    @Override
    public long method11868(final Class7096 class7096, final Class354 class7097) {
        return Class9546.method35689(class7097.method1074(), class7097.method1140((class7096.method21772(Class3870.field17513) != Class182.field565) ? 1 : 0).method1075(), class7097.method1076());
    }
    
    static {
        field17513 = Class8970.field37765;
    }
}
