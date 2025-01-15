// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class945 implements Runnable
{
    private static String[] field4987;
    public final /* synthetic */ int field4988;
    public final /* synthetic */ int field4989;
    public final /* synthetic */ int field4990;
    public final /* synthetic */ float[][] field4991;
    public final /* synthetic */ float[][] field4992;
    public final /* synthetic */ Class8328 field4993;
    
    public Class945(final Class8328 field4993, final int field4994, final int field4995, final int field4996, final float[][] field4997, final float[][] field4998) {
        this.field4993 = field4993;
        this.field4988 = field4994;
        this.field4989 = field4995;
        this.field4990 = field4996;
        this.field4991 = field4997;
        this.field4992 = field4998;
    }
    
    @Override
    public void run() {
        for (int i = this.field4988; i < this.field4989; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < this.field4990; ++j) {
                final int n2 = 2 * j;
                this.field4991[i][n2] = this.field4992[j][n];
                this.field4991[i][n2 + 1] = this.field4992[j][n + 1];
            }
        }
    }
}
