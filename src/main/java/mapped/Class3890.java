// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3890 extends Class3874 implements Class3872
{
    private static String[] field17519;
    public static final Class7702 field17557;
    
    public Class3890(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3890.field17557;
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final Class354 class1856, final Class7096 class1857, final boolean b) {
        return true;
    }
    
    @Override
    public boolean method11946(final Class1847 class1847, final Random random, final Class354 class1848, final Class7096 class1849) {
        return true;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final Class354 class1850, final Class7096 class1851) {
        final Class3870 class1852 = (Class3870)((this != Class7521.field29242) ? Class7521.field29553 : Class7521.field29554);
        if (class1852.method11878().method21752(class1849, class1850)) {
            if (class1849.method6961(class1850.method1137())) {
                class1852.method11944(class1849, class1850, 2);
            }
        }
    }
    
    @Override
    public Class2180 method11879() {
        return Class2180.field12915;
    }
    
    static {
        field17557 = Class3833.method11778(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);
    }
}
