// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1147 implements Runnable
{
    private static String[] field6201;
    public final /* synthetic */ int field6202;
    public final /* synthetic */ int field6203;
    public final /* synthetic */ double[][][] field6204;
    public final /* synthetic */ boolean field6205;
    public final /* synthetic */ Class7568 field6206;
    
    public Class1147(final Class7568 field6206, final int field6207, final int field6208, final double[][][] field6209, final boolean field6210) {
        this.field6206 = field6206;
        this.field6202 = field6207;
        this.field6203 = field6208;
        this.field6204 = field6209;
        this.field6205 = field6210;
    }
    
    @Override
    public void run() {
        for (int i = this.field6202; i < this.field6203; ++i) {
            for (int j = 0; j < Class7568.method23777(this.field6206); ++j) {
                Class7568.method23779(this.field6206).method30721(this.field6204[i][j], this.field6205);
            }
        }
    }
}
