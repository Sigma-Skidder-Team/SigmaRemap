// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1054 implements Runnable
{
    private static String[] field5656;
    public final /* synthetic */ int field5657;
    public final /* synthetic */ int field5658;
    public final /* synthetic */ int field5659;
    public final /* synthetic */ int field5660;
    public final /* synthetic */ float[][][] field5661;
    public final /* synthetic */ Class6362 field5662;
    
    public Class1054(final Class6362 field5662, final int field5663, final int field5664, final int field5665, final int field5666, final float[][][] field5667) {
        this.field5662 = field5662;
        this.field5657 = field5663;
        this.field5658 = field5664;
        this.field5659 = field5665;
        this.field5660 = field5666;
        this.field5661 = field5667;
    }
    
    @Override
    public void run() {
        for (int i = this.field5657; i < this.field5658; ++i) {
            final int n = (Class6362.method19003(this.field5662) - i) % Class6362.method19003(this.field5662);
            for (int j = 1; j < this.field5659; ++j) {
                final int n2 = Class6362.method18998(this.field5662) - j;
                for (int k = 0; k < Class6362.method19001(this.field5662); ++k) {
                    final int n3 = 2 * k;
                    final int n4 = this.field5660 - n3;
                    this.field5661[n][n2][n4 % this.field5660] = this.field5661[i][j][n3];
                    this.field5661[n][n2][(n4 + 1) % this.field5660] = -this.field5661[i][j][n3 + 1];
                }
            }
        }
    }
}
