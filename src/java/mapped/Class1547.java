// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1547 implements Runnable
{
    private static String[] field8638;
    public final /* synthetic */ int field8639;
    public final /* synthetic */ int field8640;
    public final /* synthetic */ double[][][] field8641;
    public final /* synthetic */ boolean field8642;
    public final /* synthetic */ Class6733 field8643;
    
    public Class1547(final Class6733 field8643, final int field8644, final int field8645, final double[][][] field8646, final boolean field8647) {
        this.field8643 = field8643;
        this.field8639 = field8644;
        this.field8640 = field8645;
        this.field8641 = field8646;
        this.field8642 = field8647;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20474(this.field8643)];
        for (int i = this.field8639; i < this.field8640; ++i) {
            for (int j = 0; j < Class6733.method20477(this.field8643); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6733.method20474(this.field8643); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field8641[i][k][n];
                    array[n2 + 1] = this.field8641[i][k][n + 1];
                }
                Class6733.method20478(this.field8643).method26076(array, this.field8642);
                for (int l = 0; l < Class6733.method20474(this.field8643); ++l) {
                    final int n3 = 2 * l;
                    this.field8641[i][l][n] = array[n3];
                    this.field8641[i][l][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
