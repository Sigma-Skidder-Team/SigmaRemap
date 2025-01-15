// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1028 implements Runnable
{
    private static String[] field5510;
    public final /* synthetic */ int field5511;
    public final /* synthetic */ int field5512;
    public final /* synthetic */ int field5513;
    public final /* synthetic */ double[] field5514;
    public final /* synthetic */ double[] field5515;
    public final /* synthetic */ Class7992 field5516;
    
    public Class1028(final Class7992 field5516, final int field5517, final int field5518, final int field5519, final double[] field5520, final double[] field5521) {
        this.field5516 = field5516;
        this.field5511 = field5517;
        this.field5512 = field5518;
        this.field5513 = field5519;
        this.field5514 = field5520;
        this.field5515 = field5521;
    }
    
    @Override
    public void run() {
        for (int i = this.field5511; i < this.field5512; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final int n3 = this.field5513 + i;
            this.field5514[n] = this.field5515[n3] * Class7992.method26151(this.field5516)[n];
            this.field5514[n2] = this.field5515[n3] * Class7992.method26151(this.field5516)[n2];
        }
    }
}
