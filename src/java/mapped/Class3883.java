// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3883 extends Class3882
{
    private static String[] field17540;
    
    public Class3883(final Class5328 class5328, final Class9288 class5329) {
        super(class5328, 8, class5329);
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final Class354 class7098) {
        final Class3833 method21696 = class7096.method21696();
        if (!super.method11943(class7096, class7097, class7098)) {
            if (method21696 != Class7521.field29338) {
                if (method21696 != Class7521.field29339) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Random random) {
        final Class5487 method18517 = this.method11808(class7096, class7097, class7098, Class7543.method23629()).method24537().method18517();
        final double n = class7098.method1074() + method18517.field22770;
        final double n2 = class7098.method1076() + method18517.field22772;
        for (int i = 0; i < 3; ++i) {
            if (random.nextBoolean()) {
                class7097.method6709(Class8432.field34639, n + random.nextFloat() / 5.0f, class7098.method1075() + (0.5 - random.nextFloat()), n2 + random.nextFloat() / 5.0f, 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public void method11850(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class399 class7099) {
        if (!class7097.field10067) {
            if (class7097.method6954() != Class2113.field12290) {
                if (class7099 instanceof Class511) {
                    final Class511 class7100 = (Class511)class7099;
                    if (!class7100.method1849(Class7929.field32577)) {
                        class7100.method2655(new Class1948(Class9439.field40493, 40));
                    }
                }
            }
        }
    }
}
