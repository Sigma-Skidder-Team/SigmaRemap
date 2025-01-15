// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1053 implements Runnable
{
    private static String[] field5649;
    public final /* synthetic */ int field5650;
    public final /* synthetic */ int field5651;
    public final /* synthetic */ double[][] field5652;
    public final /* synthetic */ double[] field5653;
    public final /* synthetic */ boolean field5654;
    public final /* synthetic */ Class8983 field5655;
    
    public Class1053(final Class8983 field5655, final int field5656, final int field5657, final double[][] field5658, final double[] field5659, final boolean field5660) {
        this.field5655 = field5655;
        this.field5650 = field5656;
        this.field5651 = field5657;
        this.field5652 = field5658;
        this.field5653 = field5659;
        this.field5654 = field5660;
    }
    
    @Override
    public void run() {
        for (int i = this.field5650; i < this.field5651; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8983.method31976(this.field5655); ++j) {
                final int n2 = 2 * j;
                final int n3 = j * Class8983.method31979(this.field5655) + n;
                this.field5652[i][n2] = this.field5653[n3];
                this.field5652[i][n2 + 1] = this.field5653[n3 + 1];
            }
            Class8983.method31977(this.field5655).method26076(this.field5652[i], this.field5654);
        }
    }
}
