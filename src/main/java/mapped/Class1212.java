// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1212 implements Runnable
{
    private static String[] field6577;
    public final /* synthetic */ long field6578;
    public final /* synthetic */ long field6579;
    public final /* synthetic */ Class22 field6580;
    public final /* synthetic */ long field6581;
    public final /* synthetic */ Class22 field6582;
    public final /* synthetic */ Class8673 field6583;
    
    public Class1212(final Class8673 field6583, final long field6584, final long field6585, final Class22 field6586, final long field6587, final Class22 field6588) {
        this.field6583 = field6583;
        this.field6578 = field6584;
        this.field6579 = field6585;
        this.field6580 = field6586;
        this.field6581 = field6587;
        this.field6582 = field6588;
    }
    
    @Override
    public void run() {
        for (long field6578 = this.field6578; field6578 < this.field6579; ++field6578) {
            final long n = 2L * field6578;
            final float method135 = this.field6580.method135(this.field6581 + field6578);
            this.field6582.method169(n, Class8673.method29704(this.field6583).method135(n) * method135);
            this.field6582.method169(n + 1L, -Class8673.method29704(this.field6583).method135(n + 1L) * method135);
        }
    }
}
