// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1432 implements Runnable
{
    private static String[] field7922;
    public final /* synthetic */ int field7923;
    public final /* synthetic */ int field7924;
    public final /* synthetic */ double[][] field7925;
    public final /* synthetic */ boolean field7926;
    public final /* synthetic */ Class4406 field7927;
    
    public Class1432(final Class4406 field7927, final int field7928, final int field7929, final double[][] field7930, final boolean field7931) {
        this.field7927 = field7927;
        this.field7923 = field7928;
        this.field7924 = field7929;
        this.field7925 = field7930;
        this.field7926 = field7931;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class4406.method13334(this.field7927)];
        for (int i = this.field7923; i < this.field7924; ++i) {
            for (int j = 0; j < Class4406.method13334(this.field7927); ++j) {
                array[j] = this.field7925[j][i];
            }
            Class4406.method13335(this.field7927).method30721(array, this.field7926);
            for (int k = 0; k < Class4406.method13334(this.field7927); ++k) {
                this.field7925[k][i] = array[k];
            }
        }
    }
}
