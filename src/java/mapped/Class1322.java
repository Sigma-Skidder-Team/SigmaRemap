// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1322 implements Runnable
{
    private static String[] field7260;
    public final /* synthetic */ long field7261;
    public final /* synthetic */ long field7262;
    public final /* synthetic */ Class23 field7263;
    public final /* synthetic */ long field7264;
    public final /* synthetic */ Class23 field7265;
    public final /* synthetic */ long field7266;
    
    public Class1322(final long field7261, final long field7262, final Class23 field7263, final long field7264, final Class23 field7265, final long field7266) {
        this.field7261 = field7261;
        this.field7262 = field7262;
        this.field7263 = field7263;
        this.field7264 = field7264;
        this.field7265 = field7265;
        this.field7266 = field7266;
    }
    
    @Override
    public void run() {
        for (long field7261 = this.field7261; field7261 < this.field7262; ++field7261) {
            this.field7263.method159(this.field7264 + field7261, this.field7265.method125(this.field7266 + field7261));
        }
    }
}
