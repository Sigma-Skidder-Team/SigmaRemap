// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1439 implements Runnable
{
    private static String[] field7968;
    public final /* synthetic */ int field7969;
    public final /* synthetic */ int field7970;
    public final /* synthetic */ float[][][] field7971;
    public final /* synthetic */ boolean field7972;
    public final /* synthetic */ Class6362 field7973;
    
    public Class1439(final Class6362 field7973, final int field7974, final int field7975, final float[][][] field7976, final boolean field7977) {
        this.field7973 = field7973;
        this.field7969 = field7974;
        this.field7970 = field7975;
        this.field7971 = field7976;
        this.field7972 = field7977;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method19003(this.field7973)];
        for (int i = this.field7969; i < this.field7970; ++i) {
            for (int j = 0; j < Class6362.method19001(this.field7973); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6362.method19003(this.field7973); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field7971[k][i][n];
                    array[n2 + 1] = this.field7971[k][i][n + 1];
                }
                Class6362.method19004(this.field7973).method25929(array, this.field7972);
                for (int l = 0; l < Class6362.method19003(this.field7973); ++l) {
                    final int n3 = 2 * l;
                    this.field7971[l][i][n] = array[n3];
                    this.field7971[l][i][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
