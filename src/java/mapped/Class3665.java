// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class3665 extends Class3664
{
    public Class3665(final Class1932 class1932) {
        super(class1932, "", 3, 3, Class2265.method8508(Class120.field374, Class120.method618(Class7739.field31369), Class120.method618(Class7739.field31369), Class120.method618(Class7739.field31369), Class120.method618(Class7739.field31369), Class120.method618(Class7739.field31425), Class120.method618(Class7739.field31369), Class120.method618(Class7739.field31369), Class120.method618(Class7739.field31369), Class120.method618(Class7739.field31369)), new Class8321(Class7739.field31521));
    }
    
    @Override
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        if (!super.method11301(class473, class474)) {
            return false;
        }
        Class8321 field34174 = Class8321.field34174;
        for (int n = 0; n < class473.method2239() && field34174.method27620(); ++n) {
            final Class8321 method2157 = class473.method2157(n);
            if (method2157.method27622() == Class7739.field31425) {
                field34174 = method2157;
            }
        }
        if (!field34174.method27620()) {
            final Class6356 method2158 = Class4094.method12328(field34174, class474);
            return method2158 != null && !this.method11322(method2158) && method2158.field25425 < 4;
        }
        return false;
    }
    
    private boolean method11322(final Class6356 class6356) {
        if (class6356.field25431 != null) {
            for (final Class9323 class6357 : class6356.field25431.values()) {
                if (class6357.method34523() != Class2095.field12119 && class6357.method34523() != Class2095.field12120) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Class8321 method11303(final Class473 class473) {
        Class8321 field34174 = Class8321.field34174;
        for (int n = 0; n < class473.method2239() && field34174.method27620(); ++n) {
            final Class8321 method2157 = class473.method2157(n);
            if (method2157.method27622() == Class7739.field31425) {
                field34174 = method2157;
            }
        }
        final Class8321 method2158 = field34174.method27641();
        method2158.method27691(1);
        method2158.method27658().method298("map_scale_direction", 1);
        return method2158;
    }
    
    @Override
    public boolean method11295() {
        return true;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24738;
    }
}
