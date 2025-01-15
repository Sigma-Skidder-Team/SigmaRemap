// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1391 implements Runnable
{
    private static String[] field7663;
    public final /* synthetic */ int field7664;
    public final /* synthetic */ int field7665;
    public final /* synthetic */ float[][][] field7666;
    public final /* synthetic */ boolean field7667;
    public final /* synthetic */ Class6498 field7668;
    
    public Class1391(final Class6498 field7668, final int field7669, final int field7670, final float[][][] field7671, final boolean field7672) {
        this.field7668 = field7668;
        this.field7664 = field7669;
        this.field7665 = field7670;
        this.field7666 = field7671;
        this.field7667 = field7672;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6498.method19565(this.field7668)];
        for (int i = this.field7664; i < this.field7665; ++i) {
            for (int j = 0; j < Class6498.method19568(this.field7668); ++j) {
                for (int k = 0; k < Class6498.method19565(this.field7668); ++k) {
                    array[k] = this.field7666[i][k][j];
                }
                Class6498.method19569(this.field7668).method34185(array, this.field7667);
                for (int l = 0; l < Class6498.method19565(this.field7668); ++l) {
                    this.field7666[i][l][j] = array[l];
                }
            }
        }
    }
}
