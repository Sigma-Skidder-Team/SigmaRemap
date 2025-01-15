// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1082 implements Runnable
{
    private static String[] field5833;
    public final /* synthetic */ long field5834;
    public final /* synthetic */ long field5835;
    public final /* synthetic */ Class17 field5836;
    public final /* synthetic */ boolean field5837;
    public final /* synthetic */ Class9033 field5838;
    
    public Class1082(final Class9033 field5838, final long field5839, final long field5840, final Class17 field5841, final boolean field5842) {
        this.field5838 = field5838;
        this.field5834 = field5839;
        this.field5835 = field5840;
        this.field5836 = field5841;
        this.field5837 = field5842;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class9033.method32456(this.field5838), false);
        for (long field5834 = this.field5834; field5834 < this.field5835; ++field5834) {
            for (long n = 0L; n < Class9033.method32456(this.field5838); ++n) {
                class17.method171(n, this.field5836.method137(n * Class9033.method32455(this.field5838) + field5834));
            }
            Class9033.method32454(this.field5838).method18037(class17, this.field5837);
            for (long n2 = 0L; n2 < Class9033.method32456(this.field5838); ++n2) {
                this.field5836.method171(n2 * Class9033.method32455(this.field5838) + field5834, class17.method137(n2));
            }
        }
    }
}
