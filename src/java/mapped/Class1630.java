// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1630 implements Runnable
{
    private static String[] field9113;
    public final /* synthetic */ int field9114;
    public final /* synthetic */ int field9115;
    public final /* synthetic */ float[][][] field9116;
    public final /* synthetic */ Class6362 field9117;
    
    public Class1630(final Class6362 field9117, final int field9118, final int field9119, final float[][][] field9120) {
        this.field9117 = field9117;
        this.field9114 = field9118;
        this.field9115 = field9119;
        this.field9116 = field9120;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method19003(this.field9117)];
        for (int i = this.field9114; i < this.field9115; ++i) {
            for (int j = 0; j < Class6362.method19001(this.field9117); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6362.method19003(this.field9117); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field9116[k][i][n];
                    array[n2 + 1] = this.field9116[k][i][n + 1];
                }
                Class6362.method19004(this.field9117).method25925(array);
                for (int l = 0; l < Class6362.method19003(this.field9117); ++l) {
                    final int n3 = 2 * l;
                    this.field9116[l][i][n] = array[n3];
                    this.field9116[l][i][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
