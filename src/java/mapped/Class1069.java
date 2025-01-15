// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1069 implements Runnable
{
    private static String[] field5750;
    public final /* synthetic */ int field5751;
    public final /* synthetic */ long field5752;
    public final /* synthetic */ long field5753;
    public final /* synthetic */ Class17 field5754;
    public final /* synthetic */ Class7992 field5755;
    
    public Class1069(final Class7992 field5755, final int field5756, final long field5757, final long field5758, final Class17 field5759) {
        this.field5755 = field5755;
        this.field5751 = field5756;
        this.field5752 = field5757;
        this.field5753 = field5758;
        this.field5754 = field5759;
    }
    
    @Override
    public void run() {
        if (this.field5751 <= 0) {
            for (long field5752 = this.field5752; field5752 < this.field5753; ++field5752) {
                final long n = 2L * field5752;
                final long n2 = n + 1L;
                final double n3 = this.field5754.method137(n) * Class7992.method26154(this.field5755).method137(n2) + this.field5754.method137(n2) * Class7992.method26154(this.field5755).method137(n);
                this.field5754.method171(n, this.field5754.method137(n) * Class7992.method26154(this.field5755).method137(n) - this.field5754.method137(n2) * Class7992.method26154(this.field5755).method137(n2));
                this.field5754.method171(n2, n3);
            }
        }
        else {
            for (long field5753 = this.field5752; field5753 < this.field5753; ++field5753) {
                final long n4 = 2L * field5753;
                final long n5 = n4 + 1L;
                final double n6 = -this.field5754.method137(n4) * Class7992.method26154(this.field5755).method137(n5) + this.field5754.method137(n5) * Class7992.method26154(this.field5755).method137(n4);
                this.field5754.method171(n4, this.field5754.method137(n4) * Class7992.method26154(this.field5755).method137(n4) + this.field5754.method137(n5) * Class7992.method26154(this.field5755).method137(n5));
                this.field5754.method171(n5, n6);
            }
        }
    }
}
