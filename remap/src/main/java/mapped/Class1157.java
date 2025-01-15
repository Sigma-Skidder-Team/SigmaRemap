// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1157 implements Runnable
{
    private static String[] field6269;
    public final /* synthetic */ long field6270;
    public final /* synthetic */ long field6271;
    public final /* synthetic */ long field6272;
    public final /* synthetic */ long field6273;
    public final /* synthetic */ Class22 field6274;
    public final /* synthetic */ Class22 field6275;
    public final /* synthetic */ Class7978 field6276;
    
    public Class1157(final Class7978 field6276, final long field6277, final long field6278, final long field6279, final long field6280, final Class22 field6281, final Class22 field6282) {
        this.field6276 = field6276;
        this.field6270 = field6277;
        this.field6271 = field6278;
        this.field6272 = field6279;
        this.field6273 = field6280;
        this.field6274 = field6281;
        this.field6275 = field6282;
    }
    
    @Override
    public void run() {
        if (this.field6270 <= 0L) {
            for (long field6271 = this.field6271; field6271 < this.field6272; ++field6271) {
                final long n = 2L * field6271;
                final long n2 = n + 1L;
                final long n3 = this.field6273 + field6271;
                this.field6274.method169(n, this.field6275.method135(n3) * Class7978.method26006(this.field6276).method135(n));
                this.field6274.method169(n2, -this.field6275.method135(n3) * Class7978.method26006(this.field6276).method135(n2));
            }
        }
        else {
            for (long field6272 = this.field6271; field6272 < this.field6272; ++field6272) {
                final long n4 = 2L * field6272;
                final long n5 = n4 + 1L;
                final long n6 = this.field6273 + field6272;
                this.field6274.method169(n4, this.field6275.method135(n6) * Class7978.method26006(this.field6276).method135(n4));
                this.field6274.method169(n5, this.field6275.method135(n6) * Class7978.method26006(this.field6276).method135(n5));
            }
        }
    }
}
