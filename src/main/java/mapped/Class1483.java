// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1483 implements Runnable
{
    private static String[] field8240;
    public final /* synthetic */ int field8241;
    public final /* synthetic */ int field8242;
    public final /* synthetic */ double[][] field8243;
    public final /* synthetic */ int field8244;
    public final /* synthetic */ int field8245;
    public final /* synthetic */ int field8246;
    public final /* synthetic */ Class8983 field8247;
    
    public Class1483(final Class8983 field8247, final int field8248, final int field8249, final double[][] field8250, final int field8251, final int field8252, final int field8253) {
        this.field8247 = field8247;
        this.field8241 = field8248;
        this.field8242 = field8249;
        this.field8243 = field8250;
        this.field8244 = field8251;
        this.field8245 = field8252;
        this.field8246 = field8253;
    }
    
    @Override
    public void run() {
        for (int i = this.field8241; i < this.field8242; ++i) {
            final int n = Class8983.method31976(this.field8247) - i;
            this.field8243[i][Class8983.method31979(this.field8247)] = this.field8243[n][1];
            this.field8243[i][Class8983.method31979(this.field8247) + 1] = -this.field8243[n][0];
        }
        for (int j = this.field8241; j < this.field8242; ++j) {
            final int n2 = Class8983.method31976(this.field8247) - j;
            for (int k = Class8983.method31979(this.field8247) + 2; k < this.field8244; k += 2) {
                final int n3 = this.field8244 - k;
                this.field8243[j][k] = this.field8243[n2][n3];
                this.field8243[j][k + 1] = -this.field8243[n2][n3 + 1];
            }
        }
        for (int l = this.field8245; l < this.field8246; ++l) {
            final int n4 = (Class8983.method31976(this.field8247) - l) % Class8983.method31976(this.field8247);
            for (int n5 = 0; n5 < this.field8244; n5 += 2) {
                final int n6 = (this.field8244 - n5) % this.field8244;
                this.field8243[n4][n6] = this.field8243[l][n5];
                this.field8243[n4][n6 + 1] = -this.field8243[l][n5 + 1];
            }
        }
    }
}
