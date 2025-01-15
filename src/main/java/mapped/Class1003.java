// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1003 implements Runnable
{
    private static String[] field5346;
    public final /* synthetic */ long field5347;
    public final /* synthetic */ long field5348;
    public final /* synthetic */ long field5349;
    public final /* synthetic */ long field5350;
    public final /* synthetic */ Class17 field5351;
    public final /* synthetic */ Class7992 field5352;
    
    public Class1003(final Class7992 field5352, final long field5353, final long field5354, final long field5355, final long field5356, final Class17 field5357) {
        this.field5352 = field5352;
        this.field5347 = field5353;
        this.field5348 = field5354;
        this.field5349 = field5355;
        this.field5350 = field5356;
        this.field5351 = field5357;
    }
    
    @Override
    public void run() {
        for (long field5347 = this.field5347; field5347 < this.field5348; ++field5347) {
            final long n = 2L * field5347;
            final long n2 = this.field5349 + (this.field5350 - n) % this.field5350;
            this.field5351.method171(n2, this.field5351.method137(this.field5349 + n));
            this.field5351.method171(n2 + 1L, -this.field5351.method137(this.field5349 + n + 1L));
        }
    }
}
