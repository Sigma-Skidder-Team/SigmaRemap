// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1204 implements Runnable
{
    private static String[] field6525;
    public final /* synthetic */ long field6526;
    public final /* synthetic */ long field6527;
    public final /* synthetic */ Class17 field6528;
    public final /* synthetic */ boolean field6529;
    public final /* synthetic */ Class8788 field6530;
    
    public Class1204(final Class8788 field6530, final long field6531, final long field6532, final Class17 field6533, final boolean field6534) {
        this.field6530 = field6530;
        this.field6526 = field6531;
        this.field6527 = field6532;
        this.field6528 = field6533;
        this.field6529 = field6534;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class8788.method30615(this.field6530), false);
        for (long field6526 = this.field6526; field6526 < this.field6527; ++field6526) {
            for (long n = 0L; n < Class8788.method30615(this.field6530); ++n) {
                class17.method171(n, this.field6528.method137(n * Class8788.method30614(this.field6530) + field6526));
            }
            Class8788.method30613(this.field6530).method21391(class17, this.field6529);
            for (long n2 = 0L; n2 < Class8788.method30615(this.field6530); ++n2) {
                this.field6528.method171(n2 * Class8788.method30614(this.field6530) + field6526, class17.method137(n2));
            }
        }
    }
}
