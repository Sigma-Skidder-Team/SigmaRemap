// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1313 implements Runnable
{
    private static String[] field7202;
    public final /* synthetic */ int field7203;
    public final /* synthetic */ int field7204;
    public final /* synthetic */ double[][][] field7205;
    public final /* synthetic */ boolean field7206;
    public final /* synthetic */ Class6733 field7207;
    
    public Class1313(final Class6733 field7207, final int field7208, final int field7209, final double[][][] field7210, final boolean field7211) {
        this.field7207 = field7207;
        this.field7203 = field7208;
        this.field7204 = field7209;
        this.field7205 = field7210;
        this.field7206 = field7211;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20479(this.field7207)];
        for (int i = this.field7203; i < this.field7204; ++i) {
            for (int j = 0; j < Class6733.method20477(this.field7207); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6733.method20479(this.field7207); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field7205[k][i][n];
                    array[n2 + 1] = this.field7205[k][i][n + 1];
                }
                Class6733.method20480(this.field7207).method26076(array, this.field7206);
                for (int l = 0; l < Class6733.method20479(this.field7207); ++l) {
                    final int n3 = 2 * l;
                    this.field7205[l][i][n] = array[n3];
                    this.field7205[l][i][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
