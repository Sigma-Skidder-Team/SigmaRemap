// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1349 implements Runnable
{
    private static String[] field7382;
    public final /* synthetic */ int field7383;
    public final /* synthetic */ int field7384;
    public final /* synthetic */ int field7385;
    public final /* synthetic */ int field7386;
    public final /* synthetic */ int field7387;
    public final /* synthetic */ double[] field7388;
    public final /* synthetic */ Class6733 field7389;
    
    public Class1349(final Class6733 field7389, final int field7390, final int field7391, final int field7392, final int field7393, final int field7394, final double[] field7395) {
        this.field7389 = field7389;
        this.field7383 = field7390;
        this.field7384 = field7391;
        this.field7385 = field7392;
        this.field7386 = field7393;
        this.field7387 = field7394;
        this.field7388 = field7395;
    }
    
    @Override
    public void run() {
        for (int i = this.field7383; i < this.field7384; ++i) {
            final int n = (Class6733.method20479(this.field7389) - i) % Class6733.method20479(this.field7389) * this.field7385;
            final int n2 = i * this.field7385;
            for (int j = 0; j < Class6733.method20474(this.field7389); ++j) {
                final int n3 = (Class6733.method20474(this.field7389) - j) % Class6733.method20474(this.field7389) * this.field7386;
                final int n4 = j * this.field7386;
                for (int k = 1; k < Class6733.method20477(this.field7389); k += 2) {
                    final int n5 = n + n3 + this.field7387 - k;
                    final int n6 = n2 + n4 + k;
                    this.field7388[n5] = -this.field7388[n6 + 2];
                    this.field7388[n5 - 1] = this.field7388[n6 + 1];
                }
            }
        }
    }
}
