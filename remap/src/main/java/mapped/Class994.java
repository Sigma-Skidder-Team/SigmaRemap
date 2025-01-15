// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class994 implements Runnable
{
    private static String[] field5297;
    public final /* synthetic */ int field5298;
    public final /* synthetic */ int field5299;
    public final /* synthetic */ int field5300;
    public final /* synthetic */ double[] field5301;
    public final /* synthetic */ int field5302;
    public final /* synthetic */ double[] field5303;
    public final /* synthetic */ Class7992 field5304;
    
    public Class994(final Class7992 field5304, final int field5305, final int field5306, final int field5307, final double[] field5308, final int field5309, final double[] field5310) {
        this.field5304 = field5304;
        this.field5298 = field5305;
        this.field5299 = field5306;
        this.field5300 = field5307;
        this.field5301 = field5308;
        this.field5302 = field5309;
        this.field5303 = field5310;
    }
    
    @Override
    public void run() {
        if (this.field5298 <= 0) {
            for (int i = this.field5299; i < this.field5300; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                this.field5301[this.field5302 + n] = Class7992.method26151(this.field5304)[n] * this.field5303[n] + Class7992.method26151(this.field5304)[n2] * this.field5303[n2];
                this.field5301[this.field5302 + n2] = -Class7992.method26151(this.field5304)[n2] * this.field5303[n] + Class7992.method26151(this.field5304)[n] * this.field5303[n2];
            }
        }
        else {
            for (int j = this.field5299; j < this.field5300; ++j) {
                final int n3 = 2 * j;
                final int n4 = n3 + 1;
                this.field5301[this.field5302 + n3] = Class7992.method26151(this.field5304)[n3] * this.field5303[n3] - Class7992.method26151(this.field5304)[n4] * this.field5303[n4];
                this.field5301[this.field5302 + n4] = Class7992.method26151(this.field5304)[n4] * this.field5303[n3] + Class7992.method26151(this.field5304)[n3] * this.field5303[n4];
            }
        }
    }
}
