// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class964 implements Runnable
{
    private static String[] field5124;
    public final /* synthetic */ long field5125;
    public final /* synthetic */ long field5126;
    public final /* synthetic */ long field5127;
    public final /* synthetic */ Class17 field5128;
    public final /* synthetic */ long field5129;
    public final /* synthetic */ Class17 field5130;
    public final /* synthetic */ long field5131;
    public final /* synthetic */ Class6733 field5132;
    
    public Class964(final Class6733 field5132, final long field5133, final long field5134, final long field5135, final Class17 field5136, final long field5137, final Class17 field5138, final long field5139) {
        this.field5132 = field5132;
        this.field5125 = field5133;
        this.field5126 = field5134;
        this.field5127 = field5135;
        this.field5128 = field5136;
        this.field5129 = field5137;
        this.field5130 = field5138;
        this.field5131 = field5139;
    }
    
    @Override
    public void run() {
        for (long field5125 = this.field5125; field5125 < this.field5126; ++field5125) {
            final long n = field5125 * this.field5127;
            for (long n2 = 0L; n2 < Class6733.method20482(this.field5132); ++n2) {
                Class8601.method29154(this.field5128, field5125 * Class6733.method20482(this.field5132) * this.field5129 + n2 * this.field5129, this.field5130, n + n2 * this.field5131, this.field5129);
            }
        }
    }
}
