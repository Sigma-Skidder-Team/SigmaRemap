// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1568 implements Runnable
{
    private static String[] field8777;
    public final /* synthetic */ int field8778;
    public final /* synthetic */ int field8779;
    public final /* synthetic */ float[] field8780;
    public final /* synthetic */ boolean field8781;
    public final /* synthetic */ Class6498 field8782;
    
    public Class1568(final Class6498 field8782, final int field8783, final int field8784, final float[] field8785, final boolean field8786) {
        this.field8782 = field8782;
        this.field8778 = field8783;
        this.field8779 = field8784;
        this.field8780 = field8785;
        this.field8781 = field8786;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6498.method19565(this.field8782)];
        for (int i = this.field8778; i < this.field8779; ++i) {
            final int n = i * Class6498.method19564(this.field8782);
            for (int j = 0; j < Class6498.method19568(this.field8782); ++j) {
                for (int k = 0; k < Class6498.method19565(this.field8782); ++k) {
                    array[k] = this.field8780[n + k * Class6498.method19566(this.field8782) + j];
                }
                Class6498.method19569(this.field8782).method34185(array, this.field8781);
                for (int l = 0; l < Class6498.method19565(this.field8782); ++l) {
                    this.field8780[n + l * Class6498.method19566(this.field8782) + j] = array[l];
                }
            }
        }
    }
}
