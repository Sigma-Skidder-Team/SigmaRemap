// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class Class3960 extends Class3841
{
    private static String[] field17897;
    public static final Class7115 field17898;
    public static final Class7114<Class178> field17899;
    
    public Class3960(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3960.field17898, Class179.field513)).method21773(Class3960.field17899, Class178.field507));
    }
    
    @Nullable
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return null;
    }
    
    public static Class436 method12080(final Class7096 class7096, final Class179 class7097, final boolean b, final boolean b2) {
        return new Class491(class7096, class7097, b, b2);
    }
    
    @Override
    public void method11829(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class491) {
                ((Class491)method6727).method2482();
            }
        }
    }
    
    @Override
    public void method11824(final Class1851 class1851, final Class354 class1852, final Class7096 class1853) {
        final Class354 method1149 = class1852.method1149(class1853.method21772((Class7111<Class179>)Class3960.field17898).method782());
        final Class7096 method1150 = class1851.method6701(method1149);
        if (method1150.method21696() instanceof Class3836) {
            if (method1150.method21772((Class7111<Boolean>)Class3836.field17438)) {
                class1851.method6690(method1149, false);
            }
        }
    }
    
    @Override
    public boolean method11793(final Class7096 class7096, final Class1855 class7097, final Class354 class7098) {
        return false;
    }
    
    @Override
    public boolean method11794(final Class7096 class7096, final Class1855 class7097, final Class354 class7098) {
        return false;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.field10067 && class7097.method6727(class7098) == null) {
            class7097.method6690(class7098, false);
            return Class2201.field13401;
        }
        return Class2201.field13402;
    }
    
    @Override
    public List<Class8321> method11833(final Class7096 class7096, final Class9098 class7097) {
        final Class491 method12081 = this.method12081(class7097.method32880(), class7097.method32881(Class6683.field26367));
        return (method12081 != null) ? method12081.method2481().method21743(class7097) : Collections.emptyList();
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class7698.method24486();
    }
    
    @Override
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        final Class491 method12081 = this.method12081(class7097, class7098);
        return (method12081 == null) ? Class7698.method24486() : method12081.method2483(class7097, class7098);
    }
    
    @Nullable
    private Class491 method12081(final Class1855 class1855, final Class354 class1856) {
        final Class436 method6727 = class1855.method6727(class1856);
        return (method6727 instanceof Class491) ? ((Class491)method6727) : null;
    }
    
    @Override
    public Class8321 method11862(final Class1855 class1855, final Class354 class1856, final Class7096 class1857) {
        return Class8321.field34174;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3960.field17898, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3960.field17898)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3960.field17898)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3960.field17898, Class3960.field17899);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17898 = Class3835.field17415;
        field17899 = Class3835.field17417;
    }
}
