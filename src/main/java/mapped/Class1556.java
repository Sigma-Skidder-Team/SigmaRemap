// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1556 implements Runnable
{
    private static String[] field8703;
    public final /* synthetic */ int field8704;
    public final /* synthetic */ int field8705;
    public final /* synthetic */ float[][][] field8706;
    public final /* synthetic */ boolean field8707;
    public final /* synthetic */ Class9117 field8708;
    
    public Class1556(final Class9117 field8708, final int field8709, final int field8710, final float[][][] field8711, final boolean field8712) {
        this.field8708 = field8708;
        this.field8704 = field8709;
        this.field8705 = field8710;
        this.field8706 = field8711;
        this.field8707 = field8712;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class9117.method33008(this.field8708)];
        for (int i = this.field8704; i < this.field8705; ++i) {
            for (int j = 0; j < Class9117.method33006(this.field8708); ++j) {
                for (int k = 0; k < Class9117.method33008(this.field8708); ++k) {
                    array[k] = this.field8706[k][i][j];
                }
                Class9117.method33009(this.field8708).method29693(array, this.field8707);
                for (int l = 0; l < Class9117.method33008(this.field8708); ++l) {
                    this.field8706[l][i][j] = array[l];
                }
            }
        }
    }
}
