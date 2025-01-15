// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class992 implements Runnable
{
    private static String[] field5288;
    public final /* synthetic */ long field5289;
    public final /* synthetic */ long field5290;
    public final /* synthetic */ Class17 field5291;
    public final /* synthetic */ Class5815 field5292;
    
    public Class992(final Class5815 field5292, final long field5293, final long field5294, final Class17 field5295) {
        this.field5292 = field5292;
        this.field5289 = field5293;
        this.field5290 = field5294;
        this.field5291 = field5295;
    }
    
    @Override
    public void run() {
        for (long field5289 = this.field5289; field5289 < this.field5290; ++field5289) {
            final long n = field5289 * Class5815.method17497(this.field5292);
            for (long n2 = 0L; n2 < Class5815.method17505(this.field5292); ++n2) {
                Class5815.method17500(this.field5292).method21389(this.field5291, n + n2 * Class5815.method17499(this.field5292));
            }
        }
    }
}
