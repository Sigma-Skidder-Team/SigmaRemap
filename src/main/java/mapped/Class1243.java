// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1243 implements Runnable
{
    private static String[] field6760;
    public final /* synthetic */ int field6761;
    public final /* synthetic */ int field6762;
    public final /* synthetic */ int field6763;
    public final /* synthetic */ double[][][] field6764;
    public final /* synthetic */ Class6733 field6765;
    
    public Class1243(final Class6733 field6765, final int field6766, final int field6767, final int field6768, final double[][][] field6769) {
        this.field6765 = field6765;
        this.field6761 = field6766;
        this.field6762 = field6767;
        this.field6763 = field6768;
        this.field6764 = field6769;
    }
    
    @Override
    public void run() {
        for (int i = this.field6761; i < this.field6762; ++i) {
            final int n = (Class6733.method20479(this.field6765) - i) % Class6733.method20479(this.field6765);
            for (int j = 1; j < this.field6763; ++j) {
                final int n2 = Class6733.method20474(this.field6765) - j;
                this.field6764[n][n2][0] = this.field6764[i][j][0];
                this.field6764[n][n2][1] = -this.field6764[i][j][1];
            }
        }
    }
}
