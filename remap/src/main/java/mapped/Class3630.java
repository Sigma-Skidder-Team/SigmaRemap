// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class3630 extends Class3628
{
    private static String[] field16857;
    private final Class791 field16866;
    
    public Class3630(final Class791 field16866, final Class<? extends Class511> clazz, final float n) {
        super(field16866, clazz, n);
        this.field16866 = field16866;
    }
    
    public void method11166(final Class511 field16859) {
        this.field16859 = field16859;
    }
    
    @Override
    public boolean method11017() {
        return this.field16859 != null && super.method11017();
    }
    
    @Override
    public boolean method11013() {
        if (this.field16858.method2633().nextFloat() < this.field16862) {
            if (this.field16859 == null) {
                if (this.field16863 != Class512.class) {
                    this.field16859 = this.field16858.field2391.method7139((Class<? extends Entity>)this.field16863, this.field16864, (Class511)this.field16858, this.field16858.method1938(), this.field16858.method1944(), this.field16858.method1945(), this.field16858.method1886().method18495(this.field16860, 3.0, this.field16860));
                }
                else {
                    this.field16859 = this.field16858.field2391.method7136(this.field16864, this.field16858, this.field16858.method1938(), this.field16858.method1944(), this.field16858.method1945());
                }
            }
            return this.field16866.method4414() && this.field16859 != null;
        }
        return false;
    }
    
    @Override
    public void method11016() {
        if (this.field16859 != null) {
            super.method11016();
        }
    }
}
