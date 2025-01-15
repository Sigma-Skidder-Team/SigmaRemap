// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1009 implements Runnable
{
    private static String[] field5388;
    public final /* synthetic */ int field5389;
    public final /* synthetic */ int field5390;
    public final /* synthetic */ int field5391;
    public final /* synthetic */ double[][] field5392;
    public final /* synthetic */ Class8983 field5393;
    
    public Class1009(final Class8983 field5393, final int field5394, final int field5395, final int field5396, final double[][] field5397) {
        this.field5393 = field5393;
        this.field5389 = field5394;
        this.field5390 = field5395;
        this.field5391 = field5396;
        this.field5392 = field5397;
    }
    
    @Override
    public void run() {
        for (int i = this.field5389; i < this.field5390; ++i) {
            final int n = Class8983.method31976(this.field5393) - i;
            for (int j = this.field5391; j < Class8983.method31979(this.field5393); ++j) {
                final int n2 = 2 * j;
                final int n3 = 2 * (Class8983.method31979(this.field5393) - j);
                this.field5392[0][n2] = this.field5392[0][n3];
                this.field5392[0][n2 + 1] = -this.field5392[0][n3 + 1];
                this.field5392[i][n2] = this.field5392[n][n3];
                this.field5392[i][n2 + 1] = -this.field5392[n][n3 + 1];
            }
        }
    }
}
