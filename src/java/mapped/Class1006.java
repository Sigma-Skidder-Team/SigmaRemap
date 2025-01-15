// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1006 implements Runnable
{
    private static String[] field5367;
    public final /* synthetic */ long field5368;
    public final /* synthetic */ long field5369;
    public final /* synthetic */ long field5370;
    public final /* synthetic */ long field5371;
    public final /* synthetic */ Class22 field5372;
    public final /* synthetic */ Class7978 field5373;
    
    public Class1006(final Class7978 field5373, final long field5374, final long field5375, final long field5376, final long field5377, final Class22 field5378) {
        this.field5373 = field5373;
        this.field5368 = field5374;
        this.field5369 = field5375;
        this.field5370 = field5376;
        this.field5371 = field5377;
        this.field5372 = field5378;
    }
    
    @Override
    public void run() {
        for (long field5368 = this.field5368; field5368 < this.field5369; ++field5368) {
            final long n = 2L * field5368;
            final long n2 = this.field5370 + (this.field5371 - n) % this.field5371;
            this.field5372.method169(n2, this.field5372.method135(this.field5370 + n));
            this.field5372.method169(n2 + 1L, -this.field5372.method135(this.field5370 + n + 1L));
        }
    }
}
