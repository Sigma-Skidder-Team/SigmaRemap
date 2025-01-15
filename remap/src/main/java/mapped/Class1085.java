// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1085 implements Runnable
{
    private static String[] field5856;
    public final /* synthetic */ long field5857;
    public final /* synthetic */ long field5858;
    public final /* synthetic */ Class17 field5859;
    public final /* synthetic */ boolean field5860;
    public final /* synthetic */ Class7796 field5861;
    
    public Class1085(final Class7796 field5861, final long field5862, final long field5863, final Class17 field5864, final boolean field5865) {
        this.field5861 = field5861;
        this.field5857 = field5862;
        this.field5858 = field5863;
        this.field5859 = field5864;
        this.field5860 = field5865;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class7796.method25155(this.field5861), false);
        for (long field5857 = this.field5857; field5857 < this.field5858; ++field5857) {
            final long n = field5857 * Class7796.method25153(this.field5861);
            for (long n2 = 0L; n2 < Class7796.method25154(this.field5861); ++n2) {
                for (long n3 = 0L; n3 < Class7796.method25155(this.field5861); ++n3) {
                    class17.method171(n3, this.field5859.method137(n3 * Class7796.method25151(this.field5861) + n + n2));
                }
                Class7796.method25150(this.field5861).method18041(class17, this.field5860);
                for (long n4 = 0L; n4 < Class7796.method25155(this.field5861); ++n4) {
                    this.field5859.method171(n4 * Class7796.method25151(this.field5861) + n + n2, class17.method137(n4));
                }
            }
        }
    }
}
