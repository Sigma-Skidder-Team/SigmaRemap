// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1631 implements Runnable
{
    private static String[] field9118;
    public final /* synthetic */ int field9119;
    public final /* synthetic */ int field9120;
    public final /* synthetic */ double[][][] field9121;
    public final /* synthetic */ boolean field9122;
    public final /* synthetic */ Class6733 field9123;
    
    public Class1631(final Class6733 field9123, final int field9124, final int field9125, final double[][][] field9126, final boolean field9127) {
        this.field9123 = field9123;
        this.field9119 = field9124;
        this.field9120 = field9125;
        this.field9121 = field9126;
        this.field9122 = field9127;
    }
    
    @Override
    public void run() {
        for (int i = this.field9119; i < this.field9120; ++i) {
            for (int j = 0; j < Class6733.method20474(this.field9123); ++j) {
                Class6733.method20476(this.field9123).method26076(this.field9121[i][j], this.field9122);
            }
        }
    }
}
