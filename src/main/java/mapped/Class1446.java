// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1446 implements Runnable
{
    private static String[] field8009;
    public final /* synthetic */ int field8010;
    public final /* synthetic */ int field8011;
    public final /* synthetic */ double[][][] field8012;
    public final /* synthetic */ boolean field8013;
    public final /* synthetic */ Class7568 field8014;
    
    public Class1446(final Class7568 field8014, final int field8015, final int field8016, final double[][][] field8017, final boolean field8018) {
        this.field8014 = field8014;
        this.field8010 = field8015;
        this.field8011 = field8016;
        this.field8012 = field8017;
        this.field8013 = field8018;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7568.method23782(this.field8014)];
        for (int i = this.field8010; i < this.field8011; ++i) {
            for (int j = 0; j < Class7568.method23780(this.field8014); ++j) {
                for (int k = 0; k < Class7568.method23782(this.field8014); ++k) {
                    array[k] = this.field8012[k][i][j];
                }
                Class7568.method23783(this.field8014).method30725(array, this.field8013);
                for (int l = 0; l < Class7568.method23782(this.field8014); ++l) {
                    this.field8012[l][i][j] = array[l];
                }
            }
        }
    }
}
