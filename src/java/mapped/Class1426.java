// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1426 implements Runnable
{
    private static String[] field7884;
    public final /* synthetic */ int field7885;
    public final /* synthetic */ int field7886;
    public final /* synthetic */ double[][] field7887;
    public final /* synthetic */ double[][] field7888;
    public final /* synthetic */ boolean field7889;
    public final /* synthetic */ Class8983 field7890;
    
    public Class1426(final Class8983 field7890, final int field7891, final int field7892, final double[][] field7893, final double[][] field7894, final boolean field7895) {
        this.field7890 = field7890;
        this.field7885 = field7891;
        this.field7886 = field7892;
        this.field7887 = field7893;
        this.field7888 = field7894;
        this.field7889 = field7895;
    }
    
    @Override
    public void run() {
        for (int i = this.field7885; i < this.field7886; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8983.method31976(this.field7890); ++j) {
                final int n2 = 2 * j;
                this.field7887[i][n2] = this.field7888[j][n];
                this.field7887[i][n2 + 1] = this.field7888[j][n + 1];
            }
            Class8983.method31977(this.field7890).method26076(this.field7887[i], this.field7889);
        }
    }
}
