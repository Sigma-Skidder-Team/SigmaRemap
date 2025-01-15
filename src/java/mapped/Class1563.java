// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1563 implements Runnable
{
    private static String[] field8746;
    public final /* synthetic */ long field8747;
    public final /* synthetic */ long field8748;
    public final /* synthetic */ long field8749;
    public final /* synthetic */ Class22 field8750;
    public final /* synthetic */ Class22 field8751;
    public final /* synthetic */ Class7978 field8752;
    
    public Class1563(final Class7978 field8752, final long field8753, final long field8754, final long field8755, final Class22 field8756, final Class22 field8757) {
        this.field8752 = field8752;
        this.field8747 = field8753;
        this.field8748 = field8754;
        this.field8749 = field8755;
        this.field8750 = field8756;
        this.field8751 = field8757;
    }
    
    @Override
    public void run() {
        for (long field8747 = this.field8747; field8747 < this.field8748; ++field8747) {
            final long n = 2L * field8747;
            final long n2 = n + 1L;
            final long n3 = this.field8749 + field8747;
            this.field8750.method169(n, this.field8751.method135(n3) * Class7978.method26006(this.field8752).method135(n));
            this.field8750.method169(n2, -this.field8751.method135(n3) * Class7978.method26006(this.field8752).method135(n2));
        }
    }
}
