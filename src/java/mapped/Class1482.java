// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1482 implements Runnable
{
    private static String[] field8235;
    public final /* synthetic */ int field8236;
    public final /* synthetic */ int field8237;
    public final /* synthetic */ double[] field8238;
    public final /* synthetic */ Class6733 field8239;
    
    public Class1482(final Class6733 field8239, final int field8240, final int field8241, final double[] field8242) {
        this.field8239 = field8239;
        this.field8236 = field8240;
        this.field8237 = field8241;
        this.field8238 = field8242;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20479(this.field8239)];
        for (int i = this.field8236; i < this.field8237; ++i) {
            final int n = i * Class6733.method20475(this.field8239);
            for (int j = 0; j < Class6733.method20477(this.field8239); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6733.method20479(this.field8239); ++k) {
                    final int n3 = k * Class6733.method20473(this.field8239) + n + n2;
                    final int n4 = 2 * k;
                    array[n4] = this.field8238[n3];
                    array[n4 + 1] = this.field8238[n3 + 1];
                }
                Class6733.method20480(this.field8239).method26072(array);
                for (int l = 0; l < Class6733.method20479(this.field8239); ++l) {
                    final int n5 = l * Class6733.method20473(this.field8239) + n + n2;
                    final int n6 = 2 * l;
                    this.field8238[n5] = array[n6];
                    this.field8238[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
