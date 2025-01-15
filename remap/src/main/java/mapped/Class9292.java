// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9292
{
    private static String[] field39853;
    private Class5487 field39854;
    private long field39855;
    
    public Class9292() {
        this.field39854 = null;
        this.field39855 = System.currentTimeMillis();
    }
    
    public Class5487 method34320(final double n, final double n2, final double n3) {
        if (this.field39854 == null) {
            return this.field39854 = new Class5487(n, n2, n3);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final long n4 = currentTimeMillis - this.field39855;
        if (n4 != 0L) {
            this.field39855 = currentTimeMillis;
            if (Math.abs(n - this.field39854.field22770) < 0.004) {
                if (Math.abs(n2 - this.field39854.field22771) < 0.004) {
                    if (Math.abs(n3 - this.field39854.field22772) < 0.004) {
                        return this.field39854;
                    }
                }
            }
            final double method28867 = Class8571.method28867(n4 * 0.001, 0.0, 1.0);
            return this.field39854 = new Class5487(this.field39854.field22770 + (n - this.field39854.field22770) * method28867, this.field39854.field22771 + (n2 - this.field39854.field22771) * method28867, this.field39854.field22772 + (n3 - this.field39854.field22772) * method28867);
        }
        return this.field39854;
    }
}
