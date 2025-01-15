// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class Class3513 extends Class3446
{
    private static String[] field16507;
    public final /* synthetic */ Class798 field16508;
    
    public Class3513(final Class798 field16508) {
        this.field16508 = field16508;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        return Class798.method4587(this.field16508).method24731() && Class798.method4588(this.field16508).nextInt(10) == 0;
    }
    
    @Override
    public boolean method11017() {
        return Class798.method4589(this.field16508).method24732();
    }
    
    @Override
    public void method11015() {
        final Class5487 method11070 = this.method11070();
        if (method11070 != null) {
            Class798.method4591(this.field16508).method24726(Class798.method4590(this.field16508).method24721(new Class354(method11070), 1), 1.0);
        }
    }
    
    @Nullable
    private Class5487 method11070() {
        Class5487 class5487;
        if (Class798.method4570(this.field16508) && !Class798.method4550(this.field16508, Class798.method4545(this.field16508), 40)) {
            class5487 = new Class5487(Class798.method4545(this.field16508)).method16741(this.field16508.method1934()).method16738();
        }
        else {
            class5487 = this.field16508.method1741(0.0f);
        }
        final Class5487 method24904 = Class7775.method24904(this.field16508, 8, 7, class5487, 1.5707964f, 2, 1);
        return (method24904 == null) ? Class7775.method24901(this.field16508, 8, 4, -2, class5487, 1.5707963705062866) : method24904;
    }
}
