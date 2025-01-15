// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1450 implements Runnable
{
    private static String[] field8035;
    public final /* synthetic */ long field8036;
    public final /* synthetic */ long field8037;
    public final /* synthetic */ Class17 field8038;
    public final /* synthetic */ Class8788 field8039;
    
    public Class1450(final Class8788 field8039, final long field8040, final long field8041, final Class17 field8042) {
        this.field8039 = field8039;
        this.field8036 = field8040;
        this.field8037 = field8041;
        this.field8038 = field8042;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class8788.method30615(this.field8039), false);
        for (long field8036 = this.field8036; field8036 < this.field8037; ++field8036) {
            for (long n = 0L; n < Class8788.method30615(this.field8039); ++n) {
                class17.method171(n, this.field8038.method137(n * Class8788.method30614(this.field8039) + field8036));
            }
            Class8788.method30613(this.field8039).method21387(class17);
            for (long n2 = 0L; n2 < Class8788.method30615(this.field8039); ++n2) {
                this.field8038.method171(n2 * Class8788.method30614(this.field8039) + field8036, class17.method137(n2));
            }
        }
    }
}
