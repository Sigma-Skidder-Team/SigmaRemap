// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1010 implements Runnable
{
    private static String[] field5394;
    public final /* synthetic */ int field5395;
    public final /* synthetic */ int field5396;
    public final /* synthetic */ int field5397;
    public final /* synthetic */ double[] field5398;
    public final /* synthetic */ Class7992 field5399;
    
    public Class1010(final Class7992 field5399, final int field5400, final int field5401, final int field5402, final double[] field5403) {
        this.field5399 = field5399;
        this.field5395 = field5400;
        this.field5396 = field5401;
        this.field5397 = field5402;
        this.field5398 = field5403;
    }
    
    @Override
    public void run() {
        if (this.field5395 <= 0) {
            for (int i = this.field5396; i < this.field5397; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final double n3 = this.field5398[n] * Class7992.method26152(this.field5399)[n2] + this.field5398[n2] * Class7992.method26152(this.field5399)[n];
                this.field5398[n] = this.field5398[n] * Class7992.method26152(this.field5399)[n] - this.field5398[n2] * Class7992.method26152(this.field5399)[n2];
                this.field5398[n2] = n3;
            }
        }
        else {
            for (int j = this.field5396; j < this.field5397; ++j) {
                final int n4 = 2 * j;
                final int n5 = n4 + 1;
                final double n6 = -this.field5398[n4] * Class7992.method26152(this.field5399)[n5] + this.field5398[n5] * Class7992.method26152(this.field5399)[n4];
                this.field5398[n4] = this.field5398[n4] * Class7992.method26152(this.field5399)[n4] + this.field5398[n5] * Class7992.method26152(this.field5399)[n5];
                this.field5398[n5] = n6;
            }
        }
    }
}
