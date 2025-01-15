// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1324 implements Runnable
{
    private static String[] field7272;
    public final /* synthetic */ int field7273;
    public final /* synthetic */ int field7274;
    public final /* synthetic */ double[][][] field7275;
    public final /* synthetic */ Class6733 field7276;
    
    public Class1324(final Class6733 field7276, final int field7277, final int field7278, final double[][][] field7279) {
        this.field7276 = field7276;
        this.field7273 = field7277;
        this.field7274 = field7278;
        this.field7275 = field7279;
    }
    
    @Override
    public void run() {
        for (int i = this.field7273; i < this.field7274; ++i) {
            for (int j = 0; j < Class6733.method20474(this.field7276); ++j) {
                Class6733.method20476(this.field7276).method26072(this.field7275[i][j]);
            }
        }
    }
}
