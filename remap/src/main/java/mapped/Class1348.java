// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1348 implements Runnable
{
    private static String[] field7376;
    public final /* synthetic */ int field7377;
    public final /* synthetic */ int field7378;
    public final /* synthetic */ double[][] field7379;
    public final /* synthetic */ boolean field7380;
    public final /* synthetic */ Class4406 field7381;
    
    public Class1348(final Class4406 field7381, final int field7382, final int field7383, final double[][] field7384, final boolean field7385) {
        this.field7381 = field7381;
        this.field7377 = field7382;
        this.field7378 = field7383;
        this.field7379 = field7384;
        this.field7380 = field7385;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class4406.method13334(this.field7381)];
        for (int i = this.field7377; i < this.field7378; ++i) {
            for (int j = 0; j < Class4406.method13334(this.field7381); ++j) {
                array[j] = this.field7379[j][i];
            }
            Class4406.method13335(this.field7381).method30725(array, this.field7380);
            for (int k = 0; k < Class4406.method13334(this.field7381); ++k) {
                this.field7379[k][i] = array[k];
            }
        }
    }
}
