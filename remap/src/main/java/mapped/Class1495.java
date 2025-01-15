// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1495 implements Runnable
{
    private static String[] field8312;
    public final /* synthetic */ long field8313;
    public final /* synthetic */ long field8314;
    public final /* synthetic */ Class12 field8315;
    public final /* synthetic */ long field8316;
    public final /* synthetic */ Class12 field8317;
    public final /* synthetic */ long field8318;
    
    public Class1495(final long field8313, final long field8314, final Class12 field8315, final long field8316, final Class12 field8317, final long field8318) {
        this.field8313 = field8313;
        this.field8314 = field8314;
        this.field8315 = field8315;
        this.field8316 = field8316;
        this.field8317 = field8317;
        this.field8318 = field8318;
    }
    
    @Override
    public void run() {
        for (long field8313 = this.field8313; field8313 < this.field8314; ++field8313) {
            this.field8315.method159(this.field8316 + field8313, this.field8317.method125(this.field8318 + field8313));
        }
    }
}
