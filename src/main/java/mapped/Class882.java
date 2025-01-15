// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class882 implements Runnable
{
    private static String[] field4754;
    public final /* synthetic */ long field4755;
    public final /* synthetic */ long field4756;
    public final /* synthetic */ long field4757;
    public final /* synthetic */ long field4758;
    public final /* synthetic */ Class17 field4759;
    public final /* synthetic */ Class17 field4760;
    public final /* synthetic */ long field4761;
    public final /* synthetic */ Class8983 field4762;
    
    public Class882(final Class8983 field4762, final long field4763, final long field4764, final long field4765, final long field4766, final Class17 field4767, final Class17 field4768, final long field4769) {
        this.field4762 = field4762;
        this.field4755 = field4763;
        this.field4756 = field4764;
        this.field4757 = field4765;
        this.field4758 = field4766;
        this.field4759 = field4767;
        this.field4760 = field4768;
        this.field4761 = field4769;
    }
    
    @Override
    public void run() {
        for (long field4755 = this.field4755; field4755 < this.field4756; ++field4755) {
            final long n = 2L * field4755;
            for (long n2 = 0L; n2 < this.field4757; ++n2) {
                final long n3 = field4755 * this.field4758 + 2L * n2;
                this.field4759.method171(n3, this.field4760.method137(n2 * this.field4761 + n));
                this.field4759.method171(n3 + 1L, this.field4760.method137(n2 * this.field4761 + n + 1L));
            }
        }
    }
}
