// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1151 implements Runnable
{
    private static String[] field6228;
    public final /* synthetic */ int field6229;
    public final /* synthetic */ int field6230;
    public final /* synthetic */ int field6231;
    public final /* synthetic */ int field6232;
    public final /* synthetic */ double[] field6233;
    public final /* synthetic */ Class6733 field6234;
    
    public Class1151(final Class6733 field6234, final int field6235, final int field6236, final int field6237, final int field6238, final double[] field6239) {
        this.field6234 = field6234;
        this.field6229 = field6235;
        this.field6230 = field6236;
        this.field6231 = field6237;
        this.field6232 = field6238;
        this.field6233 = field6239;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20479(this.field6234)];
        for (int i = this.field6229; i < this.field6230; ++i) {
            final int n = i * this.field6231;
            for (int j = 0; j < Class6733.method20477(this.field6234); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6733.method20479(this.field6234); ++k) {
                    final int n3 = 2 * k;
                    final int n4 = k * this.field6232 + n + n2;
                    array[n3] = this.field6233[n4];
                    array[n3 + 1] = this.field6233[n4 + 1];
                }
                Class6733.method20480(this.field6234).method26072(array);
                for (int l = 0; l < Class6733.method20479(this.field6234); ++l) {
                    final int n5 = 2 * l;
                    final int n6 = l * this.field6232 + n + n2;
                    this.field6233[n6] = array[n5];
                    this.field6233[n6 + 1] = array[n5 + 1];
                }
            }
        }
    }
}
