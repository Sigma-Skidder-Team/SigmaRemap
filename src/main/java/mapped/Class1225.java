// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1225 implements Runnable
{
    private static String[] field6658;
    public final /* synthetic */ long field6659;
    public final /* synthetic */ long field6660;
    public final /* synthetic */ long field6661;
    public final /* synthetic */ Class22 field6662;
    public final /* synthetic */ Class22 field6663;
    public final /* synthetic */ Class7978 field6664;
    
    public Class1225(final Class7978 field6664, final long field6665, final long field6666, final long field6667, final Class22 field6668, final Class22 field6669) {
        this.field6664 = field6664;
        this.field6659 = field6665;
        this.field6660 = field6666;
        this.field6661 = field6667;
        this.field6662 = field6668;
        this.field6663 = field6669;
    }
    
    @Override
    public void run() {
        for (long field6659 = this.field6659; field6659 < this.field6660; ++field6659) {
            final long n = 2L * field6659;
            final long n2 = n + 1L;
            final long n3 = this.field6661 + field6659;
            this.field6662.method169(n, this.field6663.method135(n3) * Class7978.method26006(this.field6664).method135(n));
            this.field6662.method169(n2, this.field6663.method135(n3) * Class7978.method26006(this.field6664).method135(n2));
        }
    }
}
