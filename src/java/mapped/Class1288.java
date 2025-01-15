// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1288 implements Runnable
{
    private static String[] field7036;
    public final /* synthetic */ long field7037;
    public final /* synthetic */ long field7038;
    public final /* synthetic */ Class22 field7039;
    public final /* synthetic */ Class7978 field7040;
    
    public Class1288(final Class7978 field7040, final long field7041, final long field7042, final Class22 field7043) {
        this.field7040 = field7040;
        this.field7037 = field7041;
        this.field7038 = field7042;
        this.field7039 = field7043;
    }
    
    @Override
    public void run() {
        for (long field7037 = this.field7037; field7037 < this.field7038; ++field7037) {
            final long n = 2L * field7037;
            final long n2 = n + 1L;
            final float n3 = -this.field7039.method135(n) * Class7978.method26007(this.field7040).method135(n2) + this.field7039.method135(n2) * Class7978.method26007(this.field7040).method135(n);
            this.field7039.method169(n, this.field7039.method135(n) * Class7978.method26007(this.field7040).method135(n) + this.field7039.method135(n2) * Class7978.method26007(this.field7040).method135(n2));
            this.field7039.method169(n2, n3);
        }
    }
}
