// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1194 implements Runnable
{
    private static String[] field6469;
    public final /* synthetic */ int field6470;
    public final /* synthetic */ int field6471;
    public final /* synthetic */ double[][][] field6472;
    public final /* synthetic */ Class6733 field6473;
    
    public Class1194(final Class6733 field6473, final int field6474, final int field6475, final double[][][] field6476) {
        this.field6473 = field6473;
        this.field6470 = field6474;
        this.field6471 = field6475;
        this.field6472 = field6476;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20479(this.field6473)];
        for (int i = this.field6470; i < this.field6471; ++i) {
            for (int j = 0; j < Class6733.method20477(this.field6473); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6733.method20479(this.field6473); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field6472[k][i][n];
                    array[n2 + 1] = this.field6472[k][i][n + 1];
                }
                Class6733.method20480(this.field6473).method26072(array);
                for (int l = 0; l < Class6733.method20479(this.field6473); ++l) {
                    final int n3 = 2 * l;
                    this.field6472[l][i][n] = array[n3];
                    this.field6472[l][i][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
