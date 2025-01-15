// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class983 implements Runnable
{
    private static String[] field5242;
    public final /* synthetic */ int field5243;
    public final /* synthetic */ int field5244;
    public final /* synthetic */ double[][][] field5245;
    public final /* synthetic */ Class6733 field5246;
    
    public Class983(final Class6733 field5246, final int field5247, final int field5248, final double[][][] field5249) {
        this.field5246 = field5246;
        this.field5243 = field5247;
        this.field5244 = field5248;
        this.field5245 = field5249;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20474(this.field5246)];
        for (int i = this.field5243; i < this.field5244; ++i) {
            for (int j = 0; j < Class6733.method20477(this.field5246); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6733.method20474(this.field5246); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field5245[i][k][n];
                    array[n2 + 1] = this.field5245[i][k][n + 1];
                }
                Class6733.method20478(this.field5246).method26072(array);
                for (int l = 0; l < Class6733.method20474(this.field5246); ++l) {
                    final int n3 = 2 * l;
                    this.field5245[i][l][n] = array[n3];
                    this.field5245[i][l][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
