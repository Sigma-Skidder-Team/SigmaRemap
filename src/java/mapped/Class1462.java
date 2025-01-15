// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1462 implements Runnable
{
    private static String[] field8110;
    public final /* synthetic */ long field8111;
    public final /* synthetic */ long field8112;
    public final /* synthetic */ Class22 field8113;
    public final /* synthetic */ Class7978 field8114;
    
    public Class1462(final Class7978 field8114, final long field8115, final long field8116, final Class22 field8117) {
        this.field8114 = field8114;
        this.field8111 = field8115;
        this.field8112 = field8116;
        this.field8113 = field8117;
    }
    
    @Override
    public void run() {
        for (long field8111 = this.field8111; field8111 < this.field8112; ++field8111) {
            final long n = 2L * field8111;
            final long n2 = n + 1L;
            final float n3 = this.field8113.method135(n) * Class7978.method26007(this.field8114).method135(n2) + this.field8113.method135(n2) * Class7978.method26007(this.field8114).method135(n);
            this.field8113.method169(n, this.field8113.method135(n) * Class7978.method26007(this.field8114).method135(n) - this.field8113.method135(n2) * Class7978.method26007(this.field8114).method135(n2));
            this.field8113.method169(n2, n3);
        }
    }
}
