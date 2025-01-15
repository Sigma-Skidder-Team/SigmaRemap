// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1197 implements Runnable
{
    private static String[] field6486;
    public final /* synthetic */ long field6487;
    public final /* synthetic */ long field6488;
    public final /* synthetic */ Class17 field6489;
    public final /* synthetic */ Class7992 field6490;
    
    public Class1197(final Class7992 field6490, final long field6491, final long field6492, final Class17 field6493) {
        this.field6490 = field6490;
        this.field6487 = field6491;
        this.field6488 = field6492;
        this.field6489 = field6493;
    }
    
    @Override
    public void run() {
        for (long field6487 = this.field6487; field6487 < this.field6488; ++field6487) {
            final long n = 2L * field6487;
            final long n2 = n + 1L;
            final double n3 = -this.field6489.method137(n) * Class7992.method26154(this.field6490).method137(n2) + this.field6489.method137(n2) * Class7992.method26154(this.field6490).method137(n);
            this.field6489.method171(n, this.field6489.method137(n) * Class7992.method26154(this.field6490).method137(n) + this.field6489.method137(n2) * Class7992.method26154(this.field6490).method137(n2));
            this.field6489.method171(n2, n3);
        }
    }
}
