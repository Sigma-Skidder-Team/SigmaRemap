// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1529 implements Runnable
{
    private static String[] field8533;
    public final /* synthetic */ int field8534;
    public final /* synthetic */ int field8535;
    public final /* synthetic */ float[][][] field8536;
    public final /* synthetic */ boolean field8537;
    public final /* synthetic */ Class6362 field8538;
    
    public Class1529(final Class6362 field8538, final int field8539, final int field8540, final float[][][] field8541, final boolean field8542) {
        this.field8538 = field8538;
        this.field8534 = field8539;
        this.field8535 = field8540;
        this.field8536 = field8541;
        this.field8537 = field8542;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method18998(this.field8538)];
        for (int i = this.field8534; i < this.field8535; ++i) {
            for (int j = 0; j < Class6362.method19001(this.field8538); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6362.method18998(this.field8538); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field8536[i][k][n];
                    array[n2 + 1] = this.field8536[i][k][n + 1];
                }
                Class6362.method19002(this.field8538).method25929(array, this.field8537);
                for (int l = 0; l < Class6362.method18998(this.field8538); ++l) {
                    final int n3 = 2 * l;
                    this.field8536[i][l][n] = array[n3];
                    this.field8536[i][l][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
