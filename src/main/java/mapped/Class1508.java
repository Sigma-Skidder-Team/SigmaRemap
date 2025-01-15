// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1508 implements Runnable
{
    private static String[] field8394;
    public final /* synthetic */ int field8395;
    public final /* synthetic */ int field8396;
    public final /* synthetic */ double[] field8397;
    public final /* synthetic */ boolean field8398;
    public final /* synthetic */ Class6733 field8399;
    
    public Class1508(final Class6733 field8399, final int field8400, final int field8401, final double[] field8402, final boolean field8403) {
        this.field8399 = field8399;
        this.field8395 = field8400;
        this.field8396 = field8401;
        this.field8397 = field8402;
        this.field8398 = field8403;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20479(this.field8399)];
        for (int i = this.field8395; i < this.field8396; ++i) {
            final int n = i * Class6733.method20475(this.field8399);
            for (int j = 0; j < Class6733.method20477(this.field8399); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6733.method20479(this.field8399); ++k) {
                    final int n3 = k * Class6733.method20473(this.field8399) + n + n2;
                    final int n4 = 2 * k;
                    array[n4] = this.field8397[n3];
                    array[n4 + 1] = this.field8397[n3 + 1];
                }
                Class6733.method20480(this.field8399).method26076(array, this.field8398);
                for (int l = 0; l < Class6733.method20479(this.field8399); ++l) {
                    final int n5 = l * Class6733.method20473(this.field8399) + n + n2;
                    final int n6 = 2 * l;
                    this.field8397[n5] = array[n6];
                    this.field8397[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
