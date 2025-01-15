// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1027 implements Runnable
{
    private static String[] field5504;
    public final /* synthetic */ int field5505;
    public final /* synthetic */ int field5506;
    public final /* synthetic */ float[][] field5507;
    public final /* synthetic */ float[][] field5508;
    public final /* synthetic */ Class8328 field5509;
    
    public Class1027(final Class8328 field5509, final int field5510, final int field5511, final float[][] field5512, final float[][] field5513) {
        this.field5509 = field5509;
        this.field5505 = field5510;
        this.field5506 = field5511;
        this.field5507 = field5512;
        this.field5508 = field5513;
    }
    
    @Override
    public void run() {
        for (int i = this.field5505; i < this.field5506; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8328.method27760(this.field5509); ++j) {
                final int n2 = 2 * j;
                this.field5507[i][n2] = this.field5508[j][n];
                this.field5507[i][n2 + 1] = this.field5508[j][n + 1];
            }
            Class8328.method27761(this.field5509).method25925(this.field5507[i]);
        }
    }
}
