// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1477 implements Runnable
{
    private static String[] field8201;
    public final /* synthetic */ long field8202;
    public final /* synthetic */ long field8203;
    public final /* synthetic */ Class22 field8204;
    public final /* synthetic */ boolean field8205;
    public final /* synthetic */ Class7706 field8206;
    
    public Class1477(final Class7706 field8206, final long field8207, final long field8208, final Class22 field8209, final boolean field8210) {
        this.field8206 = field8206;
        this.field8202 = field8207;
        this.field8203 = field8208;
        this.field8204 = field8209;
        this.field8205 = field8210;
    }
    
    @Override
    public void run() {
        for (long field8202 = this.field8202; field8202 < this.field8203; ++field8202) {
            Class7706.method24577(this.field8206).method29692(this.field8204, field8202 * Class7706.method24580(this.field8206), this.field8205);
        }
    }
}
