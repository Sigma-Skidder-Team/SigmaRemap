// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1015 implements Runnable
{
    private static String[] field5427;
    public final /* synthetic */ int field5428;
    public final /* synthetic */ int field5429;
    public final /* synthetic */ int field5430;
    public final /* synthetic */ int field5431;
    public final /* synthetic */ double[] field5432;
    public final /* synthetic */ Class7992 field5433;
    
    public Class1015(final Class7992 field5433, final int field5434, final int field5435, final int field5436, final int field5437, final double[] field5438) {
        this.field5433 = field5433;
        this.field5428 = field5434;
        this.field5429 = field5435;
        this.field5430 = field5436;
        this.field5431 = field5437;
        this.field5432 = field5438;
    }
    
    @Override
    public void run() {
        for (int i = this.field5428; i < this.field5429; ++i) {
            final int n = 2 * i;
            final int n2 = this.field5430 + (this.field5431 - n) % this.field5431;
            this.field5432[n2] = this.field5432[this.field5430 + n];
            this.field5432[n2 + 1] = -this.field5432[this.field5430 + n + 1];
        }
    }
}
