// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import javax.annotation.Nullable;
import java.util.Map;

public class Class3862 extends Class3860
{
    private static String[] field17488;
    public static final Class7115 field17489;
    private static final Map<Class179, Class7702> field17490;
    
    public Class3862(final Class9288 class9288, final Class8289 class9289) {
        super(class9288, class9289);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3862.field17489, Class179.field513)).method21773((Class7111<Comparable>)Class3862.field17483, false));
    }
    
    @Override
    public String method11856() {
        return this.method11704().method11717();
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3862.field17490.get(class7096.method21772((Class7111<Object>)Class3862.field17489));
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        return class7097.method6701(class7098.method1149(class7096.method21772((Class7111<Class179>)Class3862.field17489).method782())).method21697().method26439();
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        Class7096 method11878 = this.method11878();
        final Class7099 method11879 = class7074.method21654().method6702(class7074.method21639());
        final Class1847 method11880 = class7074.method21654();
        final Class354 method11881 = class7074.method21639();
        for (final Class179 class7075 : class7074.method21643()) {
            if (class7075.method790().method601()) {
                method11878 = ((Class7097<Object, Class7096>)method11878).method21773((Class7111<Comparable>)Class3862.field17489, class7075.method782());
                if (method11878.method21752(method11880, method11881)) {
                    return ((Class7097<Object, Class7096>)method11878).method21773((Class7111<Comparable>)Class3862.field17483, method11879.method21779() == Class7558.field29976);
                }
            }
        }
        return null;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        return (class7097.method782() == class7096.method21772((Class7111<Class179>)Class3862.field17489) && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.method11878() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3862.field17489, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3862.field17489)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3862.field17489)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3862.field17489, Class3862.field17483);
    }
    
    static {
        field17489 = Class3892.field17564;
        field17490 = Maps.newEnumMap((Map)ImmutableMap.of((Object)Class179.field513, (Object)Class3833.method11778(0.0, 4.5, 14.0, 16.0, 12.5, 16.0), (Object)Class179.field514, (Object)Class3833.method11778(0.0, 4.5, 0.0, 16.0, 12.5, 2.0), (Object)Class179.field516, (Object)Class3833.method11778(0.0, 4.5, 0.0, 2.0, 12.5, 16.0), (Object)Class179.field515, (Object)Class3833.method11778(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)));
    }
}
