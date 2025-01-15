// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1428 implements Runnable
{
    private static String[] field7896;
    public final /* synthetic */ int field7897;
    public final /* synthetic */ int field7898;
    public final /* synthetic */ float[][][] field7899;
    public final /* synthetic */ boolean field7900;
    public final /* synthetic */ Class6498 field7901;
    
    public Class1428(final Class6498 field7901, final int field7902, final int field7903, final float[][][] field7904, final boolean field7905) {
        this.field7901 = field7901;
        this.field7897 = field7902;
        this.field7898 = field7903;
        this.field7899 = field7904;
        this.field7900 = field7905;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6498.method19565(this.field7901)];
        for (int i = this.field7897; i < this.field7898; ++i) {
            for (int j = 0; j < Class6498.method19568(this.field7901); ++j) {
                for (int k = 0; k < Class6498.method19565(this.field7901); ++k) {
                    array[k] = this.field7899[i][k][j];
                }
                Class6498.method19569(this.field7901).method34181(array, this.field7900);
                for (int l = 0; l < Class6498.method19565(this.field7901); ++l) {
                    this.field7899[i][l][j] = array[l];
                }
            }
        }
    }
}
