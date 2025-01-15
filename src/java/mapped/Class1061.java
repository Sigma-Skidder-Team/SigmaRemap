// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1061 implements Runnable
{
    private static String[] field5705;
    public final /* synthetic */ int field5706;
    public final /* synthetic */ int field5707;
    public final /* synthetic */ double[][][] field5708;
    public final /* synthetic */ boolean field5709;
    public final /* synthetic */ Class7796 field5710;
    
    public Class1061(final Class7796 field5710, final int field5711, final int field5712, final double[][][] field5713, final boolean field5714) {
        this.field5710 = field5710;
        this.field5706 = field5711;
        this.field5707 = field5712;
        this.field5708 = field5713;
        this.field5709 = field5714;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7796.method25144(this.field5710)];
        for (int i = this.field5706; i < this.field5707; ++i) {
            for (int j = 0; j < Class7796.method25147(this.field5710); ++j) {
                for (int k = 0; k < Class7796.method25144(this.field5710); ++k) {
                    array[k] = this.field5708[i][k][j];
                }
                Class7796.method25148(this.field5710).method18036(array, this.field5709);
                for (int l = 0; l < Class7796.method25144(this.field5710); ++l) {
                    this.field5708[i][l][j] = array[l];
                }
            }
        }
    }
}
