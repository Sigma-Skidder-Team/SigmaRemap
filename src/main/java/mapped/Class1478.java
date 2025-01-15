// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1478 implements Runnable
{
    private static String[] field8207;
    public final /* synthetic */ int field8208;
    public final /* synthetic */ int field8209;
    public final /* synthetic */ float[][][] field8210;
    public final /* synthetic */ boolean field8211;
    public final /* synthetic */ Class6362 field8212;
    
    public Class1478(final Class6362 field8212, final int field8213, final int field8214, final float[][][] field8215, final boolean field8216) {
        this.field8212 = field8212;
        this.field8208 = field8213;
        this.field8209 = field8214;
        this.field8210 = field8215;
        this.field8211 = field8216;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method18998(this.field8212)];
        for (int i = this.field8208; i < this.field8209; ++i) {
            for (int j = 0; j < Class6362.method19001(this.field8212); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6362.method18998(this.field8212); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field8210[i][k][n];
                    array[n2 + 1] = this.field8210[i][k][n + 1];
                }
                Class6362.method19002(this.field8212).method25929(array, this.field8211);
                for (int l = 0; l < Class6362.method18998(this.field8212); ++l) {
                    final int n3 = 2 * l;
                    this.field8210[i][l][n] = array[n3];
                    this.field8210[i][l][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
