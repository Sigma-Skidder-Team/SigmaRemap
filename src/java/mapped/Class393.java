// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class393 implements AutoCloseable
{
    private static String[] field2289;
    private final Class1846[] field2290;
    public final /* synthetic */ Class1912 field2291;
    
    private Class393(final Class1912 field2291, final Class9336 class9336, final int n) {
        this.field2291 = field2291;
        this.field2290 = new Class1846[n + 1];
        for (int i = 0; i < this.field2290.length; ++i) {
            final int n2 = Class9336.method34600(class9336) >> i;
            final int n3 = Class9336.method34601(class9336) >> i;
            if (this.field2290[i] == null) {
                this.field2290[i] = new Class1846(n2, n3, false);
            }
        }
    }
    
    private void method1430() {
        final double n = 1.0 - Class1912.method7543(this.field2291) / (double)Class1912.method7545(this.field2291).method29310(Class1912.method7544(this.field2291));
        final int method29311 = Class1912.method7545(this.field2291).method29311(Class1912.method7544(this.field2291));
        final int method29312 = Class1912.method7545(this.field2291).method29311((Class1912.method7544(this.field2291) + 1) % ((Class1912.method7545(this.field2291).method29306() != 0) ? Class1912.method7545(this.field2291).method29306() : this.field2291.method7505()));
        if (method29311 != method29312) {
            if (method29312 >= 0) {
                if (method29312 < this.field2291.method7505()) {
                    for (int i = 0; i < this.field2290.length; ++i) {
                        final int n2 = Class9336.method34600(Class1912.method7546(this.field2291)) >> i;
                        for (int n3 = Class9336.method34601(Class1912.method7546(this.field2291)) >> i, j = 0; j < n3; ++j) {
                            for (int k = 0; k < n2; ++k) {
                                final int method29313 = this.method1431(method29311, i, k, j);
                                final int method29314 = this.method1431(method29312, i, k, j);
                                this.field2290[i].method6648(k, j, (method29313 & 0xFF000000) | this.method1432(n, method29313 >> 16 & 0xFF, method29314 >> 16 & 0xFF) << 16 | this.method1432(n, method29313 >> 8 & 0xFF, method29314 >> 8 & 0xFF) << 8 | this.method1432(n, method29313 & 0xFF, method29314 & 0xFF));
                            }
                        }
                    }
                    Class1912.method7547(this.field2291, 0, 0, this.field2290);
                }
            }
        }
    }
    
    private int method1431(final int n, final int n2, final int n3, final int n4) {
        return this.field2291.field10369[n2].method6647(n3 + (Class1912.method7548(this.field2291)[n] * Class9336.method34600(Class1912.method7546(this.field2291)) >> n2), n4 + (Class1912.method7549(this.field2291)[n] * Class9336.method34601(Class1912.method7546(this.field2291)) >> n2));
    }
    
    private int method1432(final double n, final int n2, final int n3) {
        return (int)(n * n2 + (1.0 - n) * n3);
    }
    
    @Override
    public void close() {
        for (final Class1846 class1846 : this.field2290) {
            if (class1846 != null) {
                class1846.close();
            }
        }
    }
}
