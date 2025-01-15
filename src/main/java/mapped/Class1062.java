// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1062 implements Runnable
{
    private static String[] field5711;
    public final /* synthetic */ int field5712;
    public final /* synthetic */ int field5713;
    public final /* synthetic */ double[][][] field5714;
    public final /* synthetic */ boolean field5715;
    public final /* synthetic */ Class6733 field5716;
    
    public Class1062(final Class6733 field5716, final int field5717, final int field5718, final double[][][] field5719, final boolean field5720) {
        this.field5716 = field5716;
        this.field5712 = field5717;
        this.field5713 = field5718;
        this.field5714 = field5719;
        this.field5715 = field5720;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20479(this.field5716)];
        for (int i = this.field5712; i < this.field5713; ++i) {
            for (int j = 0; j < Class6733.method20477(this.field5716); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6733.method20479(this.field5716); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field5714[k][i][n];
                    array[n2 + 1] = this.field5714[k][i][n + 1];
                }
                Class6733.method20480(this.field5716).method26076(array, this.field5715);
                for (int l = 0; l < Class6733.method20479(this.field5716); ++l) {
                    final int n3 = 2 * l;
                    this.field5714[l][i][n] = array[n3];
                    this.field5714[l][i][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
