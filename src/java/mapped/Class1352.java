// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1352 implements Runnable
{
    private static String[] field7407;
    public final /* synthetic */ int field7408;
    public final /* synthetic */ int field7409;
    public final /* synthetic */ double[] field7410;
    public final /* synthetic */ double[][][] field7411;
    public final /* synthetic */ boolean field7412;
    public final /* synthetic */ Class6733 field7413;
    
    public Class1352(final Class6733 field7413, final int field7414, final int field7415, final double[] field7416, final double[][][] field7417, final boolean field7418) {
        this.field7413 = field7413;
        this.field7408 = field7414;
        this.field7409 = field7415;
        this.field7410 = field7416;
        this.field7411 = field7417;
        this.field7412 = field7418;
    }
    
    @Override
    public void run() {
        for (int i = this.field7408; i < this.field7409; ++i) {
            final int n = i * Class6733.method20473(this.field7413);
            for (int j = 0; j < Class6733.method20474(this.field7413); ++j) {
                System.arraycopy(this.field7410, n + j * Class6733.method20475(this.field7413), this.field7411[i][j], 0, Class6733.method20477(this.field7413));
                Class6733.method20476(this.field7413).method26092(this.field7411[i][j], this.field7412);
            }
        }
    }
}
