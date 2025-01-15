// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class995 implements Runnable
{
    private static String[] field5305;
    public final /* synthetic */ long field5306;
    public final /* synthetic */ long field5307;
    public final /* synthetic */ long field5308;
    public final /* synthetic */ long field5309;
    public final /* synthetic */ long field5310;
    public final /* synthetic */ long field5311;
    public final /* synthetic */ Class17 field5312;
    public final /* synthetic */ Class6733 field5313;
    
    public Class995(final Class6733 field5313, final long field5314, final long field5315, final long field5316, final long field5317, final long field5318, final long field5319, final Class17 field5320) {
        this.field5313 = field5313;
        this.field5306 = field5314;
        this.field5307 = field5315;
        this.field5308 = field5316;
        this.field5309 = field5317;
        this.field5310 = field5318;
        this.field5311 = field5319;
        this.field5312 = field5320;
    }
    
    @Override
    public void run() {
        for (long field5306 = this.field5306; field5306 < this.field5307; ++field5306) {
            final long n = (Class6733.method20485(this.field5313) - field5306) % Class6733.method20485(this.field5313) * this.field5308;
            final long n2 = field5306 * this.field5308;
            for (long n3 = 1L; n3 < this.field5309; ++n3) {
                final long n4 = (Class6733.method20482(this.field5313) - n3) * this.field5310;
                final long n5 = n3 * this.field5310;
                final long n6 = n + n4;
                for (long n7 = 0L; n7 < Class6733.method20484(this.field5313); ++n7) {
                    final long n8 = 2L * n7;
                    final long n9 = this.field5311 - n8;
                    final long n10 = n2 + n5 + n8;
                    this.field5312.method171(n6 + n9 % this.field5311, this.field5312.method137(n10));
                    this.field5312.method171(n6 + (n9 + 1L) % this.field5311, -this.field5312.method137(n10 + 1L));
                }
            }
        }
    }
}
