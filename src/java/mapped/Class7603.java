// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7603 implements Class7604
{
    private static String[] field30149;
    public final /* synthetic */ Class435 field30150;
    
    public Class7603(final Class435 field30150) {
        this.field30150 = field30150;
    }
    
    @Override
    public int method23902(final int n) {
        return (n != 0) ? 0 : Class435.method2184(this.field30150);
    }
    
    @Override
    public void method23903(final int n, final int n2) {
        if (n == 0) {
            Class435.method2185(this.field30150, n2);
        }
    }
    
    @Override
    public int method23904() {
        return 1;
    }
}
