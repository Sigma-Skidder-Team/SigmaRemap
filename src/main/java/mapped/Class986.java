// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class986 implements Runnable
{
    private static String[] field5261;
    public final /* synthetic */ long field5262;
    public final /* synthetic */ long field5263;
    public final /* synthetic */ long field5264;
    public final /* synthetic */ Class17 field5265;
    public final /* synthetic */ Class7992 field5266;
    
    public Class986(final Class7992 field5266, final long field5267, final long field5268, final long field5269, final Class17 field5270) {
        this.field5266 = field5266;
        this.field5262 = field5267;
        this.field5263 = field5268;
        this.field5264 = field5269;
        this.field5265 = field5270;
    }
    
    @Override
    public void run() {
        if (this.field5262 <= 0L) {
            for (long field5263 = this.field5263; field5263 < this.field5264; ++field5263) {
                final long n = 2L * field5263;
                final long n2 = n + 1L;
                final double n3 = this.field5265.method137(n) * Class7992.method26154(this.field5266).method137(n2) + this.field5265.method137(n2) * Class7992.method26154(this.field5266).method137(n);
                this.field5265.method171(n, this.field5265.method137(n) * Class7992.method26154(this.field5266).method137(n) - this.field5265.method137(n2) * Class7992.method26154(this.field5266).method137(n2));
                this.field5265.method171(n2, n3);
            }
        }
        else {
            for (long field5264 = this.field5263; field5264 < this.field5264; ++field5264) {
                final long n4 = 2L * field5264;
                final long n5 = n4 + 1L;
                final double n6 = -this.field5265.method137(n4) * Class7992.method26154(this.field5266).method137(n5) + this.field5265.method137(n5) * Class7992.method26154(this.field5266).method137(n4);
                this.field5265.method171(n4, this.field5265.method137(n4) * Class7992.method26154(this.field5266).method137(n4) + this.field5265.method137(n5) * Class7992.method26154(this.field5266).method137(n5));
                this.field5265.method171(n5, n6);
            }
        }
    }
}
