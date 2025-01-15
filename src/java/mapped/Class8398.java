// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8398
{
    private static String[] field34422;
    private final int[][] field34423;
    private final int field34424;
    private final int field34425;
    private final int field34426;
    
    public Class8398(final int field34424, final int field34425, final int field34426) {
        this.field34424 = field34424;
        this.field34425 = field34425;
        this.field34426 = field34426;
        this.field34423 = new int[field34424][field34425];
    }
    
    public void method28001(final int n, final int n2, final int n3) {
        if (n >= 0) {
            if (n < this.field34424) {
                if (n2 >= 0) {
                    if (n2 < this.field34425) {
                        this.field34423[n][n2] = n3;
                    }
                }
            }
        }
    }
    
    public void method28002(final int n, final int n2, final int n3, final int n4, final int n5) {
        for (int i = n2; i <= n4; ++i) {
            for (int j = n; j <= n3; ++j) {
                this.method28001(j, i, n5);
            }
        }
    }
    
    public int method28003(final int n, final int n2) {
        if (n >= 0) {
            if (n < this.field34424) {
                if (n2 >= 0) {
                    if (n2 < this.field34425) {
                        return this.field34423[n][n2];
                    }
                }
            }
        }
        return this.field34426;
    }
    
    public void method28004(final int n, final int n2, final int n3, final int n4) {
        if (this.method28003(n, n2) == n3) {
            this.method28001(n, n2, n4);
        }
    }
    
    public boolean method28005(final int n, final int n2, final int n3) {
        if (this.method28003(n - 1, n2) != n3) {
            if (this.method28003(n + 1, n2) != n3) {
                if (this.method28003(n, n2 + 1) != n3) {
                    if (this.method28003(n, n2 - 1) != n3) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
