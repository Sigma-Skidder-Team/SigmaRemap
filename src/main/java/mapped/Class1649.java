// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1649 implements Runnable
{
    private static String[] field9227;
    public final /* synthetic */ long field9228;
    public final /* synthetic */ long field9229;
    public final /* synthetic */ long field9230;
    public final /* synthetic */ Class22 field9231;
    public final /* synthetic */ long field9232;
    public final /* synthetic */ Class22 field9233;
    public final /* synthetic */ long field9234;
    public final /* synthetic */ Class6362 field9235;
    
    public Class1649(final Class6362 field9235, final long field9236, final long field9237, final long field9238, final Class22 field9239, final long field9240, final Class22 field9241, final long field9242) {
        this.field9235 = field9235;
        this.field9228 = field9236;
        this.field9229 = field9237;
        this.field9230 = field9238;
        this.field9231 = field9239;
        this.field9232 = field9240;
        this.field9233 = field9241;
        this.field9234 = field9242;
    }
    
    @Override
    public void run() {
        for (long field9228 = this.field9228; field9228 < this.field9229; ++field9228) {
            final long n = field9228 * this.field9230;
            for (long n2 = 0L; n2 < Class6362.method19006(this.field9235); ++n2) {
                Class8601.method29152(this.field9231, field9228 * Class6362.method19006(this.field9235) * this.field9232 + n2 * this.field9232, this.field9233, n + n2 * this.field9234, this.field9232);
            }
        }
    }
}
