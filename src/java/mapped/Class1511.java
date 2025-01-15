// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1511 implements Runnable
{
    private static String[] field8413;
    public final /* synthetic */ int field8414;
    public final /* synthetic */ int field8415;
    public final /* synthetic */ float[][][] field8416;
    public final /* synthetic */ boolean field8417;
    public final /* synthetic */ Class5934 field8418;
    
    public Class1511(final Class5934 field8418, final int field8419, final int field8420, final float[][][] field8421, final boolean field8422) {
        this.field8418 = field8418;
        this.field8414 = field8419;
        this.field8415 = field8420;
        this.field8416 = field8421;
        this.field8417 = field8422;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class5934.method17843(this.field8418)];
        for (int i = this.field8414; i < this.field8415; ++i) {
            for (int j = 0; j < Class5934.method17841(this.field8418); ++j) {
                for (int k = 0; k < Class5934.method17843(this.field8418); ++k) {
                    array[k] = this.field8416[k][i][j];
                }
                Class5934.method17844(this.field8418).method30449(array, this.field8417);
                for (int l = 0; l < Class5934.method17843(this.field8418); ++l) {
                    this.field8416[l][i][j] = array[l];
                }
            }
        }
    }
}
