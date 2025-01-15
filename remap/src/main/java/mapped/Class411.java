// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class411 extends Class409
{
    private static String[] field2508;
    
    public Class411(final Class7499<? extends Class411> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class411(final Class1847 class1847, final Class511 class1848) {
        super(Class7499.field29028, class1848, class1847);
    }
    
    public Class411(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field29028, n, n2, n3, class1847);
    }
    
    @Override
    public Class3820 method2013() {
        return Class7739.field31355;
    }
    
    private Class6909 method2017() {
        final Class8321 method2014 = this.method2014();
        return method2014.method27620() ? Class8432.field34631 : new Class6910(Class8432.field34629, method2014);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b == 3) {
            final Class6909 method2017 = this.method2017();
            for (int i = 0; i < 8; ++i) {
                this.field2391.method6709(method2017, this.method1938(), this.method1941(), this.method1945(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public void method2016(final Class7006 class7006) {
        if (class7006.method21449() == Class2165.field12882) {
            final Class399 method21452 = ((Class7007)class7006).method21452();
            method21452.method1740(Class7929.method25699(this, this.method2019()), (method21452 instanceof Class849) ? 3 : 0);
        }
        if (!this.field2391.field10067) {
            this.field2391.method6761(this, (byte)3);
            this.method1652();
        }
    }
}
