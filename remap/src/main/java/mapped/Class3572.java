// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3572 extends Class3446
{
    private static String[] field16669;
    private final Class799 field16670;
    private Class512 field16671;
    private final Class1847 field16672;
    private final float field16673;
    private int field16674;
    private final Class7843 field16675;
    
    public Class3572(final Class799 field16670, final float field16671) {
        this.field16670 = field16670;
        this.field16672 = field16670.field2391;
        this.field16673 = field16671;
        this.field16675 = new Class7843().method25337(field16671).method25338().method25339().method25341();
        this.method11019(EnumSet.of(Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        this.field16671 = this.field16672.method7135(this.field16675, this.field16670);
        return this.field16671 != null && this.method11112(this.field16671);
    }
    
    @Override
    public boolean method11017() {
        return this.field16671.method1768() && this.field16670.method1734(this.field16671) <= this.field16673 * this.field16673 && this.field16674 > 0 && this.method11112(this.field16671);
    }
    
    @Override
    public void method11015() {
        this.field16670.method4602(true);
        this.field16674 = 40 + this.field16670.method2633().nextInt(40);
    }
    
    @Override
    public void method11018() {
        this.field16670.method4602(false);
        this.field16671 = null;
    }
    
    @Override
    public void method11016() {
        this.field16670.method4147().method24669(this.field16671.getPosX(), this.field16671.method1944(), this.field16671.getPosZ(), 10.0f, (float)this.field16670.method4173());
        --this.field16674;
    }
    
    private boolean method11112(final Class512 class512) {
        final Class316[] values = Class316.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            final Class8321 method2715 = class512.method2715(values[i]);
            if (this.field16670.method4480() && method2715.method27622() == Class7739.field31405) {
                return true;
            }
            if (this.field16670.method4357(method2715)) {
                return true;
            }
        }
        return false;
    }
}
