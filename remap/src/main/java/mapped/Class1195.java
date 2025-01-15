// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1195 implements Runnable
{
    private static String[] field6474;
    public final /* synthetic */ int field6475;
    public final /* synthetic */ int field6476;
    public final /* synthetic */ double[] field6477;
    public final /* synthetic */ boolean field6478;
    public final /* synthetic */ Class4406 field6479;
    
    public Class1195(final Class4406 field6479, final int field6480, final int field6481, final double[] field6482, final boolean field6483) {
        this.field6479 = field6479;
        this.field6475 = field6480;
        this.field6476 = field6481;
        this.field6477 = field6482;
        this.field6478 = field6483;
    }
    
    @Override
    public void run() {
        for (int i = this.field6475; i < this.field6476; ++i) {
            Class4406.method13333(this.field6479).method30727(this.field6477, i * Class4406.method13332(this.field6479), this.field6478);
        }
    }
}
