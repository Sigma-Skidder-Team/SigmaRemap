// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1137 implements Runnable
{
    private static String[] field6144;
    public final /* synthetic */ int field6145;
    public final /* synthetic */ int field6146;
    public final /* synthetic */ double[][][] field6147;
    public final /* synthetic */ boolean field6148;
    public final /* synthetic */ Class7568 field6149;
    
    public Class1137(final Class7568 field6149, final int field6150, final int field6151, final double[][][] field6152, final boolean field6153) {
        this.field6149 = field6149;
        this.field6145 = field6150;
        this.field6146 = field6151;
        this.field6147 = field6152;
        this.field6148 = field6153;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7568.method23782(this.field6149)];
        for (int i = this.field6145; i < this.field6146; ++i) {
            for (int j = 0; j < Class7568.method23780(this.field6149); ++j) {
                for (int k = 0; k < Class7568.method23782(this.field6149); ++k) {
                    array[k] = this.field6147[k][i][j];
                }
                Class7568.method23783(this.field6149).method30721(array, this.field6148);
                for (int l = 0; l < Class7568.method23782(this.field6149); ++l) {
                    this.field6147[l][i][j] = array[l];
                }
            }
        }
    }
}
