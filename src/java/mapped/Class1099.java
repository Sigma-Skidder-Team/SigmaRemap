// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1099 implements Runnable
{
    private static String[] field5935;
    public final /* synthetic */ int field5936;
    public final /* synthetic */ int field5937;
    public final /* synthetic */ double[] field5938;
    public final /* synthetic */ boolean field5939;
    public final /* synthetic */ Class7568 field5940;
    
    public Class1099(final Class7568 field5940, final int field5941, final int field5942, final double[] field5943, final boolean field5944) {
        this.field5940 = field5940;
        this.field5936 = field5941;
        this.field5937 = field5942;
        this.field5938 = field5943;
        this.field5939 = field5944;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7568.method23777(this.field5940)];
        for (int i = this.field5936; i < this.field5937; ++i) {
            final int n = i * Class7568.method23776(this.field5940);
            for (int j = 0; j < Class7568.method23780(this.field5940); ++j) {
                for (int k = 0; k < Class7568.method23777(this.field5940); ++k) {
                    array[k] = this.field5938[n + k * Class7568.method23778(this.field5940) + j];
                }
                Class7568.method23781(this.field5940).method30725(array, this.field5939);
                for (int l = 0; l < Class7568.method23777(this.field5940); ++l) {
                    this.field5938[n + l * Class7568.method23778(this.field5940) + j] = array[l];
                }
            }
        }
    }
}
