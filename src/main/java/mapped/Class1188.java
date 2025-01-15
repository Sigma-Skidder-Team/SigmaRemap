// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1188 implements Runnable
{
    private static String[] field6436;
    public final /* synthetic */ int field6437;
    public final /* synthetic */ int field6438;
    public final /* synthetic */ double[][][] field6439;
    public final /* synthetic */ Class5815 field6440;
    
    public Class1188(final Class5815 field6440, final int field6441, final int field6442, final double[][][] field6443) {
        this.field6440 = field6440;
        this.field6437 = field6441;
        this.field6438 = field6442;
        this.field6439 = field6443;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class5815.method17503(this.field6440)];
        for (int i = this.field6437; i < this.field6438; ++i) {
            for (int j = 0; j < Class5815.method17501(this.field6440); ++j) {
                for (int k = 0; k < Class5815.method17503(this.field6440); ++k) {
                    array[k] = this.field6439[k][i][j];
                }
                Class5815.method17504(this.field6440).method21386(array);
                for (int l = 0; l < Class5815.method17503(this.field6440); ++l) {
                    this.field6439[l][i][j] = array[l];
                }
            }
        }
    }
}
