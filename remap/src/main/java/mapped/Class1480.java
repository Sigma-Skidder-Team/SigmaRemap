// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1480 implements Runnable
{
    private static String[] field8222;
    public final /* synthetic */ long field8223;
    public final /* synthetic */ long field8224;
    public final /* synthetic */ Class17 field8225;
    public final /* synthetic */ boolean field8226;
    public final /* synthetic */ Class7568 field8227;
    
    public Class1480(final Class7568 field8227, final long field8228, final long field8229, final Class17 field8230, final boolean field8231) {
        this.field8227 = field8227;
        this.field8223 = field8228;
        this.field8224 = field8229;
        this.field8225 = field8230;
        this.field8226 = field8231;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class7568.method23785(this.field8227), false);
        for (long field8223 = this.field8223; field8223 < this.field8224; ++field8223) {
            final long n = field8223 * Class7568.method23776(this.field8227);
            for (long n2 = 0L; n2 < Class7568.method23787(this.field8227); ++n2) {
                for (long n3 = 0L; n3 < Class7568.method23785(this.field8227); ++n3) {
                    class17.method171(n3, this.field8225.method137(n + n3 * Class7568.method23778(this.field8227) + n2));
                }
                Class7568.method23781(this.field8227).method30726(class17, this.field8226);
                for (long n4 = 0L; n4 < Class7568.method23785(this.field8227); ++n4) {
                    this.field8225.method171(n + n4 * Class7568.method23778(this.field8227) + n2, class17.method137(n4));
                }
            }
        }
    }
}
