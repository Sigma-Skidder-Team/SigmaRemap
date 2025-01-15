// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1573 implements Runnable
{
    private static String[] field8808;
    public final /* synthetic */ int field8809;
    public final /* synthetic */ int field8810;
    public final /* synthetic */ float[] field8811;
    public final /* synthetic */ boolean field8812;
    public final /* synthetic */ Class9117 field8813;
    
    public Class1573(final Class9117 field8813, final int field8814, final int field8815, final float[] field8816, final boolean field8817) {
        this.field8813 = field8813;
        this.field8809 = field8814;
        this.field8810 = field8815;
        this.field8811 = field8816;
        this.field8812 = field8817;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class9117.method33003(this.field8813)];
        for (int i = this.field8809; i < this.field8810; ++i) {
            final int n = i * Class9117.method33002(this.field8813);
            for (int j = 0; j < Class9117.method33006(this.field8813); ++j) {
                for (int k = 0; k < Class9117.method33003(this.field8813); ++k) {
                    array[k] = this.field8811[n + k * Class9117.method33004(this.field8813) + j];
                }
                Class9117.method33007(this.field8813).method29689(array, this.field8812);
                for (int l = 0; l < Class9117.method33003(this.field8813); ++l) {
                    this.field8811[n + l * Class9117.method33004(this.field8813) + j] = array[l];
                }
            }
        }
    }
}
