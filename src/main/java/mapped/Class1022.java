// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1022 implements Runnable
{
    private static String[] field5472;
    public final /* synthetic */ int field5473;
    public final /* synthetic */ int field5474;
    public final /* synthetic */ double[][] field5475;
    public final /* synthetic */ boolean field5476;
    public final /* synthetic */ Class9033 field5477;
    
    public Class1022(final Class9033 field5477, final int field5478, final int field5479, final double[][] field5480, final boolean field5481) {
        this.field5477 = field5477;
        this.field5473 = field5478;
        this.field5474 = field5479;
        this.field5475 = field5480;
        this.field5476 = field5481;
    }
    
    @Override
    public void run() {
        for (int i = this.field5473; i < this.field5474; ++i) {
            Class9033.method32452(this.field5477).method18036(this.field5475[i], this.field5476);
        }
    }
}
