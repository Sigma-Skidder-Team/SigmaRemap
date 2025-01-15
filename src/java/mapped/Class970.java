// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class970 implements Runnable
{
    private static String[] field5162;
    public final /* synthetic */ int field5163;
    public final /* synthetic */ int field5164;
    public final /* synthetic */ float[] field5165;
    public final /* synthetic */ float[][][] field5166;
    public final /* synthetic */ boolean field5167;
    public final /* synthetic */ Class6362 field5168;
    
    public Class970(final Class6362 field5168, final int field5169, final int field5170, final float[] field5171, final float[][][] field5172, final boolean field5173) {
        this.field5168 = field5168;
        this.field5163 = field5169;
        this.field5164 = field5170;
        this.field5165 = field5171;
        this.field5166 = field5172;
        this.field5167 = field5173;
    }
    
    @Override
    public void run() {
        for (int i = this.field5163; i < this.field5164; ++i) {
            final int n = i * Class6362.method18997(this.field5168);
            for (int j = 0; j < Class6362.method18998(this.field5168); ++j) {
                System.arraycopy(this.field5165, n + j * Class6362.method18999(this.field5168), this.field5166[i][j], 0, Class6362.method19001(this.field5168));
                Class6362.method19000(this.field5168).method25945(this.field5166[i][j], this.field5167);
            }
        }
    }
}
