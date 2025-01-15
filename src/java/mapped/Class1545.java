// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1545 implements Runnable
{
    private static String[] field8628;
    public final /* synthetic */ int field8629;
    public final /* synthetic */ int field8630;
    public final /* synthetic */ float[][][] field8631;
    public final /* synthetic */ Class5934 field8632;
    
    public Class1545(final Class5934 field8632, final int field8633, final int field8634, final float[][][] field8635) {
        this.field8632 = field8632;
        this.field8629 = field8633;
        this.field8630 = field8634;
        this.field8631 = field8635;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class5934.method17843(this.field8632)];
        for (int i = this.field8629; i < this.field8630; ++i) {
            for (int j = 0; j < Class5934.method17841(this.field8632); ++j) {
                for (int k = 0; k < Class5934.method17843(this.field8632); ++k) {
                    array[k] = this.field8631[k][i][j];
                }
                Class5934.method17844(this.field8632).method30445(array);
                for (int l = 0; l < Class5934.method17843(this.field8632); ++l) {
                    this.field8631[l][i][j] = array[l];
                }
            }
        }
    }
}
