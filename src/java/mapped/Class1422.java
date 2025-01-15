// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1422 implements Runnable
{
    private static String[] field7864;
    public final /* synthetic */ int field7865;
    public final /* synthetic */ int field7866;
    public final /* synthetic */ int field7867;
    public final /* synthetic */ double[][] field7868;
    public final /* synthetic */ double[][] field7869;
    public final /* synthetic */ Class8983 field7870;
    
    public Class1422(final Class8983 field7870, final int field7871, final int field7872, final int field7873, final double[][] field7874, final double[][] field7875) {
        this.field7870 = field7870;
        this.field7865 = field7871;
        this.field7866 = field7872;
        this.field7867 = field7873;
        this.field7868 = field7874;
        this.field7869 = field7875;
    }
    
    @Override
    public void run() {
        for (int i = this.field7865; i < this.field7866; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < this.field7867; ++j) {
                final int n2 = 2 * j;
                this.field7868[i][n2] = this.field7869[j][n];
                this.field7868[i][n2 + 1] = this.field7869[j][n + 1];
            }
        }
    }
}
