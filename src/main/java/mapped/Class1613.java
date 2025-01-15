// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1613 implements Runnable
{
    private static String[] field9008;
    public final /* synthetic */ long field9009;
    public final /* synthetic */ long field9010;
    public final /* synthetic */ long field9011;
    public final /* synthetic */ long field9012;
    public final /* synthetic */ Class17 field9013;
    public final /* synthetic */ Class17 field9014;
    public final /* synthetic */ Class7992 field9015;
    
    public Class1613(final Class7992 field9015, final long field9016, final long field9017, final long field9018, final long field9019, final Class17 field9020, final Class17 field9021) {
        this.field9015 = field9015;
        this.field9009 = field9016;
        this.field9010 = field9017;
        this.field9011 = field9018;
        this.field9012 = field9019;
        this.field9013 = field9020;
        this.field9014 = field9021;
    }
    
    @Override
    public void run() {
        if (this.field9009 <= 0L) {
            for (long field9010 = this.field9010; field9010 < this.field9011; ++field9010) {
                final long n = 2L * field9010;
                final long n2 = n + 1L;
                final long n3 = this.field9012 + field9010;
                this.field9013.method171(n, this.field9014.method137(n3) * Class7992.method26153(this.field9015).method137(n));
                this.field9013.method171(n2, -this.field9014.method137(n3) * Class7992.method26153(this.field9015).method137(n2));
            }
        }
        else {
            for (long field9011 = this.field9010; field9011 < this.field9011; ++field9011) {
                final long n4 = 2L * field9011;
                final long n5 = n4 + 1L;
                final long n6 = this.field9012 + field9011;
                this.field9013.method171(n4, this.field9014.method137(n6) * Class7992.method26153(this.field9015).method137(n4));
                this.field9013.method171(n5, this.field9014.method137(n6) * Class7992.method26153(this.field9015).method137(n5));
            }
        }
    }
}
