// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1200 implements Runnable
{
    private static String[] field6503;
    public final /* synthetic */ int field6504;
    public final /* synthetic */ int field6505;
    public final /* synthetic */ int field6506;
    public final /* synthetic */ double[] field6507;
    public final /* synthetic */ double[] field6508;
    public final /* synthetic */ Class6062 field6509;
    
    public Class1200(final Class6062 field6509, final int field6510, final int field6511, final int field6512, final double[] field6513, final double[] field6514) {
        this.field6509 = field6509;
        this.field6504 = field6510;
        this.field6505 = field6511;
        this.field6506 = field6512;
        this.field6507 = field6513;
        this.field6508 = field6514;
    }
    
    @Override
    public void run() {
        for (int i = this.field6504; i < this.field6505; ++i) {
            final int n = 2 * i;
            this.field6507[this.field6506 + i] = Class6062.method18050(this.field6509)[n] * this.field6508[n] - Class6062.method18050(this.field6509)[n + 1] * this.field6508[n + 1];
        }
    }
}
