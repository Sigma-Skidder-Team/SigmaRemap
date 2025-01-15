// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1429 implements Runnable
{
    private static String[] field7902;
    public final /* synthetic */ int field7903;
    public final /* synthetic */ int field7904;
    public final /* synthetic */ double[] field7905;
    public final /* synthetic */ boolean field7906;
    public final /* synthetic */ Class6733 field7907;
    
    public Class1429(final Class6733 field7907, final int field7908, final int field7909, final double[] field7910, final boolean field7911) {
        this.field7907 = field7907;
        this.field7903 = field7908;
        this.field7904 = field7909;
        this.field7905 = field7910;
        this.field7906 = field7911;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20474(this.field7907)];
        for (int i = this.field7903; i < this.field7904; ++i) {
            final int n = i * Class6733.method20473(this.field7907);
            for (int j = 0; j < Class6733.method20477(this.field7907); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6733.method20474(this.field7907); ++k) {
                    final int n3 = n + n2 + k * Class6733.method20475(this.field7907);
                    final int n4 = 2 * k;
                    array[n4] = this.field7905[n3];
                    array[n4 + 1] = this.field7905[n3 + 1];
                }
                Class6733.method20478(this.field7907).method26076(array, this.field7906);
                for (int l = 0; l < Class6733.method20474(this.field7907); ++l) {
                    final int n5 = n + n2 + l * Class6733.method20475(this.field7907);
                    final int n6 = 2 * l;
                    this.field7905[n5] = array[n6];
                    this.field7905[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
