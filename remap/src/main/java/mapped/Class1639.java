// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1639 implements Runnable
{
    private static String[] field9160;
    public final /* synthetic */ long field9161;
    public final /* synthetic */ long field9162;
    public final /* synthetic */ Class22 field9163;
    public final /* synthetic */ boolean field9164;
    public final /* synthetic */ Class7706 field9165;
    
    public Class1639(final Class7706 field9165, final long field9166, final long field9167, final Class22 field9168, final boolean field9169) {
        this.field9165 = field9165;
        this.field9161 = field9166;
        this.field9162 = field9167;
        this.field9163 = field9168;
        this.field9164 = field9169;
    }
    
    @Override
    public void run() {
        for (long field9161 = this.field9161; field9161 < this.field9162; ++field9161) {
            Class7706.method24577(this.field9165).method29696(this.field9163, field9161 * Class7706.method24580(this.field9165), this.field9164);
        }
    }
}
