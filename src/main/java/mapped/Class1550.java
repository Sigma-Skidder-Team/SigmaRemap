// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1550 implements Runnable
{
    private static String[] field8659;
    public final /* synthetic */ int field8660;
    public final /* synthetic */ int field8661;
    public final /* synthetic */ int field8662;
    public final /* synthetic */ int field8663;
    public final /* synthetic */ double[][][] field8664;
    public final /* synthetic */ Class6733 field8665;
    
    public Class1550(final Class6733 field8665, final int field8666, final int field8667, final int field8668, final int field8669, final double[][][] field8670) {
        this.field8665 = field8665;
        this.field8660 = field8666;
        this.field8661 = field8667;
        this.field8662 = field8668;
        this.field8663 = field8669;
        this.field8664 = field8670;
    }
    
    @Override
    public void run() {
        for (int i = this.field8660; i < this.field8661; ++i) {
            final int n = (Class6733.method20479(this.field8665) - i) % Class6733.method20479(this.field8665);
            for (int j = 1; j < this.field8662; ++j) {
                final int n2 = Class6733.method20474(this.field8665) - j;
                for (int k = 0; k < Class6733.method20477(this.field8665); ++k) {
                    final int n3 = 2 * k;
                    final int n4 = this.field8663 - n3;
                    this.field8664[n][n2][n4 % this.field8663] = this.field8664[i][j][n3];
                    this.field8664[n][n2][(n4 + 1) % this.field8663] = -this.field8664[i][j][n3 + 1];
                }
            }
        }
    }
}
