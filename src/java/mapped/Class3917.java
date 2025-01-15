// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class3917 extends Class3833 implements Class3856
{
    private static String[] field17751;
    public static final Class7115 field17752;
    public static final Class7113 field17753;
    public static final Class7702 field17754;
    public static final Class7702 field17755;
    public static final Class7702 field17756;
    public static final Class7702 field17757;
    
    public Class3917(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3917.field17752, Class179.field513)).method21773((Class7111<Comparable>)Class3917.field17753, false));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        switch (Class9074.field38422[class7096.method21772((Class7111<Class179>)Class3917.field17752).ordinal()]) {
            case 1: {
                return Class3917.field17757;
            }
            case 2: {
                return Class3917.field17756;
            }
            case 3: {
                return Class3917.field17755;
            }
            default: {
                return Class3917.field17754;
            }
        }
    }
    
    private boolean method12029(final Class1855 class1855, final Class354 class1856, final Class179 class1857) {
        final Class7096 method6701 = class1855.method6701(class1856);
        return !method6701.method21714() && method6701.method21761(class1855, class1856, class1857);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        final Class179 class7099 = class7096.method21772((Class7111<Class179>)Class3917.field17752);
        return this.method12029(class7097, class7098.method1149(class7099.method782()), class7099);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7097.method782() == class7096.method21772((Class7111<Class179>)Class3917.field17752) && !class7096.method21752(class7099, class7100)) {
            return Class7521.field29147.method11878();
        }
        if (class7096.method21772((Class7111<Boolean>)Class3917.field17753)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        if (!class7074.method21641()) {
            final Class7096 method6701 = class7074.method21654().method6701(class7074.method21639().method1149(class7074.method21648().method782()));
            if (method6701.method21696() == this) {
                if (((Class7097<Object, Object>)method6701).method21772((Class7111<Comparable>)Class3917.field17752) == class7074.method21648()) {
                    return null;
                }
            }
        }
        Class7096 method6702 = this.method11878();
        final Class1847 method6703 = class7074.method21654();
        final Class354 method6704 = class7074.method21639();
        final Class7099 method6705 = class7074.method21654().method6702(class7074.method21639());
        for (final Class179 class7075 : class7074.method21643()) {
            if (class7075.method790().method601()) {
                method6702 = ((Class7097<Object, Class7096>)method6702).method21773((Class7111<Comparable>)Class3917.field17752, class7075.method782());
                if (method6702.method21752(method6703, method6704)) {
                    return ((Class7097<Object, Class7096>)method6702).method21773((Class7111<Comparable>)Class3917.field17753, method6705.method21779() == Class7558.field29976);
                }
            }
        }
        return null;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3917.field17752, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3917.field17752)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3917.field17752)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3917.field17752, Class3917.field17753);
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3917.field17753) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    static {
        field17752 = Class3892.field17564;
        field17753 = Class8970.field37747;
        field17754 = Class3833.method11778(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
        field17755 = Class3833.method11778(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        field17756 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
        field17757 = Class3833.method11778(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
    }
}
