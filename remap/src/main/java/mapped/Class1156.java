// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1156 implements Runnable
{
    private static String[] field6263;
    public final /* synthetic */ int field6264;
    public final /* synthetic */ int field6265;
    public final /* synthetic */ float[][][] field6266;
    public final /* synthetic */ boolean field6267;
    public final /* synthetic */ Class9117 field6268;
    
    public Class1156(final Class9117 field6268, final int field6269, final int field6270, final float[][][] field6271, final boolean field6272) {
        this.field6268 = field6268;
        this.field6264 = field6269;
        this.field6265 = field6270;
        this.field6266 = field6271;
        this.field6267 = field6272;
    }
    
    @Override
    public void run() {
        for (int i = this.field6264; i < this.field6265; ++i) {
            for (int j = 0; j < Class9117.method33003(this.field6268); ++j) {
                Class9117.method33005(this.field6268).method29693(this.field6266[i][j], this.field6267);
            }
        }
    }
}
