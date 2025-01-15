// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.EnumSet;

public class Class3571 extends Class3446
{
    private static String[] field16667;
    private final Class761 field16668;
    
    public Class3571(final Class761 field16668) {
        this.field16668 = field16668;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        final Class6564 method4148 = this.field16668.method4148();
        if (method4148.method19905()) {
            final double n = method4148.method19910() - this.field16668.method1938();
            final double n2 = method4148.method19911() - this.field16668.method1941();
            final double n3 = method4148.method19912() - this.field16668.method1945();
            final double n4 = n * n + n2 * n2 + n3 * n3;
            return n4 < 1.0 || n4 > 3600.0;
        }
        return true;
    }
    
    @Override
    public boolean method11017() {
        return false;
    }
    
    @Override
    public void method11015() {
        final Random method2633 = this.field16668.method2633();
        this.field16668.method4148().method19907(this.field16668.method1938() + (method2633.nextFloat() * 2.0f - 1.0f) * 16.0f, this.field16668.method1941() + (method2633.nextFloat() * 2.0f - 1.0f) * 16.0f, this.field16668.method1945() + (method2633.nextFloat() * 2.0f - 1.0f) * 16.0f, 1.0);
    }
}
