// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1238 implements Runnable
{
    private static String[] field6735;
    public final /* synthetic */ int field6736;
    public final /* synthetic */ int field6737;
    public final /* synthetic */ int field6738;
    public final /* synthetic */ double[][][] field6739;
    public final /* synthetic */ double[] field6740;
    public final /* synthetic */ int field6741;
    public final /* synthetic */ int field6742;
    public final /* synthetic */ Class6733 field6743;
    
    public Class1238(final Class6733 field6743, final int field6744, final int field6745, final int field6746, final double[][][] field6747, final double[] field6748, final int field6749, final int field6750) {
        this.field6743 = field6743;
        this.field6736 = field6744;
        this.field6737 = field6745;
        this.field6738 = field6746;
        this.field6739 = field6747;
        this.field6740 = field6748;
        this.field6741 = field6749;
        this.field6742 = field6750;
    }
    
    @Override
    public void run() {
        for (int i = this.field6736; i < this.field6737; ++i) {
            final int n = i * this.field6738;
            for (int j = 0; j < Class6733.method20474(this.field6743); ++j) {
                System.arraycopy(this.field6739[i][j], 0, this.field6740, n + j * this.field6741, this.field6742);
            }
        }
    }
}
