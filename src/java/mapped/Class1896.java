// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class1896 extends Class1891
{
    public Class1896(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    @Override
    public boolean method7300(final long n) {
        return n == Long.MAX_VALUE;
    }
    
    @Override
    public void method7326(final long n, final int n2, final boolean b) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    final long method1094 = Class353.method1094(n, i, j, k);
                    if (method1094 != n) {
                        this.method7322(n, method1094, n2, b);
                    }
                }
            }
        }
    }
    
    @Override
    public int method7301(final long n, final long n2, final int n3) {
        int n4 = n3;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    long method1094 = Class353.method1094(n, i, j, k);
                    if (method1094 == n) {
                        method1094 = Long.MAX_VALUE;
                    }
                    if (method1094 != n2) {
                        final int method1095 = this.method7305(method1094, n, this.method7302(method1094));
                        if (n4 > method1095) {
                            n4 = method1095;
                        }
                        if (n4 == 0) {
                            return n4;
                        }
                    }
                }
            }
        }
        return n4;
    }
    
    @Override
    public int method7305(final long n, final long n2, final int n3) {
        return (n != Long.MAX_VALUE) ? (n3 + 1) : this.method7345(n2);
    }
    
    public abstract int method7345(final long p0);
    
    public void method7346(final long n, final int n2, final boolean b) {
        this.method7320(Long.MAX_VALUE, n, n2, b);
    }
}
