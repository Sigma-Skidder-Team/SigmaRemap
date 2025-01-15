// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3495 extends Class3446
{
    private static String[] field16441;
    private final Class794 field16442;
    private boolean field16443;
    
    public Class3495(final Class794 field16442) {
        this.field16442 = field16442;
        this.method11019(EnumSet.of(Class2139.field12582, Class2139.field12580));
    }
    
    @Override
    public boolean method11017() {
        return this.field16443;
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16442.method4480()) {
            return false;
        }
        if (this.field16442.method1711()) {
            return false;
        }
        if (this.field16442.field2404) {
            final Class511 method4488 = this.field16442.method4488();
            return method4488 == null || ((this.field16442.method1734(method4488) >= 144.0 || method4488.method2634() == null) && this.field16443);
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16442.method4150().method24733();
        this.field16442.method4484(true);
    }
    
    @Override
    public void method11018() {
        this.field16442.method4484(false);
    }
    
    public void method11058(final boolean field16443) {
        this.field16443 = field16443;
    }
}
