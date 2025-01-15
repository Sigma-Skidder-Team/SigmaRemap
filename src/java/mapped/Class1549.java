// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1549 implements Runnable
{
    private static String[] field8653;
    public final /* synthetic */ long field8654;
    public final /* synthetic */ long field8655;
    public final /* synthetic */ Class22 field8656;
    public final /* synthetic */ boolean field8657;
    public final /* synthetic */ Class8328 field8658;
    
    public Class1549(final Class8328 field8658, final long field8659, final long field8660, final Class22 field8661, final boolean field8662) {
        this.field8658 = field8658;
        this.field8654 = field8659;
        this.field8655 = field8660;
        this.field8656 = field8661;
        this.field8657 = field8662;
    }
    
    @Override
    public void run() {
        for (long field8654 = this.field8654; field8654 < this.field8655; ++field8654) {
            Class8328.method27759(this.field8658).method25950(this.field8656, field8654 * Class8328.method27764(this.field8658), this.field8657);
        }
    }
}
