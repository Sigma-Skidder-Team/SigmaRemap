// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1284 implements Runnable
{
    private static String[] field7013;
    public final /* synthetic */ long field7014;
    public final /* synthetic */ long field7015;
    public final /* synthetic */ Class17 field7016;
    public final /* synthetic */ Class7992 field7017;
    
    public Class1284(final Class7992 field7017, final long field7018, final long field7019, final Class17 field7020) {
        this.field7017 = field7017;
        this.field7014 = field7018;
        this.field7015 = field7019;
        this.field7016 = field7020;
    }
    
    @Override
    public void run() {
        for (long field7014 = this.field7014; field7014 < this.field7015; ++field7014) {
            final long n = 2L * field7014;
            final long n2 = n + 1L;
            final double n3 = this.field7016.method137(n) * Class7992.method26154(this.field7017).method137(n2) + this.field7016.method137(n2) * Class7992.method26154(this.field7017).method137(n);
            this.field7016.method171(n, this.field7016.method137(n) * Class7992.method26154(this.field7017).method137(n) - this.field7016.method137(n2) * Class7992.method26154(this.field7017).method137(n2));
            this.field7016.method171(n2, n3);
        }
    }
}
