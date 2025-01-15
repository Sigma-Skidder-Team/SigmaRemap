// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1572 implements Runnable
{
    private static String[] field8803;
    public final /* synthetic */ int field8804;
    public final /* synthetic */ int field8805;
    public final /* synthetic */ float[] field8806;
    public final /* synthetic */ Class5934 field8807;
    
    public Class1572(final Class5934 field8807, final int field8808, final int field8809, final float[] field8810) {
        this.field8807 = field8807;
        this.field8804 = field8808;
        this.field8805 = field8809;
        this.field8806 = field8810;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class5934.method17838(this.field8807)];
        for (int i = this.field8804; i < this.field8805; ++i) {
            final int n = i * Class5934.method17837(this.field8807);
            for (int j = 0; j < Class5934.method17841(this.field8807); ++j) {
                for (int k = 0; k < Class5934.method17838(this.field8807); ++k) {
                    array[k] = this.field8806[n + k * Class5934.method17839(this.field8807) + j];
                }
                Class5934.method17842(this.field8807).method30445(array);
                for (int l = 0; l < Class5934.method17838(this.field8807); ++l) {
                    this.field8806[n + l * Class5934.method17839(this.field8807) + j] = array[l];
                }
            }
        }
    }
}
