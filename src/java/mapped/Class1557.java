// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1557 implements Runnable
{
    private static String[] field8709;
    public final /* synthetic */ int field8710;
    public final /* synthetic */ int field8711;
    public final /* synthetic */ float[][][] field8712;
    public final /* synthetic */ boolean field8713;
    public final /* synthetic */ Class6362 field8714;
    
    public Class1557(final Class6362 field8714, final int field8715, final int field8716, final float[][][] field8717, final boolean field8718) {
        this.field8714 = field8714;
        this.field8710 = field8715;
        this.field8711 = field8716;
        this.field8712 = field8717;
        this.field8713 = field8718;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method19003(this.field8714)];
        for (int i = this.field8710; i < this.field8711; ++i) {
            for (int j = 0; j < Class6362.method19001(this.field8714); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6362.method19003(this.field8714); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field8712[k][i][n];
                    array[n2 + 1] = this.field8712[k][i][n + 1];
                }
                Class6362.method19004(this.field8714).method25929(array, this.field8713);
                for (int l = 0; l < Class6362.method19003(this.field8714); ++l) {
                    final int n3 = 2 * l;
                    this.field8712[l][i][n] = array[n3];
                    this.field8712[l][i][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
