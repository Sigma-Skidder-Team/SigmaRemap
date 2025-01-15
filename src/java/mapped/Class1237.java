// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1237 implements Runnable
{
    private static String[] field6728;
    public final /* synthetic */ int field6729;
    public final /* synthetic */ int field6730;
    public final /* synthetic */ double[] field6731;
    public final /* synthetic */ int field6732;
    public final /* synthetic */ double[] field6733;
    public final /* synthetic */ Class6062 field6734;
    
    public Class1237(final Class6062 field6734, final int field6735, final int field6736, final double[] field6737, final int field6738, final double[] field6739) {
        this.field6734 = field6734;
        this.field6729 = field6735;
        this.field6730 = field6736;
        this.field6731 = field6737;
        this.field6732 = field6738;
        this.field6733 = field6739;
    }
    
    @Override
    public void run() {
        for (int i = this.field6729; i < this.field6730; ++i) {
            final int n = 2 * i;
            final double n2 = this.field6731[this.field6732 + i];
            this.field6733[n] = Class6062.method18050(this.field6734)[n] * n2;
            this.field6733[n + 1] = -Class6062.method18050(this.field6734)[n + 1] * n2;
        }
    }
}
