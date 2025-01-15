// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class421 extends Class419
{
    private static String[] field2534;
    private static final Class8810<Boolean> field2535;
    
    public Class421(final Class7499<? extends Class421> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class421(final Class1847 class1847, final Class511 class1848, final double n, final double n2, final double n3) {
        super(Class7499.field29050, class1848, n, n2, n3, class1847);
    }
    
    public Class421(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(Class7499.field29050, n, n2, n3, n4, n5, n6, class1847);
    }
    
    @Override
    public float method2035() {
        return this.method2036() ? 0.73f : super.method2035();
    }
    
    @Override
    public boolean method1804() {
        return false;
    }
    
    @Override
    public float method1856(final Class6154 class6154, final Class1855 class6155, final BlockPos class6156, final Class7096 class6157, final Class7099 class6158, final float b) {
        return (this.method2036() && Class767.method4244(class6157)) ? Math.min(0.8f, b) : b;
    }
    
    @Override
    public void method2032(final Class7006 class7006) {
        super.method2032(class7006);
        if (!this.field2391.field10067) {
            if (class7006.method21449() == Class2165.field12882) {
                final Entity method21452 = ((Class7007)class7006).method21452();
                if (this.field2527 == null) {
                    method21452.method1740(Class7929.field32576, 5.0f);
                }
                else if (method21452.method1740(Class7929.method25693(this.field2527), 8.0f)) {
                    if (!method21452.method1768()) {
                        this.field2527.method2663(5.0f);
                    }
                    else {
                        this.method1900(this.field2527, method21452);
                    }
                }
                if (method21452 instanceof Class511) {
                    int n = 0;
                    if (this.field2391.method6954() != Class2113.field12292) {
                        if (this.field2391.method6954() == Class2113.field12293) {
                            n = 40;
                        }
                    }
                    else {
                        n = 10;
                    }
                    if (n > 0) {
                        ((Class511)method21452).method2655(new Class1948(Class9439.field40493, 20 * n, 1));
                    }
                }
            }
            this.field2391.method6723(this, this.method1938(), this.method1941(), this.method1945(), 1.0f, false, this.field2391.method6765().method31216(Class8878.field37316) ? Class2196.field13367 : Class2196.field13365);
            this.method1652();
        }
    }
    
    @Override
    public boolean method1749() {
        return false;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        return false;
    }
    
    @Override
    public void method1649() {
        this.field2432.method33565(Class421.field2535, false);
    }
    
    public boolean method2036() {
        return this.field2432.method33568(Class421.field2535);
    }
    
    public void method2037(final boolean b) {
        this.field2432.method33569(Class421.field2535, b);
    }
    
    @Override
    public boolean method2033() {
        return false;
    }
    
    static {
        field2535 = Class9184.method33564(Class421.class, Class7709.field30661);
    }
}
