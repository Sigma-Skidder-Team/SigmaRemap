// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1459 implements Runnable
{
    private static String[] field8092;
    public final /* synthetic */ long field8093;
    public final /* synthetic */ long field8094;
    public final /* synthetic */ Class22 field8095;
    public final /* synthetic */ boolean field8096;
    public final /* synthetic */ Class6874 field8097;
    
    public Class1459(final Class6874 field8097, final long field8098, final long field8099, final Class22 field8100, final boolean field8101) {
        this.field8097 = field8097;
        this.field8093 = field8098;
        this.field8094 = field8099;
        this.field8095 = field8100;
        this.field8096 = field8101;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class6874.method21038(this.field8097), false);
        for (long field8093 = this.field8093; field8093 < this.field8094; ++field8093) {
            for (long n = 0L; n < Class6874.method21038(this.field8097); ++n) {
                class22.method169(n, this.field8095.method135(n * Class6874.method21037(this.field8097) + field8093));
            }
            Class6874.method21036(this.field8097).method30450(class22, this.field8096);
            for (long n2 = 0L; n2 < Class6874.method21038(this.field8097); ++n2) {
                this.field8095.method169(n2 * Class6874.method21037(this.field8097) + field8093, class22.method135(n2));
            }
        }
    }
}
