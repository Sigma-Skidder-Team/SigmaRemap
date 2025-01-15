// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1541 implements Runnable
{
    private static String[] field8611;
    public final /* synthetic */ long field8612;
    public final /* synthetic */ long field8613;
    public final /* synthetic */ Class22 field8614;
    public final /* synthetic */ boolean field8615;
    public final /* synthetic */ Class6498 field8616;
    
    public Class1541(final Class6498 field8616, final long field8617, final long field8618, final Class22 field8619, final boolean field8620) {
        this.field8616 = field8616;
        this.field8612 = field8617;
        this.field8613 = field8618;
        this.field8614 = field8619;
        this.field8615 = field8620;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class6498.method19576(this.field8616), false);
        for (long field8612 = this.field8612; field8612 < this.field8613; ++field8612) {
            final long n = field8612 * Class6498.method19574(this.field8616);
            for (long n2 = 0L; n2 < Class6498.method19575(this.field8616); ++n2) {
                for (long n3 = 0L; n3 < Class6498.method19576(this.field8616); ++n3) {
                    class22.method169(n3, this.field8614.method135(n3 * Class6498.method19572(this.field8616) + n + n2));
                }
                Class6498.method19571(this.field8616).method34182(class22, this.field8615);
                for (long n4 = 0L; n4 < Class6498.method19576(this.field8616); ++n4) {
                    this.field8614.method169(n4 * Class6498.method19572(this.field8616) + n + n2, class22.method135(n4));
                }
            }
        }
    }
}
