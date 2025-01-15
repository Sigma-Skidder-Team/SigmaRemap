// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1527 implements Runnable
{
    private static String[] field8519;
    public final /* synthetic */ long field8520;
    public final /* synthetic */ long field8521;
    public final /* synthetic */ Class17 field8522;
    public final /* synthetic */ boolean field8523;
    public final /* synthetic */ Class7796 field8524;
    
    public Class1527(final Class7796 field8524, final long field8525, final long field8526, final Class17 field8527, final boolean field8528) {
        this.field8524 = field8524;
        this.field8520 = field8525;
        this.field8521 = field8526;
        this.field8522 = field8527;
        this.field8523 = field8528;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class7796.method25155(this.field8524), false);
        for (long field8520 = this.field8520; field8520 < this.field8521; ++field8520) {
            final long n = field8520 * Class7796.method25153(this.field8524);
            for (long n2 = 0L; n2 < Class7796.method25154(this.field8524); ++n2) {
                for (long n3 = 0L; n3 < Class7796.method25155(this.field8524); ++n3) {
                    class17.method171(n3, this.field8522.method137(n3 * Class7796.method25151(this.field8524) + n + n2));
                }
                Class7796.method25150(this.field8524).method18037(class17, this.field8523);
                for (long n4 = 0L; n4 < Class7796.method25155(this.field8524); ++n4) {
                    this.field8522.method171(n4 * Class7796.method25151(this.field8524) + n + n2, class17.method137(n4));
                }
            }
        }
    }
}
