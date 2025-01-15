// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1417 implements Runnable
{
    private static String[] field7835;
    public final /* synthetic */ int field7836;
    public final /* synthetic */ int field7837;
    public final /* synthetic */ double[] field7838;
    public final /* synthetic */ boolean field7839;
    public final /* synthetic */ Class7796 field7840;
    
    public Class1417(final Class7796 field7840, final int field7841, final int field7842, final double[] field7843, final boolean field7844) {
        this.field7840 = field7840;
        this.field7836 = field7841;
        this.field7837 = field7842;
        this.field7838 = field7843;
        this.field7839 = field7844;
    }
    
    @Override
    public void run() {
        for (int i = this.field7836; i < this.field7837; ++i) {
            final int n = i * Class7796.method25143(this.field7840);
            for (int j = 0; j < Class7796.method25144(this.field7840); ++j) {
                Class7796.method25146(this.field7840).method18038(this.field7838, n + j * Class7796.method25145(this.field7840), this.field7839);
            }
        }
    }
}
