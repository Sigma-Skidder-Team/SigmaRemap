// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1355 implements Runnable
{
    private static String[] field7427;
    public final /* synthetic */ int field7428;
    public final /* synthetic */ int field7429;
    public final /* synthetic */ float[][] field7430;
    public final /* synthetic */ Class8328 field7431;
    
    public Class1355(final Class8328 field7431, final int field7432, final int field7433, final float[][] field7434) {
        this.field7431 = field7431;
        this.field7428 = field7432;
        this.field7429 = field7433;
        this.field7430 = field7434;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class8328.method27760(this.field7431)];
        for (int i = this.field7428; i < this.field7429; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8328.method27760(this.field7431); ++j) {
                final int n2 = 2 * j;
                array[n2] = this.field7430[j][n];
                array[n2 + 1] = this.field7430[j][n + 1];
            }
            Class8328.method27761(this.field7431).method25925(array);
            for (int k = 0; k < Class8328.method27760(this.field7431); ++k) {
                final int n3 = 2 * k;
                this.field7430[k][n] = array[n3];
                this.field7430[k][n + 1] = array[n3 + 1];
            }
        }
    }
}
