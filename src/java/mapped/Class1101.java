// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1101 implements Runnable
{
    private static String[] field5944;
    public final /* synthetic */ int field5945;
    public final /* synthetic */ int field5946;
    public final /* synthetic */ double[][] field5947;
    public final /* synthetic */ boolean field5948;
    public final /* synthetic */ Class8788 field5949;
    
    public Class1101(final Class8788 field5949, final int field5950, final int field5951, final double[][] field5952, final boolean field5953) {
        this.field5949 = field5949;
        this.field5945 = field5950;
        this.field5946 = field5951;
        this.field5947 = field5952;
        this.field5948 = field5953;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class8788.method30612(this.field5949)];
        for (int i = this.field5945; i < this.field5946; ++i) {
            for (int j = 0; j < Class8788.method30612(this.field5949); ++j) {
                array[j] = this.field5947[j][i];
            }
            Class8788.method30613(this.field5949).method21390(array, this.field5948);
            for (int k = 0; k < Class8788.method30612(this.field5949); ++k) {
                this.field5947[k][i] = array[k];
            }
        }
    }
}
