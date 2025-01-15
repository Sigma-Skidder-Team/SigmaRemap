// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class413 extends Class409
{
    private static String[] field2511;
    
    public Class413(final Class7499<? extends Class413> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public Class413(final Class1847 class1847, final Class511 class1848) {
        super(Class7499.field29038, class1848, class1847);
    }
    
    public Class413(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field29038, n, n2, n3, class1847);
    }
    
    @Override
    public Class3820 method2013() {
        return Class7739.field31510;
    }
    
    @Override
    public float method2018() {
        return 0.07f;
    }
    
    @Override
    public void method2016(final Class7006 class7006) {
        if (!this.field2391.field10067) {
            this.field2391.method6955(2002, new Class354(this), Class5333.method16472(Class8644.field36251));
            int i = 3 + this.field2391.field10062.nextInt(5) + this.field2391.field10062.nextInt(5);
            while (i > 0) {
                final int method2609 = Class508.method2609(i);
                i -= method2609;
                this.field2391.method6886(new Class508(this.field2391, this.method1938(), this.method1941(), this.method1945(), method2609));
            }
            this.method1652();
        }
    }
}
