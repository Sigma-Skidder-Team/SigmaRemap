// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1641 implements Runnable
{
    private static String[] field9174;
    public final /* synthetic */ long field9175;
    public final /* synthetic */ long field9176;
    public final /* synthetic */ long field9177;
    public final /* synthetic */ long field9178;
    public final /* synthetic */ Class22 field9179;
    public final /* synthetic */ Class7978 field9180;
    
    public Class1641(final Class7978 field9180, final long field9181, final long field9182, final long field9183, final long field9184, final Class22 field9185) {
        this.field9180 = field9180;
        this.field9175 = field9181;
        this.field9176 = field9182;
        this.field9177 = field9183;
        this.field9178 = field9184;
        this.field9179 = field9185;
    }
    
    @Override
    public void run() {
        for (long field9175 = this.field9175; field9175 < this.field9176; ++field9175) {
            final long n = 2L * field9175;
            final long n2 = this.field9177 + (this.field9178 - n) % this.field9178;
            this.field9179.method169(n2, this.field9179.method135(this.field9177 + n));
            this.field9179.method169(n2 + 1L, -this.field9179.method135(this.field9177 + n + 1L));
        }
    }
}
