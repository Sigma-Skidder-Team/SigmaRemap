// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1265 implements Runnable
{
    private static String[] field6898;
    public final /* synthetic */ int field6899;
    public final /* synthetic */ int field6900;
    public final /* synthetic */ float[][][] field6901;
    public final /* synthetic */ Class6362 field6902;
    
    public Class1265(final Class6362 field6902, final int field6903, final int field6904, final float[][][] field6905) {
        this.field6902 = field6902;
        this.field6899 = field6903;
        this.field6900 = field6904;
        this.field6901 = field6905;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method18998(this.field6902)];
        for (int i = this.field6899; i < this.field6900; ++i) {
            for (int j = 0; j < Class6362.method19001(this.field6902); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6362.method18998(this.field6902); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field6901[i][k][n];
                    array[n2 + 1] = this.field6901[i][k][n + 1];
                }
                Class6362.method19002(this.field6902).method25925(array);
                for (int l = 0; l < Class6362.method18998(this.field6902); ++l) {
                    final int n3 = 2 * l;
                    this.field6901[i][l][n] = array[n3];
                    this.field6901[i][l][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
