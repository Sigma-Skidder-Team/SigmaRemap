// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1521 implements Runnable
{
    private static String[] field8480;
    public final /* synthetic */ int field8481;
    public final /* synthetic */ int field8482;
    public final /* synthetic */ double[][][] field8483;
    public final /* synthetic */ Class6733 field8484;
    
    public Class1521(final Class6733 field8484, final int field8485, final int field8486, final double[][][] field8487) {
        this.field8484 = field8484;
        this.field8481 = field8485;
        this.field8482 = field8486;
        this.field8483 = field8487;
    }
    
    @Override
    public void run() {
        for (int i = this.field8481; i < this.field8482; ++i) {
            for (int j = 0; j < Class6733.method20474(this.field8484); ++j) {
                Class6733.method20476(this.field8484).method26084(this.field8483[i][j]);
            }
        }
    }
}
