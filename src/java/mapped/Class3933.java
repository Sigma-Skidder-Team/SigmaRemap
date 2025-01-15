// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Class3933 extends Class3932
{
    private static String[] field17813;
    public static final Class7115 field17814;
    private static final Map<Class179, Class7702> field17815;
    
    public Class3933(final Class299 class299, final Class9288 class300) {
        super(class299, class300);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3933.field17814, Class179.field513));
    }
    
    @Override
    public String method11856() {
        return this.method11704().method11717();
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3933.field17815.get(class7096.method21772((Class7111<Object>)Class3933.field17814));
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        Class7096 method11878 = this.method11878();
        final Class1847 method11879 = class7074.method21654();
        final Class354 method11880 = class7074.method21639();
        for (final Class179 class7075 : class7074.method21643()) {
            if (class7075.method790().method601()) {
                method11878 = ((Class7097<Object, Class7096>)method11878).method21773((Class7111<Comparable>)Class3933.field17814, class7075.method782());
                if (!method11879.method6701(method11880.method1149(class7075)).method21750(class7074)) {
                    return method11878;
                }
            }
        }
        return null;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3933.field17814, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3933.field17814)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3933.field17814)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3933.field17814);
    }
    
    static {
        field17814 = Class3892.field17564;
        field17815 = Maps.newEnumMap((Map)ImmutableMap.of((Object)Class179.field513, (Object)Class3833.method11778(4.0, 4.0, 8.0, 12.0, 12.0, 16.0), (Object)Class179.field514, (Object)Class3833.method11778(4.0, 4.0, 0.0, 12.0, 12.0, 8.0), (Object)Class179.field516, (Object)Class3833.method11778(0.0, 4.0, 4.0, 8.0, 12.0, 12.0), (Object)Class179.field515, (Object)Class3833.method11778(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)));
    }
}
