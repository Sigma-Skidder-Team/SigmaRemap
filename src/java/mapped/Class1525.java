// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1525 implements Runnable
{
    private static String[] field8507;
    public final /* synthetic */ int field8508;
    public final /* synthetic */ int field8509;
    public final /* synthetic */ int field8510;
    public final /* synthetic */ float[][] field8511;
    public final /* synthetic */ Class8328 field8512;
    
    public Class1525(final Class8328 field8512, final int field8513, final int field8514, final int field8515, final float[][] field8516) {
        this.field8512 = field8512;
        this.field8508 = field8513;
        this.field8509 = field8514;
        this.field8510 = field8515;
        this.field8511 = field8516;
    }
    
    @Override
    public void run() {
        for (int i = this.field8508; i < this.field8509; ++i) {
            final int n = Class8328.method27760(this.field8512) - i;
            for (int j = this.field8510; j < Class8328.method27763(this.field8512); ++j) {
                final int n2 = 2 * j;
                final int n3 = 2 * (Class8328.method27763(this.field8512) - j);
                this.field8511[0][n2] = this.field8511[0][n3];
                this.field8511[0][n2 + 1] = -this.field8511[0][n3 + 1];
                this.field8511[i][n2] = this.field8511[n][n3];
                this.field8511[i][n2 + 1] = -this.field8511[n][n3 + 1];
            }
        }
    }
}
