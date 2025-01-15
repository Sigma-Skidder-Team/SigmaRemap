// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1401 implements Runnable
{
    private static String[] field7735;
    public final /* synthetic */ long field7736;
    public final /* synthetic */ long field7737;
    public final /* synthetic */ Class22 field7738;
    public final /* synthetic */ boolean field7739;
    public final /* synthetic */ Class6498 field7740;
    
    public Class1401(final Class6498 field7740, final long field7741, final long field7742, final Class22 field7743, final boolean field7744) {
        this.field7740 = field7740;
        this.field7736 = field7741;
        this.field7737 = field7742;
        this.field7738 = field7743;
        this.field7739 = field7744;
    }
    
    @Override
    public void run() {
        for (long field7736 = this.field7736; field7736 < this.field7737; ++field7736) {
            final long n = field7736 * Class6498.method19564(this.field7740);
            for (long n2 = 0L; n2 < Class6498.method19573(this.field7740); ++n2) {
                Class6498.method19567(this.field7740).method34188(this.field7738, n + n2 * Class6498.method19566(this.field7740), this.field7739);
            }
        }
    }
}
