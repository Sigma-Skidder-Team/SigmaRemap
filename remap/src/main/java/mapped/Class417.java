// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class417 extends Class416
{
    public int field2525;
    
    public Class417(final Class7499<? extends Class417> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2525 = 1;
    }
    
    public Class417(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(Class7499.field28994, n, n2, n3, n4, n5, n6, class1847);
        this.field2525 = 1;
    }
    
    public Class417(final Class1847 class1847, final Class511 class1848, final double n, final double n2, final double n3) {
        super(Class7499.field28994, class1848, n, n2, n3, class1847);
        this.field2525 = 1;
    }
    
    @Override
    public void method2032(final Class7006 class7006) {
        super.method2032(class7006);
        if (!this.field2391.field10067) {
            if (class7006.method21449() == Class2165.field12882) {
                final Entity method21452 = ((Class7007)class7006).method21452();
                method21452.method1740(Class7929.method25698(this, this.field2527), 6.0f);
                this.method1900(this.field2527, method21452);
            }
            final boolean method21453 = this.field2391.method6765().method31216(Class8878.field37316);
            this.field2391.method6723(null, this.method1938(), this.method1941(), this.method1945(), (float)this.field2525, method21453, method21453 ? Class2196.field13367 : Class2196.field13365);
            this.method1652();
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("ExplosionPower", this.field2525);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("ExplosionPower", 99)) {
            this.field2525 = class51.method319("ExplosionPower");
        }
    }
}
