// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3639 extends Class3446
{
    private static String[] field16883;
    private static final Class7843 field16884;
    private final Class786 field16885;
    private Class824 field16886;
    private int field16887;
    
    public Class3639(final Class786 field16885) {
        this.field16885 = field16885;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16885.field2391.method6703()) {
            return false;
        }
        if (this.field16885.method2633().nextInt(8000) == 0) {
            this.field16886 = this.field16885.field2391.method7138((Class<? extends Class824>)Class824.class, Class3639.field16884, (Class511)this.field16885, this.field16885.method1938(), this.field16885.method1941(), this.field16885.method1945(), this.field16885.method1886().method18495(6.0, 2.0, 6.0));
            return this.field16886 != null;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return this.field16887 > 0;
    }
    
    @Override
    public void method11015() {
        this.field16887 = 400;
        this.field16885.method4339(true);
    }
    
    @Override
    public void method11018() {
        this.field16885.method4339(false);
        this.field16886 = null;
    }
    
    @Override
    public void method11016() {
        this.field16885.method4147().method24667(this.field16886, 30.0f, 30.0f);
        --this.field16887;
    }
    
    static {
        field16884 = new Class7843().method25337(6.0).method25339().method25338();
    }
}
