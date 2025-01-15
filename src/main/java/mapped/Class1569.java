// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1569 implements Runnable
{
    private static String[] field8783;
    public final /* synthetic */ long field8784;
    public final /* synthetic */ long field8785;
    public final /* synthetic */ long field8786;
    public final /* synthetic */ long field8787;
    public final /* synthetic */ Class22 field8788;
    public final /* synthetic */ Class6362 field8789;
    
    public Class1569(final Class6362 field8789, final long field8790, final long field8791, final long field8792, final long field8793, final Class22 field8794) {
        this.field8789 = field8789;
        this.field8784 = field8790;
        this.field8785 = field8791;
        this.field8786 = field8792;
        this.field8787 = field8793;
        this.field8788 = field8794;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class6362.method19009(this.field8789), false);
        for (long field8784 = this.field8784; field8784 < this.field8785; ++field8784) {
            final long n = field8784 * this.field8786;
            for (long n2 = 0L; n2 < Class6362.method19008(this.field8789); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6362.method19009(this.field8789); ++n4) {
                    final long n5 = 2L * n4;
                    final long n6 = n4 * this.field8787 + n + n3;
                    class22.method169(n5, this.field8788.method135(n6));
                    class22.method169(n5 + 1L, this.field8788.method135(n6 + 1L));
                }
                Class6362.method19004(this.field8789).method25926(class22);
                for (long n7 = 0L; n7 < Class6362.method19009(this.field8789); ++n7) {
                    final long n8 = 2L * n7;
                    final long n9 = n7 * this.field8787 + n + n3;
                    this.field8788.method169(n9, class22.method135(n8));
                    this.field8788.method169(n9 + 1L, class22.method135(n8 + 1L));
                }
            }
        }
    }
}
