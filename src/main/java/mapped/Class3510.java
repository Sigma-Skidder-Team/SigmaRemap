// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3510 extends Class3446
{
    private static String[] field16502;
    public final /* synthetic */ Class843 field16503;
    
    public Class3510(final Class843 field16503) {
        this.field16503 = field16503;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16503.method4152() != null) {
            if (!this.field16503.method4148().method19905()) {
                if (Class843.method5045(this.field16503).nextInt(7) == 0) {
                    return this.field16503.method1734(this.field16503.method4152()) > 4.0;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16503.method4148().method19905()) {
            if (this.field16503.method5041()) {
                if (this.field16503.method4152() != null) {
                    if (this.field16503.method4152().method1768()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        final Class5487 method1747 = this.field16503.method4152().method1747(1.0f);
        Class843.method5046(this.field16503).method19907(method1747.field22770, method1747.field22771, method1747.field22772, 1.0);
        this.field16503.method5042(true);
        this.field16503.method1695(Class8520.field35672, 1.0f, 1.0f);
    }
    
    @Override
    public void method11018() {
        this.field16503.method5042(false);
    }
    
    @Override
    public void method11016() {
        final Class511 method4152 = this.field16503.method4152();
        if (!this.field16503.method1886().method18502(method4152.method1886())) {
            if (this.field16503.method1734(method4152) < 9.0) {
                final Class5487 method4153 = method4152.method1747(1.0f);
                Class843.method5047(this.field16503).method19907(method4153.field22770, method4153.field22771, method4153.field22772, 1.0);
            }
        }
        else {
            this.field16503.method2734(method4152);
            this.field16503.method5042(false);
        }
    }
}
