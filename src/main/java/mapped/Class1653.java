// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1653 implements Runnable
{
    private static String[] field9255;
    public final /* synthetic */ long field9256;
    public final /* synthetic */ long field9257;
    public final /* synthetic */ long field9258;
    public final /* synthetic */ long field9259;
    public final /* synthetic */ long field9260;
    public final /* synthetic */ Class22 field9261;
    public final /* synthetic */ Class6362 field9262;
    
    public Class1653(final Class6362 field9262, final long field9263, final long field9264, final long field9265, final long field9266, final long field9267, final Class22 field9268) {
        this.field9262 = field9262;
        this.field9256 = field9263;
        this.field9257 = field9264;
        this.field9258 = field9265;
        this.field9259 = field9266;
        this.field9260 = field9267;
        this.field9261 = field9268;
    }
    
    @Override
    public void run() {
        for (long field9256 = this.field9256; field9256 < this.field9257; ++field9256) {
            final long n = (Class6362.method19009(this.field9262) - field9256) % Class6362.method19009(this.field9262) * this.field9258;
            final long n2 = field9256 * this.field9258;
            for (long n3 = 1L; n3 < this.field9259; ++n3) {
                final long n4 = n + (Class6362.method19006(this.field9262) - n3) * this.field9260;
                final long n5 = n2 + n3 * this.field9260;
                this.field9261.method169(n4, this.field9261.method135(n5));
                this.field9261.method169(n4 + 1L, -this.field9261.method135(n5 + 1L));
            }
        }
    }
}
