// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1596 implements Runnable
{
    private static String[] field8906;
    public final /* synthetic */ long field8907;
    public final /* synthetic */ long field8908;
    public final /* synthetic */ Class22 field8909;
    public final /* synthetic */ boolean field8910;
    public final /* synthetic */ Class9117 field8911;
    
    public Class1596(final Class9117 field8911, final long field8912, final long field8913, final Class22 field8914, final boolean field8915) {
        this.field8911 = field8911;
        this.field8907 = field8912;
        this.field8908 = field8913;
        this.field8909 = field8914;
        this.field8910 = field8915;
    }
    
    @Override
    public void run() {
        for (long field8907 = this.field8907; field8907 < this.field8908; ++field8907) {
            final long n = field8907 * Class9117.method33010(this.field8911);
            for (long n2 = 0L; n2 < Class9117.method33011(this.field8911); ++n2) {
                Class9117.method33005(this.field8911).method29692(this.field8909, n + n2 * Class9117.method33012(this.field8911), this.field8910);
            }
        }
    }
}
