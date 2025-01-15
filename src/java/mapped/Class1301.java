// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1301 implements Runnable
{
    private static String[] field7118;
    public final /* synthetic */ int field7119;
    public final /* synthetic */ int field7120;
    public final /* synthetic */ float[][][] field7121;
    public final /* synthetic */ boolean field7122;
    public final /* synthetic */ Class6498 field7123;
    
    public Class1301(final Class6498 field7123, final int field7124, final int field7125, final float[][][] field7126, final boolean field7127) {
        this.field7123 = field7123;
        this.field7119 = field7124;
        this.field7120 = field7125;
        this.field7121 = field7126;
        this.field7122 = field7127;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6498.method19570(this.field7123)];
        for (int i = this.field7119; i < this.field7120; ++i) {
            for (int j = 0; j < Class6498.method19568(this.field7123); ++j) {
                for (int k = 0; k < Class6498.method19570(this.field7123); ++k) {
                    array[k] = this.field7121[k][i][j];
                }
                Class6498.method19571(this.field7123).method34181(array, this.field7122);
                for (int l = 0; l < Class6498.method19570(this.field7123); ++l) {
                    this.field7121[l][i][j] = array[l];
                }
            }
        }
    }
}
