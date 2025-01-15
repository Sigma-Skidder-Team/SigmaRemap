// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1017 implements Runnable
{
    private static String[] field5440;
    public final /* synthetic */ long field5441;
    public final /* synthetic */ long field5442;
    public final /* synthetic */ Class22 field5443;
    public final /* synthetic */ boolean field5444;
    public final /* synthetic */ Class9117 field5445;
    
    public Class1017(final Class9117 field5445, final long field5446, final long field5447, final Class22 field5448, final boolean field5449) {
        this.field5445 = field5445;
        this.field5441 = field5446;
        this.field5442 = field5447;
        this.field5443 = field5448;
        this.field5444 = field5449;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class9117.method33011(this.field5445), false);
        for (long field5441 = this.field5441; field5441 < this.field5442; ++field5441) {
            final long n = field5441 * Class9117.method33010(this.field5445);
            for (long n2 = 0L; n2 < Class9117.method33013(this.field5445); ++n2) {
                for (long n3 = 0L; n3 < Class9117.method33011(this.field5445); ++n3) {
                    class22.method169(n3, this.field5443.method135(n + n3 * Class9117.method33012(this.field5445) + n2));
                }
                Class9117.method33007(this.field5445).method29690(class22, this.field5444);
                for (long n4 = 0L; n4 < Class9117.method33011(this.field5445); ++n4) {
                    this.field5443.method169(n + n4 * Class9117.method33012(this.field5445) + n2, class22.method135(n4));
                }
            }
        }
    }
}
