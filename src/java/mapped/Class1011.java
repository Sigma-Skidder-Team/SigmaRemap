// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1011 implements Runnable
{
    private static String[] field5400;
    public final /* synthetic */ int field5401;
    public final /* synthetic */ int field5402;
    public final /* synthetic */ int field5403;
    public final /* synthetic */ int field5404;
    public final /* synthetic */ double[] field5405;
    public final /* synthetic */ boolean field5406;
    public final /* synthetic */ Class6733 field5407;
    
    public Class1011(final Class6733 field5407, final int field5408, final int field5409, final int field5410, final int field5411, final double[] field5412, final boolean field5413) {
        this.field5407 = field5407;
        this.field5401 = field5408;
        this.field5402 = field5409;
        this.field5403 = field5410;
        this.field5404 = field5411;
        this.field5405 = field5412;
        this.field5406 = field5413;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20479(this.field5407)];
        for (int i = this.field5401; i < this.field5402; ++i) {
            final int n = i * this.field5403;
            for (int j = 0; j < Class6733.method20477(this.field5407); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6733.method20479(this.field5407); ++k) {
                    final int n3 = 2 * k;
                    final int n4 = k * this.field5404 + n + n2;
                    array[n3] = this.field5405[n4];
                    array[n3 + 1] = this.field5405[n4 + 1];
                }
                Class6733.method20480(this.field5407).method26076(array, this.field5406);
                for (int l = 0; l < Class6733.method20479(this.field5407); ++l) {
                    final int n5 = 2 * l;
                    final int n6 = l * this.field5404 + n + n2;
                    this.field5405[n6] = array[n5];
                    this.field5405[n6 + 1] = array[n5 + 1];
                }
            }
        }
    }
}
