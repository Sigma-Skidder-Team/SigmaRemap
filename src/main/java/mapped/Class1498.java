// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1498 implements Runnable
{
    private static String[] field8327;
    public final /* synthetic */ long field8328;
    public final /* synthetic */ long field8329;
    public final /* synthetic */ Class17 field8330;
    public final /* synthetic */ long field8331;
    public final /* synthetic */ Class17 field8332;
    public final /* synthetic */ Class6970 field8333;
    
    public Class1498(final Class6970 field8333, final long field8334, final long field8335, final Class17 field8336, final long field8337, final Class17 field8338) {
        this.field8333 = field8333;
        this.field8328 = field8334;
        this.field8329 = field8335;
        this.field8330 = field8336;
        this.field8331 = field8337;
        this.field8332 = field8338;
    }
    
    @Override
    public void run() {
        for (long field8328 = this.field8328; field8328 < this.field8329; ++field8328) {
            final long n = 2L * field8328;
            final long n2 = n + 1L;
            this.field8330.method171(this.field8331 + field8328, this.field8332.method137(n) - this.field8332.method137(n2));
            this.field8330.method171(this.field8331 + Class6970.method21395(this.field8333) - field8328, this.field8332.method137(n) + this.field8332.method137(n2));
        }
    }
}
