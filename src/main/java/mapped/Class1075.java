// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1075 implements Runnable
{
    private static String[] field5783;
    public final /* synthetic */ long field5784;
    public final /* synthetic */ long field5785;
    public final /* synthetic */ long field5786;
    public final /* synthetic */ Class17 field5787;
    public final /* synthetic */ Class17 field5788;
    public final /* synthetic */ Class7992 field5789;
    
    public Class1075(final Class7992 field5789, final long field5790, final long field5791, final long field5792, final Class17 field5793, final Class17 field5794) {
        this.field5789 = field5789;
        this.field5784 = field5790;
        this.field5785 = field5791;
        this.field5786 = field5792;
        this.field5787 = field5793;
        this.field5788 = field5794;
    }
    
    @Override
    public void run() {
        for (long field5784 = this.field5784; field5784 < this.field5785; ++field5784) {
            final long n = 2L * field5784;
            final long n2 = n + 1L;
            final long n3 = this.field5786 + field5784;
            this.field5787.method171(n, this.field5788.method137(n3) * Class7992.method26153(this.field5789).method137(n));
            this.field5787.method171(n2, -this.field5788.method137(n3) * Class7992.method26153(this.field5789).method137(n2));
        }
    }
}
