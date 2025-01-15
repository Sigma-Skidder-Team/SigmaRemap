// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1602 implements Runnable
{
    private static String[] field8947;
    public final /* synthetic */ int field8948;
    public final /* synthetic */ int field8949;
    public final /* synthetic */ float[][][] field8950;
    public final /* synthetic */ boolean field8951;
    public final /* synthetic */ Class6498 field8952;
    
    public Class1602(final Class6498 field8952, final int field8953, final int field8954, final float[][][] field8955, final boolean field8956) {
        this.field8952 = field8952;
        this.field8948 = field8953;
        this.field8949 = field8954;
        this.field8950 = field8955;
        this.field8951 = field8956;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6498.method19570(this.field8952)];
        for (int i = this.field8948; i < this.field8949; ++i) {
            for (int j = 0; j < Class6498.method19568(this.field8952); ++j) {
                for (int k = 0; k < Class6498.method19570(this.field8952); ++k) {
                    array[k] = this.field8950[k][i][j];
                }
                Class6498.method19571(this.field8952).method34185(array, this.field8951);
                for (int l = 0; l < Class6498.method19570(this.field8952); ++l) {
                    this.field8950[l][i][j] = array[l];
                }
            }
        }
    }
}
