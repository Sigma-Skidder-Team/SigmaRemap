// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1236 implements Runnable
{
    private static String[] field6722;
    public final /* synthetic */ int field6723;
    public final /* synthetic */ int field6724;
    public final /* synthetic */ int field6725;
    public final /* synthetic */ float[][][] field6726;
    public final /* synthetic */ Class6362 field6727;
    
    public Class1236(final Class6362 field6727, final int field6728, final int field6729, final int field6730, final float[][][] field6731) {
        this.field6727 = field6727;
        this.field6723 = field6728;
        this.field6724 = field6729;
        this.field6725 = field6730;
        this.field6726 = field6731;
    }
    
    @Override
    public void run() {
        for (int i = this.field6723; i < this.field6724; ++i) {
            final int n = (Class6362.method19003(this.field6727) - i) % Class6362.method19003(this.field6727);
            for (int j = 0; j < Class6362.method18998(this.field6727); ++j) {
                final int n2 = (Class6362.method18998(this.field6727) - j) % Class6362.method18998(this.field6727);
                for (int k = 1; k < Class6362.method19001(this.field6727); k += 2) {
                    final int n3 = this.field6725 - k;
                    this.field6726[n][n2][n3] = -this.field6726[i][j][k + 2];
                    this.field6726[n][n2][n3 - 1] = this.field6726[i][j][k + 1];
                }
            }
        }
    }
}
