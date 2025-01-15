// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class760 extends Class759
{
    public Class760(final Class7499<? extends Class760> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public void method1701(final double n, final boolean b, final Class7096 class7096, final Class354 class7097) {
    }
    
    @Override
    public void method2729(final Class5487 class5487) {
        if (!this.method1706()) {
            if (!this.method1723()) {
                float n = 0.91f;
                if (this.field2404) {
                    n = this.field2391.method6701(new Class354(this.method1938(), this.method1941() - 1.0, this.method1945())).method21696().method11865() * 0.91f;
                }
                final float n2 = 0.16277137f / (n * n * n);
                float n3 = 0.91f;
                if (this.field2404) {
                    n3 = this.field2391.method6701(new Class354(this.method1938(), this.method1941() - 1.0, this.method1945())).method21696().method11865() * 0.91f;
                }
                this.method1724(this.field2404 ? (0.1f * n2) : 0.02f, class5487);
                this.method1671(Class2160.field12826, this.method1935());
                this.method1936(this.method1935().method16748(n3));
            }
            else {
                this.method1724(0.02f, class5487);
                this.method1671(Class2160.field12826, this.method1935());
                this.method1936(this.method1935().method16748(0.5));
            }
        }
        else {
            this.method1724(0.02f, class5487);
            this.method1671(Class2160.field12826, this.method1935());
            this.method1936(this.method1935().method16748(0.800000011920929));
        }
        this.field2945 = this.field2946;
        final double n4 = this.method1938() - this.field2392;
        final double n5 = this.method1945() - this.field2394;
        float n6 = Class9546.method35641(n4 * n4 + n5 * n5) * 4.0f;
        if (n6 > 1.0f) {
            n6 = 1.0f;
        }
        this.field2946 += (n6 - this.field2946) * 0.4f;
        this.field2947 += this.field2946;
    }
    
    @Override
    public boolean method2688() {
        return false;
    }
}
