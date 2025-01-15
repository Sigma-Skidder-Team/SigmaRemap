// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1494 implements Runnable
{
    private static String[] field8305;
    public final /* synthetic */ long field8306;
    public final /* synthetic */ long field8307;
    public final /* synthetic */ long field8308;
    public final /* synthetic */ long field8309;
    public final /* synthetic */ Class17 field8310;
    public final /* synthetic */ Class8983 field8311;
    
    public Class1494(final Class8983 field8311, final long field8312, final long field8313, final long field8314, final long field8315, final Class17 field8316) {
        this.field8311 = field8311;
        this.field8306 = field8312;
        this.field8307 = field8313;
        this.field8308 = field8314;
        this.field8309 = field8315;
        this.field8310 = field8316;
    }
    
    @Override
    public void run() {
        for (long field8306 = this.field8306; field8306 < this.field8307; ++field8306) {
            final long n = field8306 * this.field8308;
            final long n2 = (Class8983.method31978(this.field8311) - field8306 + 1L) * this.field8308;
            for (long field8307 = this.field8309; field8307 < Class8983.method31980(this.field8311); ++field8307) {
                final long n3 = 2L * field8307;
                final long n4 = 2L * (Class8983.method31980(this.field8311) - field8307);
                this.field8310.method171(n3, this.field8310.method137(n4));
                this.field8310.method171(n3 + 1L, -this.field8310.method137(n4 + 1L));
                final long n5 = n + n3;
                final long n6 = n2 - n3;
                this.field8310.method171(n5, this.field8310.method137(n6));
                this.field8310.method171(n5 + 1L, -this.field8310.method137(n6 + 1L));
            }
        }
    }
}
