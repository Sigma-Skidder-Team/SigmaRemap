// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1411 implements Runnable
{
    private static String[] field7799;
    public final /* synthetic */ int field7800;
    public final /* synthetic */ int field7801;
    public final /* synthetic */ int field7802;
    public final /* synthetic */ double[][][] field7803;
    public final /* synthetic */ Class6733 field7804;
    
    public Class1411(final Class6733 field7804, final int field7805, final int field7806, final int field7807, final double[][][] field7808) {
        this.field7804 = field7804;
        this.field7800 = field7805;
        this.field7801 = field7806;
        this.field7802 = field7807;
        this.field7803 = field7808;
    }
    
    @Override
    public void run() {
        for (int i = this.field7800; i < this.field7801; ++i) {
            final int n = (Class6733.method20479(this.field7804) - i) % Class6733.method20479(this.field7804);
            for (int j = 0; j < Class6733.method20474(this.field7804); ++j) {
                final int n2 = (Class6733.method20474(this.field7804) - j) % Class6733.method20474(this.field7804);
                for (int k = 1; k < Class6733.method20477(this.field7804); k += 2) {
                    final int n3 = this.field7802 - k;
                    this.field7803[n][n2][n3] = -this.field7803[i][j][k + 2];
                    this.field7803[n][n2][n3 - 1] = this.field7803[i][j][k + 1];
                }
            }
        }
    }
}
