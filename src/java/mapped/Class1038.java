// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1038 implements Runnable
{
    private static String[] field5563;
    public final /* synthetic */ int field5564;
    public final /* synthetic */ int field5565;
    public final /* synthetic */ float[][][] field5566;
    public final /* synthetic */ Class6362 field5567;
    
    public Class1038(final Class6362 field5567, final int field5568, final int field5569, final float[][][] field5570) {
        this.field5567 = field5567;
        this.field5564 = field5568;
        this.field5565 = field5569;
        this.field5566 = field5570;
    }
    
    @Override
    public void run() {
        for (int i = this.field5564; i < this.field5565; ++i) {
            for (int j = 0; j < Class6362.method18998(this.field5567); ++j) {
                Class6362.method19000(this.field5567).method25925(this.field5566[i][j]);
            }
        }
    }
}
