// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1209 implements Runnable
{
    private static String[] field6556;
    public final /* synthetic */ int field6557;
    public final /* synthetic */ int field6558;
    public final /* synthetic */ float[] field6559;
    public final /* synthetic */ boolean field6560;
    public final /* synthetic */ Class6498 field6561;
    
    public Class1209(final Class6498 field6561, final int field6562, final int field6563, final float[] field6564, final boolean field6565) {
        this.field6561 = field6561;
        this.field6557 = field6562;
        this.field6558 = field6563;
        this.field6559 = field6564;
        this.field6560 = field6565;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6498.method19570(this.field6561)];
        for (int i = this.field6557; i < this.field6558; ++i) {
            final int n = i * Class6498.method19566(this.field6561);
            for (int j = 0; j < Class6498.method19568(this.field6561); ++j) {
                for (int k = 0; k < Class6498.method19570(this.field6561); ++k) {
                    array[k] = this.field6559[k * Class6498.method19564(this.field6561) + n + j];
                }
                Class6498.method19571(this.field6561).method34185(array, this.field6560);
                for (int l = 0; l < Class6498.method19570(this.field6561); ++l) {
                    this.field6559[l * Class6498.method19564(this.field6561) + n + j] = array[l];
                }
            }
        }
    }
}
