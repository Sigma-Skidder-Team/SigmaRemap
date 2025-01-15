// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1153 implements Runnable
{
    private static String[] field6241;
    public final /* synthetic */ int field6242;
    public final /* synthetic */ int field6243;
    public final /* synthetic */ int field6244;
    public final /* synthetic */ double[] field6245;
    public final /* synthetic */ double[] field6246;
    public final /* synthetic */ Class7992 field6247;
    
    public Class1153(final Class7992 field6247, final int field6248, final int field6249, final int field6250, final double[] field6251, final double[] field6252) {
        this.field6247 = field6247;
        this.field6242 = field6248;
        this.field6243 = field6249;
        this.field6244 = field6250;
        this.field6245 = field6251;
        this.field6246 = field6252;
    }
    
    @Override
    public void run() {
        for (int i = this.field6242; i < this.field6243; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final int n3 = this.field6244 + i;
            this.field6245[n] = this.field6246[n3] * Class7992.method26151(this.field6247)[n];
            this.field6245[n2] = -this.field6246[n3] * Class7992.method26151(this.field6247)[n2];
        }
    }
}
