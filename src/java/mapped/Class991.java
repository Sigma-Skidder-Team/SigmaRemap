// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class991 implements Runnable
{
    private static String[] field5282;
    public final /* synthetic */ int field5283;
    public final /* synthetic */ int field5284;
    public final /* synthetic */ double[][] field5285;
    public final /* synthetic */ boolean field5286;
    public final /* synthetic */ Class8983 field5287;
    
    public Class991(final Class8983 field5287, final int field5288, final int field5289, final double[][] field5290, final boolean field5291) {
        this.field5287 = field5287;
        this.field5283 = field5288;
        this.field5284 = field5289;
        this.field5285 = field5290;
        this.field5286 = field5291;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class8983.method31976(this.field5287)];
        for (int i = this.field5283; i < this.field5284; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8983.method31976(this.field5287); ++j) {
                final int n2 = 2 * j;
                array[n2] = this.field5285[j][n];
                array[n2 + 1] = this.field5285[j][n + 1];
            }
            Class8983.method31977(this.field5287).method26076(array, this.field5286);
            for (int k = 0; k < Class8983.method31976(this.field5287); ++k) {
                final int n3 = 2 * k;
                this.field5285[k][n] = array[n3];
                this.field5285[k][n + 1] = array[n3 + 1];
            }
        }
    }
}
