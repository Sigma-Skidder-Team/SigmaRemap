// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3863 extends Class3864<Class477> implements Class3856
{
    public static final Class7115 field17491;
    public static final Class7113 field17492;
    public static final Class7702 field17493;
    public static final Class2259 field17494;
    
    public Class3863(final Class9288 class9288) {
        super(class9288, () -> Class5412.field22544);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3863.field17491, Class179.field513)).method21773((Class7111<Comparable>)Class3863.field17492, false));
    }
    
    @Override
    public Class7191<? extends Class475> method11929(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final boolean b) {
        return Class6389::method19072;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3863.field17493;
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12306;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3863.field17491, class7074.method21644().method782())).method21773((Class7111<Comparable>)Class3863.field17492, class7074.method21654().method6702(class7074.method21639()).method21779() == Class7558.field29976);
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        final Class485 method2884 = class7099.method2884();
        final Class436 method2885 = class7097.method6727(class7098);
        if (method2884 == null || !(method2885 instanceof Class477)) {
            return Class2201.field13400;
        }
        final Class354 method2886 = class7098.method1137();
        if (class7097.method6701(method2886).method21713(class7097, method2886)) {
            return Class2201.field13400;
        }
        if (!class7097.field10067) {
            method2884.method2429((Class477)method2885);
            class7099.method2833(new Class504((n, class486, class487) -> Class3438.method10970(n, class486, method2884), Class3863.field17494));
            class7099.method2857(Class8276.field34038);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class477();
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Random random) {
        for (int i = 0; i < 3; ++i) {
            final int n = random.nextInt(2) * 2 - 1;
            final int n2 = random.nextInt(2) * 2 - 1;
            class7097.method6709(Class8432.field34637, class7098.method1074() + 0.5 + 0.25 * n, class7098.method1075() + random.nextFloat(), class7098.method1076() + 0.5 + 0.25 * n2, random.nextFloat() * n, (random.nextFloat() - 0.5) * 0.125, random.nextFloat() * n2);
        }
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3863.field17491, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3863.field17491)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3863.field17491)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3863.field17491, Class3863.field17492);
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3863.field17492) ? Class7558.field29976.method22177(false) : super.method11864(class7096);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3863.field17492)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17491 = Class3892.field17564;
        field17492 = Class8970.field37747;
        field17493 = Class3833.method11778(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
        field17494 = new Class2259("container.enderchest", new Object[0]);
    }
}
