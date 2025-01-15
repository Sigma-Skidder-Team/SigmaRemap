// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1403 implements Runnable
{
    private static String[] field7746;
    public final /* synthetic */ long field7747;
    public final /* synthetic */ long field7748;
    public final /* synthetic */ Class17 field7749;
    public final /* synthetic */ boolean field7750;
    public final /* synthetic */ Class7796 field7751;
    
    public Class1403(final Class7796 field7751, final long field7752, final long field7753, final Class17 field7754, final boolean field7755) {
        this.field7751 = field7751;
        this.field7747 = field7752;
        this.field7748 = field7753;
        this.field7749 = field7754;
        this.field7750 = field7755;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class7796.method25152(this.field7751), false);
        for (long field7747 = this.field7747; field7747 < this.field7748; ++field7747) {
            final long n = field7747 * Class7796.method25151(this.field7751);
            for (long n2 = 0L; n2 < Class7796.method25154(this.field7751); ++n2) {
                for (long n3 = 0L; n3 < Class7796.method25152(this.field7751); ++n3) {
                    class17.method171(n3, this.field7749.method137(n + n3 * Class7796.method25153(this.field7751) + n2));
                }
                Class7796.method25148(this.field7751).method18041(class17, this.field7750);
                for (long n4 = 0L; n4 < Class7796.method25152(this.field7751); ++n4) {
                    this.field7749.method171(n + n4 * Class7796.method25153(this.field7751) + n2, class17.method137(n4));
                }
            }
        }
    }
}
