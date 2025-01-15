// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5630 extends Class5611
{
    private static String[] field23016;
    public final /* synthetic */ Class5050 field23017;
    
    public Class5630(final Class5050 field23017, final int n, final int n2, final int n3, final int n4, final int n5, final String s) {
        this.field23017 = field23017;
        super(n, n2, n3, n4, n5, s);
    }
    
    @Override
    public void method16932() {
        Class5050.method15477(this.field23017, (Class5050.method15478(this.field23017) + 1) % this.field23017.field21685.length);
        this.method16925(Class5050.method15479(this.field23017));
    }
}
