// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1287 implements Runnable
{
    private static String[] field7030;
    public final /* synthetic */ int field7031;
    public final /* synthetic */ int field7032;
    public final /* synthetic */ double[][] field7033;
    public final /* synthetic */ double[] field7034;
    public final /* synthetic */ Class8983 field7035;
    
    public Class1287(final Class8983 field7035, final int field7036, final int field7037, final double[][] field7038, final double[] field7039) {
        this.field7035 = field7035;
        this.field7031 = field7036;
        this.field7032 = field7037;
        this.field7033 = field7038;
        this.field7034 = field7039;
    }
    
    @Override
    public void run() {
        for (int i = this.field7031; i < this.field7032; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8983.method31976(this.field7035); ++j) {
                final int n2 = 2 * j;
                final int n3 = j * Class8983.method31979(this.field7035) + n;
                this.field7033[i][n2] = this.field7034[n3];
                this.field7033[i][n2 + 1] = this.field7034[n3 + 1];
            }
            Class8983.method31977(this.field7035).method26072(this.field7033[i]);
        }
    }
}
