// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class3980 extends Class3833
{
    private static final Class2259 field17974;
    public static final Class7115 field17975;
    public static final Class7702 field17976;
    
    public Class3980(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3980.field17975, Class179.field513));
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3980.field17975, class7074.method21644().method782());
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.field10067) {
            class7099.method2833(class7096.method21754(class7097, class7098));
            class7099.method2857(Class8276.field34053);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Nullable
    @Override
    public Class434 method11827(final Class7096 class7096, final Class1847 class7097, final Class354 class7098) {
        return new Class504((n, class1849, class1850) -> new Class3422(n, class1849, Class7318.method22434(class7097, class7098)), Class3980.field17974);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3980.field17976;
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3980.field17975, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3980.field17975)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3980.field17975)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3980.field17975);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17974 = new Class2259("container.stonecutter", new Object[0]);
        field17975 = Class3892.field17564;
        field17976 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
    }
}
