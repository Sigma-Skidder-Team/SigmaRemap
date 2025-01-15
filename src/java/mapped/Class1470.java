// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1470 implements Runnable
{
    private static String[] field8159;
    public final /* synthetic */ int field8160;
    public final /* synthetic */ int field8161;
    public final /* synthetic */ double[] field8162;
    public final /* synthetic */ double[][][] field8163;
    public final /* synthetic */ Class6733 field8164;
    
    public Class1470(final Class6733 field8164, final int field8165, final int field8166, final double[] field8167, final double[][][] field8168) {
        this.field8164 = field8164;
        this.field8160 = field8165;
        this.field8161 = field8166;
        this.field8162 = field8167;
        this.field8163 = field8168;
    }
    
    @Override
    public void run() {
        for (int i = this.field8160; i < this.field8161; ++i) {
            final int n = i * Class6733.method20473(this.field8164);
            for (int j = 0; j < Class6733.method20474(this.field8164); ++j) {
                System.arraycopy(this.field8162, n + j * Class6733.method20475(this.field8164), this.field8163[i][j], 0, Class6733.method20477(this.field8164));
                Class6733.method20476(this.field8164).method26084(this.field8163[i][j]);
            }
        }
    }
}
