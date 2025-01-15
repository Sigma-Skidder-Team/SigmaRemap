// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class947 implements Runnable
{
    private static String[] field5003;
    public final /* synthetic */ int field5004;
    public final /* synthetic */ int field5005;
    public final /* synthetic */ int field5006;
    public final /* synthetic */ Class22 field5007;
    public final /* synthetic */ boolean field5008;
    public final /* synthetic */ Class7706 field5009;
    
    public Class947(final Class7706 field5009, final int field5010, final int field5011, final int field5012, final Class22 field5013, final boolean field5014) {
        this.field5009 = field5009;
        this.field5004 = field5010;
        this.field5005 = field5011;
        this.field5006 = field5012;
        this.field5007 = field5013;
        this.field5008 = field5014;
    }
    
    @Override
    public void run() {
        if (this.field5004 != -1) {
            for (long n = this.field5005; n < Class7706.method24581(this.field5009); n += this.field5006) {
                Class7706.method24577(this.field5009).method29696(this.field5007, n * Class7706.method24580(this.field5009), this.field5008);
            }
        }
        else {
            for (long n2 = this.field5005; n2 < Class7706.method24581(this.field5009); n2 += this.field5006) {
                Class7706.method24577(this.field5009).method29692(this.field5007, n2 * Class7706.method24580(this.field5009), this.field5008);
            }
        }
    }
}
