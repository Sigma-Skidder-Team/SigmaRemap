// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1025 implements Runnable
{
    private static String[] field5490;
    public final /* synthetic */ long field5491;
    public final /* synthetic */ long field5492;
    public final /* synthetic */ long field5493;
    public final /* synthetic */ Class17 field5494;
    public final /* synthetic */ Class17 field5495;
    public final /* synthetic */ Class7992 field5496;
    
    public Class1025(final Class7992 field5496, final long field5497, final long field5498, final long field5499, final Class17 field5500, final Class17 field5501) {
        this.field5496 = field5496;
        this.field5491 = field5497;
        this.field5492 = field5498;
        this.field5493 = field5499;
        this.field5494 = field5500;
        this.field5495 = field5501;
    }
    
    @Override
    public void run() {
        for (long field5491 = this.field5491; field5491 < this.field5492; ++field5491) {
            final long n = 2L * field5491;
            final long n2 = n + 1L;
            final long n3 = this.field5493 + field5491;
            this.field5494.method171(n, this.field5495.method137(n3) * Class7992.method26153(this.field5496).method137(n));
            this.field5494.method171(n2, this.field5495.method137(n3) * Class7992.method26153(this.field5496).method137(n2));
        }
    }
}
