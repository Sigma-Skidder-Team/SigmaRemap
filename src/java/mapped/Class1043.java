// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1043 implements Runnable
{
    private static String[] field5590;
    public final /* synthetic */ long field5591;
    public final /* synthetic */ long field5592;
    public final /* synthetic */ long field5593;
    public final /* synthetic */ Class17 field5594;
    public final /* synthetic */ long field5595;
    public final /* synthetic */ Class17 field5596;
    public final /* synthetic */ long field5597;
    public final /* synthetic */ Class6733 field5598;
    
    public Class1043(final Class6733 field5598, final long field5599, final long field5600, final long field5601, final Class17 field5602, final long field5603, final Class17 field5604, final long field5605) {
        this.field5598 = field5598;
        this.field5591 = field5599;
        this.field5592 = field5600;
        this.field5593 = field5601;
        this.field5594 = field5602;
        this.field5595 = field5603;
        this.field5596 = field5604;
        this.field5597 = field5605;
    }
    
    @Override
    public void run() {
        for (long field5591 = this.field5591; field5591 < this.field5592; ++field5591) {
            final long n = field5591 * this.field5593;
            for (long n2 = 0L; n2 < Class6733.method20482(this.field5598); ++n2) {
                Class8601.method29154(this.field5594, field5591 * Class6733.method20482(this.field5598) * this.field5595 + n2 * this.field5595, this.field5596, n + n2 * this.field5597, this.field5595);
            }
        }
    }
}
