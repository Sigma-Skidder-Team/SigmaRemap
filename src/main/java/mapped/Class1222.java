// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1222 implements Runnable
{
    private static String[] field6639;
    public final /* synthetic */ int field6640;
    public final /* synthetic */ int field6641;
    public final /* synthetic */ double[][][] field6642;
    public final /* synthetic */ boolean field6643;
    public final /* synthetic */ Class7796 field6644;
    
    public Class1222(final Class7796 field6644, final int field6645, final int field6646, final double[][][] field6647, final boolean field6648) {
        this.field6644 = field6644;
        this.field6640 = field6645;
        this.field6641 = field6646;
        this.field6642 = field6647;
        this.field6643 = field6648;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7796.method25149(this.field6644)];
        for (int i = this.field6640; i < this.field6641; ++i) {
            for (int j = 0; j < Class7796.method25147(this.field6644); ++j) {
                for (int k = 0; k < Class7796.method25149(this.field6644); ++k) {
                    array[k] = this.field6642[k][i][j];
                }
                Class7796.method25150(this.field6644).method18036(array, this.field6643);
                for (int l = 0; l < Class7796.method25149(this.field6644); ++l) {
                    this.field6642[l][i][j] = array[l];
                }
            }
        }
    }
}
