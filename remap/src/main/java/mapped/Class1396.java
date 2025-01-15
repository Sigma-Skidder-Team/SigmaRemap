// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1396 implements Runnable
{
    private static String[] field7698;
    public final /* synthetic */ int field7699;
    public final /* synthetic */ int field7700;
    public final /* synthetic */ int field7701;
    public final /* synthetic */ int field7702;
    public final /* synthetic */ double[] field7703;
    public final /* synthetic */ double[][] field7704;
    public final /* synthetic */ Class8983 field7705;
    
    public Class1396(final Class8983 field7705, final int field7706, final int field7707, final int field7708, final int field7709, final double[] field7710, final double[][] field7711) {
        this.field7705 = field7705;
        this.field7699 = field7706;
        this.field7700 = field7707;
        this.field7701 = field7708;
        this.field7702 = field7709;
        this.field7703 = field7710;
        this.field7704 = field7711;
    }
    
    @Override
    public void run() {
        for (int i = this.field7699; i < this.field7700; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < this.field7701; ++j) {
                final int n2 = i * this.field7702 + 2 * j;
                this.field7703[n2] = this.field7704[j][n];
                this.field7703[n2 + 1] = this.field7704[j][n + 1];
            }
        }
    }
}
