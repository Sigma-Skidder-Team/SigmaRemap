// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1554 implements Runnable
{
    private static String[] field8688;
    public final /* synthetic */ int field8689;
    public final /* synthetic */ int field8690;
    public final /* synthetic */ double[][][] field8691;
    public final /* synthetic */ boolean field8692;
    public final /* synthetic */ Class7568 field8693;
    
    public Class1554(final Class7568 field8693, final int field8694, final int field8695, final double[][][] field8696, final boolean field8697) {
        this.field8693 = field8693;
        this.field8689 = field8694;
        this.field8690 = field8695;
        this.field8691 = field8696;
        this.field8692 = field8697;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7568.method23777(this.field8693)];
        for (int i = this.field8689; i < this.field8690; ++i) {
            for (int j = 0; j < Class7568.method23780(this.field8693); ++j) {
                for (int k = 0; k < Class7568.method23777(this.field8693); ++k) {
                    array[k] = this.field8691[i][k][j];
                }
                Class7568.method23781(this.field8693).method30721(array, this.field8692);
                for (int l = 0; l < Class7568.method23777(this.field8693); ++l) {
                    this.field8691[i][l][j] = array[l];
                }
            }
        }
    }
}
