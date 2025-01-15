// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1066 implements Runnable
{
    private static String[] field5736;
    public final /* synthetic */ long field5737;
    public final /* synthetic */ long field5738;
    public final /* synthetic */ Class22 field5739;
    public final /* synthetic */ boolean field5740;
    public final /* synthetic */ Class6498 field5741;
    
    public Class1066(final Class6498 field5741, final long field5742, final long field5743, final Class22 field5744, final boolean field5745) {
        this.field5741 = field5741;
        this.field5737 = field5742;
        this.field5738 = field5743;
        this.field5739 = field5744;
        this.field5740 = field5745;
    }
    
    @Override
    public void run() {
        for (long field5737 = this.field5737; field5737 < this.field5738; ++field5737) {
            final long n = field5737 * Class6498.method19572(this.field5741);
            for (long n2 = 0L; n2 < Class6498.method19573(this.field5741); ++n2) {
                Class6498.method19567(this.field5741).method34184(this.field5739, n + n2 * Class6498.method19574(this.field5741), this.field5740);
            }
        }
    }
}
