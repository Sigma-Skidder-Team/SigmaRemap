// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1080 implements Runnable
{
    private static String[] field5819;
    public final /* synthetic */ long field5820;
    public final /* synthetic */ long field5821;
    public final /* synthetic */ Class17 field5822;
    public final /* synthetic */ long field5823;
    public final /* synthetic */ Class17 field5824;
    public final /* synthetic */ boolean field5825;
    public final /* synthetic */ Class8983 field5826;
    
    public Class1080(final Class8983 field5826, final long field5827, final long field5828, final Class17 field5829, final long field5830, final Class17 field5831, final boolean field5832) {
        this.field5826 = field5826;
        this.field5820 = field5827;
        this.field5821 = field5828;
        this.field5822 = field5829;
        this.field5823 = field5830;
        this.field5824 = field5831;
        this.field5825 = field5832;
    }
    
    @Override
    public void run() {
        for (long field5820 = this.field5820; field5820 < this.field5821; ++field5820) {
            final long n = 2L * field5820;
            for (long n2 = 0L; n2 < Class8983.method31978(this.field5826); ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n2 * Class8983.method31980(this.field5826) + n;
                this.field5822.method171(field5820 * this.field5823 + n3, this.field5824.method137(n4));
                this.field5822.method171(field5820 * this.field5823 + n3 + 1L, this.field5824.method137(n4 + 1L));
            }
            Class8983.method31977(this.field5826).method26079(this.field5822, field5820 * this.field5823, this.field5825);
        }
    }
}
