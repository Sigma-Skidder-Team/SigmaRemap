// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class937 implements Runnable
{
    private static String[] field4936;
    public final /* synthetic */ int field4937;
    public final /* synthetic */ int field4938;
    public final /* synthetic */ int field4939;
    public final /* synthetic */ int field4940;
    public final /* synthetic */ float[] field4941;
    public final /* synthetic */ float[][] field4942;
    public final /* synthetic */ Class8328 field4943;
    
    public Class937(final Class8328 field4943, final int field4944, final int field4945, final int field4946, final int field4947, final float[] field4948, final float[][] field4949) {
        this.field4943 = field4943;
        this.field4937 = field4944;
        this.field4938 = field4945;
        this.field4939 = field4946;
        this.field4940 = field4947;
        this.field4941 = field4948;
        this.field4942 = field4949;
    }
    
    @Override
    public void run() {
        for (int i = this.field4937; i < this.field4938; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < this.field4939; ++j) {
                final int n2 = i * this.field4940 + 2 * j;
                this.field4941[n2] = this.field4942[j][n];
                this.field4941[n2 + 1] = this.field4942[j][n + 1];
            }
        }
    }
}
