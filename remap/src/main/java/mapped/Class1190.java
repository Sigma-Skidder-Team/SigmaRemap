// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1190 implements Runnable
{
    private static String[] field6443;
    public final /* synthetic */ int field6444;
    public final /* synthetic */ int field6445;
    public final /* synthetic */ double[][][] field6446;
    public final /* synthetic */ boolean field6447;
    public final /* synthetic */ Class6733 field6448;
    
    public Class1190(final Class6733 field6448, final int field6449, final int field6450, final double[][][] field6451, final boolean field6452) {
        this.field6448 = field6448;
        this.field6444 = field6449;
        this.field6445 = field6450;
        this.field6446 = field6451;
        this.field6447 = field6452;
    }
    
    @Override
    public void run() {
        for (int i = this.field6444; i < this.field6445; ++i) {
            for (int j = 0; j < Class6733.method20474(this.field6448); ++j) {
                Class6733.method20476(this.field6448).method26092(this.field6446[i][j], this.field6447);
            }
        }
    }
}
