// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1255 implements Runnable
{
    private static String[] field6831;
    public final /* synthetic */ int field6832;
    public final /* synthetic */ long field6833;
    public final /* synthetic */ long field6834;
    public final /* synthetic */ long field6835;
    public final /* synthetic */ Class17 field6836;
    public final /* synthetic */ Class17 field6837;
    public final /* synthetic */ Class7992 field6838;
    
    public Class1255(final Class7992 field6838, final int field6839, final long field6840, final long field6841, final long field6842, final Class17 field6843, final Class17 field6844) {
        this.field6838 = field6838;
        this.field6832 = field6839;
        this.field6833 = field6840;
        this.field6834 = field6841;
        this.field6835 = field6842;
        this.field6836 = field6843;
        this.field6837 = field6844;
    }
    
    @Override
    public void run() {
        if (this.field6832 <= 0) {
            for (long field6833 = this.field6833; field6833 < this.field6834; ++field6833) {
                final long n = 2L * field6833;
                final long n2 = n + 1L;
                final long n3 = this.field6835 + n;
                final long n4 = this.field6835 + n2;
                this.field6836.method171(n, this.field6837.method137(n3) * Class7992.method26153(this.field6838).method137(n) + this.field6837.method137(n4) * Class7992.method26153(this.field6838).method137(n2));
                this.field6836.method171(n2, -this.field6837.method137(n3) * Class7992.method26153(this.field6838).method137(n2) + this.field6837.method137(n4) * Class7992.method26153(this.field6838).method137(n));
            }
        }
        else {
            for (long field6834 = this.field6833; field6834 < this.field6834; ++field6834) {
                final long n5 = 2L * field6834;
                final long n6 = n5 + 1L;
                final long n7 = this.field6835 + n5;
                final long n8 = this.field6835 + n6;
                this.field6836.method171(n5, this.field6837.method137(n7) * Class7992.method26153(this.field6838).method137(n5) - this.field6837.method137(n8) * Class7992.method26153(this.field6838).method137(n6));
                this.field6836.method171(n6, this.field6837.method137(n7) * Class7992.method26153(this.field6838).method137(n6) + this.field6837.method137(n8) * Class7992.method26153(this.field6838).method137(n5));
            }
        }
    }
}
