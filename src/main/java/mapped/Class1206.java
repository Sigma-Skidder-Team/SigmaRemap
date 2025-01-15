// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1206 implements Runnable
{
    private static String[] field6535;
    public final /* synthetic */ long field6536;
    public final /* synthetic */ long field6537;
    public final /* synthetic */ Class22 field6538;
    public final /* synthetic */ long field6539;
    public final /* synthetic */ Class22 field6540;
    public final /* synthetic */ Class8770 field6541;
    
    public Class1206(final Class8770 field6541, final long field6542, final long field6543, final Class22 field6544, final long field6545, final Class22 field6546) {
        this.field6541 = field6541;
        this.field6536 = field6542;
        this.field6537 = field6543;
        this.field6538 = field6544;
        this.field6539 = field6545;
        this.field6540 = field6546;
    }
    
    @Override
    public void run() {
        for (long field6536 = this.field6536; field6536 < this.field6537; ++field6536) {
            final long n = 2L * field6536;
            final long n2 = n + 1L;
            this.field6538.method169(this.field6539 + field6536, this.field6540.method135(n) - this.field6540.method135(n2));
            this.field6538.method169(this.field6539 + Class8770.method30454(this.field6541) - field6536, this.field6540.method135(n) + this.field6540.method135(n2));
        }
    }
}
