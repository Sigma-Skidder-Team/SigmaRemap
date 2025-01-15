// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1261 implements Runnable
{
    private static String[] field6874;
    public final /* synthetic */ int field6875;
    public final /* synthetic */ int field6876;
    public final /* synthetic */ double[][] field6877;
    public final /* synthetic */ Class8983 field6878;
    
    public Class1261(final Class8983 field6878, final int field6879, final int field6880, final double[][] field6881) {
        this.field6878 = field6878;
        this.field6875 = field6879;
        this.field6876 = field6880;
        this.field6877 = field6881;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class8983.method31976(this.field6878)];
        for (int i = this.field6875; i < this.field6876; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8983.method31976(this.field6878); ++j) {
                final int n2 = 2 * j;
                array[n2] = this.field6877[j][n];
                array[n2 + 1] = this.field6877[j][n + 1];
            }
            Class8983.method31977(this.field6878).method26072(array);
            for (int k = 0; k < Class8983.method31976(this.field6878); ++k) {
                final int n3 = 2 * k;
                this.field6877[k][n] = array[n3];
                this.field6877[k][n + 1] = array[n3 + 1];
            }
        }
    }
}
