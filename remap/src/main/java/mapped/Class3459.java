// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.EnumSet;

public class Class3459 extends Class3446
{
    private static String[] field16308;
    private final Class776 field16309;
    private final float field16310;
    public final Class7843 field16311;
    public final /* synthetic */ Class776 field16312;
    
    public Class3459(final Class776 field16312, final Class772 field16313, final float n) {
        this.field16312 = field16312;
        this.field16311 = new Class7843().method25337(8.0).method25341().method25338().method25339().method25340().method25342();
        this.field16309 = field16313;
        this.field16310 = n * n;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        final Class511 method2634 = this.field16309.method2634();
        if (this.field16309.method4292() == null) {
            if (this.field16309.method4316()) {
                if (this.field16309.method4152() != null) {
                    if (!this.field16309.method4216()) {
                        if (method2634 == null || method2634.method1642() != EntityType.field29058) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16309.method4150().method24733();
        final Iterator<Class511> iterator = (Iterator<Class511>)this.field16309.field2391.method7142((Class<? extends Class776>)Class776.class, this.field16311, (Class511)this.field16309, this.field16309.method1886().method18495(8.0, 8.0, 8.0)).iterator();
        while (iterator.hasNext()) {
            iterator.next().method4153(this.field16309.method4152());
        }
    }
    
    @Override
    public void method11018() {
        super.method11018();
        final Class511 method4152 = this.field16309.method4152();
        if (method4152 != null) {
            for (final Class776 class776 : this.field16309.field2391.method7142((Class<? extends Class776>)Class776.class, this.field16311, (Class511)this.field16309, this.field16309.method1886().method18495(8.0, 8.0, 8.0))) {
                class776.method4153(method4152);
                class776.method4213(true);
            }
            this.field16309.method4213(true);
        }
    }
    
    @Override
    public void method11016() {
        final Class511 method4152 = this.field16309.method4152();
        if (method4152 != null) {
            if (this.field16309.method1734(method4152) <= this.field16310) {
                this.field16309.method4213(true);
            }
            else {
                this.field16309.method4147().method24667(method4152, 30.0f, 30.0f);
                if (Class776.method4305(this.field16309).nextInt(50) == 0) {
                    this.field16309.method4156();
                }
            }
            super.method11016();
        }
    }
}
