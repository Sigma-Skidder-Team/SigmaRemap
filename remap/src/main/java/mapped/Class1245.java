// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1245 implements Runnable
{
    private static String[] field6771;
    public final /* synthetic */ int field6772;
    public final /* synthetic */ int field6773;
    public final /* synthetic */ float[][] field6774;
    public final /* synthetic */ float[][] field6775;
    public final /* synthetic */ boolean field6776;
    public final /* synthetic */ Class8328 field6777;
    
    public Class1245(final Class8328 field6777, final int field6778, final int field6779, final float[][] field6780, final float[][] field6781, final boolean field6782) {
        this.field6777 = field6777;
        this.field6772 = field6778;
        this.field6773 = field6779;
        this.field6774 = field6780;
        this.field6775 = field6781;
        this.field6776 = field6782;
    }
    
    @Override
    public void run() {
        for (int i = this.field6772; i < this.field6773; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8328.method27760(this.field6777); ++j) {
                final int n2 = 2 * j;
                this.field6774[i][n2] = this.field6775[j][n];
                this.field6774[i][n2 + 1] = this.field6775[j][n + 1];
            }
            Class8328.method27761(this.field6777).method25929(this.field6774[i], this.field6776);
        }
    }
}
