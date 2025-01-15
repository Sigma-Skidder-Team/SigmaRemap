// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1258 implements Runnable
{
    private static String[] field6854;
    public final /* synthetic */ int field6855;
    public final /* synthetic */ int field6856;
    public final /* synthetic */ double[][][] field6857;
    public final /* synthetic */ boolean field6858;
    public final /* synthetic */ Class5815 field6859;
    
    public Class1258(final Class5815 field6859, final int field6860, final int field6861, final double[][][] field6862, final boolean field6863) {
        this.field6859 = field6859;
        this.field6855 = field6860;
        this.field6856 = field6861;
        this.field6857 = field6862;
        this.field6858 = field6863;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class5815.method17503(this.field6859)];
        for (int i = this.field6855; i < this.field6856; ++i) {
            for (int j = 0; j < Class5815.method17501(this.field6859); ++j) {
                for (int k = 0; k < Class5815.method17503(this.field6859); ++k) {
                    array[k] = this.field6857[k][i][j];
                }
                Class5815.method17504(this.field6859).method21390(array, this.field6858);
                for (int l = 0; l < Class5815.method17503(this.field6859); ++l) {
                    this.field6857[l][i][j] = array[l];
                }
            }
        }
    }
}
