// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1159 implements Runnable
{
    private static String[] field6285;
    public final /* synthetic */ long field6286;
    public final /* synthetic */ long field6287;
    public final /* synthetic */ Class23 field6288;
    public final /* synthetic */ Class23 field6289;
    public final /* synthetic */ Class23 field6290;
    
    public Class1159(final Class23 field6290, final long field6291, final long field6292, final Class23 field6293, final Class23 field6294) {
        this.field6290 = field6290;
        this.field6286 = field6291;
        this.field6287 = field6292;
        this.field6288 = field6293;
        this.field6289 = field6294;
    }
    
    @Override
    public void run() {
        for (long field6286 = this.field6286; field6286 < this.field6287; ++field6286) {
            this.field6288.method159(field6286, (byte)(this.field6290.method125(field6286) | this.field6289.method125(field6286)));
        }
    }
}
