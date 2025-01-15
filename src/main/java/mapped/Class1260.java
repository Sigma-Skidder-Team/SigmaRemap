// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1260 implements Runnable
{
    private static String[] field6868;
    public final /* synthetic */ long field6869;
    public final /* synthetic */ long field6870;
    public final /* synthetic */ Class22 field6871;
    public final /* synthetic */ boolean field6872;
    public final /* synthetic */ Class6498 field6873;
    
    public Class1260(final Class6498 field6873, final long field6874, final long field6875, final Class22 field6876, final boolean field6877) {
        this.field6873 = field6873;
        this.field6869 = field6874;
        this.field6870 = field6875;
        this.field6871 = field6876;
        this.field6872 = field6877;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class6498.method19576(this.field6873), false);
        for (long field6869 = this.field6869; field6869 < this.field6870; ++field6869) {
            final long n = field6869 * Class6498.method19566(this.field6873);
            for (long n2 = 0L; n2 < Class6498.method19575(this.field6873); ++n2) {
                for (long n3 = 0L; n3 < Class6498.method19576(this.field6873); ++n3) {
                    class22.method169(n3, this.field6871.method135(n3 * Class6498.method19564(this.field6873) + n + n2));
                }
                Class6498.method19571(this.field6873).method34186(class22, this.field6872);
                for (long n4 = 0L; n4 < Class6498.method19576(this.field6873); ++n4) {
                    this.field6871.method169(n4 * Class6498.method19564(this.field6873) + n + n2, class22.method135(n4));
                }
            }
        }
    }
}
