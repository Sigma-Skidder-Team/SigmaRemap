// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1419 implements Runnable
{
    private static String[] field7843;
    public final /* synthetic */ int field7844;
    public final /* synthetic */ int field7845;
    public final /* synthetic */ float[][] field7846;
    public final /* synthetic */ boolean field7847;
    public final /* synthetic */ Class8328 field7848;
    
    public Class1419(final Class8328 field7848, final int field7849, final int field7850, final float[][] field7851, final boolean field7852) {
        this.field7848 = field7848;
        this.field7844 = field7849;
        this.field7845 = field7850;
        this.field7846 = field7851;
        this.field7847 = field7852;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class8328.method27760(this.field7848)];
        for (int i = this.field7844; i < this.field7845; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8328.method27760(this.field7848); ++j) {
                final int n2 = 2 * j;
                array[n2] = this.field7846[j][n];
                array[n2 + 1] = this.field7846[j][n + 1];
            }
            Class8328.method27761(this.field7848).method25929(array, this.field7847);
            for (int k = 0; k < Class8328.method27760(this.field7848); ++k) {
                final int n3 = 2 * k;
                this.field7846[k][n] = array[n3];
                this.field7846[k][n + 1] = array[n3 + 1];
            }
        }
    }
}
