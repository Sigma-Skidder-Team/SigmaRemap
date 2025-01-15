// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1274 implements Runnable
{
    private static String[] field6956;
    public final /* synthetic */ int field6957;
    public final /* synthetic */ int field6958;
    public final /* synthetic */ double[][][] field6959;
    public final /* synthetic */ boolean field6960;
    public final /* synthetic */ Class7568 field6961;
    
    public Class1274(final Class7568 field6961, final int field6962, final int field6963, final double[][][] field6964, final boolean field6965) {
        this.field6961 = field6961;
        this.field6957 = field6962;
        this.field6958 = field6963;
        this.field6959 = field6964;
        this.field6960 = field6965;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7568.method23777(this.field6961)];
        for (int i = this.field6957; i < this.field6958; ++i) {
            for (int j = 0; j < Class7568.method23780(this.field6961); ++j) {
                for (int k = 0; k < Class7568.method23777(this.field6961); ++k) {
                    array[k] = this.field6959[i][k][j];
                }
                Class7568.method23781(this.field6961).method30725(array, this.field6960);
                for (int l = 0; l < Class7568.method23777(this.field6961); ++l) {
                    this.field6959[i][l][j] = array[l];
                }
            }
        }
    }
}
