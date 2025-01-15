// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1055 implements Runnable
{
    private static String[] field5663;
    public final /* synthetic */ int field5664;
    public final /* synthetic */ long field5665;
    public final /* synthetic */ long field5666;
    public final /* synthetic */ long field5667;
    public final /* synthetic */ Class17 field5668;
    public final /* synthetic */ Class17 field5669;
    public final /* synthetic */ Class7992 field5670;
    
    public Class1055(final Class7992 field5670, final int field5671, final long field5672, final long field5673, final long field5674, final Class17 field5675, final Class17 field5676) {
        this.field5670 = field5670;
        this.field5664 = field5671;
        this.field5665 = field5672;
        this.field5666 = field5673;
        this.field5667 = field5674;
        this.field5668 = field5675;
        this.field5669 = field5676;
    }
    
    @Override
    public void run() {
        if (this.field5664 <= 0) {
            for (long field5665 = this.field5665; field5665 < this.field5666; ++field5665) {
                final long n = 2L * field5665;
                final long n2 = n + 1L;
                final long n3 = this.field5667 + n;
                final long n4 = this.field5667 + n2;
                this.field5668.method171(n3, Class7992.method26153(this.field5670).method137(n) * this.field5669.method137(n) + Class7992.method26153(this.field5670).method137(n2) * this.field5669.method137(n2));
                this.field5668.method171(n4, -Class7992.method26153(this.field5670).method137(n2) * this.field5669.method137(n) + Class7992.method26153(this.field5670).method137(n) * this.field5669.method137(n2));
            }
        }
        else {
            for (long field5666 = this.field5665; field5666 < this.field5666; ++field5666) {
                final long n5 = 2L * field5666;
                final long n6 = n5 + 1L;
                final long n7 = this.field5667 + n5;
                final long n8 = this.field5667 + n6;
                this.field5668.method171(n7, Class7992.method26153(this.field5670).method137(n5) * this.field5669.method137(n5) - Class7992.method26153(this.field5670).method137(n6) * this.field5669.method137(n6));
                this.field5668.method171(n8, Class7992.method26153(this.field5670).method137(n6) * this.field5669.method137(n5) + Class7992.method26153(this.field5670).method137(n5) * this.field5669.method137(n6));
            }
        }
    }
}
