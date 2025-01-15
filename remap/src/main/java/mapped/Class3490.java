// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3490 extends Class3446
{
    private static String[] field16429;
    private final Class759 field16430;
    
    public Class3490(final Class759 field16430) {
        this.field16430 = field16430;
        this.method11019(EnumSet.of(Class2139.field12582));
        field16430.method4150().method24741(true);
    }
    
    @Override
    public boolean method11013() {
        final double n = (this.field16430.method1892() >= 0.4) ? 0.4 : 0.2;
        return (this.field16430.method1706() && this.field16430.method1929() > n) || this.field16430.method1723();
    }
    
    @Override
    public void method11016() {
        if (this.field16430.method2633().nextFloat() < 0.8f) {
            this.field16430.method4149().method22382();
        }
    }
}
