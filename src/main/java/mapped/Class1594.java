// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1594 implements Runnable
{
    private static String[] field8894;
    public final /* synthetic */ long field8895;
    public final /* synthetic */ long field8896;
    public final /* synthetic */ Class22 field8897;
    public final /* synthetic */ boolean field8898;
    public final /* synthetic */ Class9117 field8899;
    
    public Class1594(final Class9117 field8899, final long field8900, final long field8901, final Class22 field8902, final boolean field8903) {
        this.field8899 = field8899;
        this.field8895 = field8900;
        this.field8896 = field8901;
        this.field8897 = field8902;
        this.field8898 = field8903;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class9117.method33011(this.field8899), false);
        for (long field8895 = this.field8895; field8895 < this.field8896; ++field8895) {
            final long n = field8895 * Class9117.method33010(this.field8899);
            for (long n2 = 0L; n2 < Class9117.method33013(this.field8899); ++n2) {
                for (long n3 = 0L; n3 < Class9117.method33011(this.field8899); ++n3) {
                    class22.method169(n3, this.field8897.method135(n + n3 * Class9117.method33012(this.field8899) + n2));
                }
                Class9117.method33007(this.field8899).method29694(class22, this.field8898);
                for (long n4 = 0L; n4 < Class9117.method33011(this.field8899); ++n4) {
                    this.field8897.method169(n + n4 * Class9117.method33012(this.field8899) + n2, class22.method135(n4));
                }
            }
        }
    }
}
