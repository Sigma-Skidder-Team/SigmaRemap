// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class997 implements Runnable
{
    private static String[] field5320;
    public final /* synthetic */ int field5321;
    public final /* synthetic */ int field5322;
    public final /* synthetic */ int field5323;
    public final /* synthetic */ int field5324;
    public final /* synthetic */ double[] field5325;
    public final /* synthetic */ boolean field5326;
    public final /* synthetic */ Class6733 field5327;
    
    public Class997(final Class6733 field5327, final int field5328, final int field5329, final int field5330, final int field5331, final double[] field5332, final boolean field5333) {
        this.field5327 = field5327;
        this.field5321 = field5328;
        this.field5322 = field5329;
        this.field5323 = field5330;
        this.field5324 = field5331;
        this.field5325 = field5332;
        this.field5326 = field5333;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20474(this.field5327)];
        for (int i = this.field5321; i < this.field5322; ++i) {
            final int n = i * this.field5323;
            for (int j = 0; j < Class6733.method20477(this.field5327); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6733.method20474(this.field5327); ++k) {
                    final int n3 = n + k * this.field5324 + n2;
                    final int n4 = 2 * k;
                    array[n4] = this.field5325[n3];
                    array[n4 + 1] = this.field5325[n3 + 1];
                }
                Class6733.method20478(this.field5327).method26076(array, this.field5326);
                for (int l = 0; l < Class6733.method20474(this.field5327); ++l) {
                    final int n5 = n + l * this.field5324 + n2;
                    final int n6 = 2 * l;
                    this.field5325[n5] = array[n6];
                    this.field5325[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
