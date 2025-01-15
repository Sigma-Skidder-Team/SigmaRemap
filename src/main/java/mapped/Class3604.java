// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3604 extends Class3446
{
    private static String[] field16784;
    private final Class819 field16785;
    
    public Class3604(final Class819 field16785) {
        this.field16785 = field16785;
        this.method11019(EnumSet.of(Class2139.field12582, Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16785.method1768()) {
            return false;
        }
        if (this.field16785.method1706()) {
            return false;
        }
        if (!this.field16785.field2404) {
            return false;
        }
        if (!this.field16785.field2408) {
            final Class512 method4823 = this.field16785.method4823();
            return method4823 != null && this.field16785.method1734(method4823) <= 16.0 && method4823.field3009 != null;
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16785.method4150().method24733();
    }
    
    @Override
    public void method11018() {
        this.field16785.method4822(null);
    }
}
