// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1235 implements Runnable
{
    private static String[] field6716;
    public final /* synthetic */ long field6717;
    public final /* synthetic */ long field6718;
    public final /* synthetic */ Class22 field6719;
    public final /* synthetic */ boolean field6720;
    public final /* synthetic */ Class7706 field6721;
    
    public Class1235(final Class7706 field6721, final long field6722, final long field6723, final Class22 field6724, final boolean field6725) {
        this.field6721 = field6721;
        this.field6717 = field6722;
        this.field6718 = field6723;
        this.field6719 = field6724;
        this.field6720 = field6725;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class7706.method24581(this.field6721), false);
        for (long field6717 = this.field6717; field6717 < this.field6718; ++field6717) {
            for (long n = 0L; n < Class7706.method24581(this.field6721); ++n) {
                class22.method169(n, this.field6719.method135(n * Class7706.method24580(this.field6721) + field6717));
            }
            Class7706.method24579(this.field6721).method29690(class22, this.field6720);
            for (long n2 = 0L; n2 < Class7706.method24581(this.field6721); ++n2) {
                this.field6719.method169(n2 * Class7706.method24580(this.field6721) + field6717, class22.method135(n2));
            }
        }
    }
}
