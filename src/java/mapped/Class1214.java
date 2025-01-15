// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1214 implements Runnable
{
    private static String[] field6589;
    public final /* synthetic */ long field6590;
    public final /* synthetic */ long field6591;
    public final /* synthetic */ long field6592;
    public final /* synthetic */ Class17 field6593;
    public final /* synthetic */ long field6594;
    public final /* synthetic */ long field6595;
    public final /* synthetic */ Class8983 field6596;
    
    public Class1214(final Class8983 field6596, final long field6597, final long field6598, final long field6599, final Class17 field6600, final long field6601, final long field6602) {
        this.field6596 = field6596;
        this.field6590 = field6597;
        this.field6591 = field6598;
        this.field6592 = field6599;
        this.field6593 = field6600;
        this.field6594 = field6601;
        this.field6595 = field6602;
    }
    
    @Override
    public void run() {
        for (long field6590 = this.field6590; field6590 < this.field6591; ++field6590) {
            final long n = field6590 * this.field6592;
            final long n2 = (Class8983.method31978(this.field6596) - field6590) * this.field6592;
            final long n3 = n + Class8983.method31980(this.field6596);
            this.field6593.method171(n3, this.field6593.method137(n2 + 1L));
            this.field6593.method171(n3 + 1L, -this.field6593.method137(n2));
        }
        for (long field6591 = this.field6590; field6591 < this.field6591; ++field6591) {
            final long n4 = field6591 * this.field6592;
            final long n5 = (Class8983.method31978(this.field6596) - field6591 + 1L) * this.field6592;
            for (long n6 = Class8983.method31980(this.field6596) + 2L; n6 < this.field6592; n6 += 2L) {
                final long n7 = n5 - n6;
                final long n8 = n4 + n6;
                this.field6593.method171(n8, this.field6593.method137(n7));
                this.field6593.method171(n8 + 1L, -this.field6593.method137(n7 + 1L));
            }
        }
        for (long field6592 = this.field6594; field6592 < this.field6595; ++field6592) {
            final long n9 = (Class8983.method31978(this.field6596) - field6592) % Class8983.method31978(this.field6596) * this.field6592;
            final long n10 = field6592 * this.field6592;
            for (long n11 = 0L; n11 < this.field6592; n11 += 2L) {
                final long n12 = n9 + (this.field6592 - n11) % this.field6592;
                final long n13 = n10 + n11;
                this.field6593.method171(n12, this.field6593.method137(n13));
                this.field6593.method171(n12 + 1L, -this.field6593.method137(n13 + 1L));
            }
        }
    }
}
