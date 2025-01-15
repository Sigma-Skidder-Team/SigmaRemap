// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1029 implements Runnable
{
    private static String[] field5517;
    public final /* synthetic */ long field5518;
    public final /* synthetic */ long field5519;
    public final /* synthetic */ Class22 field5520;
    public final /* synthetic */ boolean field5521;
    public final /* synthetic */ Class6710 field5522;
    
    public Class1029(final Class6710 field5522, final long field5523, final long field5524, final Class22 field5525, final boolean field5526) {
        this.field5522 = field5522;
        this.field5518 = field5523;
        this.field5519 = field5524;
        this.field5520 = field5525;
        this.field5521 = field5526;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class6710.method20385(this.field5522), false);
        for (long field5518 = this.field5518; field5518 < this.field5519; ++field5518) {
            for (long n = 0L; n < Class6710.method20385(this.field5522); ++n) {
                class22.method169(n, this.field5520.method135(n * Class6710.method20384(this.field5522) + field5518));
            }
            Class6710.method20383(this.field5522).method34182(class22, this.field5521);
            for (long n2 = 0L; n2 < Class6710.method20385(this.field5522); ++n2) {
                this.field5520.method169(n2 * Class6710.method20384(this.field5522) + field5518, class22.method135(n2));
            }
        }
    }
}
