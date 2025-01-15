// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1065 implements Runnable
{
    private static String[] field5729;
    public final /* synthetic */ int field5730;
    public final /* synthetic */ int field5731;
    public final /* synthetic */ int field5732;
    public final /* synthetic */ int field5733;
    public final /* synthetic */ float[][][] field5734;
    public final /* synthetic */ Class6362 field5735;
    
    public Class1065(final Class6362 field5735, final int field5736, final int field5737, final int field5738, final int field5739, final float[][][] field5740) {
        this.field5735 = field5735;
        this.field5730 = field5736;
        this.field5731 = field5737;
        this.field5732 = field5738;
        this.field5733 = field5739;
        this.field5734 = field5740;
    }
    
    @Override
    public void run() {
        for (int i = this.field5730; i < this.field5731; ++i) {
            final int n = (Class6362.method19003(this.field5735) - i) % Class6362.method19003(this.field5735);
            for (int j = 1; j < this.field5732; ++j) {
                final int n2 = Class6362.method18998(this.field5735) - j;
                for (int k = 0; k < Class6362.method19001(this.field5735); ++k) {
                    final int n3 = 2 * k;
                    final int n4 = this.field5733 - n3;
                    this.field5734[n][n2][n4 % this.field5733] = this.field5734[i][j][n3];
                    this.field5734[n][n2][(n4 + 1) % this.field5733] = -this.field5734[i][j][n3 + 1];
                }
            }
        }
    }
}
