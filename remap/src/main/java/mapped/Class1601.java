// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1601 implements Runnable
{
    private static String[] field8940;
    public final /* synthetic */ int field8941;
    public final /* synthetic */ int field8942;
    public final /* synthetic */ float[][] field8943;
    public final /* synthetic */ float[] field8944;
    public final /* synthetic */ boolean field8945;
    public final /* synthetic */ Class8328 field8946;
    
    public Class1601(final Class8328 field8946, final int field8947, final int field8948, final float[][] field8949, final float[] field8950, final boolean field8951) {
        this.field8946 = field8946;
        this.field8941 = field8947;
        this.field8942 = field8948;
        this.field8943 = field8949;
        this.field8944 = field8950;
        this.field8945 = field8951;
    }
    
    @Override
    public void run() {
        for (int i = this.field8941; i < this.field8942; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8328.method27760(this.field8946); ++j) {
                final int n2 = 2 * j;
                final int n3 = j * Class8328.method27763(this.field8946) + n;
                this.field8943[i][n2] = this.field8944[n3];
                this.field8943[i][n2 + 1] = this.field8944[n3 + 1];
            }
            Class8328.method27761(this.field8946).method25929(this.field8943[i], this.field8945);
        }
    }
}
