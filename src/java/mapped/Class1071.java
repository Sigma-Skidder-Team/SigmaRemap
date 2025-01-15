// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1071 implements Runnable
{
    private static String[] field5762;
    public final /* synthetic */ int field5763;
    public final /* synthetic */ int field5764;
    public final /* synthetic */ double[][][] field5765;
    public final /* synthetic */ Class6733 field5766;
    
    public Class1071(final Class6733 field5766, final int field5767, final int field5768, final double[][][] field5769) {
        this.field5766 = field5766;
        this.field5763 = field5767;
        this.field5764 = field5768;
        this.field5765 = field5769;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20479(this.field5766)];
        for (int i = this.field5763; i < this.field5764; ++i) {
            for (int j = 0; j < Class6733.method20477(this.field5766); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6733.method20479(this.field5766); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field5765[k][i][n];
                    array[n2 + 1] = this.field5765[k][i][n + 1];
                }
                Class6733.method20480(this.field5766).method26072(array);
                for (int l = 0; l < Class6733.method20479(this.field5766); ++l) {
                    final int n3 = 2 * l;
                    this.field5765[l][i][n] = array[n3];
                    this.field5765[l][i][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
