// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class990 implements Runnable
{
    private static String[] field5276;
    public final /* synthetic */ int field5277;
    public final /* synthetic */ int field5278;
    public final /* synthetic */ float[] field5279;
    public final /* synthetic */ boolean field5280;
    public final /* synthetic */ Class6498 field5281;
    
    public Class990(final Class6498 field5281, final int field5282, final int field5283, final float[] field5284, final boolean field5285) {
        this.field5281 = field5281;
        this.field5277 = field5282;
        this.field5278 = field5283;
        this.field5279 = field5284;
        this.field5280 = field5285;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6498.method19570(this.field5281)];
        for (int i = this.field5277; i < this.field5278; ++i) {
            final int n = i * Class6498.method19566(this.field5281);
            for (int j = 0; j < Class6498.method19568(this.field5281); ++j) {
                for (int k = 0; k < Class6498.method19570(this.field5281); ++k) {
                    array[k] = this.field5279[k * Class6498.method19564(this.field5281) + n + j];
                }
                Class6498.method19571(this.field5281).method34181(array, this.field5280);
                for (int l = 0; l < Class6498.method19570(this.field5281); ++l) {
                    this.field5279[l * Class6498.method19564(this.field5281) + n + j] = array[l];
                }
            }
        }
    }
}
