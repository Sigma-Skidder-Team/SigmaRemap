// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1519 implements Runnable
{
    private static String[] field8467;
    public final /* synthetic */ int field8468;
    public final /* synthetic */ int field8469;
    public final /* synthetic */ int field8470;
    public final /* synthetic */ double[][][] field8471;
    public final /* synthetic */ Class6733 field8472;
    
    public Class1519(final Class6733 field8472, final int field8473, final int field8474, final int field8475, final double[][][] field8476) {
        this.field8472 = field8472;
        this.field8468 = field8473;
        this.field8469 = field8474;
        this.field8470 = field8475;
        this.field8471 = field8476;
    }
    
    @Override
    public void run() {
        for (int i = this.field8468; i < this.field8469; ++i) {
            final int n = (Class6733.method20479(this.field8472) - i) % Class6733.method20479(this.field8472);
            for (int j = 1; j < this.field8470; ++j) {
                final int n2 = Class6733.method20474(this.field8472) - j;
                this.field8471[n][j][Class6733.method20477(this.field8472)] = this.field8471[i][n2][1];
                this.field8471[i][n2][Class6733.method20477(this.field8472)] = this.field8471[i][n2][1];
                this.field8471[n][j][Class6733.method20477(this.field8472) + 1] = -this.field8471[i][n2][0];
                this.field8471[i][n2][Class6733.method20477(this.field8472) + 1] = this.field8471[i][n2][0];
            }
        }
    }
}
