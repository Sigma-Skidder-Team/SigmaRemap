// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3526 extends Class3446
{
    private static String[] field16537;
    private final Class759 field16538;
    private Class511 field16539;
    private final float field16540;
    
    public Class3526(final Class759 field16538, final float field16539) {
        this.field16538 = field16538;
        this.field16540 = field16539;
        this.method11019(EnumSet.of(Class2139.field12582, Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16538.method1806()) {
            return false;
        }
        this.field16539 = this.field16538.method4152();
        if (this.field16539 != null) {
            final double method1734 = this.field16538.method1734(this.field16539);
            return method1734 >= 4.0 && method1734 <= 16.0 && this.field16538.field2404 && this.field16538.method2633().nextInt(5) == 0;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16538.field2404;
    }
    
    @Override
    public void method11015() {
        final Class5487 method1935 = this.field16538.method1935();
        Class5487 method1936 = new Class5487(this.field16539.method1938() - this.field16538.method1938(), 0.0, this.field16539.method1945() - this.field16538.method1945());
        if (method1936.method16753() > 1.0E-7) {
            method1936 = method1936.method16738().method16748(0.4).method16743(method1935.method16748(0.2));
        }
        this.field16538.method1937(method1936.field22770, this.field16540, method1936.field22772);
    }
}
