// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1449 implements Runnable
{
    private static String[] field8029;
    public final /* synthetic */ int field8030;
    public final /* synthetic */ int field8031;
    public final /* synthetic */ float[][][] field8032;
    public final /* synthetic */ boolean field8033;
    public final /* synthetic */ Class9117 field8034;
    
    public Class1449(final Class9117 field8034, final int field8035, final int field8036, final float[][][] field8037, final boolean field8038) {
        this.field8034 = field8034;
        this.field8030 = field8035;
        this.field8031 = field8036;
        this.field8032 = field8037;
        this.field8033 = field8038;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class9117.method33008(this.field8034)];
        for (int i = this.field8030; i < this.field8031; ++i) {
            for (int j = 0; j < Class9117.method33006(this.field8034); ++j) {
                for (int k = 0; k < Class9117.method33008(this.field8034); ++k) {
                    array[k] = this.field8032[k][i][j];
                }
                Class9117.method33009(this.field8034).method29689(array, this.field8033);
                for (int l = 0; l < Class9117.method33008(this.field8034); ++l) {
                    this.field8032[l][i][j] = array[l];
                }
            }
        }
    }
}
