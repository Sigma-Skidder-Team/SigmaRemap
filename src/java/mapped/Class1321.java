// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1321 implements Runnable
{
    private static String[] field7253;
    public final /* synthetic */ int field7254;
    public final /* synthetic */ int field7255;
    public final /* synthetic */ double[] field7256;
    public final /* synthetic */ int field7257;
    public final /* synthetic */ double[] field7258;
    public final /* synthetic */ Class7992 field7259;
    
    public Class1321(final Class7992 field7259, final int field7260, final int field7261, final double[] field7262, final int field7263, final double[] field7264) {
        this.field7259 = field7259;
        this.field7254 = field7260;
        this.field7255 = field7261;
        this.field7256 = field7262;
        this.field7257 = field7263;
        this.field7258 = field7264;
    }
    
    @Override
    public void run() {
        for (int i = this.field7254; i < this.field7255; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            this.field7256[this.field7257 + i] = Class7992.method26151(this.field7259)[n] * this.field7258[n] - Class7992.method26151(this.field7259)[n2] * this.field7258[n2];
        }
    }
}
