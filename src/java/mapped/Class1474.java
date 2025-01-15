// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1474 implements Runnable
{
    private static String[] field8183;
    public final /* synthetic */ int field8184;
    public final /* synthetic */ int field8185;
    public final /* synthetic */ double[] field8186;
    public final /* synthetic */ Class6733 field8187;
    
    public Class1474(final Class6733 field8187, final int field8188, final int field8189, final double[] field8190) {
        this.field8187 = field8187;
        this.field8184 = field8188;
        this.field8185 = field8189;
        this.field8186 = field8190;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20474(this.field8187)];
        for (int i = this.field8184; i < this.field8185; ++i) {
            final int n = i * Class6733.method20473(this.field8187);
            for (int j = 0; j < Class6733.method20477(this.field8187); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6733.method20474(this.field8187); ++k) {
                    final int n3 = n + n2 + k * Class6733.method20475(this.field8187);
                    final int n4 = 2 * k;
                    array[n4] = this.field8186[n3];
                    array[n4 + 1] = this.field8186[n3 + 1];
                }
                Class6733.method20478(this.field8187).method26072(array);
                for (int l = 0; l < Class6733.method20474(this.field8187); ++l) {
                    final int n5 = n + n2 + l * Class6733.method20475(this.field8187);
                    final int n6 = 2 * l;
                    this.field8186[n5] = array[n6];
                    this.field8186[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
