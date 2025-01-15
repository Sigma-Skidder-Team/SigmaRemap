// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1016 implements Runnable
{
    private static String[] field5434;
    public final /* synthetic */ int field5435;
    public final /* synthetic */ int field5436;
    public final /* synthetic */ float[][] field5437;
    public final /* synthetic */ float[] field5438;
    public final /* synthetic */ Class8328 field5439;
    
    public Class1016(final Class8328 field5439, final int field5440, final int field5441, final float[][] field5442, final float[] field5443) {
        this.field5439 = field5439;
        this.field5435 = field5440;
        this.field5436 = field5441;
        this.field5437 = field5442;
        this.field5438 = field5443;
    }
    
    @Override
    public void run() {
        for (int i = this.field5435; i < this.field5436; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8328.method27760(this.field5439); ++j) {
                final int n2 = 2 * j;
                final int n3 = j * Class8328.method27763(this.field5439) + n;
                this.field5437[i][n2] = this.field5438[n3];
                this.field5437[i][n2 + 1] = this.field5438[n3 + 1];
            }
            Class8328.method27761(this.field5439).method25925(this.field5437[i]);
        }
    }
}
