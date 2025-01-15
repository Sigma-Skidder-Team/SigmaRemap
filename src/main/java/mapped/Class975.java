// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class975 implements Runnable
{
    private static String[] field5194;
    public final /* synthetic */ int field5195;
    public final /* synthetic */ int field5196;
    public final /* synthetic */ int field5197;
    public final /* synthetic */ int field5198;
    public final /* synthetic */ float[] field5199;
    public final /* synthetic */ float[][] field5200;
    public final /* synthetic */ Class8328 field5201;
    
    public Class975(final Class8328 field5201, final int field5202, final int field5203, final int field5204, final int field5205, final float[] field5206, final float[][] field5207) {
        this.field5201 = field5201;
        this.field5195 = field5202;
        this.field5196 = field5203;
        this.field5197 = field5204;
        this.field5198 = field5205;
        this.field5199 = field5206;
        this.field5200 = field5207;
    }
    
    @Override
    public void run() {
        for (int i = this.field5195; i < this.field5196; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < this.field5197; ++j) {
                final int n2 = i * this.field5198 + 2 * j;
                this.field5199[n2] = this.field5200[j][n];
                this.field5199[n2 + 1] = this.field5200[j][n + 1];
            }
        }
    }
}
