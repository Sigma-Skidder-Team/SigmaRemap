// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1323 implements Runnable
{
    private static String[] field7267;
    public final /* synthetic */ long field7268;
    public final /* synthetic */ long field7269;
    public final /* synthetic */ Class22 field7270;
    public final /* synthetic */ Class7978 field7271;
    
    public Class1323(final Class7978 field7271, final long field7272, final long field7273, final Class22 field7274) {
        this.field7271 = field7271;
        this.field7268 = field7272;
        this.field7269 = field7273;
        this.field7270 = field7274;
    }
    
    @Override
    public void run() {
        for (long field7268 = this.field7268; field7268 < this.field7269; ++field7268) {
            final long n = 2L * field7268;
            final long n2 = n + 1L;
            final float n3 = -this.field7270.method135(n) * Class7978.method26007(this.field7271).method135(n2) + this.field7270.method135(n2) * Class7978.method26007(this.field7271).method135(n);
            this.field7270.method169(n, this.field7270.method135(n) * Class7978.method26007(this.field7271).method135(n) + this.field7270.method135(n2) * Class7978.method26007(this.field7271).method135(n2));
            this.field7270.method169(n2, n3);
        }
    }
}
