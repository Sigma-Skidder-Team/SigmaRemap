// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1451 implements Runnable
{
    private static String[] field8040;
    public final /* synthetic */ int field8041;
    public final /* synthetic */ int field8042;
    public final /* synthetic */ float[][][] field8043;
    public final /* synthetic */ Class6362 field8044;
    
    public Class1451(final Class6362 field8044, final int field8045, final int field8046, final float[][][] field8047) {
        this.field8044 = field8044;
        this.field8041 = field8045;
        this.field8042 = field8046;
        this.field8043 = field8047;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method18998(this.field8044)];
        for (int i = this.field8041; i < this.field8042; ++i) {
            for (int j = 0; j < Class6362.method19001(this.field8044); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6362.method18998(this.field8044); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field8043[i][k][n];
                    array[n2 + 1] = this.field8043[i][k][n + 1];
                }
                Class6362.method19002(this.field8044).method25925(array);
                for (int l = 0; l < Class6362.method18998(this.field8044); ++l) {
                    final int n3 = 2 * l;
                    this.field8043[i][l][n] = array[n3];
                    this.field8043[i][l][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
