// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1501 implements Runnable
{
    private static String[] field8350;
    public final /* synthetic */ long field8351;
    public final /* synthetic */ long field8352;
    public final /* synthetic */ Class22 field8353;
    public final /* synthetic */ boolean field8354;
    public final /* synthetic */ Class7706 field8355;
    
    public Class1501(final Class7706 field8355, final long field8356, final long field8357, final Class22 field8358, final boolean field8359) {
        this.field8355 = field8355;
        this.field8351 = field8356;
        this.field8352 = field8357;
        this.field8353 = field8358;
        this.field8354 = field8359;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class7706.method24581(this.field8355), false);
        for (long field8351 = this.field8351; field8351 < this.field8352; ++field8351) {
            for (long n = 0L; n < Class7706.method24581(this.field8355); ++n) {
                class22.method169(n, this.field8353.method135(n * Class7706.method24580(this.field8355) + field8351));
            }
            Class7706.method24579(this.field8355).method29694(class22, this.field8354);
            for (long n2 = 0L; n2 < Class7706.method24581(this.field8355); ++n2) {
                this.field8353.method169(n2 * Class7706.method24580(this.field8355) + field8351, class22.method135(n2));
            }
        }
    }
}
