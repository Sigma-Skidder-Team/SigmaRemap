// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class880 implements Runnable
{
    private static String[] field4742;
    public final /* synthetic */ int field4743;
    public final /* synthetic */ int field4744;
    public final /* synthetic */ double[][][] field4745;
    public final /* synthetic */ boolean field4746;
    public final /* synthetic */ Class6733 field4747;
    
    public Class880(final Class6733 field4747, final int field4748, final int field4749, final double[][][] field4750, final boolean field4751) {
        this.field4747 = field4747;
        this.field4743 = field4748;
        this.field4744 = field4749;
        this.field4745 = field4750;
        this.field4746 = field4751;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20474(this.field4747)];
        for (int i = this.field4743; i < this.field4744; ++i) {
            for (int j = 0; j < Class6733.method20477(this.field4747); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6733.method20474(this.field4747); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field4745[i][k][n];
                    array[n2 + 1] = this.field4745[i][k][n + 1];
                }
                Class6733.method20478(this.field4747).method26076(array, this.field4746);
                for (int l = 0; l < Class6733.method20474(this.field4747); ++l) {
                    final int n3 = 2 * l;
                    this.field4745[i][l][n] = array[n3];
                    this.field4745[i][l][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
