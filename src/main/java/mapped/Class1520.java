// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1520 implements Runnable
{
    private static String[] field8473;
    public final /* synthetic */ long field8474;
    public final /* synthetic */ long field8475;
    public final /* synthetic */ Class17 field8476;
    public final /* synthetic */ long field8477;
    public final /* synthetic */ Class17 field8478;
    public final /* synthetic */ Class8983 field8479;
    
    public Class1520(final Class8983 field8479, final long field8480, final long field8481, final Class17 field8482, final long field8483, final Class17 field8484) {
        this.field8479 = field8479;
        this.field8474 = field8480;
        this.field8475 = field8481;
        this.field8476 = field8482;
        this.field8477 = field8483;
        this.field8478 = field8484;
    }
    
    @Override
    public void run() {
        for (long field8474 = this.field8474; field8474 < this.field8475; ++field8474) {
            final long n = 2L * field8474;
            for (long n2 = 0L; n2 < Class8983.method31978(this.field8479); ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n2 * Class8983.method31980(this.field8479) + n;
                this.field8476.method171(field8474 * this.field8477 + n3, this.field8478.method137(n4));
                this.field8476.method171(field8474 * this.field8477 + n3 + 1L, this.field8478.method137(n4 + 1L));
            }
            Class8983.method31977(this.field8479).method26075(this.field8476, field8474 * this.field8477);
        }
    }
}
