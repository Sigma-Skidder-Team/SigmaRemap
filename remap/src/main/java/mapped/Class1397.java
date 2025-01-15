// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1397 implements Runnable
{
    private static String[] field7706;
    public final /* synthetic */ long field7707;
    public final /* synthetic */ long field7708;
    public final /* synthetic */ Class22 field7709;
    public final /* synthetic */ boolean field7710;
    public final /* synthetic */ Class9117 field7711;
    
    public Class1397(final Class9117 field7711, final long field7712, final long field7713, final Class22 field7714, final boolean field7715) {
        this.field7711 = field7711;
        this.field7707 = field7712;
        this.field7708 = field7713;
        this.field7709 = field7714;
        this.field7710 = field7715;
    }
    
    @Override
    public void run() {
        for (long field7707 = this.field7707; field7707 < this.field7708; ++field7707) {
            final long n = field7707 * Class9117.method33010(this.field7711);
            for (long n2 = 0L; n2 < Class9117.method33011(this.field7711); ++n2) {
                Class9117.method33005(this.field7711).method29696(this.field7709, n + n2 * Class9117.method33012(this.field7711), this.field7710);
            }
        }
    }
}
