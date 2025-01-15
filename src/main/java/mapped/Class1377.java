// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1377 implements Runnable
{
    private static String[] field7568;
    public final /* synthetic */ int field7569;
    public final /* synthetic */ int field7570;
    public final /* synthetic */ int field7571;
    public final /* synthetic */ double[][][] field7572;
    public final /* synthetic */ double[] field7573;
    public final /* synthetic */ int field7574;
    public final /* synthetic */ int field7575;
    public final /* synthetic */ Class6733 field7576;
    
    public Class1377(final Class6733 field7576, final int field7577, final int field7578, final int field7579, final double[][][] field7580, final double[] field7581, final int field7582, final int field7583) {
        this.field7576 = field7576;
        this.field7569 = field7577;
        this.field7570 = field7578;
        this.field7571 = field7579;
        this.field7572 = field7580;
        this.field7573 = field7581;
        this.field7574 = field7582;
        this.field7575 = field7583;
    }
    
    @Override
    public void run() {
        for (int i = this.field7569; i < this.field7570; ++i) {
            final int n = i * this.field7571;
            for (int j = 0; j < Class6733.method20474(this.field7576); ++j) {
                System.arraycopy(this.field7572[i][j], 0, this.field7573, n + j * this.field7574, this.field7575);
            }
        }
    }
}
