// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1262 implements Runnable
{
    private static String[] field6879;
    public final /* synthetic */ int field6880;
    public final /* synthetic */ int field6881;
    public final /* synthetic */ double[][][] field6882;
    public final /* synthetic */ Class6733 field6883;
    
    public Class1262(final Class6733 field6883, final int field6884, final int field6885, final double[][][] field6886) {
        this.field6883 = field6883;
        this.field6880 = field6884;
        this.field6881 = field6885;
        this.field6882 = field6886;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20474(this.field6883)];
        for (int i = this.field6880; i < this.field6881; ++i) {
            for (int j = 0; j < Class6733.method20477(this.field6883); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6733.method20474(this.field6883); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field6882[i][k][n];
                    array[n2 + 1] = this.field6882[i][k][n + 1];
                }
                Class6733.method20478(this.field6883).method26072(array);
                for (int l = 0; l < Class6733.method20474(this.field6883); ++l) {
                    final int n3 = 2 * l;
                    this.field6882[i][l][n] = array[n3];
                    this.field6882[i][l][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
