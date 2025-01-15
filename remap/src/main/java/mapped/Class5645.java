// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5645 extends Class5611
{
    private static String[] field23040;
    public final /* synthetic */ Class5085 field23041;
    
    public Class5645(final Class5085 field23041, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23041 = field23041;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Class5085.method15884(this.field23041, (Class5085.method15885(this.field23041) + 1) % this.field23041.field21935.length);
        this.method16925(Class5085.method15886(this.field23041));
    }
}
