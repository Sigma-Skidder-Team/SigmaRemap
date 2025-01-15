// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1331 implements Runnable
{
    private static String[] field7306;
    public final /* synthetic */ int field7307;
    public final /* synthetic */ int field7308;
    public final /* synthetic */ double[] field7309;
    public final /* synthetic */ boolean field7310;
    public final /* synthetic */ Class7568 field7311;
    
    public Class1331(final Class7568 field7311, final int field7312, final int field7313, final double[] field7314, final boolean field7315) {
        this.field7311 = field7311;
        this.field7307 = field7312;
        this.field7308 = field7313;
        this.field7309 = field7314;
        this.field7310 = field7315;
    }
    
    @Override
    public void run() {
        for (int i = this.field7307; i < this.field7308; ++i) {
            final int n = i * Class7568.method23776(this.field7311);
            for (int j = 0; j < Class7568.method23777(this.field7311); ++j) {
                Class7568.method23779(this.field7311).method30727(this.field7309, n + j * Class7568.method23778(this.field7311), this.field7310);
            }
        }
    }
}
